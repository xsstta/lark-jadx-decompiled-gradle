package com.ss.android.vc.meeting.module.subtitle.widget;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.subtitle.SubtitleSettingFrame;
import com.ss.android.vc.statistics.event.bx;

/* renamed from: com.ss.android.vc.meeting.module.subtitle.widget.c */
public class C63213c extends MeetingBaseDesktopDialog implements AbstractC61222a {

    /* renamed from: a */
    private SubtitleSettingFrame f159386a;

    /* renamed from: b */
    private String f159387b;

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: g */
    public void mo211716g() {
        SubtitleSettingFrame subtitleSettingFrame = this.f159386a;
        if (subtitleSettingFrame != null) {
            subtitleSettingFrame.mo218538a();
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.MeetingBaseDesktopDialog
    /* renamed from: h */
    public View mo211717h() {
        this.f159386a = new SubtitleSettingFrame(mo211718i());
        m247557k();
        return this.f159386a;
    }

    /* renamed from: k */
    private void m247557k() {
        Participant j = mo211719j().mo212091I().mo212494b().mo212605j();
        if (!(j == null || j.getParticipantSettings() == null)) {
            ParticipantSettings participantSettings = j.getParticipantSettings();
            this.f159386a.mo218539a(mo211719j(), participantSettings.getSpokenLanguage(), participantSettings.getSubtitleLanguage(), this.f159387b);
            bx.m250225a(3, mo211719j().mo212056e());
        }
        this.f159386a.setParentDialog(this);
    }

    public C63213c(Activity activity, C61303k kVar, String str) {
        super(activity, kVar);
        this.f159387b = str;
    }
}
