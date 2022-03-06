package controller;

import java.io.IOException;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import model.Transaction;
import model.TransactionData;

public class FinalController {
	
	@FXML
    private Button agregar;
	
	@FXML
    private TableColumn<Transaction, Date> fecha;

    @FXML
    private TableColumn<Transaction, String> movimiento;

    @FXML
    private TableView<Transaction> tablaDinero;

    @FXML
    private TableColumn<Transaction, Integer> valor;
    
    private Transaction tClicked;
	
    @FXML
	void addNewTransaction(ActionEvent e) throws IOException {
    	tablaDinero.setItems(TransactionData.data);
    	tablaDinero.setOnMouseClicked(event -> {
    		tClicked = tablaDinero.getSelectionModel().getSelectedItem();
			System.out.println(tClicked.getAction());
		});
    	try {
			Pane pane = FXMLLoader.load(getClass().getResource("../application/userWindow.fxml"));
			Scene scene = new Scene(pane,900,700);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			 Stage stage = new Stage();
		        stage.setScene(scene);
		        stage.show();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	

}
