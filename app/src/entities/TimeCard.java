package entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class TimeCard {
    UUID id;
    LocalDate date;
    LocalTime checkin;
    LocalTime checkout;
    UUID employee_id;

    public void createTimeCard(UUID id, LocalDate date, LocalTime checkin, LocalTime checkout, UUID employee_id) {
        this.id = id;
        this.date = date;
        this.checkin = checkin;
        this.checkout = checkout;
        this.employee_id = employee_id;
    }

    public String getTimeCardInfo() {
        return "Id: " + this.id + "\nDate: " + this.date + "\nCheckin: " + this.checkin + "\nCheckout: " + this.checkout
                + "\nEmployee id: " + this.employee_id;
    }
}
