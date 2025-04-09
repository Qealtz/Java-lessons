import java.util.*;

public class RemoveString {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        System.out.print("Enter a string: ");
        String word = "";

        word = input.next();

        System.out.print(sentence.replace(word + " ",""));
       

        



        
    }
    
}
