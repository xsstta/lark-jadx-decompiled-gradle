package com.larksuite.component.openplatform.plugins.device.nfc.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.plugins.device.nfc.model.NfcResponseModel;
import com.larksuite.framework.apiplugin.common.C25920a;
import java.util.LinkedList;
import java.util.List;

public class NfcRequestModel extends C25920a {
    @JSONField(name = "__nativeBuffers__")
    public List<NfcResponseModel.NativeBuffers> mNativeBuffers = new LinkedList();
    @JSONField(name = "timeout")
    public int mTimeOut;
    @JSONField(name = "tech")
    public String mType;
}
