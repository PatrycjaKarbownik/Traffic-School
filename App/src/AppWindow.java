import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppWindow {

    AppWindow(Stage primaryStage){
       primaryStage.setTitle("Traffic School \"Brum, Brum\"");

       Group panel = createGroup();
       Scene scene = new Scene(panel, 800, 600);

       primaryStage.setResizable(false);
       primaryStage.show();
    }

    private Group createGroup() {
        Group group = new Group();




        return group;
    }
}
