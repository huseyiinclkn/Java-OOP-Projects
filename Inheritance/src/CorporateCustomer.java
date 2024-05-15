public class CorporateCustomer extends Customer {


    private String companyName;
    private String taxNumber;

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }
}
