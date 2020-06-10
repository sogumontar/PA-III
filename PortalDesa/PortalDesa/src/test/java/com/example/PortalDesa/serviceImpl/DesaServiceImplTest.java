package com.example.PortalDesa.serviceImpl;

import com.example.PortalDesa.model.Desa;
import com.example.PortalDesa.model.Users;
import com.example.PortalDesa.model.defaults.KecamatanDefaults;
import com.example.PortalDesa.payload.request.DesaRequest;
import com.example.PortalDesa.repository.DesaRepo;
import com.example.PortalDesa.repository.UsersRepo;
import com.example.PortalDesa.service.implement.DesaServiceImpl;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

import static java.lang.Boolean.TRUE;
import static org.junit.Assert.assertEquals;

/**
 * Created by Sogumontar Hendra Simangunsong on 10/06/2020.
 */
public class DesaServiceImplTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    DesaRepo desaRepo;

    @Mock
    UsersRepo usersRepo;

    @InjectMocks
    DesaServiceImpl desaService;

    @Test
    public void getSkuTest() {
        assertEquals("Random", desaService.getSku("Random"));
    }

    @Test
    public void addDesaTest() {
        Users users = new Users(
                "sku",
                "name",
                "alamat",
                "username",
                "email",
                "password",
                1
        );
        DesaRequest desaRequest = new DesaRequest(
                "Hendra",
                "Silaen",
                "hendra",
                "hendra@gmail.com",
                "hendra",
                "hendra"
        );
        Mockito.when(usersRepo.findByUsername(desaRequest.getUsername())).thenReturn(users);
        Users users1 = usersRepo.findByUsername(desaRequest.getUsername());
        String skuAdmin=users1.getSku();
        String skuFix=desaService.getSku(UUID.randomUUID().toString());
        Desa desa = new Desa(
                skuFix,
                desaRequest.getNama(),
                KecamatanDefaults.valueOf(desaRequest.getKecamatan()),
                1,
                skuAdmin,
                desaRequest.getKecamatan(),
                "PICT"
        );

//        assertEquals(desaService.addDesa(desaRequest), desaService.addDesa(desaRequest));
//        Mockito.verify(desaRepo).save(desa);
    }
}