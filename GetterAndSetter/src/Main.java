public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1);
        product.setName("LenovaV15");
        product.setUnitPrice(15000);
        product.setDetail("16 Gb Ram");
        product.setDiscount(10);

        System.out.println(product.getUnitPriceAfterDiscouunt());

        Category category1= new Category();
        category1.setId(1);
        category1.setName("Telefon");

        Category category2 = new Category();
        category2.setId(2);
        category2.setName("Tablet");


        System.out.println(category1.getName());
        System.out.println(category2.getName());




    }
}