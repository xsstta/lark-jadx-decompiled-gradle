package com.ss.lark.android.passport.biz.feature.pending_approve.p3231a;

import android.content.Intent;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterFieldAnno;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.PendingApproveStepInfo;
import com.ss.lark.android.passport.biz.feature.pending_approve.p3231a.C64912a;

/* renamed from: com.ss.lark.android.passport.biz.feature.pending_approve.a.b */
public class C64916b extends C49020a implements C64912a.AbstractC64913a {
    @RouterFieldAnno

    /* renamed from: c */
    private PendingApproveStepInfo f163615c;

    @Override // com.ss.lark.android.passport.biz.feature.pending_approve.p3231a.C64912a.AbstractC64913a
    public PendingApproveStepInfo cq_() {
        return this.f163615c;
    }

    public C64916b(Intent intent) {
        C49092f.m193525a(this, intent);
    }
}
