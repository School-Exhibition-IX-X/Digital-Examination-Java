//Digital Examination
import java.util.*;
public class Digital_Examination {
    public static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter User ID : ");
        String U=in.nextLine();
        System.out.println("Enter Password : ");
        String P=in.nextLine();
        int x=0;
        String arr[]={"1. What is the full form of RAM?","2. What is the full form of CPU?","3. What is the full form of ROM?","4. What is the full form of ALU?"};
        String arr1[]={"1","2","3","4"};
        String arr2[]={"5","6","7","8"};
        String arr3[]={"1","2","3","4"};
        String arr4[]={"5","6","7","8"};
        String arrCA[]={"1","6","3","8"};
        if(U=="ABCD" && P=="1234") {
            System.out.println("Successfully loged in...");
            System.out.println("Enter your name : ");
            String N=in.nextLine();
            System.out.println("Exam Started...");
            for(int i=0; i<4; i++) {
                System.out.println(arr[i]);
                String ans=in.nextLine();
                if(ans==arrCA[i]) {
                    x=x+1;
                    System.out.println("Your answer is correct \n The next level");
                }
            }
            System.out.println("Exam finished!");
            System.out.println("Dear "+N+ " You Scored "+x);
        }
    }
}
