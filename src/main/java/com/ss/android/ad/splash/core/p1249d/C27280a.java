package com.ss.android.ad.splash.core.p1249d;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ss.android.ad.splash.C27491y;
import com.ss.android.ad.splash.core.C27266a;
import com.ss.android.ad.splash.core.C27287e;
import com.ss.android.ad.splash.core.C27319h;
import com.ss.android.ad.splash.core.model.C27331b;
import com.ss.android.ad.splash.utils.C27477g;
import com.ss.android.ad.splash.utils.C27478h;
import com.ss.android.ad.splash.utils.C27480i;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.d.a */
public class C27280a {

    /* renamed from: a */
    private static ExecutorService f67991a = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    public static void m99197a() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            /* class com.ss.android.ad.splash.core.p1249d.C27280a.RunnableC272811 */

            public void run() {
                C27287e.m99211J().submit(new Runnable() {
                    /* class com.ss.android.ad.splash.core.p1249d.C27280a.RunnableC272811.RunnableC272821 */

                    public void run() {
                        C27266a.m99126a().mo97252b();
                    }
                });
            }
        }, C27287e.am());
    }

    /* renamed from: a */
    public static void m99198a(final C27331b bVar) {
        final Future<?> submit = C27287e.m99285y().submit(new Runnable() {
            /* class com.ss.android.ad.splash.core.p1249d.C27280a.RunnableC272832 */

            public void run() {
                if (C27287e.m99205D() != null && C27319h.m99371a().mo97401j()) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    String e = C27478h.m100376e();
                    if (!TextUtils.isEmpty(e)) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            JSONArray jSONArray = new JSONArray();
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("ad_id", bVar.mo97509v());
                            jSONObject2.put("log_extra", bVar.mo97511x());
                            jSONObject2.put("timestamp", currentTimeMillis);
                            jSONObject2.put("position", 0);
                            jSONArray.put(jSONObject2);
                            jSONObject.put("ads", jSONArray);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        for (int i = 0; i < 4 && (r0 = C27287e.m99205D().mo97107a(e, 3, (HashMap<String, String>) null, jSONObject)) != null && r0.mo98087b() && C27280a.m99200a(r0.mo98086a()); i++) {
                        }
                    }
                }
            }
        });
        f67991a.execute(new Runnable() {
            /* class com.ss.android.ad.splash.core.p1249d.C27280a.RunnableC272843 */

            public void run() {
                try {
                    submit.get(5, TimeUnit.SECONDS);
                    C27477g.m100326a("SplashAdSdk", "show ack ends...");
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    C27280a.m99197a();
                    throw th;
                }
                C27280a.m99197a();
            }
        });
    }

    /* renamed from: a */
    public static void m99199a(final boolean z) {
        if (C27287e.m99205D() != null) {
            long an = C27287e.an();
            if (an <= 0) {
                an = 2000;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                /* class com.ss.android.ad.splash.core.p1249d.C27280a.RunnableC272854 */

                public void run() {
                    C27287e.m99285y().submit(new Callable<C27491y>() {
                        /* class com.ss.android.ad.splash.core.p1249d.C27280a.RunnableC272854.CallableC272861 */

                        /* renamed from: a */
                        public C27491y call() throws Exception {
                            if (C27287e.m99205D() == null) {
                                return null;
                            }
                            String a = C27478h.m100344a(z);
                            if (!C27480i.m100385a(a)) {
                                return C27287e.m99205D().mo97113b(a);
                            }
                            return null;
                        }
                    });
                }
            }, an);
        }
    }

    /* renamed from: a */
    public static boolean m99200a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.optInt("code", -1) != 30001) {
            return false;
        }
        return true;
    }
}
