package com.bytedance.ee.bear.middleground.like.export;

import com.bytedance.ee.util.io.NonProguard;
import java.util.List;

public class LikePushBean implements NonProguard {
    private List<AheadUsersBean> ahead_users;
    private String avatar_url;
    private int code;
    private int count;
    private int create_time;
    private String en_name;
    private String id;
    private boolean is_liked;
    private int like_type;
    private String msg;
    private String tenant_id;
    private String type;
    private String user_id;
    private String user_name;

    public static class AheadUsersBean implements NonProguard {
        private String avatar_url;
        private int create_time;
        private String en_name;
        private String id;
        private String name;
        private String tenant_id;

        public String getAvatar_url() {
            return this.avatar_url;
        }

        public int getCreate_time() {
            return this.create_time;
        }

        public String getEn_name() {
            return this.en_name;
        }

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getTenant_id() {
            return this.tenant_id;
        }

        public void setAvatar_url(String str) {
            this.avatar_url = str;
        }

        public void setCreate_time(int i) {
            this.create_time = i;
        }

        public void setEn_name(String str) {
            this.en_name = str;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setTenant_id(String str) {
            this.tenant_id = str;
        }
    }

    public List<AheadUsersBean> getAhead_users() {
        return this.ahead_users;
    }

    public String getAvatar_url() {
        return this.avatar_url;
    }

    public int getCode() {
        return this.code;
    }

    public int getCount() {
        return this.count;
    }

    public int getCreate_time() {
        return this.create_time;
    }

    public String getEn_name() {
        return this.en_name;
    }

    public String getId() {
        return this.id;
    }

    public int getLike_type() {
        return this.like_type;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getTenant_id() {
        return this.tenant_id;
    }

    public String getType() {
        return this.type;
    }

    public String getUser_id() {
        return this.user_id;
    }

    public String getUser_name() {
        return this.user_name;
    }

    public boolean isIs_liked() {
        return this.is_liked;
    }

    public void setAhead_users(List<AheadUsersBean> list) {
        this.ahead_users = list;
    }

    public void setAvatar_url(String str) {
        this.avatar_url = str;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setCreate_time(int i) {
        this.create_time = i;
    }

    public void setEn_name(String str) {
        this.en_name = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setIs_liked(boolean z) {
        this.is_liked = z;
    }

    public void setLike_type(int i) {
        this.like_type = i;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setTenant_id(String str) {
        this.tenant_id = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUser_id(String str) {
        this.user_id = str;
    }

    public void setUser_name(String str) {
        this.user_name = str;
    }
}
