package com.ss.android.vc.meeting.module.subtitle;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.MeetingSubtitleData;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.response.C60987v;
import com.ss.android.vc.lark.setting.C61188b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.admin.VideoChatAdminSettings;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.statistics.event.C63751by;
import com.ss.android.vc.statistics.event.MeetingChargingEvent;
import com.ss.android.vc.statistics.event.bz;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.vc.meeting.module.subtitle.m */
public class C63167m extends AbstractC63121a {

    /* renamed from: c */
    private C63171a f159181c = new C63171a();

    /* renamed from: d */
    private final List<AbstractC63157e> f159182d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private InMeetingData.SubtitleStatusData.Status f159183e = InMeetingData.SubtitleStatusData.Status.STATUS_UNKNOWN;

    /* renamed from: f */
    private LruCache<String, LruCache<String, Long>> f159184f = new LruCache<>(50);

    /* renamed from: g */
    private boolean f159185g = false;

    /* renamed from: h */
    private boolean f159186h = false;

    /* renamed from: i */
    private Runnable f159187i = new Runnable() {
        /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$m$iCo_39qhc9d0m7cleFvxGuy6I */

        public final void run() {
            C63167m.this.m247337l();
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.subtitle.m$a */
    public static class C63171a {

        /* renamed from: a */
        private List<MeetingSubtitleData> f159192a;

        /* renamed from: b */
        private C60742af.AbstractC60743a<MeetingSubtitleData> f159193b;

        /* renamed from: b */
        public List<MeetingSubtitleData> mo218656b() {
            return this.f159192a;
        }

        /* renamed from: a */
        public void mo218654a() {
            this.f159192a.clear();
        }

        private C63171a() {
            this.f159192a = new CopyOnWriteArrayList();
            this.f159193b = $$Lambda$m$a$Mfn5QRsaLglA5XXU1Nt_JedrwFU.INSTANCE;
        }

        /* renamed from: a */
        public void mo218655a(MeetingSubtitleData meetingSubtitleData) {
            int b = C60742af.m236062b(this.f159192a, meetingSubtitleData, this.f159193b);
            if (b < 0) {
                if (meetingSubtitleData.mSoundType != MeetingSubtitleData.SoundType.NOISE) {
                    if (this.f159192a.size() >= 3) {
                        this.f159192a.remove(0);
                    }
                    this.f159192a.add(meetingSubtitleData);
                }
            } else if (meetingSubtitleData.mSoundType == MeetingSubtitleData.SoundType.NOISE) {
                this.f159192a.remove(b);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ boolean m247363a(MeetingSubtitleData meetingSubtitleData, MeetingSubtitleData meetingSubtitleData2) {
            if (meetingSubtitleData.mSeqId == meetingSubtitleData2.mSeqId) {
                return true;
            }
            return false;
        }
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63121a
    /* renamed from: d */
    public InMeetingData.SubtitleStatusData.Status mo218564d() {
        return this.f159183e;
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63121a
    /* renamed from: f */
    public boolean mo218569f() {
        return this.f159186h;
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63121a
    /* renamed from: c */
    public boolean mo218563c() {
        return this.f159185g;
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63121a
    /* renamed from: e */
    public List<MeetingSubtitleData> mo218566e() {
        return this.f159181c.mo218656b();
    }

    /* renamed from: j */
    public void mo218650j() {
        this.f159182d.clear();
    }

    /* renamed from: k */
    private void m247336k() {
        this.f159181c.mo218654a();
        this.f159184f.evictAll();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m247337l() {
        this.f159181c.mo218654a();
        for (AbstractC63157e eVar : this.f159182d) {
            if (eVar != null) {
                eVar.mo218628g();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63121a
    /* renamed from: b */
    public boolean mo218561b() {
        return this.f159071a;
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63157e
    /* renamed from: g */
    public void mo218628g() {
        m247336k();
        for (AbstractC63157e eVar : this.f159182d) {
            if (eVar != null) {
                eVar.mo218628g();
            }
        }
    }

    /* renamed from: i */
    public boolean mo218649i() {
        if (!C63634c.m249496b("byteview.asr.subtitle") || !VideoChatAdminSettings.m239417e()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63157e
    /* renamed from: h */
    public void mo218630h() {
        for (AbstractC63157e eVar : this.f159182d) {
            if (eVar != null) {
                eVar.mo218630h();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63121a
    /* renamed from: b */
    public void mo218560b(boolean z) {
        this.f159071a = z;
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63121a
    /* renamed from: c */
    public void mo218562c(boolean z) {
        this.f159185g = z;
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63121a
    /* renamed from: a */
    public void mo218556a(AbstractC63157e eVar) {
        this.f159182d.add(eVar);
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63121a
    /* renamed from: b */
    public void mo218559b(AbstractC63157e eVar) {
        this.f159182d.remove(eVar);
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63121a
    /* renamed from: d */
    public void mo218565d(boolean z) {
        this.f159186h = z;
    }

    /* renamed from: b */
    public void mo218648b(Activity activity) {
        C63197s.m247500a(activity, getMeeting(), new AbstractC63163j() {
            /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$m$Lmlb6Q0pSpMWGpIGFi4CzFZWJ7s */

            @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63163j
            public final void onSubtitleOnOff(boolean z) {
                C63167m.this.m247335h(z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m247335h(boolean z) {
        C63751by.m250231b(getMeeting().mo212056e());
        mo218560b(z);
        mo218629g(z);
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63157e, com.ss.android.vc.meeting.module.subtitle.AbstractC63121a
    /* renamed from: a */
    public void mo218555a(View view) {
        for (AbstractC63157e eVar : this.f159182d) {
            if (eVar != null) {
                eVar.mo218555a(view);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63157e, com.ss.android.vc.meeting.module.subtitle.AbstractC63121a
    /* renamed from: e */
    public void mo218567e(boolean z) {
        for (AbstractC63157e eVar : this.f159182d) {
            if (eVar != null) {
                eVar.mo218567e(z);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63157e, com.ss.android.vc.meeting.module.subtitle.AbstractC63121a
    /* renamed from: f */
    public void mo218568f(boolean z) {
        for (AbstractC63157e eVar : this.f159182d) {
            if (eVar != null) {
                eVar.mo218568f(z);
            }
        }
    }

    public C63167m(C61303k kVar) {
        super(kVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m247334a(VideoChatUser videoChatUser) {
        if (videoChatUser != null && !TextUtils.isEmpty(videoChatUser.getName())) {
            HashMap hashMap = new HashMap();
            hashMap.put("name", videoChatUser.getName());
            C60738ac.m236039c(UIHelper.mustacheFormat((int) R.string.View_G_TurnedOnSubtitlesNameBraces, hashMap));
        }
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63157e
    /* renamed from: g */
    public void mo218629g(boolean z) {
        for (AbstractC63157e eVar : this.f159182d) {
            if (eVar != null) {
                eVar.mo218629g(z);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63121a
    /* renamed from: a */
    public void mo218554a(final Activity activity) {
        boolean z;
        if (mo218649i()) {
            ParticipantSettings a = ParticipantUtil.m248704a(getMeeting());
            if (a == null || !a.isSubtitleOn()) {
                z = false;
            } else {
                z = true;
            }
            mo218629g(z);
        }
        if (getMeeting().mo212086D()) {
            getMeeting().mo212159d(false);
            VcBizService.getVideoChatUserSetting(new AbstractC63598b<C61188b>() {
                /* class com.ss.android.vc.meeting.module.subtitle.C63167m.C631681 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("SubtitleControl", "[loadUserSetting]", "error " + eVar.toString());
                }

                /* renamed from: a */
                public void onSuccess(C61188b bVar) {
                    if (bVar.mo211580c() && !C63167m.this.mo218561b()) {
                        VcBizSender.m249303n(C63167m.this.getMeeting().mo212055d()).mo219889a(new AbstractC63598b<C60987v>() {
                            /* class com.ss.android.vc.meeting.module.subtitle.C63167m.C631681.C631691 */

                            @Override // com.ss.android.vc.net.request.AbstractC63598b
                            public void onError(C63602e eVar) {
                            }

                            /* renamed from: a */
                            public void onSuccess(C60987v vVar) {
                                if (vVar != null) {
                                    C60700b.m235851b("SubtitleControl", "[onSubtitleFunctionClicked]", "GetSuiteQuotaEntity.subtitle : " + vVar.f152726d);
                                    if (vVar.f152726d) {
                                        C63167m.this.mo218648b(activity);
                                        return;
                                    }
                                    MeetingChargingEvent.m249932a(MeetingChargingEvent.Type.SUBTITLE, null);
                                    VCDialogUtils.m236181a((Context) activity, (int) R.string.View_G_UpgradePlanToExtendSubtitleLimit, (int) R.string.View_G_OkButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                        /* class com.ss.android.vc.meeting.module.subtitle.C63167m.C631681.C631691.DialogInterface$OnClickListenerC631701 */

                                        public void onClick(DialogInterface dialogInterface, int i) {
                                        }
                                    }, false);
                                    return;
                                }
                                C60700b.m235851b("SubtitleControl", "[onSubtitleFunctionClicked2]", "GetSuiteQuotaEntity = null");
                            }
                        });
                    }
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63157e
    /* renamed from: a */
    public void mo218625a(InMeetingData.SubtitleStatusData subtitleStatusData) {
        C60700b.m235851b("SubtitleControl", "[onPushSubtitleStatus]", "" + subtitleStatusData.f152438a);
        if (subtitleStatusData.f152438a == InMeetingData.SubtitleStatusData.Status.FIRST_OPEN) {
            if (subtitleStatusData.f152442e != null) {
                UserInfoService.getUserInfoById(getMeeting().mo212055d(), subtitleStatusData.f152442e.getUserId(), subtitleStatusData.f152442e.getParticipantType(), $$Lambda$m$cy9vj3_BvYzIPogZPDlVC07vzVk.INSTANCE);
            }
        } else if (subtitleStatusData.f152438a == InMeetingData.SubtitleStatusData.Status.APPLY_GLOBAL_SPOKEN_LANGUAGE) {
            Participant c = ParticipantUtil.m248731c(getMeeting().mo212056e().getParticipants());
            c.getParticipantSettings().setSpokenLanguage(subtitleStatusData.f152441d);
            for (AbstractC63157e eVar : this.f159182d) {
                if (eVar != null) {
                    eVar.mo218627a(c.getParticipantSettings().isSubtitleOn(), c.getParticipantSettings().getSubtitleLanguage(), subtitleStatusData.f152441d);
                }
            }
        } else {
            if (subtitleStatusData.f152438a == InMeetingData.SubtitleStatusData.Status.MEETING_SUBTITLE_STATUS_CHANGE) {
                mo218557a(subtitleStatusData.f152440c);
            } else {
                this.f159183e = subtitleStatusData.f152438a;
            }
            if (this.f159071a) {
                if (subtitleStatusData.f152438a == InMeetingData.SubtitleStatusData.Status.OPEN_FAILED) {
                    C60738ac.m236037c((int) R.string.View_G_FailedToTurnOnSubtitles);
                } else if (subtitleStatusData.f152438a == InMeetingData.SubtitleStatusData.Status.EXCEPTION) {
                    C60738ac.m236037c((int) R.string.View_G_FailedToLoadSubtitles);
                }
                for (AbstractC63157e eVar2 : this.f159182d) {
                    if (eVar2 != null) {
                        eVar2.mo218625a(subtitleStatusData);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63157e
    /* renamed from: a */
    public void mo218626a(MeetingSubtitleData meetingSubtitleData) {
        if (meetingSubtitleData != null && meetingSubtitleData.mEvent != null) {
            for (AbstractC63157e eVar : this.f159182d) {
                if (eVar != null) {
                    eVar.mo218626a(meetingSubtitleData);
                }
            }
        } else if (meetingSubtitleData == null || meetingSubtitleData.mTarget == null || meetingSubtitleData.mTarget.f152473e == null || TextUtils.isEmpty(meetingSubtitleData.mTarget.f152469a)) {
            C60700b.m235851b("SubtitleControl", "[onPushMeetingSubtitle]", "null");
        } else {
            C60700b.m235851b("SubtitleControl", "[onPushMeetingSubtitle]", "subtitle soundType = " + meetingSubtitleData.mSoundType.getNumber());
            this.f159183e = InMeetingData.SubtitleStatusData.Status.SUBTITLE_RECV;
            String b = ParticipantUtil.m248726b(meetingSubtitleData.mTarget.f152473e);
            String str = meetingSubtitleData.mSeqId + "";
            LruCache<String, Long> lruCache = this.f159184f.get(b);
            if (lruCache == null) {
                lruCache = new LruCache<>(5);
                this.f159184f.put(b, lruCache);
            }
            Long l = lruCache.get(str);
            if (l == null || meetingSubtitleData.mSliceId >= l.longValue()) {
                lruCache.put(str, Long.valueOf(meetingSubtitleData.mSliceId));
                if (meetingSubtitleData.mTrackReceived) {
                    bz.m250233a(meetingSubtitleData.mSeqId + "", getMeeting().mo212056e());
                }
                this.f159181c.mo218655a(meetingSubtitleData);
                mH().removeCallbacks(this.f159187i);
                mH().postDelayed(this.f159187i, 60000);
                for (AbstractC63157e eVar2 : this.f159182d) {
                    if (eVar2 != null) {
                        eVar2.mo218626a(meetingSubtitleData);
                    }
                }
                return;
            }
            C60700b.m235851b("SubtitleControl", "[onPushMeetingSubtitle]", "out order did: " + meetingSubtitleData.mTarget.f152472d + ", seqId: " + meetingSubtitleData.mSeqId);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61302j, com.ss.android.vc.meeting.module.base.AbstractC61420b
    public void onTransform(int i, int i2, int i3) {
        if (i2 == 5) {
            mH().removeCallbacksAndMessages(null);
            mo218650j();
        }
    }

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63157e
    /* renamed from: a */
    public void mo218627a(boolean z, String str, String str2) {
        this.f159071a = z;
        if (!this.f159071a) {
            this.f159183e = InMeetingData.SubtitleStatusData.Status.STATUS_UNKNOWN;
            m247336k();
        } else if (this.f159183e == InMeetingData.SubtitleStatusData.Status.STATUS_UNKNOWN) {
            this.f159183e = InMeetingData.SubtitleStatusData.Status.OPEN_SUCCESS;
        }
        for (AbstractC63157e eVar : this.f159182d) {
            if (eVar != null) {
                eVar.mo218627a(z, str, str2);
            }
        }
    }
}
