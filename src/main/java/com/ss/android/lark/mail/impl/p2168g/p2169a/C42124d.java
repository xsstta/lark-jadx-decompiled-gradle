package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.Attachment;
import com.ss.android.lark.mail.impl.entity.MailAttachment;

/* renamed from: com.ss.android.lark.mail.impl.g.a.d */
public class C42124d extends C42128h<Attachment, MailAttachment> {
    public C42124d(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public MailAttachment mo152042b(Attachment attachment, MailAttachment mailAttachment) {
        super.mo152042b((Object) attachment, (Object) mailAttachment);
        if (mailAttachment == null) {
            mailAttachment = new MailAttachment();
        }
        mailAttachment.mo151222b(attachment.file_name);
        mailAttachment.mo151218a(attachment.file_size.longValue());
        mailAttachment.mo151226d(attachment.file_token);
        mailAttachment.mo151224c(attachment.file_url);
        if (attachment.type != null) {
            mailAttachment.mo151223c(attachment.type.getValue());
        }
        if (attachment.large_file_permission != null) {
            mailAttachment.mo151220b(attachment.large_file_permission.getValue());
        }
        mailAttachment.mo151221b(attachment.expire_time.longValue());
        mailAttachment.mo151225c(attachment.need_convert_to_large.booleanValue());
        return mailAttachment;
    }

    /* renamed from: b */
    public Attachment mo152040a(Attachment attachment, MailAttachment mailAttachment) {
        super.mo152040a((Object) attachment, (Object) mailAttachment);
        Attachment.C16602a aVar = new Attachment.C16602a();
        aVar.mo59061a(mailAttachment.mo151229f()).mo59064b(mailAttachment.mo151230g()).mo59060a(Long.valueOf(mailAttachment.mo151231h())).mo59065c(mailAttachment.mo151234j()).mo59058a(Attachment.AttachmentType.fromValue(mailAttachment.mo151238n())).mo59063b(Long.valueOf(mailAttachment.mo151236l())).mo59057a(Attachment.AttachmentPermission.fromValue(mailAttachment.mo151235k())).mo59059a(Boolean.valueOf(mailAttachment.mo151237m()));
        return aVar.build();
    }
}
