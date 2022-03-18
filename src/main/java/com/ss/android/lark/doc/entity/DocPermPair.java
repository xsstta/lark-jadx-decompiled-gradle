package com.ss.android.lark.doc.entity;

import java.io.Serializable;

public class DocPermPair implements Serializable {
    private String docToken;
    private String messageId;
    private PermType perm;

    public enum PermType {
        UNKNOWN(0),
        READ(1),
        EDIT(4),
        FORBIDDEN(501);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static PermType valueOf(int i) {
            return forNumber(i);
        }

        public static PermType forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return READ;
            }
            if (i == 4) {
                return EDIT;
            }
            if (i != 501) {
                return UNKNOWN;
            }
            return FORBIDDEN;
        }

        private PermType(int i) {
            this.value = i;
        }
    }

    public String getDocToken() {
        return this.docToken;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public PermType getPerm() {
        return this.perm;
    }

    public void setDocToken(String str) {
        this.docToken = str;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setPerm(PermType permType) {
        this.perm = permType;
    }

    public DocPermPair(String str, String str2, PermType permType) {
        this.messageId = str;
        this.docToken = str2;
        this.perm = permType;
    }
}
