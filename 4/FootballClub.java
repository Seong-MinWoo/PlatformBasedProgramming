import java.util.ArrayList;
import java.util.Objects;

public class FootballClub {
    private String name;
    private final int maxSquadSize = 25;

    private ArrayList<Player> squad = new ArrayList<Player>();

    public String toString() {
        System.out.println();
        String msg = "FootballClub Name: " + name + " Player Count: " + squad.size() + "\n";
        for(int i=0; i<squad.size(); i++) {
            msg +="\t" + squad.get(i) + "\n";
        }
        return msg;
    }

    public Player findPlayer(String firstName, int jerseyNumber) {
        System.out.println();
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
        System.out.println();
    }

    public void removeAllPlayer() {
        squad.clear();
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
