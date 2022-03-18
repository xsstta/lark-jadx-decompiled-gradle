package com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch;

import com.ss.android.lark.passport.signinsdk_api.account.User;

/* renamed from: com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.d */
public class C49382d {

    /* renamed from: a */
    public final UserSwitchReason f123935a;

    /* renamed from: b */
    public final User f123936b;

    /* renamed from: c */
    public final User f123937c;

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("UserSwitchEndContext{, reason=");
        sb.append(this.f123935a);
        sb.append(", previousActiveUser=");
        User user = this.f123936b;
        String str2 = "null";
        if (user == null) {
            str = str2;
        } else {
            str = user.userId;
        }
        sb.append(str);
        sb.append(", currentActiveUser=");
        User user2 = this.f123937c;
        if (user2 != null) {
            str2 = user2.userId;
        }
        sb.append(str2);
        sb.append('}');
        return sb.toString();
    }

    public C49382d(UserSwitchReason userSwitchReason, User user, User user2) {
        this.f123935a = userSwitchReason;
        this.f123936b = user;
        this.f123937c = user2;
    }
}
