public class Week4CodingAssignment {
    public static void main(String[] args) {

        /***************************************************************************
         *   Question 1:
         *              Create an int array name ages
         *              create a  new array that is created dynamically
         *              print to ensure length is correct
         *              subtract the first item in the array from the last and print
         *              use a loop to get avg age and print
         ****************************************************************************/


        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        int newAge = ages[ages.length - 1] - ages[0];
        System.out.println(newAge);


        int[] ages1 = new int[ages.length + 1];
        System.out.println(ages1.length);


        int avgAge = 0;

        for (int i = 0; i < ages.length; i++) {
            avgAge += ages[i];
        }
        System.out.println(avgAge / ages.length);


        /***************************************************************************
         *   Question 2:
         *              Create an array called names that contains the following
         *              names: "Sam", "Tommy", "Tim", "Sally", "Buck", "Buck", "Bob"
         *              Part A:
         *              Use a loop to calculate the avg number of letters per name
         *              and print
         *              Part B: Use a loop to concatenate all the names together separated by
         *              Spaces
         ****************************************************************************/
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Buck", "Bob"};

        double avgName = 0.0;
        String concaName = "";

        //using the same loop for both parts A and B
        for (int i = 0; i < names.length; i++) {
            avgName += names[i].length();
            concaName += names[i] + " ";
        }
        System.out.println(avgName / names.length);
        System.out.println(concaName);


        /***************************************************************************
         *   Question 3
         *              How do you access the last element of any array
         ****************************************************************************/

        //with this syntax

        System.out.println(names[names.length - 1]);

        /***************************************************************************
         *   Question 4
         *              How do you access the first element of any array
         *              By access the element at index 0         *
         ****************************************************************************/

        //with this syntax
        System.out.println(names[0]);

        /***************************************************************************
         *   Question 5
         *              Create a new int array named nameLengths
         *              loop over names array and add the length of each nameLength array*
         ****************************************************************************/


        int[] nameLengths = new int[names.length];

        for (int i = 0; i < nameLengths.length; i++) {
            nameLengths[i] = names[i].length();

        }

        /***************************************************************************
         *   Question 6
         *              Loop through nameLengths and calculate the sum of all
         *              the elements. Print results to console
         ****************************************************************************/

        int sumNames = 0;

        for (int i = 0; i < nameLengths.length; i++) {
            sumNames += nameLengths[i];
        }
        System.out.println(sumNames);


    } //End of main

        /***************************************************************************
         *   Question 7
         *              write a method that takes a String "word" and an int "n"
         *              return the word concatenated to itself n times
         ****************************************************************************/

        public static String repeatWord(String word, int n){
            String wording = "";

            for(int i = 0; i <n; i++){
                wording += word;
            }
            return wording;
        }

        /***************************************************************************
         *   Question 8
         *              Write a method that takes two string firstName and lastName
         *              and returns fullName, which should concatenate the two
         *              variables and add a space
         ****************************************************************************/

        public static String fName(String firstName, String lastName){
            String fullName = "";
            fullName = firstName + " " + lastName;
            return fullName;
        }

        /***************************************************************************
         *   Question 9
         *              Write a method that is a boolean and returns true if all the
         *              if the sum of the array passed into arguements is greater than
         *              100
         ****************************************************************************/

        public static boolean centuryMark(int[] numb){
            int counter = 0;
            for (int  i=0; i <numb.length; i++) {
                counter += numb[i];
            }
                if (counter >= 100){ return true;}
            else{
                return false;
            }
        }

    /***************************************************************************
     *   Question 10
     *              write a method that takes a double array and then avg
     *              all the numbers in the array
     ****************************************************************************/

    public static double aveDouble(double[] num){
        double avg = 0.0;
        for (double v : num) {
            avg += v;
        }

        return avg/num.length;
    }

    /***************************************************************************
     *   Question 11
     *              Write a method that takes two double arrays
     *              method will return true if the first array's average is greater
     *              than the second array
     ****************************************************************************/

    public static boolean compareTwo(double[] trueArray, double[] falseArray){
        double firstAvg = 0.0;
        double secondAvg = 0.0;
        for (int i = 0; i<trueArray.length;i++){
            firstAvg += trueArray[i];

        }
        firstAvg = firstAvg / trueArray.length;
        for(int j = 0; j <falseArray.length; j++){
            secondAvg += falseArray[j];
        }
        secondAvg = secondAvg / falseArray.length;

        if(firstAvg > secondAvg){
            return true;

        }else {
            return false;
        }
    }


    /***************************************************************************
     *   Question 12
     *              Create a boolean method that takes:
     *              boolean isHotOutside, moneyInPocket
     *              return true if isHotOutside is true and money in pocket
     *              is greater then 10.50
     ****************************************************************************/

    static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket){

        if(isHotOutside && moneyInPocket >10.50){
            return true;
        }else {
            return false;
        }
    }


    /***************************************************************************
     *   Question 13
     *              Since we didn't have a void method in the exersice my will.
     *               it will be a void method called howMuchPerWeek it will
     *               take in two doubles. the first double will be moneyGoal
     *              the second will be HowMuchYouGot will represent how much money
     *              a person has right now. This method will figure out how much money
     *              a person needs to save weekly for 1 year to achive there goal
     *              and print it to the console
     ****************************************************************************/

    public static void howMuchPerWeek(double moneyGoal, double howMuchYouGot){
        int weeks = 52;
        double amountWeek = 0.0;
        amountWeek = (moneyGoal-howMuchYouGot)/ weeks;

        System.out.printf("Your goal of $"+"%,.2f"+ " can be achieved if weekly you save $" + "%,.2f", moneyGoal, amountWeek);
    }


}