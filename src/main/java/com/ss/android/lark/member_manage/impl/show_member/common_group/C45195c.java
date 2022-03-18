package com.ss.android.lark.member_manage.impl.show_member.common_group;

import com.ss.android.lark.chat.entity.chatter.Chatter;

/* renamed from: com.ss.android.lark.member_manage.impl.show_member.common_group.c */
public class C45195c {

    /* renamed from: a */
    private boolean f114389a;

    /* renamed from: a */
    public void mo159773a(boolean z) {
        this.f114389a = z;
    }

    /* renamed from: a */
    public boolean mo159774a(Chatter chatter) {
        if (chatter == null) {
            return true;
        }
        if (!this.f114389a || !chatter.isBot()) {
            return false;
        }
        return true;
    }
}
