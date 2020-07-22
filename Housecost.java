package Construction;
import java.util.*;

public class Housecost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Want to construct house......? ");
		System.out.format("%s","Available material standards are standard,above standard,high standar,high standard and fully automated");
		System.out.format("%s", "what type of materials do you want to construct your house:" );
		String mat = sc.nextLine();
		float square_feet =sc.nextFloat();
		Cc obj = new Cc();
		float Total = obj.calculateCc(mat,square_feet);
		System.out.format("%s","Total Construction cost is ");
		System.out.format("%f",Total);

	}

}
