package com.ss.android.lark.passport.signinsdk_api.feature.listener.logout;

import com.ss.android.lark.passport.signinsdk_api.account.User;
import java.util.List;

/* renamed from: com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.b */
public class C49376b {

    /* renamed from: a */
    public final boolean f123924a;

    /* renamed from: b */
    public final LogoutReason f123925b;

    /* renamed from: c */
    public final List<? extends User> f123926c;

    /* renamed from: d */
    public final List<? extends User> f123927d;

    /* renamed from: e */
    private boolean f123928e;

    public String toString() {
        return "LogoutEndContext{isSuccess=" + this.f123924a + "isLogoutAll=" + this.f123928e + ", reason=" + this.f123925b + ", logoutUserList=" + this.f123926c + ", allUserList=" + this.f123927d + '}';
    }

    public C49376b(boolean z, LogoutReason logoutReason, List<? extends User> list, List<? extends User> list2) {
        this.f123924a = z;
        this.f123925b = logoutReason;
        this.f123926c = list;
        this.f123927d = list2;
    }
}
