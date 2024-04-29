package concertgoers;

public class Main {
    public static void main(String[] args) {

        Concert concert = new Concert("The Arena", "12345");


        NormalVisitor normalVisitor = new NormalVisitor("Asaad");
        VIPVisitor vipVisitor = new VIPVisitor("Ahmed");
        VIPBackstageVisitor vipBackstageVisitor = new VIPBackstageVisitor("Amer");


        Voucher voucher1 = new Voucher("V001", "Free Drink");
        Voucher voucher2 = new Voucher("V002", "Free T-Shirt");


        vipVisitor.addVoucher(voucher1);
        vipBackstageVisitor.addVoucher(voucher1);
        vipBackstageVisitor.addVoucher(voucher2);


        try {
            concert.registerVisitor(normalVisitor, "Section A, Row 5");
            concert.registerVisitor(vipVisitor, "Section VIP, Row 1");
            concert.registerVisitor(vipBackstageVisitor, "Backstage Area");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        try {
            String location = concert.searchVisitor("Amer");
            System.out.println("Amer is located at: " + location);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        try {
            concert.registerVisitor(vipVisitor, "Section VIP, Row 2");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("All registered visitors:");
        concert.getVisitors().forEach((name, location) -> {
            System.out.println(name + " - " + location);
        });
    }
}

