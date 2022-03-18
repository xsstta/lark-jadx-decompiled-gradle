package com.ss.android.lark.mail.impl.settings.subsetting.replylanguage;

import androidx.lifecycle.LiveData;
import com.ss.android.lark.mail.impl.entity.ReplyLanguage;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.settings.subsetting.replylanguage.AbstractC43535a;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.replylanguage.b */
public class C43539b implements AbstractC43535a.AbstractC43536a {
    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.replylanguage.AbstractC43535a.AbstractC43536a
    /* renamed from: a */
    public LiveData<Integer> mo155435a() {
        return C43350d.m172099a(C43277a.m171921a().mo154946j()).mo155060z();
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.replylanguage.AbstractC43535a.AbstractC43536a
    /* renamed from: a */
    public void mo155436a(ReplyLanguage replyLanguage) {
        C43350d.m172099a(C43277a.m171921a().mo154946j()).mo155030a(replyLanguage);
    }
}
