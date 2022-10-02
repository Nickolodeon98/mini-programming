import java.util.Scanner;

class BoardAction {
    private String title;
    private String content;
    private String author;

    BoardAction() {

    }
    BoardAction(String title, String content, String author) {
       this.title = title;
       this.content = content;
       this.author = author;
    }

    public BoardAction prompt(Scanner reader) {
        String title;
        String content;
        String author;

        System.out.print("제목> ");
        title = reader.next();
        System.out.print("내용> ");
        content = reader.next();
        System.out.print("작성자> ");
        author = reader.next();

        return new BoardAction(title, content, author);
    }
}

public class Board {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BoardAction board = new BoardAction();

        System.out.println("======================");
        System.out.println("번호  제목  작성자  작성일");
        System.out.println("----------------------");
        System.out.print("1.목록  2.등록  3.내용  4.삭제  0.종료 >");

        int input = sc.nextInt();

        if (input == 1) {
            board = board.prompt(sc);
        }
    }

}
