
public class Items {
	int bluntironshortsword = 1;
	int novicebow = 2;
	int novicestaffid = 3;
	
	//item stats
	static int addedplayermelee = 0;
	static int addedplayerhealth = 0;
	static int addedplayermarksmanship = 0;
	static int addedplayerspellpower = 0;
	static int addedplayermana = 0;
	static int totalplayermelee;
	static int totalplayerhealth;
	static int totalplayermarksmanship;
	static int totalplayerspellpower;
	static int totalplayermana;
	
	//is it equipped
	static int isitemequipped = 0;
	//weapontype 1 = melee, 2 = bow, 3 = staff
	static int weapontype = 0;
	//hand 0 = right hand, hand 1 = left hand
	static int hand = 0;
	
	public static void BluntIronShortsword() {
		String bluntironshortswordname = "Blunted Iron Shortsword";
		addedplayermelee = 10;
		totalplayermelee = GameVariables.playermelee + addedplayermelee;
		addedplayerhealth = 5;
		totalplayerhealth = GameVariables.playerhealth + addedplayerhealth;
		weapontype = 1;
		isitemequipped ++;
	}
	
	public static void NoviceBow() {
		String novicebowname = "Novice's Bow";
		addedplayermarksmanship = 10;
		totalplayermarksmanship = GameVariables.playermarksmanship +addedplayermarksmanship;
		addedplayerhealth = 5;
		totalplayerhealth = GameVariables.playerhealth + addedplayerhealth;
		weapontype = 2;
		isitemequipped ++;
	}
	
	public static void NoviceStaff() {
		String novicestaffname = "Novice's Staff";
		addedplayerspellpower = 10;
		totalplayerspellpower = GameVariables.playerspellpower + addedplayerspellpower;
		addedplayermana +=5;
		totalplayermana = GameVariables.playermana + addedplayermana;
		weapontype = 3;
		isitemequipped ++;
	}

}
