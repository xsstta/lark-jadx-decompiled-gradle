package com.larksuite.framework.apiplugin.common;

import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import java.util.ArrayList;
import java.util.List;

public class UG {

    public static class ShareRequest extends C25920a {
        @JSONField(name = "channelType")
        public List<String> mChannelType = new ArrayList();
        @JSONField(name = "content")
        public String mContent;
        @JSONField(name = "contentType")
        @LKRequiredParam
        public String mContentType;
        @JSONField(name = "image")
        public String mImage;
        @JSONField(name = "title")
        public String mTitle;
        @JSONField(name = "url")
        public String mUrl;
    }

    public static class ShareResponse extends C25921b {
        @JSONField(name = "channelType")
        public String mChannelType;
    }

    public enum ShareChannelType {
        WX("wx"),
        WX_TIMELINE("wx_timeline"),
        SYSTEM("system");
        
        public String mValue;

        private ShareChannelType(String str) {
            this.mValue = str;
        }
    }

    public enum ShareContentType {
        TEXT("text"),
        IMAGE("image"),
        WEB_URL("url");
        
        public final String mValue;

        private ShareContentType(String str) {
            this.mValue = str;
        }
    }
}
