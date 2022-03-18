package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.Address;
import com.bytedance.lark.pb.email.client.v1.EmailAlias;
import com.ss.android.lark.mail.impl.entity.EmailAliasList;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.mail.impl.g.a.c */
public class C42123c extends C42128h<EmailAlias, EmailAliasList> {
    public C42123c(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public EmailAliasList mo152042b(EmailAlias emailAlias, EmailAliasList emailAliasList) {
        if (emailAliasList == null) {
            emailAliasList = new EmailAliasList();
        }
        if (emailAlias != null) {
            if (emailAlias.default_address != null) {
                emailAliasList.mo151113a(this.f107148a.f107152c.mo152042b(emailAlias.default_address, (MailAddress) null));
            }
            if (emailAlias.primary_address != null) {
                emailAliasList.mo151119b(this.f107148a.f107152c.mo152042b(emailAlias.primary_address, (MailAddress) null));
            }
            emailAliasList.mo151115a(emailAlias.is_enable.booleanValue());
            if (!emailAliasList.mo151116a() && emailAliasList.mo151118b() != null) {
                emailAliasList.mo151115a(true);
            }
            if (emailAlias.all_addresses != null) {
                emailAliasList.mo151114a(this.f107148a.f107150a.mo152106a(emailAlias.all_addresses, this.f107148a.f107152c));
            }
        }
        return emailAliasList;
    }

    /* renamed from: b */
    public EmailAlias mo152040a(EmailAlias emailAlias, EmailAliasList emailAliasList) {
        Address address;
        Address address2 = null;
        if (emailAliasList.mo151118b() != null) {
            address = this.f107148a.f107152c.mo152040a((Address) null, emailAliasList.mo151118b());
        } else {
            address = null;
        }
        if (emailAliasList.mo151120c() != null) {
            address2 = this.f107148a.f107152c.mo152040a((Address) null, emailAliasList.mo151120c());
        }
        ArrayList arrayList = new ArrayList();
        if (!emailAliasList.mo151122d().isEmpty()) {
            arrayList.addAll(this.f107148a.f107150a.mo152107b(emailAliasList.mo151122d(), this.f107148a.f107152c));
        }
        return new EmailAlias(Boolean.valueOf(emailAliasList.mo151116a()), address, arrayList, address2, new ArrayList());
    }
}
