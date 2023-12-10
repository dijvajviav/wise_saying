package com.ll.wiseSaying.entity;

public class WiseSaying {
    private long id; // 번호
    private String content; // 명언 내용
    private String authorName; // 명언 작가

    // Alt + Insert 단축키 입력


    public WiseSaying(long id, String content, String authorName) {
        this.id = id;
        this.content = content;
        this.authorName = authorName;
    } // 생성자 만들어주고

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getAuthorName() {
        return authorName;
    }
}
