package com.google.android.datatransport.cct.p970a;

import com.google.firebase.encoders.AbstractC22788c;
import com.google.firebase.encoders.AbstractC22789d;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* renamed from: com.google.android.datatransport.cct.a.q */
public final class C21381q implements AbstractC22788c<C21365g> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.google.firebase.encoders.AbstractC22787b
    /* renamed from: a */
    public void mo72519a(Object obj, AbstractC22789d dVar) throws EncodingException, IOException {
        C21365g gVar = (C21365g) obj;
        AbstractC22789d dVar2 = dVar;
        dVar2.mo79209a("requestTimeMs", gVar.mo72561a()).mo79209a("requestUptimeMs", gVar.mo72562b());
        if (gVar.mo72563c() != null) {
            dVar2.mo79210a("clientInfo", gVar.mo72563c());
        }
        if (gVar.mo72565e() != null) {
            dVar2.mo79210a("logSourceName", gVar.mo72565e());
        } else if (gVar.mo72564d() != Integer.MIN_VALUE) {
            dVar2.mo79208a("logSource", gVar.mo72564d());
        } else {
            throw new EncodingException("Log request must have either LogSourceName or LogSource");
        }
        if (!gVar.mo72567f().isEmpty()) {
            dVar2.mo79210a("logEvent", gVar.mo72567f());
        }
    }
}
