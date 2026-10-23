package Task1;

public class InventoryPage extends BasePage{

    public boolean isLoaded(){
        return true;
    }
    InventoryPage(String pageType){
        super(pageType);
    }
    @Override
    protected void click(){
        System.out.println("click method from Inventory page");
    };

    @Override
    protected void type(){
        System.out.println("type method from Inventory page");
    };
    @Override
    protected String getText(){
        return "getText method from Inventory page";
    };
}
