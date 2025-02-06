package com.example.application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class StudentDashboardController {
    @FXML
    private Button HOME;
    @FXML
    private Button ABOUT;
    @FXML
    private Button HELP;
    @FXML
    private TextField nameField;
    @FXML
    private TextField admissionYearField;
    @FXML
    private TextField currentYearField;
    @FXML
    private TextField studentIdField;
    @FXML
    private TextField courseField;
    @FXML
    private TextField sem1MarksField;
    @FXML
    private TextField sem2MarksField;
    @FXML
    private TextField sem3MarksField;
    @FXML
    private TextField sem4MarksField;
    @FXML
    private TextField sem5MarksField;
    @FXML
    private TextField sem6MarksField;
    @FXML
    private TextField sem7MarksField;
    @FXML
    private TextField sem8MarksField;

    @FXML
    private ImageView logoImage;


    @FXML
    private void initialize() {
        logoImage.setImage(new Image("C:\\Users\\Shreya\\IdeaProjects\\Application\\src\\main\\resources\\Screenshot__697_-removebg-preview.png"));
        addButtonAnimation(HOME);
        addButtonAnimation1(ABOUT);
        addButtonAnimation2(HELP);
    }
    // Handles the "HOME" button action
//    @FXML
//    public void handleHomeAction() {
//        resetFields();
//        nameField.setPromptText("Enter student name");
//        admissionYearField.setPromptText("Enter admission year");
//        currentYearField.setPromptText("Enter current year");
//        studentIdField.setPromptText("Enter student ID");
//        courseField.setPromptText("Enter course");
//    }
//    private StackPane contentArea;
//    // Handles the "ABOUT" button action
//    @FXML
//    public void showAbout() {
//        VBox aboutContent = new VBox(10);
//        aboutContent.getChildren().add(new Label("About Page: This application is for managing student data."));
//        contentArea.getChildren().setAll(aboutContent);
//    }
//
//    // Handles the "HELP AND SUPPORT" button action
//    @FXML
//    public void showHelp() {
//        VBox helpContent = new VBox(10);
//        helpContent.getChildren().add(new Label("Help Page: For support, contact your admin."));
//        contentArea.getChildren().setAll(helpContent);
//    }
//
//    // Clears all text fields
//    private void resetFields() {
//        nameField.clear();
//        admissionYearField.clear();
//        currentYearField.clear();
//        studentIdField.clear();
//        courseField.clear();
//        sem1MarksField.clear();
//        sem2MarksField.clear();
//        sem3MarksField.clear();
//        sem4MarksField.clear();
//        sem5MarksField.clear();
//        sem6MarksField.clear();
//        sem7MarksField.clear();
//        sem8MarksField.clear();
//    }
    @FXML
    private VBox homePage;

    @FXML
    private VBox aboutPage;

    @FXML
    private VBox helpPage;

    @FXML
    private void handleHomeAction() {
        // Show the home page and hide others
        homePage.setVisible(true);
        aboutPage.setVisible(false);
        helpPage.setVisible(false);
    }

    @FXML
    private void handleAboutAction() {
        // Show the about page and hide others
        homePage.setVisible(false);
        aboutPage.setVisible(true);
        helpPage.setVisible(false);
    }

    @FXML
    private void handleHelpAction() {
        // Show the help page and hide others
        homePage.setVisible(false);
        aboutPage.setVisible(false);
        helpPage.setVisible(true);
    }
    private void addButtonAnimation(Button button) {
        // Initial button style
        button.setStyle(
                "-fx-background-color: transparent; " +
                        "-fx-border-color: white; " +
                        "-fx-border-width: 1; " +
                        "-fx-text-fill: white; " +
                        "-fx-font-size: 14px; " +
                        "-fx-padding: 10 80; " +
                        "-fx-border-radius: 0; " +
                        "-fx-background-radius: 0;"
        );

        // Hover effect
        button.setOnMouseEntered(event -> {
            button.setStyle(
                    "-fx-background-color: rgba(255, 255, 255, 0.1); " +
                            "-fx-border-color: white; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: white; " +
                            "-fx-font-size: 14px; " +
                            "-fx-padding: 10 80; " +
                            "-fx-border-radius: 0; " +
                            "-fx-background-radius: 0;"
            );
        });

        // Reset style on mouse exit
        button.setOnMouseExited(event -> {
            button.setStyle(
                    "-fx-background-color: transparent; " +
                            "-fx-border-color: white; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: white; " +
                            "-fx-font-size: 14px; " +
                            "-fx-padding: 10 80; " +
                            "-fx-border-radius: 0; " +
                            "-fx-background-radius: 0;"
            );
        });

        // Click effect
        button.setOnMousePressed(event -> {
            button.setStyle(
                    "-fx-background-color: rgba(255, 255, 255, 0.2); " +
                            "-fx-border-color: white; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: white; " +
                            "-fx-font-size: 14px; " +
                            "-fx-padding: 10 80; " +
                            "-fx-border-radius: 0; " +
                            "-fx-background-radius: 0;"
            );
        });

        // Reset style after click
        button.setOnMouseReleased(event -> {
            button.setStyle(
                    "-fx-background-color: rgba(255, 255, 255, 0.1); " +
                            "-fx-border-color: white; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: white; " +
                            "-fx-font-size: 14px; " +
                            "-fx-padding: 10 80; " +
                            "-fx-border-radius: 0; " +
                            "-fx-background-radius: 0;"
            );
        });
    }
    private void addButtonAnimation1(Button button) {
        // Initial button style
        button.setStyle(
                "-fx-background-color: transparent; " +
                        "-fx-border-color: white; " +
                        "-fx-border-width: 1; " +
                        "-fx-text-fill: white; " +
                        "-fx-font-size: 14px; " +
                        "-fx-padding: 10 78; " +
                        "-fx-border-radius: 0; " +
                        "-fx-background-radius: 0;"
        );

        // Hover effect
        button.setOnMouseEntered(event -> {
            button.setStyle(
                    "-fx-background-color: rgba(255, 255, 255, 0.1); " +
                            "-fx-border-color: white; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: white; " +
                            "-fx-font-size: 14px; " +
                            "-fx-padding: 10 78; " +
                            "-fx-border-radius: 0; " +
                            "-fx-background-radius: 0;"
            );
        });

        // Reset style on mouse exit
        button.setOnMouseExited(event -> {
            button.setStyle(
                    "-fx-background-color: transparent; " +
                            "-fx-border-color: white; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: white; " +
                            "-fx-font-size: 14px; " +
                            "-fx-padding: 10 78; " +
                            "-fx-border-radius: 0; " +
                            "-fx-background-radius: 0;"
            );
        });

        // Click effect
        button.setOnMousePressed(event -> {
            button.setStyle(
                    "-fx-background-color: rgba(255, 255, 255, 0.2); " +
                            "-fx-border-color: white; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: white; " +
                            "-fx-font-size: 14px; " +
                            "-fx-padding: 10 78; " +
                            "-fx-border-radius: 0; " +
                            "-fx-background-radius: 0;"
            );
        });

        // Reset style after click
        button.setOnMouseReleased(event -> {
            button.setStyle(
                    "-fx-background-color: rgba(255, 255, 255, 0.1); " +
                            "-fx-border-color: white; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: white; " +
                            "-fx-font-size: 14px; " +
                            "-fx-padding: 10 78; " +
                            "-fx-border-radius: 0; " +
                            "-fx-background-radius: 0;"
            );
        });
    }
    private void addButtonAnimation2(Button button) {
        // Initial button style
        button.setStyle(
                "-fx-background-color: transparent; " +
                        "-fx-border-color: white; " +
                        "-fx-border-width: 1; " +
                        "-fx-text-fill: white; " +
                        "-fx-font-size: 14px; " +
                        "-fx-padding: 10 37; " +
                        "-fx-border-radius: 0; " +
                        "-fx-background-radius: 0;"
        );

        // Hover effect
        button.setOnMouseEntered(event -> {
            button.setStyle(
                    "-fx-background-color: rgba(255, 255, 255, 0.1); " +
                            "-fx-border-color: white; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: white; " +
                            "-fx-font-size: 14px; " +
                            "-fx-padding: 10 37; " +
                            "-fx-border-radius: 0; " +
                            "-fx-background-radius: 0;"
            );
        });

        // Reset style on mouse exit
        button.setOnMouseExited(event -> {
            button.setStyle(
                    "-fx-background-color: transparent; " +
                            "-fx-border-color: white; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: white; " +
                            "-fx-font-size: 14px; " +
                            "-fx-padding: 10 37; " +
                            "-fx-border-radius: 0; " +
                            "-fx-background-radius: 0;"
            );
        });

        // Click effect
        button.setOnMousePressed(event -> {
            button.setStyle(
                    "-fx-background-color: rgba(255, 255, 255, 0.2); " +
                            "-fx-border-color: white; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: white; " +
                            "-fx-font-size: 14px; " +
                            "-fx-padding: 10 37; " +
                            "-fx-border-radius: 0; " +
                            "-fx-background-radius: 0;"
            );
        });

        // Reset style after click
        button.setOnMouseReleased(event -> {
            button.setStyle(
                    "-fx-background-color: rgba(255, 255, 255, 0.1); " +
                            "-fx-border-color: white; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: white; " +
                            "-fx-font-size: 14px; " +
                            "-fx-padding: 10 37; " +
                            "-fx-border-radius: 0; " +
                            "-fx-background-radius: 0;"
            );
        });
    }
}
