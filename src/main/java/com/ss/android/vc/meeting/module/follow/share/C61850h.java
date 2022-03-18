package com.ss.android.vc.meeting.module.follow.share;

import com.larksuite.framework.mvp.C26033a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.follow.share.C61821c;
import com.ss.android.vc.meeting.module.follow.share.desktop.C61832d;
import com.ss.android.vc.meeting.module.follow.share.desktop.ShareContentViewHolder;
import com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract;

/* renamed from: com.ss.android.vc.meeting.module.follow.share.h */
public class C61850h extends C26033a<C61821c.AbstractC61822a, C61821c.AbstractC61824b> {
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C61821c.AbstractC61824b mo214206c() {
        return (C61821c.AbstractC61824b) mo92551a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C61821c.AbstractC61822a mo214207d() {
        return (C61821c.AbstractC61822a) mo92554b();
    }

    public C61850h(C61832d dVar, C61303k kVar, ShareContentViewHolder.SharePanelSource sharePanelSource, ILocalSharePrepareContract.IView bVar) {
        mo92553a(dVar, new C61848g(kVar, sharePanelSource, bVar));
        dVar.setViewDelegate(new C61851i(this));
    }
}
