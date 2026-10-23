package Task1;

public class LoginPage extends BasePage{

    public boolean isLoaded(){
        return true;
    }
    LoginPage(String pageType){
        super(pageType);
    }
    @Override
    protected void click(){
        System.out.println("click method from login page");
    };

    @Override
    protected void type(){
        System.out.println("type method from login page");
    };
    @Override
    protected String getText(){
        return "getText method from login page";
    };
}
