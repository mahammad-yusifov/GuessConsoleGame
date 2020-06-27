package MenuServices;

public class MenuLogoutService extends MenuService {
    @Override
    public void process() {
        InitialLoginService.menuLogin();
    }
}
