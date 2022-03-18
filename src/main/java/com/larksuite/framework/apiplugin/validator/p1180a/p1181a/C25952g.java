package com.larksuite.framework.apiplugin.validator.p1180a.p1181a;

import com.larksuite.framework.apiplugin.validator.format.Prefix;
import com.larksuite.framework.apiplugin.validator.p1183b.AbstractC25960a;
import java.lang.reflect.Field;

/* renamed from: com.larksuite.framework.apiplugin.validator.a.a.g */
public class C25952g extends AbstractC25946a {

    /* renamed from: e */
    private final Prefix f64269e;

    /* access modifiers changed from: package-private */
    @Override // com.larksuite.framework.apiplugin.validator.p1180a.p1181a.AbstractC25946a
    /* renamed from: a */
    public String mo92288a() {
        return this.f64258b.getName() + " is not startWith " + this.f64269e.value();
    }

    @Override // com.larksuite.framework.apiplugin.validator.p1180a.p1182b.AbstractC25957a
    /* renamed from: c */
    public boolean mo92291c() {
        if (!(this.f64259c instanceof String) || this.f64260d.mo92300a(this.f64269e.value(), (String) this.f64259c)) {
            return true;
        }
        mo92289a(this.f64269e.warning());
        return false;
    }

    public C25952g(Field field, Prefix prefix, Object obj, AbstractC25960a aVar) {
        super(field, obj, aVar);
        this.f64269e = prefix;
    }
}
