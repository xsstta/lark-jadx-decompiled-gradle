package com.ss.android.lark.leanmode.p2121c;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.ss.android.lark.leanmode.C41267h;
import com.ss.android.lark.leanmode.dto.LeanMode;
import com.ss.android.lark.util.share_preference.UserSP;

/* renamed from: com.ss.android.lark.leanmode.c.d */
public final class C41258d {

    /* renamed from: a */
    private static String f105027a = "key_lean_mode_on";

    /* renamed from: b */
    private LeanMode f105028b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.leanmode.c.d$a */
    public static final class C41260a {

        /* renamed from: a */
        public static final C41258d f105029a = new C41258d();
    }

    /* renamed from: a */
    public static C41258d m163569a() {
        return C41260a.f105029a;
    }

    private C41258d() {
        this.f105028b = new LeanMode();
    }

    /* renamed from: b */
    public void mo148614b() {
        UserSP.getInstance().remove(f105027a);
    }

    /* renamed from: d */
    public LeanMode mo148617d() {
        if (this.f105028b == null) {
            this.f105028b = new LeanMode();
        }
        return this.f105028b;
    }

    /* renamed from: c */
    public LeanMode mo148616c() {
        String string = UserSP.getInstance().getString(C41267h.m163598a().mo143880f());
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return (LeanMode) new Gson().fromJson(string, LeanMode.class);
    }

    /* renamed from: a */
    public void mo148613a(LeanMode leanMode) {
        m163570c(leanMode);
        if (leanMode == null) {
            UserSP.getInstance().putBoolean(f105027a, false);
        } else {
            UserSP.getInstance().putBoolean(f105027a, leanMode.isDeviceInLeanMode());
        }
    }

    /* renamed from: b */
    public void mo148615b(LeanMode leanMode) {
        if (leanMode != null) {
            this.f105028b = leanMode.clone();
        } else {
            this.f105028b = new LeanMode();
        }
    }

    /* renamed from: c */
    private void m163570c(LeanMode leanMode) {
        String f = C41267h.m163598a().mo143880f();
        if (leanMode == null) {
            UserSP.getInstance().putString(f, "");
        }
        UserSP.getInstance().putString(f, new Gson().toJson(leanMode));
    }
}
