package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.Address;
import com.ss.android.lark.mail.impl.entity.AddressType;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailSharedMailboxOperator;

/* renamed from: com.ss.android.lark.mail.impl.g.a.b */
public class C42122b extends C42128h<Address, MailAddress> {
    public C42122b(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public MailAddress mo152042b(Address address, MailAddress mailAddress) {
        super.mo152042b((Object) address, (Object) mailAddress);
        MailAddress.C42062a aVar = new MailAddress.C42062a();
        if (address != null) {
            if (mailAddress != null) {
                aVar = mailAddress.mo151199t();
            }
            aVar.mo151212b(address.address);
            aVar.mo151209a(address.name);
            aVar.mo151213c(address.lark_entity_id_string);
            if (address.lark_entity_type != null) {
                aVar.mo151207a(AddressType.fromValue(address.lark_entity_type.getValue()));
            }
            if (address.operator != null) {
                aVar.mo151208a(this.f107148a.f107170u.mo152042b(address.operator, new MailSharedMailboxOperator()));
            }
            if (address.tenant_id != null) {
                aVar.mo151216f(address.tenant_id);
            }
            aVar.mo151217g(address.display_name);
        }
        return aVar.mo151210a();
    }

    /* renamed from: b */
    public Address mo152040a(Address address, MailAddress mailAddress) {
        Address.LarkEntityType larkEntityType;
        super.mo152040a((Object) address, (Object) mailAddress);
        if (mailAddress.mo151190k() != null) {
            larkEntityType = Address.LarkEntityType.fromValue(mailAddress.mo151190k().getValue());
        } else {
            larkEntityType = null;
        }
        Address.C16600a aVar = new Address.C16600a();
        aVar.mo59048a(mailAddress.mo151177b()).mo59050b(mailAddress.mo151182e()).mo59046a(larkEntityType).mo59051c(mailAddress.mo151189j()).mo59047a(this.f107148a.f107170u.mo152040a((Address.SharedMailboxOperator) null, mailAddress.mo151194o())).mo59052d(mailAddress.mo151196q()).mo59053e(mailAddress.mo151184f());
        return aVar.build();
    }
}
