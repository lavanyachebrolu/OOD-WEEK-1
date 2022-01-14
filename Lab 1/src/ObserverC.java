public class ObserverC extends Observer {

	public ObserverC(Ballons ballons) {
		this.ballons = ballons;
		this.ballons.addObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Observer C: Order placed with " + ballons.getCount() + " ballons");
	}
}