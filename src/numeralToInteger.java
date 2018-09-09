public class numeralToInteger {
//    public final int[] letterValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//    public final String[] numeralList = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static int numeralToInteger(String roman){

        final int[] letterValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] numeralList = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        String error = "You must have entered something wrong, please enter a correct roman numeral";
        for (int i = 0; i<numeralList.length; i++){
            if(roman.startsWith(numeralList[i]))
                return letterValues[i] + numeralToInteger(roman.replaceFirst(numeralList[i], ""));
        }
        System.out.print(error);
        return 0;
    }
    
}
