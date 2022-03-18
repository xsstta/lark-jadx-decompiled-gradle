package com.ss.android.vc.meeting.module.chat.p3115a;

import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61420b;
import com.ss.android.vc.meeting.module.reaction.entity.IMSource;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessage;

/* renamed from: com.ss.android.vc.meeting.module.chat.a.a */
public abstract class AbstractC61567a extends AbstractC61420b {

    /* renamed from: com.ss.android.vc.meeting.module.chat.a.a$a */
    public interface AbstractC61568a {
        /* renamed from: b */
        void mo213096b(InteractionMessage aVar);

        /* renamed from: i */
        void mo213098i(boolean z);

        /* renamed from: u */
        boolean mo213103u();

        /* renamed from: v */
        IMSource mo213104v();
    }

    /* renamed from: a */
    public abstract void mo213385a(AbstractC61568a aVar);

    /* renamed from: a */
    public abstract void mo213386a(InteractionMessage aVar, IMSource iMSource);

    /* renamed from: a */
    public abstract void mo213387a(boolean z);

    /* renamed from: b */
    public abstract void mo213388b(AbstractC61568a aVar);

    public AbstractC61567a(C61303k kVar) {
        super(kVar);
    }
}
