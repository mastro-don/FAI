package ai_concepts.polimi.it;

import n_bricks_solver.polimi.it.StateSevenBricks;

public class Game {
    private State currentState;

    @Override
   public Game Game(State currentState){
        this.currentState = currentState;
    }

    public State getCurrentState() {
        return currentState;
    }
}
