package com.bytedance.ee.bear.reminder.model;

import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.Objects;

public class ReminderUserEntity implements NonProguard {
    private String avatarUrl;
    private String enName;
    private String id;
    private String name;

    public ReminderUserEntity() {
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getEnName() {
        return this.enName;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return Objects.hash(this.id);
    }

    public String toString() {
        return "ReminderUserEntity{, name='" + C13598b.m55197d(this.name) + '\'' + ", enName='" + C13598b.m55197d(this.enName) + '\'' + ", avatarUrl='" + C13598b.m55197d(this.avatarUrl) + '\'' + '}';
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setEnName(String str) {
        this.enName = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.id.equals(((ReminderUserEntity) obj).id);
    }

    public ReminderUserEntity(String str, String str2, String str3, String str4) {
        this.id = str;
        this.name = str2;
        this.enName = str3;
        this.avatarUrl = str4;
    }
}
