package com.ss.lark.android.passport.biz.feature.auth_type.mvp;

import android.content.Intent;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterFieldAnno;
import com.ss.lark.android.passport.biz.entity.AuthTypeStepInfo;
import com.ss.lark.android.passport.biz.feature.auth_type.mvp.C64634c;

/* renamed from: com.ss.lark.android.passport.biz.feature.auth_type.mvp.a */
public class C64629a extends C49020a implements C64634c.AbstractC64635a {
    @RouterFieldAnno

    /* renamed from: c */
    private AuthTypeStepInfo f163106c;

    @Override // com.ss.lark.android.passport.biz.feature.auth_type.mvp.C64634c.AbstractC64635a
    /* renamed from: g */
    public AuthTypeStepInfo mo223439g() {
        return this.f163106c;
    }

    public C64629a(Intent intent) {
        C49092f.m193525a(this, intent);
    }
}
