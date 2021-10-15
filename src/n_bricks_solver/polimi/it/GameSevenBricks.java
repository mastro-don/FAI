package n_bricks_solver.polimi.it;

public class GameSevenBricks {
    StateSevenBricks currentState;

    GameSevenBricks(StateSevenBricks currentState){
        this.currentState = currentState;
    }

    public StateSevenBricks getCurrentState() {
        return currentState;
    }
}
