package n_bricks_solver.polimi.it;

import ai_concepts.polimi.it.Action;
import ai_concepts.polimi.it.Game;
import ai_concepts.polimi.it.State;

import java.util.List;

import static java.lang.System.out;

public class Solver {
    private Game currentGame;

    private int limitSolver;

    public Solver(Game currentGame){
        this.currentGame = currentGame;
    }

    public void solverMinimax(){
        List<Action> possibleActions;
        State currentState;
        currentState = currentGame.getCurrentState();
        possibleActions = currentState.getActions();
        limitSolver--;
        //solverMinimax
    }

    public int solverDFS(State initialState){
        Player p = initialState.getPlayerToMove();
        if(initialState.isGoal() && p==initialState.getWinner()){
            System.out.println("La mossa migliore è %s"initialState); //ritorna null/player1/player2!
        }else{
            List<Action> possibleActions = initialState.getActions();

            int i=0;
            for (Action a: possibleActions ) {
                initialState = a.getDest();
                solverDFS(initialState);
            }
        }
        return 1;
    }//non visita tutto l'albero


}
