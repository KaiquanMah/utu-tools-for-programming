package fi.utu.kaiquanmah;


// from week4 class
// // following https://gitlab.utu.fi/tools-for-programming/week-4/-/blob/main/first_test.md?ref_type=heads
// public class Calculator {
//     int result;

//     // initialise as 0
//     public Calculator() {
//         this.result = 0;
//     }

//     public int getResult() {
//         return result;
//     }

//     public void add(int number) {
//         result += number;
//     }

//     public void multiply(int number) {
//         result *= number;
//     }

//     // from https://gitlab.utu.fi/tools-for-programming/week-4/-/blob/main/more_tests.md?ref_type=heads
//     // 'incorrect' subtract
//     public void subtract(int number) {
//         result += number;
//     }

// }





// week4 assignment/exercise
// https://gitlab.utu.fi/ertaka/calculator/-/blob/master/Calculator.java?ref_type=heads
// class Calculator {
//     private int result;

//     public Calculator() {
//         reset();
//     }

//     public void reset() {
//         this.result = 0;
//     }

//     public int getResult() {
//         return this.result;
//     }

//     public void add(int value) {
//         this.result += value;
//     }

//     public void subtract(int value) {
//         this.result += value;
//     }

//     public void multiply(int value) {
//         for (int i=1; i<value; i++) {
//             add(value);
//         }
//     }

//     public void exponent(int value) {
//         for(int i=1; i<value; i++) {
//             multiply(value);
//         }
//     }
// }





// week4 assignment/exercise
// fixed 'Calculator'
class Calculator {
    private int result;

    public Calculator() {
        reset();
    }

    public void reset() {
        this.result = 0;
    }

    public int getResult() {
        return this.result;
    }

    public void add(int value) {
        this.result += value;
    }


    // fixed subtract -> '+' to '-'
    public void subtract(int value) {
        this.result -= value;
    }

    // fixed from 'for-loop addition' to multiplication
    public void multiply(int value) {
        // for (int i=1; i<value; i++) {
        //     add(value);
        // }
        this.result *= value;
    }

    // fix for loop
    // from multiplying 'exponent' value 'exponent' times
    // to multiplying 'result' value 'exponent' times
    public void exponent(int value) {
        int startingValue = this.result;
        int intermediateValue = this.result;
        
        for(int i=1; i<value; i++) {
            // multiply(value);

            intermediateValue = intermediateValue * startingValue;
        }
        this.result = intermediateValue;
    }
}

