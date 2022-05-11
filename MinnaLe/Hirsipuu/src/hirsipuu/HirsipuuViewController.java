package hirsipuu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;

/**
 * Ensimmäisen vuoden koulutehtäviä - Hirsipuupeli JavaFX:llä
 *
 * @author Minna Lehtimäki
 */
public class HirsipuuViewController implements Initializable {

    @FXML
    private Pane taustaPane;

    private int haviot = 1;

    private int voitot = 0;

    @FXML
    private Label voitit;

    @FXML
    private Label havisit;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private Ellipse alusta;

    @FXML
    private Line puu1;

    @FXML
    private Line puu2;

    @FXML
    private Line puu3;

    @FXML
    private Circle paa;

    @FXML
    private Line vartalo;

    @FXML
    private Line kasi1;

    @FXML
    private Line kasi2;

    @FXML
    private Line jalka1;

    @FXML
    private Line jalka2;

    @FXML
    private Label k_kirjain;

    @FXML
    private Label a_kirjain;

    @FXML
    private Label m_kirjain;

    @FXML
    private Label p_kirjain;

    @FXML
    private Label i_kirjain;

    @FXML
    private Line viiva1;

    @FXML
    private Line viiva2;

    @FXML
    private Line viiva3;

    @FXML
    private Line viiva4;

    @FXML
    private Line viiva5;

    @FXML
    private void tausta_OnKeyTyped(KeyEvent event) {

        String kirjain = event.getCharacter();

        if (kirjain.equalsIgnoreCase("K")) {
            k_kirjain.setVisible(true);
            viiva1.setVisible(false);
            voitot++;
        } else if (kirjain.equalsIgnoreCase("A")) {
            a_kirjain.setVisible(true);
            viiva2.setVisible(false);
            voitot++;
        } else if (kirjain.equalsIgnoreCase("M")) {
            m_kirjain.setVisible(true);
            viiva3.setVisible(false);
            voitot++;
        } else if (kirjain.equalsIgnoreCase("P")) {
            p_kirjain.setVisible(true);
            viiva4.setVisible(false);
            voitot++;
        } else if (kirjain.equalsIgnoreCase("I")) {
            i_kirjain.setVisible(true);
            viiva5.setVisible(false);
            voitot++;
        } else {
            switch (haviot) {
                case 1:
                    alusta.setVisible(true);
                    haviot++;
                    break;
                case 2:
                    puu1.setVisible(true);
                    haviot++;
                    break;
                case 3:
                    puu2.setVisible(true);
                    haviot++;
                    break;
                case 4:
                    puu3.setVisible(true);
                    haviot++;
                    break;
                case 5:
                    paa.setVisible(true);
                    haviot++;
                    break;
                case 6:
                    vartalo.setVisible(true);
                    haviot++;
                    break;
                case 7:
                    kasi1.setVisible(true);
                    haviot++;
                    break;
                case 8:
                    kasi2.setVisible(true);
                    haviot++;
                    break;
                case 9:
                    jalka1.setVisible(true);
                    haviot++;
                    break;
                case 10:
                    jalka2.setVisible(true);
                    haviot++;
                    break;
            }
        }
        if (voitot == 5) {
            voitit.setVisible(true);
        }
        if (haviot == 11) {
            havisit.setVisible(true);
        }
    }

    @FXML
    void alusta_OnKeyTyped(KeyEvent event) {

    }

    @FXML
    void puu_OnKeyTyped(KeyEvent event) {

    }

    @FXML
    void puu2_OnKeyTyped(KeyEvent event) {

    }

    @FXML
    void puu3_OnKeyTyped(KeyEvent event) {

    }

    @FXML
    void paa_OnKeyTyped(KeyEvent event) {

    }

    @FXML
    void vartalo_OnKeyTyped(KeyEvent event) {

    }

    @FXML
    void jalka1_OnKeyTyped(KeyEvent event) {

    }

    @FXML
    void jalka2_OnKeyTyped(KeyEvent event) {

    }

    @FXML
    void kasi1_OnKeyTyped(KeyEvent event) {

    }

    @FXML
    void kasi2_OnKeyTyped(KeyEvent event) {

    }

    @FXML
    void k_OnKeyTyped(KeyEvent event) {

    }

    @FXML
    void a_OnKeyTyped(KeyEvent event) {

    }

    @FXML
    void m_OnKeyTyped(KeyEvent event) {

    }

    @FXML
    void p_OnKeyTyped(KeyEvent event) {

    }

    @FXML
    void i_OnKeyTyped(KeyEvent event) {

    }

    @FXML
    void viiva1_OnKeyPressed(KeyEvent event) {

    }

    @FXML
    void viiva2_OnKeyPressed(KeyEvent event) {

    }

    @FXML
    void viiva3_OnKeyPressed(KeyEvent event) {

    }

    @FXML
    void viiva4_OnKeyPressed(KeyEvent event) {

    }

    @FXML
    void viiva5_OnKeyPressed(KeyEvent event) {

    }

    @FXML
    private void havisit_OnKeyTyped(KeyEvent event) {
    }

    @FXML
    private void voitit_OnKeyTyped(KeyEvent event) {
    }

}
