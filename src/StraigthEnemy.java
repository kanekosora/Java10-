
public class StraigthEnemy extends Enemy{
	public StraigthEnemy(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
		life=5;
	}
	public void draw(MyFrame f) {
		f.setColor(0, 0, 0);
		f.fillRect(x+8, y, 14, 15);
		f.fillRect(x+10, y+15, 10, 15);
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
