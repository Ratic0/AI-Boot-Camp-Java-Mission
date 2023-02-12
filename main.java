import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성

        String n, s;
        int m = 0;
        int poke_input = 0;
        while(true)
        {
            System.out.printf("총 %d 마리의 포켓몬이 생성되었습니다\n", pokemon.count);
            System.out.print("1) 포켓몬 생성  2) 프로그램 종료 : ");
            m = sc.nextInt();
            if (m == 2) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            else if (m == 1) {
                System.out.println("1) 피카츄  2) 꼬부기  3) 파이리 : ");
                poke_input = sc.nextInt();
                sc.nextLine();
                System.out.print("플레이어 이름 입력 : ");
                n = sc.nextLine();
                System.out.print("사용 가능한 기술 입력(/로 구분하여 입력) : ");
                s = sc.nextLine();
                if (poke_input == 1){
                    Pikachu p = new Pikachu(n,s);
                    p.info();
                }
                else if (poke_input == 2){
                    Ggoboogi p = new Ggoboogi(n,s);
                    p.info();
                }
                else if (poke_input == 3){
                    Pairi p = new Pairi(n,s);
                    p.info();
                }
                else
                {
                    System.out.println("메뉴에서 골라주세요");
                }
//                p.info();
//                System.out.print("공격 번호 선택 : ");
//                p.

            }
        }
    }
}
