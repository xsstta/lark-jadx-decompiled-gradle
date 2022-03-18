package com.ss.android.lark.contact.entity;

import com.ss.android.lark.chat.entity.chat.Chat;
import java.io.Serializable;

public class ChatInfo implements Serializable {
    private static final long serialVersionUID = 6384386750016337646L;
    private Chat chat;
    private boolean isMember;
    private UserPermission userPermission;

    public enum UserPermission {
        UNKNOWN(0),
        VISIBLE_AND_CREATE(1),
        VISIBLE_NOT_CREATE(2),
        INVISIBLE(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static UserPermission valueOf(int i) {
            return forNumber(i);
        }

        public static UserPermission forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return VISIBLE_AND_CREATE;
            }
            if (i == 2) {
                return VISIBLE_NOT_CREATE;
            }
            if (i != 3) {
                return UNKNOWN;
            }
            return INVISIBLE;
        }

        private UserPermission(int i) {
            this.value = i;
        }
    }

    public Chat getChat() {
        return this.chat;
    }

    public UserPermission getUserPermission() {
        return this.userPermission;
    }

    public boolean isMember() {
        return this.isMember;
    }

    public void setChat(Chat chat2) {
        this.chat = chat2;
    }

    public void setMember(boolean z) {
        this.isMember = z;
    }

    public void setUserPermission(UserPermission userPermission2) {
        this.userPermission = userPermission2;
    }
}
