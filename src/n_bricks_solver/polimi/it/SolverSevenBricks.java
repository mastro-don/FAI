package n_bricks_solver.polimi.it;

import ai_concepts.polimi.it.*;
import two_player_games.polimi.it.AdversarialSolver;

import java.util.List;

public class SolverSevenBricks extends AdversarialSolver {
        private Game currentGame;

        private int limitSolver;

        public SolverSevenBricks(Game currentGame){
            super(currentGame);
        }

        public void solverMinimax(){
            List<Action> possibleActions;
            StateSevenBricks currentState;
            currentState = currentGame.getCurrentState();
            possibleActions = currentState.getActions();
            limitSolver--;
            //solverMinimax
        }

        public int solverDFS(StateSevenBricks initialState){
            Player p = initialState.getPlayerToMove();
            if(initialState.isGoal() && p==initialState.getWinner()){
                System.out.println("La mossa migliore è " StateSevenSolver initialState); //ritorna null/player1/player2!
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
