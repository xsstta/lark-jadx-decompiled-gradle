package com.ss.android.vc.entity;

import java.io.Serializable;
import java.util.Map;

public class VcI18nKeyInfo implements Serializable {
    public Map<String, I18nParam> i18nParams;
    public String jumpScheme;
    public String key;
    public String newKey;
    public Map<String, String> params;
    public Type type;

    public String toString() {
        return "VcI18nKeyInfo{key='" + this.key + '\'' + ", params=" + this.params + ", type=" + this.type + ", jumpScheme='" + this.jumpScheme + '\'' + ", newKey='" + this.newKey + '\'' + ", i18nParams=" + this.i18nParams + '}';
    }

    public static class I18nParam implements Serializable {
        public Type type;
        public String value;

        public enum Type {
            UNKNOWN(0),
            RAW_TEXT(1),
            USER_ID(2);
            
            private int value;

            public static Type valueOf(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return RAW_TEXT;
                }
                if (i != 2) {
                    return null;
                }
                return USER_ID;
            }

            private Type(int i) {
                this.value = i;
            }
        }
    }

    public enum Type {
        PLAN_COUNT_DOWN(-100),
        UNKNOWN(0),
        NORMAL(1),
        SCHEME_JUMP(2),
        UPGRADE_JUMP(3),
        CUSTOMER_JUMP(4),
        SUBTITLE_SETTING_JUMP(5);
        
        private int value;

        public static Type valueOf(int i) {
            if (i == -100) {
                return PLAN_COUNT_DOWN;
            }
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return NORMAL;
            }
            if (i == 2) {
                return SCHEME_JUMP;
            }
            if (i == 3) {
                return UPGRADE_JUMP;
            }
            if (i == 4) {
                return CUSTOMER_JUMP;
            }
            if (i != 5) {
                return null;
            }
            return SUBTITLE_SETTING_JUMP;
        }

        private Type(int i) {
            this.value = i;
        }
    }
}
