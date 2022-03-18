package com.larksuite.component.dybrid.h5core.p1077e;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.component.dybrid.h5api.api.C24160c;
import com.larksuite.component.dybrid.h5api.api.C24162e;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5core.core.impl.C24210e;
import com.larksuite.component.dybrid.router.p1084a.AbstractC24259a;
import com.larksuite.component.dybrid.router.p1084a.AbstractC24262d;
import com.larksuite.component.dybrid.router.p1085b.C24269c;
import com.larksuite.component.dybrid.router.p1088e.C24274a;

/* renamed from: com.larksuite.component.dybrid.h5core.e.a */
public class C24215a extends AbstractC24259a {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.dybrid.router.p1084a.AbstractC24259a
    /* renamed from: a */
    public String mo86849a() {
        return "(https?|ftp|file)://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]";
    }

    @Override // com.larksuite.component.dybrid.router.p1084a.AbstractC24263e
    /* renamed from: a */
    public boolean mo86850a(String str) {
        if (TextUtils.isEmpty(str) || !str.matches(this.f59922a)) {
            return false;
        }
        return true;
    }

    @Override // com.larksuite.component.dybrid.router.p1084a.AbstractC24263e
    /* renamed from: a */
    public C24269c mo86848a(Context context, C24269c cVar, AbstractC24262d dVar) {
        String str;
        if (("CommonRouterHandler url = " + cVar) == null) {
            str = "empty ";
        } else {
            str = C24274a.m88628a(cVar.mo86903a());
        }
        C24174b.m88296a("CommonRouterHandler", str);
        cVar.mo86904b().putString("u", cVar.mo86903a());
        C24210e.m88437g().mo86824a(new C24162e(context), new C24160c(cVar.mo86904b()));
        return cVar;
    }
}
