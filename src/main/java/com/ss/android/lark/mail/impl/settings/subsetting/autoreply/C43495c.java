package com.ss.android.lark.mail.impl.settings.subsetting.autoreply;

import com.bytedance.lark.pb.email.client.v1.MailUpdateAccountResponse;
import com.ss.android.lark.mail.impl.entity.EmailAutoReply;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AbstractC43504f;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.autoreply.c */
public class C43495c implements AbstractC43504f.AbstractC43505a {

    /* renamed from: a */
    String f110462a;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AbstractC43504f.AbstractC43505a
    /* renamed from: b */
    public String mo155358b() {
        return this.f110462a;
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AbstractC43504f.AbstractC43505a
    /* renamed from: a */
    public EmailAutoReply mo155356a() {
        return C43350d.m172099a(this.f110462a).mo155053s();
    }

    public C43495c(String str) {
        this.f110462a = str;
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AbstractC43504f.AbstractC43505a
    /* renamed from: a */
    public void mo155357a(EmailAutoReply emailAutoReply, AbstractC41870b<MailUpdateAccountResponse> bVar) {
        C43350d.m172099a(this.f110462a).mo155029a(emailAutoReply, bVar);
    }
}
