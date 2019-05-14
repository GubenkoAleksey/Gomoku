package gubenko.aleksey;

import gubenko.aleksey.DataSet;



public interface WinnerResult {

	boolean winnerExists();
	
	DataSet<Cell> getWinnerCells();
}
