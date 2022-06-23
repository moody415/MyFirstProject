package Basics;

public class Loops {

    public static void main(String[] args) {

        int i = 5;
        while (i <= 10) { System.out.println(i); i++; //incrementing by 1
        }

        for (int m = 1; m <= 10; m++) {
            System.out.println(m);
        }


        // K-- means k=k-1
        //10 9 8 7 6 5 4 3 2 1
        for (int k = 10; k >= 1; k--) { //initialization, condition, decremental
            System.out.println(k);
        }

//is 10 greater than minus 10? Yes. Then print from minus 10 until you get to 10
        for (int k = 10; k >= -10; k--) { //initialization, condition, decremental
            System.out.println(k);
        }


    }
}


