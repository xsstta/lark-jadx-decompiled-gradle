package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.MailGetSignatureResponse;
import com.ss.android.lark.mail.impl.entity.C42095h;

/* renamed from: com.ss.android.lark.mail.impl.g.a.r */
public class C42141r extends C42128h<MailGetSignatureResponse, C42095h> {
    public C42141r(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public C42095h mo152042b(MailGetSignatureResponse mailGetSignatureResponse, C42095h hVar) {
        if (mailGetSignatureResponse == null) {
            return null;
        }
        C42095h hVar2 = new C42095h();
        if (mailGetSignatureResponse.signatures != null) {
            hVar2.mo151939a(this.f107148a.f107150a.mo152106a(mailGetSignatureResponse.signatures, new C42139p(this.f107148a)));
        }
        if (mailGetSignatureResponse.signature_usages != null) {
            hVar2.mo151942b(this.f107148a.f107150a.mo152106a(mailGetSignatureResponse.signature_usages, new C42140q(this.f107148a)));
        }
        if (mailGetSignatureResponse.optional_signature_map != null) {
            hVar2.mo151940a(this.f107148a.f107151b.mo152110a(mailGetSignatureResponse.optional_signature_map, new C42138o(this.f107148a)));
        }
        return hVar2;
    }
}
