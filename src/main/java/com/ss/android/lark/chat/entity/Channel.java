package com.ss.android.lark.chat.entity;

import java.io.Serializable;

public class Channel implements Serializable {
    private String id;
    private Type type;

    public enum Type {
        UNKNOWN(0),
        CHAT(1),
        EMAIL(2),
        DOC(3),
        APP(4),
        OPEN_APP_CHAT(5),
        SUBSCRIPTION(10);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return CHAT;
            }
            if (i == 2) {
                return EMAIL;
            }
            if (i == 3) {
                return DOC;
            }
            if (i == 4) {
                return APP;
            }
            if (i == 5) {
                return OPEN_APP_CHAT;
            }
            if (i != 10) {
                return UNKNOWN;
            }
            return SUBSCRIPTION;
        }

        public static Type fromFeedType(int i) {
            if (i == 1) {
                return CHAT;
            }
            if (i == 2) {
                return EMAIL;
            }
            if (i == 3) {
                return DOC;
            }
            if (i == 6) {
                return APP;
            }
            if (i == 8) {
                return OPEN_APP_CHAT;
            }
            if (i != 10) {
                return UNKNOWN;
            }
            return SUBSCRIPTION;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public String getId() {
        return this.id;
    }

    public Type getType() {
        return this.type;
    }

    public String toString() {
        return "Channel{id='" + this.id + '\'' + ", type=" + this.type + '}';
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setType(Type type2) {
        this.type = type2;
    }

    public Channel(Type type2, String str) {
        this.type = type2;
        this.id = str;
    }

    public Channel(int i, String str) {
        this.type = Type.valueOf(i);
        this.id = str;
    }
}
