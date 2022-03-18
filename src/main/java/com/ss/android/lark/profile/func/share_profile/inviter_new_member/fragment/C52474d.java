package com.ss.android.lark.profile.func.share_profile.inviter_new_member.fragment;

import android.graphics.Bitmap;
import com.ss.android.lark.profile.func.share_profile.inviter_new_member.fragment.AbstractC52464a;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52503b;
import com.ss.android.lark.profile.statistics.ProfileHitPoint;
import com.ss.android.lark.statistics.Statistics;

/* renamed from: com.ss.android.lark.profile.func.share_profile.inviter_new_member.fragment.d */
public class C52474d extends AbstractC52503b<AbstractC52464a.AbstractC52465a, AbstractC52464a.AbstractC52466b, AbstractC52464a.AbstractC52466b.AbstractC52467a> {

    /* renamed from: a */
    public String f129941a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.profile.func.share_profile.inviter_new_member.fragment.d$a */
    public class C52476a extends AbstractC52503b<AbstractC52464a.AbstractC52465a, AbstractC52464a.AbstractC52466b, AbstractC52464a.AbstractC52466b.AbstractC52467a>.C52508b implements AbstractC52464a.AbstractC52466b.AbstractC52467a {
        @Override // com.ss.android.lark.profile.func.share_profile.inviter_new_member.fragment.AbstractC52464a.AbstractC52466b.AbstractC52467a
        /* renamed from: a */
        public void mo179493a() {
            C52474d.this.mo179520b();
        }

        private C52476a() {
            super();
        }

        @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52503b.C52508b, com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c.AbstractC52512b.AbstractC52513a
        /* renamed from: a */
        public void mo179499a(Bitmap bitmap) {
            super.mo179499a(bitmap);
            ProfileHitPoint.m204705a(C52474d.this.f129941a);
            Statistics.sendEvent("invite_member_show_code_save");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC52464a.AbstractC52466b.AbstractC52467a createViewDelegate() {
        return new C52476a();
    }

    public C52474d(AbstractC52464a.AbstractC52465a aVar, AbstractC52464a.AbstractC52466b bVar, AbstractC52503b.AbstractC52507a aVar2, String str) {
        super(aVar, bVar, aVar2);
        this.f129941a = str;
    }
}
