package ClientOrderApp;

import com.sun.javafx.collections.MappingChange;

import java.util.*;

public class RunApp{
    static Map<Integer, Integer> averageList = new HashMap<>();
    static List<Customer> customerList = new ArrayList<>();
    static Set<Bill> billList = new HashSet<>(100);
    public static void addCustomer(long customerId, String name, long phone, String email, String address, String regisDate, String sector){
        customerList.add(new Customer(customerId, name, phone, email, address, regisDate, sector));
    }

    public static void getAllCustomer(){
        customerList.stream().forEach(customer -> System.out.println("Musteri Id: " + customer.getCustomerId() + " -- Musteri adi: " + customer.getName()));
    }

   /* public static void saveOrder(long customerId, long billId, String billDate, long orderAmount){
        customerList.add(new Bill(customerId,billId,billDate,orderAmount));
    }*/

    public static void addBill(long customerId, String name, long billId, String billDate, long orderAmount){
        billList.add(new Bill(customerId, name, billId, billDate, orderAmount));
        billList.stream();
    }
    public static void getAllBill(){
        billList.stream().forEach(bill -> System.out.println("Musterinin adi: " + bill.getName() + " -- Fatura id: " + bill.getBillId()
                + " -- Fatura tarihi: " + bill.getBillDate() + " -- Siparis ücreti: " + bill.getOrderAmount()));
    }

    public static void orderAmountsHigh(){
       // billList.stream().filter(bill -> bill.getOrderAmount()>1500).forEach(System.out::println);
        billList.stream().forEach(bill -> {
            if (bill.getOrderAmount()>1500)
                System.out.println(bill.getCustomerId()+" ID numarasina sahip musterinin siparis ücreti : " + bill.getOrderAmount());
        });
    }
    public static void orderAmountsLow(){
        System.out.println("500 TL altindaki siparisleri veren musteriler : ");
        billList.stream().forEach(bill -> {
            if (bill.getOrderAmount() < 500)
                System.out.println(bill.getName());
        });
    }
    public static void averageOrderCal(){

        /*long[] dizi = new long[billList.size()];
        System.out.println(billList.size());
        long sum = 0, temp =0;
        long n = 0;
        billList.stream().forEach(bill -> {
            for (int i = 0; i < billList.size(); i++) {
                if (bill.getOrderAmount() > 1500)
                    System.out.println(bill.getOrderAmount());
                    dizi[i] = bill.getOrderAmount();
            }
        });
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]!=0) {
                sum += dizi[i];
                n++;
            }
        }
        temp = sum / n;
        System.out.println("1500 TL uzerindeki faturalarin ortalama hesabi : " + temp);*/
    }

    public static void listClient(){
        billList.stream().forEach(bill -> {
            if (bill.getName().equals("C"))
                System.out.println(bill.getName());
        });

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int choice;
        System.out.println("Siparis uygulamasına hosgeldiniz.\n");
        System.out.print("1.) Yeni Musteri \n");
        System.out.print("2.) Siparis olustur.\n");
        System.out.print("3.) Tüm musterileri listele.\n");
        System.out.print("4.) Tüm faturalari listele.\n");
        System.out.print("5.) 1500 TL uzerindeki fatura listesi.\n");
        System.out.print("6.) 1500 TL uzerindeki faturalarin ortalama hesabi.\n");
        System.out.print("7.) 500 TL altindaki faturalarin musteri isimleri\n");
        System.out.print("8.) Adinda 'C' harfi olan musteri listeleme.\n");
        System.out.print("9.) Haziran ayinda kayit edilen musteri siparis ücret toplamı listele\n");
        System.out.print("10.) Haziran ayi.\n");
        System.out.print("0.) Cikis\n");
        do {

            System.out.print("\nYapmak istediginizi seciniz : ");
            choice = scn.nextInt();


            switch (choice) {

                case 1:
                    System.out.print("Musteri numaranizi giriniz: \n");
                    long id = scn.nextLong();
                    System.out.print("Adinizi giriniz: \n");
                    String name = scn.next();
                    System.out.print("Telefon numaranizi giriniz: \n");
                    long phone = scn.nextLong();
                    System.out.print("email adresinizi giriniz: \n");
                    String email = scn.next();
                    System.out.print("adresinizi giriniz: \n");
                    String address = scn.next();
                    System.out.print("Kayıt tarihinizi giriniz: \n");
                    String regisDate = scn.next();
                    System.out.print("Calistiginiz sektoru giriniz: \n");
                    String sector = scn.next();
                    addCustomer(id,name,phone,email,address,regisDate,sector);
                    System.out.println("Kayit basariyla olusturuldu.");
                    //switch (choice){

                    //}
                    break;

                case 2:
                    System.out.println("Idnizi giriniz :");
                    id = scn.nextLong();
                    System.out.println("Adinizi giriniz: ");
                    name = scn.next();
                    System.out.println("Siparis idnizi giriniz :");
                    long billId = scn.nextLong();
                    System.out.println("Tarih giriniz :");
                    String billDate = scn.next();
                    System.out.println("Sipariş ücreti giriniz :");
                    long orderAmount = scn.nextLong();
                    addBill(id,name,billId,billDate,orderAmount);
                    System.out.println("Siparisinizin faturasi olusturuldu.");
                    break;

                case 3:
                    getAllCustomer();
                    System.out.println();
                    break;

                case 4:
                    getAllBill();
                    System.out.println();
                    break;

                case 5:
                    orderAmountsHigh();
                    System.out.println();
                    break;

                case 6:
                    averageOrderCal();
                    break;

                case 7:
                    orderAmountsLow();
                    System.out.println();
                    break;

                case 8:
                    listClient();
                    System.out.println();
                    break;

                case 9:
                    break;

                case 10:
                    break;

                case 0:
                    System.out.println("Programdan cikis yaptiniz.");
                    break;
                default:
                    System.out.println(choice + " Yanlıs secim. Tekrar deneyiniz.");

            }

        }while (choice != 0);

    }

}
