package com.ss.lark.android.passport.biz.compat.real_name.mvp;

import android.content.Intent;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterFieldAnno;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.lark.android.passport.biz.compat.real_name.mvp.C64412a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.RecoverAccountStepInfoBackup;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.C64483a;

/* renamed from: com.ss.lark.android.passport.biz.compat.real_name.mvp.b */
public class C64416b extends C49020a implements C64412a.AbstractC64413a {
    @RouterFieldAnno

    /* renamed from: c */
    private RecoverAccountStepInfoBackup f162710c;

    @Override // com.ss.lark.android.passport.biz.compat.real_name.mvp.C64412a.AbstractC64413a
    public RecoverAccountStepInfoBackup cc_() {
        return this.f162710c;
    }

    public C64416b(Intent intent) {
        C49092f.m193525a(this, intent);
    }

    @Override // com.ss.lark.android.passport.biz.compat.real_name.mvp.C64412a.AbstractC64413a
    /* renamed from: a */
    public void mo222974a(String str, String str2, AbstractC49352d<BaseStepData> dVar) {
        int i;
        RecoverAccountStepInfoBackup recoverAccountStepInfoBackup = this.f162710c;
        if (recoverAccountStepInfoBackup == null) {
            i = 0;
        } else {
            i = recoverAccountStepInfoBackup.sourceType;
        }
        mo171171a(C64483a.m253375a().mo223133a(str, str2, i, this.f162710c.rsaInfo, this.f123074a, this.f123075b, dVar));
    }
}
