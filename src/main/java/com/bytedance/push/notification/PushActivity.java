package com.bytedance.push.notification;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.push.PushBody;
import com.bytedance.push.PushSupporter;
import com.bytedance.push.interfaze.AbstractC20449l;
import com.bytedance.push.interfaze.AbstractC20453p;
import com.bytedance.push.interfaze.IPushMsgHandler;
import com.bytedance.push.log.ILogger;
import com.bytedance.push.p887h.AbstractC20434a;
import com.bytedance.push.settings.C20520j;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.third.PushChannelHelper;
import com.bytedance.push.utils.C20552c;
import com.bytedance.push.utils.C20555f;
import com.bytedance.push.utils.C20559i;
import com.ss.android.push.C59957a;
import com.ss.android.ug.bus.C60442b;
import org.json.JSONException;
import org.json.JSONObject;

public class PushActivity extends Activity {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo68957a() {
        return false;
    }

    /* renamed from: b */
    private void mo68958b() {
        Intent intent = getIntent();
        if (intent == null) {
            PushSupporter.logger().mo68952e("PushActivity", "intent is null");
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                ILogger logger = PushSupporter.logger();
                logger.mo68949d("PushActivity", "onCreate: key = " + str + " , val = " + extras.get(str));
            }
        }
        boolean a = C59957a.m232684a(intent, "from_notification", false);
        String stringExtra = intent.getStringExtra("sig");
        String stringExtra2 = intent.getStringExtra("push_body");
        if (!a) {
            PushSupporter.logger().mo68952e("PushActivity", "fromNotification = false");
        } else if (TextUtils.isEmpty(stringExtra2)) {
            PushSupporter.logger().mo68952e("PushActivity", "msgBody is null");
        } else {
            boolean a2 = m74514a(stringExtra2, stringExtra, ((PushOnlineSettings) C20520j.m74724a(getApplicationContext(), PushOnlineSettings.class)).mo69061l());
            int a3 = C59957a.m232682a(intent, "message_from", 0);
            try {
                if (PushChannelHelper.inst(getApplicationContext()).isDirectOpenActivitySender(a3)) {
                    if (PushChannelHelper.inst(getApplicationContext()).isNeedUnzip(a3)) {
                        stringExtra2 = C20559i.m74876a(Base64.decode(stringExtra2, 8));
                        C20552c.m74845a("PushActivity", "Unzipped msgBody is : " + stringExtra2);
                    }
                    JSONObject jSONObject = new JSONObject(stringExtra2);
                    jSONObject.put("pass_through", 0);
                    stringExtra2 = jSONObject.toString();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            IPushMsgHandler pushHandler = PushSupporter.pushHandler();
            if (a2) {
                pushHandler.onClickMsg(this, stringExtra2, a3);
                return;
            }
            AbstractC20453p pVar = PushSupporter.get().getConfiguration().f49774E;
            if (pVar != null) {
                try {
                    pVar.mo68929a(this, new PushBody(new JSONObject(stringExtra2)), a3);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo68958b();
        finish();
    }

    /* renamed from: a */
    private boolean m74514a(String str, String str2, int i) {
        C20552c.m74853d("PushActivity", "checkSource " + str);
        if (i <= 0) {
            return true;
        }
        if (mo68957a() || ((AbstractC20434a) C60442b.m234863a(AbstractC20434a.class)).mo68897a(str)) {
            C20552c.m74853d("PushActivity", "checkSource true " + str);
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!TextUtils.isEmpty(str2)) {
            C20555f.C20556a a = C20555f.m74871a(str, "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEul5lp8sfpVIXgDHaLBjSYt4h0vSF\nSxh0kbpM5nXdkrz8UxQuIOYKO2PzySqmzxL5Ts3rHbMzG8wV+QzS0DVKBQ==", str2);
            m74513a(a.f50130a, a.f50131b, System.currentTimeMillis() - currentTimeMillis, str, str2);
            if (a.f50130a) {
                C20552c.m74853d("PushActivity", "sign success" + str);
            } else {
                C20552c.m74850b("PushActivity", "verify sign failed");
            }
            if (i < 2) {
                return true;
            }
            return a.f50130a;
        }
        C20552c.m74850b("PushActivity", "sign is null or isn't string");
        m74513a(false, "sign is empty", System.currentTimeMillis() - currentTimeMillis, str, str2);
        if (i < 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m74513a(boolean z, String str, long j, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("reason", str);
            jSONObject.put("duration", j);
            jSONObject2.put("msg_body", str2);
            jSONObject2.put("sig", str3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ((AbstractC20449l) C60442b.m234863a(AbstractC20449l.class)).mo68866a("push_source_verify_sign_v2", z ? 1 : 0, jSONObject, jSONObject2);
    }
}
