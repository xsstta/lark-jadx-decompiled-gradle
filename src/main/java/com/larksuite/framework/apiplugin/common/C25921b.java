package com.larksuite.framework.apiplugin.common;

import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.larksuite.framework.apiplugin.common.b */
public class C25921b {
    @JSONField(name = "__nativeBuffers__")
    private List<LKBasePluginResult.AbstractC25940a.C25941a> mArrayBuffers;
    @JSONField(serialize = false)
    public int mErrorCode = Integer.MIN_VALUE;
    @JSONField(name = ApiHandler.API_CALLBACK_ERRMSG)
    public String mErrorMessage;
    @JSONField(name = "innerCode")
    public int mInnerCode;
    @JSONField(name = "innerMsg")
    public String mInnerMsg;
    @JSONField(serialize = false)
    public boolean mIsArrayBuffer;
    @JSONField(serialize = false)
    private boolean mIsCease = true;

    public void proceed() {
        this.mIsCease = false;
    }

    public List<LKBasePluginResult.AbstractC25940a.C25941a> getArrayBuffers() {
        return this.mArrayBuffers;
    }

    public boolean isCease() {
        return this.mIsCease;
    }

    public void addArrayBuffer(LKBasePluginResult.AbstractC25940a.C25941a aVar) {
        if (this.mArrayBuffers == null) {
            this.mArrayBuffers = new ArrayList();
        }
        this.mArrayBuffers.add(aVar);
    }
}
