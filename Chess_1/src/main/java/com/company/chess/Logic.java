package main.java.com.company.chess;

import main.java.com.company.chess.Exception.FigureNotFoundException;
import main.java.com.company.chess.Exception.ImpossibleMoveException;
import main.java.com.company.chess.Exception.OccupiedCellException;
import main.java.com.company.chess.figures.Cell;
import main.java.com.company.chess.figures.Figure;

import java.util.Arrays;

public final class Logic {
    private final Figure[] figures = new Figure[50];
    private int index = 0;

    public void add(Figure figure) {
        figures[index++] = figure;
    }

    public void move(Cell source, Cell dest)
            throws FigureNotFoundException, ImpossibleMoveException, OccupiedCellException {
        int index = findBy(source);
        Cell[] steps = figures[index].way(dest);
        free(steps);
        figures[index] = figures[index].copy(dest);
    }

    private boolean free(Cell[] steps) throws OccupiedCellException {
        return true;
    }

    public void clean() {
        Arrays.fill(figures, null);
        index = 0;
    }

    private int findBy(Cell cell) throws FigureNotFoundException {
        for (int index = 0; index != figures.length; index++) {
            Figure figure = figures[index];
            if (figure != null && figure.position().equals(cell)) {
                return index;
            }
        }
        throw new FigureNotFoundException();
    }
}
