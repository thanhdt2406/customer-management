package model;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class DBUtils {
    public static int ID=0;
    private static List<Customer> list = new ArrayList<>();

    static {
        initData();
    }

    private static void initData(){
        add(new Customer("Do","Thanh","0862628647","Thai Nguyen"));
        add(new Customer("Do","Viet","0869613108","Thai Nguyen"));
        add(new Customer("Nguyen","Dung","0123456789","Nghe An"));
        add(new Customer("Dao","Toan","0987654321","Thai Nguyen"));
        add(new Customer("Nguyen","Thanh","0456789123","Ha Noi"));
    }

    public static void add(Customer customer) {
        list.add(customer);
    }

    public static void edit(Customer customer) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID() == customer.getID()) {
                list.set(i, customer);
            }
        }
    }

    public static void delete(int ID) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID() == ID) {
                list.remove(list.get(i));
            }
        }
    }

    public static List<Customer> getList(){
        return list;
    }

    public static Customer getCustomerByID(int ID){
        for (Customer temp: list){
            if(temp.getID() == ID){
                return temp;
            }
        }
        return null;
    }
}
