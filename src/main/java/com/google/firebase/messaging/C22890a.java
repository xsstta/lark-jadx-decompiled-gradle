package com.google.firebase.messaging;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.messaging.a */
public final class C22890a {

    /* renamed from: a */
    private static final AtomicInteger f56591a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: a */
    static C22891a m83154a(Context context, C22907n nVar) {
        Bundle a = m83153a(context.getPackageManager(), context.getPackageName());
        return m83155a(context, context.getPackageName(), nVar, m83161b(context, nVar.mo79522j(), a), context.getResources(), context.getPackageManager(), a);
    }

    /* renamed from: a */
    public static C22891a m83155a(Context context, String str, C22907n nVar, String str2, Resources resources, PackageManager packageManager, Bundle bundle) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, str2);
        String b = nVar.mo79508b(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(b)) {
            builder.setContentTitle(b);
        }
        String b2 = nVar.mo79508b(resources, str, "gcm.n.body");
        if (!TextUtils.isEmpty(b2)) {
            builder.setContentText(b2);
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(b2));
        }
        builder.setSmallIcon(m83147a(packageManager, resources, str, nVar.mo79506a("gcm.n.icon"), bundle));
        Uri a = m83152a(str, nVar, resources);
        if (a != null) {
            builder.setSound(a);
        }
        builder.setContentIntent(m83150a(context, nVar, str, packageManager));
        PendingIntent b3 = m83160b(context, nVar);
        if (b3 != null) {
            builder.setDeleteIntent(b3);
        }
        Integer a2 = m83156a(context, nVar.mo79506a("gcm.n.color"), bundle);
        if (a2 != null) {
            builder.setColor(a2.intValue());
        }
        builder.setAutoCancel(!nVar.mo79509b("gcm.n.sticky"));
        builder.setLocalOnly(nVar.mo79509b("gcm.n.local_only"));
        String a3 = nVar.mo79506a("gcm.n.ticker");
        if (a3 != null) {
            builder.setTicker(a3);
        }
        Integer b4 = nVar.mo79507b();
        if (b4 != null) {
            builder.setPriority(b4.intValue());
        }
        Integer c = nVar.mo79510c();
        if (c != null) {
            builder.setVisibility(c.intValue());
        }
        Integer a4 = nVar.mo79504a();
        if (a4 != null) {
            builder.setNumber(a4.intValue());
        }
        Long d = nVar.mo79513d("gcm.n.event_time");
        if (d != null) {
            builder.setShowWhen(true);
            builder.setWhen(d.longValue());
        }
        long[] f = nVar.mo79516f();
        if (f != null) {
            builder.setVibrate(f);
        }
        int[] g = nVar.mo79519g();
        if (g != null) {
            builder.setLights(g[0], g[1], g[2]);
        }
        builder.setDefaults(m83159b(nVar));
        return new C22891a(builder, m83162c(nVar), 0);
    }

    /* renamed from: a */
    private static boolean m83157a(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i);
            Log.e("FirebaseMessaging", sb.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }

    /* renamed from: a */
    private static Integer m83156a(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(ContextCompat.getColor(context, i));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    /* renamed from: a */
    private static int m83146a() {
        return f56591a.incrementAndGet();
    }

    /* renamed from: a */
    static boolean m83158a(C22907n nVar) {
        return nVar.mo79509b("google.c.a.e");
    }

    /* renamed from: b */
    private static int m83159b(C22907n nVar) {
        int i;
        if (nVar.mo79509b("gcm.n.default_sound")) {
            i = 1;
        } else {
            i = 0;
        }
        if (nVar.mo79509b("gcm.n.default_vibrate_timings")) {
            i |= 2;
        }
        if (nVar.mo79509b("gcm.n.default_light_settings")) {
            return i | 4;
        }
        return i;
    }

    /* renamed from: c */
    private static String m83162c(C22907n nVar) {
        String a = nVar.mo79506a("gcm.n.tag");
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        StringBuilder sb = new StringBuilder(37);
        sb.append("FCM-Notification:");
        sb.append(uptimeMillis);
        return sb.toString();
    }

    /* renamed from: a */
    private static PendingIntent m83148a(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, m83146a(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }

    /* renamed from: b */
    private static PendingIntent m83160b(Context context, C22907n nVar) {
        if (!m83158a(nVar)) {
            return null;
        }
        return m83148a(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(nVar.mo79521i()));
    }

    /* renamed from: a */
    private static Bundle m83153a(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, SmActions.ACTION_ONTHECALL_EXIT);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                return applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
        }
        return Bundle.EMPTY;
    }

    /* renamed from: com.google.firebase.messaging.a$a */
    public static class C22891a {

        /* renamed from: a */
        public final NotificationCompat.Builder f56592a;

        /* renamed from: b */
        public final String f56593b;

        /* renamed from: c */
        public final int f56594c;

        C22891a(NotificationCompat.Builder builder, String str, int i) {
            this.f56592a = builder;
            this.f56593b = str;
            this.f56594c = i;
        }
    }

    /* renamed from: a */
    private static PendingIntent m83149a(Context context, C22907n nVar, PendingIntent pendingIntent) {
        return m83148a(context, new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN").putExtras(nVar.mo79521i()).putExtra("pending_intent", pendingIntent));
    }

    /* renamed from: b */
    private static String m83161b(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + SmActions.ACTION_INIT_EXIT);
                sb.append("Notification Channel requested (");
                sb.append(str);
                sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                Log.w("FirebaseMessaging", sb.toString());
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string)) {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else if (notificationManager.getNotificationChannel(string) != null) {
                return string;
            } else {
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", context.getString(context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName())), 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Intent m83151a(String str, C22907n nVar, PackageManager packageManager) {
        String a = nVar.mo79506a("gcm.n.click_action");
        if (!TextUtils.isEmpty(a)) {
            Intent intent = new Intent(a);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri d = nVar.mo79512d();
        if (d != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(d);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    /* renamed from: a */
    private static Uri m83152a(String str, C22907n nVar, Resources resources) {
        String e = nVar.mo79514e();
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        if ("default".equals(e) || resources.getIdentifier(e, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(e).length());
        sb.append("android.resource://");
        sb.append(str);
        sb.append("/raw/");
        sb.append(e);
        return Uri.parse(sb.toString());
    }

    /* renamed from: a */
    private static PendingIntent m83150a(Context context, C22907n nVar, String str, PackageManager packageManager) {
        Intent a = m83151a(str, nVar, packageManager);
        if (a == null) {
            return null;
        }
        a.addFlags(67108864);
        a.putExtras(nVar.mo79520h());
        PendingIntent activity = PendingIntent.getActivity(context, m83146a(), a, 1073741824);
        if (m83158a(nVar)) {
            return m83149a(context, nVar, activity);
        }
        return activity;
    }

    /* renamed from: a */
    private static int m83147a(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m83157a(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m83157a(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 61);
            sb.append("Icon resource ");
            sb.append(str2);
            sb.append(" not found. Notification will use default icon.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !m83157a(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb2.append("Couldn't get own application info: ");
                sb2.append(valueOf);
                Log.w("FirebaseMessaging", sb2.toString());
            }
        }
        if (i == 0 || !m83157a(resources, i)) {
            return 17301651;
        }
        return i;
    }
}
