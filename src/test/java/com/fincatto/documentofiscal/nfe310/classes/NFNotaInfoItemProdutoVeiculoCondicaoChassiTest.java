package com.fincatto.documentofiscal.nfe310.classes;

import org.junit.Assert;
import org.junit.Test;

import com.fincatto.documentofiscal.nfe310.classes.NFNotaInfoItemProdutoVeiculoCondicaoChassi;

public class NFNotaInfoItemProdutoVeiculoCondicaoChassiTest {

    @Test
    public void deveObterVeiculoCondicaoChassiApartirDoSeuCodigo() {
        Assert.assertEquals(NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL, NFNotaInfoItemProdutoVeiculoCondicaoChassi.valueOfCodigo("N"));
        Assert.assertEquals(NFNotaInfoItemProdutoVeiculoCondicaoChassi.REMARCADO, NFNotaInfoItemProdutoVeiculoCondicaoChassi.valueOfCodigo("R"));
        Assert.assertNull(NFNotaInfoItemProdutoVeiculoCondicaoChassi.valueOfCodigo("S"));
    }

    @Test
    public void deveRepresentarOCodigoCorretamente() {
        Assert.assertEquals("N", NFNotaInfoItemProdutoVeiculoCondicaoChassi.NORMAL.getCodigo());
        Assert.assertEquals("R", NFNotaInfoItemProdutoVeiculoCondicaoChassi.REMARCADO.getCodigo());
    }
}