import java.util.ArrayList;
import java.util.List;

public class Ballons {

	private List<Observer> observersList = new ArrayList<Observer>();
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
		notifyObservers();
	}

	public void addObserver(Observer observer) {
		observersList.add(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observersList) {
			observer.update();
		}
	}
}