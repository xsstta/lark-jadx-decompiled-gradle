package com.ss.android.lark.profile.statistics;

import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\u0005\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\nJ\u0016\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\nJ\u0006\u0010\u0017\u001a\u00020\nJ\u0006\u0010\u0018\u001a\u00020\nJ\u0006\u0010\u0019\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/profile/statistics/UserProfilePerceptionErrorCostTimeHitPoint;", "", "()V", "avatarLoadedStart", "", "headerImgCompleted", "key", "", "otherCompleted", "avatarCostEnd", "", "avatarCostStart", "firstRender", "initViewCostEnd", "initViewCostStart", "otherInfoCompleted", "perceptionCostStart", "profileVersion", "", "sourceType", "perceptionLocalError", "perceptionNetError", "sdkCostLocalEnd", "sdkCostLocalStart", "sdkCostNetEnd", "sdkCostNetStart", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.statistics.g */
public final class UserProfilePerceptionErrorCostTimeHitPoint {

    /* renamed from: a */
    public static final UserProfilePerceptionErrorCostTimeHitPoint f130747a = new UserProfilePerceptionErrorCostTimeHitPoint();

    /* renamed from: b */
    private static String f130748b = "";

    /* renamed from: c */
    private static boolean f130749c;

    /* renamed from: d */
    private static boolean f130750d;

    /* renamed from: e */
    private static boolean f130751e;

    private UserProfilePerceptionErrorCostTimeHitPoint() {
    }

    /* renamed from: a */
    public final void mo180608a() {
        AppreciableKit.f73094h.mo103524a().mo103517a(f130748b, "sdk_cost_local");
    }

    /* renamed from: b */
    public final void mo180611b() {
        AppreciableKit.f73094h.mo103524a().mo103521b(f130748b, "sdk_cost_local");
    }

    /* renamed from: c */
    public final void mo180613c() {
        AppreciableKit.f73094h.mo103524a().mo103517a(f130748b, "sdk_cost_net");
    }

    /* renamed from: d */
    public final void mo180614d() {
        AppreciableKit.f73094h.mo103524a().mo103521b(f130748b, "sdk_cost_net");
    }

    /* renamed from: g */
    public final void mo180617g() {
        AppreciableKit.f73094h.mo103524a().mo103517a(f130748b, "init_view_cost");
    }

    /* renamed from: h */
    public final void mo180618h() {
        AppreciableKit.f73094h.mo103524a().mo103521b(f130748b, "init_view_cost");
    }

    /* renamed from: i */
    public final void mo180619i() {
        AppreciableKit.f73094h.mo103524a().mo103521b(f130748b, "first_render");
    }

    /* renamed from: e */
    public final void mo180615e() {
        if (!f130751e) {
            f130751e = true;
            AppreciableKit.f73094h.mo103524a().mo103517a(f130748b, "avatar_cost");
        }
    }

    /* renamed from: f */
    public final void mo180616f() {
        if (f130751e) {
            f130751e = false;
            AppreciableKit.f73094h.mo103524a().mo103521b(f130748b, "avatar_cost");
        }
    }

    /* renamed from: j */
    public final void mo180620j() {
        f130749c = true;
        if (f130750d) {
            f130749c = false;
            f130750d = false;
            f130751e = false;
            AppreciableKit.f73094h.mo103524a().mo103515a(f130748b);
        }
    }

    /* renamed from: k */
    public final void mo180621k() {
        f130750d = true;
        if (f130749c) {
            f130749c = false;
            f130750d = false;
            f130751e = false;
            AppreciableKit.f73094h.mo103524a().mo103515a(f130748b);
        }
    }

    /* renamed from: a */
    public final void mo180609a(int i) {
        f130749c = false;
        f130750d = false;
        f130751e = false;
        AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Messenger, Scene.Profile, Event.enter_profile, ErrorType.Network, ErrorLevel.Fatal, 2, null, "UserProfile", null, true, i, null, null, null));
    }

    /* renamed from: b */
    public final void mo180612b(int i) {
        f130749c = false;
        f130750d = false;
        f130751e = false;
        AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Messenger, Scene.Profile, Event.enter_profile, ErrorType.SDK, ErrorLevel.Fatal, 1, null, "UserProfile", null, false, i, null, null, null));
    }

    /* renamed from: a */
    public final void mo180610a(int i, int i2) {
        f130749c = false;
        f130750d = false;
        f130751e = false;
        HashMap hashMap = new HashMap();
        hashMap.put("profile_type", 2);
        if (i == 2) {
            hashMap.put("source_type", Integer.valueOf(i2));
        }
        f130748b = AppreciableKit.m107387a(AppreciableKit.f73094h.mo103524a(), Biz.Messenger, Scene.Profile, Event.enter_profile, "UserProfile", false, i, null, null, null, hashMap, 464, null);
    }
}
