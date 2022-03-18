package com.bytedance.ee.bear.todocenter.model;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.todocenter.entity.Todo;
import com.bytedance.ee.bear.todocenter.entity.TodoList;
import com.bytedance.ee.bear.todocenter.entity.UserEntity;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import io.reactivex.functions.Function;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.todocenter.model.b */
public class C11694b implements Function<TodoList, TodoList> {
    /* renamed from: a */
    public TodoList apply(TodoList todoList) throws Exception {
        if (C13657b.m55421a(todoList.todo_list)) {
            return todoList;
        }
        for (Todo todo : todoList.todo_list) {
            if (!(todo.assign_user == null || todoList.entities == null)) {
                Map<String, JSONObject> map = todoList.entities.get("users");
                if (!C13657b.m55422a(map)) {
                    HashMap hashMap = new HashMap();
                    String[] strArr = todo.assign_user;
                    for (String str : strArr) {
                        if (map.get(str) == null) {
                            C13479a.m54775e("TodoEntityMapFunc", "can't find uid in map uid=" + str);
                        } else {
                            hashMap.put(str, (UserEntity) map.get(str).toJavaObject(UserEntity.class));
                        }
                    }
                    C11697e.m48531a().mo44812a(hashMap);
                }
            }
        }
        return todoList;
    }
}
