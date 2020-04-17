public class Main {
    public static void main(String [] args)
    {
        int[] probabilities={1,1,1,1,1,2};

        Die die=new Die(probabilities,6);



        System.out.println("your die roll return is: "+die.roll());

       die.setProbabilities(probabilities);
       DiceFactory.makeDie();
    }

}
