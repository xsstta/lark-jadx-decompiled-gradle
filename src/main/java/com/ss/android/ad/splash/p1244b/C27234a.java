package com.ss.android.ad.splash.p1244b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.ss.android.ad.splash.core.AbstractC27320i;
import com.ss.android.ad.splash.core.C27275c;
import com.ss.android.ad.splash.core.C27287e;
import com.ss.android.ad.splash.core.C27319h;
import com.ss.android.ad.splash.core.p1251f.C27302a;
import com.ss.android.ad.splash.utils.C27471a;
import com.ss.android.ad.splash.utils.C27477g;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.b.a */
public class C27234a {

    /* renamed from: a */
    public static volatile boolean f67751a = true;

    /* renamed from: d */
    private static volatile C27234a f67752d;

    /* renamed from: b */
    public volatile boolean f67753b;

    /* renamed from: c */
    public volatile int f67754c;

    /* renamed from: e */
    private volatile boolean f67755e;

    private C27234a() {
    }

    /* renamed from: e */
    private boolean m98989e() {
        if (this.f67754c <= 5) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo97125b() {
        if (!this.f67755e || !f67751a) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C27234a m98988a() {
        if (f67752d == null) {
            synchronized (C27234a.class) {
                if (f67752d == null) {
                    f67752d = new C27234a();
                }
            }
        }
        return f67752d;
    }

    /* renamed from: c */
    public boolean mo97126c() {
        boolean z;
        C27275c i = C27287e.m99267i();
        if (i == null) {
            return false;
        }
        String c = i.mo97275c();
        String ae = C27287e.ae();
        String a = i.mo97272a();
        if (TextUtils.isEmpty(c) || TextUtils.isEmpty(ae) || TextUtils.isEmpty(a)) {
            z = false;
        } else {
            z = true;
        }
        if (C27287e.m99221T().getApplicationContext() != null) {
            return z;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("log_extra", C27319h.m99371a().mo97400i());
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("is_ad_event", "1");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C27287e.m99229a(84378473382L, "splash_ad", "context_npe", jSONObject);
        return false;
    }

    /* renamed from: d */
    public JSONObject mo97127d() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (C27287e.m99267i() == null) {
                return jSONObject;
            }
            String c = C27287e.m99267i().mo97275c();
            jSONObject.put("device_id", C27287e.ae());
            jSONObject.put("app_version", C27287e.ab());
            jSONObject.put("channel", c);
            jSONObject.put("update_version_code", C27287e.aa());
            jSONObject.put("package_name", C27287e.m99221T().getPackageName());
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public synchronized void mo97118a(final AbstractC27320i iVar) {
        if (mo97125b()) {
            if (C27287e.m99267i() == null || C27287e.m99211J() == null) {
                mo97119a(iVar, false);
            } else if (!mo97126c()) {
                this.f67753b = false;
                mo97119a(iVar, false);
            } else if (this.f67753b) {
                mo97119a(iVar, true);
            } else if (!m98989e()) {
                mo97119a(iVar, false);
            } else {
                C27302a.m99297a().mo97332a(new Runnable() {
                    /* class com.ss.android.ad.splash.p1244b.C27234a.RunnableC272351 */

                    public void run() {
                        try {
                            if (!C27234a.this.f67753b) {
                                C27287e.m99223V().mo98018a(C27287e.m99227Z(), C27234a.this.mo97127d());
                            }
                            C27234a.this.f67753b = true;
                            C27234a.this.f67754c = 0;
                            C27234a.this.mo97119a(iVar, true);
                        } catch (Throwable th) {
                            if ((th instanceof ClassNotFoundException) || (th instanceof NoClassDefFoundError)) {
                                C27471a.m100287b(" no sdk monitor ");
                                C27234a.f67751a = false;
                            }
                            C27234a.this.f67753b = false;
                            C27234a.this.mo97119a(iVar, false);
                            C27234a.this.f67754c++;
                            C27477g.m100327a("SplashAdSdk", th.getMessage(), th);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void mo97119a(AbstractC27320i iVar, boolean z) {
        if (iVar != null) {
            if (z) {
                iVar.mo97130a(1, "");
            } else {
                iVar.mo97131b(0, "");
            }
        }
    }

    /* renamed from: a */
    public void mo97120a(Exception exc, String str) {
        if (mo97125b() && exc != null) {
            try {
                String message = exc.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str, message);
                    mo97123a("service_ad_exception", (JSONObject) null, jSONObject);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo97121a(final String str, int i, final JSONObject jSONObject) {
        if (mo97125b()) {
            if (!this.f67753b) {
                mo97118a(new AbstractC27320i() {
                    /* class com.ss.android.ad.splash.p1244b.C27234a.C272384 */

                    @Override // com.ss.android.ad.splash.core.AbstractC27320i
                    /* renamed from: b */
                    public void mo97131b(int i, Object obj) {
                    }

                    @Override // com.ss.android.ad.splash.core.AbstractC27320i
                    /* renamed from: a */
                    public void mo97130a(int i, Object obj) {
                        SDKMonitorUtils.getInstance(C27287e.m99227Z()).monitorStatusRate(str, i, jSONObject);
                    }
                });
            } else {
                SDKMonitorUtils.getInstance(C27287e.m99227Z()).monitorStatusRate(str, i, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public void mo97123a(final String str, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (mo97125b()) {
            if (!this.f67753b) {
                mo97118a(new AbstractC27320i() {
                    /* class com.ss.android.ad.splash.p1244b.C27234a.C272395 */

                    @Override // com.ss.android.ad.splash.core.AbstractC27320i
                    /* renamed from: b */
                    public void mo97131b(int i, Object obj) {
                    }

                    @Override // com.ss.android.ad.splash.core.AbstractC27320i
                    /* renamed from: a */
                    public void mo97130a(int i, Object obj) {
                        SDKMonitorUtils.getInstance(C27287e.m99227Z()).monitorDuration(str, jSONObject, jSONObject2);
                    }
                });
            } else {
                SDKMonitorUtils.getInstance(C27287e.m99227Z()).monitorDuration(str, jSONObject, jSONObject2);
            }
        }
    }

    /* renamed from: b */
    public void mo97124b(final String str, int i, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (mo97125b()) {
            if (!this.f67753b) {
                mo97118a(new AbstractC27320i() {
                    /* class com.ss.android.ad.splash.p1244b.C27234a.C272373 */

                    @Override // com.ss.android.ad.splash.core.AbstractC27320i
                    /* renamed from: b */
                    public void mo97131b(int i, Object obj) {
                    }

                    @Override // com.ss.android.ad.splash.core.AbstractC27320i
                    /* renamed from: a */
                    public void mo97130a(int i, Object obj) {
                        SDKMonitorUtils.getInstance(C27287e.m99227Z()).monitorStatusAndDuration(str, i, jSONObject, jSONObject2);
                    }
                });
            } else {
                SDKMonitorUtils.getInstance(C27287e.m99227Z()).monitorStatusAndDuration(str, i, jSONObject, jSONObject2);
            }
        }
    }

    /* renamed from: a */
    public void mo97122a(final String str, final int i, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (mo97125b()) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                /* class com.ss.android.ad.splash.p1244b.C27234a.RunnableC272362 */

                public void run() {
                    C27234a.this.mo97124b(str, i, jSONObject, jSONObject2);
                }
            }, 5000);
        }
    }
}
