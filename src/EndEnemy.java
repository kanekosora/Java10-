
public class EndEnemy extends Enemy{
	public EndEnemy(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
		life=5000;
	}
	
	public void move() {
		super.move();
		x=GameWorld.player.x;
		y=300;
	}

	public void draw(MyFrame f) {
		f.setColor(0,0,0);
		f.fillRect(GameWorld.player.x, y, 50, 10);
		for(int i=0; i<20; i++) {
			f.setColor(0,0,0);
		f.fillRect(GameWorld.player.x+20-i, y+i, 5, 5);
		}
		for(int i=0; i<10; i++) {
			f.setColor(0,0,0);
		f.fillRect(GameWorld.player.x+10+i, y+15, 5, 5);
		}
		for(int i=0; i<20; i++) {
			f.setColor(0,0,0);
		f.fillRect(GameWorld.player.x+20-i, y+15+i, 5, 5);
		}
		f.setColor(0,0,0);
		f.fillRect(GameWorld.player.x+7, y+20, 5, 5);
		for(int i=0; i<10; i++) {
			f.setColor(0,0,0);
		f.fillRect(GameWorld.player.x+40-i, y+10+i, 5, 5);
		}
		f.fillRect(GameWorld.player.x+27, y, 8, 40);
		f.fillRect(GameWorld.player.x+30, y+35, 20, 5);
		f.fillRect(GameWorld.player.x+42, y+30, 8, 10);
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
