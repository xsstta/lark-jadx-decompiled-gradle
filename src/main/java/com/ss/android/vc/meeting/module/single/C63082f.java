package com.ss.android.vc.meeting.module.single;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.C0729b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.business.bytertc.meeting.ByteRTCMeetingDesktopActivity;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivityInstance;
import com.ss.android.vc.meeting.utils.C63532r;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vcxp.C63791b;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: com.ss.android.vc.meeting.module.single.f */
public class C63082f {

    /* renamed from: a */
    private static Handler f158998a = new Handler(Looper.getMainLooper());

    /* renamed from: com.ss.android.vc.meeting.module.single.f$a */
    public static class RunnableC63083a implements Runnable {

        /* renamed from: a */
        C63084b f158999a;

        public void run() {
            Class cls;
            Class cls2;
            Class cls3;
            int i = this.f158999a.f159001b;
            C61303k kVar = this.f158999a.f159002c;
            Context a = ar.m236694a();
            HashMap<String, Serializable> hashMap = this.f158999a.f159000a;
            if (i == 1) {
                C60700b.m235851b("VideoChatStateUiPoster", "[openActivity]", "open ByteRTCMeetingActivity2");
                if (kVar == null || !kVar.aE().mo208293c()) {
                    cls = ByteRTCMeetingActivity.class;
                } else {
                    cls = ByteRTCMeetingActivityInstance.class;
                }
                C63082f.m247068a(a, cls, hashMap, false, kVar);
            } else if (i == 2) {
                C60700b.m235851b("VideoChatStateUiPoster", "[openActivity2]", "open ByteRTCMeetingActivity2 from float");
                if (kVar == null || !kVar.aE().mo208293c()) {
                    cls2 = ByteRTCMeetingActivity.class;
                } else {
                    cls2 = ByteRTCMeetingActivityInstance.class;
                }
                C63082f.m247068a(a, cls2, hashMap, true, kVar);
            } else if (i == 3) {
                C60700b.m235851b("VideoChatStateUiPoster", "[openActivity3]", "open ByteRTCMeetingActivity2 wake up");
                if (!C63532r.m248975b(a)) {
                    C63532r.m248972a(a);
                }
                if (kVar == null || !kVar.aE().mo208293c()) {
                    cls3 = ByteRTCMeetingActivity.class;
                } else {
                    cls3 = ByteRTCMeetingActivityInstance.class;
                }
                C63082f.m247068a(a, cls3, hashMap, false, kVar);
            }
        }

        public RunnableC63083a(C63084b bVar) {
            this.f158999a = bVar;
        }
    }

    /* renamed from: com.ss.android.vc.meeting.module.single.f$b */
    public static class C63084b {

        /* renamed from: a */
        HashMap<String, Serializable> f159000a;

        /* renamed from: b */
        int f159001b;

        /* renamed from: c */
        C61303k f159002c;

        public C63084b(int i, HashMap<String, Serializable> hashMap, C61303k kVar) {
            this.f159001b = i;
            this.f159000a = hashMap;
            this.f159002c = kVar;
        }
    }

    /* renamed from: a */
    public static void m247067a(int i, HashMap<String, Serializable> hashMap, C61303k kVar) {
        f158998a.post(new RunnableC63083a(new C63084b(i, hashMap, kVar)));
    }

    /* renamed from: a */
    public static void m247068a(Context context, Class cls, HashMap<String, Serializable> hashMap, boolean z, C61303k kVar) {
        Bundle bundle;
        if (context != null && cls != null) {
            try {
                if (DesktopUtil.m144301a(context) && (cls == ByteRTCMeetingActivity.class || cls == ByteRTCMeetingActivityInstance.class)) {
                    cls = ByteRTCMeetingDesktopActivity.class;
                }
                if (C63791b.m250468b()) {
                    String simpleName = cls.getSimpleName();
                    try {
                        cls = Class.forName(cls.getName().replace(simpleName, "X" + simpleName));
                    } catch (Exception unused) {
                    }
                }
                Intent intent = new Intent(context, cls);
                if (context instanceof Application) {
                    intent.addFlags(268435456);
                    C60700b.m235851b("VideoChatStateUiPoster", "[openActivity4]", "context is instanceof Application");
                } else {
                    C60700b.m235851b("VideoChatStateUiPoster", "[openActivity5]", "context is not instanceof Application");
                }
                if (!(hashMap == null || hashMap.keySet() == null)) {
                    for (String str : hashMap.keySet()) {
                        if (!TextUtils.isEmpty(str)) {
                            intent.putExtra(str, hashMap.get(str));
                        }
                    }
                }
                C60700b.m235851b("VideoChatStateUiPoster", "[openActivity6]", "fromFloat = " + z);
                if ((cls == ByteRTCMeetingActivity.class || cls == ByteRTCMeetingActivityInstance.class || cls == ByteRTCMeetingDesktopActivity.class) && !VCAppLifeCycle.m236255b()) {
                    C63532r.m248973a(intent, z, kVar);
                }
                if (z || !VCAppLifeCycle.m236255b()) {
                    if (z) {
                        try {
                            bundle = C0729b.m3580a(context, 0, 0).mo4236a();
                        } catch (PendingIntent.CanceledException unused2) {
                            context.startActivity(intent);
                        }
                    } else {
                        bundle = null;
                    }
                    PendingIntent activity = PendingIntent.getActivity(context, (int) SystemClock.uptimeMillis(), intent, 134217728, bundle);
                    if (activity != null) {
                        activity.send();
                    }
                } else {
                    context.startActivity(intent);
                }
                if (!(z || kVar.mo212066o() || kVar.mo212063l() || kVar.mo212064m())) {
                    C60700b.m235851b("VideoChatStateUiPoster", "[openActivity]", "meetingId = " + kVar.mo212055d());
                    VcBizSender.m249218a(kVar.mo212055d(), C60785x.m236240d(), (AbstractC63598b<Object>) null);
                }
            } catch (Exception e) {
                C60700b.m235864f("VideoChatStateUiPoster", "[openActivity7]", e.getStackTrace().toString());
            }
        }
    }
}
