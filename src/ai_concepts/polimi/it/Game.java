package ai_concepts.polimi.it;

public class Game {
    private State currentState;

   public void Game(State currentState){
        this.currentState = currentState;
   }

    public State getCurrentState() {
        return currentState;
    }
}
