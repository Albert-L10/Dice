class DiceFactory extends Die {

    public DiceFactory(int[] probability, int sides) {
        super(probability, sides);
    }

    static int  makeDie() {
        return Die.roll();
    }
}