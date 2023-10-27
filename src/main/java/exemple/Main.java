package exemple;

import bandeau.Bandeau;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Main().myExemple();
    }

    public void myExemple(){
        Bandeau monBandeau = new Bandeau();
        monBandeau.setMessage("Hello");
        monBandeau.sleep(1000);
        monBandeau.setMessage("Scénario de Océane");
        monBandeau.sleep(1000);

        Scenario scenariOceane = new Scenario();
        scenariOceane.ajouterEffet(new Clignoter(), 5);
        scenariOceane.ajouterEffet(new Zoom(50), 0);
        scenariOceane.ajouterEffet(new Rotation("Ca tourne !!!"), 0);
        scenariOceane.demarrer(monBandeau);
        monBandeau.sleep(1000);
        monBandeau.setFont(new Font("SansSerif", Font.PLAIN, 15));
        monBandeau.setMessage("Terminé");
        monBandeau.sleep(3000);
        monBandeau.close();
    }
}