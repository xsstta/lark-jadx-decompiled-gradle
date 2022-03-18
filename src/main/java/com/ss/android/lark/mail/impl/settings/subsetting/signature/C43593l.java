package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import androidx.lifecycle.LiveData;
import com.bytedance.lark.pb.email.client.v1.MailUpdateAccountResponse;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43585h;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.l */
public class C43593l implements AbstractC43585h.AbstractC43586a {

    /* renamed from: a */
    String f110620a;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43585h.AbstractC43586a
    /* renamed from: a */
    public String mo155581a() {
        return this.f110620a;
    }

    public C43593l(String str) {
        this.f110620a = str;
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43585h.AbstractC43586a
    /* renamed from: a */
    public LiveData<EmailSignature> mo155580a(boolean z) {
        return C43350d.m172099a(this.f110620a).mo155038c(z);
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43585h.AbstractC43586a
    /* renamed from: a */
    public void mo155582a(EmailSignature emailSignature) {
        C43350d.m172099a(this.f110620a).mo155033a(emailSignature, (AbstractC41870b<MailUpdateAccountResponse>) null);
    }
}
