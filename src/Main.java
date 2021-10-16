import ai_concepts.polimi.it.Action;
import ai_concepts.polimi.it.State;
import n_bricks_solver.polimi.it.GameSevenBricks;
import n_bricks_solver.polimi.it.Pile;
import n_bricks_solver.polimi.it.SolverSevenBricks;
import n_bricks_solver.polimi.it.StateSevenBricks;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        GameSevenBricks game = new GameSevenBricks(new StateSevenBricks(7));
        SolverSevenBricks s = new SolverSevenBricks(game);
        Action a = s.solverMinimax(game.getCurrentState());

        // Print best action
        ((StateSevenBricks) a.getStart()).print();
        ((StateSevenBricks) a.getDest()).print();
    }
}
