package com.ss.lark.android.passport.biz.feature.join_team.join_way.p3228a;

import android.content.Intent;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterFieldAnno;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.JoinTenantChooseInfo;
import com.ss.lark.android.passport.biz.feature.join_team.join_way.p3228a.C64821a;

/* renamed from: com.ss.lark.android.passport.biz.feature.join_team.join_way.a.b */
public class C64825b extends C49020a implements C64821a.AbstractC64822a {
    @RouterFieldAnno

    /* renamed from: c */
    private JoinTenantChooseInfo f163423c;

    @Override // com.ss.lark.android.passport.biz.feature.join_team.join_way.p3228a.C64821a.AbstractC64822a
    public JoinTenantChooseInfo co_() {
        return this.f163423c;
    }

    public C64825b(Intent intent) {
        C49092f.m193525a(this, intent);
    }
}
