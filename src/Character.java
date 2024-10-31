public class Character {

    protected String name;
    protected int age;

    //Constructor
    public Character(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Method to print out name and age and cant be overriden by anything else.
    public final void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    //method called action that every character will be able to override with its own action()
    public void action() {
        System.out.println("Character is performing an action");
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
