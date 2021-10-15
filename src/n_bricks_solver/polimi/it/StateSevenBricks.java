package n_bricks_solver.polimi.it;

import ai_concepts.polimi.it.Action;
import ai_concepts.polimi.it.Player;
import ai_concepts.polimi.it.State;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StateSevenBricks extends State{
    private List<Pile> piles;
    private final int minHeight = 2;
    Player playerToMove;

    public StateSevenBricks() {
        this.piles = new ArrayList<>();
        this.playerToMove = Player.PLAYER1;
    }

    public StateSevenBricks(List<Pile> piles, Player playerToMove){
        this.piles = piles;
    }

    @Override
    public List<Action> getActions() {
        List<Action> possibleActions = new ArrayList<>();

        for(int i = piles.size() - 1; i >= 0; i--){
            if(piles.get(i).getHeight() > minHeight){
                // The pile can be splitted
                for(int j = 1; j < (float) piles.get(i).getHeight(); j++){
                    List<Pile> currPiles = new ArrayList<>(piles);
                    int pileHeight = piles.get(i).getHeight();
                    currPiles.remove(i);
                    currPiles.add(new Pile(j));
                    currPiles.add(new Pile(pileHeight - j));
                    possibleActions.add(new Action(this, new StateSevenBricks(currPiles, (this.playerToMove.equals(Player.PLAYER1)?Player.PLAYER2:Player.PLAYER1) )));
                }
            }
        }

        return possibleActions;
    }

    @Override
    public boolean isGoal() {
        for(Pile p : piles){
            if(p.getHeight() > 2) return false;
        }

        return true;
    }

    @Override
    public Player getWinner() {
        if(!this.isGoal()){
            return null;
        }
        else{
            if(this.playerToMove.equals(Player.PLAYER1)){
                return Player.PLAYER2;
            }
            else return Player.PLAYER1;
        }
    }
}
