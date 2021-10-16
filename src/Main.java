import ai_concepts.polimi.it.Action;
import n_bricks_solver.polimi.it.GameSevenBricks;
import n_bricks_solver.polimi.it.SolverSevenBricks;
import n_bricks_solver.polimi.it.StateSevenBricks;

public class Main {
    public static void main(String[] args){

        GameSevenBricks game = new GameSevenBricks(new StateSevenBricks(7));//parametro passato: SI
        SolverSevenBricks s = new SolverSevenBricks(game);                              //Inizializzato il solver.
        Action a;
        do{
            a = s.solverMinimax(game.getCurrentState());
            // Print best action
            System.out.println((StateSevenBricks) a.getStart());
            System.out.println((StateSevenBricks) a.getDest());
            // Execute best action
            game.changeCurrentState( (StateSevenBricks) a.getDest());
            if( !(game.getCurrentState().isGoal()) ){
                // Human action
                int[] vett={5,1,1};
                game.changeCurrentState(game.getCurrentState().executeAction(vett ));
                // Check and repeat
            }
        }while( !(game.getCurrentState().isGoal()) );
    }
}
