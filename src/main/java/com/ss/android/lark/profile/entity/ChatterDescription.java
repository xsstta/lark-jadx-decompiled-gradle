package com.ss.android.lark.profile.entity;

import java.io.Serializable;

public class ChatterDescription implements Serializable {
    private static final long serialVersionUID = 9045855193516368048L;
    public String description;
    public Type type;

    public enum Type {
        DEFAULT(0),
        BUSINESS(1),
        LEAVE(2),
        MEETING(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        private static Type forNumber(int i) {
            if (i == 0) {
                return DEFAULT;
            }
            if (i == 1) {
                return BUSINESS;
            }
            if (i == 2) {
                return LEAVE;
            }
            if (i == 3) {
                return MEETING;
            }
            return null;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public ChatterDescription() {
        this.description = "";
        this.type = Type.DEFAULT;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatterDescription)) {
            return false;
        }
        ChatterDescription chatterDescription = (ChatterDescription) obj;
        if (chatterDescription.type != this.type || !chatterDescription.description.equals(this.description)) {
            return false;
        }
        return true;
    }

    public ChatterDescription(String str, Type type2) {
        this.description = str;
        this.type = type2;
    }
}
