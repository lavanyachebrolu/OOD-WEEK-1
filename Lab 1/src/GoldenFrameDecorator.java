public class GoldenFrameDecorator extends OccasionDecorator {

	public GoldenFrameDecorator(Occasion decoratedOccasion) {
		super(decoratedOccasion);
	}

	@Override
	public void decorate() {
		decoratedOccasion.decorate();
		setGoldenFrame(decoratedOccasion);
	}

	private void setGoldenFrame(Occasion decoratedOccasion) {
		System.out.println("Frame Color Added: Golden");
	}
}