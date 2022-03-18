package com.ss.android.vc.meeting.module.base.content;

import android.view.View;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.multi.presenter.InMeetingPresenter;

/* renamed from: com.ss.android.vc.meeting.module.base.content.a */
public abstract class AbstractC61422a extends AbstractC61424d implements AbstractC61214a {

    /* renamed from: a */
    protected AbstractC61423b f154014a;

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a
    public boolean bS_() {
        return false;
    }

    /* renamed from: e */
    public abstract View mo212884e();

    /* renamed from: f */
    public abstract void mo212885f();

    /* renamed from: g */
    public abstract ContentViewType mo212886g();

    /* renamed from: h */
    public boolean mo212887h() {
        return true;
    }

    public void bR_() {
        this.f154014a.mo212888c(this);
    }

    /* access modifiers changed from: protected */
    public InMeetingPresenter bI_() {
        AbstractC61423b bVar = this.f154014a;
        if (bVar != null) {
            return bVar.mo212925j();
        }
        return null;
    }

    public AbstractC61422a(AbstractC61423b bVar) {
        super(bVar);
        this.f154014a = bVar;
    }
}
