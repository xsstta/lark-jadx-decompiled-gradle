package com.ss.android.vc.common.p3077b;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.p3078a.C60696a;
import com.ss.android.vc.common.p3077b.p3078a.C60697b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60775q;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.p3069b.C60685h;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.vc.common.b.b */
public class C60700b {

    /* renamed from: a */
    private static long f151833a;

    /* renamed from: b */
    private static final ArrayList<String> f151834b = new ArrayList<>();

    /* renamed from: c */
    private static ConcurrentHashMap<String, Integer> f151835c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private static ConcurrentHashMap<String, String> f151836d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private static ConcurrentHashMap<String, C60695a> f151837e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static ConcurrentHashMap<String, Long> f151838f = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static boolean m235855c() {
        return false;
    }

    /* renamed from: a */
    public static void m235840a() {
        f151833a = System.currentTimeMillis();
    }

    /* renamed from: com.ss.android.vc.common.b.b$a */
    public static class C60702a {

        /* renamed from: a */
        private static long f151842a;

        /* renamed from: b */
        private static int f151843b;

        /* renamed from: c */
        private static int f151844c;

        /* renamed from: a */
        public static synchronized int m235866a() {
            int i;
            synchronized (C60702a.class) {
                i = f151844c;
                f151844c = 0;
            }
            return i;
        }

        /* renamed from: a */
        public static synchronized void m235867a(String str) {
            synchronized (C60702a.class) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - f151842a >= 60000) {
                    Log.m165389i("VideoConference", "CommonLogStatistics: vcLoggerSpeed = " + f151843b + "/minute");
                    if (f151843b > 1000) {
                        C60738ac.m236029a("FrequentLogWarning(" + f151843b + ")");
                    }
                    f151842a = currentTimeMillis;
                    f151843b = 0;
                }
                f151843b++;
                f151844c++;
                int length = str.length();
                if (length > 2000 && !str.contains("onPushInMeetingChangedInfo")) {
                    C60738ac.m236029a("LargeLogWarning: " + str.substring(0, 50));
                    Log.m165397w("CommonLogStatistics", "LargeLogWarning(" + length + "): " + str);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m235847b() {
        if (m235855c()) {
            final StringBuilder sb = new StringBuilder();
            int[] iArr = new int[20];
            for (int i = 0; i < 20; i++) {
                iArr[i] = 0;
            }
            String[] strArr = new String[20];
            for (String str : f151835c.keySet()) {
                Integer num = 0;
                if (f151835c.get(str) != null) {
                    num = f151835c.get(str);
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= 20) {
                        break;
                    } else if (num.intValue() > iArr[i2]) {
                        strArr[i2] = str;
                        for (int i3 = 19; i3 > i2; i3--) {
                            iArr[i3] = iArr[i3 - 1];
                        }
                        iArr[i2] = num.intValue();
                    } else {
                        i2++;
                    }
                }
            }
            int i4 = 0;
            for (Integer num2 : f151835c.values()) {
                if (num2 != null && num2.intValue() > 0) {
                    i4 += num2.intValue();
                }
            }
            final StringBuilder sb2 = new StringBuilder("Total " + i4 + " logs.");
            long currentTimeMillis = System.currentTimeMillis() - f151833a;
            f151833a = 0;
            int i5 = (int) (((long) i4) / (currentTimeMillis / 1000));
            sb2.append(i5);
            sb2.append(" per second on Average.\n");
            if (i5 > 10) {
                sb2.append("Excel limit: 10 per second.\n\n");
            }
            sb2.append("Top 20 are:\n");
            for (int i6 = 0; i6 < 20; i6++) {
                sb2.append(iArr[i6]);
                sb2.append(" ");
                sb2.append(strArr[i6]);
                sb2.append("\n");
            }
            final StringBuilder sb3 = new StringBuilder();
            int size = f151836d.keySet().size();
            if (size > 0) {
                sb3.append("\n\nLarge Log Warning " + size + ": \n");
                for (String str2 : f151836d.keySet()) {
                    sb3.append(str2);
                    sb3.append(", ");
                }
            }
            C60735ab.m236002a(new Runnable() {
                /* class com.ss.android.vc.common.p3077b.C60700b.RunnableC607011 */

                public void run() {
                    Activity c = VCAppLifeCycle.m236256c();
                    if (c != null) {
                        StringBuilder sb = sb;
                        sb.append((CharSequence) sb2);
                        sb.append((CharSequence) sb3);
                        C60703d.m235870a(c, sb.toString());
                    }
                }
            }, 2000);
            f151835c = new ConcurrentHashMap<>();
            f151836d = new ConcurrentHashMap<>();
            f151837e = new ConcurrentHashMap<>();
            f151838f = new ConcurrentHashMap<>();
            f151834b.clear();
        }
    }

    /* renamed from: a */
    public static void m235842a(String str) {
        if (!m235855c()) {
            return;
        }
        if (f151835c.get(str) == null) {
            f151835c.put(str, 1);
            return;
        }
        f151835c.put(str, Integer.valueOf(f151835c.get(str).intValue() + 1));
    }

    /* renamed from: b */
    public static void m235849b(String str) {
        if (m235855c()) {
            C60695a aVar = f151837e.get(str);
            if (aVar == null) {
                f151837e.put(str, new C60695a());
                return;
            }
            aVar.f151823a.add(Long.valueOf(System.currentTimeMillis()));
            int size = aVar.f151823a.size();
            if (size >= 10) {
                long longValue = aVar.f151823a.get(size - 1).longValue() - aVar.f151823a.get(size - 10).longValue();
                if (longValue < 1000) {
                    LoggerEvent.m235869a(str, 10, longValue);
                }
                if (longValue < aVar.f151824b) {
                    aVar.f151824b = longValue;
                }
            }
        }
    }

    /* renamed from: d */
    private static void m235857d(String str, String str2) {
        m235852c(null, "", "", "", str, str2);
    }

    /* renamed from: e */
    private static void m235860e(String str, String str2) {
        m235856d(null, "", "", "", str, str2);
    }

    /* renamed from: f */
    private static void m235863f(String str, String str2) {
        m235859e(null, "", "", "", str, str2);
    }

    /* renamed from: a */
    public static String m235839a(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append("_");
        if (!TextUtils.isEmpty(str2)) {
            if (!str2.startsWith("[")) {
                sb.append("[");
            }
            sb.append(str2);
            if (!str2.endsWith("]")) {
                sb.append("]");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static void m235850b(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.length() > 2500) {
            LoggerEvent.m235868a(str, str2.length());
            if (m235855c() && TextUtils.isEmpty(f151836d.get(str))) {
                f151836d.put(str, str2);
            }
        }
    }

    /* renamed from: c */
    private static void m235853c(String str, String str2) {
        if (C60775q.m236138a()) {
            String format = String.format("[%s]%s", Thread.currentThread().getName(), str2);
            android.util.Log.d("VideoConference", str + ": " + format);
        }
    }

    /* renamed from: c */
    public static void m235854c(String str, String str2, String str3) {
        m235857d(str, str2 + " " + str3);
    }

    /* renamed from: d */
    public static void m235858d(String str, String str2, String str3) {
        String a = m235839a(str, str2);
        ArrayList<String> arrayList = f151834b;
        if (!arrayList.contains(a)) {
            arrayList.add(a);
            m235851b(str, str2, str3);
        }
    }

    /* renamed from: g */
    public static void m235865g(String str, String str2, String str3) {
        m235863f(str, str2 + " " + str3);
    }

    /* renamed from: e */
    public static void m235861e(String str, String str2, String str3) {
        String a = m235839a(str, str2);
        m235850b(a, str3);
        m235842a(a);
        m235849b(a);
        m235860e(str, str2 + " " + str3);
    }

    /* renamed from: f */
    public static void m235864f(String str, String str2, String str3) {
        String a = m235839a(str, str2);
        m235850b(a, str3);
        m235842a(a);
        m235849b(a);
        m235863f(str, str2 + " " + str3);
    }

    /* renamed from: a */
    public static void m235843a(String str, String str2, String str3) {
        m235853c(str, m235839a(str, str2) + " " + str3);
    }

    /* renamed from: b */
    public static void m235851b(String str, String str2, String str3) {
        String a = m235839a(str, str2);
        m235850b(a, str3);
        m235842a(a);
        m235849b(a);
        m235857d(str, str2 + " " + str3);
    }

    /* renamed from: a */
    public static void m235846a(String str, String str2, Throwable th) {
        if (C60775q.m236138a()) {
            str2 = String.format("[%s]%s", Thread.currentThread().getName(), str2);
        }
        if (C60685h.f151809a) {
            C60702a.m235867a(str + ": " + str2);
        }
        Log.m165384e("VideoConference", str + ": " + str2, th);
        m235862f(null, "", "", "", str + ":" + str2, "error");
    }

    /* renamed from: a */
    public static void m235844a(String str, String str2, String str3, long j) {
        long j2;
        String a = m235839a(str, str2);
        if (j < 10) {
            j = 10;
        }
        if (f151838f.get(a) != null) {
            j2 = f151838f.get(a).longValue();
        } else {
            j2 = 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - j2 > j) {
            m235851b(str, str2, str3);
            f151838f.put(a, Long.valueOf(elapsedRealtime));
        }
    }

    /* renamed from: a */
    public static void m235845a(String str, String str2, String str3, String str4, String str5) {
        m235852c(null, str, str2, str3, "VCCoreLog_" + str4, str5);
    }

    /* renamed from: a */
    public static void m235841a(VideoChat videoChat, String str, String str2, String str3, String str4, String str5) {
        m235852c(videoChat, str, str2, str3, "VCCoreLog_" + str4, str5);
    }

    /* renamed from: b */
    public static void m235848b(VideoChat videoChat, String str, String str2, String str3, String str4, String str5) {
        m235859e(videoChat, str, str2, str3, "VCCoreLog_" + str4, str5);
    }

    /* renamed from: c */
    private static void m235852c(VideoChat videoChat, String str, String str2, String str3, String str4, String str5) {
        if (!TextUtils.isEmpty(str5)) {
            if (C60775q.m236138a()) {
                str5 = String.format("[%s] %s", Thread.currentThread().getName(), str5);
            }
            if (C60685h.f151809a) {
                C60702a.m235867a(str4 + ": " + str5);
            }
            Log.m165389i("VideoConference", str4 + ": " + str5);
        }
        m235862f(videoChat, str, str2, str3, str4 + ":" + str5, "info");
    }

    /* renamed from: d */
    private static void m235856d(VideoChat videoChat, String str, String str2, String str3, String str4, String str5) {
        if (!TextUtils.isEmpty(str5)) {
            if (C60775q.m236138a()) {
                str5 = String.format("[%s]%s", Thread.currentThread().getName(), str5);
            }
            if (C60685h.f151809a) {
                C60702a.m235867a(str4 + ": " + str5);
            }
            Log.m165397w("VideoConference", str4 + ": " + str5);
        }
        m235862f(videoChat, str, str2, str3, str4 + ":" + str5, "warn");
    }

    /* renamed from: e */
    private static void m235859e(VideoChat videoChat, String str, String str2, String str3, String str4, String str5) {
        if (!TextUtils.isEmpty(str5)) {
            if (C60775q.m236138a()) {
                str5 = String.format("[%s]%s", Thread.currentThread().getName(), str5);
            }
            if (C60685h.f151809a) {
                C60702a.m235867a(str4 + ": " + str5);
            }
            Log.m165383e("VideoConference", str4 + ": " + str5);
        }
        m235862f(videoChat, str, str2, str3, str4 + ":" + str5, "error");
    }

    /* renamed from: f */
    private static void m235862f(VideoChat videoChat, String str, String str2, String str3, String str4, String str5) {
        boolean z;
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                z = false;
            } else {
                z = true;
            }
            if (z || "warn".equals(str5) || "error".equals(str5)) {
                C60697b.C60699a aVar = new C60697b.C60699a();
                aVar.mo208265a(str).mo208267b(str2).mo208270e(str3).mo208269d(str4).mo208271f(str5);
                if (!(videoChat == null || videoChat.getId() == null)) {
                    aVar.mo208268c(videoChat.getId());
                }
                C60696a.m235830a("vc_monitor_log", aVar.mo208266a());
            }
        } catch (Exception unused) {
        }
    }
}
