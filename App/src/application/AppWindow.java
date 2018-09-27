package application;

import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class AppWindow {

    private static Label schoolName = new Label("Traffic School \"Brum, Brum\"");
    private static Image logoImage = new Image("/data/logo.png");
    private static ImageView logo = new ImageView();
    private static Label surname = new Label("Surname:");
    private static Label name = new Label("Name:");
    private static Label pesel = new Label("PESEL:");
    private static Label tableHead = new Label("Surname_Name_PESEL_City_Street_BuildingNo_FlatNo");

    private static Label birthday = new Label("Birthday:");
    private static Label city = new Label("City:");
    private static Label street = new Label("Street:");
    private static Label buildingNo = new Label("Building no:");
    private static Label flatNo = new Label("Flat no:");
    private static Label startingDate = new Label("Starting date:");
    private static Label theory = new Label("Theory:");
    private static Label internalExam = new Label("Internal exam");

    private static String titleFontStyle = "-fx-font-size: 32; -fx-font-weight: bold; -fx-border-color: white;";
    private static String fontStyle = "-fx-font-size: 13; -fx-font-weight: bold; -fx-border-color: white;";
    private static String buttonStyle = "-fx-font-size: 12; -fx-background-color: grey; -fx-text-fill: black;";
    private static Paint textColor = Color.LIGHTGRAY;
    public static final int sizeOfSquare = 30;

    AppWindow(Stage primaryStage) {
        primaryStage.setTitle("Traffic School \"Brum, Brum\"");
        primaryStage.getIcons().add(new Image(AppWindow.class.getResource("/data/logo.png").toExternalForm()));

        Group panel = createBasicGroup();

        Scene scene = new Scene(panel, 37 * sizeOfSquare, 16 * sizeOfSquare, Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private Group createBasicGroup() {
        Group group = new Group();

        schoolName.setStyle(titleFontStyle);
        schoolName.setPrefSize(/*29*/ 33 * sizeOfSquare, 2 * sizeOfSquare);
        schoolName.relocate(2 * sizeOfSquare, 1 * sizeOfSquare);
        schoolName.setAlignment(Pos.CENTER);
        schoolName.setTextFill(textColor);

        logo.setImage(logoImage);
        logo.setFitHeight(2.5 * sizeOfSquare);
        logo.setFitWidth(2.5 * sizeOfSquare);
        logo.relocate(31 * sizeOfSquare, 0.5 * sizeOfSquare);

        surname.setStyle(fontStyle);
        surname.setPrefSize(4 * sizeOfSquare, 1 * sizeOfSquare);
        surname.relocate(3 * sizeOfSquare, 5 * sizeOfSquare);
        surname.setTextFill(textColor);

        name.setStyle(fontStyle);
        name.setPrefSize(4 * sizeOfSquare, 1 * sizeOfSquare);
        name.relocate(15 * sizeOfSquare, 5 * sizeOfSquare);
        name.setTextFill(textColor);

        pesel.setStyle(fontStyle);
        pesel.setPrefSize(4 * sizeOfSquare, 1 * sizeOfSquare);
        pesel.relocate(26 * sizeOfSquare, 5 * sizeOfSquare);
        pesel.setTextFill(textColor);




        // ComboBox //do starting date ale to inny modul


        group.getChildren().add(schoolName);
        group.getChildren().add(logo);
        group.getChildren().add(surname);
        group.getChildren().add(name);
        group.getChildren().add(pesel);
        return group;
    }
}
