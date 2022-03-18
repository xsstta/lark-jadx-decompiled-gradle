package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.Address;
import com.bytedance.lark.pb.email.client.v1.Draft;
import com.bytedance.lark.pb.email.client.v1.EmailAlias;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.ss.android.lark.mail.impl.entity.EmailAliasList;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.g.a.m */
public class C42136m extends C42128h<Draft, MailDraft> {
    public C42136m(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public MailDraft mo152042b(Draft draft, MailDraft mailDraft) {
        super.mo152042b((Object) draft, (Object) mailDraft);
        if (mailDraft == null) {
            mailDraft = new MailDraft();
        }
        mailDraft.mo151327a(draft.id);
        mailDraft.mo151333b(draft.subject);
        mailDraft.mo151337c(draft.body_html);
        mailDraft.mo151323a(draft.last_updated_timestamp.longValue());
        mailDraft.mo151332b(draft.created_timestamp.longValue());
        mailDraft.mo151325a(this.f107148a.f107152c.mo152042b(draft.from, (MailAddress) null));
        mailDraft.mo151328a(this.f107148a.f107150a.mo152106a(draft.to, this.f107148a.f107152c));
        mailDraft.mo151334b(this.f107148a.f107150a.mo152106a(draft.cc, this.f107148a.f107152c));
        mailDraft.mo151338c(this.f107148a.f107150a.mo152106a(draft.bcc, this.f107148a.f107152c));
        mailDraft.mo151341d(this.f107148a.f107150a.mo152106a(draft.attachments, this.f107148a.f107153d));
        mailDraft.mo151345e(this.f107148a.f107150a.mo152106a(draft.images, this.f107148a.f107155f));
        mailDraft.mo151340d(draft.body_plaintext);
        mailDraft.mo151349f(this.f107148a.f107150a.mo152106a(draft.docs_permissions, this.f107148a.f107166q));
        mailDraft.mo151351g(draft.doc_id);
        mailDraft.mo151348f(draft.reply_message_id);
        mailDraft.mo151344e(draft.thread_id);
        if (draft.email_alias != null) {
            mailDraft.mo151324a(this.f107148a.f107164o.mo152042b(draft.email_alias, (EmailAliasList) null));
        }
        mailDraft.mo151322a(draft.permission_code.getValue());
        mailDraft.mo151356i(draft.reply_share_message_id);
        mailDraft.mo151329a(draft.is_send_separately.booleanValue());
        return mailDraft;
    }

    /* renamed from: b */
    public Draft mo152040a(Draft draft, MailDraft mailDraft) {
        List list;
        EmailAlias emailAlias;
        super.mo152040a((Object) draft, (Object) mailDraft);
        String a = mailDraft.mo151321a();
        Address b = this.f107148a.f107152c.mo152040a((Address) null, mailDraft.mo151331b());
        List b2 = this.f107148a.f107150a.mo152107b(mailDraft.mo151339d(), this.f107148a.f107152c);
        List b3 = this.f107148a.f107150a.mo152107b(mailDraft.mo151343e(), this.f107148a.f107152c);
        List b4 = this.f107148a.f107150a.mo152107b(mailDraft.mo151347f(), this.f107148a.f107152c);
        String g = mailDraft.mo151350g();
        String h = mailDraft.mo151352h();
        List b5 = this.f107148a.f107150a.mo152107b(mailDraft.mo151355i(), this.f107148a.f107153d);
        Long valueOf = Long.valueOf(mailDraft.mo151357j());
        Long valueOf2 = Long.valueOf(mailDraft.mo151360m());
        List b6 = this.f107148a.f107150a.mo152107b(mailDraft.mo151358k(), this.f107148a.f107155f);
        String l = mailDraft.mo151359l();
        if (mailDraft.mo151363p() == null) {
            list = new ArrayList();
        } else {
            list = this.f107148a.f107150a.mo152107b(mailDraft.mo151363p(), this.f107148a.f107166q);
        }
        String r = mailDraft.mo151365r();
        String o = mailDraft.mo151362o();
        if (mailDraft.mo151364q() == null) {
            emailAlias = null;
        } else {
            emailAlias = this.f107148a.f107164o.mo152040a((EmailAlias) null, mailDraft.mo151364q());
        }
        return new Draft(a, b, b2, b3, b4, g, h, b5, valueOf, valueOf2, b6, l, list, r, o, emailAlias, mailDraft.mo151361n(), PermissionCode.fromValue(mailDraft.mo151317B()), mailDraft.mo151318C(), Boolean.valueOf(mailDraft.mo151366s()));
    }
}
