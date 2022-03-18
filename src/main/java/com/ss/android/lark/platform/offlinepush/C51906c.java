package com.ss.android.lark.platform.offlinepush;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.dto.OfflineNotice;
import com.ss.android.lark.platform.p2496p.C51907a;
import com.ss.lark.android.module.offlinepush.C64266c;

/* renamed from: com.ss.android.lark.platform.offlinepush.c */
public final class C51906c implements C64266c.AbstractC64277d {
    @Override // com.ss.lark.android.module.offlinepush.C64266c.AbstractC64277d
    /* renamed from: a */
    public void mo178091a(Context context, String str, int i, String str2) {
        Log.m165389i("OfflinePushListener", "[onReceiveVoip] voipParams=" + str2);
        JSONObject parseObject = JSONObject.parseObject(str);
        parseObject.put(ShareHitPoint.f121869d, (Object) 20002);
        mo178092b(context, parseObject.toJSONString(), i, str2);
    }

    @Override // com.ss.lark.android.module.offlinepush.C64266c.AbstractC64277d
    /* renamed from: b */
    public void mo178092b(Context context, String str, int i, String str2) {
        Log.m165379d("OfflinePushListener", "Packet received! " + str);
        Log.m165389i("OfflinePushListener", "[onReceive] offline push msg.");
        if (!C36083a.m141486a().getPassportDependency().mo133094m().mo172428i()) {
            Log.m165382e("When receiving an offline push, the phone is already in an logout state！");
        } else if (str == null) {
            Log.m165383e("OfflinePushListener", "[onReceive]msg is null!");
        } else {
            JSONObject parseObject = JSONObject.parseObject(str);
            C51907a.m201314a();
            OfflineNotice offlineNotice = new OfflineNotice(parseObject, i);
            Integer integer = parseObject.getInteger(ShareHitPoint.f121869d);
            if (integer != null) {
                offlineNotice.type = integer.intValue();
            }
            if (offlineNotice.type == 20002) {
                offlineNotice.voipParams = str2;
            }
            C51907a.m201314a().mo169320b().mo169512a(offlineNotice);
            Log.m165389i("OfflinePushListener", "[onReceive]v2: Sid = " + offlineNotice.getMsgSid() + " Rid:" + offlineNotice.getRuleId() + " timestamp = " + offlineNotice.getSendTimeStamp());
        }
    }
}
