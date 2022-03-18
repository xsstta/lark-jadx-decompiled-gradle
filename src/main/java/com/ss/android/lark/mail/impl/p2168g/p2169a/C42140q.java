package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.MailSignatureUsage;
import com.ss.android.lark.mail.impl.entity.EntSignatureUsage;

/* renamed from: com.ss.android.lark.mail.impl.g.a.q */
public class C42140q extends C42128h<MailSignatureUsage, EntSignatureUsage> {
    public C42140q(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public EntSignatureUsage mo152042b(MailSignatureUsage mailSignatureUsage, EntSignatureUsage entSignatureUsage) {
        if (mailSignatureUsage == null) {
            return null;
        }
        return new EntSignatureUsage(mailSignatureUsage.address, mailSignatureUsage.new_mail_signature_id, mailSignatureUsage.reply_mail_signature_id);
    }

    /* renamed from: b */
    public MailSignatureUsage mo152040a(MailSignatureUsage mailSignatureUsage, EntSignatureUsage entSignatureUsage) {
        if (entSignatureUsage == null) {
            return null;
        }
        return new MailSignatureUsage(entSignatureUsage.getAddress(), entSignatureUsage.getNewMailSignatureId(), entSignatureUsage.getReplyMailSignatureId());
    }
}
