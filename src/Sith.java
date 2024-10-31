class Sith extends Character {

    public Sith(String name, int age) {
        super(name, age);
    }
    //Override Superclass Character action with its own characteristisc of Sith
    @Override
    public void action() {
        System.out.println(name + " uses the Dark Side of the Force!");
    }


}
