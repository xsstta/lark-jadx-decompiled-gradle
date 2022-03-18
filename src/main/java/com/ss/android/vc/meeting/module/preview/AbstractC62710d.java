package com.ss.android.vc.meeting.module.preview;

import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.MeetingConfig;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.response.C60978l;
import com.ss.android.vc.entity.response.IDTypeEntity;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.framework.manager.p3106a.C61273c;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.meeting.module.audio.C61410c;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.lobby.pb.C62149b;
import com.ss.android.vc.meeting.module.preview.AbstractC62650a;
import com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a;
import com.ss.android.vc.meeting.module.receiver.AudioReceiverHolder;
import com.ss.android.vc.meeting.utils.C63492g;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.meeting.utils.TimeConsumeUtils;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.p3069b.p3072c.C60675a;
import com.ss.android.vc.service.VideoChatManager;
import com.ss.android.vc.statistics.event.C63739ai;
import com.ss.android.vc.statistics.event.bp;
import io.reactivex.p3457e.C68296b;
import java.util.HashMap;

/* renamed from: com.ss.android.vc.meeting.module.preview.d */
public abstract class AbstractC62710d<MD extends AbstractC62650a.AbstractC62651a.AbstractC62652a> implements MeetingAudioManager.AbstractC61403a, AbstractC62650a.AbstractC62651a<MD> {

    /* renamed from: a */
    protected MD f157788a;

    /* renamed from: b */
    protected MeetingAudioManager f157789b;

    /* renamed from: c */
    protected VideoChatSettings f157790c;

    /* renamed from: d */
    private boolean f157791d;

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a
    /* renamed from: b */
    public MeetingAudioManager mo216510b() {
        return this.f157789b;
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a
    /* renamed from: d */
    public boolean mo216512d() {
        return this.f157791d;
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioMuted() {
        this.f157788a.mo216522f();
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a
    /* renamed from: a */
    public void mo216505a() {
        VideoChatModuleDependency.getChatDependency().getLoginChatter(new MeetingPreviewBaseModel$1(this));
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a
    /* renamed from: c */
    public boolean mo216511c() {
        VideoChatSettings videoChatSettings = this.f157790c;
        if (videoChatSettings == null || !videoChatSettings.isMuteOnEntry()) {
            return false;
        }
        return true;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f157789b.mo212693b(this);
        this.f157789b.mo212715t();
        AudioReceiverHolder.f158409a.mo217328b(this.f157789b);
    }

    public MeetingConfig bT_() {
        MeetingConfig meetingConfig = new MeetingConfig();
        meetingConfig.isAudioOn = this.f157788a.mo216517a();
        meetingConfig.isCameraOn = this.f157788a.mo216518b();
        meetingConfig.isSpeakerOn = mo216510b().mo212721z();
        meetingConfig.isFrontCamera = this.f157788a.mo216519c();
        meetingConfig.isPlaybackDigitalMute = this.f157788a.mo216520d();
        return meetingConfig;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingPreviewBaseModel:create");
        this.f157789b = new C61410c();
        AudioReceiverHolder.f158409a.mo217325a(this.f157789b);
        this.f157789b.mo212685a(this);
        mo216616b(false);
        TimeConsumeUtils.m248928a(a);
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a
    /* renamed from: a */
    public void mo216508a(MD md) {
        this.f157788a = md;
    }

    /* renamed from: b */
    public void mo216616b(boolean z) {
        this.f157789b.mo212694b(z);
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a
    /* renamed from: a */
    public void mo216509a(boolean z) {
        this.f157791d = z;
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a
    /* renamed from: a */
    public void mo216506a(VideoChat videoChat) {
        Participant c;
        if (videoChat != null) {
            String id = videoChat.getId();
            String c2 = MeetingUtil.m238372c(videoChat);
            AbstractC61294b meeting = MeetingManager.m238341a().getMeeting(id);
            if (meeting == null || meeting.mo212062k()) {
                MeetingManager.m238341a().mo211897d().mo211952b(id, c2);
            }
        }
        if (videoChat == null || (c = ParticipantUtil.m248731c(videoChat.getParticipants())) == null || c.getParticipantSettings() == null) {
            C63492g.m248822a(false, (Boolean) true, 1000L);
        } else {
            C63492g.m248822a(false, Boolean.valueOf(c.getParticipantSettings().isPlayMeetingTone()), 1000L);
        }
        MeetingConfig bT_ = bT_();
        videoChat.setMeetingConfig(bT_);
        VideoChatManager.m249444a().mo220115a(!bT_.isCameraOn);
        VideoChatManager.m249444a().mo220118b(!bT_.isAudioOn);
        VideoChatManager.m249444a().mo220113a(Boolean.valueOf(!bT_.isSpeakerOn));
        VideoChatManager.m249444a().mo220117b(Boolean.valueOf(bT_.isFrontCamera));
        VideoChatManager.m249444a().mo220121c(bT_.isPlaybackDigitalMute);
        VideoChatManager.m249444a().mo220126e((Boolean) true);
        VideoChatManager.m249444a().mo220105a(videoChat);
        C63739ai.m250012a(videoChat, this.f157788a.mo216524h());
        C60675a.m235774e().mo208234a();
        mo216509a(true);
    }

    /* renamed from: a */
    public void mo216659a(String str, IDTypeEntity iDTypeEntity) {
        mo216660a(str, iDTypeEntity, false);
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a
    /* renamed from: a */
    public void mo216507a(VideoChat videoChat, C62149b bVar) {
        VideoChatManager.m249444a().mo220115a(!this.f157788a.mo216518b());
        VideoChatManager.m249444a().mo220118b(!this.f157788a.mo216517a());
        VideoChatManager.m249444a().mo220113a(Boolean.valueOf(!mo216510b().mo212721z()));
        VideoChatManager.m249444a().mo220117b(Boolean.valueOf(this.f157788a.mo216519c()));
        VideoChatManager.m249444a().mo220121c(this.f157788a.mo216520d());
        VideoChatManager.m249444a().mo220126e((Boolean) true);
        C61273c.m238400a(videoChat, bVar);
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioStateUnchanged(MeetingAudioManager.AudioType audioType, boolean z, boolean z2) {
        if (z2) {
            bp.m250206b(audioType, z, null);
        }
    }

    /* renamed from: a */
    public void mo216660a(String str, final IDTypeEntity iDTypeEntity, boolean z) {
        VcBizSender.m249175a(str, iDTypeEntity, z).mo219889a(new AbstractC63598b<C60978l>() {
            /* class com.ss.android.vc.meeting.module.preview.AbstractC62710d.C627111 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
            }

            /* renamed from: a */
            public void onSuccess(C60978l lVar) {
                String str;
                if (lVar == null || lVar.f152696a == null || lVar.f152696a.size() <= 0) {
                    AbstractC62710d.this.f157788a.mo216521e();
                } else {
                    VideoChat videoChat = lVar.f152696a.get(0);
                    AbstractC62710d.this.f157790c = videoChat.getVideoChatSettings();
                    AbstractC62710d.this.f157788a.mo216514a(videoChat);
                }
                if (lVar != null && !TextUtils.isEmpty(lVar.f152699d)) {
                    if (iDTypeEntity == IDTypeEntity.INTERVIEW_UID) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("name", lVar.f152699d);
                        str = UIHelper.mustacheFormat(ar.m236694a().getResources().getString(R.string.View_M_VideoInterviewNameBraces), hashMap);
                    } else {
                        str = lVar.f152699d;
                    }
                    AbstractC62710d.this.f157788a.mo216516a(str);
                }
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioStateChanged(MeetingAudioManager.AudioType audioType, boolean z, boolean z2) {
        boolean z3 = this.f157789b.mo212721z();
        MeetingAudioManager.AudioType y = this.f157789b.mo212720y();
        this.f157788a.mo216515a(audioType, z, y, z3, z2, this.f157789b.mo212719x());
        if (z2) {
            bp.m250203a(audioType, z, y, z3, null);
        }
    }
}
