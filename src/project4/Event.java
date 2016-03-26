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
public class Event {
    Event event;
    public double timeOfEvent;
    public String eventType;
    
    public Event(){
        event = null;
    }
    
    public double getDuration(){
        return timeOfEvent;
    }
    
    public void print(){
        System.out.println(eventType + "Event at time " + timeOfEvent + ".");
    }
}
