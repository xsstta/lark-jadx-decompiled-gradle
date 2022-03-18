package com.ss.android.vc.meeting.module.chat.p3115a;

import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.chat.p3115a.AbstractC61567a;
import com.ss.android.vc.meeting.module.reaction.entity.IMSource;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessage;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.vc.meeting.module.chat.a.b */
public class C61569b extends AbstractC61567a {

    /* renamed from: a */
    private static long f154453a = -1;

    /* renamed from: b */
    private final List<AbstractC61567a.AbstractC61568a> f154454b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private Runnable f154455c = new Runnable() {
        /* class com.ss.android.vc.meeting.module.chat.p3115a.C61569b.RunnableC615701 */

        public void run() {
            C60700b.m235851b("MessageControl", "[hideMessage]", "time end, hide current message");
            C61569b.this.mo213387a(true);
        }
    };

    @Override // com.ss.android.vc.meeting.module.chat.p3115a.AbstractC61567a
    /* renamed from: a */
    public void mo213385a(AbstractC61567a.AbstractC61568a aVar) {
        if (!this.f154454b.contains(aVar)) {
            this.f154454b.add(aVar);
        }
    }

    @Override // com.ss.android.vc.meeting.module.chat.p3115a.AbstractC61567a
    /* renamed from: b */
    public void mo213388b(AbstractC61567a.AbstractC61568a aVar) {
        if (this.f154454b.contains(aVar)) {
            this.f154454b.remove(aVar);
        }
    }

    public C61569b(C61303k kVar) {
        super(kVar);
    }

    /* renamed from: a */
    private boolean m240336a(IMSource iMSource) {
        if ((iMSource != IMSource.BOTTOM_BAR || !this.mMeeting.ai().mo213012a()) && (iMSource != IMSource.REACTION || this.mMeeting.ai().mo213012a())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.chat.p3115a.AbstractC61567a
    /* renamed from: a */
    public void mo213387a(boolean z) {
        C60735ab.m236011b(this.f154455c);
        for (AbstractC61567a.AbstractC61568a aVar : this.f154454b) {
            if (aVar.mo213103u()) {
                aVar.mo213098i(z);
            }
        }
    }

    /* renamed from: a */
    public static int m240335a(IMSource iMSource, boolean z) {
        if (iMSource == IMSource.BOTTOM_BAR) {
            return C60776r.m236139a() - UIHelper.dp2px(178.0f);
        }
        if (z) {
            return UIHelper.dp2px(278.0f);
        }
        return C60776r.m236139a() - UIHelper.dp2px(96.0f);
    }

    /* renamed from: b */
    public static int m240337b(IMSource iMSource, boolean z) {
        if (iMSource == IMSource.BOTTOM_BAR) {
            return C60776r.m236139a() - UIHelper.dp2px(178.0f);
        }
        if (z) {
            return UIHelper.dp2px(198.0f);
        }
        return C60776r.m236139a() - UIHelper.dp2px(177.0f);
    }

    /* renamed from: c */
    public static int m240338c(IMSource iMSource, boolean z) {
        if (iMSource == IMSource.BOTTOM_BAR) {
            return C60776r.m236139a() - UIHelper.dp2px(160.0f);
        }
        if (z) {
            return UIHelper.dp2px(296.0f);
        }
        return C60776r.m236139a() - UIHelper.dp2px(78.0f);
    }

    /* renamed from: d */
    public static int m240339d(IMSource iMSource, boolean z) {
        if (iMSource == IMSource.BOTTOM_BAR) {
            return C60776r.m236139a() - UIHelper.dp2px(160.0f);
        }
        if (z) {
            return UIHelper.dp2px(216.0f);
        }
        return C60776r.m236139a() - UIHelper.dp2px(159.0f);
    }

    @Override // com.ss.android.vc.meeting.module.chat.p3115a.AbstractC61567a
    /* renamed from: a */
    public void mo213386a(InteractionMessage aVar, IMSource iMSource) {
        this.mMeeting.as().mo213383m();
        C60735ab.m236011b(this.f154455c);
        for (AbstractC61567a.AbstractC61568a aVar2 : this.f154454b) {
            if (aVar2.mo213103u()) {
                aVar2.mo213098i(true);
            }
            if (iMSource == aVar2.mo213104v() && m240336a(aVar2.mo213104v())) {
                aVar2.mo213096b(aVar);
                C60735ab.m236002a(this.f154455c, 6000);
            }
        }
    }
}
