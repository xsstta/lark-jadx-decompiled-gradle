package com.larksuite.framework.apiplugin.common;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

public class OPMonitorReportModel {

    public static class Response extends C25921b {
    }

    public static class Request extends C25920a {
        @JSONField(name = "errorCode")
        public String mErrorCode;
        @JSONField(name = "errorMsg")
        public String mErrorMessage;
        @JSONField(name = "eventName")
        public String mEventName;
        @JSONField(name = "monitorCode")
        public OPInnerMonitorCode mMonitorCode;

        public static class OPInnerMonitorCode extends C25920a {
            @JSONField(name = "code")
            public int mCode;
            @JSONField(name = "domain")
            public String mDomain;
            @JSONField(name = "ID")
            public String mID;
            @JSONField(name = "level")
            public OPMonitorLevel mLevel;
            @JSONField(name = "message")
            public String mMessage;

            public OPInnerMonitorCode adapter(OPMonitorCode oPMonitorCode) {
                this.mCode = oPMonitorCode.code;
                this.mDomain = oPMonitorCode.domain;
                this.mID = oPMonitorCode.ID;
                this.mLevel = oPMonitorCode.level;
                this.mMessage = oPMonitorCode.message;
                return this;
            }
        }
    }
}
