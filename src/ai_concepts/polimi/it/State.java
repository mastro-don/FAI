package ai_concepts.polimi.it;

import ai_concepts.polimi.it.Action;

import java.util.List;

public abstract class State {
    public abstract List<Action> getActions();
}
