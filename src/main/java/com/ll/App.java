package com.ll;

import java.util.Scanner;

public class App {
    private final Scanner sc; // final이 붙은 변수는 한 번 그 값을 세팅하면 바꿀 수 없다.
    public App(Scanner sc){
        this.sc = sc;
    }
    public void run(){
        System.out.println("== 명언 앱 ==");
        long lastWiseSayingId = 1; // 번호

        while(true){
            System.out.print("명령) ");
            // trim() : 혹시 있을지 모를 좌우공백제거된 버전으로 주세요.
            String command = sc.nextLine().trim();

            if(command.equals("종료")) {
                break;
            }else if(command.equals("등록")){
                System.out.print("명언 : ");
                String content = sc.nextLine().trim(); // 내용
                System.out.print("작가 : ");
                String authorName = sc.nextLine().trim(); // 작가


                System.out.printf("%d번 명언이 등록되었습니다.\n",lastWiseSayingId);
                lastWiseSayingId++; // 증가
            }
        } // end of while(true)

    }
}
