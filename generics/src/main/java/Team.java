import java.util.ArrayList;

public class Team<T extends Player> {

    private String name;

    private ArrayList<T> members = new ArrayList<>();
    public Team(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public boolean addPlayer(T player){
        if (members.contains(player)){
            //System.out.println("Already in the team = " + ((Player)player).getName());
            //no need to cast anymore because we added extends Player to class Team<T extends Player>
            System.out.println("Already in the team = " + player.getName());
            return false;
        }else {
            members.add(player);
            System.out.println(this.name+" picked for the team = " + player.getName());
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }
}
