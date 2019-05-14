package gubenko.aleksey;




public interface WinnerChecker {
	
	void setGameTable(GameTable gameTable);

	WinnerResult isWinnerFound(CellValue cellValue);
}
