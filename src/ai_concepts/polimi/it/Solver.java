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

    public int solverDFS(State initialState){
        return 1;
    }//non visita tutto l'albero


}
