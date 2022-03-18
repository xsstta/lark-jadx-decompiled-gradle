package com.ss.android.lark.profile.func.share_profile.inviter_new_member.fragment;

import android.os.Bundle;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.base.AbstractC52497a;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.C52527c;

/* renamed from: com.ss.android.lark.profile.func.share_profile.inviter_new_member.fragment.b */
public class C52468b extends AbstractC52497a {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.AbstractC52497a
    /* renamed from: a */
    public void mo179494a() {
        String str;
        C52472c cVar = new C52472c();
        ShareInviterNewMemberView shareInviterNewMemberView = new ShareInviterNewMemberView(new C52471b());
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("EXTRA_LOCATION");
        } else {
            str = "other";
        }
        this.f129960a = new C52474d(cVar, shareInviterNewMemberView, new C52470a(), str);
        this.f129960a.create();
    }

    /* renamed from: com.ss.android.lark.profile.func.share_profile.inviter_new_member.fragment.b$a */
    private class C52470a extends AbstractC52497a.C52498a implements C52527c.AbstractC52530b {
        private C52470a() {
            super();
        }
    }

    /* renamed from: com.ss.android.lark.profile.func.share_profile.inviter_new_member.fragment.b$b */
    private class C52471b extends AbstractC52497a.C52499b {
        private C52471b() {
            super();
        }
    }
}
