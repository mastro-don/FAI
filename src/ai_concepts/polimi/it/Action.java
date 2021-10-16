package ai_concepts.polimi.it;

import n_bricks_solver.polimi.it.StateSevenBricks;

public abstract class  Action{
    private State start;
    private StateSevenBricks startSB;
    private State dest;
    private StateSevenBricks destSB;

    public Action(State start, State dest) {
        this.start = start;
        this.dest = dest;
    }

    public Action(StateSevenBricks start, StateSevenBricks dest) { //disperato bisogno di far funzionare action
        this.start = startSB;
        this.dest = destSB;
    }

    public State getStart() {
        return start;
    }

    public State getDest() {
        return dest;
    }

    public StateSevenBricks getStartSB() {
        return startSB;
    }

    public StateSevenBricks getDestSB() {
        return destSB;
    }
}
