package Basics;

public class ArrayConcepts {
    public static void main(String[] args) {

/*In the following example, you can only store one value per variable. For example, 10
    if you store 20 as the new variable, you would have to call the same variable and assign a new value
    this can get confusing while reading code to find out what is the value of m if it has multiple values listed
    So we use array instead. The values will be listed under the same row and to one variable.*/

        int m = 10;
        m= 20;
        //System.out.println(m);
        //--------------------------------//


        int n[] = new int[5]; // the number of index that will be used is defined here
        n[0] = 10;
        n[1] = 20;
        n[2] = 30;
        n[3] = 40;
        n[4] = 50;



        System.out.println(n[0]);
        System.out.println(n[2]);
        // what happens if you try to print an array with index that isn't there? (Famous interview question)
        // Answer: You will get an exception. ArrayIndexOutOfBoundsException.
        // In line 25, we have declared that we will have only 5 arrays, we cannot fetch the value of an index that doesn't exist.
        //System.out.println(n[5]); // Run this program to see the error(exception) message in the console



        System.out.println(n.length); // size of array
        //print all the value of array: for loop
        // created a variable called k
        // k<n.length means keep looping until less than the size of array. Which is 4. We declared in line 22 that we have 5 arrays
        //however, if you look line 24 to 28 index number goes up to 4 only. So we want to read the values from there
        // k++ means keep incrementing by one until all of the values are printed until index 4


        for(int k = 0; k<n.length; k++){
            System.out.println(n[k]);
        }


        ///------DOUBLE AND STRING------/////
        double d[] = new double[3];
        d[0] = 12.33;
        d[1] = 14.66;
        d[2] = 10.99;
        System.out.println(d[1]);

        String x[] = new String[3];
        x[0] = "Pria";
        x[1] = "Shahin";
        x[2] = "Hasan";


        for (int k = 0; k < x.length; k++) { //Initializing , Condition, Incrementing
            System.out.println(x[k]);
        }

    }
}
