package com.larksuite.framework.apiplugin.validator.p1180a.p1181a;

import com.larksuite.framework.apiplugin.validator.format.NumberEnum;
import com.larksuite.framework.apiplugin.validator.p1183b.AbstractC25960a;
import java.lang.reflect.Field;

/* renamed from: com.larksuite.framework.apiplugin.validator.a.a.e */
public class C25950e extends AbstractC25946a {

    /* renamed from: e */
    private final NumberEnum f64267e;

    /* access modifiers changed from: package-private */
    @Override // com.larksuite.framework.apiplugin.validator.p1180a.p1181a.AbstractC25946a
    /* renamed from: a */
    public String mo92288a() {
        return this.f64258b.getName() + " is not in number enum";
    }

    @Override // com.larksuite.framework.apiplugin.validator.p1180a.p1182b.AbstractC25957a
    /* renamed from: c */
    public boolean mo92291c() {
        if (!(this.f64259c instanceof Number) || this.f64260d.mo92302a(this.f64267e.values(), ((Number) this.f64259c).doubleValue())) {
            return true;
        }
        mo92289a(this.f64267e.warning());
        return false;
    }

    public C25950e(Field field, NumberEnum numberEnum, Object obj, AbstractC25960a aVar) {
        super(field, obj, aVar);
        this.f64267e = numberEnum;
    }
}
