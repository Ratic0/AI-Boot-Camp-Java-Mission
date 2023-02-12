public class Pikachu extends pokemon {
    private String name;

    public Pikachu(String owner, String skills) {
        super(owner, skills);
        this.name = "파이리";
        System.out.println(name);
    }

    public void attack(int idx) {
        System.out.println("[피카피카] " + owner + "의 " + name + "가 " + skills[idx] + " 공격(전기)");
    }
}