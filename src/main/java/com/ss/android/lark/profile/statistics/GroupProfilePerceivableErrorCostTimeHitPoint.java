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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\u0003\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\tJ\u0006\u0010\u000e\u001a\u00020\tJ\u0006\u0010\u000f\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/profile/statistics/GroupProfilePerceivableErrorCostTimeHitPoint;", "", "()V", "headerImgCompleted", "", "key", "", "otherCompleted", "firstRender", "", "initViewCostEnd", "initViewCostStart", "otherInfoCompleted", "perceptionCostStart", "perceptionNetError", "sdkCostNetEnd", "sdkCostNetStart", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.statistics.b */
public final class GroupProfilePerceivableErrorCostTimeHitPoint {

    /* renamed from: a */
    public static final GroupProfilePerceivableErrorCostTimeHitPoint f130734a = new GroupProfilePerceivableErrorCostTimeHitPoint();

    /* renamed from: b */
    private static String f130735b = "";

    /* renamed from: c */
    private static boolean f130736c;

    /* renamed from: d */
    private static boolean f130737d;

    private GroupProfilePerceivableErrorCostTimeHitPoint() {
    }

    /* renamed from: c */
    public final void mo180532c() {
        AppreciableKit.f73094h.mo103524a().mo103517a(f130735b, "sdk_cost_net");
    }

    /* renamed from: d */
    public final void mo180533d() {
        AppreciableKit.f73094h.mo103524a().mo103521b(f130735b, "sdk_cost_net");
    }

    /* renamed from: e */
    public final void mo180534e() {
        AppreciableKit.f73094h.mo103524a().mo103517a(f130735b, "init_view_cost");
    }

    /* renamed from: f */
    public final void mo180535f() {
        AppreciableKit.f73094h.mo103524a().mo103521b(f130735b, "init_view_cost");
    }

    /* renamed from: g */
    public final void mo180536g() {
        AppreciableKit.f73094h.mo103524a().mo103521b(f130735b, "first_render");
    }

    /* renamed from: h */
    public final void mo180537h() {
        f130736c = true;
        if (f130737d) {
            AppreciableKit.f73094h.mo103524a().mo103515a(f130735b);
        }
    }

    /* renamed from: i */
    public final void mo180538i() {
        f130737d = true;
        if (f130736c) {
            AppreciableKit.f73094h.mo103524a().mo103515a(f130735b);
        }
    }

    /* renamed from: a */
    public final void mo180530a() {
        f130736c = false;
        f130737d = false;
        AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Messenger, Scene.Profile, Event.enter_profile, ErrorType.Network, ErrorLevel.Fatal, 2, null, "GroupProfile", null, true, null, null, null, 7488, null));
    }

    /* renamed from: b */
    public final void mo180531b() {
        f130736c = false;
        f130737d = false;
        HashMap hashMap = new HashMap();
        hashMap.put("profile_type", 1);
        f130735b = AppreciableKit.m107388a(AppreciableKit.f73094h.mo103524a(), Biz.Messenger, Scene.Profile, Event.enter_profile, "GroupProfile", false, null, null, null, hashMap, 240, null);
    }
}
