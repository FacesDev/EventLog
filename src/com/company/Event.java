package com.company;

/**
 * Created by solderedmachd on 7/27/17.
 */
public class Event {
    public static String name;
    public static String action;

    public Event() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        if(action == "Face2Face" ){
            this.action = action;
        }
        else if(action == "PhoneCall"){
            this.action = action;
        }
        else if (action == "TextMessaging"){
            this.action = action;
        }
        else if (action == "Unknown"){
            this.action = action;
        }
        else {
            throw new AssertionError();
        }

    }


}
