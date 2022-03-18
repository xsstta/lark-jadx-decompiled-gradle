package com.bytedance.ee.bear.todocenter.model;

import com.bytedance.ee.bear.todocenter.entity.Todo;
import java.util.Comparator;

/* renamed from: com.bytedance.ee.bear.todocenter.model.c */
public class C11695c implements Comparator<Todo> {
    /* renamed from: a */
    public int compare(Todo todo, Todo todo2) {
        if (todo.deadline_time > 0 && todo2.deadline_time > 0) {
            int compare = Long.compare(todo.deadline_time, todo2.deadline_time);
            if (compare == 0) {
                return Long.compare(todo2.create_time, todo.create_time);
            }
            return compare;
        } else if (todo.deadline_time <= 0 && todo2.deadline_time <= 0) {
            return Long.compare(todo2.create_time, todo.create_time);
        } else {
            if (todo.deadline_time > 0) {
                return -1;
            }
            return 1;
        }
    }
}
