public class Main {
    public static void main(String[] args) {
        CorporateCustomer huseyin = new CorporateCustomer();
        huseyin.setCustomerNumber("12345");

        IndividualCustomer trendyol = new IndividualCustomer();
        trendyol.setCustomerNumber("56789");

        CustomerManager customerManager = new CustomerManager();
        Customer [] customers={huseyin,trendyol};
        customerManager.addMultiple(customers);

    }
}