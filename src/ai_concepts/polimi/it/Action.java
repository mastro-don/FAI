package ai_concepts.polimi.it;

import n_bricks_solver.polimi.it.StateSevenBricks;

public abstract class  Action{
    private StateSevenBricks start;
    private StateSevenBricks dest;

    public Action(State start, State dest) {
        this.start = start;
        this.dest = dest;
    }

    public Action(StateSevenBricks start, StateSevenBricks dest) { //disperato bisogno di far funzionare action
        this.start = start;
        this.dest = dest;
    }

    public State getStart() {
        return start;
    }

    public State getDest() {
        return dest;
    }

}
