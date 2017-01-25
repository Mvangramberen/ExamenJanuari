package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class QuotesHalen {
	
	// Methode om Quotes uit txt bestand te halen
	public ArrayList<String> getQuotes(){
		
		// Arraylist aanmaken voor Quotes in steken
		 ArrayList<String> aQuotes = new ArrayList<String>() ;
			
	try {
		// Quotes uit TXT halen
	    BufferedReader in = new BufferedReader(new FileReader("/oscar_wilde.txt"));
	    String str;
	    while ((str = in.readLine()) != null){
	    	
	    	// Arraylist opvullen met quotes een voor een
	    	aQuotes.add(str);
	    }
	      
	    // Inputstream sluiten
	    in.close();
	} catch (IOException e) {
		System.out.println("Quotes niet in Arraylist kunnen laden.");;
	}
		
	return aQuotes;
	}

	// Methode om lijst met quotes uit te printen
	public void printQuotes(ArrayList<String> aLijst){
		
		// Maken Iterator
		Iterator<String> arrayListIterator = aLijst.iterator();

		// Uitprinten van de arraylist. 
		while(arrayListIterator.hasNext()){
			System.out.println(arrayListIterator.next());
		}
		
	}
	
	
	// Methode om resultaat van de zoekopdracht terug weer te geven. 
	public ArrayList<String> printGezochteQuote(ArrayList<String> aLijst, String gezochtWoord){
		
		ArrayList<String> aZoekResultaat = new ArrayList<String>();
		for (String curVal : aLijst){
		  if (curVal.contains(gezochtWoord)){
		    aZoekResultaat.add(curVal);
		  }
		}
		return aZoekResultaat;
	}
	
	
}
