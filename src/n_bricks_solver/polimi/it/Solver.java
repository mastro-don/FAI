package n_bricks_solver.polimi.it;
package ai_concept.polimi.it

import ai_concepts.polimi.it.Action;
import ai_concepts.polimi.it.Game;

import java.util.List;

public class Solver {
    private Game currentGame;

    void public Solver(Game currentGame){
        this.currentGame = currentGame;
    }

    void public SolverMinimax(){
        List<Action> possibleActions;
        possibleActions = currentGame.getCurrentState().getActions();
    }

}
