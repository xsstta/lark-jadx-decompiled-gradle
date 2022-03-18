package com.ss.android.vc.meeting.module.preview.launch;

import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.entity.MeetingConfig;
import com.ss.android.vc.entity.response.JoinMeetingEntity;
import com.ss.android.vc.meeting.module.preview.AbstractC62710d;
import com.ss.android.vc.meeting.module.preview.launch.C62760a;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.p3069b.p3072c.C60675a;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XProcess;
import java.util.Collections;

@XClass(runOnProcess = XProcess.VC)
public class MeetingPreviewLaunchModel extends AbstractC62710d<C62760a.AbstractC62761a.AbstractC62762a> implements C62760a.AbstractC62761a {

    /* renamed from: d */
    String f157898d;

    /* renamed from: e */
    String f157899e;

    @Override // com.ss.android.vc.meeting.module.preview.launch.C62760a.AbstractC62761a
    /* renamed from: e */
    public String mo216761e() {
        String str = "";
        if (TextUtils.isEmpty(this.f157898d) || this.f157898d.equals("0")) {
            if (!TextUtils.isEmpty(this.f157899e)) {
                str = this.f157899e;
            }
            return UIHelper.mustacheFormat((int) R.string.View_M_DefaultTopicCallerNameBraces, "callerName", str);
        }
        if (!TextUtils.isEmpty(this.f157899e)) {
            str = this.f157899e;
        }
        return UIHelper.mustacheFormat((int) R.string.View_M_MeetingInGroupNameBraces, "groupName", str);
    }

    @Override // com.ss.android.vc.meeting.module.preview.launch.C62760a.AbstractC62761a
    /* renamed from: a */
    public void mo216760a(String str) {
        this.f157899e = str;
    }

    @Override // com.ss.android.vc.meeting.module.preview.launch.C62760a.AbstractC62761a
    /* renamed from: a */
    public void mo216759a(AbstractC63598b<JoinMeetingEntity> bVar) {
        String i = ((C62760a.AbstractC62761a.AbstractC62762a) this.f157788a).mo216764i();
        MeetingConfig meetingConfig = new MeetingConfig();
        meetingConfig.isAudioOn = ((C62760a.AbstractC62761a.AbstractC62762a) this.f157788a).mo216517a();
        meetingConfig.isCameraOn = ((C62760a.AbstractC62761a.AbstractC62762a) this.f157788a).mo216518b();
        meetingConfig.isSpeakerOn = this.f157789b.mo212721z();
        meetingConfig.isFrontCamera = ((C62760a.AbstractC62761a.AbstractC62762a) this.f157788a).mo216519c();
        meetingConfig.isPlaybackDigitalMute = ((C62760a.AbstractC62761a.AbstractC62762a) this.f157788a).mo216520d();
        VideoChatService.m249602d().gotoVideoMeeting(Collections.emptyList(), this.f157898d, true, i, !(!mo216761e().equals(i)), meetingConfig, bVar, ((C62760a.AbstractC62761a.AbstractC62762a) this.f157788a).mo216524h(), ((C62760a.AbstractC62761a.AbstractC62762a) this.f157788a).mo216523g());
        C60675a.m235774e().mo208234a();
    }
}
