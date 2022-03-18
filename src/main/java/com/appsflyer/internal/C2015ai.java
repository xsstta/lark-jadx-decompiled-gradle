package com.appsflyer.internal;

import android.content.pm.PackageManager;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.ServerConfigHandler;
import com.appsflyer.internal.model.event.BackgroundEvent;
import com.appsflyer.internal.model.event.ProxyEvent;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.ai */
public final class C2015ai {

    /* renamed from: ɩ */
    public static C2015ai f6878;

    /* renamed from: ı */
    private boolean f6879 = true;

    /* renamed from: Ɩ */
    private boolean f6880;

    /* renamed from: ǃ */
    public boolean f6881;

    /* renamed from: Ι */
    private JSONArray f6882;

    /* renamed from: ι */
    private JSONObject f6883;

    /* renamed from: І */
    private boolean f6884;

    /* renamed from: і */
    private String f6885 = "-1";

    /* renamed from: Ӏ */
    private int f6886;

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* renamed from: ɩ */
    public final boolean mo10069() {
        return this.f6880;
    }

    /* renamed from: І */
    private boolean m8879() {
        if (!this.f6881) {
            return false;
        }
        if (this.f6879 || this.f6880) {
            return true;
        }
        return false;
    }

    /* renamed from: Ι */
    public final synchronized void mo10070() {
        this.f6883 = null;
        this.f6882 = null;
        f6878 = null;
    }

    /* renamed from: ι */
    public final synchronized void mo10071() {
        this.f6879 = false;
        m8874();
    }

    /* renamed from: Ɩ */
    private synchronized void m8874() {
        this.f6882 = null;
        this.f6882 = new JSONArray();
        this.f6886 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r0 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: і */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.lang.String m8880() {
        /*
            r3 = this;
            monitor-enter(r3)
            org.json.JSONObject r0 = r3.f6883     // Catch:{ JSONException -> 0x0017, all -> 0x0014 }
            java.lang.String r1 = "data"
            org.json.JSONArray r2 = r3.f6882     // Catch:{ JSONException -> 0x0017, all -> 0x0014 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0017, all -> 0x0014 }
            org.json.JSONObject r0 = r3.f6883     // Catch:{ JSONException -> 0x0017, all -> 0x0014 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0017, all -> 0x0014 }
            r3.m8874()     // Catch:{ JSONException -> 0x0018, all -> 0x0014 }
            goto L_0x0018
        L_0x0014:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0017:
            r0 = 0
        L_0x0018:
            monitor-exit(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C2015ai.m8880():java.lang.String");
    }

    public C2015ai() {
        boolean z = AppsFlyerProperties.getInstance().getBoolean("disableProxy", false);
        this.f6884 = z;
        this.f6881 = true ^ z;
        this.f6882 = new JSONArray();
        this.f6886 = 0;
        this.f6880 = false;
    }

    /* renamed from: ı */
    public final synchronized void mo10065() {
        this.f6880 = true;
        mo10067("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
    }

    /* renamed from: ǃ */
    public final synchronized void mo10068() {
        mo10067("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.f6880 = false;
        this.f6879 = false;
    }

    /* renamed from: ı */
    public final synchronized void mo10066(String str) {
        this.f6885 = str;
    }

    /* renamed from: ǃ */
    public static void m8875(String str, PackageManager packageManager) {
        try {
            if (f6878 == null) {
                f6878 = new C2015ai();
            }
            f6878.m8873(str, packageManager);
            if (f6878 == null) {
                f6878 = new C2015ai();
            }
            BackgroundEvent trackingStopped = new ProxyEvent().body(f6878.m8880()).trackingStopped(AppsFlyerLib.getInstance().isTrackingStopped());
            StringBuilder sb = new StringBuilder();
            sb.append(ServerConfigHandler.getUrl("https://%smonitorsdk.%s/remote-debug?app_id="));
            sb.append(str);
            new_insert_after_java_lang_Thread_by_knot(new Thread(new RunnableC2046z((BackgroundEvent) trackingStopped.urlString(sb.toString())))).start();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|(2:4|5)(4:6|7|8|9)|11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0089, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008a, code lost:
        r11.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008e, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x007e */
    /* renamed from: ı */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m8873(java.lang.String r11, android.content.pm.PackageManager r12) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C2015ai.m8873(java.lang.String, android.content.pm.PackageManager):void");
    }

    /* renamed from: ı */
    public final synchronized void mo10067(String str, String str2, String... strArr) {
        String str3;
        if (m8879() && this.f6886 < 98304) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                String str4 = "";
                if (strArr.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (int length = strArr.length - 1; length > 0; length--) {
                        sb.append(strArr[length]);
                        sb.append(", ");
                    }
                    sb.append(strArr[0]);
                    str4 = sb.toString();
                }
                String format = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.ENGLISH).format(Long.valueOf(currentTimeMillis));
                if (str != null) {
                    str3 = String.format("%18s %5s _/%s [%s] %s %s", format, Long.valueOf(Thread.currentThread().getId()), "AppsFlyer_5.2.0", str, str2, str4);
                } else {
                    str3 = String.format("%18s %5s %s/%s %s", format, Long.valueOf(Thread.currentThread().getId()), str2, "AppsFlyer_5.2.0", str4);
                }
                this.f6882.put(str3);
                this.f6886 += str3.getBytes().length;
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: ǃ */
    private synchronized void m8876(String str, String str2, String str3, String str4) {
        try {
            this.f6883.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                this.f6883.put("devkey", str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.f6883.put("originalAppsFlyerId", str3);
            }
            if (str4 != null && str4.length() > 0) {
                this.f6883.put("uid", str4);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ɩ */
    private synchronized void m8878(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.f6883.put("app_id", str);
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.f6883.put("app_version", str2);
        }
        if (str3 != null && str3.length() > 0) {
            this.f6883.put("channel", str3);
        }
        if (str4 != null && str4.length() > 0) {
            this.f6883.put("preInstall", str4);
        }
    }

    /* renamed from: ǃ */
    private synchronized void m8877(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            this.f6883.put("brand", str);
            this.f6883.put("model", str2);
            this.f6883.put("platform", "Android");
            this.f6883.put("platform_version", str3);
            if (str4 != null && str4.length() > 0) {
                this.f6883.put("advertiserId", str4);
            }
            if (str5 != null && str5.length() > 0) {
                this.f6883.put("imei", str5);
            }
            if (str6 != null && str6.length() > 0) {
                this.f6883.put("android_id", str6);
            }
        } catch (Throwable unused) {
        }
    }
}
