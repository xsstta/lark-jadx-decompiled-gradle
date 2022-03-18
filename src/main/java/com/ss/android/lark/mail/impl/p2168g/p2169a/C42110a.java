package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.MailAccount;
import com.bytedance.lark.pb.email.client.v1.Setting;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.entity.C42094f;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.g.a.a */
public class C42110a extends C42128h<MailAccount, C42093e> {
    public C42110a(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public C42093e mo152042b(MailAccount mailAccount, C42093e eVar) {
        List<C42093e> list;
        if (eVar == null) {
            eVar = new C42093e();
        }
        if (mailAccount != null) {
            eVar.mo151845a(mailAccount.lark_user_id);
            eVar.mo151849b(mailAccount.mail_account_id);
            eVar.mo151852c(mailAccount.account_token);
            eVar.mo151854d(mailAccount.account_name);
            eVar.mo151856e(mailAccount.account_address);
            eVar.mo151847a(mailAccount.is_shared.booleanValue());
            eVar.mo151850b(mailAccount.is_selected.booleanValue());
            eVar.mo151844a(this.f107148a.f107165p.mo152042b(mailAccount.mail_setting, new C42094f()));
            if (mailAccount.shared_accounts != null) {
                list = this.f107148a.f107150a.mo152106a(mailAccount.shared_accounts, this.f107148a.f107169t);
            } else {
                list = null;
            }
            eVar.mo151846a(list);
        }
        return eVar;
    }

    /* renamed from: b */
    public MailAccount mo152040a(MailAccount mailAccount, C42093e eVar) {
        MailAccount.C16622a aVar = new MailAccount.C16622a();
        aVar.f43049a = eVar.mo151843a();
        aVar.f43050b = eVar.mo151848b();
        aVar.f43051c = eVar.mo151851c();
        aVar.f43052d = eVar.mo151853d();
        aVar.f43053e = eVar.mo151855e();
        aVar.f43054f = Boolean.valueOf(eVar.mo151858f());
        aVar.f43056h = Boolean.valueOf(eVar.mo151859g());
        List<MailAccount> list = null;
        aVar.f43057i = this.f107148a.f107165p.mo152040a((Setting) null, eVar.mo151860h());
        if (eVar.mo151862i() != null) {
            list = this.f107148a.f107150a.mo152107b(eVar.mo151862i(), this.f107148a.f107169t);
        }
        aVar.f43058j = list;
        return aVar.build();
    }
}
