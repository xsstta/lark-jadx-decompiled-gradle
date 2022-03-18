package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.datatransport.AbstractC21350c;
import com.google.android.datatransport.AbstractC21393e;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.encoders.AbstractC22780a;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.p997a.C22781a;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.C22900j;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* renamed from: com.google.firebase.messaging.m */
public class C22906m {

    /* renamed from: a */
    private static final AbstractC22780a f56614a = new C22781a().mo79200a(C22900j.C22902b.class, new C22900j.C22903c()).mo79200a(C22900j.class, new C22900j.C22901a()).mo79202a();

    /* renamed from: b */
    static String m83192b() {
        return FirebaseApp.getInstance().getApplicationContext().getPackageName();
    }

    /* renamed from: c */
    static String m83194c() {
        return FirebaseInstanceId.getInstance(FirebaseApp.getInstance()).getId();
    }

    /* renamed from: d */
    static String m83196d() {
        FirebaseApp instance = FirebaseApp.getInstance();
        String c = instance.getOptions().mo79143c();
        if (c != null) {
            return c;
        }
        String b = instance.getOptions().mo79142b();
        if (!b.startsWith("1:")) {
            return b;
        }
        String[] split = b.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    static boolean m83191a() {
        ApplicationInfo applicationInfo;
        try {
            FirebaseApp.getInstance();
            Context applicationContext = FirebaseApp.getInstance().getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("delivery_metrics_exported_to_big_query_enabled"))) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* renamed from: b */
    public static void m83193b(Intent intent) {
        m83189a("_nd", intent);
    }

    /* renamed from: c */
    public static void m83195c(Intent intent) {
        m83189a("_nf", intent);
    }

    /* renamed from: g */
    static String m83200g(Intent intent) {
        return intent.getStringExtra("collapse_key");
    }

    /* renamed from: h */
    static String m83201h(Intent intent) {
        return intent.getStringExtra("google.c.a.c_id");
    }

    /* renamed from: i */
    static String m83202i(Intent intent) {
        return intent.getStringExtra("google.c.a.c_l");
    }

    /* renamed from: j */
    static String m83203j(Intent intent) {
        return intent.getStringExtra("google.c.a.m_l");
    }

    /* renamed from: k */
    static String m83204k(Intent intent) {
        return intent.getStringExtra("google.c.a.m_c");
    }

    /* renamed from: l */
    static String m83205l(Intent intent) {
        return intent.getStringExtra("google.c.a.ts");
    }

    /* renamed from: a */
    public static void m83187a(Intent intent) {
        m83213t(intent);
        m83189a("_no", intent);
    }

    /* renamed from: e */
    public static boolean m83198e(Intent intent) {
        if (intent == null || m83212s(intent)) {
            return false;
        }
        return m83191a();
    }

    /* renamed from: m */
    static String m83206m(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            return intent.getStringExtra("message_id");
        }
        return stringExtra;
    }

    /* renamed from: q */
    static String m83210q(Intent intent) {
        if (intent.hasExtra("google.c.a.udt")) {
            return intent.getStringExtra("google.c.a.udt");
        }
        return null;
    }

    /* renamed from: s */
    private static boolean m83212s(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    /* renamed from: a */
    private static int m83186a(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        if ("normal".equals(str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: d */
    public static boolean m83197d(Intent intent) {
        if (intent == null || m83212s(intent)) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    /* renamed from: n */
    static String m83207n(Intent intent) {
        if (intent.getExtras() == null || !C22907n.m83214a(intent.getExtras())) {
            return Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
        }
        return Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION;
    }

    /* renamed from: o */
    static String m83208o(Intent intent) {
        if (intent.getExtras() == null || !C22907n.m83214a(intent.getExtras())) {
            return Constants.FirelogAnalytics.MessageType.DATA_MESSAGE;
        }
        return Constants.FirelogAnalytics.MessageType.DISPLAY_NOTIFICATION;
    }

    /* renamed from: p */
    static String m83209p(Intent intent) {
        String stringExtra = intent.getStringExtra("from");
        if (stringExtra == null || !stringExtra.startsWith("/topics/")) {
            return null;
        }
        return stringExtra;
    }

    /* renamed from: r */
    static int m83211r(Intent intent) {
        String stringExtra = intent.getStringExtra("google.delivered_priority");
        if (stringExtra == null) {
            if ("1".equals(intent.getStringExtra("google.priority_reduced"))) {
                return 2;
            }
            stringExtra = intent.getStringExtra("google.priority");
        }
        return m83186a(stringExtra);
    }

    /* renamed from: f */
    static int m83199f(Intent intent) {
        Object obj = intent.getExtras().get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Invalid TTL: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
            return 0;
        }
    }

    /* renamed from: t */
    private static void m83213t(Intent intent) {
        if (intent != null) {
            if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
                AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.getInstance().get(AnalyticsConnector.class);
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                }
                if (analyticsConnector != null) {
                    String stringExtra = intent.getStringExtra("google.c.a.c_id");
                    analyticsConnector.setUserProperty("fcm", "_ln", stringExtra);
                    Bundle bundle = new Bundle();
                    bundle.putString(ShareHitPoint.f121868c, "Firebase");
                    bundle.putString("medium", "notification");
                    bundle.putString("campaign", stringExtra);
                    analyticsConnector.logEvent("fcm", "_cmp", bundle);
                    return;
                }
                Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            }
        }
    }

    /* renamed from: a */
    public static void m83188a(Intent intent, AbstractC21393e<String> eVar) {
        m83189a("_nr", intent);
        if (eVar != null) {
            m83190a(Constants.FirelogAnalytics.EventType.MESSAGE_DELIVERED, intent, eVar);
        }
    }

    /* renamed from: a */
    static void m83189a(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String h = m83201h(intent);
        if (h != null) {
            bundle.putString("_nmid", h);
        }
        String i = m83202i(intent);
        if (i != null) {
            bundle.putString("_nmn", i);
        }
        String j = m83203j(intent);
        if (!TextUtils.isEmpty(j)) {
            bundle.putString("label", j);
        }
        String k = m83204k(intent);
        if (!TextUtils.isEmpty(k)) {
            bundle.putString("message_channel", k);
        }
        String p = m83209p(intent);
        if (p != null) {
            bundle.putString("_nt", p);
        }
        String l = m83205l(intent);
        if (l != null) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(l));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
            }
        }
        String q = m83210q(intent);
        if (q != null) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(q));
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
            }
        }
        String n = m83207n(intent);
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle.putString("_nmc", n);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(valueOf).length());
            sb.append("Logging to scion event=");
            sb.append(str);
            sb.append(" scionPayload=");
            sb.append(valueOf);
            Log.d("FirebaseMessaging", sb.toString());
        }
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.getInstance().get(AnalyticsConnector.class);
        if (analyticsConnector != null) {
            analyticsConnector.logEvent("fcm", str, bundle);
        } else {
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        }
    }

    /* renamed from: a */
    private static void m83190a(String str, Intent intent, AbstractC21393e<String> eVar) {
        try {
            eVar.mo72600a(AbstractC21350c.m77291b(f56614a.mo79198a(new C22900j.C22902b(new C22900j(str, intent)))));
        } catch (EncodingException unused) {
            Log.d("FirebaseMessaging", "Failed to encode big query analytics payload. Skip sending");
        }
    }
}
