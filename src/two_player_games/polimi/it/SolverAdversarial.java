package two_player_games.polimi.it;

import ai_concepts.polimi.it.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class SolverAdversarial extends Solver {


    private final static int depth = 10;

    public SolverAdversarial(Game currentGame){
       super(currentGame);
    }


    public Action solverMinimax(@NotNull State currentState){   //sarebbe meglio se ritornasse uno stato!?
        for (Action a: currentState.getActions()) {
            if (solverMinimaxMAX(a.getDest()) == 1) return a;
        }
        return currentState.getActions().get(0); //fare random
    }

    private int solverMinimaxMAX(@NotNull State currentState) {
        List<Action> possibleActions;
        if (currentState.isGoal() && currentState.getWinner().equals(Player.PLAYER1))
            return 1;
        else if(currentState.isGoal() && currentState.getWinner().equals(Player.PLAYER2))
            return -1;
        else
            possibleActions = currentState.getActions();
        //if(currentstate.getPlayerToMove.equals(PLAYER!))...
        int max = -1;
        for (Action a: possibleActions) {
            if(solverMinimaxMIN(a.getDest()) > -1)
                max = solverMinimaxMIN(a.getDest());
        }
        return max;
    }

    private int solverMinimaxMIN(@NotNull State currentState) {
        List<Action> possibleActions;
        if (currentState.isGoal() && currentState.getWinner().equals(Player.PLAYER1))
            return 1;
        else if(currentState.isGoal() && currentState.getWinner().equals(Player.PLAYER2))
            return -1;
        else
            possibleActions = currentState.getActions();
        int max = 1;
        for (Action a: possibleActions) {
            if(solverMinimaxMIN(a.getDest()) < max)
                max = solverMinimaxMIN(a.getDest());
        }
        return max;
    }

    public int alpha_beta_pruning(State initialState){
        }
        return 1;
    }
}
