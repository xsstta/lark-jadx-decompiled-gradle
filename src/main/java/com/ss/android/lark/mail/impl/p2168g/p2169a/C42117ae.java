package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.Address;
import com.ss.android.lark.mail.impl.entity.MailSharedMailboxOperator;

/* renamed from: com.ss.android.lark.mail.impl.g.a.ae */
public class C42117ae extends C42128h<Address.SharedMailboxOperator, MailSharedMailboxOperator> {
    public C42117ae(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public MailSharedMailboxOperator mo152042b(Address.SharedMailboxOperator sharedMailboxOperator, MailSharedMailboxOperator mailSharedMailboxOperator) {
        if (mailSharedMailboxOperator == null) {
            mailSharedMailboxOperator = new MailSharedMailboxOperator();
        }
        if (sharedMailboxOperator == null) {
            return mailSharedMailboxOperator;
        }
        mailSharedMailboxOperator.mo151659b(sharedMailboxOperator.address);
        mailSharedMailboxOperator.mo151661c(sharedMailboxOperator.name);
        mailSharedMailboxOperator.mo151657a(sharedMailboxOperator.user_id);
        return mailSharedMailboxOperator;
    }

    /* renamed from: b */
    public Address.SharedMailboxOperator mo152040a(Address.SharedMailboxOperator sharedMailboxOperator, MailSharedMailboxOperator mailSharedMailboxOperator) {
        if (mailSharedMailboxOperator == null) {
            return null;
        }
        return new Address.SharedMailboxOperator(mailSharedMailboxOperator.mo151656a(), mailSharedMailboxOperator.mo151658b(), mailSharedMailboxOperator.mo151660c());
    }
}
