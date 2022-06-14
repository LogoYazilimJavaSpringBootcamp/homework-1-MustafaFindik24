package ClientOrderApp;

public class Customer implements Tax{

    private long customerId;
    private String name;
    private long phone;
    private String email;
    private String address;
    private String regisDate;
    private String sector;

    public Customer() {

    }

    public Customer(long customerId, String name, long phone, String email, String address, String regisDate, String sector) {

        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.regisDate = regisDate;
        this.sector = sector;
    }

    public Customer(long customerId, String name, String sector) {
        this.customerId = customerId;
        this.name = name;
        this.sector = sector;
    }

    public Customer(long customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerID) {
        this.customerId = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegisDate() {
        return regisDate;
    }

    public void setRegisDate(String regisDate) {
        this.regisDate = regisDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
