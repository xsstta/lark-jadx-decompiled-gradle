package com.larksuite.component.openplatform.plugins.device.nfc.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.plugins.device.nfc.model.NfcResponseModel;
import com.larksuite.framework.apiplugin.common.C25921b;
import java.util.LinkedList;
import java.util.List;

public class NfcCallbackResponseModel extends C25921b {
    @JSONField(name = "__nativeBuffers__")
    public List<NfcResponseModel.NativeBuffers> mNativeBuffers = new LinkedList();
    @JSONField(name = "messages")
    public List<NfcResponseModel> mNfcResponseModelList = new LinkedList();
    @JSONField(name = "techs")
    public List<String> mTechList = new LinkedList();
}
