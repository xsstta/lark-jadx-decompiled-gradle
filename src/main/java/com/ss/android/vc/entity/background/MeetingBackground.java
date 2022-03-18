package com.ss.android.vc.entity.background;

import java.io.Serializable;

public class MeetingBackground implements Serializable {
    public Type backgroundType;
    public String name;
    public String portraitUrl;
    public MaterialSource source;
    public String url;

    public enum Type {
        UNKNOWN(0),
        IMAGE(1),
        VIDEO(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return IMAGE;
            }
            if (i != 2) {
                return null;
            }
            return VIDEO;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public MeetingBackground(Type type, String str, String str2, String str3, MaterialSource materialSource) {
        this.backgroundType = type;
        this.name = str;
        this.url = str2;
        this.portraitUrl = str3;
        this.source = materialSource;
    }
}
