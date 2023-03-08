package it.polito.tdp.Lab01;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.Lab01.model.Parole;
import it.polito.tdp.Lab01.model.ParoleLista;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnInserisci;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button btncancella;

    @FXML
    private TextField txtParola;
    
    @FXML
    private TextField txtParolaCancella;
    
    @FXML
    private TextArea txtPerformance;

    @FXML
    private TextArea txtResult;
    
    @FXML 
    ParoleLista ppp = new ParoleLista();
    

    @FXML
    void doCancel(ActionEvent event) {
    	long tic = System.nanoTime();

    	ppp.cancelParola(this.txtParolaCancella.getText());
    	
    	this.txtResult.setText("");
    	
    	for(String s : ppp.getElenco()) {
    		this.txtResult.appendText(s + "\n");
    	}
    	long toc = System.nanoTime();
    	
    	this.txtPerformance.appendText("Tempo di Cancella: " + (toc-tic) + "\n");
    }
    
    @FXML
    void doInsert(ActionEvent event) {   
    	
    	long tic = System.nanoTime();
    	
    	ppp.addParola(this.txtParola.getText());
    	
    	this.txtResult.setText("");
    	    	
    	for(String s : ppp.getElenco()) {
    		this.txtResult.appendText(s + "\n");
    	}
    	
    	long toc = System.nanoTime();
    	
    	this.txtPerformance.appendText("Tempo di Inserisci: " + (toc-tic) + "\n");
    	
    }

    @FXML
    void doReset(ActionEvent event) {
    	long tic = System.nanoTime();
    	ppp.reset();
    	this.txtResult.setText(null);
    	long toc = System.nanoTime();
    	
    	this.txtPerformance.appendText("Tempo di Reset: " + (toc-tic) + "\n");
    }

    @FXML
    void initialize() {
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        
        elenco = new Parole() ;
    }

}
