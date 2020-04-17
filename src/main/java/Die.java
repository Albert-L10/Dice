import java.util.Scanner;

public class Die {
    // private int[] probabilities;
    int[] probabilities;
    static int sides;

    public Die(int[] probability,int sides)
    {
        this.probabilities=probability;
        this.sides=sides;
    }
   

    public static int roll()
    {
       int value=(int)(Math.random()*sides+1);

        return value;
    }

    public void setProbabilities(int[] probabilities) {
        this.probabilities = probabilities;
        weightedDie();
    }

    public void weightedDie() {

        int value=0;
        int randomNo = (int) Math.random() * 10;
        if(randomNo > 0){
           value=6;
        }else {
            randomNo = (int) Math.random() * 10;
            if (randomNo < 2) value = 1;
            else if (randomNo < 4) value = 2;
            else if (randomNo < 6) value = 3;
            else if (randomNo < 8) value = 4;
            else if (randomNo < 10) value = 5;


        }

    }

   
}
