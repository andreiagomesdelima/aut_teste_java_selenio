package br.com.mercadolivre.steps;

import br.com.mercadolivre.util.Browser;
import org.junit.Before;
public class BaseSteps extends Browser {

    @Before
    public void iniciarBrowser(){
        browserUp("https://www.mercadolivre.com.br");
    }

//    @After
    public void finalizarBrowser(){
        browserDown();
    }

}