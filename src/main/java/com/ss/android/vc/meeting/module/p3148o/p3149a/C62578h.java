package com.ss.android.vc.meeting.module.p3148o.p3149a;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.entity.livestream.MsgWithUrlInfo;
import com.ss.android.vc.entity.request.VideoChatLiveActionEntityRequest;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.p3148o.p3149a.C62580j;
import com.ss.android.vc.statistics.event2.LiveMeetingSettingEvent;

/* renamed from: com.ss.android.vc.meeting.module.o.a.h */
public class C62578h extends AbstractView$OnAttachStateChangeListenerC61215b {

    /* renamed from: h */
    private static volatile C62578h f157529h;

    /* renamed from: d */
    private C62580j f157530d;

    /* renamed from: e */
    private int f157531e = -1;

    /* renamed from: f */
    private VideoChatLiveActionEntityRequest.Action f157532f = VideoChatLiveActionEntityRequest.Action.START;

    /* renamed from: g */
    private boolean f157533g;

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public void mo211634b(boolean z) {
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    public void dismiss() {
        synchronized (this) {
            if (!this.f157533g) {
                this.f157533g = true;
                super.dismiss();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: i */
    public void mo211642i() {
        super.mo211642i();
        mo211633b(this.f157531e);
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: j */
    public void mo211643j() {
        C62580j jVar = this.f157530d;
        if (jVar != null) {
            jVar.mo216351c();
        }
        this.f157531e = -1;
        f157529h = null;
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: k */
    public boolean mo215092k() {
        if (this.f157532f == VideoChatLiveActionEntityRequest.Action.HOST_ACCEPT) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private void m244764l() {
        if (bL_() != null) {
            this.f157531e = bL_().getWindow().getStatusBarColor();
            bM_();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        synchronized (this) {
            this.f157533g = false;
        }
        if (this.f157531e == -1) {
            super.mo211606a();
            m244764l();
        }
        LiveMeetingSettingEvent.m249762a().mo220255a(this.f153299a.mo212056e());
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public View mo211632b(Activity activity) {
        C62580j jVar = new C62580j(activity, this.f153299a, this);
        this.f157530d = jVar;
        return jVar.mo216346a();
    }

    private C62578h(Activity activity, C61303k kVar) {
        super(activity, kVar);
    }

    /* renamed from: a */
    private void m244763a(MsgWithUrlInfo bVar, C62580j.AbstractC62589a aVar, VideoChatLiveActionEntityRequest.Action action) {
        this.f157530d.mo216347a(bVar);
        this.f157530d.mo216349a(aVar);
        this.f157530d.mo216348a(action);
        this.f157532f = action;
    }

    /* renamed from: a */
    public static C62578h m244762a(Activity activity, C61303k kVar, MsgWithUrlInfo bVar, C62580j.AbstractC62589a aVar, VideoChatLiveActionEntityRequest.Action action) {
        if (f157529h == null) {
            synchronized (C62578h.class) {
                if (f157529h == null) {
                    f157529h = new C62578h(activity, kVar);
                }
                f157529h.m244763a(bVar, aVar, action);
            }
        }
        return f157529h;
    }
}
