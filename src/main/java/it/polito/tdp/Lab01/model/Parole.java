package it.polito.tdp.Lab01.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parole {
	
    ArrayList<String> elencoParole = new ArrayList<String>();
		
	public Parole() {
		//TODO
	}
	
	public void cancelParola(String p) {
		elencoParole.remove(p);
    	Collections.sort(elencoParole, String.CASE_INSENSITIVE_ORDER);
	}
	
	public void addParola(String p) {
    	elencoParole.add(p);
    	Collections.sort(elencoParole, String.CASE_INSENSITIVE_ORDER);
	}
	
	public List<String> getElenco() {
		return elencoParole;
	}
	
	public void reset() {
		for(String s : elencoParole){
			elencoParole.remove(s);
		}
	}

}