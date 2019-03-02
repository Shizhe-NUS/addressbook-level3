package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

import java.util.ArrayList;

public class TimeTable {
    public static final String EXAMPLE = "Timetable for " + "Your Name";
    public static final String MESSAGE_MODULE_CONSTRAINTS =
            "Timetable name will be displayed as : " + "Input Users Name";
    public static final String MODULE_VALIDATION_REGEX = "[\\w\\.]+@[\\w\\.]+";
    private Person person;
    private ArrayList<TimeSlot>[][] timeslot;
    public final String value;
    private boolean isPrivate;


    public TimeTable(String personName,boolean isPrivate) throws IllegalValueException{
        this.isPrivate = isPrivate;
        personName = personName.trim();
        if (!Name.isValidName(personName)) {
            throw new IllegalValueException(MESSAGE_MODULE_CONSTRAINTS);
        }
        this.value = personName;
    }

    /*
    * This method is used to create the timetable contains numerous time slot
    *
    * */
    public void creTimeTable(TimeSlot[] timeslot){
        ArrayList[][] creSlot = new ArrayList[7][48];

    }

    public void setSlot(ArrayList<TimeSlot>[][] timeslot,TimeSlot slot){

    }


    public boolean isPrivate() {
        return isPrivate;
    }




}
