package com.google.android.datatransport.cct.p970a;

import com.google.firebase.encoders.AbstractC22788c;
import com.google.firebase.encoders.AbstractC22789d;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* renamed from: com.google.android.datatransport.cct.a.l */
public final class C21374l implements AbstractC22788c<C21359e> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.google.firebase.encoders.AbstractC22787b
    /* renamed from: a */
    public void mo72519a(Object obj, AbstractC22789d dVar) throws EncodingException, IOException {
        C21359e eVar = (C21359e) obj;
        AbstractC22789d dVar2 = dVar;
        if (eVar.mo72535a() != null) {
            dVar2.mo79210a("clientType", eVar.mo72535a().name());
        }
        if (eVar.mo72536b() != null) {
            dVar2.mo79210a("androidClientInfo", eVar.mo72536b());
        }
    }
}
