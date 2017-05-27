package it.polito.tdp.bar.model;

import java.util.PriorityQueue;

import it.polito.tdp.bar.model.Event;
import it.polito.tdp.bar.model.Event.EventType;

public class Simulator {
	
	private int numTavoli10=2;
	private int numTavoli8=4;
	private int numTavoli6=4;
	private int numTavoli4=5;
	
	private int PERMANENZA_MIN=60;
	private int PERMANENZA_MAX_NUM=2;
	
	private int clientiTot=0;
	private int clientiSodd=0;
	private int clientiInsodd=0;
	
	private PriorityQueue<Event> queue;

	public Simulator() {
		super();
		this.queue= new PriorityQueue<Event>();
	}
	
	public void addClienti(Clienti c, int time){
		Event e = new Event(c, time, EventType.ARRIVO_GRUPPO_CLIENTI) ;
		queue.add(e);
	}
	
	public void run(){
		while(!queue.isEmpty()){
			Event e = queue.poll();
			switch(e.getType()){
			case ARRIVO_GRUPPO_CLIENTI:
				clientiTot++;
				Clienti c= e.getC();
				int rand= (int)(1+Math.random()*10) ;
				c.setNumPersone(rand);
				double randd= Math.random();
				c.setToll(randd);
				if(rand==1){
					if(randd>0.5)
						clientiSodd++;
					else
						clientiInsodd++;
				}
				if(rand==2){
					if(numTavoli4>0){
						clientiSodd++;
						numTavoli4--;
						c.setTavoloAss(4);
						int durata =this.PERMANENZA_MIN * (int)(1+Math.random()*this.PERMANENZA_MAX_NUM);
						queue.add(new Event(c, e.getTime()+durata, EventType.TAVOLO_LIBERO));
					}
					else{
						if(randd>0.5)
							clientiSodd++;
						else
							clientiInsodd++;
					}
				}
				if(rand==3){
					if(numTavoli4>0){
						clientiSodd++;
						numTavoli4--;
						c.setTavoloAss(4);
						int durata =this.PERMANENZA_MIN * (int)(1+Math.random()*this.PERMANENZA_MAX_NUM);
						queue.add(new Event(c, e.getTime()+durata, EventType.TAVOLO_LIBERO));
					}
					else if(numTavoli6>0){
						clientiSodd++;
						numTavoli6--;
						c.setTavoloAss(6);
						int durata =this.PERMANENZA_MIN * (int)(1+Math.random()*this.PERMANENZA_MAX_NUM);
						queue.add(new Event(c, e.getTime()+durata, EventType.TAVOLO_LIBERO));
					}
					else{
						if(randd>0.5)
							clientiSodd++;
						else
							clientiInsodd++;
					}
				}
				if(rand==4){
					if(numTavoli4>0){
						clientiSodd++;
						numTavoli4--;
						c.setTavoloAss(4);
						int durata =this.PERMANENZA_MIN * (int)(1+Math.random()*this.PERMANENZA_MAX_NUM);
						queue.add(new Event(c, e.getTime()+durata, EventType.TAVOLO_LIBERO));
					}
					else if(numTavoli6>0){
						clientiSodd++;
						numTavoli6--;
						c.setTavoloAss(6);
						int durata =this.PERMANENZA_MIN * (int)(1+Math.random()*this.PERMANENZA_MAX_NUM);
						queue.add(new Event(c, e.getTime()+durata, EventType.TAVOLO_LIBERO));
					}
					else if(numTavoli8>0){
						clientiSodd++;
						numTavoli8--;
						c.setTavoloAss(8);
						int durata =this.PERMANENZA_MIN * (int)(1+Math.random()*this.PERMANENZA_MAX_NUM);
						queue.add(new Event(c, e.getTime()+durata, EventType.TAVOLO_LIBERO));
					}
					else{
						if(randd>0.5)
							clientiSodd++;
						else
							clientiInsodd++;
					}
				}
				if(rand==5 || rand==6){
					if(numTavoli6>0){
						clientiSodd++;
						numTavoli6--;
						c.setTavoloAss(6);
						int durata =this.PERMANENZA_MIN * (int)(1+Math.random()*this.PERMANENZA_MAX_NUM);
						queue.add(new Event(c, e.getTime()+durata, EventType.TAVOLO_LIBERO));
					}
					else if(numTavoli8>0){
						clientiSodd++;
						numTavoli8--;
						c.setTavoloAss(8);
						int durata =this.PERMANENZA_MIN * (int)(1+Math.random()*this.PERMANENZA_MAX_NUM);
						queue.add(new Event(c, e.getTime()+durata, EventType.TAVOLO_LIBERO));
					}
					else if(numTavoli10>0){
						clientiSodd++;
						numTavoli10--;
						c.setTavoloAss(10);
						int durata =this.PERMANENZA_MIN * (int)(1+Math.random()*this.PERMANENZA_MAX_NUM);
						queue.add(new Event(c, e.getTime()+durata, EventType.TAVOLO_LIBERO));
					}
					else{
						if(randd>0.5)
							clientiSodd++;
						else
							clientiInsodd++;
					}
				}
				if(rand==7 || rand==8){
					if(numTavoli8>0){
						clientiSodd++;
						numTavoli8--;
						c.setTavoloAss(8);
						int durata =this.PERMANENZA_MIN * (int)(1+Math.random()*this.PERMANENZA_MAX_NUM);
						queue.add(new Event(c, e.getTime()+durata, EventType.TAVOLO_LIBERO));
					}
					else if(numTavoli10>0){
						clientiSodd++;
						numTavoli10--;
						c.setTavoloAss(10);
						int durata =this.PERMANENZA_MIN * (int)(1+Math.random()*this.PERMANENZA_MAX_NUM);
						queue.add(new Event(c, e.getTime()+durata, EventType.TAVOLO_LIBERO));
					}
					else{
						if(randd>0.5)
							clientiSodd++;
						else
							clientiInsodd++;
					}
				}
				if(rand==9 || rand==10){
					if(numTavoli10>0){
						clientiSodd++;
						numTavoli10--;
						c.setTavoloAss(10);
						int durata =this.PERMANENZA_MIN * (int)(1+Math.random()*this.PERMANENZA_MAX_NUM);
						queue.add(new Event(c, e.getTime()+durata, EventType.TAVOLO_LIBERO));
					}
					else{
						if(randd>0.5)
							clientiSodd++;
						else
							clientiInsodd++;
					}
				}	
				break;
				
			case TAVOLO_LIBERO:
				Clienti cc = e.getC();
				if(cc.getTavoloAss()==4)
					numTavoli4++;
				if(cc.getTavoloAss()==6)
					numTavoli6++;
				if(cc.getTavoloAss()==8)
					numTavoli8++;
				if(cc.getTavoloAss()==10)
					numTavoli10++;
				break;
			}
		}
	}

	public int getClientiTot() {
		return clientiTot;
	}

	public int getClientiSodd() {
		return clientiSodd;
	}

	public int getClientiInsodd() {
		return clientiInsodd;
	}
	
	
}
