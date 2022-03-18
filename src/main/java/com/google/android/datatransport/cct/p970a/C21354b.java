package com.google.android.datatransport.cct.p970a;

import com.google.firebase.encoders.AbstractC22788c;
import com.google.firebase.encoders.AbstractC22789d;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* renamed from: com.google.android.datatransport.cct.a.b */
public final class C21354b implements AbstractC22788c<C21355c> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.google.firebase.encoders.AbstractC22787b
    /* renamed from: a */
    public void mo72519a(Object obj, AbstractC22789d dVar) throws EncodingException, IOException {
        C21355c cVar = (C21355c) obj;
        AbstractC22789d dVar2 = dVar;
        if (cVar.mo72520b() != Integer.MIN_VALUE) {
            dVar2.mo79208a("sdkVersion", cVar.mo72520b());
        }
        if (cVar.mo72521c() != null) {
            dVar2.mo79210a("model", cVar.mo72521c());
        }
        if (cVar.mo72522d() != null) {
            dVar2.mo79210a("hardware", cVar.mo72522d());
        }
        if (cVar.mo72523e() != null) {
            dVar2.mo79210a("device", cVar.mo72523e());
        }
        if (cVar.mo72525f() != null) {
            dVar2.mo79210a("product", cVar.mo72525f());
        }
        if (cVar.mo72526g() != null) {
            dVar2.mo79210a("osBuild", cVar.mo72526g());
        }
        if (cVar.mo72527h() != null) {
            dVar2.mo79210a("manufacturer", cVar.mo72527h());
        }
        if (cVar.mo72529i() != null) {
            dVar2.mo79210a("fingerprint", cVar.mo72529i());
        }
    }
}
