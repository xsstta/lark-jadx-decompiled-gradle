package com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp;

import android.content.Intent;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterFieldAnno;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.C64425a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.ResetPhoneStepInfo;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.C64483a;

/* renamed from: com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.b */
public class C64429b extends C49020a implements C64425a.AbstractC64426a {
    @RouterFieldAnno

    /* renamed from: c */
    private ResetPhoneStepInfo f162731c;

    @Override // com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.C64425a.AbstractC64426a
    public ResetPhoneStepInfo cd_() {
        return this.f162731c;
    }

    public C64429b(Intent intent) {
        C49092f.m193525a(this, intent);
    }

    @Override // com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp.C64425a.AbstractC64426a
    /* renamed from: a */
    public void mo222991a(String str, AbstractC49352d<BaseStepData> dVar) {
        mo171171a(C64483a.m253375a().mo223132a(str, this.f123074a, this.f123075b, dVar));
    }
}
