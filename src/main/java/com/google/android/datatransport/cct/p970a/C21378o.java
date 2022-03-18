package com.google.android.datatransport.cct.p970a;

import com.google.firebase.encoders.AbstractC22788c;
import com.google.firebase.encoders.AbstractC22789d;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* renamed from: com.google.android.datatransport.cct.a.o */
public final class C21378o implements AbstractC22788c<C21362f> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.google.firebase.encoders.AbstractC22787b
    /* renamed from: a */
    public void mo72519a(Object obj, AbstractC22789d dVar) throws EncodingException, IOException {
        C21362f fVar = (C21362f) obj;
        AbstractC22789d dVar2 = dVar;
        dVar2.mo79209a("eventTimeMs", fVar.mo72543a()).mo79209a("eventUptimeMs", fVar.mo72545c()).mo79209a("timezoneOffsetSeconds", fVar.mo72549f());
        if (fVar.mo72546d() != null) {
            dVar2.mo79210a("sourceExtension", fVar.mo72546d());
        }
        if (fVar.mo72547e() != null) {
            dVar2.mo79210a("sourceExtensionJsonProto3", fVar.mo72547e());
        }
        if (fVar.mo72544b() != Integer.MIN_VALUE) {
            dVar2.mo79208a("eventCode", fVar.mo72544b());
        }
        if (fVar.mo72550g() != null) {
            dVar2.mo79210a("networkConnectionInfo", fVar.mo72550g());
        }
    }
}
