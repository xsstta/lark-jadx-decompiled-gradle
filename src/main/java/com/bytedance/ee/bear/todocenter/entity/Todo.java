package com.bytedance.ee.bear.todocenter.entity;

import com.bytedance.ee.util.io.NonProguard;
import java.util.Objects;

public class Todo implements NonProguard {
    public String[] assign_user;
    public String click_url;
    public String content;
    public long create_time;
    public String create_user;
    public long deadline_time;
    public long done_time;
    public String done_user;
    public TodoExtra extra;
    public boolean is_done;
    public String obj_title;
    public int obj_type;
    public long[] reminder_time;
    public String todo_id;

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
        return this.todo_id.equals(((Todo) obj).todo_id);
    }
}
