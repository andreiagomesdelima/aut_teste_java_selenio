package br.com.mercadolivre.steps;


import br.com.mercadolivre.pages.HomePage;
import br.com.mercadolivre.pages.ProdutoPage;
import org.junit.Assert;
import org.junit.Test;

public class ProdutoSteps extends BaseSteps {

    HomePage homePage = new HomePage();

    ProdutoPage produtoPage = new ProdutoPage();


    @Test
    public void pesquisarProduto(){
        homePage.validarTelaDeHome();
        homePage.setClicarBtnPesquisa();
        produtoPage.setEscolherProduto();
        Assert.assertEquals("Xiaomi redmi 9a dual sim 32 gb azul 3 gb ram",produtoPage.setVerificarNomeDoProduto());
        produtoPage.setVerificarNomeDoProduto();
        produtoPage.setBtnConferirOutrosProdutos();
        produtoPage.setBtnFreteGratis();
        produtoPage.setEscreverNoCampoPrecoMinimo();
        produtoPage.setEscreverNoCampoPrecoMaximo();
        produtoPage.setBtnSeguir();

    }

}

