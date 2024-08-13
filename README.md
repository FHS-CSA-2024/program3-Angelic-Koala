[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/gNIqS1ZK)
# Program 3
(area and width)

## Program Description:  
- Find the area and perimeter of rectangle when the user inputs a length and a width.
- Choose variable names which are meaningful for this problem, like Area, Width, etc.
- Users should be prompted to input values with text


### Statements Required: 
- System.out
- Variable Assignment
- Scanner

### Sample Output:
>Enter the length: 143
>
>Enter the width: 82
>
>-------------
>
>The Length is 143
>
>The width is 82
>
>
>The area is 11726
>
>The perimeter is 450


My code: 

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
