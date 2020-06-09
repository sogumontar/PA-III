package com.example.PortalDesa.serviceImpl;

import com.example.PortalDesa.model.Keranjang;
import com.example.PortalDesa.model.ProdukDesa;
import com.example.PortalDesa.repository.KeranjangRepo;
import com.example.PortalDesa.repository.ProdukDesaRepo;
import com.example.PortalDesa.repository.SequenceProdukRepo;
import com.example.PortalDesa.repository.TransaksiPenginapanRepo;
import com.example.PortalDesa.service.implement.KeranjangServiceImpl;
import com.example.PortalDesa.service.implement.TransaksiPenginapanServiceImpl;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sogumontar Hendra Simangunsong on 09/06/2020.
 */
public class KeranjangServiceImplTest {
    @Rule
    public MockitoRule rule= MockitoJUnit.rule();
    @Mock
    Keranjang keranjang;
    @Mock
    KeranjangRepo keranjangRepo;
    @InjectMocks
    KeranjangServiceImpl keranjangService;

    @Test
    public void findAllTest(){
        List  keranjang= new ArrayList();
        Mockito.when(keranjangRepo.findAll()).thenReturn(keranjang);
        assertEquals(keranjang,keranjangService.findAll());
        Mockito.verify(keranjangRepo).findAll();
    }

    @Test
    public void findAllBySkuCustomerTest(){
        List  keranjang= new ArrayList();
        Mockito.when(keranjangRepo.findAllBySkuCustomer("SKU_CUSTOMER")).thenReturn(keranjang);
        assertEquals(keranjang,keranjangService.findAllBySkuCustomer("SKU_CUSTOMER"));
        Mockito.verify(keranjangRepo).findAllBySkuCustomer("SKU_CUSTOMER");
    }

    @Test
    public void findAllByMerchantTest(){
        List  keranjang= new ArrayList();
        Mockito.when(keranjangRepo.findAllByMerchant("SKU_MERCHANT")).thenReturn(keranjang);
        assertEquals(keranjang,keranjangService.findAllByMerchant("SKU_MERCHANT"));
        Mockito.verify(keranjangRepo).findAllByMerchant("SKU_MERCHANT");
    }

    @Test
    public void checkTest(){
        Mockito.when(keranjangRepo.check("123","SKU_MERCHANT")).thenReturn((int) 1L);
        assertEquals(java.util.Optional.of(1), java.util.Optional.ofNullable(keranjangService.check("123", "SKU_MERCHANT")));
        Mockito.verify(keranjangRepo).check("123","SKU_MERCHANT");
    }

    @Test
    public void updateTest(){
        Mockito.when(keranjangRepo.update("123",2)).thenReturn((int) 1L);
        assertEquals(java.util.Optional.of(1), java.util.Optional.ofNullable(keranjangService.update("123", 2)));
        Mockito.verify(keranjangRepo).update("123",2);
    }
}
