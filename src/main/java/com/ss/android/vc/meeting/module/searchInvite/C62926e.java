package com.ss.android.vc.meeting.module.searchInvite;

import com.larksuite.framework.mvp.C26033a;
import com.ss.android.vc.entity.InviteDialogBean;
import com.ss.android.vc.meeting.module.searchInvite.AbstractC62918b;

/* renamed from: com.ss.android.vc.meeting.module.searchInvite.e */
public class C62926e extends C26033a<AbstractC62918b.AbstractC62919a, AbstractC62918b.AbstractC62921b> {
    /* renamed from: c */
    public AbstractC62918b.AbstractC62921b mo217434c() {
        return (AbstractC62918b.AbstractC62921b) mo92551a();
    }

    /* renamed from: d */
    public AbstractC62918b.AbstractC62919a mo217435d() {
        return (AbstractC62918b.AbstractC62919a) mo92554b();
    }

    public C62926e(InviteDialogBean inviteDialogBean, C62927f fVar) {
        mo92553a(fVar, new C62924d(inviteDialogBean));
        fVar.setViewDelegate(new C62934g(this));
    }

    public C62926e(InviteDialogBean inviteDialogBean, C62927f fVar, Boolean bool) {
        mo92553a(fVar, new C62924d(inviteDialogBean));
        fVar.setViewDelegate(new C62934g(this, bool));
    }
}
