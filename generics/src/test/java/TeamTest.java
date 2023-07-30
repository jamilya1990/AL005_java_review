public class TeamTest {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");
        //liverpool.addPlayer(joe);
        //liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);

        System.out.println("liverpool.numPlayers() = " + liverpool.numPlayers());

        //Team<String> brokenTeam = new Team<>("BrokenTeam");

    }
}
