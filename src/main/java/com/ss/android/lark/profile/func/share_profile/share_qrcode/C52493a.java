package com.ss.android.lark.profile.func.share_profile.share_qrcode;

import com.ss.android.lark.profile.func.share_profile.share_qrcode.base.AbstractC52497a;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.C52522b;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.C52527c;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.ShareProfileQRCodeView;

/* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.a */
public class C52493a extends AbstractC52497a {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.AbstractC52497a
    /* renamed from: a */
    public void mo179494a() {
        this.f129960a = new C52527c(new C52522b(), new ShareProfileQRCodeView(new C52496b()), new C52495a());
        this.f129960a.create();
    }

    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.a$a */
    private class C52495a extends AbstractC52497a.C52498a implements C52527c.AbstractC52530b {
        private C52495a() {
            super();
        }
    }

    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.a$b */
    public class C52496b extends AbstractC52497a.C52499b implements ShareProfileQRCodeView.AbstractC52516b {
        public C52496b() {
            super();
        }
    }
}
