package com.ss.android.vc.meeting.module.busyring;

import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.busyring.AbstractC61540a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.vc.meeting.module.busyring.b */
public class C61542b extends AbstractC61540a {

    /* renamed from: a */
    private List<AbstractC61540a.AbstractC61541a> f154385a = new CopyOnWriteArrayList();

    @Override // com.ss.android.vc.meeting.module.busyring.AbstractC61540a
    /* renamed from: a */
    public void mo213262a() {
        for (AbstractC61540a.AbstractC61541a aVar : this.f154385a) {
            if (aVar != null) {
                aVar.mo213265a();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.busyring.AbstractC61540a
    /* renamed from: a */
    public void mo213263a(AbstractC61540a.AbstractC61541a aVar) {
        this.f154385a.add(aVar);
    }

    @Override // com.ss.android.vc.meeting.module.busyring.AbstractC61540a
    /* renamed from: b */
    public void mo213264b(AbstractC61540a.AbstractC61541a aVar) {
        this.f154385a.remove(aVar);
    }

    public C61542b(C61303k kVar) {
        super(kVar);
    }
}
