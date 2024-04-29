package concertgoers;

import java.util.TreeMap;

public class Concert {
    private final String locationName;
    private final String id;
    private TreeMap<String, String> visitors = new TreeMap<>();

    public Concert(String locationName, String id) {
        this.locationName = locationName;
        this.id = id;
    }

    public void registerVisitor(Visitor visitor, String location) {
        if (visitors.containsKey(visitor.getName())) {
            throw new IllegalArgumentException("Visitor already registered: " + visitor.getName());
        }
        visitors.put(visitor.getName(), location);
    }

    public String searchVisitor(String name) {
        if (!visitors.containsKey(name)) {
            throw new IllegalArgumentException("Visitor not registered: " + name);
        }
        return visitors.get(name);
    }

    public TreeMap<String, String> getVisitors() {
        return visitors;
    }

}

