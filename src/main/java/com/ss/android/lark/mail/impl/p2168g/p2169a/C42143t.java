package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.DraftImage;
import com.ss.android.lark.mail.impl.entity.MailImage;

/* renamed from: com.ss.android.lark.mail.impl.g.a.t */
public class C42143t extends C42128h<DraftImage, MailImage> {
    public C42143t(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public MailImage mo152042b(DraftImage draftImage, MailImage mailImage) {
        super.mo152042b((Object) draftImage, (Object) mailImage);
        if (mailImage == null) {
            mailImage = new MailImage();
        }
        mailImage.mo151475d(draftImage.cid);
        mailImage.mo151473c(draftImage.file_token);
        mailImage.mo151472b(draftImage.image_name);
        mailImage.mo151469a(draftImage.image_size.longValue());
        mailImage.mo151478e(draftImage.file_path);
        return mailImage;
    }

    /* renamed from: b */
    public DraftImage mo152040a(DraftImage draftImage, MailImage mailImage) {
        super.mo152040a((Object) draftImage, (Object) mailImage);
        return new DraftImage(mailImage.mo151477e(), mailImage.mo151480f(), mailImage.mo151481g(), Long.valueOf(mailImage.mo151482h()), mailImage.mo151486k());
    }
}
