package com.larksuite.component.openplatform.plugins.device.nfc.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.LinkedList;
import java.util.List;

public class NfcResponseModel extends C25921b {
    @JSONField(name = "id")
    public byte[] mId;
    @JSONField(name = "length")
    public int mLength;
    @JSONField(name = "__nativeBuffers__")
    public List<NativeBuffers> mNativeBuffers = new LinkedList();
    @JSONField(name = "sak")
    public Short mSak;
    @JSONField(name = ShareHitPoint.f121869d)
    public byte[] mType;

    public static class NativeBuffers {
        @JSONField(name = "base64")
        public String mBase64;
        @JSONField(name = "key")
        public String mKey;
    }
}
