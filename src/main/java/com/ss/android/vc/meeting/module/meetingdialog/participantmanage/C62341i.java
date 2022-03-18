package com.ss.android.vc.meeting.module.meetingdialog.participantmanage;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61298f;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.utils.ParticipantUtil;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.i */
public class C62341i extends AbstractView$OnAttachStateChangeListenerC61219a implements AbstractC61298f {

    /* renamed from: h */
    protected boolean f156686h;

    /* renamed from: i */
    protected Participant f156687i;

    /* renamed from: j */
    private int f156688j;

    /* renamed from: k */
    private View$OnClickListenerC62342j f156689k;

    /* renamed from: p */
    private void m243558p() {
    }

    /* renamed from: q */
    private void m243559q() {
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: a */
    public void mo211671a(boolean z) {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: k */
    public int mo211682k() {
        return 0;
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    public void dismiss() {
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: i */
    public void mo211680i() {
        m243559q();
    }

    /* renamed from: r */
    private void m243560r() {
        if (this.f153319b != null) {
            this.f153319b.mo212112a(this);
        }
    }

    /* renamed from: s */
    private void m243561s() {
        if (this.f153319b != null) {
            this.f153319b.mo212152b(this);
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: j */
    public void mo211681j() {
        this.f156689k.mo215595b();
        m243561s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public View$OnClickListenerC62342j mo215590o() {
        return new View$OnClickListenerC62342j((FragmentActivity) this.f153318a, this.f153319b, this);
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
        m243558p();
        m243560r();
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: a */
    public View mo211669a(Activity activity) {
        View$OnClickListenerC62342j o = mo215590o();
        this.f156689k = o;
        return o.mo215591a();
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61298f
    public void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        if (this.f153319b != null && this.f153319b.mo212091I().mo212494b() != null && this.f156687i != null) {
            Participant a = this.f153319b.mo212091I().mo212494b().mo212589a(this.f156687i.getId(), this.f156687i.getParticipantType(), this.f156687i.getDeviceId());
            if (a == null) {
                C60700b.m235864f("ParticipantControlDialog", "[onInMeetingInfoUpdate]", "participant has left..." + this.f156687i.getRtcJoinId());
                dismiss();
            }
            this.f156687i = a;
        }
    }

    public C62341i(Activity activity, Participant participant, C61303k kVar, AbstractC62329f fVar) {
        super(activity, kVar);
        this.f156688j = -10;
        participant = ParticipantUtil.m248732c(participant) ? kVar.mo212091I().mo212494b().mo212605j() : participant;
        this.f156687i = participant;
        this.f156689k.mo215592a(participant, fVar);
    }

    public C62341i(Activity activity, Participant participant, C61303k kVar, AbstractC62329f fVar, boolean z) {
        this(activity, participant, kVar, fVar);
        this.f156686h = z;
    }
}
