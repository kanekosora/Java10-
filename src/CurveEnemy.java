
public class CurveEnemy extends Enemy {
	 
	public CurveEnemy (double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		vy+=GameWorld.stage;
		life=3+GameWorld.stage;
	}
	public void move() {
		super.move();
		if(x<GameWorld.player.x) {
			//自分がプレイヤーより左にいたら
			x++;   //右に移動
			y++;
		}
		if(x>GameWorld.player.x) {
			//自分がプレイヤーより右にいたら
			x--;   //左に移動
			y++;
		}
	}
	public void draw(MyFrame f) {
		f.setColor(0, 0, 0);
		f.fillOval(x, y, 30, 30);
		f.setColor(300, 300, 300);
		f.fillOval(x+5, y, 20, 30);
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}