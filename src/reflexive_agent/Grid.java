package reflexive_agent;

public class Grid implements Runnable{
	public final int gridSize = 10;
	private Point[][] grid;

	public Grid() {
		grid = new Point[gridSize][gridSize];
		for (int i = 0; i < gridSize; i++) {
			for (int j = 0; j < gridSize; j++) {
				grid[i][j] = new Point(i, j);
			}
		}	
	}

	public void putHole(int x, int y) {
		grid[x][y].setHasHole(true);
		if (grid[x][y].isHasGold()) {
			grid[x][y].setHasGold(false);
		}
	}

	public void putGold(int x, int y) {
		if (grid[x][y].isHasHole()) {
			return;
		} else {
			grid[x][y].setHasGold(true);
		}
	}
	
	private boolean validate() {
		for(int i = 0; i < gridSize; i++) {
			for(int j = 0; j < gridSize; j++) {
				if(grid[i][j].isHasHole() && grid[i][j].isVisited()) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public void run() {
		while(true) {
			if(!validate()) {
				break;
			}
		}
		System.err.println("Error vaiolate the grid policy");
		System.exit(0);
	}
}
