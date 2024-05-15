public class CustomerManager {


    public void add(Customer customer){
        System.out.println("Müşteri Kaydedildi : " + customer.getCustomerNumber());

    }

    //
    public void addMultiple(Customer[] customers){
        for(Customer customer : customers){
            add(customer);
        }
    }

}
