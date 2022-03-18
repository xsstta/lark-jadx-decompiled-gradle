package com.ss.android.lark.invitation.v2.feat.external.search;

import android.text.TextUtils;

/* renamed from: com.ss.android.lark.invitation.v2.feat.external.search.f */
public class C40305f {

    /* renamed from: a */
    private String f102399a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.search.f$a */
    public static final class C40307a {

        /* renamed from: a */
        public static final C40305f f102400a = new C40305f();
    }

    private C40305f() {
    }

    /* renamed from: a */
    public static C40305f m159762a() {
        return C40307a.f102400a;
    }

    /* renamed from: b */
    public int mo146159b() {
        if (TextUtils.isEmpty(this.f102399a)) {
            return 0;
        }
        if (this.f102399a.contains("@")) {
            return 9;
        }
        return 8;
    }

    /* renamed from: a */
    public void mo146158a(String str) {
        this.f102399a = str;
    }
}
