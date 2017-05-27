package it.polito.tdp.bar.model;

public class Event implements Comparable<Event> {

	public enum EventType{ARRIVO_GRUPPO_CLIENTI,TAVOLO_LIBERO};
	private int time;
	private EventType type;
	private Clienti c;
	
	public Event(Clienti c, int time, EventType type) {
		super();
		this.c=c;
		this.time = time;
		this.type = type;
	}
	
	public Clienti getC() {
		return c;
	}

	public void setC(Clienti c) {
		this.c = c;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public EventType getType() {
		return type;
	}
	
	public void setType(EventType type) {
		this.type = type;
	}

	@Override
	public int compareTo(Event other) {
		return this.time-other.time;
	}

	@Override
	public String toString() {
		return "Event [time=" + time + ", type=" + type + "]";
	}
	
	

}
