package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Zoom extends Effets{
    private int taille;

    public Zoom(int taille) {
        this.taille = taille;
    }

    public void executer(Bandeau bandeau){
        bandeau.setMessage("On va zoomer");
        bandeau.sleep(1000);
        bandeau.setMessage("ZOOOOOM");
        for(int i=5; i<taille; i+=5){
            bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            bandeau.sleep(100);
        }
        bandeau.sleep(100);
    }
}
