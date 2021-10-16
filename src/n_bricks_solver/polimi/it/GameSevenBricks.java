package n_bricks_solver.polimi.it;

public class GameSevenBricks /*extends Game */{//Cazzo di programmazione a oggetti

    private StateSevenBricks currentState;

    public GameSevenBricks(StateSevenBricks currentState){
        this.currentState = currentState;
    }

    public StateSevenBricks getCurrentState() {
        return currentState;
    }
    public void changeCurrentState(StateSevenBricks nextState) {
        this.currentState = nextState;
    }

}
