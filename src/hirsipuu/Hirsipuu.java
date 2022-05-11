
package hirsipuu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Hirsipuu extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("HirsipuuView.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Hirsipuupeli -arvaa kirjaimet-");
        stage.show();
        root.requestFocus();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
