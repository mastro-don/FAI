package ai_concepts.polimi.it;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class Action{
    private State start;
    private State dest;

    public Action(State start, State dest) {
        this.start = start;
        this.dest = dest;
    }

    public State getStart() {
        return start;
    }

    public State getDest() {
        return dest;
    }
}
