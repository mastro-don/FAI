package n_bricks_solver.polimi.it;

import ai_concepts.polimi.it.Game;

public class GameSevenBricks extends Game {
    StateSevenBricks currentState;

    GameSevenBricks(StateSevenBricks currentState){
        this.currentState = currentState;
    }

    public StateSevenBricks getCurrentState() {
        return currentState;
    }
}
