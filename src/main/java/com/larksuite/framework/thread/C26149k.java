package com.larksuite.framework.thread;

import com.ss.android.lark.log.Log;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.larksuite.framework.thread.k */
public class C26149k {

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.thread.k$a */
    public static class C26151a {

        /* renamed from: a */
        public static final C26149k f64586a = new C26149k();
    }

    private C26149k() {
    }

    /* renamed from: a */
    static C26149k m94631a() {
        return C26151a.f64586a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo93081a(JSONObject jSONObject) {
        if (jSONObject != null && CoreThreadPool.mCoreThreadPoolDep != null) {
            CoreThreadPool.mCoreThreadPoolDep.mo93030a(jSONObject);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo93077a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("taskname", str);
            jSONObject.put("poolname", str2);
            jSONObject.put("reject", true);
        } catch (Exception unused) {
            Log.m165383e("CoreTaskMonitor", "genRejectTaskEvent gen json failed");
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo93078a(String str, String str2, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("taskname", str);
            jSONObject.put("poolname", str2);
            jSONObject.put("longruntaskname", str);
            jSONObject.put("taskrunningtime", j);
        } catch (Exception unused) {
            Log.m165383e("CoreTaskMonitor", "genRejectTaskEvent gen json failed");
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo93079a(String str, String str2, long j, long j2, long j3, long j4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("taskname", str);
            jSONObject.put("poolname", str2);
            jSONObject.put("poolqueuewaittime", j);
            jSONObject.put("run_time", j2);
            jSONObject.put("maxdispatchtime", j3);
            jSONObject.put("maxruntime", j4);
            if (j2 > j4) {
                jSONObject.put("overruntaskname", str);
            }
            if (j > j3) {
                jSONObject.put("overwaittaskname", str);
            }
        } catch (Exception unused) {
            Log.m165383e("CoreTaskMonitor", "genTaskEvent gen json failed");
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo93080a(String str, String str2, long j, long j2, long j3, long j4, long j5, long j6) {
        JSONObject a = mo93079a(str, str2, j2, j3, j5, j6);
        if (a == null) {
            return null;
        }
        try {
            a.put("serialqueuewaittime", j);
            a.put("maxserialqueuewaittime", j4);
        } catch (Exception unused) {
            Log.m165383e("CoreTaskMonitor", "genSerialTaskEvent gen json failed");
        }
        return a;
    }
}
