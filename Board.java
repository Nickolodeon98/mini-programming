import java.util.Scanner;

public class Board {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("번호  제목  작성자  작성일");
        System.out.println("----------------------");
        System.out.print("1.목록  2.등록  3.내용  4.삭제  0.종료 >");

        sc.nextInt();
    }

}
