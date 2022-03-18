package com.ss.android.lark.passport.infra.base.architecture.p2424a;

import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g.AbstractC49028a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;

/* renamed from: com.ss.android.lark.passport.infra.base.architecture.a.c */
public abstract class AbstractC49023c<D extends AbstractC49027g.AbstractC49028a> implements AbstractC49027g<D> {

    /* renamed from: a */
    public UniContext f123084a;

    /* renamed from: b */
    public PassportLog f123085b;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: c */
    public UniContext mo171187c() {
        return this.f123084a;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: a */
    public void mo171185a(PassportLog passportLog) {
        this.f123085b = passportLog;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: a */
    public synchronized void mo171186a(UniContext uniContext) {
        this.f123084a = uniContext;
    }
}
