package application;

import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import model.Trainee;
import model.TraineeAction;

import java.sql.SQLException;

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

    private static TableView<ObservableList<String>> table = new TableView<>();
    private static TableColumn surnameCol = new TableColumn("Surname");
    private static TableColumn nameCol = new TableColumn("Name");
    private static TableColumn peselCol = new TableColumn("PESEL");
    private static TableColumn cityCol = new TableColumn("City");
    private static TableColumn streetCol = new TableColumn("Street");
    private static TableColumn buildingCol = new TableColumn("Building no.");
    private static TableColumn flatCol = new TableColumn("Flat no.");


    private static Button searchButton = new Button("Search");
    private static Button addButton = new Button("Add");
    private static Button undoButton = new Button("Undo");

    private static Label birthdayLabel = new Label("Birthday:");
    private static ComboBox yearCombo;
    private static ComboBox monthCombo;
    private static String month;
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
    private static CheckBox theoryCheckBox = new CheckBox();
    private static Label internalExamLabel = new Label("Internal exam:");
    private static CheckBox internalCheckBox = new CheckBox();

    private static Paint textColor = Color.LIGHTGRAY;
    public static final int sizeOfSquare = 30;

    AppWindow(Stage primaryStage, String what) {
        primaryStage.setTitle("Traffic School \"Brum, Brum\"");
        primaryStage.getIcons().add(new Image(AppWindow.class.getResource("/data/logo.png").toExternalForm()));

        Group panel = null;

        if (what == "basic") panel = createBasicGroup(primaryStage);
        else if (what == "add") panel = createAddGroup(primaryStage);


        Scene scene = new Scene(panel, 38 * sizeOfSquare, 16 * sizeOfSquare, Color.BLACK);
        scene.getStylesheets().add("/data/stylesheet.css");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private Group createBasicGroup(Stage primaryStage) {
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
        surnameText.setPrefSize(6 * sizeOfSquare, 1 * sizeOfSquare);
        surnameText.relocate(6 * sizeOfSquare, 5 * sizeOfSquare);

        nameLabel.getStyleClass().add("label_1");
        nameLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        nameLabel.relocate(14 * sizeOfSquare, 5 * sizeOfSquare);
        nameText.setPrefSize(6 * sizeOfSquare, 1 * sizeOfSquare);
        nameText.relocate(18 * sizeOfSquare, 5 * sizeOfSquare);

        peselLabel.getStyleClass().add("label_1");
        peselLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        peselLabel.relocate(26 * sizeOfSquare, 5 * sizeOfSquare);
        peselText.setPrefSize(6 * sizeOfSquare, 1 * sizeOfSquare);
        peselText.relocate(30 * sizeOfSquare, 5 * sizeOfSquare);

        surnameCol.setPrefWidth(4 * sizeOfSquare);
        nameCol.setPrefWidth(4 * sizeOfSquare);
        peselCol.setPrefWidth(4 * sizeOfSquare);
        cityCol.setPrefWidth(4 * sizeOfSquare);
        streetCol.setPrefWidth(4 * sizeOfSquare);
        buildingCol.setPrefWidth(4 * sizeOfSquare);
        flatCol.setPrefWidth(3 * sizeOfSquare);

        table.setPrefSize(27 * sizeOfSquare, 6 * sizeOfSquare);
        table.relocate(2 * sizeOfSquare, 8 * sizeOfSquare);

        surnameCol.setCellValueFactory(new PropertyValueFactory<Trainee, String>("surname"));
        nameCol.setCellValueFactory(new PropertyValueFactory<Trainee, String>("name"));
        peselCol.setCellValueFactory(new PropertyValueFactory<Trainee, String>("pesel"));
        cityCol.setCellValueFactory(new PropertyValueFactory<Trainee, String>("city"));
        streetCol.setCellValueFactory(new PropertyValueFactory<Trainee, String>("street"));
        buildingCol.setCellValueFactory(new PropertyValueFactory<Trainee, Integer>("building_no"));
        flatCol.setCellValueFactory(new PropertyValueFactory<Trainee, Integer>("flat_no"));

        table.getColumns().addAll(surnameCol, nameCol, peselCol, cityCol, streetCol, buildingCol, flatCol);

        searchButton.setPrefSize(4 * sizeOfSquare, 1 * sizeOfSquare);
        searchButton.relocate(32 * sizeOfSquare, 7 * sizeOfSquare);
        searchButton.setOnAction(e -> {
            try {
                String surr = null, namee = null, pes = null;
                if (!surnameText.getText().trim().isEmpty()) surr = surnameText.getText();
                if (!nameText.getText().trim().isEmpty()) namee = nameText.getText();
                if (!peselText.getText().trim().isEmpty()) pes = peselText.getText();

                Actions.searchTrainee(surr, namee, pes);

                table.itemsProperty().setValue(Actions.getTraineeList());

            } catch (SQLException | ClassNotFoundException e1) {
                System.out.println("App - SQL or Class" + e1);
            }
        });

        addButton.setPrefSize(4 * sizeOfSquare, 1 * sizeOfSquare);
        addButton.relocate(32 * sizeOfSquare, 14 * sizeOfSquare);
        addButton.setOnAction(e -> new AppWindow(primaryStage, "add"));

        group.getChildren().add(schoolNameLabel);
        group.getChildren().add(logo);
        group.getChildren().add(surnameLabel);
        group.getChildren().add(surnameText);
        group.getChildren().add(nameLabel);
        group.getChildren().add(nameText);
        group.getChildren().add(peselLabel);
        group.getChildren().add(peselText);
        group.getChildren().add(table);
        group.getChildren().add(searchButton);
        group.getChildren().add(addButton);
        return group;
    }

    private Group createAddGroup(Stage primaryStage) {
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
        surnameText.setPrefSize(6 * sizeOfSquare, 1 * sizeOfSquare);
        surnameText.relocate(6 * sizeOfSquare, 5 * sizeOfSquare);

        nameLabel.getStyleClass().add("label_1");
        nameLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        nameLabel.relocate(2 * sizeOfSquare, 7 * sizeOfSquare);
        nameText.setPrefSize(6 * sizeOfSquare, 1 * sizeOfSquare);
        nameText.relocate(6 * sizeOfSquare, 7 * sizeOfSquare);

        birthdayLabel.getStyleClass().add("label_1");
        birthdayLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        birthdayLabel.relocate(2 * sizeOfSquare, 9 * sizeOfSquare);
        yearCombo = createBirthdayComboBox("year");
        yearCombo.relocate(5.25 * sizeOfSquare, 9 * sizeOfSquare);
        yearCombo.setOnAction(e -> {
            if (!monthCombo.isDisable()) {
                dayUpdate();
            } else if (yearCombo.getValue().toString() != "yyyy") monthCombo.setDisable(false);
        });

        monthCombo = createBirthdayComboBox("month");
        monthCombo.relocate(7.75 * sizeOfSquare, 9 * sizeOfSquare);
        monthCombo.setDisable(true);
        monthCombo.setOnAction(e -> {
            if (monthCombo.getValue().toString() != "mm") dayCombo.setDisable(false);
            dayUpdate();
        });

        dayCombo = createBirthdayComboBox("day");
        dayCombo.relocate(10.25 * sizeOfSquare, 9 * sizeOfSquare);
        dayCombo.setDisable(true);


        peselLabel.getStyleClass().add("label_1");
        peselLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        peselLabel.relocate(2 * sizeOfSquare, 11 * sizeOfSquare);
        peselText.setPrefSize(6 * sizeOfSquare, 1 * sizeOfSquare);
        peselText.relocate(6 * sizeOfSquare, 11 * sizeOfSquare);

        cityLabel.getStyleClass().add("label_1");
        cityLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        cityLabel.relocate(14 * sizeOfSquare, 5 * sizeOfSquare);
        cityCombo = createComboBox("city");
        cityCombo.relocate(18 * sizeOfSquare, 5 * sizeOfSquare);

        streetLabel.getStyleClass().add("label_1");
        streetLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        streetLabel.relocate(14 * sizeOfSquare, 7 * sizeOfSquare);
        streetCombo = createComboBox("street");
        streetCombo.relocate(18 * sizeOfSquare, 7 * sizeOfSquare);

        buildingNoLabel.getStyleClass().add("label_1");
        buildingNoLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        buildingNoLabel.relocate(14 * sizeOfSquare, 9 * sizeOfSquare);
        buildingNoText.setPrefSize(6 * sizeOfSquare, 1 * sizeOfSquare);
        buildingNoText.relocate(18 * sizeOfSquare, 9 * sizeOfSquare);

        flatNoLabel.getStyleClass().add("label_1");
        flatNoLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        flatNoLabel.relocate(14 * sizeOfSquare, 11 * sizeOfSquare);
        flatNoText.setPrefSize(6 * sizeOfSquare, 1 * sizeOfSquare);
        flatNoText.relocate(18 * sizeOfSquare, 11 * sizeOfSquare);


        theoryLabel.getStyleClass().add("label_1");
        theoryLabel.setPrefSize(4 * sizeOfSquare, 1 * sizeOfSquare);
        theoryLabel.relocate(26 * sizeOfSquare, 7 * sizeOfSquare);
        theoryCheckBox.setPrefSize(1 * sizeOfSquare, 1 * sizeOfSquare);
        theoryCheckBox.relocate(31 * sizeOfSquare, 7 * sizeOfSquare);

        internalExamLabel.getStyleClass().add("label_1");
        internalExamLabel.setPrefSize(4 * sizeOfSquare, 1 * sizeOfSquare);
        internalExamLabel.relocate(26 * sizeOfSquare, 9 * sizeOfSquare);
        internalCheckBox.setPrefSize(1 * sizeOfSquare, 1 * sizeOfSquare);
        internalCheckBox.relocate(31 * sizeOfSquare, 9 * sizeOfSquare);


        startingDateLabel.getStyleClass().add("label_1");
        startingDateLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        startingDateLabel.relocate(14 * sizeOfSquare, 13 * sizeOfSquare);
        startingDateCombo = createComboBox("starting date");
        startingDateCombo.relocate(18 * sizeOfSquare, 13 * sizeOfSquare);


        addButton.setPrefSize(4 * sizeOfSquare, 1 * sizeOfSquare);
        addButton.relocate(32 * sizeOfSquare, 14 * sizeOfSquare);

        undoButton.setPrefSize(4 * sizeOfSquare, 1 * sizeOfSquare);
        undoButton.relocate(26 * sizeOfSquare, 14 * sizeOfSquare);
        undoButton.setOnAction(e -> new AppWindow(primaryStage, "basic"));

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
        group.getChildren().add(theoryCheckBox);
        group.getChildren().add(internalExamLabel);
        group.getChildren().add(internalCheckBox);
        group.getChildren().add(startingDateLabel);
        group.getChildren().add(startingDateCombo);

        group.getChildren().add(addButton);
        group.getChildren().add(undoButton);

        return group;
    }

    private ComboBox createComboBox(String what) {
        ComboBox comboBox = new ComboBox();
        comboBox.setPrefSize(6 * sizeOfSquare, 1 * sizeOfSquare);
        comboBox.setVisibleRowCount(4);
        ObservableList<String> list = null;

        try {
            if (what == "city") list = Actions.getCityList();
            if (what == "street") list = Actions.getStreetList();
            if (what == "starting date") list = Actions.getStartingDateList();
            comboBox.itemsProperty().setValue(list);
        } catch (SQLException e) {
            System.out.println("App createCB - SQL: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("App createCB - CNFE: " + e);
        }

        comboBox.setValue("<choose " + what + ">");
        comboBox.getItems().add("<new>");

        // comboBox.getItems().remove("<new>");


        return comboBox;
    }

    private ComboBox createBirthdayComboBox(String what) {
        ComboBox comboBox = new ComboBox();
        comboBox.setPrefSize(2.5 * sizeOfSquare, 1 * sizeOfSquare);
        comboBox.setVisibleRowCount(4);

        if (what == "year") {
            comboBox.setValue("yyyy");
            for (int i = 50; i <= 99; ++i)
                comboBox.getItems().add("19" + i);

        } else if (what == "month") {
            comboBox.setValue("mm");

            for (int i = 1; i <= 12; ++i)
                comboBox.getItems().add(i);

        } else {
            comboBox.setValue("dd");
            //w zaleznosci od miesiaca
            int day = 31;

            for (int i = 1; i <= day; ++i)
                comboBox.getItems().add(i);
        }

        return comboBox;
    }

    private void dayUpdate() {
        month = monthCombo.getValue().toString();
        ObservableList<String> list = dayCombo.getItems();
        int year = Integer.parseInt(yearCombo.getValue().toString().trim());
        if (month.compareTo("2") == 0 || month.compareTo("4") == 0
                || month.compareTo("6") == 0 || month.compareTo("9") == 0
                || month.compareTo("11") == 0) {
            if (list.size() == 31) dayCombo.getItems().remove(30); //31
            if (month.compareTo("2") == 0) {
                if (list.size() > 28) {
                    if (list.size() == 30) dayCombo.getItems().remove(29); //30
                    if (year % 4 != 0 && list.size() == 29)
                        dayCombo.getItems().remove(28); //29
                } else if (list.size() == 28 && year % 4 == 0) dayCombo.getItems().add(29);
            } else {
                if (list.size() == 28) dayCombo.getItems().add(29);
                if (list.size() == 29) dayCombo.getItems().add(30);
            }
        } else {
            if (list.size() == 28) dayCombo.getItems().add(29);
            if (list.size() == 29) dayCombo.getItems().add(30);
            if (list.size() == 30) dayCombo.getItems().add(31);
        }
    }
}
