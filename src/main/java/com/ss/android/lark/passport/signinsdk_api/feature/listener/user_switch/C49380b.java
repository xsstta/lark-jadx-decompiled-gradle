package com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch;

import com.ss.android.lark.passport.signinsdk_api.account.User;

/* renamed from: com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.b */
public class C49380b {

    /* renamed from: a */
    public final UserSwitchReason f123930a;

    /* renamed from: b */
    public final User f123931b;

    /* renamed from: c */
    public final User f123932c;

    public String toString() {
        return "UserSwitchBeginContext{reason=" + this.f123930a + ", activeUser=" + this.f123931b + ", targetUser=" + this.f123932c + '}';
    }

    public C49380b(UserSwitchReason userSwitchReason, User user, User user2) {
        this.f123930a = userSwitchReason;
        this.f123931b = user;
        this.f123932c = user2;
    }
}
