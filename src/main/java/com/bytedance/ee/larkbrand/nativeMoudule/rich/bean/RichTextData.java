package com.bytedance.ee.larkbrand.nativeMoudule.rich.bean;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.apiplugin.common.C25920a;
import java.util.List;

public class RichTextData extends C25920a {
    @JSONField(name = "at")
    private AtData[] at;
    @JSONField(name = "avatar")
    private String avatar;
    @JSONField(name = "content")
    private String content;
    @JSONField(name = "customize")
    private boolean customize;
    @JSONField(name = "enablesReturnKey")
    private boolean enablesReturnKey;
    @JSONField(name = "eventName")
    private String eventName;
    @JSONField(name = "userModelSelect")
    private UserModel mode;
    @JSONField(name = "picture")
    private String[] picture;
    @JSONField(name = "placeholder")
    private String placeholder;
    @JSONField(name = "showEmoji")
    private boolean showEmoji;

    public static class AtData extends C25920a {
        @JSONField(name = "color")
        private String color;
        @JSONField(name = "id")
        private String id;
        private String larkId;
        @JSONField(name = "length")
        private int length;
        @JSONField(name = "name")
        private String name;
        @JSONField(name = "offset")
        private int offset;

        public String getColor() {
            return this.color;
        }

        public String getId() {
            return this.id;
        }

        public String getLarkId() {
            return this.larkId;
        }

        public int getLength() {
            return this.length;
        }

        public String getName() {
            return this.name;
        }

        public int getOffset() {
            return this.offset;
        }

        public void setColor(String str) {
            this.color = str;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setLarkId(String str) {
            this.larkId = str;
        }

        public void setLength(int i) {
            this.length = i;
        }

        public void setOffset(int i) {
            this.offset = i;
        }

        public void setName(String str) {
            if (!TextUtils.isEmpty(str) && !str.startsWith("@")) {
                str = "@" + str;
            }
            this.name = str;
        }
    }

    public static class UserModel extends C25920a {
        @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
        private String data;
        @JSONField(name = "items")
        private List<String> items;

        public String getData() {
            return this.data;
        }

        public List<String> getItems() {
            return this.items;
        }

        public void setData(String str) {
            this.data = str;
        }

        public void setItems(List<String> list) {
            this.items = list;
        }
    }

    public AtData[] getAt() {
        return this.at;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getContent() {
        return this.content;
    }

    public String getEventName() {
        return this.eventName;
    }

    public UserModel getMode() {
        return this.mode;
    }

    public String[] getPicture() {
        return this.picture;
    }

    public String getPlaceholder() {
        return this.placeholder;
    }

    public boolean isCustomize() {
        return this.customize;
    }

    public boolean isEnablesReturnKey() {
        return this.enablesReturnKey;
    }

    public boolean isShowEmoji() {
        return this.showEmoji;
    }

    public void setAt(AtData[] atDataArr) {
        this.at = atDataArr;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCustomize(boolean z) {
        this.customize = z;
    }

    public void setEnablesReturnKey(boolean z) {
        this.enablesReturnKey = z;
    }

    public void setEventName(String str) {
        this.eventName = str;
    }

    public void setMode(UserModel userModel) {
        this.mode = userModel;
    }

    public void setPicture(String[] strArr) {
        this.picture = strArr;
    }

    public void setPlaceholder(String str) {
        this.placeholder = str;
    }

    public void setShowEmoji(boolean z) {
        this.showEmoji = z;
    }
}
