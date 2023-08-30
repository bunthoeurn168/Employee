package com.org.loign.controller;

import com.org.login.view.LoginMain;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainController extends Application {
	private LoginMain objLogin = new LoginMain();
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Login Form");
		objLogin.frmLogin();
	}

	public static void main(String[] args) {
		launch(args);
	}
}











