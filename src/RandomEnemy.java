
public class RandomEnemy extends Enemy {
	public RandomEnemy (double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		vy+=GameWorld.stage;
		life=2;
	}
	public void move() {
		super.move();
		vx=Math.random()*4-2;
	}
	public void draw(MyFrame f) {
		f.setColor(62, 179, 112);
		f.fillRect(x, y, 10, 20);
		f.fillRect(x+20, y, 10, 20);
		f.fillRect(x+10, y+20, 10, 10);
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}