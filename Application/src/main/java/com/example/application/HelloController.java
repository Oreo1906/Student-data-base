package com.example.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;
import javafx.scene.layout.VBox;
import javafx.animation.PauseTransition;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import java.io.IOException;

public class HelloController {

    @FXML
    public Button loginbutton;
    @FXML
    public VBox teacherLoginBox;
    @FXML
    public TextField teacherUsernameField;
    @FXML
    public PasswordField teacherPasswordField;
    @FXML
    public Button teacherLoginButton;

    @FXML
    private VBox leftPane;  // Left partition (VBox)

    @FXML
    private VBox loginBox;  // The login form inside left pane

    @FXML
    private Label loginTitle;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button switchButton;

    @FXML
    private VBox rightBox;  // Right partition (VBox)

    private boolean isStudentLogin = true;

    @FXML
    private void initialize() {
        setupStudentLogin();
        addButtonAnimation(switchButton);
        addButtonAnimation1(loginbutton);
        addButtonAnimation2(teacherLoginButton);
        teacherLoginBox.setVisible(false);
        addFocusAnimations();
        addFocusAnimations1();
    }

    @FXML
    public void handleLoginAction() throws IOException {
        try {
            // Close the current login window
            Stage currentStage = (Stage) loginbutton.getScene().getWindow();
            currentStage.close();

            // Load the new StudentDashboard.fxml file
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("StudentDashboard.fxml"));
            Parent root = fxmlLoader.load();

            // Create a new stage and show the student dashboard
            Stage newStage = new Stage();
            newStage.setTitle("Student Dashboard");
            newStage.setScene(new Scene(root, 800, 600));
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Handle or log the exception (FXML loading or other I/O issues)
        } catch (Exception e) {
            e.printStackTrace();
            // Handle any other exception, e.g. related to the UI or other methods
        }
    }
    @FXML
    public void handleLoginAction1() throws IOException {
        try {
            // Close the current login window
            Stage currentStage = (Stage) teacherLoginButton.getScene().getWindow();
            currentStage.close();

            // Load the new StudentDashboard.fxml file
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TeacherDashboard.fxml"));
            Parent root = fxmlLoader.load();

            // Create a new stage and show the student dashboard
            Stage newStage = new Stage();
            newStage.setTitle("Teacher Dashboard");
            newStage.setScene(new Scene(root, 1000, 600));
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Handle or log the exception (FXML loading or other I/O issues)
        } catch (Exception e) {
            e.printStackTrace();
            // Handle any other exception, e.g. related to the UI or other methods
        }
    }

    @FXML
    private void handleSwitchAction(ActionEvent event) {
        // Create translate transitions for both panes
//        TranslateTransition leftTransition = new TranslateTransition(Duration.millis(500), loginBox);
        TranslateTransition rightTransition = new TranslateTransition(Duration.millis(500), rightBox);

        if (isStudentLogin) {
            // Student to Teacher
//            leftTransition.setByX(300); // Move left pane right
            rightTransition.setByX(-300); // Move right pane left
            PauseTransition delay = new PauseTransition(Duration.millis(400)); // Delay of 300ms
            delay.setOnFinished(e -> teacherLoginBox.setVisible(true));
            delay.play();
            loginBox.setVisible(false);
            setupTeacherLogin();
        } else {
            // Teacher to Student
//            leftTransition.setByX(-300); // Move left pane back to the left
            rightTransition.setByX(300); // Move right pane back to the right
            teacherLoginBox.setVisible(false);
            loginBox.setVisible(true);
            setupStudentLogin();
        }

        // Play both animations simultaneously
//        leftTransition.play();
        rightTransition.play();
    }

    private void setupStudentLogin() {
        PauseTransition pause = new PauseTransition(Duration.millis(250));
        pause.setOnFinished(event -> {
            isStudentLogin = true;
            switchButton.setText("Switch to Teacher Login");
        });
        pause.play(); // Start the delay
    }

    private void setupTeacherLogin() {
        PauseTransition pause = new PauseTransition(Duration.millis(250));
        pause.setOnFinished(event -> {
            isStudentLogin = false;
            switchButton.setText("Switch to Student Login");
        });
        pause.play();
    }

    private void addButtonAnimation(Button button) {
        // Initial button style
        button.setStyle(
                "-fx-background-color: transparent; " +
                        "-fx-border-color: white; " +
                        "-fx-border-width: 1; " +
                        "-fx-text-fill: white; " +
                        "-fx-font-size: 14px; " +
                        "-fx-padding: 10 20; " +
                        "-fx-border-radius: 20; " +
                        "-fx-background-radius: 20;"
        );

        // Hover effect
        button.setOnMouseEntered(event -> {
            button.setStyle(
                    "-fx-background-color: rgba(255, 255, 255, 0.1); " +
                            "-fx-border-color: white; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: white; " +
                            "-fx-font-size: 14px; " +
                            "-fx-padding: 10 20; " +
                            "-fx-border-radius: 20; " +
                            "-fx-background-radius: 20;"
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
                            "-fx-padding: 10 20; " +
                            "-fx-border-radius: 20; " +
                            "-fx-background-radius: 20;"
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
                            "-fx-padding: 10 20; " +
                            "-fx-border-radius: 20; " +
                            "-fx-background-radius: 20;"
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
                            "-fx-padding: 10 20; " +
                            "-fx-border-radius: 20; " +
                            "-fx-background-radius: 20;"
            );
        });
    }
    private void addButtonAnimation1(Button button) {
        // Initial button style
        button.setStyle(
                "-fx-background-color: transparent; " +
                        "-fx-border-color: #40916c; " +
                        "-fx-border-width: 1; " +
                        "-fx-text-fill: #40916c; " +
                        "-fx-font-size: 14px; " +
                        "-fx-padding: 10 20; " +
                        "-fx-border-radius: 20; " +
                        "-fx-background-radius: 20;"
        );

        // Hover effect
        button.setOnMouseEntered(event -> {
            button.setStyle(
                    "-fx-background-color: rgba(255, 255, 255, 0.1); " +
                            "-fx-border-color: #40916c; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: #40916c; " +
                            "-fx-font-size: 14px; " +
                            "-fx-padding: 10 20; " +
                            "-fx-border-radius: 20; " +
                            "-fx-background-radius: 20;"
            );
        });

        // Reset style on mouse exit
        button.setOnMouseExited(event -> {
            button.setStyle(
                    "-fx-background-color: transparent; " +
                            "-fx-border-color: #40916c; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: #40916c; " +
                            "-fx-font-size: 14px; " +
                            "-fx-padding: 10 20; " +
                            "-fx-border-radius: 20; " +
                            "-fx-background-radius: 20;"
            );
        });

        // Click effect
        button.setOnMousePressed(event -> {
            button.setStyle(
                    "-fx-background-color: rgba(255, 255, 255, 0.2); " +
                            "-fx-border-color: #40916c; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: #40916c; " +
                            "-fx-font-size: 14px; " +
                            "-fx-padding: 10 20; " +
                            "-fx-border-radius: 20; " +
                            "-fx-background-radius: 20;"
            );
        });

        // Reset style after click
        button.setOnMouseReleased(event -> {
            button.setStyle(
                    "-fx-background-color: rgba(255, 255, 255, 0.1); " +
                            "-fx-border-color: #40916c; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: #40916c; " +
                            "-fx-font-size: 14px; " +
                            "-fx-padding: 10 20; " +
                            "-fx-border-radius: 20; " +
                            "-fx-background-radius: 20;"
            );
        });
    }
    private void addFocusAnimations() {
        usernameField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                usernameField.setStyle("-fx-border-color: #40916c; -fx-border-width: 1; -fx-background-color: rgba(233, 245, 233, 0.8); -fx-prompt-text-fill: #94b8a0; -fx-font-size: 14px;");
            } else {
                usernameField.setStyle("-fx-border-color: transparent; -fx-background-color: rgba(233, 245, 233, 0.6); -fx-prompt-text-fill: #94b8a0; -fx-font-size: 14px;");
            }
        });

        passwordField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                passwordField.setStyle("-fx-border-color: #40916c; -fx-border-width: 1; -fx-background-color: rgba(233, 245, 233, 0.8); -fx-prompt-text-fill: #94b8a0; -fx-font-size: 14px;");
            } else {
                passwordField.setStyle("-fx-border-color: transparent; -fx-background-color: rgba(233, 245, 233, 0.6); -fx-prompt-text-fill: #94b8a0; -fx-font-size: 14px;");
            }
        });
    }
    private void addFocusAnimations1() {
        teacherUsernameField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                teacherUsernameField.setStyle("-fx-border-color: #40916c; -fx-border-width: 1; -fx-background-color: rgba(233, 245, 233, 0.8); -fx-prompt-text-fill: #94b8a0; -fx-font-size: 14px;");
            } else {
                teacherUsernameField.setStyle("-fx-border-color: transparent; -fx-background-color: rgba(233, 245, 233, 0.6); -fx-prompt-text-fill: #94b8a0; -fx-font-size: 14px;");
            }
        });

        teacherPasswordField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                teacherPasswordField.setStyle("-fx-border-color: #40916c; -fx-border-width: 1; -fx-background-color: rgba(233, 245, 233, 0.8); -fx-prompt-text-fill: #94b8a0; -fx-font-size: 14px;");
            } else {
                teacherPasswordField.setStyle("-fx-border-color: transparent; -fx-background-color: rgba(233, 245, 233, 0.6); -fx-prompt-text-fill: #94b8a0; -fx-font-size: 14px;");
            }
        });
    }
    private void addButtonAnimation2(Button button) {
        // Initial button style
        button.setStyle(
                "-fx-background-color: transparent; " +
                        "-fx-border-color: #40916c; " +
                        "-fx-border-width: 1; " +
                        "-fx-text-fill: #40916c; " +
                        "-fx-font-size: 14px; " +
                        "-fx-padding: 10 20; " +
                        "-fx-border-radius: 20; " +
                        "-fx-background-radius: 20;"
        );

        // Hover effect
        button.setOnMouseEntered(event -> {
            button.setStyle(
                    "-fx-background-color: rgba(255, 255, 255, 0.1); " +
                            "-fx-border-color: #40916c; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: #40916c; " +
                            "-fx-font-size: 14px; " +
                            "-fx-padding: 10 20; " +
                            "-fx-border-radius: 20; " +
                            "-fx-background-radius: 20;"
            );
        });

        // Reset style on mouse exit
        button.setOnMouseExited(event -> {
            button.setStyle(
                    "-fx-background-color: transparent; " +
                            "-fx-border-color: #40916c; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: #40916c; " +
                            "-fx-font-size: 14px; " +
                            "-fx-padding: 10 20; " +
                            "-fx-border-radius: 20; " +
                            "-fx-background-radius: 20;"
            );
        });

        // Click effect
        button.setOnMousePressed(event -> {
            button.setStyle(
                    "-fx-background-color: rgba(255, 255, 255, 0.2); " +
                            "-fx-border-color: #40916c; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: #40916c; " +
                            "-fx-font-size: 14px; " +
                            "-fx-padding: 10 20; " +
                            "-fx-border-radius: 20; " +
                            "-fx-background-radius: 20;"
            );
        });

        // Reset style after click
        button.setOnMouseReleased(event -> {
            button.setStyle(
                    "-fx-background-color: rgba(255, 255, 255, 0.1); " +
                            "-fx-border-color: #40916c; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: #40916c; " +
                            "-fx-font-size: 14px; " +
                            "-fx-padding: 10 20; " +
                            "-fx-border-radius: 20; " +
                            "-fx-background-radius: 20;"
            );
        });
        }

}