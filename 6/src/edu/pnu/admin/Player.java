package edu.pnu.admin;
import java.util.Objects;

public class Player {
    private String firstName;
    private String lastName;
    private int jerseyNumber;

    public Player(String firstName, String lastname, int jerseyNumber) {
        this.firstName = firstName;
        this.lastName = lastname;
        this.jerseyNumber = jerseyNumber;
    }

    @Override
    public String toString() {
        return "[" +
                lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase() + " " +
                firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase() + ", " +
                jerseyNumber +
                "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return jerseyNumber == player.jerseyNumber && firstName.equals(player.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, jerseyNumber);
    }


}
