package reflexive_agent;

public class Point {
	private int x, y;
	private boolean visited;
	private boolean hasGold;
	private boolean hasHole;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		this.visited = false;
		this.hasHole = false;
		this.hasGold = false;
	}
	public Point(int x, int y, boolean visited, boolean hasGold, boolean hasHole) {
		this.x = x;
		this.y = y;
		this.visited = visited;
		this.hasHole = hasHole;
		this.hasGold = hasGold;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public boolean isHasGold() {
		return hasGold;
	}
	public void setHasGold(boolean hasGold) {
		this.hasGold = hasGold;
	}
	public boolean isHasHole() {
		return hasHole;
	}
	public void setHasHole(boolean hasHole) {
		this.hasHole = hasHole;
	}
	
}
