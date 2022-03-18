package com.ss.android.vc.meeting.module.p3114c;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.p3114c.AbstractC61547a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.vc.meeting.module.c.b */
public class C61549b extends AbstractC61547a {

    /* renamed from: a */
    private final List<AbstractC61547a.AbstractC61548a> f154392a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public void mo213272b() {
        for (AbstractC61547a.AbstractC61548a aVar : this.f154392a) {
            if (aVar != null) {
                aVar.mo213270a();
            }
        }
    }

    /* renamed from: c */
    public void mo213273c() {
        for (AbstractC61547a.AbstractC61548a aVar : this.f154392a) {
            if (aVar != null) {
                aVar.mo213271b();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3114c.AbstractC61547a
    /* renamed from: a */
    public void mo213267a() {
        int j = getMeeting().mo212165y().mo212027j();
        C60700b.m235851b("ConnectLoadingControl", "[initStatus]", "status = " + j);
        if (j == 2) {
            mo213272b();
        } else if (j == 3) {
            mo213273c();
        } else {
            mo213273c();
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3114c.AbstractC61547a
    /* renamed from: a */
    public void mo213268a(AbstractC61547a.AbstractC61548a aVar) {
        this.f154392a.add(aVar);
    }

    @Override // com.ss.android.vc.meeting.module.p3114c.AbstractC61547a
    /* renamed from: b */
    public void mo213269b(AbstractC61547a.AbstractC61548a aVar) {
        this.f154392a.remove(aVar);
    }

    public C61549b(C61303k kVar) {
        super(kVar);
    }
}
