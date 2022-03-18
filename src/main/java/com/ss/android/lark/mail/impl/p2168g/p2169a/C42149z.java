package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailMessage;

/* renamed from: com.ss.android.lark.mail.impl.g.a.z */
public class C42149z {
    /* renamed from: a */
    public static MailDraft m168217a(MailMessage mailMessage, MailDraft mailDraft) {
        if (mailMessage == null) {
            return mailDraft;
        }
        if (mailDraft == null) {
            mailDraft = new MailDraft();
        }
        mailDraft.mo151327a(mailMessage.mo151581b());
        mailDraft.mo151325a(mailMessage.mo151586c());
        mailDraft.mo151328a(mailMessage.mo151591d());
        mailDraft.mo151334b(mailMessage.mo151598e());
        mailDraft.mo151338c(mailMessage.mo151601f());
        mailDraft.mo151344e(mailMessage.mo151627z());
        mailDraft.mo151333b(mailMessage.mo151604g());
        mailDraft.mo151337c(mailMessage.mo151606h());
        mailDraft.mo151340d(mailMessage.mo151608i());
        mailDraft.mo151332b(mailMessage.mo151615o());
        mailDraft.mo151345e(mailMessage.mo151611k());
        mailDraft.mo151341d(mailMessage.mo151610j());
        mailDraft.mo151329a(mailMessage.mo151560M());
        return mailDraft;
    }
}
