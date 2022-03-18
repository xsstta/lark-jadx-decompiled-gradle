package com.bytedance.ee.bear.todocenter.push;

import com.bytedance.ee.bear.todocenter.entity.TodoList;
import com.bytedance.ee.util.io.NonProguard;

public class TodoPushEntity implements NonProguard {
    public TodoList data;
    public int type;

    public TodoList getData() {
        return this.data;
    }

    public int getType() {
        return this.type;
    }

    public void setData(TodoList todoList) {
        this.data = todoList;
    }

    public void setType(int i) {
        this.type = i;
    }
}
