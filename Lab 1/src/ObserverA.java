public class ObserverA extends Observer {

	public ObserverA(Ballons ballons) {
		this.ballons = ballons;
		this.ballons.addObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Observer A: Order placed with " + ballons.getCount() + " ballons");
	}
}