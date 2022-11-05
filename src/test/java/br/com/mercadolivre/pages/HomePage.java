package br.com.mercadolivre.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePages {
    private static final By btnCookies
            = By.cssSelector("body > div:nth-child(6) > div.cookie-consent-banner-opt-out > div.cookie-consent-banner" +
            "-opt-out__actions > button.cookie-consent-banner-opt-out__action.cookie-consent-banner-opt" +
            "-out__action--primary.cookie-consent-banner-opt-out__action--key-accept"
    );
    private static final By preencherCampoDePesquisa
            = By.cssSelector("[name=\"as_word\"]");

    private static final By clicarBtnPesquisa
            = By.cssSelector("[type=\"submit\"]");


    public void setBtnCookies(){
        click(btnCookies);
    }
    public void setPreencherCampoDePesquisa(){
        sendKeys(preencherCampoDePesquisa, "Xiaomi Redmi 9A Dual SIM 32 GB azul 3 GB RAM");

    }
    public void setClicarBtnPesquisa(){
        click(clicarBtnPesquisa);
    }

    public void validarTelaDeHome(){
        setBtnCookies();
        setPreencherCampoDePesquisa();
        setClicarBtnPesquisa();

    }

}
