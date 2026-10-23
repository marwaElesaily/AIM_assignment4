package Task1;

public class Main1 {
    public static void main(String[] args) {

        LoginPage loginPage=new LoginPage("login page");

        loginPage.click();
        loginPage.type();
        System.out.println("isLoaded method from login page "+loginPage.isLoaded());
        System.out.println(loginPage.getText());

        InventoryPage inventoryPage=new InventoryPage("inventoryPage");

        inventoryPage.click();
        inventoryPage.type();
        System.out.println("isLoaded method from inventory page "+inventoryPage.isLoaded());
        System.out.println(inventoryPage.getText());

        CartPage cartPage =new CartPage("CartPage");

        cartPage.click();
        cartPage.type();
        System.out.println("isLoaded method from cartPage"+cartPage.isLoaded());
        System.out.println(cartPage.getText());


    }
}
