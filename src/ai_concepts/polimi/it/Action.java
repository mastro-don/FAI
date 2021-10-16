package ai_concepts.polimi.it;

public class Action{
    private State start;
    private State dest;

    public Action(State start, State dest) {
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
