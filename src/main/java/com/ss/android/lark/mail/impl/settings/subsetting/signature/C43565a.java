package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import com.bytedance.lark.pb.email.client.v1.MailUpdateAccountResponse;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43573e;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.a */
public class C43565a implements AbstractC43573e.AbstractC43574a {

    /* renamed from: a */
    String f110594a;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43573e.AbstractC43574a
    /* renamed from: a */
    public EmailSignature mo155552a() {
        return C43350d.m172099a(this.f110594a).mo155059y();
    }

    public C43565a(String str) {
        this.f110594a = str;
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43573e.AbstractC43574a
    /* renamed from: a */
    public void mo155553a(EmailSignature emailSignature, AbstractC41870b<MailUpdateAccountResponse> bVar) {
        C43350d.m172099a(this.f110594a).mo155033a(emailSignature, bVar);
    }
}
