/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

/**
 *
 * @author Jackson
 */
public class minHeap {
    minHeap theHeap;
    Event[] theArray = new Event[10];
    int arrayIndex;
    
    minHeap(){
        theHeap = null;
        theArray = null;
        arrayIndex = 0;
    }
    
    public void add(Event e){
        theArray[arrayIndex] = e;
    }
}
