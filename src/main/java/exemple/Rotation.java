package exemple;

import bandeau.Bandeau;
import java.awt.*;

public class Rotation extends Effets{
    private String message;

    public Rotation(String message) {
        this.message = message;
    }

    public void executer(Bandeau bandeau) {
        bandeau.setMessage(message);
        for (int i = 5; i < 20; i ++) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, 5+2*i));
            bandeau.setForeground(Color.white);
            bandeau.setBackground(Color.orange);
            bandeau.setRotation(i*Math.PI / 2.0f);
            bandeau.sleep(100);
            bandeau.setRotation((i+1)*Math.PI / 2.0f);
            bandeau.setRotation(0.0f);
            bandeau.sleep(100);
        }
    }
}
