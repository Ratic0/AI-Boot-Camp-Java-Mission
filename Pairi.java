public class Pairi extends pokemon {
    private String name;

    public Pairi(String owner, String skills) {
        super(owner, skills);
        this.name = "파이리";
        System.out.println(name);
    }

    public void attack(int idx) {
        System.out.println("[파읠파읠] " + owner + "의 " + name + "가 " + skills[idx] + " 공격(불)");
    }
}