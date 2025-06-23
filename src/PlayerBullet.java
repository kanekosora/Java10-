

public class PlayerBullet extends Character{
	public void draw(MyFrame f) {
		f.setColor(200,0,0);
		f.fillRect(x+10,y,10,10);
	}
	public PlayerBullet(double x,double y,double vx,double vy) {
		//Characterクラスのコンストラクタ(8章)
		super(x,y,vx,vy);
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}