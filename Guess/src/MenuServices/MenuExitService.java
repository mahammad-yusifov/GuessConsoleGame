package MenuServices;

public class MenuExitService extends MenuService {
    @Override
    public void process() {
        System.out.println("Thanks for playing, see you again!");
        System.exit(0);
    }
}
