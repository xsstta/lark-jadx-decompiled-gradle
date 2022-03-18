package com.fcm.service;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.FcmJobIntentService;
import com.bytedance.push.PushSupporter;
import com.bytedance.push.log.ILogger;
import com.fcm.FcmPushAdapter;
import com.fcm.p963a.C21281a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import org.json.JSONObject;

public class FcmRegistrationJobIntentService extends FcmJobIntentService {
    /* access modifiers changed from: protected */
    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(Intent intent) {
        String stringExtra = intent.getStringExtra("key_token");
        ILogger logger = PushSupporter.logger();
        logger.mo68955i("Fcm", "getToken = " + stringExtra);
        try {
            C21281a.m77098a(this, stringExtra);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("label", "get_token");
            jSONObject.put(ShareHitPoint.f121869d, FcmPushAdapter.getFcmPush());
            jSONObject.put("token", stringExtra);
            PushSupporter.thirdService().sendMonitor(this, "ss_push", jSONObject);
        } catch (Throwable th) {
            ILogger logger2 = PushSupporter.logger();
            logger2.mo68952e("Fcm", "Error = " + th.getMessage());
        }
    }

    public static void enqueueWork(Context context, Intent intent) {
        enqueueWork(context, FcmRegistrationJobIntentService.class, 101, intent);
    }
}
