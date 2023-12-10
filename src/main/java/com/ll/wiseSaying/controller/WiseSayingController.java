package com.ll.wiseSaying.controller;

import com.ll.wiseSaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiseSayingController {
    private final Scanner sc;
    private long lastWiseSayingId; // 번호
    private List<WiseSaying> wiseSayings; // 명언을 담을 리스트 선언

    public WiseSayingController(Scanner sc){ // 생성자
        this.sc = sc;
        lastWiseSayingId = 0;
        wiseSayings = new ArrayList<>();
    }
    public void write() {
        long id = lastWiseSayingId + 1; // 번호
        System.out.print("명언 : ");
        String content = sc.nextLine().trim(); // 내용
        System.out.print("작가 : ");
        String authorName = sc.nextLine().trim(); // 작가

        WiseSaying wiseSaying = new WiseSaying(id, content, authorName);
        wiseSayings.add(wiseSaying);
       // System.out.println("id = " + wiseSaying.getId() + " Content = " + wiseSaying.getContent() + " AutorName = " + wiseSaying.getAuthorName());
        System.out.printf("%d번 명언이 등록되었습니다.\n",id);
        lastWiseSayingId++; // 번호 1증가
    }

    public void list() {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("-".repeat(30));

        for(int i = wiseSayings.size()-1; i >= 0; i--){ // 명언을 담은 리스트를 역순으로 출력함
            WiseSaying wiseSaying = wiseSayings.get(i);
            System.out.printf("%d / %s / %s \n", wiseSaying.getId(), wiseSaying.getAuthorName(), wiseSaying.getContent());
        } // end of for
    }
}
