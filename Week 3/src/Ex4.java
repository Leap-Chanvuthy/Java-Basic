public class Ex4 {
    public static void main(String[] args)
    {
	int a = 5;
        System.out.println("Pattern A :");
        for (int i = 1; i <= a; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        int b = 6;
		System.out.println("Pattern B : ");
		for (int i = b; i >= 1; i--)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
        int c = 6;
		System.out.println("Pattern C : ");
		for (int i = 1; i <= c; i++) 
                {
                        for (int j = c; j >= i; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
    }
}
