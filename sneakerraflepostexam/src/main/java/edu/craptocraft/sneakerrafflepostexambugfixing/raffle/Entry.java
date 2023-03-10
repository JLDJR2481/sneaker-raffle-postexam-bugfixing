package edu.craptocraft.sneakerrafflepostexambugfixing.raffle;

public class Entry {

    public String email;
    public String userName;
    public String address;
    public Double total = 0d;
    public String payment;
    public Sizes size;

    public Entry() {
    };

    public Entry(String email) {
        this.email = email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotal() {
        return this.total;
    }

    public void payment(String payment) {
        this.payment = payment;
    }

    public String getPayment() {
        return this.payment;
    }

    public String email() {
        return this.email;
    }

    public String payment() {
        return getPayment();
    }

    @Override
    public String toString() {
        StringBuilder entryString = new StringBuilder();

        entryString.append("\n\t\temail: " + email);
        entryString.append("\n\t\tSize: " + size);
        entryString.append("\n\t\tAddress: " + address);
        entryString.append("\n\t\tPayment: " + payment());
        entryString.append("\n\t\tTotal: " + total + " €");

        return entryString.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Entry) {
            return this.email.equals(((Entry) obj).email) || this.payment.equals(((Entry) obj).payment);
        }

        return false;
    }

}
