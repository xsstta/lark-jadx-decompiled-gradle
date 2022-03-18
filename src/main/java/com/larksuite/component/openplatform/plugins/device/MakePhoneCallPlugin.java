package com.larksuite.component.openplatform.plugins.device;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.plugins.utils.C25611a;
import com.larksuite.framework.apiplugin.AbstractC25889a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.log.Log;

public class MakePhoneCallPlugin extends AbstractC25889a {

    public static class MakePhoneCallRequest extends C25920a {
        @JSONField(name = "phoneNumber")
        public String mPhoneNumber;
    }

    public static class MakePhoneCallResponse extends C25921b {
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    @LKPluginFunction(async = true, eventName = {"makePhoneCall"})
    public void makePhoneCall(MakePhoneCallRequest makePhoneCallRequest, AbstractC25897h<MakePhoneCallResponse> hVar, AbstractC25905b bVar) {
        Log.m165389i("MakePhoneCallPlugin", "start make phone call api");
        Context a = bVar.mo92207a();
        String str = makePhoneCallRequest.mPhoneNumber;
        if (!TextUtils.isEmpty(str)) {
            try {
                if (!str.startsWith("tel:")) {
                    str = "tel:" + str;
                }
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(str));
                intent.setFlags(268435456);
                a.startActivity(intent);
                hVar.callback(null);
            } catch (Exception e) {
                MakePhoneCallResponse makePhoneCallResponse = new MakePhoneCallResponse();
                fillFailedResponse(makePhoneCallResponse, C25906a.f64080j, C25611a.m91379a(e));
                hVar.callback(makePhoneCallResponse);
                Log.m165386e("MakePhoneCallPlugin", e);
            }
        } else {
            MakePhoneCallResponse makePhoneCallResponse2 = new MakePhoneCallResponse();
            fillFailedResponse(makePhoneCallResponse2, C25906a.f64072b, "phone number is null");
            hVar.callback(makePhoneCallResponse2);
            Log.m165383e("MakePhoneCallPlugin", "phone number is null");
        }
    }
}
