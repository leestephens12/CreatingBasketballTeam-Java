package utilities;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneChanger {

    //Creates a default scene skeleton so that we can just pass through two variables to change the scene rather than duplicating the code
   public static void changeScenes(ActionEvent event, String fxmlLocation, String fxmltitle) throws IOException {
        Parent root = FXMLLoader.load(SceneChanger.class.getResource(fxmlLocation));
        Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        primaryStage.setTitle(fxmltitle);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
