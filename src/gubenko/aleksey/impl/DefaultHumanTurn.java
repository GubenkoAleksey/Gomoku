package gubenko.aleksey.impl;

import java.util.Objects;

import gubenko.aleksey.Cell;
import gubenko.aleksey.CellValue;
import gubenko.aleksey.GameTable;
import gubenko.aleksey.HumanTurn;



public class DefaultHumanTurn implements HumanTurn{
	private GameTable gameTable;
	
	@Override
	public void setGameTable(GameTable gameTable) {
		Objects.requireNonNull(gameTable, "Game table can't be null");
		this.gameTable = gameTable;
	}

	@Override
	public Cell makeTurn(int row, int col) {
		gameTable.setValue(row, col, CellValue.HUMAN);
		return new Cell(row, col);
	}
}
