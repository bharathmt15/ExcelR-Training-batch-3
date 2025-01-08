public class Ps003 {
    public static void main(String[] args) {
        Bowler bowler = new Bowler("Bharath", 10, 5, 750, 650);
        bowler.computebowlavg();
        bowler.showstats();
        bowler.computestrikerate();
    }
}

class Bowler {
    String name;
    int wickets;
    int matches;
    int balls_bowled;
    int runs_concede;

    public Bowler() {
        this.name = "";
        this.wickets = 0;
        this.matches = 0;
        this.balls_bowled = 0;
        this.runs_concede = 0;
    }

    public Bowler(String name, int wickets, int matches, int balls_bowled, int runs_concede) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_concede = runs_concede;
    }

    public void computebowlavg() {
        if (validateinputs()) {
            if (wickets > 0) {
                double bowling_avg = (double) runs_concede / wickets;
                System.out.println("name: " + name);
                System.out.println("bowling_avg = " + bowling_avg);
            } else {
                System.out.println("Error");
            }
        }
    }

    public void showstats() {
        if (validateinputs()) {
            System.out.println("name = " + name);
            System.out.println("wickets = " + wickets);
            System.out.println("matches = " + matches);
            System.out.println("balls_bowled = " + balls_bowled);
            System.out.println("runs_conceded = " + runs_concede);
        }
    }

    public void computestrikerate() {
        if (validateinputs()) {
            if (balls_bowled > 0) {
                double strike_rate = (double) balls_bowled / wickets;
                System.out.println("name: " + name);
                System.out.println("Strike_rate = " + strike_rate);
            } else {
                System.out.println("Error");
            }
        }
    }

    private boolean validateinputs() {
        if (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_concede < 0) {
            System.out.println("Error");
            return false;
        }
        if ((runs_concede > 0 || balls_bowled > 0) && matches == 0) {
            System.out.println("Error");
            return false;
        }
        return true;
    }
}
