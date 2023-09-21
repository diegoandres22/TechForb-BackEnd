package com.techForb.Bank.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Size(min = 1, max = 100, message = "Invalid Length")
    private String sender;

    @NotNull
    @Size(min = 1, max = 100, message = "Invalid Length")
    private String addressee;

    @NotNull
    @Size(min = 1, max = 100, message = "Invalid Length")
    private String date;

    @NotNull
    @Size(min = 1, max = 100, message = "Invalid Length")
    private String amount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String by) {
        this.sender = by;
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String to) {
        this.addressee = to;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

}
