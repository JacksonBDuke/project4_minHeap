/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

/**
 *
 * @author Jackson Duke
 */
public class Termination extends Event{
    public Termination(double d){
        timeOfEvent = d;
        eventType = "Termination";
    }
    public double getTime(){
        return timeOfEvent;
    }
}
