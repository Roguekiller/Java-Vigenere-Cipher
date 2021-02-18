package project.pkg1.code.brantley.cameron;
// Cameron David Brantley
// Project 1
// Last Successful Debugging Date: 2/10/2019

import java.util.Scanner;

public class Project1CodeBrantleyCameron {
    
    public static void main(String[] args){
        String key = "BRANTLEY";
        String message = getMessage();
        System.out.println("Key: " + key);
        
        //Calls the function which encrypts the message.
        System.out.println("Cipher: " + Cipher(message, key) + ".");
    }
    
    //Function used for scanner input of the test cases
    static String getMessage(){
        Scanner input = new Scanner(System.in);
        System.out.print("Message: ");
        String message = input.nextLine();
        return message;
    }
    
    //Function to create the ciphered text
    static String Cipher(String mes, String key){
        String cipherd = "";
        mes = mes.toUpperCase();
        int offset = 0;
        
        //Loops through using an if statement checking if the bounds are 
        //within the respective ASCII Characters. 
        //Viegner Cipher then implemented.
        //Offset set to cause the repeating of the key "BRANTLEY".
        for (int i = 0; i < mes.length(); i++) {
            char ASCII = mes.charAt(i);
            if (ASCII >= 65 && ASCII <= 90){
                int x = ((ASCII + key.charAt(offset) - 2 * 65));
                cipherd += (char)(x % 26 + 65);
                ++offset;
                offset = offset % key.length();
            }
        }
        return cipherd;
    
}
}
