package com.larksuite.framework.apiplugin.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.ss.android.lark.log.Log;
import com.tt.frontendapiinterface.ApiHandler;

/* renamed from: com.larksuite.framework.apiplugin.common.a */
public class C25920a {
    @JSONField(name = "appIdentify")
    public String mAppIdentify;
    @JSONField(serialize = false)
    private LKBasePluginResult.AbstractC25940a.C25941a mArrayBuffer;
    @JSONField(name = "isBackground")
    public boolean mIsBackground;

    public LKBasePluginResult.AbstractC25940a.C25941a getArrayBuffers() {
        return this.mArrayBuffer;
    }

    public String toString() {
        try {
            return JSON.toJSONString(this);
        } catch (Exception e) {
            Log.m165384e("LKBaseRequestModel", ApiHandler.API_CALLBACK_EXCEPTION, e);
            return "LKBaseRequestModel{mAppIdentify='" + this.mAppIdentify + '\'' + ", mIsBackground=" + this.mIsBackground + '}';
        }
    }

    public void setArrayBuffer(LKBasePluginResult.AbstractC25940a.C25941a aVar) {
        this.mArrayBuffer = aVar;
    }
}
