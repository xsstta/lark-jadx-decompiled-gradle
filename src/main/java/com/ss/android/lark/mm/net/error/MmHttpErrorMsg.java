package com.ss.android.lark.mm.net.error;

import com.ss.android.lark.mm.base.IMmSerializable;

public class MmHttpErrorMsg implements IMmSerializable {
    private MessageContent content;
    private boolean isOverride;
    private boolean isShow;
    private int type;

    public enum ErrorDisplayType implements IMmSerializable {
        UNKNOWN(0),
        ALERT(1),
        TOAST_NORMAL(2),
        TOAST_SUCCEED(3),
        TOAST_FAILED(4),
        TOAST_INFO(5);
        
        private int value;

        public int getValue() {
            return this.value;
        }

        public static ErrorDisplayType fromValue(int i) {
            if (i == 1) {
                return ALERT;
            }
            if (i == 2) {
                return TOAST_NORMAL;
            }
            if (i == 3) {
                return TOAST_SUCCEED;
            }
            if (i == 4) {
                return TOAST_FAILED;
            }
            if (i != 5) {
                return UNKNOWN;
            }
            return TOAST_INFO;
        }

        private ErrorDisplayType(int i) {
            this.value = i;
        }
    }

    public static class MessageContent implements IMmSerializable {
        private String body;
        private String title;

        public String getBody() {
            return this.body;
        }

        public String getTitle() {
            return this.title;
        }

        public void setBody(String str) {
            this.body = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }
    }

    public MessageContent getContent() {
        return this.content;
    }

    public int getType() {
        return this.type;
    }

    public boolean isOverride() {
        return this.isOverride;
    }

    public boolean isShow() {
        return this.isShow;
    }

    public void setContent(MessageContent messageContent) {
        this.content = messageContent;
    }

    public void setOverride(boolean z) {
        this.isOverride = z;
    }

    public void setShow(boolean z) {
        this.isShow = z;
    }

    public void setType(int i) {
        this.type = i;
    }
}
