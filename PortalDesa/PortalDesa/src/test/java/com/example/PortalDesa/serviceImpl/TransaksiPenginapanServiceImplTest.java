package com.example.PortalDesa.serviceImpl;

import com.example.PortalDesa.model.ProdukDesa;
import com.example.PortalDesa.model.TransaksiPenginapan;
import com.example.PortalDesa.repository.ProdukDesaRepo;
import com.example.PortalDesa.repository.SequenceProdukRepo;
import com.example.PortalDesa.repository.TransaksiPenginapanRepo;
import com.example.PortalDesa.service.TransaksiPenginapanService;
import com.example.PortalDesa.service.implement.ProdukDesaServiceImpl;
import com.example.PortalDesa.service.implement.TransaksiPenginapanServiceImpl;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sogumontar Hendra Simangunsong on 09/06/2020.
 */
public class TransaksiPenginapanServiceImplTest {
    @Rule
    public MockitoRule rule= MockitoJUnit.rule();
    @Mock
    ProdukDesa produkDesa;
    @Mock
    ProdukDesaRepo produkDesaRepo;
    @Mock
    SequenceProdukRepo sequenceProdukRepo;
    @Mock
    TransaksiPenginapanRepo transaksiPenginapanRepo;
    @InjectMocks
    TransaksiPenginapanServiceImpl transaksiPenginapanService;


    @Test
    public void findByIdTest(){
        TransaksiPenginapan transaksiPenginapan= new TransaksiPenginapan();
        Mockito.when(transaksiPenginapanRepo.findFirstById("SKU")).thenReturn(transaksiPenginapan);
        assertEquals(transaksiPenginapan,transaksiPenginapanService.findById("SKU"));
        Mockito.verify(transaksiPenginapanRepo).findFirstById("SKU");
    }
}
