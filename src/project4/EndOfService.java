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
public class EndOfService extends Event{
    //private final String eventType = "EndOfService";

    public EndOfService(double d){
        timeOfEvent = d;
        eventType = "Termination";
    }

    public double getTime(){
        return timeOfEvent;
    }

    public void print(){
        System.out.println("Event " + eventType + "\t" + timeOfEvent);
    }
}