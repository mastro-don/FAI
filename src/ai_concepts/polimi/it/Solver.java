package ai_concepts.polimi.it;

import java.util.List;

public class Solver {
    private Game currentGame;

    public Solver(Game currentGame){
        this.currentGame = currentGame;
    }

    public Game getCurrentGame() {
        return currentGame;
    }

    public int solverDFS(State initialState) {//senza ledere di generalità
        if (initialState.isGoal()){
            System.out.println("La mossa migliore è " + initialState );
        }else{
            List<Action> possibleActions = initialState.getActions();
            for (Action a : possibleActions) {
                initialState = a.getDest();
                solverDFS(initialState);
            }
            return 1;
        }   //non visita tutto l'albero
    }

}
