package com.bytedance.ee.bear.middleground.like.export;

import com.bytedance.ee.util.io.NonProguard;
import java.util.List;
import java.util.Map;

public class LikeUserList implements NonProguard {
    private boolean has_more;
    private List<String> ids;
    private Map<String, LikesBean> likes;
    private Map<String, UsersBean> users;

    public List<String> getIds() {
        return this.ids;
    }

    public Map<String, LikesBean> getLikes() {
        return this.likes;
    }

    public Map<String, UsersBean> getUsers() {
        return this.users;
    }

    public boolean isHas_more() {
        return this.has_more;
    }

    public String toString() {
        return "LikeUserList{has_more=" + this.has_more + ", likes=" + this.likes + ", users=" + this.users + ", ids=" + this.ids + '}';
    }

    public void setHas_more(boolean z) {
        this.has_more = z;
    }

    public void setIds(List<String> list) {
        this.ids = list;
    }

    public void setLikes(Map<String, LikesBean> map) {
        this.likes = map;
    }

    public void setUsers(Map<String, UsersBean> map) {
        this.users = map;
    }
}
