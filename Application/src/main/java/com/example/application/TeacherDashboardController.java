package com.example.application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.control.TableCell;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextField;




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
        private TableColumn<StudentRecord, String> admissionYearColumn;
        @FXML
        private TableColumn<StudentRecord, String> currentYearColumn;
        @FXML
        private TableColumn<StudentRecord, String> courseColumn;
        @FXML
        private TableColumn<StudentRecord, Void> detailsColumn;
        @FXML
        private TableColumn<StudentRecord, String> studentNameColumn;

        @FXML private TableColumn<StudentRecord, String> currentSemColumn;
        @FXML
        private VBox detailsPanel;
        @FXML
        private TextField searchField;
        private ObservableList<StudentRecord> masterData = FXCollections.observableArrayList();

        private ObservableList<StudentRecord> studentData;
        private FilteredList<StudentRecord> filteredData;

    @FXML
        private BorderPane rootPane;

    @FXML
        private void initialize() {
        logoImage.setImage(new Image("C:\\Users\\Shreya\\IdeaProjects\\Application\\src\\main\\resources\\Screenshot__697_-removebg-preview.png"));
        configureTable();
        setupNavigation();
        loadSampleData();
        setupSearch();
        addButtonAnimation(HOME);
        addButtonAnimation1(ABOUT);
        addButtonAnimation2(HELP);
        }
        private void setupSearch() {
            FilteredList<StudentRecord> filteredData = new FilteredList<>(masterData, b -> true);

            searchField.textProperty().addListener((observable, oldValue, newValue) -> {
                filteredData.setPredicate(student -> {
                    if (newValue == null || newValue.trim().isEmpty()) {
                        return true; // Show all if search is empty
                    }

                    String lowerCaseFilter = newValue.toLowerCase();
                    return student.getName().toLowerCase().contains(lowerCaseFilter); // SEARCH BY NAME
                });
            });

            SortedList<StudentRecord> sortedData = new SortedList<>(filteredData);
            sortedData.comparatorProperty().bind(studentTable.comparatorProperty());

            studentTable.setItems(sortedData);
        }
        @FXML
        private void handleSearchAction() {
            setupSearch();
        }
        @FXML
        private void handleClearSearch() {
            searchField.clear();
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
        srNoColumn.setCellValueFactory(new PropertyValueFactory<>("srNo"));
        studentIdColumn.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        studentNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        admissionYearColumn.setCellValueFactory(new PropertyValueFactory<>("admissionYear"));
        currentYearColumn.setCellValueFactory(new PropertyValueFactory<>("currentYear"));
        currentSemColumn.setCellValueFactory(new PropertyValueFactory<>("currentSemester"));
        courseColumn.setCellValueFactory(new PropertyValueFactory<>("course"));

        detailsColumn.setCellFactory(param -> new TableCell<>() {
            private final Button detailsButton = new Button("        View       ");

            {
                detailsButton.setStyle("-fx-background-color: #27ae60; -fx-text-fill: white; -fx-border-radius: 3px;");
                detailsButton.setOnAction(event -> showDetailsPanel());
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                setGraphic(empty ? null : detailsButton);
            }
        });
    }

    private void loadSampleData() {
        // Adding sample students
        masterData.add(new StudentRecord(1, "ST101", "John Doe", "2020", "4th Year", "8th", "Computer Science"));
        masterData.add(new StudentRecord(2, "ST102", "Jane Smith", "2019", "Final Year", "8th", "Electronics"));
        masterData.add(new StudentRecord(3, "ST103", "Alice Johnson", "2021", "3rd Year", "6th", "Mechanical"));
        masterData.add(new StudentRecord(4, "ST104", "Bob Brown", "2022", "2nd Year", "4th", "Civil Engineering"));
        masterData.add(new StudentRecord(5, "ST105", "Charlie Davis", "2023", "1st Year", "2nd", "Biomedical"));

        studentTable.setItems(masterData);
    }

        private void setupNavigation() {
            HOME.setOnAction(event -> handleHomeAction());
            ABOUT.setOnAction(event -> handleAboutAction());
            HELP.setOnAction(event -> handleHelpAction());
        }
        private void showDetailsPanel() {
            homePage.setVisible(false);
            aboutPage.setVisible(false);
            helpPage.setVisible(false);
            detailsPanel.setVisible(true); // Display the details panel
        }
        @FXML
        private void handleHomeAction() {
            homePage.setVisible(true);
            aboutPage.setVisible(false);
            helpPage.setVisible(false);
            detailsPanel.setVisible(false);
        }
        @FXML
        private void handleAboutAction() {
            homePage.setVisible(false);
            aboutPage.setVisible(true);
            helpPage.setVisible(false);
            detailsPanel.setVisible(false);
        }
        @FXML
        private void handleHelpAction() {
            homePage.setVisible(false);
            aboutPage.setVisible(false);
            helpPage.setVisible(true);
            detailsPanel.setVisible(false);
        }
    }




