package com.ss.android.vc.meeting.module.p3114c;

import android.view.View;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61293a;
import com.ss.android.vc.meeting.framework.meeting.EventSource;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.base.MeetingActivity;
import com.ss.android.vc.meeting.module.p3114c.AbstractC61547a;
import com.ss.android.vc.meeting.utils.C63492g;

/* renamed from: com.ss.android.vc.meeting.module.c.d */
public class C61550d extends AbstractC61424d implements AbstractC61214a, AbstractC61547a.AbstractC61548a {

    /* renamed from: a */
    private ConnectLoadingStub f154397a;

    /* renamed from: b */
    private final AbstractC61293a f154398b = new AbstractC61293a() {
        /* class com.ss.android.vc.meeting.module.p3114c.C61550d.C615511 */

        @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
        /* renamed from: b */
        public void mo211757b() {
            C61550d.this.mo213271b();
        }

        @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
        /* renamed from: c */
        public void mo211767c() {
            C61550d.this.mo213270a();
        }

        @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
        /* renamed from: e */
        public void mo211771e(String str, String str2) {
            C61550d.this.mo213271b();
        }
    };

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a
    public boolean bS_() {
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.p3114c.AbstractC61547a.AbstractC61548a
    /* renamed from: b */
    public void mo213271b() {
        C60700b.m235851b("ConnectLoadingViewControl", "[stopLoading]", "stopLoading");
        this.f154397a.mo213275b();
        if (getActivity() instanceof MeetingActivity) {
            ((MeetingActivity) getActivity()).mo212776b(this);
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        getMeeting().au().mo213269b(this);
        getMeeting().mo212164x().mo211761b(this.f154398b);
        mo213271b();
    }

    @Override // com.ss.android.vc.meeting.module.p3114c.AbstractC61547a.AbstractC61548a
    /* renamed from: a */
    public void mo213270a() {
        C60700b.m235851b("ConnectLoadingViewControl", "[startLoading]", "startLoading");
        this.f154397a.mo213274a();
        if (this.f154397a.mo213276c() != null) {
            this.f154397a.mo213276c().setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.p3114c.$$Lambda$d$I_SOsOVe6QAlWfmqpPIxUokfY4 */

                public final void onClick(View view) {
                    C61550d.m271223lambda$I_SOsOVe6QAlWfmqpPIxUokfY4(C61550d.this, view);
                }
            });
        }
        if (getActivity() instanceof MeetingActivity) {
            ((MeetingActivity) getActivity()).mo212771a(this);
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void init() {
        getMeeting().au().mo213268a(this);
        getMeeting().mo212164x().mo211751a(this.f154398b);
        this.f154397a = new ConnectLoadingStub(getRootView());
    }

    public C61550d(AbstractC61429i iVar) {
        super(iVar);
        init();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m240237a(View view) {
        C60700b.m235851b("ConnectLoadingViewControl", "[onClick]", "click exit meeting button");
        C63492g.m248824b(true, Boolean.valueOf(getMeeting().mo212092J().mo212512I()));
        getMeeting().mo212051a(C61344j.m239002a().mo212329a(103).mo212331a(EventSource.EVENT_ACTIVITY));
        if (this.f154397a.mo213276c() != null) {
            this.f154397a.mo213276c().setEnabled(false);
        }
    }
}
