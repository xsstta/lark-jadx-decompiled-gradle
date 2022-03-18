package com.larksuite.framework.apiplugin.validator.p1180a.p1181a;

import com.larksuite.framework.apiplugin.validator.format.NotBlank;
import com.larksuite.framework.apiplugin.validator.p1183b.AbstractC25960a;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: com.larksuite.framework.apiplugin.validator.a.a.d */
public class C25949d extends AbstractC25946a {

    /* renamed from: e */
    private final NotBlank f64266e;

    /* access modifiers changed from: package-private */
    @Override // com.larksuite.framework.apiplugin.validator.p1180a.p1181a.AbstractC25946a
    /* renamed from: a */
    public String mo92288a() {
        return this.f64258b.getName() + " is empty";
    }

    @Override // com.larksuite.framework.apiplugin.validator.p1180a.p1182b.AbstractC25957a
    /* renamed from: c */
    public boolean mo92291c() {
        if (this.f64259c instanceof String) {
            if (!this.f64260d.mo92299a((String) this.f64259c)) {
                return true;
            }
            mo92289a(this.f64266e.warning());
            return false;
        } else if (!(this.f64259c instanceof List) || !this.f64260d.mo92301a((List) this.f64259c)) {
            return true;
        } else {
            mo92289a(this.f64266e.warning());
            return false;
        }
    }

    public C25949d(Field field, NotBlank notBlank, Object obj, AbstractC25960a aVar) {
        super(field, obj, aVar);
        this.f64266e = notBlank;
    }
}
