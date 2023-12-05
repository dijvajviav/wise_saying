package com.ll;

public class WiseSaying {
    private long id;
    private String content;
    private String authorName;

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
