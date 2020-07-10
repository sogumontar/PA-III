package com.example.PortalDesa.serviceImpl;

import com.example.PortalDesa.model.Artikel;
import com.example.PortalDesa.payload.request.ArtikelRequest;
import com.example.PortalDesa.repository.ArtikelRepo;
import com.example.PortalDesa.service.ArtikelService;
import com.example.PortalDesa.service.implement.ArtikelServiceImpl;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static java.lang.Boolean.TRUE;
import static org.junit.Assert.assertEquals;

/**
 * Created by Sogumontar Hendra Simangunsong on 09/06/2020.
 */
public class ArtikelServiceImplTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    public Artikel artikel = new Artikel(

            "89a8s7d89h1jk2dasjdnm",
            "Artikel judul",
            "25-05-2020",
            "Artikel",
            "Ini isi Artikelnya",
            "hendra.com",
            "sogumontar hendra",
            "HEND-0001",
            1
    );

    @Mock
    ArtikelRepo artikelRepo;

    @InjectMocks
    ArtikelServiceImpl artikelService;


    //Membaca Artikel, pengumuman, berita
    @Test
    public void findAllArtikelForWebTest() {
        List artikel1 = new ArrayList();
        Mockito.when(artikelRepo.findAllForWeb()).thenReturn(artikel1);
        assertEquals(artikel1, artikelService.findAllArtikelForWeb());
        Mockito.verify(artikelRepo).findAllForWeb();
    }

    //Membaca Artikel, pengumuman, berita
    @Test
    public void findAllArtikelBySkuForWebTest() {
        List artikel1 = new ArrayList();
        Mockito.when(artikelRepo.findAllBySkuAdminForWeb("HEND-0001")).thenReturn(artikel1);
        assertEquals(artikel1, artikelService.findAllArtikelBySkuForWeb("HEND-0001"));
        Mockito.verify(artikelRepo).findAllBySkuAdminForWeb("HEND-0001");
    }


    //Membaca Artikel, pengumuman, berita
    @Test
    public void findDetailArtikelByIdForWebTest() {
        Mockito.when(artikelRepo.findFirstByIdForWeb("123123-asdasd")).thenReturn(artikel);
        assertEquals(artikel, artikelService.findDetailArtikelByIdForWeb("123123-asdasd"));
        Mockito.verify(artikelRepo).findFirstByIdForWeb("123123-asdasd");
    }

    //Membaca Artikel, pengumuman, berita
    @Test
    public void findAllArtikelTest() {
        List artikel1 = new ArrayList();
        Mockito.when(artikelRepo.findAll()).thenReturn(artikel1);
        assertEquals(artikel1, artikelService.findAllArtikel());
        Mockito.verify(artikelRepo).findAll();
    }

    //Membaca Artikel, pengumuman, berita
    @Test
    public void findAllArtikelBySkuTest() {
        List artikel1 = new ArrayList();
        Mockito.when(artikelRepo.findAllBySkuAdmin("HEND-0001")).thenReturn(artikel1);
        assertEquals(artikel1, artikelService.findAllArtikelBySku("HEND-0001"));
        Mockito.verify(artikelRepo).findAllBySkuAdmin("HEND-0001");
    }

    //Membaca Artikel, pengumuman, berita
    @Test
    public void findDetailArtikelByIdTest() {
        Mockito.when(artikelRepo.findFirstById("123123-asdasd")).thenReturn(artikel);
        assertEquals(artikel, artikelService.findDetailArtikelById("123123-asdasd"));
        Mockito.verify(artikelRepo).findFirstById("123123-asdasd");
    }

    //Mengelola Artikel, pengumuman, berita
    @Test
    public void saveTest() {
        ArtikelRequest artikelRequest = new ArtikelRequest(
                "judul",
                "jenis",
                "isi",
                "sumber",
                "penulis"
        );
        Artikel artikel2 = new Artikel(
                UUID.randomUUID().toString(),
                artikelRequest.getJudul(),
                "dtf.format(now).toString()",
                artikelRequest.getJenis(),
                artikelRequest.getIsi(),
                artikelRequest.getSumber(),
                artikelRequest.getPenulis(),
                "HEND-0001",
                1
        );
        Mockito.when(artikelService.save("HEND-0001", artikelRequest)).thenReturn(artikel2);
        Mockito.when(artikelRepo.save(artikel)).thenReturn(artikel2);
        assertEquals(null, artikelService.save("HEND-0001", artikelRequest));
//        Mockito.verify(artikelRepo).save(artikel);
    }

    //Mengelola Artikel, pengumuman, berita
    @Test
    public void updateTest() {
        String expectedResponse = "Update Sukses";
        ArtikelRequest artikelRequest = new ArtikelRequest(
                "judul",
                "jenis",
                "isi",
                "sumber",
                "penulis"
        );
//        Mockito.when(artikelService.update("123456",artikelRequest)).thenReturn("artikel");
        assertEquals(expectedResponse, artikelService.update("123456", artikelRequest));
        Mockito.verify(artikelRepo).updateArtikel("123456",
                artikelRequest.getIsi(),
                artikelRequest.getJudul(),
                artikelRequest.getPenulis(),
                artikelRequest.getSumber());
    }

//    @Test
//    public void deleteTest(){
//        Mockito.when(artikelService.delete("123123-asdasd")).thenReturn(TRUE);
////        Mockito.when(artikelRepo.deleteById("123123-asdasd")).thenReturn(TRUE)
//        assertEquals(TRUE,artikelService.delete("123123-asdasd"));
//        Mockito.verify(artikelRepo).deleteById("123123-asdasd");
//    }


}
