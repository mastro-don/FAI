package n_bricks_solver.polimi.it;

import ai_concepts.polimi.it.Action;
import ai_concepts.polimi.it.Player;
import ai_concepts.polimi.it.State;
import two_player_games.polimi.it.StateAdversarial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StateSevenBricks extends StateAdversarial {
    private List<Pile> piles;
    private final int minHeight = 2;

    public StateSevenBricks() {
        super();
        this.piles = new ArrayList<>();
    }

    public StateSevenBricks(int startingHeight){
        this();
        piles.add(new Pile(startingHeight));
    }

    public StateSevenBricks(List<Pile> piles, Player playerToMove){
        super(playerToMove);
        this.piles = piles;
    }

    @Override
    public List<Action> getActions() {
        List<Action> possibleActions = new ArrayList<>();

        for(int i = piles.size() - 1; i >= 0; i--){
            if(piles.get(i).getHeight() > minHeight){
                // The pile can be split
                for(int j = 1; j < (float) piles.get(i).getHeight() / 2.0; j++){
                    List<Pile> currPiles = new ArrayList<>(piles);
                    int pileHeight = piles.get(i).getHeight();
                    currPiles.remove(i);
                    currPiles.add(new Pile(j));
                    currPiles.add(new Pile(pileHeight - j));
                    possibleActions.add(new Action(this, new StateSevenBricks(currPiles, (this.getPlayerToMove().equals(Player.PLAYER1)?Player.PLAYER2:Player.PLAYER1) )));
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
            if(this.getPlayerToMove().equals(Player.PLAYER1)){
                return Player.PLAYER2;
            }
            else return Player.PLAYER1;
        }
    }

    public void print(){
        System.out.print("Piles:\n\t");
        for(Pile p : piles){
            System.out.print(p.getHeight() + " ");
        }
        System.out.print("\n");
    }
}
