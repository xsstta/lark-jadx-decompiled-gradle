package com.ss.android.lark.mail.impl.settings.subsetting.notification;

import androidx.lifecycle.LiveData;
import com.bytedance.lark.pb.email.client.v1.MailUpdateAccountResponse;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.settings.subsetting.notification.AbstractC43522a;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.notification.b */
public class C43528b implements AbstractC43522a.AbstractC43523a {
    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.notification.AbstractC43522a.AbstractC43523a
    /* renamed from: a */
    public LiveData<Integer> mo155416a() {
        String j = C43277a.m171921a().mo154946j();
        if (j != null) {
            return C43350d.m172099a(j).mo155048n();
        }
        return null;
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.notification.AbstractC43522a.AbstractC43523a
    /* renamed from: a */
    public void mo155417a(int i) {
        String j = C43277a.m171921a().mo154946j();
        if (j != null) {
            C43350d.m172099a(j).mo155025a(i, (AbstractC41870b<MailUpdateAccountResponse>) null);
        }
    }
}
