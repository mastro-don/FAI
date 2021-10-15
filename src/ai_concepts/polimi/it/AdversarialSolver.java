package ai_concepts.polimi.it;

import ai_concepts.polimi.it.*;

import java.util.List;

public class AdversarialSolver extends Solver {
        private final static int depth = 10;

        public AdversarialSolver(Game currentGame){
           super(currentGame);
        }

        public void solverMinimax(){
            int[] vett = new int[depth];
            for (int i = 0; i< depth; i++) vett[i] = 0;
            List<Action> possibleActions;
            StateAdversarial currentState = getCurrentGame().getCurrentState(); //chiama il programma padre e il programma state
            //é il mio turno.
            possibleActions = currentState.getActions();
            //solverMinimax

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
