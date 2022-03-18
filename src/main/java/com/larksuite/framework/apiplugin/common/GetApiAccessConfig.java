package com.larksuite.framework.apiplugin.common;

import com.alibaba.fastjson.annotation.JSONField;

public final class GetApiAccessConfig {

    public static class GetDomainResponse extends C25921b {
        @JSONField(name = "bitType")
        public String mBizType;
        @JSONField(name = "domain")
        public String mDomain;
        @JSONField(name = "scene")
        public String mScene;
    }
}
