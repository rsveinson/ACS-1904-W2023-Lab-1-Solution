import java.util.Random;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          ACS-1904
 * 
 *  Assignment:     Lab 1: RemoveMultiples: Q6 
 *************************************************************/

public class RemoveMultiples {

    public static void main(String[] args){
        // ***** constants *******

        final int MAX = 50;     // i like to use a constant to set the upper bound of arrays

        // ***** variables *****

        int[] list = new int[MAX];
        int count;                      // count and index numbers added to the arry
        int n;                          // random number to be added to list
        int multiple;                   // number used to remove multiples

        // ***** objects *****

        Random r = new Random();

        // ***** Load the array *****

        /* some explanaiton of my choice of while loop
         * is needed here
         * my structure eliminates the need for a selection
         * in the body of the loop. A for loop could work but,
         * unless you get the first number pre-loop you
         * need an if(n != 0) in the body
         * A do-while loop requires an if in the body and
         * it doesn't account for the possibility of a 0 
         * being the first of the generated numbers
         */
        count = 0;              // set counter/index to 0
        n = r.nextInt(26);      //random number from 0 to 25

        while(n !=0 && count < MAX){
            //System.out.println(n);

            list[count++] = n;

            // update the loop control
            n = r.nextInt(26);      //random number from 0 to 25
        }// end while

        System.out.println("actual size of array: " + count);
        System.out.println();

        // ***** Remove the multiples *****

        System.out.println("Original list");
        printList(list, count, 3);
        
        // get the number whose multiple should be removed
        multiple = r.nextInt(4) + 1;        // random number from 1-4
        
        // remove all multiples of multiple
        removeMultiplesOfN(list, count, multiple);

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("New list with multiples of " + multiple + " removed.");
        printList(list, count, 3);
        
        // ***** Closing Message *****
        
        System.out.println();
        System.out.println("end of processing");

    } // end main 

    /* method to prin the list 3 values to a line
     * can be re-used
     * the third parameter is the number of values to
     * be printed on a line, could be set to 1
     */
    public static void printList(int[] list, int count, int toALine){
        for(int i = 0; i < count; i++){
            System.out.print(list[i] + " ");

            if((i + 1) % toALine == 0)
                System.out.println();
        }//    
    }// end printlist
    
    /* remove multiples of the parameter n
     * n isn't a great name for this reference
     * so a comment is called for
     * n: int, number whose multiples will be removed from the list
     */
    public static void removeMultiplesOfN(int[] list, int count, int n){
        for(int i = 0; i < count; i++){
            if(list[i] % n == 0){
                list[i] = 0;
            }// end if
        }// end for
        
    }// end remove

} // end FormatTemplate
