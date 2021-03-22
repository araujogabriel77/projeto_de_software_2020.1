package entities;

import java.util.UUID;

public class Employee {
    private UUID id;
    private String name;
    private String cpf;
    private int link_type;
    private int payment_type;
    private int union_id;
    private double wage;

    public Employee(UUID id, String name, String cpf, int link_type, int payment_type, int union_id, double wage) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.link_type = link_type;
        this.payment_type = payment_type;
        this.union_id = union_id;
        this.wage = wage;
    }

    public String printEmployeeInfo() {
        return "Id: " + this.id + "Name: " + this.name + "\nCPF: " + this.cpf + "\nLink type: " + this.link_type
                + "\nPayment type: " + this.payment_type + "\nUnion: " + this.union_id + "\nSalary: " + this.wage;
    }
}
