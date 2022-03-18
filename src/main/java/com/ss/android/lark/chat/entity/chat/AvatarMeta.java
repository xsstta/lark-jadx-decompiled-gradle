package com.ss.android.lark.chat.entity.chat;

import java.io.Serializable;

public class AvatarMeta implements Serializable {
    private int backgroundColor;
    private int borderColor;
    private int centerColor;
    private int color;
    private String text;
    private Type type;

    public enum Type {
        UNKNOWN(0),
        RANDOM(1),
        WORDS(2),
        UPLOAD(3);
        
        private final int value;

        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 1) {
                return RANDOM;
            }
            if (i == 2) {
                return WORDS;
            }
            if (i != 3) {
                return UNKNOWN;
            }
            return UPLOAD;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public int getBorderColor() {
        return this.borderColor;
    }

    public int getCenterColor() {
        return this.centerColor;
    }

    public int getColor() {
        return this.color;
    }

    public String getText() {
        return this.text;
    }

    public Type getType() {
        return this.type;
    }

    public String toString() {
        return "AvatarMeta{type=" + this.type + ", color=" + this.color + ", text='" + this.text + ", borderColor=" + this.borderColor + ", backgroundColor=" + this.backgroundColor + ", centerColor=" + this.centerColor + '\'' + '}';
    }

    public void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public void setBorderColor(int i) {
        this.borderColor = i;
    }

    public void setCenterColor(int i) {
        this.centerColor = i;
    }

    public void setColor(int i) {
        this.color = i;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setType(Type type2) {
        this.type = type2;
    }
}
