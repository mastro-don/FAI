package n_bricks_solver.polimi.it;

public class GameSevenBricks {
    State currentState;

    GameSevenBricks(State currentState){
        this.currentState = currentState;
    }

    public State getCurrentState() {
        return currentState;
    }
}
