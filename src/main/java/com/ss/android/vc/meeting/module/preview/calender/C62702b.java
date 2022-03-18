package com.ss.android.vc.meeting.module.preview.calender;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.MeetingConfig;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.request.JoinCalendarGroupMeetingEntityRequest;
import com.ss.android.vc.entity.response.IDTypeEntity;
import com.ss.android.vc.entity.response.JoinCalendarGroupMeetingEntity;
import com.ss.android.vc.meeting.module.preview.AbstractC62710d;
import com.ss.android.vc.meeting.module.preview.calender.C62697a;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.request.VcBizTask;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vc.statistics.event.C63736af;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vc.trace.VCLauncherStatistics;
import java.util.Collections;

/* renamed from: com.ss.android.vc.meeting.module.preview.calender.b */
public class C62702b extends AbstractC62710d<C62697a.AbstractC62698a.AbstractC62699a> implements C62697a.AbstractC62698a {

    /* renamed from: d */
    String f157778d;

    /* renamed from: e */
    String f157779e;

    /* renamed from: f */
    String f157780f;

    /* renamed from: g */
    JoinCalendarGroupMeetingEntityRequest.EntrySource f157781g;

    @Override // com.ss.android.vc.meeting.module.preview.calender.C62697a.AbstractC62698a
    /* renamed from: e */
    public String mo216646e() {
        return this.f157778d;
    }

    @Override // com.ss.android.vc.meeting.module.preview.calender.C62697a.AbstractC62698a
    public void n_(boolean z) {
        mo216660a(this.f157778d, IDTypeEntity.UNIQUE_ID, z);
    }

    @Override // com.ss.android.vc.meeting.module.preview.calender.C62697a.AbstractC62698a
    /* renamed from: a */
    public void mo216644a(AbstractC63598b<JoinCalendarGroupMeetingEntity> bVar) {
        VCLauncherStatistics.m250421a();
        C63693e.m249686c();
        C63736af.m250002b(((C62697a.AbstractC62698a.AbstractC62699a) this.f157788a).mo216523g(), this.f157778d, ((C62697a.AbstractC62698a.AbstractC62699a) this.f157788a).mo216524h(), m245296a(this.f157781g, this.f157778d, ParticipantType.LARK_USER, false, bVar));
    }

    @Override // com.ss.android.vc.meeting.module.preview.calender.C62697a.AbstractC62698a
    /* renamed from: b */
    public void mo216645b(AbstractC63598b bVar) {
        MeetingConfig meetingConfig = new MeetingConfig();
        meetingConfig.isAudioOn = ((C62697a.AbstractC62698a.AbstractC62699a) this.f157788a).mo216517a();
        meetingConfig.isCameraOn = ((C62697a.AbstractC62698a.AbstractC62699a) this.f157788a).mo216518b();
        meetingConfig.isSpeakerOn = this.f157789b.mo212721z();
        meetingConfig.isFrontCamera = ((C62697a.AbstractC62698a.AbstractC62699a) this.f157788a).mo216519c();
        meetingConfig.isPlaybackDigitalMute = ((C62697a.AbstractC62698a.AbstractC62699a) this.f157788a).mo216520d();
        VideoChatService.m249602d().gotoVideoMeeting(Collections.emptyList(), this.f157779e, true, this.f157780f, false, meetingConfig, bVar, ((C62697a.AbstractC62698a.AbstractC62699a) this.f157788a).mo216524h(), ((C62697a.AbstractC62698a.AbstractC62699a) this.f157788a).mo216523g());
    }

    /* renamed from: a */
    private String m245296a(JoinCalendarGroupMeetingEntityRequest.EntrySource entrySource, String str, ParticipantType participantType, boolean z, AbstractC63598b<JoinCalendarGroupMeetingEntity> bVar) {
        ParticipantSettings participantSettings = new ParticipantSettings();
        participantSettings.setCameraMuted(!((C62697a.AbstractC62698a.AbstractC62699a) this.f157788a).mo216518b());
        participantSettings.setMicrophoneMuted(!((C62697a.AbstractC62698a.AbstractC62699a) this.f157788a).mo216517a());
        participantSettings.setCameraStatus(ParticipantSettings.EquipmentStatus.UNKNOWN);
        participantSettings.setMicrophoneStatus(ParticipantSettings.EquipmentStatus.UNKNOWN);
        C60700b.m235851b("MeetingPreviewCalendarModel", "[sendJoinMeetingRequest]", "source = " + entrySource + ", uniqueId = " + str + ", type = " + participantType + ", settings = " + participantSettings + ", force = " + z);
        VcBizTask<JoinCalendarGroupMeetingEntity> a = VcBizSender.m249151a(this.f157781g, this.f157778d, ParticipantType.LARK_USER, participantSettings, z);
        a.mo219889a(bVar);
        return a.mo219895c();
    }
}
