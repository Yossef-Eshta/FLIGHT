public class Passenger implements Comparable <Passenger> {
    private String passportno;
    private String lastname;
    private char gender;

    public Passenger() {
    }

    public Passenger(String passportno, String lastname, char gender) {
        this.passportno = passportno;
        this.lastname = lastname;
        this.gender = gender;
    }

    public String getPassportno() {
        return passportno;
    }

    public void setPassportno(String passportno) {
        this.passportno = passportno;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return "passport number " + passportno + "  lastname is " + lastname + " Gender is " + gender;
    }

    @Override
    public boolean equals(Object obj) {
        Passenger p = (Passenger) obj;
        return (passportno.equals(p.passportno) && lastname.equals(p.lastname) && gender == p.gender);
    }

    @Override
    public int compareTo(Passenger p) {
        return (this.passportno.compareTo(p.passportno));
    }
}