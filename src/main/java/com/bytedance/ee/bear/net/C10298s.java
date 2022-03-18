package com.bytedance.ee.bear.net;

import com.bytedance.ee.bear.thread.C11678b;
import io.reactivex.AbstractC68307f;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.net.s */
public class C10298s<T extends Serializable> {

    /* renamed from: a */
    private final AbstractC10295p<T> f27786a;

    /* renamed from: b */
    private HeaderInterceptor f27787b;

    /* renamed from: c */
    private final AbstractC10278f f27788c;

    /* renamed from: d */
    private final C10291l f27789d;

    /* renamed from: e */
    private final boolean f27790e;

    /* renamed from: f */
    private Map<String, String> f27791f = new HashMap();

    /* renamed from: g */
    private final List<AbstractC10300u> f27792g;

    /* renamed from: a */
    public AbstractC68307f<T> mo39317a(AbstractC10289j jVar) {
        AbstractC68307f a = AbstractC68307f.m265083a(jVar).mo238020d(new C10296q(this.f27790e, this.f27791f)).mo237985a(C11678b.m48477a());
        AbstractC10278f fVar = this.f27788c;
        if (fVar != null) {
            a = a.mo238014c(new C10273b(fVar));
        }
        return a.mo238014c(new CloudReqFun(this.f27789d, this.f27787b)).mo238020d(new C10293n()).mo238020d(new C10277d(jVar.mo39257a(), this.f27792g)).mo238020d($$Lambda$mBnQdinWk976tso0Glo1KxmT75Y.INSTANCE).mo238020d(new C10294o(this.f27786a)).mo237985a(C11678b.m48481e());
    }

    public C10298s(C10291l lVar, AbstractC10295p<T> pVar, HeaderInterceptor eVar, AbstractC10278f fVar, boolean z, List<AbstractC10300u> list) {
        this.f27789d = lVar;
        this.f27786a = pVar;
        this.f27787b = eVar;
        this.f27788c = fVar;
        this.f27790e = z;
        this.f27792g = list;
    }
}
