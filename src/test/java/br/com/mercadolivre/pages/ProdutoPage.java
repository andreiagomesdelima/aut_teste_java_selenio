package br.com.mercadolivre.pages;

import org.openqa.selenium.By;

public class ProdutoPage extends BasePages {

    private static final By pesquisarProduto
            = By.cssSelector("[name=\"user_id\"]");

    private static final By escolherProduto
            = By.cssSelector("#root-app > div > div.ui-search-main.ui-search-main--only-products.ui-search-main" +
            "--with-topkeywords.shops__search-main > section > ol > li:nth-child(1)");

    private static final By verificarNomeDoProduto
            = By.cssSelector("#root-app > div > div.ui-search-main.ui-search-main--exhibitor.ui-search-main--only-" +
            "products.ui-search-main--with-topkeywords.shops__search-main > aside > div" +
            ".ui-search-breadcrumb.shops__breadcrumb > h1");

    private static final By btnConferirOutrosProdutos
            = By.cssSelector("#root-app > div > div:nth-child(2) > a > img");

    private static final By btnFreteGratis
            = By.cssSelector("[class=\"ui-search-filter-highlighted__switch-container shops__highlighted-switch\"]");

    private static final By escreverNoCampoPrecoMinimo
            = By.cssSelector("[data-testid=\"Minimum-price\"]");

    private static final By setEscreverNoCampoPrecoMaximo
            = By.cssSelector("[data-testid=\"Maximum-price\"]");

    private static final By btnSeguir
            = By.cssSelector("[data-testid=\"submit-price\"]");



    public void setEscolherProduto(){
        click(escolherProduto);
    }
    public String setVerificarNomeDoProduto(){
       return lerText(verificarNomeDoProduto);
    }

    public void setBtnConferirOutrosProdutos(){
        click(btnConferirOutrosProdutos);
    }
    public void setBtnFreteGratis(){
        click(btnFreteGratis);
    }
    public void setEscreverNoCampoPrecoMinimo(){
        sendKeys(escreverNoCampoPrecoMinimo, "750");
    }
    public void setEscreverNoCampoPrecoMaximo(){
        sendKeys(setEscreverNoCampoPrecoMaximo,"850");
    }
    public void setBtnSeguir(){
        click(btnSeguir);
    }



}
