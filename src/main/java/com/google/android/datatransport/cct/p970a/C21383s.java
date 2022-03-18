package com.google.android.datatransport.cct.p970a;

import com.google.firebase.encoders.AbstractC22788c;
import com.google.firebase.encoders.AbstractC22789d;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* renamed from: com.google.android.datatransport.cct.a.s */
public final class C21383s implements AbstractC22788c<C21369i> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.google.firebase.encoders.AbstractC22787b
    /* renamed from: a */
    public void mo72519a(Object obj, AbstractC22789d dVar) throws EncodingException, IOException {
        C21369i iVar = (C21369i) obj;
        AbstractC22789d dVar2 = dVar;
        if (iVar.mo72583b() != null) {
            dVar2.mo79210a("mobileSubtype", iVar.mo72583b().name());
        }
        if (iVar.mo72582a() != null) {
            dVar2.mo79210a("networkType", iVar.mo72582a().name());
        }
    }
}
