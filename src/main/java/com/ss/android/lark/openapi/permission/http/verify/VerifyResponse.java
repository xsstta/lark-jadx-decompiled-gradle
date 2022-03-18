package com.ss.android.lark.openapi.permission.http.verify;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.http.model.BaseResponseModel;
import java.io.Serializable;

public class VerifyResponse extends BaseResponseModel {
    @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    public VerifyDataNode mDataNode;
    @JSONField(name = "msg")
    public String mErrorMsg;

    public static class VerifyDataNode implements Serializable {
        @JSONField(name = "expire_time")
        private long expireTime;
        @JSONField(name = "jssdk_session")
        public String mJsSDKSession;
        @JSONField(name = "session_key")
        public String mSessionKey;

        public long getExpireTime() {
            return this.expireTime;
        }

        public void setExpireTime(long j) {
            this.expireTime = j;
        }
    }
}
