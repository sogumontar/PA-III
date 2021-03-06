package com.example.PortalDesa.service.implement;

import com.example.PortalDesa.model.ProdukDesa;
import com.example.PortalDesa.model.TransaksiProduk;
import com.example.PortalDesa.repository.KeranjangRepo;
import com.example.PortalDesa.repository.ProdukDesaRepo;
import com.example.PortalDesa.repository.TransaksiProdukRepo;
import com.example.PortalDesa.service.TransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

/**
 * Created by Sogumontar Hendra Simangunsong on 05/05/2020.
 */
@Service
public class TransaksiServiceImpl implements TransaksiService {

    @Autowired
    TransaksiProdukRepo transaksiProdukRepo;

    @Autowired
    ProdukDesaRepo produkDesaRepo;

    @Autowired
    KeranjangRepo keranjangRepo;

    @Override
    public void save(TransaksiProduk transaksiProduk, Integer status) {
        TransaksiProduk transaksiProduk1 = new TransaksiProduk(
                transaksiProduk.getSkuProduk(),
                transaksiProduk.getSkuCustomer(),
                transaksiProduk.getAlamat(),
                transaksiProduk.getHarga(),
                transaksiProduk.getMetode(),
                status
        );
        transaksiProdukRepo.save(transaksiProduk1);
    }


    @Override
    public void update(String idpesanan,String idCustomer, String base64) {
        Integer val = transaksiProdukRepo.counter(idCustomer);
        val++;
        File currentDirFile = new File("");
        String helper = currentDirFile.getAbsolutePath();
        String currentDir = helper+"/src/main/resources/static/images/Resi/";
        String pict =idCustomer+"-"+ idpesanan+ "-" +val.toString()+".png";
        String partSeparator = ",";
        String encodedImg ="";
        if (base64.contains(partSeparator)) {
            encodedImg = base64.split(partSeparator)[1];
        }
        File file =new File(currentDir+"/"+pict);
        try(FileOutputStream fos = new FileOutputStream(file)){
//            byte[] decoder = Base64.getDecoder().decode(encodedImg);
            byte[] dataBytes =  Base64.getMimeDecoder().decode(encodedImg);
            fos.write(dataBytes);
            System.out.println("Image file saved");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        transaksiProdukRepo.update(idpesanan,pict);
    }




    @Override
    public void updateCart(String skuUser) {
        keranjangRepo.updateKeranjang(skuUser);
    }

    @Override
    public void terimaPesanan(String idPesanan) {
        TransaksiProduk transaksiProduk1 =transaksiProdukRepo.findFirstById(idPesanan);
        String str[]= transaksiProduk1.getSkuProduk().split(",");
        List<String> data= new ArrayList<String>();
        data= Arrays.asList(str);
        for(String dat : data) {
            System.out.println(dat);
            ProdukDesa produkDesa = produkDesaRepo.findFirstBySku(dat);
            Integer nilai = 0;
            if (produkDesa.getJumlahPembelian() == null) {
                nilai = 0;
            } else {
                nilai = produkDesa.getJumlahPembelian();
            }
            produkDesaRepo.updateCounterBySku(dat, nilai + 1);
        }
        transaksiProdukRepo.actionPesanan(idPesanan,4);
    }

    @Override
    public void tolakPesanan(String idPesanan) {
        transaksiProdukRepo.actionPesanan(idPesanan,5);
    }

    @Override
    public TransaksiProduk findById(String idPesanan) {
        return transaksiProdukRepo.findFirstById(idPesanan);
    }
}
