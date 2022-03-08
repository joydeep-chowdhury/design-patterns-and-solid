package behaviouraldesignpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Programmer {
	private List<Observer> observers = new ArrayList<>();
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		notifyObservers();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
