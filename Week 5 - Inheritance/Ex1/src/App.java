public class App {
    public static void main(String[] args) throws Exception {
        Animal a1 = new Animal();
        a1.getInfo();
        System.out.println("===============");
        Animal a2 = new Cat();
        a2.getInfo();
        System.out.println("===============");
        Animal a3 = new Dog();
        a3.getInfo();
        System.out.println("===============");
        Cat c1 = new Cat();
        c1.getInfo();
        System.out.println("===============");
        Dog ad1 = new Dog();
        ad1.getInfo();
        
    }
}
