public class IntegerToNumeral {


//    Convert accepts an integer as input and then
//    translates to numeral

    public static String Convert(int input){

        String output = "";

        if(input == 0){
            output = "There is no value for zero";
            return output;
        }


        while(input > 0){

            if(input >= 1000) {
                output = output + "M";
                input = input - 1000;
            }else if(input >= 900) {
                output = output + "DM";
                input = input - 900;
            }else if(input >= 500) {
                output = output + "D";
                input = input - 500;
            }else if(input >= 400) {
                output = output + "CD";
                input = input - 400;
            } else if(input >= 100) {
                output = output + "C";
                input = input - 100;
            }else if(input >= 90) {
                output = output + "XC";
                input = input - 90;
            }else if(input >= 50) {
                output = output + "L";
                input = input - 50;
            }else if(input >= 40) {
                output = output + "XL";
                input = input - 40;
            }else if(input >= 10) {
                output = output + "X";
                input = input - 10;
            }else if(input >= 9) {
                output = output + "IX";
                input = input - 9;
            }else if(input >= 5) {
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
