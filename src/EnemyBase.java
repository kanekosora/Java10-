
public class EnemyBase extends Enemy{
	public EnemyBase(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
		life=20+GameWorld.stage; //耐久力20
		score=10;
	}
public void move() {
	super.move();
	if(x>300) {
		vx=-GameWorld.stage;
	}
	if(x<100) {
		vx=GameWorld.stage;
	}
	if(Math.random()<0.01) {
		GameWorld.enemies.add(new DropEnemy(x,y,0,1+GameWorld.stage));
	}
	if(Math.random()<0.01) {
		GameWorld.enemies.add(new CurveEnemy(x,y,vx,GameWorld.stage));
		
	}
	if(Math.random()<0.01) {
		GameWorld.enemies.add(new StraigthEnemy(x,y,0,GameWorld.stage));
	}
	if(Math.random()<0.01) {
		GameWorld.enemies.add(new RandomEnemy(x,y,0,GameWorld.stage));
	}
	if(Math.random()<0.005) {
		GameWorld.enemies.add(new OriginalEnemy(x,y,0,GameWorld.stage));
	}
}
public void draw(MyFrame f) {
	f.setColor(0, 128, 0);
	f.fillOval(x, y, 32, 32);
	f.setColor(200, 200, 200);
	f.fillOval(x-16, y+8, 64, 16);
	//GameWorld.enemies.add(new DropEnemy(x,y,vx,vy));
	//GameWorld.enemies.add(new CurveEnemy(x,y,vx,vy));
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}