package com.lark.falcon.engine.inspect;

import com.lark.falcon.engine.inspect.p1062a.p1064b.AbstractC23999f;
import com.lark.falcon.engine.inspect.p1062a.p1064b.AbstractC24000g;
import com.lark.falcon.engine.p1059c.C23970a;

/* renamed from: com.lark.falcon.engine.inspect.a */
public class C23977a implements AbstractC23999f {

    /* renamed from: a */
    private final AbstractC24012c f59326a;

    public C23977a(AbstractC24012c cVar) {
        this.f59326a = cVar;
    }

    @Override // com.lark.falcon.engine.inspect.p1062a.p1064b.AbstractC23999f
    /* renamed from: a */
    public void mo86121a(AbstractC24000g gVar) {
        C23970a.m87618a("ChromeDevtoolsServer", "onOpen: ");
        this.f59326a.mo48000a(gVar);
    }

    @Override // com.lark.falcon.engine.inspect.p1062a.p1064b.AbstractC23999f
    /* renamed from: a */
    public void mo86123a(AbstractC24000g gVar, String str) {
        this.f59326a.mo48002a(gVar, str);
    }

    @Override // com.lark.falcon.engine.inspect.p1062a.p1064b.AbstractC23999f
    /* renamed from: a */
    public void mo86124a(AbstractC24000g gVar, Throwable th) {
        C23970a.m87620a("ChromeDevtoolsServer", th);
        this.f59326a.mo48003b(gVar);
    }

    @Override // com.lark.falcon.engine.inspect.p1062a.p1064b.AbstractC23999f
    /* renamed from: a */
    public void mo86122a(AbstractC24000g gVar, int i, String str) {
        C23970a.m87621b("ChromeDevtoolsServer", "onClose: " + str);
        this.f59326a.mo48003b(gVar);
    }

    @Override // com.lark.falcon.engine.inspect.p1062a.p1064b.AbstractC23999f
    /* renamed from: a */
    public void mo86125a(AbstractC24000g gVar, byte[] bArr, int i) {
        C23970a.m87622c("ChromeDevtoolsServer", "onMessage: byte");
    }
}
