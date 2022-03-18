package com.bytedance.ee.bear.todocenter.model;

import androidx.collection.ArrayMap;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.todocenter.entity.Todo;
import com.bytedance.ee.bear.todocenter.entity.TodoList;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.todocenter.model.d */
public class C11696d {

    /* renamed from: a */
    public TodoList f31481a;

    /* renamed from: b */
    public TodoList f31482b;

    /* renamed from: a */
    public boolean mo44803a() {
        TodoList todoList = this.f31481a;
        return todoList != null && todoList.has_more && this.f31481a.todo_list.size() < 15;
    }

    /* renamed from: d */
    public boolean mo44807d() {
        TodoList todoList = this.f31481a;
        if (todoList == null || !todoList.has_more) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo44808e() {
        TodoList todoList = this.f31482b;
        if (todoList == null || todoList.has_more) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo44805b() {
        TodoList todoList = this.f31481a;
        if (todoList == null || C13657b.m55421a(todoList.todo_list)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo44806c() {
        TodoList todoList = this.f31482b;
        if (todoList == null || C13657b.m55421a(todoList.todo_list)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo44809f() {
        if (mo44807d() || mo44808e()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "TodoListComposite{todoList=" + this.f31481a + ", doneList=" + this.f31482b + '}';
    }

    /* renamed from: a */
    public void mo44800a(TodoList todoList) {
        this.f31481a = m48518a(this.f31481a, todoList);
    }

    /* renamed from: b */
    public void mo44804b(TodoList todoList) {
        this.f31482b = m48518a(this.f31482b, todoList);
    }

    /* renamed from: a */
    private static ArrayMap<String, Todo> m48516a(List<Todo> list) {
        ArrayMap<String, Todo> arrayMap = new ArrayMap<>(list.size());
        for (Todo todo : list) {
            arrayMap.put(todo.todo_id, todo);
        }
        return arrayMap;
    }

    /* renamed from: a */
    public static Todo m48517a(TodoList todoList, String str) {
        boolean z;
        Todo todo = null;
        if (todoList != null && !C13657b.m55421a(todoList.todo_list)) {
            Iterator<Todo> it = todoList.todo_list.iterator();
            while (it.hasNext()) {
                Todo next = it.next();
                if (next.todo_id.equals(str)) {
                    it.remove();
                    todo = next;
                }
            }
            if (todo != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                todoList.total_num--;
            }
        }
        return todo;
    }

    /* renamed from: a */
    private TodoList m48518a(TodoList todoList, TodoList todoList2) {
        if (todoList2 == null) {
            return todoList;
        }
        mo44802a(todoList, todoList2.todo_list, todoList2.entities, null);
        todoList.next_page_token = todoList2.next_page_token;
        todoList.has_more = todoList2.has_more;
        todoList.total_num = todoList2.total_num;
        return todoList;
    }

    /* renamed from: a */
    private static void m48520a(List<Todo> list, List<Todo> list2) {
        if (!(C13657b.m55421a(list) || C13657b.m55421a(list2))) {
            ArrayMap<String, Todo> a = m48516a(list);
            ArrayList arrayList = new ArrayList(5);
            for (Todo todo : list2) {
                Todo todo2 = a.get(todo.todo_id);
                if (todo2 != null) {
                    arrayList.add(todo2);
                }
            }
            if (!arrayList.isEmpty()) {
                list.removeAll(arrayList);
            }
        }
    }

    /* renamed from: a */
    public void mo44801a(TodoList todoList, List<Todo> list) {
        if (!C13657b.m55421a(list) && todoList != null && todoList.todo_list != null) {
            boolean removeAll = todoList.todo_list.removeAll(list);
            C13479a.m54772d("TodoListComposite", "removeTodoList: " + removeAll);
        }
    }

    /* renamed from: a */
    public static void m48519a(TodoList todoList, int i, Todo todo) {
        if (todoList == null) {
            todoList = new TodoList();
        }
        if (C13657b.m55421a(todoList.todo_list)) {
            todoList.todo_list = new ArrayList();
        }
        todoList.total_num++;
        todoList.todo_list.add(i, todo);
    }

    /* renamed from: a */
    public void mo44802a(TodoList todoList, List<Todo> list, Map<String, Map<String, JSONObject>> map, Comparator<Todo> comparator) {
        if (!C13657b.m55421a(list)) {
            if (todoList == null) {
                todoList = new TodoList();
                todoList.todo_list = new ArrayList();
                todoList.entities = new ArrayMap();
            }
            m48520a(this.f31481a.todo_list, list);
            m48520a(this.f31482b.todo_list, list);
            if (todoList.todo_list == null) {
                todoList.todo_list = new ArrayList();
            }
            todoList.todo_list.addAll(list);
            if (comparator != null) {
                Collections.sort(todoList.todo_list, comparator);
            }
            if (!C13657b.m55422a(map)) {
                if (todoList.entities == null) {
                    todoList.entities = new ArrayMap();
                }
                todoList.entities.putAll(map);
            }
        }
    }
}
