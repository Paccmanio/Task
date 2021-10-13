package main.java.com.company.chess.figures.black;


import main.java.com.company.chess.figures.Cell;
import main.java.com.company.chess.figures.Figure;

public class WitchBlack implements Figure {
    private final Cell position;

    public WitchBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        return new Cell[] {
                dest
        };
    }

    @Override
    public Figure copy(Cell dest) {
        return new ChampionBlack(dest);
    }
}
