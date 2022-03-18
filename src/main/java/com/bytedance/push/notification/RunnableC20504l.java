package com.bytedance.push.notification;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.common.utility.NetworkClient;
import com.bytedance.push.PushSupporter;
import com.bytedance.push.interfaze.AbstractC20452o;
import com.bytedance.push.interfaze.AbstractC20455r;
import com.bytedance.push.p883e.C20405c;
import com.bytedance.push.settings.C20520j;
import com.bytedance.push.settings.LocalFrequencySettings;
import com.bytedance.push.utils.C20552c;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.android.message.p3002a.C59436a;
import com.ss.android.pushmanager.C59966d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.push.notification.l */
public final class RunnableC20504l implements Runnable {

    /* renamed from: a */
    public final AbstractC20455r f50032a;

    /* renamed from: b */
    private final Context f50033b;

    /* renamed from: c */
    private final AbstractC20452o f50034c;

    /* renamed from: d */
    private final C20405c f50035d;

    /* renamed from: e */
    private final boolean f50036e;

    /* renamed from: a */
    private void m74590a() {
        if (this.f50032a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                /* class com.bytedance.push.notification.RunnableC20504l.RunnableC205051 */

                public void run() {
                    RunnableC20504l.this.f50032a.mo68931a();
                }
            });
        }
    }

    public void run() {
        String str;
        LocalFrequencySettings localFrequencySettings = (LocalFrequencySettings) C20520j.m74724a(this.f50033b, LocalFrequencySettings.class);
        int c = C59436a.m230734c(this.f50033b);
        Map<String, String> commonParams = this.f50034c.getCommonParams();
        if (this.f50036e) {
            str = "0";
        } else {
            str = "1";
        }
        commonParams.put("notice", str);
        commonParams.put("system_notify_status", c + "");
        String a = C59436a.m230727a(C59966d.m232706b(), commonParams);
        try {
            JSONArray a2 = C20488g.m74540a().mo68981a(this.f50033b);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("out_app_channel_notify", a2.toString()));
            C20405c cVar = this.f50035d;
            if (cVar != null) {
                String a3 = cVar.mo68820a();
                if (!TextUtils.isEmpty(a3)) {
                    arrayList.add(new Pair("mute_setting", a3));
                }
                String b = this.f50035d.mo68821b();
                if (!TextUtils.isEmpty(b)) {
                    arrayList.add(new Pair("scene_status_list", b));
                }
            }
            NetworkClient.ReqContext reqContext = new NetworkClient.ReqContext();
            reqContext.addCommonParams = false;
            String post = NetworkClient.getDefault().post(a, arrayList, (Map<String, String>) null, reqContext);
            C20552c.m74845a("NoticeSync", "sendPushEnableToServer response = " + post);
            if (!TextUtils.isEmpty(post)) {
                String optString = new JSONObject(post).optString("message");
                if ("success".equals(optString)) {
                    localFrequencySettings.mo69019a(true);
                    localFrequencySettings.mo69015a(c);
                    localFrequencySettings.mo69033g(a2.toString());
                    localFrequencySettings.mo69021b(System.currentTimeMillis());
                    PushSupporter.monitor().markOuterSwitchUploadSuccess();
                    m74590a();
                    return;
                }
                this.f50034c.getMonitor().markOuterSwitchUploadFailed(302, post);
                m74591a(CommonCode.StatusCode.API_CLIENT_EXPIRED, optString);
            } else {
                this.f50034c.getMonitor().markOuterSwitchUploadFailed(304, post);
                m74591a(CommonCode.StatusCode.API_CLIENT_EXPIRED, "server return empty");
            }
            localFrequencySettings.mo69019a(false);
        } catch (Exception e) {
            localFrequencySettings.mo69019a(false);
            PushSupporter.monitor().markOuterSwitchUploadFailed(301, Log.getStackTraceString(e));
            e.printStackTrace();
            if (e instanceof IOException) {
                m74591a(1002, "network error : " + e.getMessage());
                return;
            }
            m74591a(1003, "unknown error: " + e.getMessage());
        }
    }

    /* renamed from: a */
    private void m74591a(final int i, final String str) {
        if (this.f50032a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                /* class com.bytedance.push.notification.RunnableC20504l.RunnableC205062 */

                public void run() {
                    RunnableC20504l.this.f50032a.mo68932a(i, str);
                }
            });
        }
    }

    RunnableC20504l(Context context, AbstractC20452o oVar, boolean z, C20405c cVar, AbstractC20455r rVar) {
        this.f50033b = context;
        this.f50034c = oVar;
        this.f50036e = z;
        this.f50035d = cVar;
        this.f50032a = rVar;
    }
}
