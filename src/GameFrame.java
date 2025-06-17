import java.util.Vector;

public class GameFrame extends MyFrame{		 
	
public void run() {		 
		GameWorld.player=new Player (100,300,0,0);
	addKeyListener(GameWorld.player); // イベントリスナー登録(9章)
	GameWorld.playerBullets=new Vector<PlayerBullet>();
	GameWorld.enemies=new Vector<Enemy>();
	GameWorld.enemies.add(new EnemyBase(100,50,1,0));
	while(true) {		
		clear();			 
		GameWorld.player.draw(this);			 
		GameWorld.player.move();	
		movePlayerBullets();
		moveEnemies();
		checkPlayerAndEnemies();
		checkPlayerBulletsAndEnemies();
		int i=0;
	while(i<GameWorld.playerBullets.size()) {
		PlayerBullet b=GameWorld.playerBullets.get(i);
		b.draw(this);
		b.move();
		if(b.y<0) {
			GameWorld.playerBullets.remove(i);
		}
		else {
			i++;
		}			
	}
	sleep(0.03);
	}
}
public void moveEnemies() {
	for(int i=0; i<GameWorld.enemies.size(); i++) {
		Enemy e=GameWorld.enemies.get(i);
		e.draw(this);
		e.move();
	}
}
public void movePlayerBullets() {			 
		int i=0;	 
		while (i<GameWorld.playerBullets.size()) {	
			PlayerBullet b=GameWorld.playerBullets.get(i);
			b.draw(this);
			b.move();
			if (b.y<0) {
			GameWorld.playerBullets.remove(i);
			} 
			else {
			i++;
			}
		}
}
public void checkPlayerAndEnemies() {
	for (int i=0; i<GameWorld.enemies.size(); i++) {
		Enemy e=GameWorld.enemies.get(i);
		if (checkHit(GameWorld.player,e)) {   //当たり判定
			System.out.println("やられた!");
			GameWorld.player.y=-1000;
		}
	}
}
public void checkPlayerBulletsAndEnemies() {
	int i=0;
	while(i<GameWorld.playerBullets.size()) {
		//プレイヤー弾一つ一つについて、変数bに入れて繰り返し実行する
		PlayerBullet b=GameWorld.playerBullets.get(i);
		int j=0;
		int hits=0;
		while (j<GameWorld.enemies.size()) {
			//敵一つ一つについて、変数に入れて繰り返し実行する
			Enemy e=GameWorld.enemies.get(j);
			//敵eとプレイヤー弾が衝突していたら「あたり」と表示
			if (checkHit(e,b)) {   //当たり判定
				System.out.println("あたり");
				hits++;
				e.life--;
			}
			if(e.life<=0) {
				GameWorld.enemies.remove(j);
			}
			else {
			j++;
			}
		}
		i++;
	}
}
public boolean checkHit(Character a, Character b) { //*A
	if (Math.abs(a.x-b.x)<=5 && Math.abs(a.y-b.y)<=5) { //*B
		return true; //*C
	} else {
		return false; //★D
	}
}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
