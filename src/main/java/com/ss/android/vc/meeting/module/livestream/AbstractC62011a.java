package com.ss.android.vc.meeting.module.livestream;

import android.view.View;
import com.ss.android.vc.entity.livestream.LiveInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61420b;
import com.ss.android.vc.meeting.module.livestream.AbstractC62062c;

/* renamed from: com.ss.android.vc.meeting.module.livestream.a */
public abstract class AbstractC62011a extends AbstractC61420b implements AbstractC62062c {
    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62062c
    /* renamed from: a */
    public abstract void mo214670a(View view);

    /* renamed from: a */
    public abstract void mo214671a(AbstractC62062c cVar);

    /* renamed from: a */
    public abstract void mo214672a(boolean z);

    /* renamed from: a */
    public abstract boolean mo214673a();

    /* renamed from: b */
    public abstract void mo214674b(AbstractC62062c cVar);

    /* renamed from: b */
    public abstract void mo214675b(boolean z);

    /* renamed from: b */
    public abstract boolean mo214676b();

    /* renamed from: c */
    public abstract LiveInfo mo214677c();

    /* renamed from: d */
    public abstract HostReceiveLivingRequestData mo214678d();

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62062c
    /* renamed from: d */
    public /* synthetic */ void mo214679d(boolean z) {
        AbstractC62062c.CC.$default$d(this, z);
    }

    /* renamed from: e */
    public abstract C62075j mo214680e();

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62062c
    /* renamed from: f */
    public abstract void mo214681f();

    public AbstractC62011a(C61303k kVar) {
        super(kVar);
    }
}
