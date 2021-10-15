package n_bricks_solver.polimi.it;

import ai_concepts.polimi.it.Action;
import ai_concepts.polimi.it.State;

import java.util.ArrayList;
import java.util.List;

public class StateSevenBricks extends State{
    private List<Pile> piles;
    private final int minHeight = 2;

    public StateSevenBricks() {
        this.piles = new ArrayList<>();
    }

    @Override
    public List<Action> getActions() {
        List<Action> possibleActions = new ArrayList<>();

        for(Pile p : piles){
            if(p.getHeight() > minHeight){

            }
        }
    }
}
