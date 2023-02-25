public class Ex2 {
    public static void main (String[] args){
        int i , j = 1, x = 0;

        for(i = 1; i <= 100; i++) {
            while(x < 5) {
                System.out.print("  " + j++);
                x++;
            }
            x = 0;
            System.out.println();
        }

    }
}
