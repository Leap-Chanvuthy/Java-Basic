public class Ex14 {

    static int helloForloop(){
        for (int i = 0 ; i < 10 ; i++){
            System.out.println("Hello For Loop");
        }
        return 0;
    }
    
    static int helloWhileloop(){
        int i =0;
       while (i != 11){
        System.out.println("Hello While Loop");
        i++;
       }
        return 0;
    }

    static int helloDoWhileloop(){
        int i = 0;
        do{
            System.out.println("Hello Do While Loop");
            i++;

        } while (i !=10);
        
        return 0;
    }
    public static void main (String [] args){
        helloForloop();
        helloWhileloop();
        helloDoWhileloop();
        
    }
    
}
