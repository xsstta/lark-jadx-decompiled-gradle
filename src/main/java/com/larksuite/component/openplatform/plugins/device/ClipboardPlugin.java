package com.larksuite.component.openplatform.plugins.device;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.plugins.utils.C25611a;
import com.larksuite.framework.apiplugin.AbstractC25889a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKPluginParam;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.log.Log;
import java.util.HashMap;

public class ClipboardPlugin extends AbstractC25889a {

    public static class ClipboardResponse extends C25921b {
        @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
        public String mData;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    @LKPluginFunction(async = true, eventName = {"getClipboardData"})
    public void getClipboardData(AbstractC25897h<ClipboardResponse> hVar, AbstractC25905b bVar) {
        String a = C25582a.m91295a(bVar.mo92207a());
        Log.m165389i("ContentValues", "api getClipboardData, content length:" + a.length());
        new HashMap().put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, a);
        ClipboardResponse clipboardResponse = new ClipboardResponse();
        clipboardResponse.mData = a;
        hVar.callback(clipboardResponse);
    }

    @LKPluginFunction(async = true, eventName = {"setClipboardData"})
    public void setClipboardData(AbstractC25897h<ClipboardResponse> hVar, @LKPluginParam("data") String str, AbstractC25905b bVar) {
        int i;
        ClipboardResponse clipboardResponse = new ClipboardResponse();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("api setClipboardData, data length");
            if (str == null) {
                i = 0;
            } else {
                i = str.length();
            }
            sb.append(i);
            Log.m165389i("ContentValues", sb.toString());
            C25582a.m91296a(str, bVar.mo92207a());
            clipboardResponse.mData = str;
        } catch (Exception e) {
            fillFailedResponse(clipboardResponse, C25906a.f64080j, C25611a.m91379a(e));
            Log.m165384e("ContentValues", "api setClipboardData fail", e);
        }
        hVar.callback(clipboardResponse);
    }
}
