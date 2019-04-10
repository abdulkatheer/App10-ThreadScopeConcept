package beans;

import threads.Thread1;
import threads.Thread2;

public class House {
    private String size;
    private String area;
    private int price;

    public House(){
    }

    public House(String size, String area, int price){
        this.size = size;
        this.area = area;
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void getHouseDetails(){
        System.out.println(Thread1.threadScope.get());
        System.out.println(Thread2.threadScope.get());
    }
    @Override
    public String toString() {
        if(this.getSize() == null){
            return "Sorry, No Data Available in this scope";
        }
        return "House : " + this.getSize();
    }
}
