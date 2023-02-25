package Ex9;
public class Dog {

    public String name;
    public double weight;
    public Dog(){

    }

    public Dog (String name){
        this.name = name;
    }
    public Dog (double weight){
        this.weight = weight;
    }
    public Dog (String name , double weight){
        this.name = name;
        this.weight = weight;
    }
    public String setName (String name){
        return this.name;
    }
    public double setWeight (double weight){
        return this.weight;
    }

    public void getInfo (){
        System.out.println("Dog name is : " + name);
        System.out.println("Dog weight is : " + weight);
    }

}


