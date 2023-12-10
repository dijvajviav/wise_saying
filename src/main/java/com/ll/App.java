package com.ll;

import com.ll.system.controller.SystemController;
import com.ll.wiseSaying.controller.WiseSayingController;
import com.ll.wiseSaying.entity.WiseSaying;

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


        SystemController systemController = new SystemController(); // 객체 생성
        WiseSayingController wiseSayingController = new WiseSayingController(sc); // 객체 생성

        while(true){
            System.out.print("명령) ");
            // trim() : 혹시 있을지 모를 좌우공백제거된 버전으로 주세요.
            String command = sc.nextLine().trim();

            if(command.equals("종료")) {
                systemController.exit();
                break;
            }else if(command.equals("등록")){
              wiseSayingController.write();
            } // end of 등록
            else if(command.equals("목록")){
            wiseSayingController.list();
            } //  end of 목록

        } // end of while(true)

    }
}
