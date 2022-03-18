package com.bytedance.ee.bear.todocenter.ui.entity;

import com.bytedance.ee.bear.todocenter.entity.Todo;
import com.bytedance.ee.bear.todocenter.ui.TodoItemType;
import com.bytedance.ee.bear.todocenter.ui.widget.C11754b;
import com.bytedance.ee.util.io.NonProguard;
import com.chad.library.adapter.base.entity.AbstractC20930c;
import java.util.Objects;

public class TodoUIEntity implements NonProguard, AbstractC20930c, Cloneable {
    public String[] assign_user;
    public String checked_uuid;
    public String click_url;
    public String content;
    public long create_time;
    public String create_user;
    public long deadline_time;
    public long done_time;
    public String done_user;
    public boolean isLastItem;
    public boolean is_done;
    public String obj_title;
    public int obj_type;
    public String reminderColorHandle;
    public long[] reminder_time;
    public String todo_id;

    @Override // com.chad.library.adapter.base.entity.AbstractC20930c
    public int getItemType() {
        return TodoItemType.Item.getType();
    }

    public String toString() {
        return super.toString();
    }

    public int hashCode() {
        return Objects.hash(this.todo_id);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.todo_id.equals(((TodoUIEntity) obj).todo_id);
    }

    public static TodoUIEntity fromTodo(Todo todo) {
        TodoUIEntity todoUIEntity = new TodoUIEntity();
        todoUIEntity.todo_id = todo.todo_id;
        todoUIEntity.is_done = todo.is_done;
        todoUIEntity.reminder_time = todo.reminder_time;
        todoUIEntity.deadline_time = todo.deadline_time;
        todoUIEntity.assign_user = todo.assign_user;
        todoUIEntity.content = todo.content;
        todoUIEntity.create_time = todo.create_time;
        todoUIEntity.done_time = todo.done_time;
        todoUIEntity.done_user = todo.done_user;
        todoUIEntity.create_user = todo.create_user;
        todoUIEntity.obj_type = todo.obj_type;
        todoUIEntity.obj_title = todo.obj_title;
        todoUIEntity.click_url = todo.click_url;
        if (todo.extra != null) {
            todoUIEntity.checked_uuid = todo.extra.checkbox_uuid;
        }
        todoUIEntity.reminderColorHandle = C11754b.m48723a(todoUIEntity);
        return todoUIEntity;
    }
}
