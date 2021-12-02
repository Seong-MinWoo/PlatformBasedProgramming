package edu.pnu.admin;
import edu.pnu.collection.GenericList;
import java.util.Objects;

public class FootballClub {
    private String name;
    private final int maxSquadSize = 25;
    private GenericList<Player> squad = new GenericList<Player>();

    public String toString() {
        String msg = "FootballClub Name: " + name + " Player Count: " + squad.size() + "\n";
        for(int i=0; i<squad.size(); i++) {
            msg += squad.get(i) + "\t";
        }
        return msg;
    }

    public Player findPlayer(String firstName, int jerseyNumber) {
        Player target = new Player(firstName, null, jerseyNumber);
        for(int i=0; i<squad.size(); i++) {
            if(squad.get(i).equals(target)) {
                target = squad.get(i);
                return target;
            }
        }

        return null;
    }

    public FootballClub(String name) {
        this.name = name;
    }

    public void addPlayer(Player player) {
        squad.add(player);
    }

    public void removeAllPlayer() {
        GenericList<Player> result = new GenericList<Player>();
        squad = result;
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootballClub that = (FootballClub) o;
        return maxSquadSize == that.maxSquadSize && name.equals(that.name) && squad.equals(that.squad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxSquadSize, squad);
    }
}
