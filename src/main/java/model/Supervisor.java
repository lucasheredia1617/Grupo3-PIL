package model;

public class Supervisor {
    private int id;
    private String phoneN;
    private String name;
    private String surname;
    private String idZoneInCharge;

    public Supervisor(int id, String phoneN, String name, String surname, String idZoneInCharge) {
        this.id = id;
        this.phoneN = phoneN;
        this.name = name;
        this.surname = surname;
        this.idZoneInCharge = idZoneInCharge;
    }

    public boolean checkCondition(){

        return false;
    }

    @Override
    public String toString() {
        return "\nId: " + id +
                "\nPhone N: " + phoneN +
                "\nname: " + name +
                "\nsurname: " + surname +
                "\nZone in Charge: " + idZoneInCharge;
    }
}
