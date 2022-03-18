package com.bytedance.ee.bear.todocenter.ui.entity;

import com.bytedance.ee.bear.todocenter.ui.TodoItemType;
import com.bytedance.ee.util.io.NonProguard;
import com.chad.library.adapter.base.entity.AbstractC20930c;

public class EmptyTodoEntity extends TodoUIEntity implements NonProguard, AbstractC20930c {
    @Override // com.chad.library.adapter.base.entity.AbstractC20930c, com.bytedance.ee.bear.todocenter.ui.entity.TodoUIEntity
    public int getItemType() {
        return TodoItemType.EmptyTodo.getType();
    }
}
