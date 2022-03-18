package com.bytedance.push.p889j;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.push.PushSupporter;
import com.bytedance.push.interfaze.AbstractC20450m;
import com.bytedance.push.p883e.C20404b;
import com.bytedance.push.p884f.p885a.AbstractC20415a;
import com.bytedance.push.settings.C20520j;
import com.bytedance.push.settings.LocalFrequencySettings;
import com.bytedance.push.third.PushChannelHelper;
import com.bytedance.push.utils.C20552c;
import com.ss.android.message.AppProvider;
import com.ss.android.pushmanager.setting.C59971b;
import com.ss.android.ug.bus.C60442b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.j.d */
public class C20464d {

    /* renamed from: a */
    private final AbstractC20450m f49945a;

    /* renamed from: b */
    private volatile boolean f49946b;

    /* renamed from: c */
    private volatile AtomicBoolean f49947c = new AtomicBoolean(false);

    public C20464d(AbstractC20450m mVar) {
        this.f49945a = mVar;
    }

    /* renamed from: a */
    private void m74478a(Context context) {
        if (this.f49947c.compareAndSet(false, true)) {
            m74480a(context, C59971b.m232728b().mo68922a(), false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x023e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo68939a(boolean r18) {
        /*
        // Method dump skipped, instructions count: 582
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.p889j.C20464d.mo68939a(boolean):void");
    }

    /* renamed from: a */
    private void m74477a(Application application, JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String optString = jSONObject.optString("id");
                    String optString2 = jSONObject.optString("name");
                    if (!TextUtils.isEmpty(optString)) {
                        if (!TextUtils.isEmpty(optString2)) {
                            arrayList.add(new C20404b(jSONObject));
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            PushSupporter.get().getNotificationService().mo68917a(application, arrayList);
        }
    }

    /* renamed from: a */
    private void m74479a(Context context, int i, String str) {
        PushSupporter.monitor().markUpdateSenderFailed(i, str);
        C20552c.m74850b("Start", "request UPDATE_SENDER_URL failed: " + str);
        m74478a(context);
    }

    /* renamed from: a */
    private void m74480a(Context context, String str, boolean z) {
        AbstractC20415a aVar = (AbstractC20415a) C60442b.m234863a(AbstractC20415a.class);
        if (aVar != null) {
            aVar.mo68845a(str, z);
        }
        boolean hasSupportChannel = PushChannelHelper.inst(context).hasSupportChannel(str);
        C20552c.m74845a("Start", "tryRegisterServerPush " + str + " hasSupport = " + hasSupportChannel);
        boolean z2 = false;
        if (z && !hasSupportChannel) {
            str = C59971b.m232728b().mo68922a();
            if (!PushChannelHelper.inst(context).hasSupportChannel(str)) {
                PushSupporter.monitor().monitorSenderSupport(false, str);
                if (aVar != null) {
                    aVar.mo68849b(str, false);
                    return;
                }
                return;
            }
        }
        C20552c.m74845a("Start", "tryRegisterAllSelectedPush: the senders = " + str);
        if (z && hasSupportChannel) {
            z2 = true;
        }
        PushChannelHelper.handlerApplogConfig(str, z2);
        if (aVar != null) {
            aVar.mo68849b(str, true);
        }
        PushSupporter.monitor().monitorSenderSupport(this.f49945a.mo68834a(context), str);
    }

    /* renamed from: a */
    private void m74481a(String str, Application application, String str2, String str3, String str4, String str5, String str6, String str7) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            m74479a(application, 304, str);
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (!TextUtils.equals("success", jSONObject.optString("message"))) {
            m74479a(application, 302, str);
            return;
        }
        PushSupporter.get().setFrontierSetting(jSONObject.optJSONObject("frontier_setting"));
        m74477a(application, jSONObject.optJSONArray("channels"));
        String optString = jSONObject.optString("allow_push_list");
        if (TextUtils.isEmpty(optString)) {
            m74479a(application, 303, str);
            return;
        }
        LocalFrequencySettings localFrequencySettings = (LocalFrequencySettings) C20520j.m74724a(application, LocalFrequencySettings.class);
        localFrequencySettings.mo69016a(System.currentTimeMillis());
        localFrequencySettings.mo69017a(str3);
        localFrequencySettings.mo69025c(str5);
        localFrequencySettings.mo69027d(str6);
        localFrequencySettings.mo69029e(str7);
        localFrequencySettings.mo69031f(str2);
        localFrequencySettings.mo69022b(str4);
        boolean z = false;
        try {
            if (new JSONArray(optString).length() > 0) {
                z = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!z) {
            m74479a(application, 303, str);
        } else {
            PushSupporter.monitor().markUpdateSenderSuccess();
        }
        this.f49947c.set(true);
        m74480a((Context) AppProvider.getApp(), optString, true);
    }
}
