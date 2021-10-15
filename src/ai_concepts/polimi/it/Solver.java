package ai_concepts.polimi.it;

import ai_concepts.polimi.it.Action;
import ai_concepts.polimi.it.Game;
import ai_concepts.polimi.it.State;
import ai_concepts.polimi.it.Player;

import java.util.List;

import static java.lang.System.out;

public class Solver {
    private Game currentGame;

    public Solver(Game currentGame){
        this.currentGame = currentGame;
    }

    public void solverMinimax(){
        List<Action> possibleActions;
        State currentState;
        currentState = currentGame.getCurrentState();
        possibleActions = currentState.getActions();
        //solverMinimax
    }

    public Game getCurrentGame() {
        return currentGame;
    }

    public int solverDFS(State initialState){
        return 1;
    }//non visita tutto l'albero


}
