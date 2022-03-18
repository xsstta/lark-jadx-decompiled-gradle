package com.ss.android.lark.chatsetting.impl.group.share;

import android.os.Bundle;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.group.share.C35002h;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.share.f */
public class C35000f implements C35002h.AbstractC35003a {

    /* renamed from: a */
    private Chat f90332a;

    /* renamed from: b */
    private Bundle f90333b;

    /* renamed from: c */
    private String f90334c;

    /* renamed from: d */
    private int f90335d;

    /* renamed from: e */
    private int f90336e;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35002h.AbstractC35003a
    /* renamed from: a */
    public String mo128990a() {
        return this.f90334c;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35002h.AbstractC35003a
    /* renamed from: b */
    public int mo128991b() {
        return this.f90335d;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35002h.AbstractC35003a
    /* renamed from: c */
    public Chat mo128992c() {
        return this.f90332a;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35002h.AbstractC35003a
    /* renamed from: d */
    public Bundle mo128993d() {
        return this.f90333b;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35002h.AbstractC35003a
    /* renamed from: e */
    public boolean mo128994e() {
        if ((this.f90336e & 1) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35002h.AbstractC35003a
    /* renamed from: f */
    public boolean mo128995f() {
        if ((this.f90336e & 2) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35002h.AbstractC35003a
    /* renamed from: g */
    public boolean mo128996g() {
        if ((this.f90336e & 4) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35002h.AbstractC35003a
    /* renamed from: h */
    public boolean mo128997h() {
        if (!mo128996g() || !this.f90332a.isEdu() || this.f90335d != 1) {
            return false;
        }
        return true;
    }

    public C35000f(Bundle bundle) {
        if (bundle != null) {
            this.f90333b = bundle;
            this.f90334c = bundle.getString("extra_key_title", "");
            this.f90335d = bundle.getInt("extra_key_contact_mode", 1);
            this.f90336e = bundle.getInt("extra_key_tab_config", 7);
            this.f90332a = (Chat) bundle.getSerializable("extra_key_chat");
        }
    }
}
