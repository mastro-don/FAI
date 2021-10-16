package n_bricks_solver.polimi.it;

public class ActionSevenBricks /*extends Action */{             //Vedi classe sotto
    private StateSevenBricks start;
    private StateSevenBricks dest;
    public ActionSevenBricks(StateSevenBricks start, StateSevenBricks dest) {
        this.start = start;
        this.dest = dest;
    }
    public StateSevenBricks getStart() {
        return start;
    }

    public StateSevenBricks getDest() {
        return dest;
    }

}
