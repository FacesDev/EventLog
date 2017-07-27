package com.company;

import java.util.List;

import static com.company.Event.*;

/**
 * Created by solderedmachd on 7/27/17.
 */
public class EventLog {
    private List<Event> eventList;

    public static boolean addEvent(Event event){
        if (event == null || action == null || name == null){
            throw new IllegalArgumentException();
        }
        else {
            System.out.println(event);
            return true;
        }
    }
    public int getNumEvents(){
        return 1;
    }
    public String Eventlog(){
        return "Hu";
    }

}
