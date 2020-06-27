package MenuServices;

import Beans.Attendee;
import Util.GatherUtil;
import Util.NextOperationAsker;

public class MenuRegisterService extends MenuService {

    private static int numberOfAttendees = 0;
    private static Attendee[] arrayOfAttendee;

    public static int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public static void setNumberOfAttendees(int numberOfAttendees) {
        MenuRegisterService.numberOfAttendees = numberOfAttendees;
    }

    @Override
    public void process() {
        int arraySize = GatherUtil.askGetNumber("how many attendees you will register");
        numberOfAttendees = arraySize;
        Attendee[] attendees = new Attendee[arraySize];
        arrayOfAttendee = attendees;
        for (int i = 0; i < attendees.length; i++) {
            String nameInput = GatherUtil.askGetText((i + 1) + ". name");
            attendees[i] = new Attendee();
            attendees[i].name = nameInput;
        }

        System.out.println("Here is your attendees: ");
        for (int i = 0; i < attendees.length; i++) {
            System.out.println((i + 1) + "." + attendees[i].name);
        }
        NextOperationAsker.askForNextOperation();
    }

    public static String tellWinnerName() {

        return arrayOfAttendee[MenuStartService.winnerInArray].name;
    }
}
