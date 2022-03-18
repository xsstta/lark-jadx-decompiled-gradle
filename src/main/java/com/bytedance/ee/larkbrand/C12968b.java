package com.bytedance.ee.larkbrand;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import com.bytedance.ee.lark.infra.foundation.utils.C12787e;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.larkbrand.service.ExtensionWrapper;
import com.bytedance.ee.larkbrand.utils.DebugUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.miniapp.util.MiniAppDateUtils;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.b */
public class C12968b {

    /* renamed from: a */
    public List<String> f34515a;

    /* renamed from: b */
    public boolean f34516b;

    /* renamed from: c */
    private volatile boolean f34517c;

    /* renamed from: d */
    private volatile JSONArray f34518d;

    /* renamed from: com.bytedance.ee.larkbrand.b$a */
    private static class C12973a {

        /* renamed from: a */
        public static final C12968b f34526a = new C12968b();
    }

    /* renamed from: a */
    public static C12968b m53393a() {
        return C12973a.f34526a;
    }

    /* renamed from: c */
    private void m53396c() {
        this.f34517c = false;
        this.f34518d = new JSONArray();
    }

    private C12968b() {
        this.f34515a = Collections.synchronizedList(new ArrayList());
        this.f34516b = C12782a.m52839b("enable_launch_tracing", false);
    }

    /* renamed from: b */
    public void mo48870b() {
        this.f34517c = true;
        if (this.f34518d == null || this.f34518d.length() == 0) {
            AppBrandLogger.m52830i("DebugLaunchTracing", "no tracing events");
            return;
        }
        m53397d();
    }

    /* renamed from: d */
    private void m53397d() {
        AppBrandLogger.m52828d("DebugLaunchTracing", "http request params :" + this.f34518d.toString());
        HashMap hashMap = new HashMap();
        final JSONObject jSONObject = new JSONObject();
        try {
            final JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("model", Build.MODEL);
            jSONObject2.put("system", Build.VERSION.SDK_INT);
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            LarkExtensionManager.getInstance().getExtension().getDeviceId(new ExtensionWrapper.AbstractC13303a() {
                /* class com.bytedance.ee.larkbrand.C12968b.C129702 */

                @Override // com.bytedance.ee.larkbrand.service.ExtensionWrapper.AbstractC13303a
                /* renamed from: a */
                public void mo48821a(String str) {
                    try {
                        jSONObject2.put("did", str);
                    } catch (JSONException e) {
                        AppBrandLogger.m52829e("DebugLaunchTracing", "JSONException", e);
                    }
                    countDownLatch.countDown();
                }

                @Override // com.bytedance.ee.larkbrand.service.ExtensionWrapper.AbstractC13303a
                /* renamed from: b */
                public void mo48822b(String str) {
                    try {
                        jSONObject2.put("did", "0");
                    } catch (JSONException e) {
                        AppBrandLogger.m52829e("DebugLaunchTracing", "JSONException", e);
                    }
                    countDownLatch.countDown();
                }
            });
            jSONObject.put("device", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, C12787e.m52853a(AppbrandContext.getInst().getApplicationContext()));
            jSONObject.put("app", jSONObject3);
            jSONObject.put("tracing_events", this.f34518d);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("name", "bytest-性能测试");
            jSONObject4.put("scene", "test-" + MiniAppDateUtils.m261179a(System.currentTimeMillis()));
            jSONObject4.put("commit", "12345");
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("comparative_test", jSONObject4);
            jSONObject.put(ShareHitPoint.f121869d, jSONObject5);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("DebugLaunchTracing", "Exception", e);
        }
        C12843b.m53038a("http://10.69.92.155:3001/gadget/launch", hashMap, jSONObject, C67448a.m262353a().mo234190i()).subscribe(new Consumer<String>() {
            /* class com.bytedance.ee.larkbrand.C12968b.C129713 */

            /* renamed from: a */
            public void accept(String str) throws Exception {
                AppBrandLogger.m52828d("DebugLaunchTracing", "response:" + str);
                C12968b.this.f34515a.clear();
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.larkbrand.C12968b.C129724 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                AppBrandLogger.m52829e("DebugLaunchTracing", "Report ERROR", th);
                C12968b.this.f34515a.clear();
                DebugUtils.m54326a("event_request_get_user_by_open", DebugUtils.m54324a(false, "http://10.69.92.155:3001/gadget/launch", "request error--" + jSONObject.toString()));
            }
        });
    }

    /* renamed from: b */
    private void m53395b(String str, JSONObject jSONObject) {
        m53394a(str, jSONObject, Thread.currentThread().getName());
    }

    /* renamed from: a */
    public void mo48869a(String str, JSONObject jSONObject) {
        if (this.f34516b) {
            if ("mp_app_launch_start".equals(str)) {
                m53396c();
            }
            if (this.f34518d != null) {
                m53395b(str, jSONObject);
                if ("mp_load_domready".equals(str)) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        /* class com.bytedance.ee.larkbrand.C12968b.RunnableC129691 */

                        public void run() {
                            C12968b.this.mo48870b();
                        }
                    }, 5000);
                }
            }
        }
    }

    /* renamed from: a */
    private void m53394a(String str, JSONObject jSONObject, String str2) {
        if (!this.f34517c) {
            if (str.isEmpty()) {
                str = "Undefined";
            }
            if (!this.f34515a.contains(str) || str.equals("mp_load_timeline")) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    jSONObject.put("tid", str2);
                    jSONObject.put("pid", jSONObject.optString("process_info"));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(str, jSONObject);
                    this.f34515a.add(str);
                    this.f34518d.put(jSONObject2);
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("DebugLaunchTracing", "Exception", e);
                }
            }
        }
    }
}
