package entities;

import java.util.UUID;

public class Union {
    UUID id;
    String name;
    float tax;
    int union_type;

    public void createUnion(UUID id, String name, float tax, int union_type) {
        this.id = id;
        this.name = name;
        this.tax = tax;
        this.union_type = union_type;
    }

    public String getUnionInfo() {
        return "Id: " + this.id + "\nName: " + this.name + "\nTax: " + this.tax + "\nUnion type: " + this.union_type;
    }
}
