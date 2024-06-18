package models;

import java.time.LocalDateTime;

public class Request {
    private String base_code;
    private String target_code;
    private double amount;
    private double conversion_result;
    private LocalDateTime date;

    public Request(RequestResponse requestResponse, double amount) {
        this.base_code = requestResponse.base_code();
        this.target_code = requestResponse.target_code();
        this.amount = amount;
        this.conversion_result = requestResponse.conversion_result();
        this.date = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Conversión de: " + this.amount + " " +this.base_code +
                "\ta " + this.conversion_result+ " " +this.target_code +
                "\nFecha de la consulta: " + this.date;
    }
}
