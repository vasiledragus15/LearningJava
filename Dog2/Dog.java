package Dog2;

public class Dog {
    String name;

    void bark(){
        System.out.println(name + " says Woof Woof!");
    }

    public static void main (String[] args){
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";
        System.out.println("Last dog's name is: " + myDogs[2].name);
        System.out.println("Last dog's name is: " + dog1.name);
        
        int x = 0;
        while (x < myDogs.length){
            myDogs[x].bark();
            x = x + 1;
        }
    }
}
