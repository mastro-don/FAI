package n_bricks_solver.polimi.it;

import ai_concepts.polimi.it.Action;

public class ActionSevenBricks extends Action {             //Vedi classe sotto

    private StateSevenBricks start;

    public ActionSevenBricks(StateSevenBricks start, StateSevenBricks dest) {
        super(StateSevenBricks start, StateSevenBricks dest);
    }

    private StateSevenBricks dest;
    public StateSevenBricks getStartSB() {
        return start;
    }

    public StateSevenBricks getDestSB() {
        return dest;
    }

}
