package VIEW;

import VIEW.Splash;

public class Main {
    public static void main(String[] args) {
        new Splash();
        //carregar janela de login principal
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);

    }

}
