import java.util.Scanner;

public class Val {
    public static void main(String[] valerie) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: " );
        String name = sc.nextLine();

        System.out.println("I love you so much " + name);
        System.out.println("Are you interested in marrying him?");
        String father = sc.nextLine();
        while (father.equalsIgnoreCase("yes")) {
            if(father.equalsIgnoreCase("yes")){
                System.out.println("I will love you if you will not stress me out!");
            }else{
                System.out.println("You cant say No or anything else aside from Yes... there is no option here");
            } 
        }
        
        
    }
}