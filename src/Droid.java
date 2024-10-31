class Droid extends Character{

        //Constructor
        public Droid(String name, int age) {
            super(name, age);
        }

        //Overrides characters method action() with its own action that aligns with Droid
        @Override
        public void action() {
            System.out.println(name + " performs a mechanical task!");
        }
}
