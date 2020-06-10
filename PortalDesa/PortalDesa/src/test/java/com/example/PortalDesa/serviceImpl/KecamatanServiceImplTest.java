package com.example.PortalDesa.serviceImpl;

import com.example.PortalDesa.model.Kecamatan;
import com.example.PortalDesa.repository.KecamatanRepo;
import com.example.PortalDesa.service.implement.KecamatanServiceImpl;
import org.checkerframework.checker.units.qual.K;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sogumontar Hendra Simangunsong on 12/05/2020.
 */
public class KecamatanServiceImplTest {
    @Rule
    public MockitoRule rule= MockitoJUnit.rule();
    @Mock
    KecamatanRepo kecamatanRepo;
    @InjectMocks
    KecamatanServiceImpl kecamatanService;

    @Test
    public void findAllTest(){
        List kecamatan= new ArrayList();
        Mockito.when(kecamatanRepo.findAll()).thenReturn(kecamatan);
        assertEquals(kecamatan, kecamatanService.findAll());
        Mockito.verify(kecamatanRepo).findAll();
    }

    @Test
    public void findAllWithDesaTest(){
        List kecamatan= new ArrayList();
        Mockito.when(kecamatanRepo.findAllWithDesa()).thenReturn(kecamatan);
        assertEquals(kecamatan, kecamatanService.findAllWithDesa());
        Mockito.verify(kecamatanRepo).findAllWithDesa();
    }

    @Test
    public void findFirstByNamaTest(){
        Kecamatan kecamatan=  new Kecamatan();
        Mockito.when(kecamatanRepo.findFirstByNama("hendra")).thenReturn(kecamatan);
        assertEquals(kecamatan, kecamatanService.findFirstByNama("hendra"));
        Mockito.verify(kecamatanRepo).findFirstByNama("hendra");
    }
}
