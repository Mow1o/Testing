// let eka = [1,2,3];
// let toka = [1,4,5,2,7,8,3]




// let length = toka.length;

// if (toka == null || length == 0) {

//     alert('ei toimi')
//     return false;
// }

// for (i = 0; i < length; i++){

//     if (toka[i] == eka) {
//         alert('ei toimii')
//         return true;
//     }
// }

public class ArraySearch {
    public static void main(String args[]) {

        // Declare a new array of 6 elements
        int[] array = new int[6];
        int[] testi = { 1, 2, 3};
        int[] toka = {1, 5, 6, 7, 9, 8};

        // Variable to keep track of the length of the array
        int length = 0;

        // Iterate through the 6 indexes of the Array.
        for (int i = 0; i < 3; i++) {
            // Add a new element and increment the length as well
            toka[length++] = i;
        }

        // Print out the results of searching for 4 and 30.
        System.out.println("Does the array contain the element 3? - " + ArraySearch.linearSearch(toka, length, testi));
        System.out.println("Does the array contain the element 30? - " + ArraySearch.linearSearch(toka, length, 30));

        // Does the array contain the element 4? - true
        // Does the array contain the element 30? - false
    }

    public static boolean linearSearch(int[] toka, int length, int element) {
        // Check for edge cases
        if (toka == null || length == 0) {
            return false;
        }

        // Check each element starting from the first one
        for (int i = 0; i < length; i++) {
            // We found the element at index i, so return true.
            if (toka[i] == element) {
                return true;
            }
        }
        
        // We didn't find the element in the array.
        return false;
    }
}