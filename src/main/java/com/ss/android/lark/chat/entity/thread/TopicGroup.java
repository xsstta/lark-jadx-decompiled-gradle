package com.ss.android.lark.chat.entity.thread;

import com.ss.android.lark.chat.entity.chat.Chat;
import java.io.Serializable;

public class TopicGroup implements Serializable {
    private Chat chat;
    private String id;
    private Type type;
    private UserSetting userSetting;

    public enum TopicGroupRole {
        UNKNOWN_ROLE(0),
        UNAUTHORIZED_USER(1),
        MEMBER(2),
        PARTICIPANT(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static TopicGroupRole valueOf(int i) {
            return fromValue(i);
        }

        public static TopicGroupRole fromValue(int i) {
            if (i == 1) {
                return UNAUTHORIZED_USER;
            }
            if (i == 2) {
                return MEMBER;
            }
            if (i != 3) {
                return UNKNOWN_ROLE;
            }
            return PARTICIPANT;
        }

        private TopicGroupRole(int i) {
            this.value = i;
        }
    }

    public enum Type {
        UNKNOWN_TYPE(0),
        NORMAL(1),
        DEFAULT(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return fromValue(i);
        }

        public static Type fromValue(int i) {
            if (i == 1) {
                return NORMAL;
            }
            if (i != 2) {
                return UNKNOWN_TYPE;
            }
            return DEFAULT;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static class UserSetting implements Serializable {
        public boolean isFavorite;
        private TopicGroupRole topicGroupRole;
        public long updateTime;

        public TopicGroupRole getTopicGroupRole() {
            return this.topicGroupRole;
        }

        public long getUpdateTime() {
            return this.updateTime;
        }

        public boolean isFavorite() {
            return this.isFavorite;
        }

        public void setFavorite(boolean z) {
            this.isFavorite = z;
        }

        public void setTopicGroupRole(TopicGroupRole topicGroupRole2) {
            this.topicGroupRole = topicGroupRole2;
        }

        public void setUpdateTime(long j) {
            this.updateTime = j;
        }
    }

    public Chat getChat() {
        return this.chat;
    }

    public String getId() {
        return this.id;
    }

    public Type getType() {
        return this.type;
    }

    public UserSetting getUserSetting() {
        return this.userSetting;
    }

    public String toString() {
        if (this.userSetting != null) {
            return "TopicGroup{id='" + this.id + '\'' + ", type=" + this.type + ", role =" + this.userSetting.getTopicGroupRole() + ", isFavorite =" + this.userSetting.isFavorite + ", updateTime=" + this.userSetting.updateTime + '}';
        }
        return "TopicGroup{id='" + this.id + '\'' + ", type=" + this.type + ", usersetting =null" + '}';
    }

    public void setChat(Chat chat2) {
        this.chat = chat2;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setType(Type type2) {
        this.type = type2;
    }

    public void setUserSetting(UserSetting userSetting2) {
        this.userSetting = userSetting2;
    }
}
