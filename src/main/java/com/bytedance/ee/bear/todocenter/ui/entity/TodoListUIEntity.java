package com.bytedance.ee.bear.todocenter.ui.entity;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.util.io.NonProguard;
import java.util.List;
import java.util.Map;

public class TodoListUIEntity implements NonProguard {
    public Map<String, Map<String, JSONObject>> entities;
    public boolean has_more;
    public String next_page_token;
    public List<TodoUIEntity> todo_list;
    public int total_num;

    public String toString() {
        return super.toString();
    }
}
