package n_bricks_solver.polimi.it;

import ai_concepts.polimi.it.Action;
import ai_concepts.polimi.it.Player;
import two_player_games.polimi.it.StateAdversarial;

import java.util.ArrayList;
import java.util.List;

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

    public StateSevenBricks executeAction(List<Pile> piles){
        this.piles = piles;
        return this;
    }
    /*  In pratica ho pensato di trattare l'input come una serie di numeri separati dagli spazi, un po come viene fuori
     *  l'output la prima prima volta... va bene per n piccole.
     */

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
                    possibleActions.add(new ActionSevenBricks(this, new StateSevenBricks(currPiles, (this.getPlayerToMove().equals(Player.PLAYER1)?Player.PLAYER2:Player.PLAYER1) )));
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
}
