package com.ll;

public class Todo {
    private String content;
    private long id;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public Todo(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
