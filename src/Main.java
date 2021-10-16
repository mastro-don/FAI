import ai_concepts.polimi.it.Action;
import n_bricks_solver.polimi.it.GameSevenBricks;
import n_bricks_solver.polimi.it.SolverSevenBricks;
import n_bricks_solver.polimi.it.StateSevenBricks;

public class Main {
    public static void main(String[] args){
        int Dividi;
        do{
            GameSevenBricks game = new GameSevenBricks(new StateSevenBricks(7);
            SolverSevenBricks s = new SolverSevenBricks(game);
            Action a = s.solverMinimax(game.getCurrentState());
            // Print best action
            ((StateSevenBricks) a.getStart()).print();
            ((StateSevenBricks) a.getDest()).print();
            game.changeCurrentState(a.getDest());

            // My action

            Dividi = System.in.read();



        }while(game.getCurrentState().isGoal());


    }
}
