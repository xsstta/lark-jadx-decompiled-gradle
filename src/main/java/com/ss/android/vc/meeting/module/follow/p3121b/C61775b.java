package com.ss.android.vc.meeting.module.follow.p3121b;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.doc.follow.AbstractC5415a;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.follow.common.FollowConfig;
import com.ss.android.vc.statistics.event.C63769r;
import com.ss.android.vc.statistics.event.C63770s;
import com.ss.android.vc.statistics.event.C63771t;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.vc.meeting.module.follow.b.b */
public class C61775b {

    /* renamed from: a */
    private static AtomicBoolean f155034a = new AtomicBoolean(false);

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m241314a(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m241315b() {
        VCDialogUtils.m236176a(C60773o.m236119a((int) R.string.View_G_DocxNotSupportedShare), R.string.View_G_ConfirmButton, $$Lambda$b$Fi5ll_g7OmfFAI5MfGnQ4eQNytc.INSTANCE, true);
    }

    /* renamed from: a */
    public static void m241312a() {
        if (FollowConfig.m241446b() && f155034a.get()) {
            C60700b.m235851b("FollowLog_CCMFollowService", "[destroy]", "destroy");
            C63769r.m250338a((C61303k) null, (FollowInfo) null);
            C63770s.m250361a();
            VideoChatModuleDependency.getDocsDependency().mo196380c().mo196383a();
            f155034a.set(false);
        }
    }

    /* renamed from: a */
    public static void m241313a(Context context) {
        if (FollowConfig.m241446b() && !f155034a.get()) {
            C60700b.m235851b("FollowLog_CCMFollowService", "[preload]", "preload");
            long currentTimeMillis = System.currentTimeMillis();
            VideoChatModuleDependency.getDocsDependency().mo196379b();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            long currentTimeMillis3 = System.currentTimeMillis();
            VideoChatModuleDependency.getDocsDependency().mo196380c().mo196384a(context);
            C63771t.m250371a(currentTimeMillis2, System.currentTimeMillis() - currentTimeMillis3);
            f155034a.set(true);
        }
    }

    /* renamed from: a */
    public static Fragment m241311a(Context context, String str, boolean z, AbstractC5415a aVar) {
        if (!f155034a.get()) {
            m241313a(context);
        }
        try {
            return VideoChatModuleDependency.getDocsDependency().mo196380c().mo196381a(context, str, z, aVar);
        } catch (Exception e) {
            C60735ab.m236001a($$Lambda$b$kR_qbDdde0YLhGHhcCY1Bz4eCx0.INSTANCE);
            C60700b.m235864f("FollowLog_CCMFollowService", "[createFragment]", "UnsupportedFollowTypeException: " + str);
            e.printStackTrace();
            return null;
        }
    }
}
