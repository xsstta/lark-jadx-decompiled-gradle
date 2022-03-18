package com.tt.miniapphost.p3371e;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.opmonitor.api.AbstractC48908f;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.tt.miniapphost.entity.AppInfoEntity;

/* renamed from: com.tt.miniapphost.e.d */
public abstract class AbstractC67514d extends AbstractC67510c {

    /* renamed from: b */
    protected String f170261b;

    /* renamed from: c */
    protected AppInfoEntity f170262c;

    /* renamed from: d */
    protected IAppContext f170263d;

    /* renamed from: a */
    public AbstractC67514d mo234324a(AppInfoEntity appInfoEntity) {
        this.f170262c = appInfoEntity;
        return this;
    }

    /* renamed from: a */
    public AbstractC67514d mo234325a(String str) {
        this.f170261b = str;
        return this;
    }

    public AbstractC67514d(AbstractC48908f fVar, OPMonitorCode oPMonitorCode, IAppContext iAppContext) {
        super(fVar, oPMonitorCode, iAppContext);
        this.f170263d = iAppContext;
    }

    public AbstractC67514d(AbstractC48908f fVar, String str, IAppContext iAppContext) {
        super(fVar, str, iAppContext);
        this.f170263d = iAppContext;
    }

    public AbstractC67514d(AbstractC48908f fVar, String str, OPMonitorCode oPMonitorCode, IAppContext iAppContext) {
        super(fVar, str, oPMonitorCode, iAppContext);
        this.f170263d = iAppContext;
    }
}
