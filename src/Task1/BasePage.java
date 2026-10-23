package Task1;

import java.awt.*;

public abstract class BasePage {


    BasePage(String pageType){
        System.out.println("Page type = "+ pageType);
    }
    public abstract boolean isLoaded();

   protected void click(){
       System.out.println("click method");
   };

    protected void type(){
        System.out.println("type method");
    };

    protected String getText(){
        return "getText method";
    };

}
