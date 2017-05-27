package it.polito.tdp.bar.model;

public class TestSim {

	public static void main(String[] args) {
		Simulator sim = new Simulator();
		
		for(int i=0; i<2000; i++) {
			Clienti c = new Clienti("cl"+String.valueOf(i)) ;
			sim.addClienti(c, 8*60 + i * 5);
		}
		
		sim.run();
		
		System.out.println("Clienti tot: "+sim.getClientiTot()+"\n");
		System.out.println("Clienti insodd: "+sim.getClientiInsodd()+"\n");


	}

}
