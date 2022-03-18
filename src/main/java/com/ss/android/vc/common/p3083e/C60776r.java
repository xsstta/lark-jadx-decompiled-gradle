package com.ss.android.vc.common.p3083e;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.WindowManager;
import com.ss.android.lark.utils.MagicWindowUtil;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.p3091e.C60917a;

/* renamed from: com.ss.android.vc.common.e.r */
public class C60776r {

    /* renamed from: a */
    public static double f151961a = 20.0d;

    /* renamed from: b */
    public static boolean f151962b = false;

    /* renamed from: c */
    public static boolean f151963c = false;

    /* renamed from: d */
    private static volatile int f151964d = -1;

    /* renamed from: e */
    private static volatile int f151965e = -1;

    /* renamed from: f */
    private static volatile int f151966f = -1;

    /* renamed from: g */
    private static volatile int f151967g = -1;

    /* renamed from: h */
    private static volatile int f151968h = -1;

    /* renamed from: i */
    private static volatile int f151969i = -1;

    /* renamed from: j */
    private static volatile int f151970j = -1;

    /* renamed from: k */
    private static Boolean f151971k;

    /* renamed from: l */
    private static Boolean f151972l;

    /* renamed from: m */
    private static Boolean f151973m;

    /* renamed from: n */
    private static Pair<Long, Boolean> f151974n = new Pair<>(0L, false);

    /* renamed from: n */
    public static boolean m236156n() {
        return f151962b;
    }

    /* renamed from: c */
    public static void m236145c() {
        f151964d = -1;
        f151965e = -1;
        f151966f = -1;
        f151967g = -1;
        f151968h = -1;
        f151970j = -1;
        f151969i = -1;
    }

    /* renamed from: j */
    public static boolean m236152j() {
        return "HUAWEI".equalsIgnoreCase(Build.MANUFACTURER);
    }

    /* renamed from: a */
    public static int m236139a() {
        if (f151969i == -1) {
            f151969i = m236141a(ar.m236694a()).f151977a;
        }
        return f151969i;
    }

    /* renamed from: b */
    public static int m236144b() {
        if (f151970j == -1) {
            f151970j = m236141a(ar.m236694a()).f151978b;
        }
        return f151970j;
    }

    /* renamed from: d */
    public static int m236146d() {
        if (f151964d == -1) {
            f151964d = Math.max(m236139a(), m236144b());
        }
        return f151964d;
    }

    /* renamed from: e */
    public static int m236147e() {
        if (f151965e == -1) {
            f151965e = Math.min(m236139a(), m236144b());
        }
        return f151965e;
    }

    /* renamed from: f */
    public static int m236148f() {
        if (f151966f == -1) {
            f151966f = StatusBarUtil.getStatusBarHeight(ar.m236694a());
        }
        return f151966f;
    }

    /* renamed from: g */
    public static boolean m236149g() {
        int i;
        try {
            i = Settings.System.getInt(ar.m236694a().getContentResolver(), "accelerometer_rotation");
        } catch (Exception e) {
            e.printStackTrace();
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m236151i() {
        if ((ar.m236694a().getResources().getConfiguration().screenLayout & 15) == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static boolean m236158p() {
        if (f151971k == null) {
            f151971k = Boolean.valueOf(Build.BRAND.toLowerCase().contains("xiaomi"));
        }
        return f151971k.booleanValue();
    }

    /* renamed from: h */
    public static boolean m236150h() {
        if (SystemClock.elapsedRealtime() - ((Long) f151974n.first).longValue() > 1000) {
            f151974n = new Pair<>(Long.valueOf(SystemClock.elapsedRealtime()), Boolean.valueOf(m236149g()));
        }
        return ((Boolean) f151974n.second).booleanValue();
    }

    /* renamed from: k */
    public static String m236153k() {
        MeetingAudioManager.AudioType y;
        if (MeetingAudioManager.m239471k().mo212721z() || (y = MeetingAudioManager.m239471k().mo212720y()) == MeetingAudioManager.AudioType.Default) {
            return "MicrophoneBuiltIn";
        }
        if (y == MeetingAudioManager.AudioType.Bluetooth) {
            String x = MeetingAudioManager.m239471k().mo212719x();
            if (!TextUtils.isEmpty(x)) {
                return x;
            }
            return "MicrophoneBuiltIn";
        } else if (y == MeetingAudioManager.AudioType.HeadPhone) {
            return "MicrophoneWired";
        } else {
            return "MicrophoneBuiltIn";
        }
    }

    /* renamed from: l */
    public static String m236154l() {
        MeetingAudioManager.AudioType y;
        if (MeetingAudioManager.m239471k().mo212721z() || (y = MeetingAudioManager.m239471k().mo212720y()) == MeetingAudioManager.AudioType.Default) {
            return "SpeakerBuiltIn";
        }
        if (y == MeetingAudioManager.AudioType.Bluetooth) {
            String x = MeetingAudioManager.m239471k().mo212719x();
            if (!TextUtils.isEmpty(x)) {
                return x;
            }
            return "SpeakerBuiltIn";
        } else if (y == MeetingAudioManager.AudioType.HeadPhone) {
            return "MicrophoneWired";
        } else {
            return "SpeakerBuiltIn";
        }
    }

    /* renamed from: m */
    public static String m236155m() {
        if (C60917a.m236770b()) {
            return "usb_camera";
        }
        C61303k kVar = (C61303k) MeetingManager.m238341a().mo211908l();
        if (kVar == null) {
            return "";
        }
        if (kVar.mo212092J().mo212513J()) {
            return "front_camera";
        }
        return "back_camera";
    }

    /* renamed from: o */
    public static boolean m236157o() {
        Boolean bool = f151973m;
        if (bool == null) {
            Context a = ar.m236694a();
            Boolean valueOf = Boolean.valueOf(MagicWindowUtil.m224686d(a));
            f151973m = valueOf;
            if (!valueOf.booleanValue() || !MagicWindowUtil.m224687e(a)) {
                return false;
            }
            return true;
        } else if (bool.booleanValue()) {
            return MagicWindowUtil.m224687e(ar.m236694a());
        } else {
            return false;
        }
    }

    /* renamed from: q */
    public static boolean m236159q() {
        boolean z;
        if (f151972l == null) {
            if (Build.BRAND.toLowerCase().contains("huawei") || Build.BRAND.toLowerCase().contains("honor")) {
                z = true;
            } else {
                z = false;
            }
            f151972l = Boolean.valueOf(z);
        }
        return f151972l.booleanValue();
    }

    /* renamed from: a */
    public static void m236142a(boolean z) {
        f151962b = z;
    }

    /* renamed from: a */
    private static C60778b m236141a(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return new C60778b(displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.scaledDensity);
    }

    /* renamed from: a */
    public static boolean m236143a(Activity activity) {
        if (activity == null) {
            return false;
        }
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 1 || rotation == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C60777a m236140a(C61303k kVar) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) ar.m236694a().getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        int max = Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels);
        int min = Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels);
        double d = (double) max;
        double d2 = (d * 1.0d) / 1920.0d;
        double d3 = (double) min;
        double d4 = (d3 / 1.0d) / 1080.0d;
        if (d2 < 1.0d && d4 < 1.0d) {
            return new C60777a(max, min);
        }
        if (kVar == null || kVar.mo212056e() == null || kVar.mo212056e().getVideoChatSettings() == null || !kVar.mo212056e().getVideoChatSettings().isBoxSharing()) {
            double max2 = Math.max(d2, d4);
            return new C60777a((int) (d / max2), (int) (d3 / max2));
        }
        double min2 = Math.min(d2, d4);
        return new C60777a((int) (d / min2), (int) (d3 / min2));
    }

    /* renamed from: com.ss.android.vc.common.e.r$a */
    public static class C60777a {

        /* renamed from: a */
        public int f151975a;

        /* renamed from: b */
        public int f151976b;

        public C60777a(int i, int i2) {
            this.f151975a = i;
            this.f151976b = i2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.common.e.r$b */
    public static class C60778b {

        /* renamed from: a */
        int f151977a;

        /* renamed from: b */
        int f151978b;

        /* renamed from: c */
        float f151979c;

        C60778b(int i, int i2, float f) {
            this.f151977a = i;
            this.f151978b = i2;
            this.f151979c = f;
        }
    }
}
