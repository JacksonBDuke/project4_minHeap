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
    
    /**
    public class Arrival extends Event{
    private final String eventType = "Arrival";
    public Arrival(double d){
                timeOfEvent = d;
            }
            
            public double getTime(){
                return timeOfEvent;
            }
            
            public void print(){
                System.out.println("Event " + eventType + "\t" + timeOfEvent);
            }
    }
    private class EndOfService extends Event{
        private final String eventType = "EndOfService";


        public EndOfService(double d){
            timeOfEvent = d;
        }

        public double getTime(){
            return timeOfEvent;
        }

        public void print(){
            System.out.println("Event " + eventType + "\t" + timeOfEvent);
        }
    }
    * **
    private class Termination extends Event{
        private final String eventType = "Termination";
        private double timeOfEvent;

        public Termination(double d){
            timeOfEvent = d;
        }
        public double getTime(){
            return timeOfEvent;
        }

        public void print(){
            System.out.println("Event " + eventType + "\t" + timeOfEvent);
        }
    }
    
    public void print(){
        System.out.println("Event " + eventType + "\t" + timeOfEvent);
    }
    * 
    * */
}
