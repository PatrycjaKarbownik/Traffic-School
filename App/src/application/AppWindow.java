//created by Patrycja Karbownik
//application for database
//"TrafficSchool"

package application;

import javafx.collections.ObservableList;
import javafx.geometry.Pos;
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
import java.util.HashMap;
import java.util.Map;

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

    private static Stage addNewCityOrStreetStage;
    private static Stage addNewStartingDateStage;

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
                Actions.searchTrainee(surnameText.getText(), nameText.getText(), peselText.getText());

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
        yearCombo = createDateComboBox("yearB");
        yearCombo.relocate(5.25 * sizeOfSquare, 9 * sizeOfSquare);
        yearCombo.setOnAction(e -> {
            if (!monthCombo.isDisable() && monthCombo.getValue().toString().compareTo("02") == 0) {
                dayUpdate(yearCombo, monthCombo, dayCombo);
            } else if (yearCombo.getValue().toString() != "yyyy") monthCombo.setDisable(false);
        });

        monthCombo = createDateComboBox("month");
        monthCombo.relocate(7.75 * sizeOfSquare, 9 * sizeOfSquare);
        monthCombo.setDisable(true);
        monthCombo.setOnAction(e -> {
            if (monthCombo.getValue().toString() != "mm") dayCombo.setDisable(false);
            dayUpdate(yearCombo, monthCombo, dayCombo);
        });

        dayCombo = createDateComboBox("day");
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
        cityCombo.setOnAction(e -> {
            if (cityCombo.getValue().toString().compareTo("<new>") == 0)
                createAddNewCityOrStreetStage("city");
        });

        streetLabel.getStyleClass().add("label_1");
        streetLabel.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        streetLabel.relocate(14 * sizeOfSquare, 7 * sizeOfSquare);
        streetCombo = createComboBox("street");
        streetCombo.relocate(18 * sizeOfSquare, 7 * sizeOfSquare);
        streetCombo.setOnAction(e -> {
            if (streetCombo.getValue().toString().compareTo("<new>") == 0)
                createAddNewCityOrStreetStage("street");
        });

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
        startingDateCombo.setOnAction(e -> {
            if (startingDateCombo.getValue().toString().compareTo("<new>") == 0)
                createAddNewStartingDateStage();
        });

        addButton.setPrefSize(4 * sizeOfSquare, 1 * sizeOfSquare);
        addButton.relocate(32 * sizeOfSquare, 14 * sizeOfSquare);
        addButton.setOnAction(e->{
            Map<String, Object> context = new HashMap<String, Object>();
            context.put("city", cityCombo.getValue().toString());
            context.put("street", streetCombo.getValue().toString());
            context.put("building", buildingNoText.getText());
            context.put("flat", flatNoText.getText());
            context.put("pesel", peselText.getText());
            context.put("surname", surnameText.getText());
            context.put("name", nameText.getText());
            context.put("year", yearCombo.getValue().toString());
            context.put("month", monthCombo.getValue().toString());
            context.put("day", dayCombo.getValue().toString());
            context.put("starting_date", startingDateCombo.getValue().toString());
            context.put("theory", theoryCheckBox.isSelected());
            context.put("internal_exam", internalCheckBox.isSelected());

            try {
                TraineeAction.insertTrainee(context);
            } catch (SQLException e1) {
                System.out.println("App createAddGroup SQL: " + e1);
            } catch (ClassNotFoundException e1) {
                System.out.println("App createAddGroup ClassNF: " + e1);
            }
        });

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

        return comboBox;
    }

    private ComboBox createDateComboBox(String what) {
        ComboBox comboBox = new ComboBox();
        comboBox.setPrefSize(2.5 * sizeOfSquare, 1 * sizeOfSquare);
        comboBox.setVisibleRowCount(4);

        if (what == "yearB") {
            comboBox.setValue("yyyy");
            for (int i = 50; i <= 99; ++i)
                comboBox.getItems().add("19" + i);

        } else if (what == "yearSD") {
            comboBox.setValue("yyyy");
            for (int i = 2017; i <= 2020; ++i)
                comboBox.getItems().add(i);
        } else if (what == "month") {
            comboBox.setValue("mm");

            for (int i = 1; i <= 12; ++i)
                if(i < 10) comboBox.getItems().add("0" + i);
                else comboBox.getItems().add(i);

        } else {
            comboBox.setValue("dd");

            for (int i = 1; i <= 31; ++i)
                if(i < 10) comboBox.getItems().add("0" + i);
                else comboBox.getItems().add(i);
        }

        return comboBox;
    }

    private void dayUpdate(ComboBox yearCombo, ComboBox monthCombo, ComboBox dayCombo) {
        month = monthCombo.getValue().toString();
        ObservableList<String> list = dayCombo.getItems();
        int year = Integer.parseInt(yearCombo.getValue().toString().trim());

        switch(month) {
            case "02": case "04": case "06": case "09": case "11":
                if (list.size() == 31) dayCombo.getItems().remove(30); //31
                if (month.compareTo("02") == 0) {
                    if (list.size() > 28) {
                        if (list.size() == 30) dayCombo.getItems().remove(29); //30
                        if (year % 4 != 0 && list.size() == 29)
                            dayCombo.getItems().remove(28); //29
                    } else if (list.size() == 28 && year % 4 == 0) dayCombo.getItems().add(29);
                } else {
                    if (list.size() == 28) dayCombo.getItems().add(29);
                    if (list.size() == 29) dayCombo.getItems().add(30);
                }
                break;
            case "01": case "03": case "05": case "07": case "08": case "10": case "12":
                if (list.size() == 28) dayCombo.getItems().add(29);
                if (list.size() == 29) dayCombo.getItems().add(30);
                if (list.size() == 30) dayCombo.getItems().add(31);
                break;
        }

    }

    private void createAddNewCityOrStreetStage(String what) {
        addNewCityOrStreetStage = new Stage();
        addNewCityOrStreetStage.getIcons().add(new Image(AppWindow.class.getResource("/data/logo.png").toExternalForm()));
        addNewCityOrStreetStage.setTitle("Add new " + what);
        addNewCityOrStreetStage.setResizable(false);
        addNewCityOrStreetStage.setAlwaysOnTop(true);
        addNewCityOrStreetStage.setMaximized(false);

        Group panel = new Group();
        Label info = new Label("Add new " + what);
        info.getStyleClass().add("label_1");
        info.setAlignment(Pos.CENTER);
        info.setPrefSize(6 * sizeOfSquare, 1 * sizeOfSquare);
        info.relocate(1 * sizeOfSquare, 1 * sizeOfSquare);


        TextField textField = new TextField();
        textField.setPrefSize(6 * sizeOfSquare, 1 * sizeOfSquare);
        textField.relocate(1 * sizeOfSquare, 3 * sizeOfSquare);

        Button okButton = new Button("OK");
        okButton.setPrefSize(2 * sizeOfSquare, 1 * sizeOfSquare);
        okButton.relocate(5 * sizeOfSquare, 5 * sizeOfSquare);
        okButton.setOnAction(e -> {
            String text = textField.getText();
            if(text.compareTo("") == 0) {
                if (what == "city") cityCombo.setValue("<choose " + what + ">");
                else streetCombo.setValue("<choose " + what + ">");
            } else {
                if (what == "city") cityCombo.setValue(text);
                else streetCombo.setValue(text);
            }
            addNewCityOrStreetStage.close();
        });

        Button cancelButton = new Button("Cancel");
        cancelButton.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        cancelButton.relocate(1 * sizeOfSquare, 5 * sizeOfSquare);

        cancelButton.setOnAction(e -> {
            addNewCityOrStreetStage.close();
            if (what == "city") cityCombo.setValue("<choose " + what + ">");
            else streetCombo.setValue("<choose " + what + ">");

        });


        panel.getChildren().addAll(info, textField, okButton, cancelButton);
        Scene scene = new Scene(panel, 8 * sizeOfSquare, 7 * sizeOfSquare, Color.BLACK);
        scene.getStylesheets().add("/data/stylesheet.css");

        addNewCityOrStreetStage.setScene(scene);
        addNewCityOrStreetStage.show();
    }

    private void createAddNewStartingDateStage() {
        addNewStartingDateStage = new Stage();
        addNewStartingDateStage.getIcons().add(new Image(AppWindow.class.getResource("/data/logo.png").toExternalForm()));
        addNewStartingDateStage.setTitle("Add new starting date");
        addNewStartingDateStage.setResizable(false);
        addNewStartingDateStage.setAlwaysOnTop(true);
        addNewStartingDateStage.setMaximized(false);

        Group panel = new Group();
        Label info = new Label("Add new starting date");
        info.getStyleClass().add("label_1");
        info.setAlignment(Pos.CENTER);
        info.setPrefSize(6 * sizeOfSquare, 1 * sizeOfSquare);
        info.relocate(1 * sizeOfSquare, 1 * sizeOfSquare);

        ComboBox yearCo = createDateComboBox("yearSD");
        ComboBox monthCo = createDateComboBox("month");
        ComboBox dayCo = createDateComboBox("day");

        yearCo.relocate(0.25 * sizeOfSquare, 3 * sizeOfSquare);
        yearCo.setOnAction(e -> {
            if (!monthCo.isDisable() && monthCo.getValue().toString().compareTo("02") == 0) {
                dayUpdate(yearCo, monthCo, dayCo);
            } else if (yearCo.getValue().toString() != "yyyy") monthCo.setDisable(false);
        });

        monthCo.relocate(2.75 * sizeOfSquare, 3 * sizeOfSquare);
        monthCo.setDisable(true);
        monthCo.setOnAction(e -> {
            if (monthCo.getValue().toString() != "mm") dayCo.setDisable(false);
            dayUpdate(yearCo, monthCo, dayCo);
        });

        dayCo.relocate(5.25 * sizeOfSquare, 3 * sizeOfSquare);
        dayCo.setDisable(true);


        Button okButton = new Button("OK");
        okButton.setPrefSize(2 * sizeOfSquare, 1 * sizeOfSquare);
        okButton.relocate(5 * sizeOfSquare, 5 * sizeOfSquare);
        okButton.setOnAction(e -> {
            String text = yearCo.getValue().toString() + "-" + monthCo.getValue().toString() + "-" + dayCo.getValue().toString();
            if(dayCo.getValue().toString().compareTo("dd") == 0) {
                startingDateCombo.setValue("<choose starting date>");
            } else {
                startingDateCombo.setValue(text);
            }
            addNewStartingDateStage.close();
        });


        Button cancelButton = new Button("Cancel");
        cancelButton.setPrefSize(3 * sizeOfSquare, 1 * sizeOfSquare);
        cancelButton.relocate(1 * sizeOfSquare, 5 * sizeOfSquare);

        cancelButton.setOnAction(e -> {
            addNewStartingDateStage.close();
            startingDateCombo.setValue("<choose starting date>");

        });


        panel.getChildren().addAll(info, yearCo, monthCo, dayCo, okButton, cancelButton);
        Scene scene = new Scene(panel, 8 * sizeOfSquare, 7 * sizeOfSquare, Color.BLACK);
        scene.getStylesheets().add("/data/stylesheet.css");

        addNewStartingDateStage.setScene(scene);
        addNewStartingDateStage.show();
    }
}
