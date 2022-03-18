package com.ss.android.lark.doc.entity;

import java.io.Serializable;

public class DocMessage implements Serializable {
    private String content;
    private long createTime;
    private String docFeedId;
    private String fromId;
    private String fromName;
    private String id;
    private Type type;
    private long updateTime;

    public enum Type {
        UNKNOWN(0),
        MENTION(1),
        COMMENT(2),
        REPLY(3),
        SOLVE(4),
        SHARE(5),
        REOPEN(6),
        REACTION(7);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return MENTION;
                case 2:
                    return COMMENT;
                case 3:
                    return REPLY;
                case 4:
                    return SOLVE;
                case 5:
                    return SHARE;
                case 6:
                    return REOPEN;
                case 7:
                    return REACTION;
                default:
                    return UNKNOWN;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public String getContent() {
        return this.content;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getDocFeedId() {
        return this.docFeedId;
    }

    public String getFromId() {
        return this.fromId;
    }

    public String getFromName() {
        return this.fromName;
    }

    public String getId() {
        return this.id;
    }

    public Type getType() {
        return this.type;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDocFeedId(String str) {
        this.docFeedId = str;
    }

    public void setFromId(String str) {
        this.fromId = str;
    }

    public void setFromName(String str) {
        this.fromName = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setType(Type type2) {
        this.type = type2;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public boolean exactlyCompare(DocMessage docMessage) {
        return equals(docMessage);
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocMessage)) {
            return false;
        }
        DocMessage docMessage = (DocMessage) obj;
        String str = this.id;
        if (str != null) {
            z = str.equals(docMessage.getId());
        } else if (docMessage.getId() == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        Type type2 = this.type;
        if (type2 != null) {
            z2 = type2.equals(docMessage.getType());
        } else if (docMessage.getType() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        String str2 = this.docFeedId;
        if (str2 != null) {
            return str2.equals(docMessage.getDocFeedId());
        }
        if (docMessage.getDocFeedId() == null) {
            return true;
        }
        return false;
    }
}
