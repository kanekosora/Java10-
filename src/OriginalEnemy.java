//タンクエネミー
public class OriginalEnemy extends Enemy{
	public OriginalEnemy(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
		life=50; 
		score=50;
	}

	public void move() {
		super.move();
		if(y>GameWorld.player.y) {
			GameWorld.enemies.remove(this); 
			GameWorld.enemies.add(new EndEnemy(x,y,0,GameWorld.stage));
		}
	}
	
	public void draw(MyFrame f) {
		f.setColor(0,0,0);
		f.fillOval(x,y,40,30);
		f.setColor(300,300,300);
		f.fillOval(x+3,y+3,33,25);
		f.setColor(0,0,0);
		f.fillOval(x+10,y,20,30);
		f.setColor(300,300,300);
		f.fillOval(x+12,y+5,10,10);
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
