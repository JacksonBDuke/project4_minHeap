/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Jackson Duke
 */
public class Handler {
    static Scanner oScan = new Scanner(System.in);
    private static Event event = new Event();
    private static minHeap testHeap = new minHeap();
    private static boolean bDone = false;
    private static boolean bHeapBuilt = false;
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
                    if(!bHeapBuilt){
                        addEvent();
                    }
                    else{
                        System.out.println("Can't add into the heap. Use 'Insert'.");
                    }
                    break;
                    
                //Insert
                case 2:
                    if(bHeapBuilt){
                        insert();
                    }
                    else{
                        System.out.println("Can't insert into the heap. Use build heap first, or use 'Add'.");
                    }
                    break;
                    
                //Print Array
                case 3:
                    printArray();
                    break;
                    
                //Build Heap
                case 4:
                    buildHeap();
                    break;
                    
                //Delete Min
                case 5:
                    deleteMin();
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
    
    public static void addEvent(){
        boolean bDone = true;
        String e;
        double d;
        Event eventToAdd = getEvent();
        
        System.out.println("Event to add...");
        eventToAdd.print();
        testHeap.add(eventToAdd);
        System.out.println("...done.");
    }
    
    public static Event getEvent(){
        boolean bDone = true;
        String e;
        double d;
        Event gotEvent = new Event();
        while(bDone){
            System.out.print("Event type: ");
            e = oScan.nextLine();
            e = e.toUpperCase();
            
            switch(e){
                case "ARRIVAL":
                    System.out.print("Time of event: ");
                    gotEvent= new Arrival(getDouble());
                    bDone = false;
                    break;
                case "ENDOFSERVICE":
                    gotEvent = new EndOfService(getDouble());
                    bDone = false;
                    break;
                case "TERMINATION":
                    gotEvent = new Termination(getDouble());
                    bDone = false;
                    break;
                default:
                    System.out.println("Please enter a valid event type. Your options are 'Arrival' 'EndOfService' and 'Termination'.");
                    break;
            }
        }
        return gotEvent;
    }
    
    public static void insert(){
        testHeap.insert(getEvent());
    }
    
    public static void printArray(){
        testHeap.printArray();
    }
    
    public static void buildHeap(){
        testHeap.buildHeap();
    }
    
    public static void deleteMin(){
        testHeap.deleteMin();
    }
    
    public static int getInt(){
        int i = 0;
        boolean bDone = true;
        while(bDone){
            try{
                i = oScan.nextInt();
                oScan.nextLine();
                bDone = false;
            }
            catch(InputMismatchException e){
                oScan.next();
                System.out.println("Please enter a valid integer.");
                System.out.print(MENU_STRING);
                bDone = true;
            }
        }
        return i;
    }
    
    public static double getDouble(){
        double d = -1.0;
        boolean bDone = true;
        while(bDone){
            try{
                d = oScan.nextDouble();
                oScan.nextLine();
                bDone = false;
            }
            catch(InputMismatchException e){
                oScan.next();
                System.out.println("Please enter a valid decimal number.");
                bDone = true;
            }
        }
        return d;
    }
    
    public static void buildTestHeap(){
        
    }
}
