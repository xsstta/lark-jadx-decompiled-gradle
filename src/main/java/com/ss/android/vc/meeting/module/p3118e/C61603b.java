package com.ss.android.vc.meeting.module.p3118e;

import android.view.View;
import com.ss.android.vc.lark.guidetips.VideoChatGuideConstants;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.p3118e.AbstractC61601a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.vc.meeting.module.e.b */
public class C61603b extends AbstractC61601a {

    /* renamed from: a */
    private final List<AbstractC61601a.AbstractC61602a> f154541a = new CopyOnWriteArrayList();

    @Override // com.ss.android.vc.meeting.module.p3118e.AbstractC61601a
    /* renamed from: a */
    public void mo213461a() {
        for (AbstractC61601a.AbstractC61602a aVar : this.f154541a) {
            if (aVar != null) {
                aVar.mo213467a();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3118e.AbstractC61601a
    /* renamed from: b */
    public boolean mo213465b() {
        for (AbstractC61601a.AbstractC61602a aVar : this.f154541a) {
            if (aVar != null && aVar.mo213469b()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.p3118e.AbstractC61601a
    /* renamed from: c */
    public int mo213466c() {
        int i = 0;
        for (AbstractC61601a.AbstractC61602a aVar : this.f154541a) {
            if (aVar != null && aVar.mo213470c() > i) {
                i = aVar.mo213470c();
            }
        }
        return i;
    }

    @Override // com.ss.android.vc.meeting.module.p3118e.AbstractC61601a
    /* renamed from: a */
    public void mo213463a(AbstractC61601a.AbstractC61602a aVar) {
        this.f154541a.add(aVar);
    }

    @Override // com.ss.android.vc.meeting.module.p3118e.AbstractC61601a
    /* renamed from: b */
    public void mo213464b(AbstractC61601a.AbstractC61602a aVar) {
        this.f154541a.remove(aVar);
    }

    public C61603b(C61303k kVar) {
        super(kVar);
    }

    @Override // com.ss.android.vc.meeting.module.p3118e.AbstractC61601a
    /* renamed from: a */
    public void mo213462a(View view, VideoChatGuideConstants.GuideType guideType) {
        for (AbstractC61601a.AbstractC61602a aVar : this.f154541a) {
            if (aVar != null) {
                aVar.mo213468a(view, guideType);
            }
        }
    }
}
