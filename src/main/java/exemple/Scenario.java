package exemple;

import bandeau.Bandeau;

import java.util.ArrayList;

public class Scenario {

    private ArrayList<Effets> lesEffets;

    public Scenario() {
        this.lesEffets = new ArrayList<Effets>();
    }

    public void demarrer(Bandeau bandeau){
        for(Effets effet : lesEffets){
            effet.executer(bandeau);
        }
        bandeau.close();
    }

    public void ajouterEffet(Effets effet, int rep){
        for(int i=0; i<=rep; i++){
            lesEffets.add(effet);
        }
    }
}
