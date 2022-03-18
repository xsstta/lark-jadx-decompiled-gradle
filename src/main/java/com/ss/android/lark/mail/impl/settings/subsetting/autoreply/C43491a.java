package com.ss.android.lark.mail.impl.settings.subsetting.autoreply;

import androidx.lifecycle.LiveData;
import com.ss.android.lark.mail.impl.entity.EmailAutoReply;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AbstractC43500e;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.autoreply.a */
public class C43491a implements AbstractC43500e.AbstractC43501a {

    /* renamed from: a */
    protected String f110459a;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AbstractC43500e.AbstractC43501a
    /* renamed from: a */
    public String mo155349a() {
        return this.f110459a;
    }

    public C43491a(String str) {
        this.f110459a = str;
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AbstractC43500e.AbstractC43501a
    /* renamed from: a */
    public LiveData<EmailAutoReply> mo155348a(boolean z) {
        return C43350d.m172099a(this.f110459a).mo155023a(z);
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AbstractC43500e.AbstractC43501a
    /* renamed from: a */
    public void mo155350a(EmailAutoReply emailAutoReply) {
        C43350d.m172099a(this.f110459a).mo155028a(emailAutoReply);
    }
}
