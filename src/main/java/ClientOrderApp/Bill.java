package ClientOrderApp;

public class Bill extends Customer{
    private long billId;
    private String billDate;
    private long orderAmount;

    public Bill(){

    }
    public Bill(long customerId,String name, long billId, String billDate, long orderAmount) {
        super(customerId,name);
        this.billId = billId;
        this.billDate = billDate;
        this.orderAmount = orderAmount;
    }
    public Bill(long billId, String billDate, long orderAmount) {
        this.billId = billId;
        this.billDate = billDate;
        this.orderAmount = orderAmount;
    }


    public long getBillId() {
        return billId;
    }

    public void setBillId(long billId) {
        this.billId = billId;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public long getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(long orderAmount) {
        this.orderAmount = orderAmount;
    }
}
