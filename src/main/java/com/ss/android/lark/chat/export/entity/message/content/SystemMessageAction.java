package com.ss.android.lark.chat.export.entity.message.content;

import java.io.Serializable;

public class SystemMessageAction implements Serializable {
    private static final long serialVersionUID = -8206074036251753606L;
    private ActType actType;

    public enum ActType {
        UNKNOWN_ACT_TYPE(0),
        INVITE_AT_CHATTERS(1),
        URL(2);
        
        int value;

        public int getValue() {
            return this.value;
        }

        public static ActType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_ACT_TYPE;
            }
            if (i == 1) {
                return INVITE_AT_CHATTERS;
            }
            if (i != 2) {
                return UNKNOWN_ACT_TYPE;
            }
            return URL;
        }

        private ActType(int i) {
            this.value = i;
        }
    }

    public ActType getActType() {
        return this.actType;
    }

    public void setActType(ActType actType2) {
        this.actType = actType2;
    }

    public SystemMessageAction(ActType actType2) {
        this.actType = actType2;
    }
}
