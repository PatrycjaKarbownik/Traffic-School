package application;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class AppWindow {

    private static Label schoolNameLabel = new Label("Traffic School \"Brum, Brum\"");
    private static Image logoImage = new Image("/data/logo.png");
    private static ImageView logo = new ImageView();
    private static Label surnameLabel = new Label("Surname:");
    private static TextField surnameText = new TextField();
    private static Label nameLabel = new Label("Name:");
    private static TextField nameText = new TextField();
    private static Label peselLabel = new Label("PESEL:");
    private static TextField peselText = new TextField();
    private static Label tableHeadLabel = new Label("Surname_Name_PESEL_City_Street_BuildingNo_FlatNo");

    private static Button searchButton = new Button("Search");
    private static Button addButton = new Button("Add");

    private static Label birthdayLabel = new Label("Birthday:");
    private static ComboBox yearCombo;
    private static ComboBox monthCombo;
    private static ComboBox dayCombo;
    private static Label cityLabel = new Label("City:");
    private static ComboBox cityCombo;
    private static Label streetLabel = new Label("Street:");
    private static ComboBox streetCombo;
    private static Label buildingNoLabel = new Label("Building no:");
    private static TextField buildingNoText = new TextField();
    private static Label flatNoLabel = new Label("Flat no:");
    private static TextField flatNoText = new TextField();
    private static Label startingDateLabel = new Label("Starting date:");
    private static ComboBox startingDateCombo;
    private static Label theoryLabel = new Label("Theory:");
    private static Label internalExamLabel = new Label("Internal exam:");

    private static Paint textColor = Color.LIGHTGRAY;
    public static final int sizeOfSquare = 30;

    AppWindow(Stage primaryStage) {
        primaryStage.setTitle("Traffic School \"Brum, Brum\"");
        primaryStage.getIcons().add(new Image(AppWindow.class.getResource("/data/logo.png").toExternalForm()));

        //   Group panel = createBasicGroup();

        Group panel = createAddGroup();

        Scene scene = new Scene(panel, 38 * sizeOfSquare, 16 * sizeOfSquare, Color.BLACK);
        scene.getStylesheets().add("/data/stylesheet.css");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private Group createBasicGroup() {
        Group group = new Group();

        schoolNameLabel.getStyleClass().add("title");
        schoolNameLabel.setPrefSize(/*29*/ 34 * sizeOfSquare, 2 * sizeOfSquare);
        schoolNameLabel.relocate(2 * sizeOfSquare, 1 * sizeOfSquare);

        logo.setImage(logoImage);
        logo.setFitHeight(4 * sizeOfSquare);
        logo.setFitWidth(4 * sizeOfSquare);
        logo.relocate(32 * sizeOfSquare, 0 * sizeOfSquare);

        surnameLabel.getStyleClass().add("label_1");
        surnameLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        surnameLabel.relocate(2 * sizeOfSquare, 5 * sizeOfSquare);
        surnameText.getStyleClass().add("textField");
        surnameText.setPrefSize(6 * sizeOfSquare, 1 * sizeOfSquare);
        surnameText.relocate(6 * sizeOfSquare, 5 * sizeOfSquare);

        nameLabel.getStyleClass().add("label_1");
        nameLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        nameLabel.relocate(14 * sizeOfSquare, 5 * sizeOfSquare);
        nameText.getStyleClass().add("textField");
        nameText.setPrefSize(6 * sizeOfSquare, 1 * sizeOfSquare);
        nameText.relocate(18 * sizeOfSquare, 5 * sizeOfSquare);

        peselLabel.getStyleClass().add("label_1");
        peselLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        peselLabel.relocate(26 * sizeOfSquare, 5 * sizeOfSquare);
        peselText.getStyleClass().add("textField");
        peselText.setPrefSize(6 * sizeOfSquare, 1 * sizeOfSquare);
        peselText.relocate(30 * sizeOfSquare, 5 * sizeOfSquare);

        searchButton.setPrefSize(4 * sizeOfSquare, 1 * sizeOfSquare);
        searchButton.relocate(32 * sizeOfSquare, 7 * sizeOfSquare);

        addButton.setPrefSize(4 * sizeOfSquare, 1 * sizeOfSquare);
        addButton.relocate(32 * sizeOfSquare, 14 * sizeOfSquare);


        group.getChildren().add(schoolNameLabel);
        group.getChildren().add(logo);
        group.getChildren().add(surnameLabel);
        group.getChildren().add(surnameText);
        group.getChildren().add(nameLabel);
        group.getChildren().add(nameText);
        group.getChildren().add(peselLabel);
        group.getChildren().add(peselText);
        group.getChildren().add(searchButton);
        group.getChildren().add(addButton);
        return group;
    }

    private Group createAddGroup() {
        Group group = new Group();

        schoolNameLabel.getStyleClass().add("title");
        schoolNameLabel.setPrefSize(/*29*/ 34 * sizeOfSquare, 2 * sizeOfSquare);
        schoolNameLabel.relocate(2 * sizeOfSquare, 1 * sizeOfSquare);

        logo.setImage(logoImage);
        logo.setFitHeight(4 * sizeOfSquare);
        logo.setFitWidth(4 * sizeOfSquare);
        logo.relocate(32 * sizeOfSquare, 0 * sizeOfSquare);

        surnameLabel.getStyleClass().add("label_1");
        surnameLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        surnameLabel.relocate(2 * sizeOfSquare, 5 * sizeOfSquare);
        surnameText.getStyleClass().add("textField");
        surnameText.setPrefSize(6 * sizeOfSquare, 1 * sizeOfSquare);
        surnameText.relocate(6 * sizeOfSquare, 5 * sizeOfSquare);

        nameLabel.getStyleClass().add("label_1");
        nameLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        nameLabel.relocate(2 * sizeOfSquare, 7 * sizeOfSquare);
        nameText.getStyleClass().add("textField");
        nameText.setPrefSize(6 * sizeOfSquare, 1 * sizeOfSquare);
        nameText.relocate(6 * sizeOfSquare, 7 * sizeOfSquare);

        birthdayLabel.getStyleClass().add("label_1");
        birthdayLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        birthdayLabel.relocate(2 * sizeOfSquare, 9 * sizeOfSquare);
        yearCombo = createBirthdayComboBox("year");
        yearCombo.relocate(5.25*sizeOfSquare, 9*sizeOfSquare);
        monthCombo = createBirthdayComboBox("month");
        monthCombo.relocate(7.75*sizeOfSquare, 9*sizeOfSquare);
        dayCombo = createBirthdayComboBox("day");
        dayCombo.relocate(10.25*sizeOfSquare, 9*sizeOfSquare);

        peselLabel.getStyleClass().add("label_1");
        peselLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        peselLabel.relocate(2 * sizeOfSquare, 11 * sizeOfSquare);
        peselText.getStyleClass().add("textField");
        peselText.setPrefSize(6 * sizeOfSquare, 1 * sizeOfSquare);
        peselText.relocate(6 * sizeOfSquare, 11 * sizeOfSquare);


        cityLabel.getStyleClass().add("label_1");
        cityLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        cityLabel.relocate(14 * sizeOfSquare, 5 * sizeOfSquare);
        cityCombo = createComboBox(true, "city");
        cityCombo.relocate(18 * sizeOfSquare, 5 * sizeOfSquare);

        streetLabel.getStyleClass().add("label_1");
        streetLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        streetLabel.relocate(14 * sizeOfSquare, 7 * sizeOfSquare);
        streetCombo = createComboBox(true, "street");
        streetCombo.relocate(18 * sizeOfSquare, 7 * sizeOfSquare);

        buildingNoLabel.getStyleClass().add("label_1");
        buildingNoLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        buildingNoLabel.relocate(14 * sizeOfSquare, 9 * sizeOfSquare);
        buildingNoText.getStyleClass().add("textField");
        buildingNoText.setPrefSize(6 * sizeOfSquare, 1 * sizeOfSquare);
        buildingNoText.relocate(18 * sizeOfSquare, 9 * sizeOfSquare);

        flatNoLabel.getStyleClass().add("label_1");
        flatNoLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        flatNoLabel.relocate(14 * sizeOfSquare, 11 * sizeOfSquare);
        flatNoText.getStyleClass().add("textField");
        flatNoText.setPrefSize(6 * sizeOfSquare, 1 * sizeOfSquare);
        flatNoText.relocate(18 * sizeOfSquare, 11 * sizeOfSquare);




        theoryLabel.getStyleClass().add("label_1");
        theoryLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        theoryLabel.relocate(26 * sizeOfSquare, 7 * sizeOfSquare);


        internalExamLabel.getStyleClass().add("label_1");
        internalExamLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        internalExamLabel.relocate(26 * sizeOfSquare, 9 * sizeOfSquare);


        startingDateLabel.getStyleClass().add("label_1");
        startingDateLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        startingDateLabel.relocate(14 * sizeOfSquare, 13 * sizeOfSquare);
        startingDateCombo = createComboBox(true, "starting date");
        startingDateCombo.relocate(18 * sizeOfSquare, 13 * sizeOfSquare);


        addButton.setPrefSize(4 * sizeOfSquare, 1 * sizeOfSquare);
        addButton.relocate(32 * sizeOfSquare, 14 * sizeOfSquare);

        group.getChildren().add(schoolNameLabel);
        group.getChildren().add(logo);
        group.getChildren().add(surnameLabel);
        group.getChildren().add(surnameText);
        group.getChildren().add(nameLabel);
        group.getChildren().add(nameText);
        group.getChildren().add(birthdayLabel);
        group.getChildren().add(yearCombo);
        group.getChildren().add(monthCombo);
        group.getChildren().add(dayCombo);
        group.getChildren().add(peselLabel);
        group.getChildren().add(peselText);
        group.getChildren().add(cityLabel);
        group.getChildren().add(cityCombo);
        group.getChildren().add(streetLabel);
        group.getChildren().add(streetCombo);
        group.getChildren().add(buildingNoLabel);
        group.getChildren().add(buildingNoText);
        group.getChildren().add(flatNoLabel);
        group.getChildren().add(flatNoText);
        group.getChildren().add(theoryLabel);
        group.getChildren().add(internalExamLabel);
        group.getChildren().add(startingDateLabel);
        group.getChildren().add(startingDateCombo);

        group.getChildren().add(addButton);

        return group;
    }

    private ComboBox createComboBox(boolean create, String what) {
        ComboBox comboBox = new ComboBox();
        comboBox.setPrefSize(6 * sizeOfSquare, 1 * sizeOfSquare);
        comboBox.setVisibleRowCount(4);
        comboBox.getStyleClass().add("button");

        if (create) {
            comboBox.setValue("<choose " + what + ">");
            comboBox.getItems().add("<new>");
        }

        return comboBox;
    }

    private ComboBox createBirthdayComboBox(String what) {
        ComboBox comboBox = new ComboBox();
        comboBox.setPrefSize(2.5 * sizeOfSquare, 1 * sizeOfSquare);
        comboBox.setVisibleRowCount(4);
        comboBox.getStyleClass().add("button");

        if (what == "year") {
            comboBox.setValue("yyyy");
            for(int i=50; i<=99; ++i)
                comboBox.getItems().add("19" + i);

        } else if(what == "month") {
            comboBox.setValue("mm");

            for(int i=1; i<=12; ++i)
                comboBox.getItems().add(i);

        } else {
            comboBox.setValue("dd");
            //w zaleznosci od miesiaca
            int day = 31;

            for(int i=1; i<=day; ++i)
                comboBox.getItems().add(i);
        }

        return comboBox;
    }
}
