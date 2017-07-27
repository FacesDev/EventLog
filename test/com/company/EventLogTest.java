package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by solderedmachd on 7/27/17.
 */
public class EventLogTest {
    Event event = new Event();


    @Before
    public void setUp() throws Exception {
        System.out.println("Beginning the tests");


    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Finished testing");
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void addNullEvent() throws Exception {
        event.name =null;
        event.action = "Face2Face";
        System.out.println("Testing in Progress");
        thrown.expect(IllegalArgumentException.class);
        assertFalse(EventLog.addEvent(event));
    }
    @Test
    public void addNullAction() throws Exception {
        event.name ="This is an action";
        thrown.expect(IllegalArgumentException.class);
        event.action = null;
        System.out.println("Testing in Progress");
        assertFalse(EventLog.addEvent(event));
    }
    @Test
    public void addAllNullAction() throws Exception {
        event.name =null;
        event.action = null;
        thrown.expect(IllegalArgumentException.class);
        System.out.println("Testing in Progress");
        assertFalse(EventLog.addEvent(event));
    }

    @Test
    public void addAction() throws Exception {
        event.name ="Bla";
        event.action = "Face2Face";
        System.out.println("Testing in Progress");
        assertTrue(EventLog.addEvent(event));
    }
    @Test
    public void addPhoneCallAction() throws Exception {
        event.name ="Bla";
        event.action = "PhoneCall";
        System.out.println("Testing in Progress");
        assertTrue(EventLog.addEvent(event));
    }
    @Test
    public void addTextMessagingAction() throws Exception {
        event.name ="Bla";
        event.action = "TextMessaging";
        System.out.println("Testing in Progress");
        assertTrue(EventLog.addEvent(event));
    }
    @Test
    public void addUnknownAction() throws Exception {
        event.name ="Bla";
        event.action = "Unknown";
        System.out.println("Testing in Progress");
        assertTrue(EventLog.addEvent(event));
    }
    @Test
    public void addBlaAction() throws Exception {
        event.name ="Bla";
        event.action = "Bla";
        thrown.expect(AssertionError.class);
        System.out.println("Testing in Progress");
        assertFalse(EventLog.addEvent(event));
    }





}