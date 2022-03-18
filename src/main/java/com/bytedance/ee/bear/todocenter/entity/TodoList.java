package com.bytedance.ee.bear.todocenter.entity;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.util.io.NonProguard;
import java.util.List;
import java.util.Map;

public class TodoList implements NonProguard {
    public Map<String, Map<String, JSONObject>> entities;
    public boolean has_more;
    public int msgbox_ver;
    public String next_page_token;
    public List<Todo> todo_list;
    public int total_num;

    public String toString() {
        return super.toString();
    }
}
