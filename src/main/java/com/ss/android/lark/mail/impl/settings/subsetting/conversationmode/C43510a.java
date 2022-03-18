package com.ss.android.lark.mail.impl.settings.subsetting.conversationmode;

import androidx.lifecycle.LiveData;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.settings.subsetting.conversationmode.AbstractC43514c;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.conversationmode.a */
public class C43510a implements AbstractC43514c.AbstractC43515a {
    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.conversationmode.AbstractC43514c.AbstractC43515a
    /* renamed from: a */
    public LiveData<Boolean> mo155386a() {
        return C43350d.m172099a(C43277a.m171921a().mo154946j()).mo155055u();
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.conversationmode.AbstractC43514c.AbstractC43515a
    /* renamed from: a */
    public void mo155387a(boolean z) {
        C43350d.m172099a(C43277a.m171921a().mo154946j()).mo155035b(z);
    }
}
