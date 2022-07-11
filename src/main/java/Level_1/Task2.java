package Level_1;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input Horse position X(horiz) and Y(vertic) and future position: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int fx = in.nextInt();
        int fy = in.nextInt();
       // System.out.print(x+" "+y);
        int px1 = x+1;
        int py1 = y+2;

        int px2 = x+2;
        int py2 = y+1;

        int px3 = x+2;
        int py3 = y-1;

        int px4 = x+1;
        int py4 = y-2;

        int px5 = x-1;
        int py5 = y-2;

        int px6 = x-2;
        int py6 = y-1;

        int px7 = x-2;
        int py7 = y+1;

        int px8 = x-1;
        int py8 = y+2;

        if (fx == px1 && fy == py1 && px1 >= 1 && py1 >= 1 && px1 <= 8 && py1 <= 8){
            System.out.print("position "+ fx + " " + fy + " is real!");
        }
        else if (fx == px2 && fy == py2 && px2 >= 1 && py2 >= 1 && px2 <= 8 && py2 <= 8){
            System.out.print("position "+ fx + " " + fy + " is real!");
        }
        else if (fx == px3 && fy == py3 && px3 >= 1 && py3 >= 1 && px3 <= 8 && py3 <= 8){
            System.out.print("position "+ fx + " " + fy + " is real!");
        }
        else if (fx == px4 && fy == py4 && px4 >= 1 && py4 >= 1 && px4 <= 8 && py4 <= 8){
            System.out.print("position "+ fx + " " + fy + " is real!");
        }
        else if (fx == px5 && fy == py5 && px5 >= 1 && py5 >= 1 && px5 <= 8 && py5 <= 8){
            System.out.print("position "+ fx + " " + fy +" is real!");
        }
        else if (fx == px6 && fy == py6 && px6 >= 1 && py6 >= 1 && px6 <= 8 && py6 <= 8) {
            System.out.print("position "+ fx + " " + fy +  " is real!");
        }
        else if (fx == px7 && fy == py7 && px7 >= 1 && py7 >= 1 && px7 <= 8 && py7 <= 8){
            System.out.print("position "+ fx + " " + fy + " is real!");
        }
        else if (fx == px8 && fy == py8 && px8 >= 1 && py8 >= 1 && px8 <= 8 && py8 <= 8){
            System.out.print("position "+ fx + " " + fy + " is real!");
        }
        else {System.out.print ("Unreal position");}
    }
}
