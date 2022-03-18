package com.ss.android.lark.contact.dto;

import com.ss.android.lark.contact.impl.entity.ExternalContactSummary;
import java.io.Serializable;

public class ChatApplication implements Serializable {
    private long applyTime;
    private String chatId;
    private ExternalContactSummary externalContactSummary;
    private String extraMessage;
    private String id;
    private boolean isRead;
    private long processedTime;
    private Status status;
    private Type type;

    public enum Status {
        UNKNOWN_STATUS(0),
        PEDING(1),
        AGREED(2),
        REFUSED(3),
        DELETED(4),
        EXPIRED(5);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Status valueOf(int i) {
            return forNumber(i);
        }

        public static Status forNumber(int i) {
            if (i == 0) {
                return UNKNOWN_STATUS;
            }
            if (i == 1) {
                return PEDING;
            }
            if (i == 2) {
                return AGREED;
            }
            if (i == 3) {
                return REFUSED;
            }
            if (i == 4) {
                return DELETED;
            }
            if (i != 5) {
                return null;
            }
            return EXPIRED;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public enum Type {
        UNKNOWN_TYPE(0),
        FRIEND(1),
        JOIN_CHAT(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            if (i == 0) {
                return UNKNOWN_TYPE;
            }
            if (i == 1) {
                return FRIEND;
            }
            if (i != 2) {
                return null;
            }
            return JOIN_CHAT;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public long getApplyTime() {
        return this.applyTime;
    }

    public String getChatId() {
        return this.chatId;
    }

    public ExternalContactSummary getExternalContactSummary() {
        return this.externalContactSummary;
    }

    public String getExtraMessage() {
        return this.extraMessage;
    }

    public String getId() {
        return this.id;
    }

    public long getProcessedTime() {
        return this.processedTime;
    }

    public Status getStatus() {
        return this.status;
    }

    public Type getType() {
        return this.type;
    }

    public boolean isRead() {
        return this.isRead;
    }

    public void setApplyTime(long j) {
        this.applyTime = j;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setExternalContactSummary(ExternalContactSummary externalContactSummary2) {
        this.externalContactSummary = externalContactSummary2;
    }

    public void setExtraMessage(String str) {
        this.extraMessage = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setProcessedTime(long j) {
        this.processedTime = j;
    }

    public void setRead(boolean z) {
        this.isRead = z;
    }

    public void setStatus(Status status2) {
        this.status = status2;
    }

    public void setType(Type type2) {
        this.type = type2;
    }
}
