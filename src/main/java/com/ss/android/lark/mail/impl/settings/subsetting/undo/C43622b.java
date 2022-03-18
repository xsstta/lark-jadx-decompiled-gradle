package com.ss.android.lark.mail.impl.settings.subsetting.undo;

import androidx.lifecycle.LiveData;
import com.ss.android.lark.mail.impl.entity.C42101o;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.settings.subsetting.undo.AbstractC43618a;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.undo.b */
public class C43622b implements AbstractC43618a.AbstractC43619a {
    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.undo.AbstractC43618a.AbstractC43619a
    /* renamed from: a */
    public LiveData<C42101o> mo155643a() {
        return C43350d.m172099a(C43277a.m171921a().mo154946j()).mo155050p();
    }

    @Override // com.ss.android.lark.mail.impl.settings.subsetting.undo.AbstractC43618a.AbstractC43619a
    /* renamed from: a */
    public void mo155644a(C42101o oVar) {
        C43350d.m172099a(C43277a.m171921a().mo154946j()).mo155032a(oVar);
    }
}
