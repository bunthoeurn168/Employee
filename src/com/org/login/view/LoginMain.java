package com.org.login.view;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class LoginMain {
	@FXML
	private TextField nameField;
	@FXML
	private PasswordField passwordField;
	public void frmLogin() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(LoginMain.class.getResource("MainLogin.fxml"));
			BorderPane rootLayout = (BorderPane) loader.load();
			Stage loginStage = new Stage();
			Scene scene = new Scene(rootLayout);
			loginStage.setScene(scene);
			loginStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	public void btnLogin(){
		if (nameField.getText().equals("root") && passwordField.getText().equals("123")) {
			System.out.println("Login Success");
		}else{
			System.out.println("Fail Login");
		}
	}
}
