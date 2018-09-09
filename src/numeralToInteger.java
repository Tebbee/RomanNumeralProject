public class numeralToInteger {
    private static int convertNumerals(char letter){
        switch (letter){
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            case ' ':
                return 0;
            default:
                System.out.println("Please Enter a real Roman Numeral");
                return -1;
        }
    }
    public static int numeralToInteger(String number){
        int converted = 0;
        String upperCaseNumber = number.toUpperCase();
        for(int i = 0; i< upperCaseNumber.length()-1; i++){
            if(convertNumerals(upperCaseNumber.charAt(i))< convertNumerals(upperCaseNumber.charAt(i+1))){
                converted -= convertNumerals(upperCaseNumber.charAt(i));
            }else{
                converted += convertNumerals(upperCaseNumber.charAt(i));
            }
        }
        converted += convertNumerals(upperCaseNumber.charAt(upperCaseNumber.length()-1));
        return converted;

    }
    
}
