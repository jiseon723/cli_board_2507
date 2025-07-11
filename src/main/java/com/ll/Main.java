package com.ll;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("== 게시판 앱 ==");
        while (true){
            System.out.printf("명령) ");
            String command = sc.nextLine();

            if (command.equals("종료")){
                break;
            } else if (command.equals("등록")){
                System.out.printf("제목: ");
                String title = sc.nextLine();
                System.out.printf("내용: ");
                String content = sc.nextLine();

                System.out.printf("1번 게시글이 등록되었습니다.");

            }
        }

        sc.close();
    }
}