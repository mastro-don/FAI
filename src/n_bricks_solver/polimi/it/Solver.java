package n_bricks_solver.polimi.it;
package ai_concept.polimi.it

import ai_concepts.polimi.it.Action;

import java.util.List;

public class Solver {
    private Game CurrentGame;

    void public Solver(Game CurrentGame){
        this.CurrentGame = CurrentGame;
    }

    void public SolverMinimax(){
        List<Action> Actions;
        Actions = CurrentGame.getState().getActions();

    }

}
