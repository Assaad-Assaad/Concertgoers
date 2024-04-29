package concertgoers;

public class Voucher {
    private final String id;
    private final String name;

    public Voucher(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voucher voucher = (Voucher) o;
        return id.equals(voucher.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }


}

