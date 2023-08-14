import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String name,bloodgroup;
        String Group="BLUE";
        int age;
        System.out.println("Please Enter your name :");
        name =sc.nextLine();
        System.out.println("Enter your age:");
        age=sc.nextInt();
        System.out.println("Enter your Blood Group:");
        bloodgroup=sc.next();
        if(age>=20){
            Group="RED";
        }
        else if (age>=15 && age<20) {
            Group="BLUE";
        }
        else if (age>10 && age<15) {
            Group="YELLOW";
        }
        else {
            System.out.println("Enter age greater then 10 for generate the id card");
        }


        System.out.println("----------------------------" +
                "\nName : "+name+
                "\nAge : "+age+
                "\nBloodgroup : "+bloodgroup+
                "\n_____________________________"+
                "     \nYOUR GROUP IS "+Group+
                "\n____________________________"
        );



       /* Scanner sc =new Scanner(System.in);
        System.out.println("Enter name ");
        String name =sc.next();
        System.out.println("Hey " +name + "it's my birthday this weekend and you are invited to the party at my place. Bring gifts!!! ");
       */

    }
}
