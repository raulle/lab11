package it.polito.tdp.bar.model;

public class Model {
	
	public String simula(){
		Simulator sim = new Simulator();
		
		for(int i=0; i<2000; i++) {
			Clienti c = new Clienti("cl"+String.valueOf(i)) ;
			sim.addClienti(c, 8*60 + i * 5);
		}
		
		sim.run();
		
		return "Clienti tot: "+sim.getClientiTot()+"\n"+"Clienti insodd: "+sim.getClientiInsodd()+"\n";
	}

}
