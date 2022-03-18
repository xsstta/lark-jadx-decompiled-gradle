package com.ss.lark.android.passport.biz.compat.split_flow_page.mvp;

import android.content.Intent;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterFieldAnno;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64450a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.SpliteStepInfo;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.C64483a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.RefreshTicketData;

/* renamed from: com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.b */
public class C64454b extends C49020a implements C64450a.AbstractC64451a {
    @RouterFieldAnno

    /* renamed from: c */
    private SpliteStepInfo f162772c;

    @Override // com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64450a.AbstractC64451a
    public SpliteStepInfo cf_() {
        if (this.f162772c == null) {
            this.f162772c = new SpliteStepInfo();
        }
        return this.f162772c;
    }

    @Override // com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64450a.AbstractC64451a
    /* renamed from: e */
    public String mo223039e() {
        int cg_ = cg_();
        if (cg_ == 0 || cg_ == 12) {
            return "0";
        }
        return "1";
    }

    @Override // com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64450a.AbstractC64451a
    /* renamed from: g */
    public String mo223040g() {
        SpliteStepInfo spliteStepInfo = this.f162772c;
        if (spliteStepInfo == null) {
            return "";
        }
        return spliteStepInfo.code;
    }

    @Override // com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64450a.AbstractC64451a
    /* renamed from: h */
    public String mo223041h() {
        SpliteStepInfo spliteStepInfo = this.f162772c;
        if (spliteStepInfo == null) {
            return "";
        }
        return spliteStepInfo.name;
    }

    @Override // com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64450a.AbstractC64451a
    public int cg_() {
        if (ch_()) {
            return this.f162772c.next.verifyFace.sourceType;
        }
        return 0;
    }

    @Override // com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64450a.AbstractC64451a
    public boolean ch_() {
        SpliteStepInfo spliteStepInfo = this.f162772c;
        if (spliteStepInfo == null || spliteStepInfo.next == null || this.f162772c.next.verifyFace == null) {
            return false;
        }
        return true;
    }

    public C64454b(Intent intent) {
        C49092f.m193525a(this, intent);
    }

    @Override // com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64450a.AbstractC64451a
    /* renamed from: b */
    public void mo223035b(AbstractC49352d<RefreshTicketData> dVar) {
        mo171171a(C64483a.m253375a().mo223134b(this.f123074a, this.f123075b, dVar));
    }

    @Override // com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64450a.AbstractC64451a
    /* renamed from: a */
    public void mo223034a(AbstractC49352d<BaseStepData> dVar) {
        mo171171a(C64483a.m253375a().mo223128a(this.f123074a, this.f123075b, dVar));
    }

    @Override // com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64450a.AbstractC64451a
    /* renamed from: a */
    public void mo223033a(int i, AbstractC49352d<BaseStepData> dVar) {
        mo171171a(C64483a.m253375a().mo223127a(this.f123074a, i, this.f123075b, dVar));
    }
}
