public class Main {
    public static void main(String[] args) {

        Logger[] loggers ={new DatabaseLogger(), new EmailLogger(),new FileLogger()};


        Customer customer = new Customer(1,"Hüseyin","Çalışkan");
        CustomerManager customerManager = new CustomerManager(loggers);
        customerManager.add(customer);

;
    }
}