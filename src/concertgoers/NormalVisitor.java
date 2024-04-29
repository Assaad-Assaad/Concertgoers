package concertgoers;

class NormalVisitor extends Visitor {
    public NormalVisitor(String name) {

        super(name);
    }

    @Override
    public String toString() {

        return "Name: " + getName() + ", Type: Normal";
    }
}

