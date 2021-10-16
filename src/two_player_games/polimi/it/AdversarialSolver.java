package two_player_games.polimi.it;

import ai_concepts.polimi.it.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AdversarialSolver extends Solver {


    private final static int depth = 10;

    public AdversarialSolver(Game currentGame){
       super(currentGame);
    }


    public Action solverMinimax(@NotNull State currentState){
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

    /*public int solverDFS(State initialState){
        Player p = initialState.getPlayerToMove();
        if(initialState.isGoal() && p==initialState.getWinner()){
            System.out.println("La mossa migliore è ");System.out.println(initialState); //ritorna null/player1/player2!
        }else{
            List<Action> possibleActions = initialState.getActions();

            int i=0;
            for (Action a: possibleActions ) {
                initialState = a.getDest();
                solverDFS(initialState);
            }
        }
        return 1;
    }*/
}
