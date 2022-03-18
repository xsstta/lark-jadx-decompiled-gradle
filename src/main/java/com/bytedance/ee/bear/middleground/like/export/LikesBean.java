package com.bytedance.ee.bear.middleground.like.export;

import java.io.Serializable;

public class LikesBean implements Serializable {
    private int create_time;
    private String id;
    private int like_type;
    private int refer_type;
    private int update_time;
    private String user_id;

    public int getCreate_time() {
        return this.create_time;
    }

    public String getId() {
        return this.id;
    }

    public int getLike_type() {
        return this.like_type;
    }

    public int getRefer_type() {
        return this.refer_type;
    }

    public int getUpdate_time() {
        return this.update_time;
    }

    public String getUser_id() {
        return this.user_id;
    }

    public String toString() {
        return "LikesBean{create_time=" + this.create_time + ", id='" + this.id + '\'' + ", like_type=" + this.like_type + ", refer_type=" + this.refer_type + ", update_time=" + this.update_time + ", user_id='" + this.user_id + '\'' + '}';
    }

    public void setCreate_time(int i) {
        this.create_time = i;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLike_type(int i) {
        this.like_type = i;
    }

    public void setRefer_type(int i) {
        this.refer_type = i;
    }

    public void setUpdate_time(int i) {
        this.update_time = i;
    }

    public void setUser_id(String str) {
        this.user_id = str;
    }
}
