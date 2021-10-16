package ai_concepts.polimi.it;

import org.jetbrains.annotations.NotNull;

public class Game {
    private State currentState;

    public Game(@NotNull State currentState){
        this.currentState = currentState;
    }

    public State getCurrentState() {
        return this.currentState;
    }

    public void changeCurrentState(State nextState){
        this.currentState = nextState;
    }
}
