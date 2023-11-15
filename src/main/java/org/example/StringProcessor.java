package org.example;


public class StringProcessor {
    public static boolean isStrongPassword(String password){
        boolean isThereUppercase = false;
        boolean isThereLowercase = false;
        boolean isThereInt = false;
        boolean isThereSymbol = false;

        for (int i = 0; i < password.length(); i++){
            char character = password.charAt(i);
            if (character >= 65 && character <= 90){
                isThereUppercase = true;
            }
            if (character >= 97 && character <= 122){
                isThereLowercase = true;
            }
            if (character >= 33 && character <= 47 || character >= 58 && character <= 64){
                isThereSymbol = true;
            }
            if (character >= 48 && character <= 57){
                isThereInt = true;
            }
        }
        return isThereUppercase && isThereInt && isThereLowercase && isThereSymbol;
    }

    public int calculateDigits(String sentence){
        int count = 0;
        for (int i = 0; i < sentence.length(); i++){
            char character = sentence.charAt(i);
            if (character >= 48 && character <= 57){
                count ++;
            }
        }
        return count;
    }

    public int calculateWords(String sentence){

        int count = 0;
        for (int i = 0; i < sentence.length(); i++){
            char character = sentence.charAt(i);
            if (character == ' '){
                count ++;
            }
        }
        if (count == 0){
            return count;
        }
        else{
            return count + 1;
        }


    }

    public double calculateExpression(String expression){
        boolean theFirstIsMinus = expression.charAt(0) == '-';
        String firstString = "";
        String secondString = "";
        char operator = ' ';
        boolean finish = true;
        int i1 = 0;
        if(theFirstIsMinus){
            i1++;
            firstString += '-';
        }
        for (int i = i1; i < expression.length(); i++){
            char character = expression.charAt(i);
            if (character == '+' || character == '-' || character == '/' || character == '*'){
                operator = character;
                finish = false;
                continue;
            }
            if (finish) {
                firstString += character;
            }
            else {
                secondString += character;
            }
        }
        double first = Double.parseDouble(firstString), second = Double.parseDouble(secondString);
        if (operator == '+'){
            return first + second;
        }
        else if (operator == '-'){
            return first - second;
        }
        else if (operator == '/'){
            return first / second;
        }
        else{
            return first * second;
        }

    }
}
