package com.ss.android.vc.meeting.model;

import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.entity.MeetingSecuritySetting;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.entity.livestream.LiveInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.p3108b.C61377b;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.vc.meeting.model.c */
public class C61381c {

    /* renamed from: a */
    private C61303k f153822a;

    /* renamed from: b */
    private List<AbstractC61382a> f153823b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private VideoChatInMeetingInfo f153824c;

    /* renamed from: d */
    private boolean f153825d = true;

    /* renamed from: e */
    private C61386f f153826e;

    /* renamed from: f */
    private C61394h f153827f;

    /* renamed from: com.ss.android.vc.meeting.model.c$a */
    public interface AbstractC61382a {

        /* renamed from: com.ss.android.vc.meeting.model.c$a$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            /* JADX WARN: Incorrect args count in method signature: (Ljava/util/List<Lcom/ss/android/vc/entity/LanguageType;>;)V */
            public static void $default$a(AbstractC61382a aVar, List list) {
            }

            public static void $default$a(AbstractC61382a aVar, boolean z) {
            }

            public static void $default$h_(AbstractC61382a aVar, boolean z) {
            }

            public static void $default$onInMeetingInfoUpdate(AbstractC61382a aVar, VideoChatInMeetingInfo videoChatInMeetingInfo) {
            }
        }

        /* renamed from: a */
        void mo212486a(List<LanguageType> list);

        /* renamed from: a */
        void mo212487a(boolean z);

        void h_(boolean z);

        void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo);
    }

    /* renamed from: a */
    public C61386f mo212465a() {
        return this.f153826e;
    }

    /* renamed from: c */
    public VideoChatInMeetingInfo mo212471c() {
        return this.f153824c;
    }

    /* renamed from: b */
    public C61394h mo212469b() {
        return this.f153827f;
    }

    /* renamed from: q */
    public void mo212485q() {
        this.f153823b.clear();
    }

    /* renamed from: d */
    public boolean mo212472d() {
        VideoChatInMeetingInfo videoChatInMeetingInfo = this.f153824c;
        if (videoChatInMeetingInfo != null) {
            return videoChatInMeetingInfo.isShouldPullSuggested();
        }
        return false;
    }

    /* renamed from: e */
    public VideoChat.Type mo212473e() {
        VideoChatInMeetingInfo videoChatInMeetingInfo = this.f153824c;
        if (videoChatInMeetingInfo != null) {
            return videoChatInMeetingInfo.getType();
        }
        return VideoChat.Type.UNKNOWN;
    }

    /* renamed from: f */
    public InMeetingData.ScreenSharedData mo212474f() {
        VideoChatInMeetingInfo videoChatInMeetingInfo = this.f153824c;
        if (videoChatInMeetingInfo != null) {
            return videoChatInMeetingInfo.getScreenSharedData();
        }
        return null;
    }

    /* renamed from: g */
    public String mo212475g() {
        VideoChatInMeetingInfo videoChatInMeetingInfo = this.f153824c;
        if (videoChatInMeetingInfo != null) {
            return videoChatInMeetingInfo.getId();
        }
        return null;
    }

    /* renamed from: i */
    public String mo212477i() {
        VideoChatInMeetingInfo videoChatInMeetingInfo = this.f153824c;
        if (videoChatInMeetingInfo != null) {
            return videoChatInMeetingInfo.getHostId();
        }
        return null;
    }

    /* renamed from: j */
    public String mo212478j() {
        VideoChatInMeetingInfo videoChatInMeetingInfo = this.f153824c;
        if (videoChatInMeetingInfo != null) {
            return videoChatInMeetingInfo.getHostDeviceId();
        }
        return null;
    }

    /* renamed from: k */
    public ParticipantType mo212479k() {
        VideoChatInMeetingInfo videoChatInMeetingInfo = this.f153824c;
        if (videoChatInMeetingInfo != null) {
            return videoChatInMeetingInfo.getHostType();
        }
        return null;
    }

    /* renamed from: l */
    public FollowInfo mo212480l() {
        VideoChatInMeetingInfo videoChatInMeetingInfo = this.f153824c;
        if (videoChatInMeetingInfo != null) {
            return videoChatInMeetingInfo.getFollowInfo();
        }
        return null;
    }

    /* renamed from: n */
    public boolean mo212482n() {
        VideoChatInMeetingInfo videoChatInMeetingInfo = this.f153824c;
        if (videoChatInMeetingInfo != null) {
            return videoChatInMeetingInfo.isRecording();
        }
        return false;
    }

    /* renamed from: o */
    public boolean mo212483o() {
        VideoChatInMeetingInfo videoChatInMeetingInfo = this.f153824c;
        if (videoChatInMeetingInfo != null) {
            return videoChatInMeetingInfo.isSubtitleOn();
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo212476h() {
        return ParticipantUtil.m248722a(mo212477i(), mo212479k(), mo212478j());
    }

    /* renamed from: m */
    public LiveInfo mo212481m() {
        VideoChatInMeetingInfo videoChatInMeetingInfo = this.f153824c;
        if (videoChatInMeetingInfo == null || videoChatInMeetingInfo.getLiveInfo() == null) {
            return null;
        }
        return this.f153824c.getLiveInfo();
    }

    /* renamed from: p */
    public void mo212484p() {
        for (AbstractC61382a aVar : this.f153823b) {
            aVar.onInMeetingInfoUpdate(this.f153824c);
        }
    }

    /* renamed from: s */
    private boolean m239205s() {
        C61303k kVar;
        boolean z;
        boolean z2;
        if (this.f153824c == null || (kVar = this.f153822a) == null) {
            return false;
        }
        if (kVar.mo212056e().getVideoChatSettings() != null) {
            z = this.f153822a.mo212056e().getVideoChatSettings().isMeetingOpenInterpretation();
        } else {
            z = false;
        }
        if (this.f153824c.getVideoChatSettings() != null) {
            z2 = this.f153824c.getVideoChatSettings().isMeetingOpenInterpretation();
        } else {
            z2 = false;
        }
        if (z != z2) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    private void m239208v() {
        for (AbstractC61382a aVar : this.f153823b) {
            List<LanguageType> list = null;
            if (!(this.f153822a.mo212056e() == null || this.f153822a.mo212056e().getVideoChatSettings() == null)) {
                list = this.f153822a.mo212056e().getVideoChatSettings().getMeetingSupportLanguages();
            }
            aVar.mo212486a(list);
        }
    }

    /* renamed from: r */
    private boolean m239204r() {
        C61303k kVar;
        Participant j;
        boolean z;
        boolean z2;
        if (this.f153824c == null || (kVar = this.f153822a) == null || (j = kVar.mo212091I().mo212494b().mo212605j()) == null || !j.isHostOrCoHost()) {
            return false;
        }
        if (this.f153822a.mo212056e().getVideoChatSettings() == null || this.f153822a.mo212056e().getVideoChatSettings().getSecuritySetting() == null) {
            z = false;
        } else {
            z = this.f153822a.mo212056e().getVideoChatSettings().getSecuritySetting().isEnableLobby();
        }
        if (this.f153824c.getVideoChatSettings() == null || this.f153824c.getVideoChatSettings().getSecuritySetting() == null) {
            z2 = false;
        } else {
            z2 = this.f153824c.getVideoChatSettings().getSecuritySetting().isEnableLobby();
        }
        if (z != z2) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private boolean m239207u() {
        C61303k kVar;
        boolean z;
        if (this.f153824c == null || (kVar = this.f153822a) == null) {
            return false;
        }
        List<LanguageType> list = null;
        List<LanguageType> meetingSupportLanguages = kVar.mo212056e().getVideoChatSettings() != null ? this.f153822a.mo212056e().getVideoChatSettings().getMeetingSupportLanguages() : null;
        if (this.f153824c.getVideoChatSettings() != null) {
            list = this.f153824c.getVideoChatSettings().getMeetingSupportLanguages();
        }
        if (meetingSupportLanguages == null || list == null) {
            return false;
        }
        if (meetingSupportLanguages.size() != list.size()) {
            return true;
        }
        for (LanguageType languageType : meetingSupportLanguages) {
            Iterator<LanguageType> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (TextUtils.equals(languageType.languageType, it.next().languageType)) {
                        z = true;
                        continue;
                        break;
                    }
                } else {
                    z = false;
                    continue;
                    break;
                }
            }
            if (!z) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: t */
    private boolean m239206t() {
        boolean z;
        boolean z2 = false;
        if (this.f153824c == null || this.f153822a == null) {
            return false;
        }
        boolean h = mo212476h();
        Participant j = this.f153822a.mo212091I().mo212494b().mo212605j();
        if (j == null || !j.isCoHost()) {
            z = false;
        } else {
            z = true;
        }
        if (!h && !z) {
            return false;
        }
        MeetingSecuritySetting.SecurityLevel securityLevel = MeetingSecuritySetting.SecurityLevel.PUBLIC;
        if (!(this.f153822a.mo212056e().getVideoChatSettings() == null || this.f153822a.mo212056e().getVideoChatSettings().getSecuritySetting() == null)) {
            securityLevel = this.f153822a.mo212056e().getVideoChatSettings().getSecuritySetting().getSecurityLevel();
        }
        MeetingSecuritySetting.SecurityLevel securityLevel2 = MeetingSecuritySetting.SecurityLevel.PUBLIC;
        if (!(this.f153824c.getVideoChatSettings() == null || this.f153824c.getVideoChatSettings().getSecuritySetting() == null)) {
            securityLevel2 = this.f153824c.getVideoChatSettings().getSecuritySetting().getSecurityLevel();
        }
        if (securityLevel2 != securityLevel) {
            z2 = true;
        }
        if (z2 || securityLevel2 != MeetingSecuritySetting.SecurityLevel.CONTACTS_AND_GROUP) {
            return z2;
        }
        return !m239201a(this.f153822a.mo212056e().getVideoChatSettings().getSecuritySetting(), this.f153824c.getVideoChatSettings().getSecuritySetting());
    }

    /* renamed from: b */
    private void m239202b(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        this.f153824c = videoChatInMeetingInfo;
    }

    /* renamed from: b */
    public void mo212470b(AbstractC61382a aVar) {
        if (this.f153823b.contains(aVar)) {
            this.f153823b.remove(aVar);
        }
    }

    public C61381c(C61303k kVar) {
        this.f153822a = kVar;
        this.f153826e = new C61386f(kVar);
        this.f153827f = new C61394h(kVar);
    }

    /* renamed from: a */
    private void m239199a(boolean z) {
        for (AbstractC61382a aVar : this.f153823b) {
            aVar.mo212487a(z);
        }
    }

    /* renamed from: b */
    private void m239203b(boolean z) {
        for (AbstractC61382a aVar : this.f153823b) {
            aVar.h_(z);
        }
    }

    /* renamed from: a */
    public void mo212468a(AbstractC61382a aVar) {
        if (!this.f153823b.contains(aVar)) {
            C61377b.m239188a(aVar, this.f153823b);
            this.f153823b.add(aVar);
        }
    }

    /* renamed from: a */
    public void mo212466a(VideoChat videoChat) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("inMeetingInfo is null : ");
        if (this.f153824c != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C60700b.m235851b("InMeetingInfoData", "[initInMeetingInfo]", sb.toString());
        if (this.f153824c != null) {
            return;
        }
        if (videoChat == null || TextUtils.isEmpty(videoChat.getId())) {
            throw new IllegalArgumentException("videoChat can not be null");
        }
        C60700b.m235851b("InMeetingInfoData", "[initInMeetingInfo2]", "init inMeetingInfo , videoChat = " + videoChat.toString());
        VideoChatInMeetingInfo videoChatInMeetingInfo = new VideoChatInMeetingInfo();
        this.f153824c = videoChatInMeetingInfo;
        videoChatInMeetingInfo.setId(videoChat.getId());
        this.f153824c.setHostId(videoChat.getHostId());
        this.f153824c.setHostDeviceId(videoChat.getHostDeviceId());
        this.f153824c.setHostType(videoChat.getHostType());
        this.f153824c.setVideoChatSettings(videoChat.getVideoChatSettings());
        this.f153824c.setType(videoChat.getType());
    }

    /* renamed from: a */
    public void mo212467a(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        C61303k kVar;
        this.f153826e.mo212583a(this.f153824c, videoChatInMeetingInfo);
        this.f153827f.mo212626a(this.f153824c, videoChatInMeetingInfo);
        if (this.f153825d) {
            this.f153825d = false;
            String string = C57744a.m224104a().getString("vc_sp_key_recovery_meeting_id", "");
            C53241h.m205899c("InMeetingInfoData", "[updateCombinedInfo][MuteOnEntry] recoveryMeetingId: " + string + ", pushId:" + this.f153822a.mo212055d());
            if (!TextUtils.equals(string, this.f153822a.mo212055d())) {
                VideoChatSettings videoChatSettings = videoChatInMeetingInfo.getVideoChatSettings();
                if (!ParticipantUtil.m248722a(videoChatInMeetingInfo.getHostId(), videoChatInMeetingInfo.getHostType(), videoChatInMeetingInfo.getHostDeviceId()) && videoChatSettings != null && videoChatSettings.isMuteOnEntry()) {
                    C60738ac.m236037c((int) R.string.View_M_HostMutedYourMic);
                }
            }
        }
        m239202b(videoChatInMeetingInfo);
        boolean t = m239206t();
        boolean r = m239204r();
        boolean s = m239205s();
        boolean u = m239207u();
        if (!(this.f153824c.getVideoChatSettings() == null || this.f153824c.getVideoChatSettings().getAllowPartiUnMute() || this.f153822a.mo212056e() == null || this.f153822a.mo212056e().getVideoChatSettings() == null || !this.f153822a.mo212056e().getVideoChatSettings().getAllowPartiUnMute())) {
            m239199a(false);
        }
        VideoChatInMeetingInfo videoChatInMeetingInfo2 = this.f153824c;
        if (!(videoChatInMeetingInfo2 == null || videoChatInMeetingInfo2.getId() == null || (kVar = this.f153822a) == null || kVar.mo212056e() == null)) {
            this.f153822a.mo212056e().setVideoChatSettings(this.f153824c.getVideoChatSettings());
            this.f153822a.mo212056e().setHostId(this.f153824c.getHostId());
            this.f153822a.mo212056e().setHostDeviceId(this.f153824c.getHostDeviceId());
            this.f153822a.mo212056e().setMeetingUrl(this.f153824c.getMeetingUrl());
            this.f153822a.mo212056e().setHostType(this.f153824c.getHostType());
            this.f153822a.mo212056e().setType(this.f153824c.getType());
        }
        if (t) {
            this.f153822a.mo212161u().mo214259a(this.f153824c.getVideoChatSettings().getSecuritySetting());
        }
        if (r) {
            this.f153822a.mo212161u().mo214269c();
        }
        if (s) {
            m239203b(this.f153824c.getVideoChatSettings().isMeetingOpenInterpretation());
        }
        if (u) {
            m239208v();
        }
        this.f153822a.mo212091I().mo212494b().mo212608m();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m239200a(MeetingSecuritySetting.SpecialGroupType specialGroupType, MeetingSecuritySetting.SpecialGroupType specialGroupType2) {
        if (specialGroupType.getNumber() == specialGroupType2.getNumber()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m239201a(MeetingSecuritySetting meetingSecuritySetting, MeetingSecuritySetting meetingSecuritySetting2) {
        if (!C60742af.m236060a((List) meetingSecuritySetting.getUserIds(), (List) meetingSecuritySetting2.getUserIds()) || !C60742af.m236060a((List) meetingSecuritySetting.getGroupIds(), (List) meetingSecuritySetting2.getGroupIds()) || !C60742af.m236060a((List) meetingSecuritySetting.getRoomIds(), (List) meetingSecuritySetting2.getRoomIds()) || !C60742af.m236061a((List) meetingSecuritySetting.getSpecialGroupTypes(), (List) meetingSecuritySetting2.getSpecialGroupTypes(), (C60742af.AbstractC60743a) $$Lambda$c$Z4Ffj_tCZrZSQy_VWxrhSJK86Ns.INSTANCE)) {
            return false;
        }
        return true;
    }
}
