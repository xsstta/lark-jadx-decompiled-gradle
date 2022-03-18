package com.larksuite.framework.apiplugin.common;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.firebase.messaging.Constants;

public class LKFireEvent {

    public static class Request extends C25920a {
        @JSONField(name = "action")
        public String mAction;
        @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
        public JSONObject mData;
        @JSONField(name = "useArrayBuffer")
        public boolean mUseArrayBuffer;
    }

    public static class Response extends C25921b {
    }
}
