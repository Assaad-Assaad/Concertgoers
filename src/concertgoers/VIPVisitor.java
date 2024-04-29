package concertgoers;

import java.util.HashSet;
import java.util.Set;


class VIPVisitor extends Visitor {
    private Set<Voucher> vouchers = new HashSet<>();

    public VIPVisitor(String name) {

        super(name);
    }

    public void addVoucher(Voucher voucher) {

        vouchers.add(voucher);
    }

    @Override
    public String toString() {

        return "Name: " + getName() + ", Type: VIP";
    }
}

