package com.tt.miniapp.launchaction.bean;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class ActionMessageResult {
    public static int MESSAGE_TYPE_AUDIO = 7;
    public static int MESSAGE_TYPE_CALENDAR = 12;
    public static int MESSAGE_TYPE_CARD = 14;
    public static int MESSAGE_TYPE_CLOUD_FILE = 13;
    public static int MESSAGE_TYPE_COMMERCIALIZED_HONGBAO = 22;
    public static int MESSAGE_TYPE_CUSTOMIZE = 21;
    public static int MESSAGE_TYPE_EMAIL = 8;
    public static int MESSAGE_TYPE_FILE = 3;
    public static int MESSAGE_TYPE_GENERAL_CALENDER = 18;
    public static int MESSAGE_TYPE_HONGBAO = 17;
    public static int MESSAGE_TYPE_IMAGE = 5;
    public static int MESSAGE_TYPE_LOCATION = 20;
    public static int MESSAGE_TYPE_MEDIA = 15;
    public static int MESSAGE_TYPE_MERGE_FORWARD = 11;
    public static int MESSAGE_TYPE_POST = 2;
    public static int MESSAGE_TYPE_SHARE_CALENDAR_EVENT = 16;
    public static int MESSAGE_TYPE_SHARE_GROUP_CHAT = 9;
    public static int MESSAGE_TYPE_SHARE_USER_CARD = 23;
    public static int MESSAGE_TYPE_STICKER = 10;
    public static int MESSAGE_TYPE_SYSTEM = 6;
    public static int MESSAGE_TYPE_TEXT = 4;
    public static int MESSAGE_TYPE_TEXT_IMAGE = 1;
    public static int MESSAGE_TYPE_VIDEO_CHAT = 19;
    private int code;
    private C66300a data;
    private String msg;

    public static class ContentDetail {
        private String content;
        @SerializedName("create_time")
        private long createTime;
        @SerializedName("message_type")
        private int messageType;
        @SerializedName("message_type_string")
        private String messageTypeString;
        @SerializedName("chat_id")
        private String openChatId;
        @SerializedName("message_id")
        private String openMessageId;
        @SerializedName("is_recalled")
        private boolean recalled;
        private UserInfo sender;
        private boolean support;

        public static class UserInfo {
            private String name;
            @SerializedName("open_id")
            private String openId;
            private String status;

            public String getName() {
                return this.name;
            }

            public String getOpenId() {
                return this.openId;
            }

            public String getStatus() {
                return this.status;
            }
        }

        public String getContent() {
            return this.content;
        }

        public long getCreateTime() {
            return this.createTime;
        }

        public int getMessageType() {
            return this.messageType;
        }

        public String getMessageTypeString() {
            return this.messageTypeString;
        }

        public String getOpenChatId() {
            return this.openChatId;
        }

        public String getOpenMessageId() {
            return this.openMessageId;
        }

        public UserInfo getSender() {
            return this.sender;
        }

        public boolean isRecalled() {
            return this.recalled;
        }

        public boolean isSupport() {
            return this.support;
        }

        public void setContent(String str) {
            this.content = str;
        }

        public void setMessageTypeString(String str) {
            this.messageTypeString = str;
        }

        public void setOpenChatId(String str) {
            this.openChatId = str;
        }

        public void setOpenMessageId(String str) {
            this.openMessageId = str;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.launchaction.bean.ActionMessageResult$a */
    public static class C66300a {
        @SerializedName("message_contents")

        /* renamed from: a */
        public Map<String, ContentDetail> f167322a;
    }

    public String getMsg() {
        return this.msg;
    }

    public Map<String, ContentDetail> getMessageContents() {
        C66300a aVar = this.data;
        if (aVar == null) {
            return null;
        }
        return aVar.f167322a;
    }

    public boolean isSuccess() {
        if (this.code != 0 || this.data == null || getMessageContents() == null || getMessageContents().size() == 0) {
            return false;
        }
        return true;
    }
}
