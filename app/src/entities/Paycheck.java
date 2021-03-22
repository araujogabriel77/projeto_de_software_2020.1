package entities;

import java.util.UUID;

public class Paycheck {
    UUID id;
    float hour_value;
    float worked_hours;
    float taxes;
    double total;
    int employee_id;

    public void createPaycheck(UUID id, float hour_value, float worked_hours, float taxes, double total,
            int employee_id) {
        this.id = id;
        this.hour_value = hour_value;
        this.worked_hours = worked_hours;
        this.taxes = taxes;
        this.total = total;
        this.employee_id = employee_id;
    }

    public String getPaycheckInfo() {
        return "Id: " + this.id + "\nHour value: " + this.hour_value + "\nWorked Hours: " + this.worked_hours
                + "\nTaxes: " + this.taxes + "\nTotal: " + this.total + "\nEmployee id: " + this.employee_id;
    }
}
