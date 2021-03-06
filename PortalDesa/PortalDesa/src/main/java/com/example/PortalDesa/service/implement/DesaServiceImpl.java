package com.example.PortalDesa.service.implement;

import com.example.PortalDesa.model.Desa;
import com.example.PortalDesa.model.Users;
import com.example.PortalDesa.model.constant.PathImageDb;
import com.example.PortalDesa.model.defaults.KecamatanDefaults;
import com.example.PortalDesa.payload.CreateResponse;
import com.example.PortalDesa.payload.request.DesaRequest;
import com.example.PortalDesa.repository.DesaRepo;
import com.example.PortalDesa.repository.UsersRepo;
import com.example.PortalDesa.service.DesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

/**
 * Created by Sogumontar Hendra Simangunsong on 15/04/2020.
 */
@Service
public class DesaServiceImpl implements DesaService {

    @Autowired
    DesaRepo desaRepo;
    @Autowired
    UsersRepo usersRepo;

    public String getSku(String rand){
        return rand;
    }
    @Override
    public ResponseEntity<?> addDesa(DesaRequest desaRequest) {
        Users users =usersRepo.findByUsername(desaRequest.getUsername());
        String skuAdmin=users.getSku();
        System.out.println(skuAdmin);
        String skuFix=getSku(UUID.randomUUID().toString());
        Desa desa = new Desa(
                skuFix,
                desaRequest.getNama(),
                KecamatanDefaults.valueOf(desaRequest.getKecamatan()),
                1,
                skuAdmin,
                desaRequest.getKecamatan(),
                skuFix+".png"
        );
        desaRepo.save(desa);
        return ResponseEntity.ok(desa);
    }

    @Override
    public void updateDesa(String sku,DesaRequest desaRequest) {
        System.out.println(sku);
        System.out.println(desaRequest.getNamaKepalaDesa());
        desaRepo.updateBySku(
                sku,
                desaRequest.getNama(),
                desaRequest.getNamaKepalaDesa(),
                KecamatanDefaults.valueOf(desaRequest.getKecamatan()),
                desaRequest.getJumlahPenduduk(),
                sku+".png"
        );
    }

    @Override
    public void addDesaPicture(String base64, String skuDesa) throws IOException {
        File currentDirFile = new File("");
        String helper = currentDirFile.getAbsolutePath();
        String currentDir = helper+"/src/main/resources/static/images/Desa";
        String pict =skuDesa+".png";
        String partSeparator = ",";
        String encodedImg ="";
        if (base64.contains(partSeparator)) {
            encodedImg = base64.split(partSeparator)[1];
        }
        File file =new File(currentDir+"/"+pict);
        try(FileOutputStream fos = new FileOutputStream(file)){
            byte[] dataBytes =  Base64.getMimeDecoder().decode(encodedImg);
            fos.write(dataBytes);
            System.out.println("Image file saved");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
