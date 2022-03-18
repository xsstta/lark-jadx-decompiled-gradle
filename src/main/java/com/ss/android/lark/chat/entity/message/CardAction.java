package com.ss.android.lark.chat.entity.message;

import com.squareup.wire.WireEnum;
import java.io.Serializable;
import java.util.Map;

public class CardAction implements Serializable {
    private int cmd;
    private Method method;
    private OpenUrl openUrl;
    private CardActionPacket packet;
    private Parameters parameters;
    private RequiredParameters requiredParameters;
    private String url;

    public static class MessageInfo implements Serializable {
        private String messageOpenId;

        public String getMessageOpenId() {
            return this.messageOpenId;
        }

        public void setMessageOpenId(String str) {
            this.messageOpenId = str;
        }
    }

    public enum Method implements WireEnum {
        GET(1),
        POST(2),
        LARK_COMMAND(3),
        OPEN_URL(4);
        
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Method fromValue(int i) {
            if (i == 1) {
                return GET;
            }
            if (i == 2) {
                return POST;
            }
            if (i == 3) {
                return LARK_COMMAND;
            }
            if (i != 4) {
                return null;
            }
            return OPEN_URL;
        }

        private Method(int i) {
            this.value = i;
        }
    }

    public static class OpenUrl implements Serializable {
        private String androidUrl;
        private String iosUrl;
        private String pcUrl;
        private String url;

        public String getAndroidUrl() {
            return this.androidUrl;
        }

        public String getIosUrl() {
            return this.iosUrl;
        }

        public String getPcUrl() {
            return this.pcUrl;
        }

        public String getUrl() {
            return this.url;
        }

        public void setAndroidUrl(String str) {
            this.androidUrl = str;
        }

        public void setIosUrl(String str) {
            this.iosUrl = str;
        }

        public void setPcUrl(String str) {
            this.pcUrl = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }
    }

    public static class Parameters implements Serializable {
        private String messageId;
        private MessageInfo messageInfo;
        private Map<String, String> parameters;
        private String userId;
        private UserInfo userInfo;

        public String getMessageId() {
            return this.messageId;
        }

        public MessageInfo getMessageInfo() {
            return this.messageInfo;
        }

        public Map<String, String> getParameters() {
            return this.parameters;
        }

        public String getUserId() {
            return this.userId;
        }

        public UserInfo getUserInfo() {
            return this.userInfo;
        }

        public void setMessageId(String str) {
            this.messageId = str;
        }

        public void setMessageInfo(MessageInfo messageInfo2) {
            this.messageInfo = messageInfo2;
        }

        public void setParameters(Map<String, String> map) {
            this.parameters = map;
        }

        public void setUserId(String str) {
            this.userId = str;
        }

        public void setUserInfo(UserInfo userInfo2) {
            this.userInfo = userInfo2;
        }
    }

    public static class RequiredParameters implements Serializable {
        private boolean needMessageId;
        private boolean needMessageInfo;
        private boolean needUserId;
        private boolean needUserInfo;

        public boolean isNeedMessageId() {
            return this.needMessageId;
        }

        public boolean isNeedMessageInfo() {
            return this.needMessageInfo;
        }

        public boolean isNeedUserId() {
            return this.needUserId;
        }

        public boolean isNeedUserInfo() {
            return this.needUserInfo;
        }

        public void setNeedMessageId(boolean z) {
            this.needMessageId = z;
        }

        public void setNeedMessageInfo(boolean z) {
            this.needMessageInfo = z;
        }

        public void setNeedUserId(boolean z) {
            this.needUserId = z;
        }

        public void setNeedUserInfo(boolean z) {
            this.needUserInfo = z;
        }
    }

    public static class UserInfo implements Serializable {
        private String userOpenId;

        public String getUserOpenId() {
            return this.userOpenId;
        }

        public void setUserOpenId(String str) {
            this.userOpenId = str;
        }
    }

    public int getCmd() {
        return this.cmd;
    }

    public Method getMethod() {
        return this.method;
    }

    public OpenUrl getOpenUrl() {
        return this.openUrl;
    }

    public CardActionPacket getPacket() {
        return this.packet;
    }

    public Parameters getParameters() {
        return this.parameters;
    }

    public RequiredParameters getRequiredParameters() {
        return this.requiredParameters;
    }

    public String getUrl() {
        return this.url;
    }

    public void setCmd(int i) {
        this.cmd = i;
    }

    public void setMethod(Method method2) {
        this.method = method2;
    }

    public void setOpenUrl(OpenUrl openUrl2) {
        this.openUrl = openUrl2;
    }

    public void setPacket(CardActionPacket cardActionPacket) {
        this.packet = cardActionPacket;
    }

    public void setParameters(Parameters parameters2) {
        this.parameters = parameters2;
    }

    public void setRequiredParameters(RequiredParameters requiredParameters2) {
        this.requiredParameters = requiredParameters2;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
