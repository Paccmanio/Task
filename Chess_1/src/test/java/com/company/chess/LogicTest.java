package test.java.com.company.chess;


import main.java.com.company.chess.Exception.FigureNotFoundException;
import main.java.com.company.chess.Exception.ImpossibleMoveException;
import main.java.com.company.chess.Exception.OccupiedCellException;
import main.java.com.company.chess.Logic;
import main.java.com.company.chess.figures.Cell;
import main.java.com.company.chess.figures.black.BishopBlack;
import org.junit.Ignore;
import org.junit.Test;

public class LogicTest {

    @Ignore
    @Test
    public void move()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H6);
    }
}