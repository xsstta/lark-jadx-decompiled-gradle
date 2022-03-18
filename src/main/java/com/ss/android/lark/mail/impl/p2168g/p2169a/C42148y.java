package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.Message;
import com.bytedance.lark.pb.email.client.v1.MessageItem;
import com.ss.android.lark.mail.impl.entity.C42097j;
import com.ss.android.lark.mail.impl.entity.MailMessage;

/* renamed from: com.ss.android.lark.mail.impl.g.a.y */
public class C42148y extends C42128h<MessageItem, C42097j> {
    public C42148y(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public C42097j mo152042b(MessageItem messageItem, C42097j jVar) {
        super.mo152042b((Object) messageItem, (Object) jVar);
        if (jVar == null) {
            jVar = new C42097j();
        }
        jVar.mo151951a(messageItem.index.intValue());
        jVar.mo151953a(this.f107148a.f107158i.mo152042b(messageItem.message, (MailMessage) null));
        jVar.mo151954a(this.f107148a.f107150a.mo152106a(messageItem.drafts, this.f107148a.f107156g));
        return jVar;
    }

    /* renamed from: b */
    public MessageItem mo152040a(MessageItem messageItem, C42097j jVar) {
        return new MessageItem(this.f107148a.f107158i.mo152040a((Message) null, jVar.mo151964g()), this.f107148a.f107150a.mo152107b(jVar.mo151950a(), this.f107148a.f107156g), Integer.valueOf(jVar.mo151963f()));
    }
}
