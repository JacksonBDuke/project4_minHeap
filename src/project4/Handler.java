/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jackson
 */
public class Handler {
    static Scanner oScan = new Scanner(System.in);
    private static Event event = new Event();
    private static boolean bDone = false;
    private static final String MENU_STRING = "MINHEAP MENU\n\t"+
            "1. Add Event\n\t"+
            "2. Insert\n\t"+
            "3. Print Array\n\t"+
            "4. Build Heap\n\t"+
            "5. Delete Min\n\t"+
            "6. Quit\n\t"+
            "Your choice: ";
    private static final String SELECTION_ERROR = "Please enter a valid selection.\n";
    private static final String MISMATCH_EXCEPTION_STRING = "Please enter your selection in the form of an integer.";
    public static int iInput;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        while (bDone == false){
            iInput = -1;
            System.out.print(MENU_STRING);
            iInput = getInt();
            
            switch(iInput){
                //Add Event
                case 1:
                    
                    break;
                    
                //Insert
                case 2:
                    
                    break;
                    
                //Print Array
                case 3:
                    
                    break;
                    
                //Build Heap
                case 4:
                    
                    break;
                    
                //Delete Min
                case 5:
                    
                    break;
                    
                //Quit
                case 6:
                    bDone = true;
                    break;
                    
                //Build Test Heap
                case 10:
                    buildTestHeap();
                    break;
                    
                default:
                    System.out.println(SELECTION_ERROR);
            }
        }
    }
    
    public static int getInt(){
        int i = 0;
        boolean b = true;
        while(b){
            try{
                i = oScan.nextInt();
                oScan.nextLine();
                b = false;
            }
            catch(InputMismatchException e){
                oScan.next();
                System.out.println("Please enter a valid integer.");
                System.out.print(MENU_STRING);
                b = true;
            }
        }
        return i;
    }
    
    public static double getDouble(){
        double d = -1.0;
        boolean b = true;
        while(b){
            try{
                d = oScan.nextDouble();
                oScan.nextLine();
                b = false;
            }
            catch(InputMismatchException e){
                oScan.next();
                System.out.println("Please enter a valid decimal number.");
                b = true;
            }
        }
        return d;
    }
    
    public static void buildTestHeap(){
        
    }
}
