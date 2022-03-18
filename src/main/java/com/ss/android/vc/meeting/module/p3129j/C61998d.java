package com.ss.android.vc.meeting.module.p3129j;

import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.p3129j.AbstractC61994a;
import com.ss.android.vc.meeting.module.topbar.viewstub.TopBarPromptStub;

/* renamed from: com.ss.android.vc.meeting.module.j.d */
public class C61998d extends AbstractC61424d implements C60738ac.AbstractC60739a, AbstractC61994a.AbstractC61995a {

    /* renamed from: a */
    private AbstractC61994a f155775a;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m242214b() {
        mo213812c(-1);
    }

    @Override // com.ss.android.vc.common.p3083e.C60738ac.AbstractC60739a
    /* renamed from: a */
    public void mo208364a() {
        mo213817k();
        if (this.f155775a.mo214607b()) {
            mH().postDelayed(new Runnable() {
                /* class com.ss.android.vc.meeting.module.p3129j.$$Lambda$d$dvb3fMVymRiaQLdzkLUatILuQ4 */

                public final void run() {
                    C61998d.this.m242214b();
                }
            }, 3000);
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void init() {
        AbstractC61994a an = getMeeting().an();
        this.f155775a = an;
        an.mo214602a(this);
        C60738ac.m236028a(this);
    }

    @Override // com.ss.android.vc.meeting.module.p3129j.AbstractC61994a.AbstractC61995a
    /* renamed from: k */
    public void mo213817k() {
        getMeeting().ah().mo219485b(this.f155775a.mo214607b());
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        super.destroy();
        AbstractC61994a aVar = this.f155775a;
        if (aVar != null) {
            aVar.mo214605b(this);
            this.f155775a.mo214604a(false);
        }
        getMeeting().ah().mo219479a(TopBarPromptStub.Mode.WEAK_NETWORK);
        C60738ac.m236034b(this);
        mH().removeCallbacksAndMessages(null);
    }

    public C61998d(AbstractC61429i iVar) {
        super(iVar);
        init();
    }

    @Override // com.ss.android.vc.meeting.module.p3129j.AbstractC61994a.AbstractC61995a
    /* renamed from: c */
    public void mo213812c(int i) {
        getMeeting().ah().mo219485b(this.f155775a.mo214607b());
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onOrientation(boolean z, boolean z2) {
        super.onOrientation(z, z2);
        mo213817k();
    }
}
