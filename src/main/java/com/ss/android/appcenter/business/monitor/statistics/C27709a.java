package com.ss.android.appcenter.business.monitor.statistics;

import com.ss.android.appcenter.C27528a;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.NetworkUtils;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.appcenter.business.monitor.statistics.a */
public class C27709a {

    /* renamed from: a */
    private JSONObject f69270a = new JSONObject();

    /* renamed from: b */
    private JSONObject f69271b = new JSONObject();

    /* renamed from: c */
    private String f69272c;

    /* renamed from: a */
    public void mo98868a() {
        if (C27548m.m100547m().mo98216a() != null && C27548m.m100547m().mo98218b() != null && !C27548m.m100547m().mo98218b().mo98173d()) {
            try {
                this.f69270a.put("network", NetworkUtils.m103218b(C27528a.m100471a().mo98143b()));
            } catch (JSONException e) {
                C28184h.m103248b("AppCenterMonitorBuilder", "addnetwork error! " + e.getMessage());
                e.printStackTrace();
            }
            C27548m.m100547m().mo98216a().mo98159a(this.f69272c, this.f69270a, this.f69271b, new JSONObject());
        }
    }

    public C27709a(String str) {
        this.f69272c = str;
    }

    /* renamed from: a */
    public C27709a mo98865a(int i) {
        try {
            this.f69270a.put("error_code", i);
        } catch (JSONException e) {
            C28184h.m103248b("AppCenterMonitorBuilder", "addErrorCode error! " + e.getMessage());
            e.printStackTrace();
        }
        return this;
    }

    /* renamed from: b */
    public C27709a mo98869b(String str) {
        try {
            this.f69270a.put("state", str);
        } catch (JSONException e) {
            C28184h.m103248b("AppCenterMonitorBuilder", "addState error! " + e.getMessage());
            e.printStackTrace();
        }
        return this;
    }

    /* renamed from: a */
    public C27709a mo98866a(long j) {
        try {
            this.f69271b.put("duration", j);
        } catch (JSONException e) {
            C28184h.m103248b("AppCenterMonitorBuilder", "addDuration error! " + e.getMessage());
            e.printStackTrace();
        }
        return this;
    }

    /* renamed from: a */
    public C27709a mo98867a(String str) {
        try {
            this.f69270a.put("error_msg", str);
        } catch (JSONException e) {
            C28184h.m103248b("AppCenterMonitorBuilder", "addErrorMsg error! " + e.getMessage());
            e.printStackTrace();
        }
        return this;
    }
}
