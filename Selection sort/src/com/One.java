package com;

public class One {
    public static void main(String[] args) {
        // Selection sort : as the name suggest we will be taking an element from the array
        // and will be putting at it's right position or correct position
        // ex array - 4 5 1 2 3
        // WE CAN FOLLOW 2 PROCESS  EITHER 1 OR 2
        // - 1] WE CAN SELECT THE MAX ELEMENT AND PUT AT THE CORRECT INDEX
        // 2] WE CAN SELECT THE MIN ELEMENT AND PUT IT AT THE CORRECT INDEX
        // 1]MAX ELEMENT PROCESS --
        // ARR - 4 5 1 2 3
        // 4 3 1 2 5
        // 2 3 1 4 5
        // 2 1 3 4 5
        // 1 2 3 4 5
        // NEW ARR - 1 2 3 4 5
        // IMPORTANT POINT - in case of the maximum element substitution
        // the sorted array will be at the right side
        // 2] MINIMUM ELEMEMT SUBSTITUTION :
        // ARR - 4 5 1 2 3
        // 1 5 4 2 3
        // 1 2 4 5 3
        // 1 2 3 5 4
        // 1 2 3 4 5 -- ans
        // Important point :  IN CASE OF THE MINIMUM ELEMENT SUBSTITUTION
        // THE SORTED ARRAY WILL BE AT THE LEFT SIDE
        // THE SMALLEST ELEMENT WILL GO TO THE SMALLEST INDEX POSITION 0
        // THE 2ND SMALLEST ELEMENT WILL GO TO THE 2ND SMALLEST INDEX POSITION 1
        // THE 3RD SMALLEST ELEMENT WILL GO TO THE 3RD SMALLEST INDEX POSITION 2

    }
}
