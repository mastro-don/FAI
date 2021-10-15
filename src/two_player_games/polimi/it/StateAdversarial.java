package two_player_games.polimi.it;

import ai_concepts.polimi.it.Action;
import ai_concepts.polimi.it.Player;
import ai_concepts.polimi.it.State;

import java.util.List;

public class StateAdversarial extends State {
    private Player playerToMove;

    public StateAdversarial() {
        this(Player.PLAYER1);
    }

    public StateAdversarial(Player playerToMove){
        this.playerToMove = playerToMove;
    }

    @Override
    public List<Action> getActions() {
        return null;
    }

    @Override
    public boolean isGoal() {
        return false;
    }

    @Override
    public Player getWinner() {
        return null;
    }

    public Player getPlayerToMove() {
        return playerToMove;
    }
}
