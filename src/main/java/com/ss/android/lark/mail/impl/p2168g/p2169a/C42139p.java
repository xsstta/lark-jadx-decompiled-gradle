package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.MailSignature;
import com.ss.android.lark.mail.impl.entity.MailEntSignature;

/* renamed from: com.ss.android.lark.mail.impl.g.a.p */
public class C42139p extends C42128h<MailSignature, MailEntSignature> {
    public C42139p(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public MailEntSignature mo152042b(MailSignature mailSignature, MailEntSignature mailEntSignature) {
        if (mailSignature == null) {
            return null;
        }
        MailEntSignature mailEntSignature2 = new MailEntSignature();
        if (mailSignature.images != null) {
            mailEntSignature2.mo151384a(this.f107148a.f107150a.mo152106a(mailSignature.images, this.f107148a.f107155f));
        }
        if (mailSignature.signature_type != null) {
            mailEntSignature2.mo151382a(MailEntSignature.SignatureType.values()[mailSignature.signature_type.getValue()]);
        }
        if (mailSignature.signature_device != null) {
            mailEntSignature2.mo151381a(MailEntSignature.SignatureDevice.values()[mailSignature.signature_device.getValue()]);
        }
        mailEntSignature2.mo151383a(mailSignature.id);
        mailEntSignature2.mo151387b(mailSignature.name);
        mailEntSignature2.mo151389c(mailSignature.template_html);
        mailEntSignature2.mo151391d(mailSignature.template_value_json);
        return mailEntSignature2;
    }
}
