package com.bytedance.ee.ref.card;

import android.webkit.URLUtil;
import com.bytedance.ee.eenet.httpclient.C12617b;
import com.lynx.tasm.provider.AbstractC26936c;
import com.lynx.tasm.provider.AbstractC26942i;
import com.lynx.tasm.provider.C26937d;
import com.lynx.tasm.provider.C26938e;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.bytedance.ee.ref.card.f */
public class C13540f implements AbstractC26942i {

    /* renamed from: a */
    private final AbstractC26942i f35641a;

    public C13540f(AbstractC26942i iVar) {
        this.f35641a = iVar;
    }

    @Override // com.lynx.tasm.provider.AbstractC26942i
    /* renamed from: a */
    public void mo50297a(final C26937d dVar, final AbstractC26936c cVar) {
        AbstractC26942i iVar = this.f35641a;
        if (iVar != null) {
            iVar.mo50297a(dVar, new AbstractC26936c() {
                /* class com.bytedance.ee.ref.card.C13540f.C135411 */

                @Override // com.lynx.tasm.provider.AbstractC26936c
                /* renamed from: a */
                public void mo50299a(C26938e eVar) {
                    cVar.mo50299a(eVar);
                }

                @Override // com.lynx.tasm.provider.AbstractC26936c
                /* renamed from: b */
                public void mo50300b(C26938e eVar) {
                    if (URLUtil.isNetworkUrl(dVar.mo95782a())) {
                        C13540f.this.mo50298a(dVar, cVar, eVar);
                    } else {
                        cVar.mo50300b(eVar);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo50298a(C26937d dVar, AbstractC26936c cVar, C26938e eVar) {
        try {
            Response execute = C12617b.m52365c().newCall(new Request.Builder().url(dVar.mo95782a()).build()).execute();
            C26938e eVar2 = new C26938e();
            if (execute.body() == null || !execute.isSuccessful()) {
                cVar.mo50300b(eVar);
                return;
            }
            eVar2.mo95790a(execute.body().byteStream());
            eVar2.mo95789a(eVar2.mo95793b());
            eVar2.mo95791a(eVar2.mo95788a());
            eVar2.mo95792a(execute.headers().toMultimap());
            cVar.mo50299a(eVar2);
        } catch (Exception unused) {
            cVar.mo50300b(eVar);
        }
    }
}
