package com.ss.android.lark.passport.signinsdk_api.feature.listener.logout;

import com.ss.android.lark.passport.signinsdk_api.account.User;
import java.util.List;

/* renamed from: com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.a */
public class C49375a {

    /* renamed from: a */
    public final LogoutReason f123921a;

    /* renamed from: b */
    public final List<? extends User> f123922b;

    /* renamed from: c */
    public boolean f123923c;

    public String toString() {
        return "LogoutBeginContext{reason=" + this.f123921a + ", logoutUserList=" + this.f123922b + ", isLogoutAll=" + this.f123923c + '}';
    }

    public C49375a(LogoutReason logoutReason, List<? extends User> list, boolean z) {
        this.f123921a = logoutReason;
        this.f123922b = list;
        this.f123923c = z;
    }
}
