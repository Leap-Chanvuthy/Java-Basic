public class Ex11 {
    
        public static void printArray(int array[][]) {
            for (int row = 0; row < array.length; row++)
            {
                for (int ind = 0; ind < array[row].length; ind++) {
                    System.out.print(array[row][ind] + " ");
                }
                System.out.println();
            }
        }
        public static void main(String args[]) throws Exception {
            int myArr[][] =
                            {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
                printArray(myArr);
        }
}
