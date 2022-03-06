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
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Bank;
import model.Client;
import model.Transaction;
import model.TransactionData;

public class UserController {
	

    @FXML
    private TextField cantidadText;

    @FXML
    private Button ingresarBtm;

    @FXML
    private Button retirarBtm;

    @FXML
    private Text userText;
    
    
    
    public void makeIngreso(ActionEvent event) throws IOException {
    	int cantidad = Integer.parseInt(cantidadText.getText());
    	Transaction t = new Transaction(cantidad);
    	t.setAction("Ingreso");
    	Controller.getBank().getClients().get(0).getTransactions().add(t);
    	TransactionData.data.add(t);
    	Controller.getBank().getClients().get(0).changeTotal();
    	Stage stage = (Stage) cantidadText.getScene().getWindow();
		stage.close();
    }
    
    public void makeRetiro(ActionEvent event) throws IOException {
    	int cantidad = -Integer.parseInt(cantidadText.getText());
    	Transaction t = new Transaction(cantidad);
    	t.setAction("Retiro");
    	
    	Controller.getBank().getClients().get(0).getTransactions().add(t);
    	TransactionData.data.add(t);
    	Controller.getBank().getClients().get(0).changeTotal();
    	Stage stage = (Stage) cantidadText.getScene().getWindow();
		stage.close();
    	
    }
	
}
