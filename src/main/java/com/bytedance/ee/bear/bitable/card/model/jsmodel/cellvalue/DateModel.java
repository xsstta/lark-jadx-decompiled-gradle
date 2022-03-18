package com.bytedance.ee.bear.bitable.card.model.jsmodel.cellvalue;

import com.bytedance.ee.bear.bitable.card.model.enums.EReminderNotifyStrategy;
import com.bytedance.ee.util.io.NonProguard;
import java.util.Arrays;

public class DateModel implements NonProguard {
    private Reminder reminder;
    private Long value;

    public static class Reminder implements NonProguard {
        private ReminderNotifyEntity notifyEntities;
        private int notifyStrategy;
        private Long notifyTime;

        public ReminderNotifyEntity getNotifyEntities() {
            return this.notifyEntities;
        }

        public int getNotifyStrategy() {
            return this.notifyStrategy;
        }

        public Long getNotifyTime() {
            return this.notifyTime;
        }

        public String toString() {
            return "Reminder{notifyEntities=" + this.notifyEntities + ", notifyTime=" + this.notifyTime + ", notifyStrategy=" + this.notifyStrategy + '}';
        }

        public void setNotifyEntities(ReminderNotifyEntity reminderNotifyEntity) {
            this.notifyEntities = reminderNotifyEntity;
        }

        public void setNotifyStrategy(int i) {
            this.notifyStrategy = i;
        }

        public void setNotifyTime(Long l) {
            this.notifyTime = l;
        }

        public EReminderNotifyStrategy getEReminderNotifyStrategy(int i) {
            return EReminderNotifyStrategy.valueOf(i);
        }
    }

    public static class ReminderNotifyEntity implements NonProguard {
        private String[] fields;
        private ReminderUserEntity[] users;

        public String[] getFields() {
            return this.fields;
        }

        public ReminderUserEntity[] getUsers() {
            return this.users;
        }

        public String toString() {
            return "ReminderNotifyEntity{fields=" + Arrays.toString(this.fields) + ", users=" + Arrays.toString(this.users) + '}';
        }

        public void setFields(String[] strArr) {
            this.fields = strArr;
        }

        public void setUsers(ReminderUserEntity[] reminderUserEntityArr) {
            this.users = reminderUserEntityArr;
        }
    }

    public static class ReminderUserEntity implements NonProguard {
        private String avatarUrl;
        private String enName;
        private String name;
        private String userId;

        public String getAvatarUrl() {
            return this.avatarUrl;
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

        public String toString() {
            return "ReminderUser{userId='" + this.userId + '\'' + ", name='" + this.name + '\'' + ", enName='" + this.enName + '\'' + ", avatarUrl='" + this.avatarUrl + '\'' + '}';
        }

        public void setAvatarUrl(String str) {
            this.avatarUrl = str;
        }

        public void setEnName(String str) {
            this.enName = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setUserId(String str) {
            this.userId = str;
        }
    }

    public DateModel() {
    }

    public Reminder getReminder() {
        return this.reminder;
    }

    public Long getValue() {
        return this.value;
    }

    public boolean isReminderEnabled() {
        if (this.reminder != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "DateModel{value=" + this.value + ", reminder=" + this.reminder + '}';
    }

    public void setReminder(Reminder reminder2) {
        this.reminder = reminder2;
    }

    public void setValue(Long l) {
        this.value = l;
    }

    public DateModel(Long l, Reminder reminder2) {
        this.value = l;
        this.reminder = reminder2;
    }
}
