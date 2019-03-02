package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Module {

    public static final String EXAMPLE = "valid Module Name";
    public static final String MESSAGE_MODULE_CONSTRAINTS =
            "MODULE NAME SHOULD START AS 'MODULEC PREFIX' + 'MODULE CODE'";
    public static final String MODULE_VALIDATION_REGEX = "[\\w\\.]+@[\\w\\.]+";
    private String date;
    private String period;
    private String length;
    public final String value;
    private boolean isPrivate;

    public Module(String module,boolean isPrivate) throws IllegalValueException{

        this.isPrivate = isPrivate;
        if (!isValidModule(module)) {
            throw new IllegalValueException(MESSAGE_MODULE_CONSTRAINTS);
        }
        this.value = module;

    }

    public static boolean isValidModule(String test) {

        return test.matches(MODULE_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Module // instanceof handles nulls
                && this.value.equals(((Module) other).value)); // state check
    }

    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public String getLength(){
        return this.length;
    }

    public String getDate(){
        return this.date;
    }

    public String getPeriod(){
        return this.period;
    }



}
