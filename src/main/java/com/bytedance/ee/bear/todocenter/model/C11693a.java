package com.bytedance.ee.bear.todocenter.model;

import com.bytedance.ee.bear.todocenter.entity.Todo;
import java.util.Comparator;

/* renamed from: com.bytedance.ee.bear.todocenter.model.a */
public class C11693a implements Comparator<Todo> {
    /* renamed from: a */
    public int compare(Todo todo, Todo todo2) {
        return Long.compare(todo2.done_time, todo.done_time);
    }
}
