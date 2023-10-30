package devarea;

import devarea.client.Client;

import java.io.IOException;

/**
 * Lancez ce programme !
 */
public class Tutoriel {


    public static void main(String[] args) throws IOException {
        /*Penses à mettre la clef challenge, tu l'obtiendras en utilisant la commande /challenges sur le serveur discord de Dev'Area.*/
        Client client = new Client(" /challenges sur Dev'Area pour obtenir ta clef");

        client.loadChallenge("tutoriel");
        client.start();

        /*client.submit();*/
    }

}
