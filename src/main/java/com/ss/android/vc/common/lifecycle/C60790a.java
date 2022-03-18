package com.ss.android.vc.common.lifecycle;

import com.ss.android.floatbubble.C28460b;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.AbstractC60908v;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.common.lifecycle.a */
public class C60790a implements AbstractC60908v.AbstractC60910b {

    /* renamed from: a */
    private List<AbstractC60908v.AbstractC60910b> f151996a;

    /* renamed from: b */
    private final Object f151997b;

    /* renamed from: com.ss.android.vc.common.lifecycle.a$a */
    private static class C60792a {

        /* renamed from: a */
        static C60790a f151998a = new C60790a();
    }

    /* renamed from: a */
    public static C60790a m236265a() {
        return C60792a.f151998a;
    }

    private C60790a() {
        this.f151996a = new ArrayList();
        this.f151997b = new Object();
    }

    /* renamed from: b */
    private void m236266b() {
        C60700b.m235851b("VCAppLifeCycleObserver", "[checkIfNeedRecoveryMeetingFragment]", "need recovery?");
        C61303k kVar = (C61303k) MeetingManager.m238341a().mo211908l();
        if (kVar != null && kVar.mo212067p() == DisplayMode.NONE) {
            C60700b.m235851b("VCAppLifeCycleObserver", "[checkIfNeedRecoveryMeetingFragment2]", "need recovery");
            ByteRTCMeetingActivity.m244042c(kVar);
        } else if (kVar != null && kVar.aE().mo208293c()) {
            ByteRTCMeetingActivity a = kVar.aE().mo208290a();
            if (kVar.mo212067p() == DisplayMode.ACTIVITY && a != null && !a.isFinishing() && !kVar.aE().mo208292b() && !C28460b.m104296a(a)) {
                C60700b.m235851b("VCAppLifeCycleObserver", "[checkIfNeedRecoveryMeetingFragment]", "need recovery, display mode: " + kVar.mo212067p());
                ByteRTCMeetingActivity.m244042c(kVar);
            }
        }
    }

    /* renamed from: b */
    public void mo208391b(AbstractC60908v.AbstractC60910b bVar) {
        synchronized (this.f151997b) {
            if (bVar != null) {
                this.f151996a.remove(bVar);
            }
        }
    }

    /* renamed from: a */
    public void mo208390a(AbstractC60908v.AbstractC60910b bVar) {
        synchronized (this.f151997b) {
            if (!this.f151996a.contains(bVar)) {
                this.f151996a.add(bVar);
            }
        }
    }

    @Override // com.ss.android.vc.dependency.AbstractC60908v.AbstractC60910b
    public void onAppLifecycleChanged(C60793b bVar, C60793b bVar2) {
        synchronized (this.f151997b) {
            for (AbstractC60908v.AbstractC60910b bVar3 : this.f151996a) {
                bVar3.onAppLifecycleChanged(bVar, bVar2);
            }
        }
        if (!bVar.f152000b && bVar2.f152000b) {
            m236266b();
        }
    }
}
