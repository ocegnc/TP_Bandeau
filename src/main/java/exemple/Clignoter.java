package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Clignoter extends Effets {

    public Clignoter() {
    }
    public void executer(Bandeau bandeau) {
        bandeau.setFont(new Font("Dialog", Font.BOLD, 50));
        bandeau.setForeground(Color.orange);
        bandeau.setMessage("D'abord le clignotant ...");
        bandeau.sleep(100);
        bandeau.setMessage(" ");
        bandeau.sleep(100);
    }
}
