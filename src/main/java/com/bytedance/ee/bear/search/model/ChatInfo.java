package com.bytedance.ee.bear.search.model;

import java.io.Serializable;
import java.util.Objects;

public class ChatInfo implements Serializable {
    private String avatarKey;
    private String avatarUrl;
    private String chatId;
    private int chatType;
    private String p2pChatterId;

    public enum ChatType {
        SINGLE_CHAT(0),
        GROUP_CHAT(1);
        
        private int value;

        public int getValue() {
            return this.value;
        }

        public static ChatType valueOf(int i) {
            if (i == 0) {
                return SINGLE_CHAT;
            }
            if (i != 1) {
                return SINGLE_CHAT;
            }
            return GROUP_CHAT;
        }

        private ChatType(int i) {
            this.value = i;
        }
    }

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getChatId() {
        return this.chatId;
    }

    public int getChatType() {
        return this.chatType;
    }

    public String getP2pChatterId() {
        return this.p2pChatterId;
    }

    public int hashCode() {
        return Objects.hash(this.chatId, this.p2pChatterId, Integer.valueOf(this.chatType), this.avatarUrl, this.avatarKey);
    }

    public String toString() {
        return "ChatInfo{chatId='" + this.chatId + '\'' + ", p2pChatterId='" + this.p2pChatterId + '\'' + ", chatType=" + this.chatType + ", avatarUrl='" + this.avatarUrl + '\'' + ", avatarKey='" + this.avatarKey + '\'' + '}';
    }

    public void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setChatType(int i) {
        this.chatType = i;
    }

    public void setP2pChatterId(String str) {
        this.p2pChatterId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChatInfo chatInfo = (ChatInfo) obj;
        if (this.chatType != chatInfo.chatType || !Objects.equals(this.chatId, chatInfo.chatId) || !Objects.equals(this.p2pChatterId, chatInfo.p2pChatterId) || !Objects.equals(this.avatarUrl, chatInfo.avatarUrl) || !Objects.equals(this.avatarKey, chatInfo.avatarKey)) {
            return false;
        }
        return true;
    }
}
