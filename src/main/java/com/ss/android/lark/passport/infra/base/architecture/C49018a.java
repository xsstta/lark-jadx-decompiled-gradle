package com.ss.android.lark.passport.infra.base.architecture;

import android.app.Activity;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.passport.infra.base.architecture.a */
public class C49018a {

    /* renamed from: a */
    public static final int[] f123065a = {R.anim.signin_sdk_slide_right_in, R.anim.signin_sdk_hold};

    /* renamed from: b */
    public static final int[] f123066b = {R.anim.signin_sdk_hold, R.anim.signin_sdk_slide_left_out};

    /* renamed from: c */
    public static final int[] f123067c = {R.anim.signin_sdk_hold, R.anim.signin_sdk_slide_right_out};

    /* renamed from: d */
    public static final int[] f123068d = {R.anim.signin_sdk_fade_in, R.anim.signin_sdk_hold};

    /* renamed from: e */
    public static final int[] f123069e = {R.anim.signin_sdk_hold, R.anim.signin_sdk_fade_out};

    /* renamed from: f */
    public static final int[] f123070f = {R.anim.signin_sdk_slide_bottom_in, R.anim.signin_sdk_hold};

    /* renamed from: g */
    public static final int[] f123071g = {R.anim.signin_sdk_hold, R.anim.signin_sdk_slide_bottom_out};

    /* renamed from: com.ss.android.lark.passport.infra.base.architecture.a$a */
    public static class C49019a {

        /* renamed from: a */
        private int f123072a = Integer.MIN_VALUE;

        /* renamed from: b */
        private int f123073b = Integer.MIN_VALUE;

        /* renamed from: a */
        public int mo171167a() {
            return this.f123072a;
        }

        /* renamed from: b */
        public int mo171168b() {
            return this.f123073b;
        }

        public C49019a() {
        }

        public C49019a(int[] iArr) {
            if (iArr != null) {
                if (iArr.length > 0) {
                    this.f123072a = iArr[0];
                }
                if (iArr.length > 1) {
                    this.f123073b = iArr[1];
                }
            }
        }
    }

    /* renamed from: a */
    public static void m193088a(Activity activity, C49019a aVar) {
        if (activity != null && aVar != null) {
            activity.overridePendingTransition(aVar.mo171167a(), aVar.mo171168b());
        }
    }

    /* renamed from: a */
    public static void m193089a(Activity activity, C49019a aVar, C49019a aVar2) {
        if (aVar == null) {
            aVar = aVar2;
        }
        m193088a(activity, aVar);
    }
}
