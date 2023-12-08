package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private final Scanner sc; // final이 붙은 변수는 한 번 그 값을 세팅하면 바꿀 수 없다.
    public App(Scanner sc){
        this.sc = sc;
    }
    public void run(){
        System.out.println("== 명언 앱 ==");
        long lastWiseSayingId = 0; // 번호
        List<WiseSaying> wiseSayings = new ArrayList<>(); // 명언을 담을 리스트 선언

        while(true){
            System.out.print("명령) ");
            // trim() : 혹시 있을지 모를 좌우공백제거된 버전으로 주세요.
            String command = sc.nextLine().trim();

            if(command.equals("종료")) {
                break;
            }else if(command.equals("등록")){
                long id = lastWiseSayingId + 1; // 번호
                System.out.print("명언 : ");
                String content = sc.nextLine().trim(); // 내용
                System.out.print("작가 : ");
                String authorName = sc.nextLine().trim(); // 작가

                WiseSaying wiseSaying = new WiseSaying(id, content, authorName);
                wiseSayings.add(wiseSaying);

                System.out.printf("%d번 명언이 등록되었습니다.\n",id);
                lastWiseSayingId++; // 번호 1증가
            } // end of 등록
            else if(command.equals("목록")){
                System.out.println("번호 / 작가 / 명언");
                System.out.println("-".repeat(30));

                for(int i = wiseSayings.size()-1; i >= 0; i--){ // 명언을 담은 리스트를 역순으로 출력함
                    WiseSaying wiseSaying = wiseSayings.get(i);
                    System.out.printf("%d / %s / %s \n", wiseSaying.getId(), wiseSaying.getAuthorName(), wiseSaying.getContent());
                } // end of for
            } //  end of 목록

        } // end of while(true)

    }
}
