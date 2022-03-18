package com.ss.android.lark.passport.signinsdk_api.feature.listener.p2458a;

import com.ss.android.lark.passport.signinsdk_api.account.User;
import java.util.List;

/* renamed from: com.ss.android.lark.passport.signinsdk_api.feature.listener.a.a */
public class C49373a {

    /* renamed from: a */
    public final boolean f123916a;

    /* renamed from: b */
    public final boolean f123917b;

    /* renamed from: c */
    public final List<? extends User> f123918c;

    /* renamed from: d */
    public final List<? extends User> f123919d;

    /* renamed from: e */
    public final User f123920e;

    public String toString() {
        return "LoginEndContext{isSuccess=" + this.f123916a + ", isFastLogin=" + this.f123917b + ", loginUserList=" + this.f123918c + ", allUserList=" + this.f123919d + ", activeUser=" + this.f123920e + '}';
    }

    public C49373a(boolean z, boolean z2, List<? extends User> list, List<? extends User> list2, User user) {
        this.f123916a = z;
        this.f123917b = z2;
        this.f123918c = list;
        this.f123919d = list2;
        this.f123920e = user;
    }
}
