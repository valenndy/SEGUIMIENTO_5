package controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Bank;
import model.Client;

public class Controller {

	@FXML
    private Button entryBtm;

    @FXML
    private TextField passwordText;

    @FXML
    private TextField userText;
	
    private static Bank bank;
    
    public static Bank getBank() {
    	return bank;
    }
    
    public void initialize() {
    	bank = new Bank();
    	bank.getClients().add(new Client("fabiaana", "fabiaana123"));
	}
    
    public void loginUser(ActionEvent event) throws IOException {
		String username = userText.getText();
		String password = passwordText.getText();
		Client c = new Client(username,password);
		
		for(int i = 0; i < bank.getClients().size();i++) {
			if((c.getUser().equalsIgnoreCase(bank.getClients().get(i).getUser())) && 
					c.getPassword().equalsIgnoreCase(bank.getClients().get(i).getPassword())){
				try {
					Pane aP = FXMLLoader.load(getClass().getResource("../application/finalWindow.fxml"));
					Scene scene = new Scene(aP,900,700);
					//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					 Stage stage = new Stage();
				     stage.setScene(scene);
				     stage.show();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}

