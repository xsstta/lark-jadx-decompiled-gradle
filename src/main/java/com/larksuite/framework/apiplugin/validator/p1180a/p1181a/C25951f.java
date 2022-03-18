package com.larksuite.framework.apiplugin.validator.p1180a.p1181a;

import com.larksuite.framework.apiplugin.validator.format.Pattern;
import com.larksuite.framework.apiplugin.validator.p1183b.AbstractC25960a;
import java.lang.reflect.Field;

/* renamed from: com.larksuite.framework.apiplugin.validator.a.a.f */
public class C25951f extends AbstractC25946a {

    /* renamed from: e */
    private final Pattern f64268e;

    /* access modifiers changed from: package-private */
    @Override // com.larksuite.framework.apiplugin.validator.p1180a.p1181a.AbstractC25946a
    /* renamed from: a */
    public String mo92288a() {
        return this.f64258b.getName() + " is not matched regex: " + this.f64268e.value();
    }

    @Override // com.larksuite.framework.apiplugin.validator.p1180a.p1182b.AbstractC25957a
    /* renamed from: c */
    public boolean mo92291c() {
        if (!(this.f64259c instanceof String) || this.f64260d.mo92306c(this.f64268e.value(), (String) this.f64259c)) {
            return true;
        }
        mo92289a(this.f64268e.warning());
        return false;
    }

    public C25951f(Field field, Pattern pattern, Object obj, AbstractC25960a aVar) {
        super(field, obj, aVar);
        this.f64268e = pattern;
    }
}
