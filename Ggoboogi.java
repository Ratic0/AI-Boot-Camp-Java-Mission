public class Ggoboogi extends pokemon {
    private String name;

    public Ggoboogi(String owner, String skills) {
        super(owner, skills);
        this.name = "꼬부기";
        System.out.println(name);
    }

    public void attack(int idx) {
        System.out.println("[꼬북꼬북] " + owner + "의 " + name + "가 " + skills[idx] + " 공격 시전!");
    }
    public void swim() {
        System.out.println(name + "가 수영을 합니다");
    }
}