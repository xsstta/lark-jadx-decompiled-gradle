package com.ss.android.vc.meeting.module.subtitle.widget;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.subtitle.SubtitleSettingFrame;
import com.ss.android.vc.statistics.event.bx;

/* renamed from: com.ss.android.vc.meeting.module.subtitle.widget.d */
public class C63214d extends AbstractView$OnAttachStateChangeListenerC61215b {

    /* renamed from: d */
    private SubtitleSettingFrame f159388d;

    /* renamed from: e */
    private int f159389e = -1;

    /* renamed from: f */
    private String f159390f;

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public void mo211634b(boolean z) {
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
        m247561l();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: i */
    public void mo211642i() {
        super.mo211642i();
        mo211633b(this.f159389e);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: j */
    public void mo211643j() {
        super.mo211643j();
        SubtitleSettingFrame subtitleSettingFrame = this.f159388d;
        if (subtitleSettingFrame != null) {
            subtitleSettingFrame.mo218538a();
        }
    }

    /* renamed from: l */
    private void m247561l() {
        if (bL_() != null) {
            this.f159389e = bL_().getWindow().getStatusBarColor();
            bM_();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: k */
    private void m247560k() {
        Participant j = this.f153299a.mo212091I().mo212494b().mo212605j();
        if (!(j == null || j.getParticipantSettings() == null)) {
            ParticipantSettings participantSettings = j.getParticipantSettings();
            this.f159388d.mo218539a(this.f153299a, participantSettings.getSpokenLanguage(), participantSettings.getSubtitleLanguage(), this.f159390f);
            bx.m250225a(3, this.f153299a.mo212056e());
        }
        this.f159388d.setParentDialog(this);
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractView$OnAttachStateChangeListenerC61215b
    /* renamed from: b */
    public View mo211632b(Activity activity) {
        this.f159388d = new SubtitleSettingFrame(activity);
        m247560k();
        return this.f159388d;
    }

    public C63214d(Activity activity, C61303k kVar, Boolean bool, String str) {
        super(activity, kVar, bool, true);
        this.f159390f = str;
    }
}
