package ai_concepts.polimi.it;

import org.jetbrains.annotations.NotNull;

public enum Player{
    PLAYER1, PLAYER2;

    public boolean equals(@NotNull Player p){
        return this.PLAYER1.ordinal() == p.ordinal();
    }
}
