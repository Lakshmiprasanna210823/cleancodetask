package Construction;

public class Cc {

	float calculateCc(String mat,float square_feet)
	{
		System.out.println(square_feet);
		if(mat.equals("standard"))
		{
			System.out.println(square_feet);
			return 1200*square_feet;
		}
		else if(mat.equals("above"))
		{
			return 1500*square_feet;
		}
		else if(mat.equals("high standard"))
		{
			return 1800*square_feet;
		}
		else if(mat.equals("high standard and fully automated home"))
		{
			return 2500*square_feet;
		}
		else {
		return 0;
		}
	}

}
