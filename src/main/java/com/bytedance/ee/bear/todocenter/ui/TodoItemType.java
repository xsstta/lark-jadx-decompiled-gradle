package com.bytedance.ee.bear.todocenter.ui;

public enum TodoItemType {
    Section(1),
    Item(2),
    EmptyTodo(3);
    
    int type;

    public int getType() {
        return this.type;
    }

    private TodoItemType(int i) {
        this.type = i;
    }
}
