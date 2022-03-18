package com.bytedance.ee.bear.bitable.card.model.stmodel.cell;

import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.util.io.NonProguard;
import java.util.Objects;

public class UserEntity implements NonProguard {
    private String avatarUrl;
    private String department;
    private String enName;
    private String name;
    private boolean notify;
    private String userId;

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getEnName() {
        return this.enName;
    }

    public String getName() {
        return this.name;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isNotify() {
        return this.notify;
    }

    public int hashCode() {
        return Objects.hash(this.userId);
    }

    public String toString() {
        return "UserEntity{userId='" + this.userId + '\'' + ", notify=" + this.notify + ", name='" + this.name + '\'' + ", enName='" + this.enName + '\'' + ", avatarUrl='" + this.avatarUrl + '\'' + ", department='" + this.department + '\'' + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.userId.equals(((UserEntity) obj).userId);
    }

    public UserEntity(String str, String str2, String str3, String str4, String str5) {
        this.userId = str;
        this.name = str2;
        this.enName = str3;
        this.avatarUrl = str4;
        this.department = str5;
    }

    @JSONCreator
    public UserEntity(@JSONField(name = "userId") String str, @JSONField(name = "notify") boolean z, @JSONField(name = "name") String str2, @JSONField(name = "enName") String str3, @JSONField(name = "avatarUrl") String str4) {
        this.userId = str;
        this.notify = z;
        this.name = str2;
        this.enName = str3;
        this.avatarUrl = str4;
    }
}
