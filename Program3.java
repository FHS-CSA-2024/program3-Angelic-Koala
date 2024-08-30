import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program3 {
    public static void main(String[] args){
        //field
        int length;
        int width;
        int area;
        int perimeter;
        // end field
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = input.nextInt();
        System.out.println();
        System.out.print("Enter the width: ");
        width = input.nextInt();
        System.out.println();
        area = length * width;
        perimeter = 2 * (length + width);
        System.out.println("The Length is: " + length);
        System.out.println("The Width is: " + width);
        System.out.println("The Area is: " + area);
        System.out.println("The Perimeter is: " + perimeter);
    }
}



//Paste console output below:
/*
Enter the length: 37

Enter the width: 26

The Length is: 37
The Width is: 26
The Area is: 962
The Perimeter is: 126
*/
