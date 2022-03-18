package com.larksuite.framework.apiplugin.validator.p1180a.p1181a;

import com.larksuite.framework.apiplugin.validator.format.Min;
import com.larksuite.framework.apiplugin.validator.p1183b.AbstractC25960a;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: com.larksuite.framework.apiplugin.validator.a.a.c */
public class C25948c extends AbstractC25946a {

    /* renamed from: e */
    private final Min f64264e;

    /* renamed from: f */
    private String f64265f;

    /* access modifiers changed from: package-private */
    @Override // com.larksuite.framework.apiplugin.validator.p1180a.p1181a.AbstractC25946a
    /* renamed from: a */
    public String mo92288a() {
        return this.f64265f + " is less than " + this.f64264e.value();
    }

    @Override // com.larksuite.framework.apiplugin.validator.p1180a.p1182b.AbstractC25957a
    /* renamed from: c */
    public boolean mo92291c() {
        if (this.f64259c instanceof Number) {
            if (this.f64260d.mo92304b(this.f64264e.value(), ((Number) this.f64259c).doubleValue(), this.f64264e.include())) {
                return true;
            }
            this.f64265f = this.f64258b.getName();
            mo92289a(this.f64264e.warning());
            return false;
        } else if (!(this.f64259c instanceof List) || this.f64260d.mo92304b(this.f64264e.value(), (double) ((List) this.f64259c).size(), this.f64264e.include())) {
            return true;
        } else {
            this.f64265f = this.f64258b.getName() + "'s length";
            mo92289a(this.f64264e.warning());
            return false;
        }
    }

    public C25948c(Field field, Min min, Object obj, AbstractC25960a aVar) {
        super(field, obj, aVar);
        this.f64264e = min;
    }
}
