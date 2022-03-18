package com.bytedance.ee.bear.p391g.p392a;

import android.content.Context;
import com.bytedance.ee.bear.basesdk.p250a.AbstractC4354c;
import com.bytedance.ee.bear.lark.route.C8062b;
import com.bytedance.ee.bear.lark.route.C8063c;
import com.bytedance.ee.bear.route.AbstractC10738c;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.g.a.a */
class C7798a extends AbstractC4354c {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.basesdk.p250a.AbstractC4354c
    /* renamed from: a */
    public List<AbstractC10738c> mo17006a() {
        List<AbstractC10738c> a = super.mo17006a();
        C8062b bVar = new C8062b(this.f12988a);
        C8063c cVar = new C8063c(this.f12988a);
        a.add(bVar);
        a.add(cVar);
        return a;
    }

    public C7798a(Context context) {
        super(context);
    }
}
