class Jedi extends Character {
    //Constructor
    public Jedi(String name, int age) {
        super(name, age);
    }
    //Overrides characters action with its own action for Jedi
    @Override
    public void action() {
        System.out.println(name + " uses the Force for good!");
    }
}
