package Ex1;
public class Cat {
    private String name;
    public String color;

    public void setName(String name){
        this.name = name;
    }
    public String getName (){
        return this.name;
    }
    public void cry (){
        System.out.println(name + " is crying meow meow !!!");
    }
}

