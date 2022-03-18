package com.ss.android.vc.common.p3083e;

import android.text.TextUtils;
import android.view.WindowManager;
import com.larksuite.component.ui.toast.C25707a;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.C26254af;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.lobby.MeetingLobbyFragment;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.meeting.module.preview.facade.MeetingPreviewActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.common.e.ac */
public class C60738ac {

    /* renamed from: a */
    private static C25707a f151933a;

    /* renamed from: b */
    private static List<AbstractC60739a> f151934b = new ArrayList();

    /* renamed from: c */
    private static final Object f151935c = new Object();

    /* renamed from: com.ss.android.vc.common.e.ac$a */
    public interface AbstractC60739a {
        /* renamed from: a */
        void mo208364a();
    }

    /* renamed from: a */
    private static void m236022a() {
        C25707a aVar = f151933a;
        if (aVar != null) {
            aVar.mo90189b();
        }
    }

    /* renamed from: b */
    public static void m236032b(int i) {
        m236035b(C60773o.m236119a(i));
    }

    /* renamed from: c */
    public static void m236037c(int i) {
        m236039c(C60773o.m236119a(i));
    }

    /* renamed from: d */
    public static void m236040d(int i) {
        m236041d(C60773o.m236119a(i));
    }

    /* renamed from: a */
    public static void m236023a(int i) {
        m236029a(C60773o.m236119a(i));
    }

    /* renamed from: b */
    public static void m236034b(AbstractC60739a aVar) {
        synchronized (f151935c) {
            f151934b.remove(aVar);
        }
    }

    /* renamed from: d */
    public static void m236041d(String str) {
        m236030a(str, C60773o.m236115a(200.0d));
    }

    /* renamed from: c */
    public static void m236039c(String str) {
        double d;
        if (C61999a.m242220f()) {
            d = 100.0d;
        } else {
            d = 128.0d;
        }
        m236036b(str, C60773o.m236115a(d));
    }

    /* renamed from: b */
    public static void m236035b(String str) {
        m236027a(-1, str, 3000L, 0, true);
    }

    /* renamed from: e */
    private static long m236042e(String str) {
        int length;
        int i;
        if (TextUtils.isEmpty(str) || str.getBytes() == null || (length = str.getBytes().length) <= 48) {
            return 3000;
        }
        int i2 = length / 16;
        if (length % 16 >= 9) {
            i = 1;
        } else {
            i = 0;
        }
        return (long) ((i2 + i) * 1000);
    }

    /* renamed from: a */
    public static void m236028a(AbstractC60739a aVar) {
        synchronized (f151935c) {
            if (!f151934b.contains(aVar)) {
                f151934b.add(aVar);
            }
        }
    }

    /* renamed from: a */
    public static void m236029a(String str) {
        m236031a(str, 3000L);
    }

    /* renamed from: a */
    public static void m236025a(int i, long j) {
        m236024a(-1, i, j);
    }

    /* renamed from: b */
    private static void m236036b(String str, int i) {
        m236027a(-1, str, 3000L, i, false);
    }

    /* renamed from: a */
    public static void m236030a(String str, int i) {
        if ((VCAppLifeCycle.m236256c() instanceof MeetingPreviewActivity) || ((VCAppLifeCycle.m236256c() instanceof ByteRTCMeetingActivity) && (((ByteRTCMeetingActivity) VCAppLifeCycle.m236256c()).mo212783j() instanceof MeetingLobbyFragment))) {
            m236036b(str, i);
        }
    }

    /* renamed from: a */
    public static void m236031a(String str, long j) {
        m236027a(-1, str, j, 0, false);
    }

    /* renamed from: a */
    public static void m236024a(int i, int i2, long j) {
        m236027a(i, UIHelper.getString(i2), j, 0, false);
    }

    /* renamed from: b */
    public static void m236033b(int i, String str, long j, int i2, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            C60735ab.m236015d().post(new Runnable(i, str, i2, z, j) {
                /* class com.ss.android.vc.common.p3083e.$$Lambda$ac$Ki99KABwWli0ETgHP_SjWKYBUbU */
                public final /* synthetic */ int f$0;
                public final /* synthetic */ String f$1;
                public final /* synthetic */ int f$2;
                public final /* synthetic */ boolean f$3;
                public final /* synthetic */ long f$4;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                public final void run() {
                    C60738ac.m236026a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m236027a(int i, String str, long j, int i2, boolean z) {
        long e = m236042e(str);
        C61303k kVar = (C61303k) MeetingManager.m238341a().mo211906j();
        if (kVar != null && kVar.av().mo213465b()) {
            i2 = kVar.av().mo213466c() + UIHelper.dp2px(86.0f);
        }
        m236033b(i, str, e, i2, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m236026a(int i, String str, int i2, boolean z, long j) {
        C25707a newGlobal = LKUIToast.newGlobal(ar.m236694a(), "");
        try {
            ((WindowManager.LayoutParams) C26254af.m95004a((Object) newGlobal, "getWindowParams", (Class<?>[]) new Class[0]).invoke(newGlobal, new Object[0])).flags |= 524288;
        } catch (Exception unused) {
        }
        if (i != -1) {
            newGlobal.mo90183a(i);
        }
        newGlobal.mo90188a(str);
        m236022a();
        if (i2 != 0 && !z) {
            newGlobal.mo90184a(80, 0, i2);
        } else if (z) {
            newGlobal.mo90182a(17.0f);
            newGlobal.mo90185a(20, 12, 20, 12);
            newGlobal.mo90184a(17, 0, 0);
        }
        f151933a = newGlobal;
        try {
            newGlobal.mo90187a(j);
        } catch (Exception e) {
            C60700b.m235846a("VCToastUtils", "showToast: ", e);
        }
        synchronized (f151935c) {
            if (!f151934b.isEmpty()) {
                for (AbstractC60739a aVar : f151934b) {
                    C60735ab.m236001a(new Runnable() {
                        /* class com.ss.android.vc.common.p3083e.$$Lambda$ac$HuqcS9l1R1UGkOkaQe9gKsHATU */

                        public final void run() {
                            C60738ac.AbstractC60739a.this.mo208364a();
                        }
                    });
                }
            }
        }
    }
}
