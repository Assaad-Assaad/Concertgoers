package concertgoers;


class VIPBackstageVisitor extends VIPVisitor {
    public VIPBackstageVisitor(String name) {

        super(name);
    }

    @Override
    public String toString() {

        return "Name: " + getName() + ", Type: VIP Backstage";
    }
}

