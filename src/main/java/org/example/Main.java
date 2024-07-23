package org.example;

public class  Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number) {
        int originalNumber= number;
        int reversedNumber= 0;

        while (number != 0 ) {
            int digit = number %10;
            reversedNumber = reversedNumber *10 + digit;
            number /= 10;
        }
      return originalNumber==reversedNumber;
    }

public static boolean isPerfectNumber(int number) {
        int divSum = 0;
        for(int i = 1; i <number;i++){
            if (number % i == 0 ) {
                divSum+= i;
            }
        }
        return number == divSum;
}
public static String numberToWords (int number){
    String output = "";
    if(number < 0){
        return "Invalid Value";
    } else {
        String stringNumber = String.valueOf(number);
        char[] charArray= stringNumber.toCharArray();
        for (int i = 0 ; i < charArray.length ; i++) {
            if(charArray[i]=='0'){
                output += "Zero ";
            }
            else if(charArray[i]=='1'){
                output += "One ";
            }
            else if(charArray[i]=='2'){
                output += "Two ";
            }
            else if(charArray[i]=='3'){
                output += "Three ";
            }
            else if(charArray[i]=='4'){
                output += "Four ";
            }
            else if(charArray[i]=='5'){
                output += "Five ";
            }
            else if(charArray[i]=='6'){
                output += "Six ";
            }
            else if(charArray[i]=='7'){
                output += "Seven ";
            }
            else if(charArray[i]=='8'){
                output += "Eight ";
            }
            else if(charArray[i]=='9'){
                output += "Nine ";
            }
        }

    }
    return output.trim();
}

}






