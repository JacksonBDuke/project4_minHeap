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
    public class Event{
        Event event;
        public Event(){
            event = null;
        }
        public Event(String eT, double tE){
            switch (eT){
                case "Arrival": event = new Arrival(tE);
                    break;
                case "EndOfService": event = new EndOfService(tE);
                    break;
                case "Termination": event = new Termination(tE);
                    break;
                default: event = null;
            }
        }
        private class Arrival extends Event{
            private final String eventType = "Arrival";
            private double timeOfEvent;
            
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
            private double timeOfEvent;
            
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
        
    }
}
