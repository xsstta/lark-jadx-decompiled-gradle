package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.MailVacationResponder;
import com.ss.android.lark.mail.impl.entity.EmailAutoReply;
import java.util.TimeZone;

/* renamed from: com.ss.android.lark.mail.impl.g.a.e */
public class C42125e extends C42128h<MailVacationResponder, EmailAutoReply> {
    public C42125e(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public EmailAutoReply mo152042b(MailVacationResponder mailVacationResponder, EmailAutoReply emailAutoReply) {
        EmailAutoReply.C42059a aVar;
        super.mo152042b((Object) mailVacationResponder, (Object) emailAutoReply);
        if (emailAutoReply == null) {
            aVar = new EmailAutoReply.C42059a(false, 0, 0, "");
        } else {
            aVar = new EmailAutoReply.C42059a(emailAutoReply);
        }
        if (mailVacationResponder != null) {
            aVar.mo151153a(mailVacationResponder.enable.booleanValue()).mo151150a(mailVacationResponder.start_timestamp.longValue()).mo151155b(mailVacationResponder.end_timestamp.longValue()).mo151151a(TimeZone.getDefault().getID()).mo151157b(mailVacationResponder.only_send_to_tenant.booleanValue()).mo151158c(mailVacationResponder.tenant_name).mo151156b(mailVacationResponder.auto_reply_summary).mo151159d(mailVacationResponder.auto_reply_body).mo151152a(this.f107148a.f107150a.mo152106a(mailVacationResponder.images, this.f107148a.f107155f));
        }
        return aVar.mo151154a();
    }

    /* renamed from: b */
    public MailVacationResponder mo152040a(MailVacationResponder mailVacationResponder, EmailAutoReply emailAutoReply) {
        super.mo152040a((Object) mailVacationResponder, (Object) emailAutoReply);
        return new MailVacationResponder(Boolean.valueOf(emailAutoReply.mo151132a()), Long.valueOf(emailAutoReply.mo151133b()), Long.valueOf(emailAutoReply.mo151134c()), emailAutoReply.mo151135d(), Boolean.valueOf(emailAutoReply.mo151139f()), emailAutoReply.mo151140g(), this.f107148a.f107150a.mo152107b(emailAutoReply.mo151141h(), this.f107148a.f107155f), emailAutoReply.mo151137e(), emailAutoReply.mo151143i());
    }
}
