package com.ss.lark.android.module.offlinepush;

import android.app.Activity;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.NetworkClient;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.push.C20380a;
import com.bytedance.push.C20384b;
import com.bytedance.push.C20386c;
import com.bytedance.push.PushBody;
import com.bytedance.push.interfaze.AbstractC20442e;
import com.bytedance.push.interfaze.AbstractC20444g;
import com.bytedance.push.interfaze.AbstractC20448k;
import com.bytedance.push.interfaze.AbstractC20453p;
import com.bytedance.push.log.ILogger;
import com.bytedance.push.p884f.C20421e;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.common.p1317a.C28446a;
import com.ss.android.lark.log.Log;
import com.ss.android.push.Triple;
import com.ss.android.pushmanager.AbstractC59965c;
import com.ss.android.pushmanager.C59958a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ss.lark.android.module.offlinepush.c */
public class C64266c {

    /* renamed from: a */
    public static C64279d f162455a = null;

    /* renamed from: b */
    private static boolean f162456b = false;

    /* renamed from: c */
    private static boolean f162457c = true;

    /* renamed from: d */
    private static volatile AbstractC64278e f162458d;

    /* renamed from: e */
    private static AbstractC64274a f162459e = new AbstractC64274a() {
        /* class com.ss.lark.android.module.offlinepush.C64266c.C642671 */

        @Override // com.ss.lark.android.module.offlinepush.C64266c.AbstractC64274a
        /* renamed from: a */
        public void mo178078a(Context context) {
        }

        @Override // com.ss.lark.android.module.offlinepush.C64266c.AbstractC64274a
        /* renamed from: a */
        public void mo178079a(AbstractC64262a aVar) {
        }

        @Override // com.ss.lark.android.module.offlinepush.C64266c.AbstractC64274a
        /* renamed from: a */
        public void mo178080a(String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        }

        @Override // com.ss.lark.android.module.offlinepush.C64266c.AbstractC64274a
        /* renamed from: a */
        public void mo178081a(String str, JSONObject jSONObject) {
        }

        @Override // com.ss.lark.android.module.offlinepush.C64266c.AbstractC64274a
        /* renamed from: a */
        public void mo178082a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        }

        @Override // com.ss.lark.android.module.offlinepush.C64266c.AbstractC64274a
        /* renamed from: a */
        public void mo178083a(Map<String, String> map) {
        }
    };

    /* renamed from: com.ss.lark.android.module.offlinepush.c$a */
    public interface AbstractC64274a {
        /* renamed from: a */
        void mo178078a(Context context);

        /* renamed from: a */
        void mo178079a(AbstractC64262a aVar);

        /* renamed from: a */
        void mo178080a(String str, String str2, String str3, long j, long j2, JSONObject jSONObject);

        /* renamed from: a */
        void mo178081a(String str, JSONObject jSONObject);

        /* renamed from: a */
        void mo178082a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

        /* renamed from: a */
        void mo178083a(Map<String, String> map);
    }

    /* renamed from: com.ss.lark.android.module.offlinepush.c$c */
    public interface AbstractC64276c {
        /* renamed from: a */
        void mo178090a(Context context, int i, String str, int i2, String str2);
    }

    /* renamed from: com.ss.lark.android.module.offlinepush.c$d */
    public interface AbstractC64277d {
        /* renamed from: a */
        void mo178091a(Context context, String str, int i, String str2);

        /* renamed from: b */
        void mo178092b(Context context, String str, int i, String str2);
    }

    /* renamed from: com.ss.lark.android.module.offlinepush.c$e */
    public interface AbstractC64278e {
        void onTryConfigPush(Runnable runnable);
    }

    /* renamed from: a */
    public static String m252722a() {
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m252734a(Activity activity) {
        return true;
    }

    /* renamed from: com.ss.lark.android.module.offlinepush.c$b */
    private static class C64275b implements ILogger {
        @Override // com.bytedance.push.log.ILogger
        public boolean debug() {
            return false;
        }

        private C64275b() {
        }

        @Override // com.bytedance.push.log.ILogger
        /* renamed from: d */
        public void mo68948d(String str) {
            Log.m165379d("BDPush", str);
        }

        @Override // com.bytedance.push.log.ILogger
        /* renamed from: e */
        public void mo68951e(String str) {
            Log.m165383e("BDPush", str);
        }

        @Override // com.bytedance.push.log.ILogger
        /* renamed from: i */
        public void mo68954i(String str) {
            Log.m165389i("BDPush", str);
        }

        @Override // com.bytedance.push.log.ILogger
        /* renamed from: d */
        public void mo68949d(String str, String str2) {
            Log.m165379d("BDPush", str + "\t>>>\t" + str2);
        }

        @Override // com.bytedance.push.log.ILogger
        /* renamed from: e */
        public void mo68952e(String str, String str2) {
            Log.m165383e("BDPush", str + "\t>>>\t" + str2);
        }

        @Override // com.bytedance.push.log.ILogger
        /* renamed from: i */
        public void mo68955i(String str, String str2) {
            Log.m165389i("BDPush", str + "\t>>>\t" + str2);
        }

        @Override // com.bytedance.push.log.ILogger
        /* renamed from: e */
        public void mo68953e(String str, String str2, Throwable th) {
            Log.m165384e("BDPush", str + "\t>>>\t" + str2, th);
        }

        @Override // com.bytedance.push.log.ILogger
        /* renamed from: i */
        public void mo68956i(String str, String str2, Throwable th) {
            Log.m165390i("BDPush", str + "\t>>>\t" + str2, th);
        }
    }

    /* renamed from: b */
    public static AbstractC64274a m252735b() {
        return f162459e;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m252732a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m252735b().mo178082a(str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m252733a(boolean z) {
        Log.m165389i("OfflinePush", "tryConfigPush forceUpdate = [" + z + "]");
        HashMap hashMap = new HashMap();
        m252735b().mo178083a(hashMap);
        if (!hashMap.isEmpty()) {
            Log.m165389i("OfflinePush", "tryConfigPush start handleAppLogUpdate");
            C20384b.m74260a().mo68805a(hashMap, z);
        }
    }

    /* renamed from: a */
    public static void m252724a(int i) {
        f162455a.f162476q = i;
    }

    /* renamed from: a */
    public static void m252729a(AbstractC64278e eVar) {
        synchronized (C64266c.class) {
            f162458d = eVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m252738d(Context context) {
        m252735b().mo178079a(new C64265b(context));
    }

    /* renamed from: a */
    public static void m252725a(Context context) {
        if (!f162457c) {
            Log.m165389i("OfflinePush", "feature is off skip clearNotification");
        } else {
            m252735b().mo178078a(context);
        }
    }

    /* renamed from: b */
    public static void m252736b(Context context) {
        if (!f162457c) {
            Log.m165389i("OfflinePush", "feature is off skip closeOfflinePush");
            return;
        }
        Log.m165397w("OfflinePush", "closeOfflinePush channel: " + C20384b.m74261a(context).mo68922a());
        try {
            C20384b.m74260a().mo68801a().getSenderService().mo68836c(context);
        } catch (Exception e) {
            Log.m165398w("OfflinePush", "closeOfflinePush channel: error", e);
        }
    }

    /* renamed from: c */
    private static void m252737c(Context context) {
        NotificationManager notificationManager;
        if (Build.VERSION.SDK_INT >= 26 && C28446a.m104268a(context) && (notificationManager = (NotificationManager) context.getSystemService("notification")) != null) {
            try {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                if (!defaultSharedPreferences.getBoolean("reset_channel_name", false)) {
                    if (notificationManager.getNotificationChannel("push") != null) {
                        notificationManager.deleteNotificationChannel("push");
                    }
                    defaultSharedPreferences.edit().putBoolean("reset_channel_name", true).apply();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m252731a(String str) {
        C59958a.m232687b(str);
    }

    /* renamed from: a */
    public static void m252728a(Context context, boolean z) {
        if (!f162457c) {
            Log.m165389i("OfflinePush", "feature is off skip tryConfigPush");
            return;
        }
        $$Lambda$c$dI3bECjZAUGyebaW1miXquOld0 r1 = new Runnable(z) {
            /* class com.ss.lark.android.module.offlinepush.$$Lambda$c$dI3bECjZAUGyebaW1miXquOld0 */
            public final /* synthetic */ boolean f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                C64266c.m252733a(this.f$0);
            }
        };
        if (f162458d == null) {
            r1.run();
            return;
        }
        synchronized (C64266c.class) {
            if (f162458d != null) {
                f162458d.onTryConfigPush(r1);
            } else {
                r1.run();
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m252730a(C64279d dVar, AbstractC64274a aVar) {
        synchronized (C64266c.class) {
            if (!f162456b) {
                if (!f162457c) {
                    Log.m165389i("OfflinePush", "feature is off skip init");
                    return;
                }
                f162455a = dVar;
                f162459e = aVar;
                Context context = dVar.f162460a;
                if (f162455a.f162472m != null) {
                    NetworkClient.setDefault(f162455a.f162472m);
                }
                try {
                    m252737c(context);
                    C20380a aVar2 = new C20380a();
                    aVar2.mo68736a(f162455a.f162476q);
                    aVar2.mo68743c(f162455a.f162461b);
                    aVar2.mo68740b(f162455a.f162462c);
                    aVar2.mo68742c(f162455a.f162465f);
                    aVar2.mo68737a(f162455a.f162463d);
                    aVar2.mo68739b(f162455a.f162464e);
                    C20384b.m74260a().mo68804a(new C20386c.C20388a((Application) context, aVar2, f162455a.f162475p).mo68766a(new AbstractC59965c() {
                        /* class com.ss.lark.android.module.offlinepush.C64266c.C642726 */

                        @Override // com.ss.android.pushmanager.AbstractC59965c
                        /* renamed from: d */
                        public Triple<String, String, String> mo68792d() {
                            return new Triple<String, String, String>() {
                                /* class com.ss.lark.android.module.offlinepush.C64266c.C642726.C642731 */

                                @Override // com.ss.android.push.Triple
                                public String getLeft() {
                                    return "";
                                }

                                @Override // com.ss.android.push.Triple
                                public String getMiddle() {
                                    return "";
                                }

                                @Override // com.ss.android.push.Triple
                                public String getRight() {
                                    return "";
                                }
                            };
                        }

                        @Override // com.ss.android.pushmanager.AbstractC59965c
                        /* renamed from: a */
                        public Pair<String, String> mo68788a() {
                            return new Pair<>(C64266c.f162455a.f162466g, C64266c.f162455a.f162467h);
                        }

                        @Override // com.ss.android.pushmanager.AbstractC59965c
                        /* renamed from: b */
                        public Pair<String, String> mo68790b() {
                            return new Pair<>(C64266c.f162455a.f162468i, C64266c.f162455a.f162469j);
                        }

                        @Override // com.ss.android.pushmanager.AbstractC59965c
                        /* renamed from: c */
                        public Pair<String, String> mo68791c() {
                            return new Pair<>(C64266c.f162455a.f162470k, C64266c.f162455a.f162471l);
                        }
                    }).mo68770b(UIUtils.getString(context, R.string.Lark_Notification_OfflineNotification)).mo68759a($$Lambda$c$gKQebZ0qAbS_vaNAEsEy47rBO1w.INSTANCE).mo68767a(C26252ad.m94992a(context)).mo68758a($$Lambda$c$aSnFLKCu1zpPgbgxbXr6qe2ho.INSTANCE).mo68768a(false).mo68760a(new AbstractC20442e() {
                        /* class com.ss.lark.android.module.offlinepush.C64266c.C642715 */

                        @Override // com.bytedance.push.interfaze.AbstractC20442e
                        /* renamed from: a */
                        public void mo68914a(String str, JSONObject jSONObject) {
                            Log.m165389i("BDPush_OfflinePush", "onEventV3 " + str + " " + jSONObject.toString());
                            C64266c.m252735b().mo178081a(str, jSONObject);
                        }

                        @Override // com.bytedance.push.interfaze.AbstractC20442e
                        /* renamed from: a */
                        public void mo68913a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
                            Log.m165389i("BDPush_OfflinePush", "onEvent " + str + " " + str3 + " " + jSONObject.toString());
                            Log.m165389i("BDPush_OfflinePush", "onEvent " + str + " " + str3 + " " + jSONObject.toString());
                            C64266c.m252735b().mo178080a(str, str2, str3, j, j2, jSONObject);
                        }
                    }).mo68764a($$Lambda$c$ctmxZdGCo5Gh2Snou8b0Rr9hY.INSTANCE).mo68771b(false).mo68761a(new AbstractC20444g() {
                        /* class com.ss.lark.android.module.offlinepush.C64266c.C642704 */

                        @Override // com.bytedance.push.interfaze.AbstractC20444g
                        /* renamed from: b */
                        public boolean mo68919b(Context context, int i, PushBody pushBody) {
                            Log.m165389i("BDPush_OfflinePush", "onReceiveRevokeMsg " + i + " " + pushBody.f49734b);
                            return false;
                        }

                        @Override // com.bytedance.push.interfaze.AbstractC20444g
                        /* renamed from: a */
                        public boolean mo68918a(Context context, int i, PushBody pushBody) {
                            Log.m165389i("BDPush_OfflinePush", "onReceivePassThoughMsg " + i + " " + pushBody.f49734b);
                            if (!TextUtils.isEmpty(pushBody.f49732A)) {
                                C64266c.f162455a.f162474o.mo178091a(context, pushBody.f49743k.toString(), i, pushBody.f49732A);
                                return true;
                            }
                            C64266c.f162455a.f162474o.mo178092b(context, pushBody.f49743k.toString(), i, pushBody.f49740h);
                            return true;
                        }
                    }).mo68762a(new AbstractC20448k() {
                        /* class com.ss.lark.android.module.offlinepush.C64266c.C642693 */

                        @Override // com.bytedance.push.interfaze.AbstractC20448k
                        /* renamed from: a */
                        public void mo68921a(JSONObject jSONObject, PushBody pushBody, PushBody pushBody2) {
                            Log.m165389i("BDPush_OfflinePush", "MsgRevokeEventIntercept " + pushBody.f49734b + " " + pushBody2.f49734b);
                        }
                    }).mo68763a(new AbstractC20453p() {
                        /* class com.ss.lark.android.module.offlinepush.C64266c.C642682 */

                        @Override // com.bytedance.push.interfaze.AbstractC20453p
                        /* renamed from: a */
                        public void mo68929a(Context context, PushBody pushBody, int i) {
                            Log.m165389i("BDPush_OfflinePush", "onVerifyFailed " + i + " " + pushBody.f49734b);
                        }
                    }).mo68757a(new C20421e()).mo68765a(new C64275b()).mo68769a());
                } catch (Exception e) {
                    Log.m165384e("BDPush_OfflinePush", "OfflinePush init", e);
                }
                if (C28446a.m104268a(context)) {
                    $$Lambda$c$qty7dLtERwI1uKUjYNKoJM6BfeI r6 = new Runnable(context) {
                        /* class com.ss.lark.android.module.offlinepush.$$Lambda$c$qty7dLtERwI1uKUjYNKoJM6BfeI */
                        public final /* synthetic */ Context f$0;

                        {
                            this.f$0 = r1;
                        }

                        public final void run() {
                            C64266c.m252738d(this.f$0);
                        }
                    };
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        CoreThreadPool.getDefault().getScheduleThreadPool().schedule(r6, 0, TimeUnit.MILLISECONDS);
                    } else {
                        r6.run();
                    }
                }
                f162456b = true;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ JSONObject m252723a(Context context, int i, PushBody pushBody) {
        Log.m165389i("BDPush_OfflinePush", "onClickPush " + pushBody.f49734b);
        f162455a.f162473n.mo178090a(context, pushBody.f49752t, pushBody.f49743k.toString(), i, pushBody.f49740h);
        return null;
    }

    /* renamed from: a */
    public static synchronized void m252727a(Context context, String str, String str2) {
        synchronized (C64266c.class) {
            if (!f162457c) {
                Log.m165389i("OfflinePush", "feature is off skip setupFCM");
            } else {
                m252728a(context, true);
            }
        }
    }

    /* renamed from: a */
    public static void m252726a(Context context, String str, int i, String str2, boolean z) {
        if (!f162457c) {
            Log.m165389i("OfflinePush", "feature is off skip handleMessage");
        } else if (!f162456b) {
            Log.m165397w("OfflinePush", "OffllinePush has not inited, handleMessage will skiped, message: " + str);
        } else if (!StringUtils.isEmpty(str) && !z && f162455a.f162474o != null) {
            f162455a.f162474o.mo178092b(context, str, i, str2);
        }
    }
}
