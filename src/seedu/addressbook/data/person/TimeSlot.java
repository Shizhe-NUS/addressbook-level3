package seedu.addressbook.data.person;


import java.util.Scanner;

/*
* This class is used to store modules, and to map each timeslot into the timetable
* */
public class TimeSlot {

    private Module module;
    private boolean isPrivate;
    private int timeTag;
    public TimeSlot (Module module,String timeTag){
        this.module = module;
    }

    public Module getModule(){
        return this.module;
    }

    public int getTimeTag(){
        return this.timeTag;
    }



}
