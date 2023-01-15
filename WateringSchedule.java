/** ***************************************************
 *  Name:           Sveinson
 *  Class:          ACS-1904
 * 
 *  Assignment:     Lab 1 Q4
 * 
 *************************************************************/

public class WateringSchedule {

    public static void main(String[] args){
        // ***** constants *******

        // ***** variables *****

        int sw = 0;     // for counting and indexing the plants in the watering array
        
        // parallel arrays for id and name
        int[] id = {1359, 2214, 3439, 6213, 7123, 5588, 7323};
        String[] plantName = {"Beans", "Peppers", "Cacti", "Kelp", "Garlick", "Peas", "Thyme"};
    
        // the list of all plants to be watered on Sunday
        // the trick is to get these plants into consectutive indices
        // starting at 0
        String[] sundayWatering = new String[id.length];

        // ***** Main Processing *****

        /* iterate over the actual size of the id array
         * it looks like we could have used a for-each loop
         * but no, we need i to access the name of the plant
         * with the appropriate id so, for loop it is
         */
        for(int i = 0; i < id.length; i++){
            if(id[i] % 10  == 9 || id[i] % 10 == 8){
                sundayWatering[sw++] = plantName[i];
            }// end if last digit is 8 or 9
        }// end for

        // ***** Print Formatted Output *****

        /* this is not required as part of the answer
         * I inclde it here for completeness
         * note that a for-each won't work because this
         * array is almost certainly ony partially 
         * filled
         */
        System.out.println("Sunday Watering List");
        for(int i = 0; i < sw; i++){
            System.out.println(sundayWatering[i]);
        }//end for i
        
        // ***** Closing Message *****

        System.out.println();
        System.out.println("end of processing");
    } // end main 

} // end FormatTemplate
