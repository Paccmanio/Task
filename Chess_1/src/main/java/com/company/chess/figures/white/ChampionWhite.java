package main.java.com.company.chess.figures.white;


import main.java.com.company.chess.figures.Cell;
import main.java.com.company.chess.figures.Figure;

public class ChampionWhite implements Figure {
    private final Cell position;

    public ChampionWhite(final Cell ps) {
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
        return new ChampionWhite(dest);
    }
}
