package com.ss.android.vc.meeting.module.p3148o.p3149a;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.entity.livestream.MsgWithUrlInfo;
import com.ss.android.vc.entity.request.VideoChatLiveActionEntityRequest;
import com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.p3148o.p3149a.C62580j;

/* renamed from: com.ss.android.vc.meeting.module.o.a.g */
public class C62577g extends MeetingBaseDesktopDialog {

    /* renamed from: c */
    private static C62577g f157526c;

    /* renamed from: a */
    private C62580j f157527a;

    /* renamed from: b */
    private VideoChatLiveActionEntityRequest.Action f157528b = VideoChatLiveActionEntityRequest.Action.START;

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: g */
    public void mo211716g() {
        C62580j jVar = this.f157527a;
        if (jVar != null) {
            jVar.mo216351c();
        }
        f157526c = null;
    }

    /* renamed from: k */
    public boolean mo216345k() {
        if (this.f157528b == VideoChatLiveActionEntityRequest.Action.HOST_ACCEPT) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: h */
    public View mo211717h() {
        C62580j jVar = new C62580j(mo211718i(), mo211719j(), this);
        this.f157527a = jVar;
        return jVar.mo216346a();
    }

    private C62577g(Activity activity, C61303k kVar) {
        super(activity, kVar);
    }

    /* renamed from: a */
    private void m244758a(MsgWithUrlInfo bVar, C62580j.AbstractC62589a aVar, VideoChatLiveActionEntityRequest.Action action) {
        this.f157527a.mo216347a(bVar);
        this.f157527a.mo216349a(aVar);
        this.f157527a.mo216348a(action);
        this.f157528b = action;
    }

    /* renamed from: a */
    public static C62577g m244757a(Activity activity, C61303k kVar, MsgWithUrlInfo bVar, C62580j.AbstractC62589a aVar, VideoChatLiveActionEntityRequest.Action action) {
        if (f157526c == null) {
            f157526c = new C62577g(activity, kVar);
        }
        f157526c.m244758a(bVar, aVar, action);
        return f157526c;
    }
}
