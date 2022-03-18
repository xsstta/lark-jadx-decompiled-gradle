package com.larksuite.framework.apiplugin.validator.p1180a.p1181a;

import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.validator.p1183b.AbstractC25960a;
import java.lang.reflect.Field;

/* renamed from: com.larksuite.framework.apiplugin.validator.a.a.h */
public class C25953h extends AbstractC25946a {

    /* renamed from: e */
    private final LKRequiredParam f64270e;

    /* access modifiers changed from: package-private */
    @Override // com.larksuite.framework.apiplugin.validator.p1180a.p1181a.AbstractC25946a
    /* renamed from: a */
    public String mo92288a() {
        return this.f64258b.getName() + " is required ";
    }

    @Override // com.larksuite.framework.apiplugin.validator.p1180a.p1182b.AbstractC25957a
    /* renamed from: c */
    public boolean mo92291c() {
        if (!this.f64260d.mo92298a(this.f64259c)) {
            return true;
        }
        mo92289a(this.f64270e.warning());
        return false;
    }

    public C25953h(Field field, LKRequiredParam lKRequiredParam, Object obj, AbstractC25960a aVar) {
        super(field, obj, aVar);
        this.f64270e = lKRequiredParam;
    }
}
