public class pokemon {
    public static int count = 0;
    protected String owner;
    protected String[] skills;

    public pokemon(String owner, String skills) {
        this.owner = owner;
        this.skills = skills.split("/");
        System.out.println("포켓몬 생성: ");
        count++;
    }


    public void info() {
        System.out.println(owner+ "의 포켓몬이 사용 가능한 스킬");
        for (int i = 0; i < skills.length; i++) {
            System.out.println((i + 1) + ": " + skills[i]);
        }
    }

    public void attack(int idx) {
        System.out.println(skills[idx] + " 공격 시전!");
    }

    public static int getCount() {
        return count;
    }
}



//public class Ggoboogi extends pokemon {
//    private String name;
//
//    public Ggoboogi(String owner, String skills) {
//        super(owner, skills);
//        this.name = "꼬부기";
//        System.out.println(name);
//    }
//
//    public void attack(int idx) {
//        System.out.println("[꼬북꼬북] " + getOwner() + "의 " + name + "가 " + skills[idx] + " 공격 시전!");
//    }
//
//    public void swim() {
//        System.out.println(name + "가 수영을 합니다");
//    }
//}

//public class Pairi extends pokemon {
//    private String name;
//
//    public Pairi(String owner, String skills) {
//        super(owner, skills);
//        this.name = "파이리";
//        System.out.println(name);
//    }
//
//    public void attack(int idx) {
//        System.out.println("[파읠파읠] " + getOwner() + "의 " + name + "가 " + skills[idx] + " 공격(불)");
//    }
//}