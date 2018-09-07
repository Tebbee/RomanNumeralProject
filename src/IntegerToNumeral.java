public class IntegerToNumeral {

    public static String Convert(int input){

        String output = "";

        while(input > 0){

            if(input >= 5) {
                output = output + "V";
                input = input - 5;
            }else if(input >= 4) {
                output = output + "IV";
                input = input - 4;
            }else if(input >= 1){
                output = output + "I";
                input = input - 1;
            }
        }



        return output;
    }


}
