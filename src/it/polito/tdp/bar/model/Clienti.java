package it.polito.tdp.bar.model;

public class Clienti {
	
	private String nome;
	private int numPersone;
	private double toll;
	private int tavoloAss;
	
	public Clienti(String nome) {
		super();
		this.nome=nome;
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getTavoloAss() {
		return tavoloAss;
	}



	public void setTavoloAss(int tavoloAss) {
		this.tavoloAss = tavoloAss;
	}



	public int getNumPersone() {
		return numPersone;
	}
	public void setNumPersone(int numPersone) {
		this.numPersone = numPersone;
	}
	public double getToll() {
		return toll;
	}
	public void setToll(double toll) {
		this.toll = toll;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numPersone;
		long temp;
		temp = Double.doubleToLongBits(toll);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clienti other = (Clienti) obj;
		if (numPersone != other.numPersone)
			return false;
		if (Double.doubleToLongBits(toll) != Double.doubleToLongBits(other.toll))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Clienti [numPersone=" + numPersone + ", toll=" + toll + "]";
	}
	
	

}
