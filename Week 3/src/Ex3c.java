public class Ex3c {

    public static void main(String[] args)
    {
        int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = rows; i >= 1; i--) 
                { 
                        for (int j = rows; j < i; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}
    }
    
}
