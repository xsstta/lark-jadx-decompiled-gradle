package com.ss.android.lark.forward.dto;

import java.io.Serializable;

public class TodoForwardData implements Serializable {
    private String todoGuid;
    private String todoSummary;

    public String getTodoGuid() {
        return this.todoGuid;
    }

    public String getTodoSummary() {
        return this.todoSummary;
    }

    public void setTodoGuid(String str) {
        this.todoGuid = str;
    }

    public void setTodoSummary(String str) {
        this.todoSummary = str;
    }
}
