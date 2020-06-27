package MenuServices;

import Util.GatherUtil;
import Util.Menu;
import Util.NextOperationAsker;


import java.util.Random;

public class MenuStartService extends MenuService {
    public static int winnerInArray =0;
    @Override
    public void process() {
        if (MenuRegisterService.getNumberOfAttendees()==0){
            System.out.println("Please first, register attendees.");
            NextOperationAsker.askForNextOperation();
        }
        int selectedWinner = GatherUtil.askGetNumber("your guess about the winning attendee(with number): ");
        Random random = new Random();
        winnerInArray = random.nextInt(MenuRegisterService.getNumberOfAttendees());
        int realWinner=winnerInArray+1;

        if (selectedWinner == realWinner) {
            System.out.println("Congratulations you won! ");

        }
        else if(selectedWinner> MenuRegisterService.getNumberOfAttendees()){
            System.out.println("You fool, there is not that enough attendees");
        }
        else {
            System.out.println("You lose");
        }
        System.out.println("Real Winner Is: " + realWinner + ".attendee -->> " + MenuRegisterService.tellWinnerName());
        NextOperationAsker.askForNextOperation();


    }
}
