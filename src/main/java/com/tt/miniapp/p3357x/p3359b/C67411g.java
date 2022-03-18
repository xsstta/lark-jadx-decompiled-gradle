package com.tt.miniapp.p3357x.p3359b;

import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.miniapp.x.b.g */
public class C67411g {

    /* renamed from: h */
    private static final AbstractC12790g<C67411g> f170005h = new AbstractC12790g<C67411g>() {
        /* class com.tt.miniapp.p3357x.p3359b.C67411g.C674121 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C67411g mo48227b(Context... contextArr) {
            if (contextArr.length > 0) {
                return new C67411g(contextArr[0]);
            }
            throw new IllegalArgumentException("AppbrandPathManager need context!");
        }
    };

    /* renamed from: a */
    private AbstractC67405a f170006a;

    /* renamed from: b */
    private AbstractC67405a f170007b;

    /* renamed from: c */
    private AbstractC67405a f170008c;

    /* renamed from: d */
    private AbstractC67405a f170009d;

    /* renamed from: e */
    private AbstractC67405a f170010e;

    /* renamed from: f */
    private AbstractC67405a f170011f;

    /* renamed from: g */
    private List<AbstractC67405a> f170012g;

    /* renamed from: b */
    public AbstractC67405a mo234088b() {
        return this.f170007b;
    }

    /* renamed from: c */
    public AbstractC67405a mo234089c() {
        return this.f170008c;
    }

    /* renamed from: d */
    public AbstractC67405a mo234090d() {
        return this.f170011f;
    }

    /* renamed from: e */
    public AbstractC67405a mo234091e() {
        return this.f170010e;
    }

    /* renamed from: a */
    public long mo234087a() {
        AbstractC67405a aVar = this.f170010e;
        long j = 0;
        if (aVar != null) {
            j = 0 + aVar.mo234086b();
        }
        AbstractC67405a aVar2 = this.f170007b;
        if (aVar2 != null) {
            j += aVar2.mo234086b();
        }
        AbstractC67405a aVar3 = this.f170006a;
        if (aVar3 != null) {
            j += aVar3.mo234086b();
        }
        AbstractC67405a aVar4 = this.f170008c;
        if (aVar4 != null) {
            j += aVar4.mo234086b();
        }
        AbstractC67405a aVar5 = this.f170011f;
        if (aVar5 != null) {
            return j + aVar5.mo234086b();
        }
        return j;
    }

    /* renamed from: a */
    public static C67411g m262284a(Context context) {
        return f170005h.mo48348c(context);
    }

    private C67411g(Context context) {
        this.f170006a = new C67407c(context);
        this.f170007b = new C67408d(context);
        this.f170008c = new C67409e(context);
        C67413h hVar = new C67413h(context);
        this.f170010e = hVar;
        this.f170009d = new C67410f(hVar);
        this.f170011f = new C67406b(context);
        ArrayList arrayList = new ArrayList();
        this.f170012g = arrayList;
        arrayList.add(this.f170006a);
        this.f170012g.add(this.f170008c);
        this.f170012g.add(this.f170009d);
    }
}
