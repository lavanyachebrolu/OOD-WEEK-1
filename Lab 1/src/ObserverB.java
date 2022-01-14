public class ObserverB extends Observer {

	public ObserverB(Ballons ballons) {
		this.ballons = ballons;
		this.ballons.addObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Observer B: Order placed with " + ballons.getCount() + " ballons");
	}
}