package designClassAndObject.designRestaurant;

public class MenuItem {
    private int menuId;
    private String menuName;
    private double price;
    private boolean veg;

    public MenuItem(int menuId, String menuName, double price, boolean veg){
        this.menuId=menuId;
        this.menuName=menuName;
        this.price=price;
        this.veg=veg;
    }
    public int getMenuId(){
        return menuId;
    }
    public String getMenuName(){
        return menuName;
    }
    public double getPrice(){
        return price;
    }
    public boolean isVeg(){
        return veg;
    }
    public String toString(){
        return " menu Id "+ menuId +
               " menu name " + menuName +
               " price " + price +
                " is veg " + veg;
    }
}
