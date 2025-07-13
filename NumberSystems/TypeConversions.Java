public class TypeConversions {
    public static void main(String[] args){
        // 1. char to int conversion 
        char ch = '7';
        int num = ch - '0'; // num = 7
        //Why? Because '0' has ASCII value 48, '1' is 49, ..., '9' is 57. //So '7' - '0' = 55 - 48 = 7
        
        // 2. Same logic applies to while converting int to char
        int num = 5;
        char ch = (char) (num + '0'); // ch = '5' // 5 + 48 = 53 which is ASCII value of '5'
        
        // 3. Convert char uppercase to lowercase
        char upper = 'A';
        char lower = (char)(upper + 32); // lower = 'a'
        
        //  3. Convert char lowercase to uppercase
        char lower = 'z';
        char upper = (char)(lower - 32); // upper = 'Z'

        // 4. Convert int to String
        int number = 123;
        String str = Integer.toString(number); // str = "123"
        String str2 = String.valueOf(number); // str2 = "123"

        // 5. Convert String to int
        String strNum = "456789";
        int numberFromString = Integer.parseInt(strNum); // output : "456789"

        //6. Checking if a char is digit
        char c = '6';
        boolean isDigit = c >= '0' && c <= '9';
         
    }
}