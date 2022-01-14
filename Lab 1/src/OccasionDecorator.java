public abstract class OccasionDecorator implements Occasion {

	protected Occasion decoratedOccasion;

	public OccasionDecorator(Occasion decoratedOccasion) {
		this.decoratedOccasion = decoratedOccasion;
	}

	public void decorate() {
		decoratedOccasion.decorate();
	}
}