import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		// declaring BufferedReader
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("---------- Bubbly Ballons ----------\n");

		// creating instance of Balloons
		Ballons ballons = new Ballons();

		// adding observers
		new ObserverA(ballons);
		new ObserverB(ballons);
		new ObserverC(ballons);

		// reading count to order
		int count = 0;
		while (true) {
			System.out.print("Enter the number of ballons to order: ");
			count = Integer.parseInt(bufferedReader.readLine());
			if (count > 0) {
				break;
			} else {
				System.out.println("Invalid ballons!");
			}
		}

		// reading the decoration type
		int type = 0;
		while (true) {
			System.out.println("Select the decoration type: \n1. Birthday\n2. Wedding");
			type = Integer.parseInt(bufferedReader.readLine());
			if (type == 1 || type == 2) {
				break;
			} else {
				System.out.println("Invalid type!");
			}
		}

		System.out.println("\n---------------------------------------");

		// switching between the different occasions
		Occasion occasion = null;
		if (type == 1) {
			// decorating with golden frame and then birthday
			occasion = new GoldenFrameDecorator(new Birthday());
		} else if (type == 2) {
			// decorating with golden frame and then wedding
			occasion = new GoldenFrameDecorator(new Wedding());
		}

		// setting the order count and it is observed by different observers
		ballons.setCount(count);

		System.out.println("---------------------------------------\n");
		// invoking decorators to decorate
		occasion.decorate();

		bufferedReader.close();

	}

}
