package com.ss.lark.android.passport.biz.feature.join_team.p3225a;

import android.content.Context;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.UDDialogUtils;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a.C64805a;

/* renamed from: com.ss.lark.android.passport.biz.feature.join_team.a.b */
public class C64799b implements C64805a.AbstractC64807b {

    /* renamed from: a */
    private Context f163385a;

    /* renamed from: b */
    private UDDialogUtils.DialogWrapper f163386b;

    /* renamed from: c */
    private AbstractC49352d<Boolean> f163387c;

    /* renamed from: d */
    private C64805a.AbstractC64807b.AbstractC64808a f163388d;

    /* renamed from: e */
    private PassportLog f163389e;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: a */
    public /* synthetic */ void mo171186a(UniContext uniContext) {
        AbstractC49027g.CC.$default$a(this, uniContext);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: c */
    public /* synthetic */ UniContext mo171187c() {
        return AbstractC49027g.CC.$default$c(this);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
    }

    @Override // com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a.C64805a.AbstractC64807b
    /* renamed from: d */
    public void mo223682d() {
        if (this.f163386b == null) {
            this.f163386b = UDDialogUtils.m193821b(this.f163385a);
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.join_team.p3226b.p3227a.C64805a.AbstractC64807b
    /* renamed from: e */
    public void mo223683e() {
        UDDialogUtils.DialogWrapper aVar = this.f163386b;
        if (aVar != null) {
            aVar.mo171634b();
            this.f163386b = null;
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: a */
    public void mo171185a(PassportLog passportLog) {
        this.f163389e = passportLog;
    }

    /* renamed from: a */
    public void mo171188a(C64805a.AbstractC64807b.AbstractC64808a aVar) {
        this.f163388d = aVar;
    }

    public C64799b(Context context, AbstractC49352d<Boolean> dVar) {
        this.f163385a = context;
        this.f163387c = dVar;
    }
}
