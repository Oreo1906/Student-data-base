package com.example.application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class TeacherDashboardController {


        @FXML
        private Button HOME;
        @FXML
        private Button ABOUT;
        @FXML
        private Button HELP;
        @FXML
        private ImageView logoImage;

        @FXML
        private VBox homePage;
        @FXML
        private VBox aboutPage;
        @FXML
        private VBox helpPage;

        // Table for teacher's view in the HOME tab
        @FXML
        private TableView<StudentRecord> studentTable;
        @FXML
        private TableColumn<StudentRecord, Integer> srNoColumn;
        @FXML
        private TableColumn<StudentRecord, String> studentIdColumn;
        @FXML
        private TableColumn<StudentRecord, String> nameColumn;
        @FXML
        private TableColumn<StudentRecord, String> admissionYearColumn;
        @FXML
        private TableColumn<StudentRecord, String> currentYearColumn;
        @FXML
        private TableColumn<StudentRecord, String> courseColumn;
        @FXML
        private TableColumn<StudentRecord, String> sem1MarksColumn;
        @FXML
        private TableColumn<StudentRecord, String> sem2MarksColumn;
        @FXML
        private TableColumn<StudentRecord, String> sem3MarksColumn;
        @FXML
        private TableColumn<StudentRecord, String> sem4MarksColumn;
        @FXML
        private TableColumn<StudentRecord, String> sem5MarksColumn;
        @FXML
        private TableColumn<StudentRecord, String> sem6MarksColumn;
        @FXML
        private TableColumn<StudentRecord, String> sem7MarksColumn;
        @FXML
        private TableColumn<StudentRecord, String> sem8MarksColumn;

        @FXML
        private void initialize() {
            logoImage.setImage(new Image("C:\\Users\\Shreya\\IdeaProjects\\Application\\src\\main\\resources\\Screenshot__697_-removebg-preview.png"));
            configureTable();
            loadSampleData();
            setupNavigation();
            addButtonAnimation(HOME);
            addButtonAnimation1(ABOUT);
            addButtonAnimation2(HELP);
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
        private void configureTable() {
            // Setting up columns with corresponding properties
            srNoColumn.setCellValueFactory(new PropertyValueFactory<>("srNo"));
            studentIdColumn.setCellValueFactory(new PropertyValueFactory<>("studentId"));
            nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
            admissionYearColumn.setCellValueFactory(new PropertyValueFactory<>("admissionYear"));
            currentYearColumn.setCellValueFactory(new PropertyValueFactory<>("currentYear"));
            courseColumn.setCellValueFactory(new PropertyValueFactory<>("course"));
            sem1MarksColumn.setCellValueFactory(new PropertyValueFactory<>("sem1Marks"));
            sem2MarksColumn.setCellValueFactory(new PropertyValueFactory<>("sem2Marks"));
            sem3MarksColumn.setCellValueFactory(new PropertyValueFactory<>("sem3Marks"));
            sem4MarksColumn.setCellValueFactory(new PropertyValueFactory<>("sem4Marks"));
            sem5MarksColumn.setCellValueFactory(new PropertyValueFactory<>("sem5Marks"));
            sem6MarksColumn.setCellValueFactory(new PropertyValueFactory<>("sem6Marks"));
            sem7MarksColumn.setCellValueFactory(new PropertyValueFactory<>("sem7Marks"));
            sem8MarksColumn.setCellValueFactory(new PropertyValueFactory<>("sem8Marks"));
        }

        private void loadSampleData() {
            // Example data for testing
            ObservableList<StudentRecord> data = FXCollections.observableArrayList(
                    new StudentRecord(1, "ST101", "John Doe", "2020", "2024", "Computer Science", "85", "90", "80", "88", "85", "89", "92", "95"),
                    new StudentRecord(2, "ST102", "Jane Smith", "2019", "2023", "Electronics", "75", "78", "88", "92", "86", "84", "81", "89")
            );
            studentTable.setItems(data);
        }

        private void setupNavigation() {
            HOME.setOnAction(event -> handleHomeAction());
            ABOUT.setOnAction(event -> handleAboutAction());
            HELP.setOnAction(event -> handleHelpAction());
        }
        @FXML
        private void handleHomeAction() {
            homePage.setVisible(true);
            aboutPage.setVisible(false);
            helpPage.setVisible(false);
        }
        @FXML
        private void handleAboutAction() {
            homePage.setVisible(false);
            aboutPage.setVisible(true);
            helpPage.setVisible(false);
        }
        @FXML
        private void handleHelpAction() {
            homePage.setVisible(false);
            aboutPage.setVisible(false);
            helpPage.setVisible(true);
        }
    }

    // Data model class for student records
    class StudentRecord {
        private int srNo;
        private String studentId;
        private String name;
        private String admissionYear;
        private String currentYear;
        private String course;
        private String sem1Marks;
        private String sem2Marks;
        private String sem3Marks;
        private String sem4Marks;
        private String sem5Marks;
        private String sem6Marks;
        private String sem7Marks;
        private String sem8Marks;

        public StudentRecord(int srNo, String studentId, String name, String admissionYear, String currentYear, String course,
                             String sem1Marks, String sem2Marks, String sem3Marks, String sem4Marks, String sem5Marks,
                             String sem6Marks, String sem7Marks, String sem8Marks) {
            this.srNo = srNo;
            this.studentId = studentId;
            this.name = name;
            this.admissionYear = admissionYear;
            this.currentYear = currentYear;
            this.course = course;
            this.sem1Marks = sem1Marks;
            this.sem2Marks = sem2Marks;
            this.sem3Marks = sem3Marks;
            this.sem4Marks = sem4Marks;
            this.sem5Marks = sem5Marks;
            this.sem6Marks = sem6Marks;
            this.sem7Marks = sem7Marks;
            this.sem8Marks = sem8Marks;
        }

        // Getters
        public int getSrNo() { return srNo; }
        public String getStudentId() { return studentId; }
        public String getName() { return name; }
        public String getAdmissionYear() { return admissionYear; }
        public String getCurrentYear() { return currentYear; }
        public String getCourse() { return course; }
        public String getSem1Marks() { return sem1Marks; }
        public String getSem2Marks() { return sem2Marks; }
        public String getSem3Marks() { return sem3Marks; }
        public String getSem4Marks() { return sem4Marks; }
        public String getSem5Marks() { return sem5Marks; }
        public String getSem6Marks() { return sem6Marks; }
        public String getSem7Marks() { return sem7Marks; }
        public String getSem8Marks() { return sem8Marks; }


    }


