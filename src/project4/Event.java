/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

import java.text.DecimalFormat;

/**
 *
 * @author Jackson Duke
 */
public class Event {
    Event event;
    public double timeOfEvent;
    public String eventType;
    
    DecimalFormat df = new DecimalFormat("00.00");
    
    public Event(){
        event = null;
    }
    
    public double getDuration(){
        return timeOfEvent;
    }
    
    public void print(){
        System.out.println(eventType + "Event at time " + df.format(timeOfEvent) + ".");
    }
}
