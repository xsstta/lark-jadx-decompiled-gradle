package com.ss.android.vc.meeting.module.p3148o;

import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60733aa;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.AdminSettings;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VcDoc;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatH323Setting;
import com.ss.android.vc.entity.VideoChatSIPSetting;
import com.ss.android.vc.entity.response.C60982p;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.admin.VideoChatAdminSettings;
import com.ss.android.vc.meeting.module.interpretation.p3126a.C61938d;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils;
import com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.PstnInviteInfo;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.C62413e;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountryListManifest;
import com.ss.android.vc.meeting.module.sketch.SketchControl;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.service.VideoChatUIConfigService;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.o.d */
public class C62607d extends AbstractC62555a {

    /* renamed from: a */
    private C62606c f157603a = new C62606c();

    /* renamed from: b */
    private C61938d f157604b;

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: d */
    public boolean mo216276d() {
        return C63634c.m249496b("byteview.callmeeting.android.subtitle_delete_spoken_language");
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: f */
    public boolean mo216278f() {
        return SketchControl.isMakeSketchFG();
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: i */
    public boolean mo216281i() {
        return C63634c.m249496b("byteview.meeting.android.muteonentry");
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: j */
    public boolean mo216282j() {
        return C63634c.m249496b("byteview.callmeeting.android.subtitle_recordinghint");
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: k */
    public boolean mo216283k() {
        return C63634c.m249496b("byteview.meeting.android.chat");
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: n */
    public boolean mo216286n() {
        return m244859A();
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: t */
    public boolean mo216292t() {
        return LabsUtils.m242914f();
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: u */
    public boolean mo216293u() {
        return C63634c.m249496b("byteview.callmeeting.android.subtitle.spokenlangsetting");
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: v */
    public boolean mo216294v() {
        return this.f157604b.mo214471b();
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: w */
    public boolean mo216295w() {
        return this.f157604b.mo214469a();
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: g */
    public boolean mo216279g() {
        return VideoChatUIConfigService.m249498a(getMeeting());
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: l */
    public boolean mo216284l() {
        if (DesktopUtil.m144307b()) {
            return m244859A();
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: p */
    public boolean mo216288p() {
        return VideoChatUIConfigService.m249500c(getMeeting());
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: q */
    public boolean mo216289q() {
        return VideoChatUIConfigService.m249501d(getMeeting());
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: r */
    public boolean mo216290r() {
        return VideoChatUIConfigService.m249502e(getMeeting());
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: s */
    public boolean mo216291s() {
        return VideoChatUIConfigService.m249503f(getMeeting());
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: x */
    public List<VcDoc> mo216296x() {
        C62606c cVar = this.f157603a;
        if (cVar != null) {
            return cVar.mo216381a();
        }
        return null;
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: y */
    public int mo216297y() {
        C62606c cVar = this.f157603a;
        if (cVar != null) {
            return cVar.mo216386b();
        }
        return 0;
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: b */
    public boolean mo216274b() {
        return getMeeting().ab().mo213892r();
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: c */
    public boolean mo216275c() {
        if (!C63634c.m249496b("byteview.asr.subtitle") || !VideoChatAdminSettings.m239417e()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: e */
    public boolean mo216277e() {
        if (!C63634c.m249496b("byteview.meeting.android.copymeetinglink") || !VideoChatUIConfigService.m249507j(this.mMeeting)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: m */
    public boolean mo216285m() {
        if (this.mMeeting.ao().mo218468d() || this.mMeeting.aa().mo216281i()) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    private boolean m244859A() {
        Participant j = getMeeting().mo212091I().mo212494b().mo212605j();
        if (getMeeting().f153550c != VideoChat.Type.MEET || j == null || !j.isHostOrCoHost() || getMeeting().mo212098P() || !VideoChatUIConfigService.m249504g(getMeeting())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: h */
    public boolean mo216280h() {
        if (mo216272a() || mo216274b() || mo216275c() || mo216278f() || mo216279g()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo216287o() {
        /*
            r2 = this;
            com.ss.android.vc.meeting.framework.meeting.k r0 = r2.getMeeting()
            com.ss.android.vc.meeting.module.follow.a r0 = r0.ab()
            boolean r0 = r0.mo213892r()
            com.ss.android.vc.meeting.framework.meeting.k r1 = r2.getMeeting()
            com.ss.android.vc.meeting.module.p.a r1 = r1.aj()
            boolean r1 = r1.mo216415e()
            if (r1 == 0) goto L_0x001c
            int r0 = r0 + 1
        L_0x001c:
            r1 = 1
            if (r0 <= r1) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.p3148o.C62607d.mo216287o():boolean");
    }

    /* renamed from: z */
    public String mo216388z() {
        VideoChatUser userInfoInCache;
        Participant j = this.mMeeting.mo212091I().mo212494b().mo212605j();
        if (j == null || (userInfoInCache = UserInfoService.getUserInfoInCache(j.getId(), j.getParticipantType())) == null) {
            return "";
        }
        return userInfoInCache.getName();
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: a */
    public boolean mo216272a() {
        return VideoChatUIConfigService.m249499b(getMeeting());
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: a */
    public void mo216267a(C61303k kVar) {
        mo216387a(kVar, (AdminSettings) null, (CountryListManifest) null, false);
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: b */
    public void mo216273b(C61303k kVar) {
        C57865c.m224576a(new Runnable(kVar) {
            /* class com.ss.android.vc.meeting.module.p3148o.$$Lambda$d$AR9ZHCwpnPV1wRgGO3pPQoo_aY */
            public final /* synthetic */ C61303k f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C62607d.this.m244862c(this.f$1);
            }
        });
    }

    public C62607d(C61303k kVar) {
        super(kVar);
        this.f157604b = new C61938d(kVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m244862c(final C61303k kVar) {
        final CountryListManifest b = C62413e.m243942a().mo215805b(ar.m236694a());
        if (b != null && b.getData() != null) {
            kVar.mo212091I().mo212496c().mo212426a(new AbstractC63598b<AdminSettings>() {
                /* class com.ss.android.vc.meeting.module.p3148o.C62607d.C626081 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                }

                /* renamed from: a */
                public void onSuccess(AdminSettings adminSettings) {
                    C62607d.this.mo216387a(kVar, adminSettings, b, true);
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: a */
    public void mo216269a(C61938d.AbstractC61940a aVar) {
        this.f157604b.mo214468a(aVar);
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: a */
    public void mo216270a(List<VcDoc> list) {
        C62606c cVar = this.f157603a;
        if (cVar != null) {
            cVar.mo216384a(list);
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: a */
    public void mo216271a(boolean z) {
        C62606c cVar = this.f157603a;
        if (cVar != null) {
            cVar.mo216385a(z);
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: a */
    public void mo216266a(VcDoc vcDoc, boolean z) {
        C62606c cVar = this.f157603a;
        if (cVar != null) {
            cVar.mo216383a(vcDoc, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m244861b(C61303k kVar, final AbstractC63598b bVar) {
        final CountryListManifest b = C62413e.m243942a().mo215805b(ar.m236694a());
        if (b != null && b.getData() != null) {
            kVar.mo212091I().mo212496c().mo212426a(new AbstractC63598b<AdminSettings>() {
                /* class com.ss.android.vc.meeting.module.p3148o.C62607d.C626103 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    bVar.onError(eVar);
                }

                /* renamed from: a */
                public void onSuccess(AdminSettings adminSettings) {
                    bVar.onSuccess(C60733aa.m235981a(adminSettings, b));
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62555a
    /* renamed from: a */
    public void mo216268a(C61303k kVar, AbstractC63598b<List<PstnInviteInfo>> bVar) {
        C57865c.m224576a(new Runnable(kVar, bVar) {
            /* class com.ss.android.vc.meeting.module.p3148o.$$Lambda$d$t1RE18T2KLPyqZsVGyW75bUeUZM */
            public final /* synthetic */ C61303k f$1;
            public final /* synthetic */ AbstractC63598b f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C62607d.this.m244861b(this.f$1, this.f$2);
            }
        });
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61302j, com.ss.android.vc.meeting.module.base.AbstractC61420b
    public void onTransform(int i, int i2, int i3) {
        C62606c cVar = this.f157603a;
        if (cVar != null) {
            cVar.mo216382a(i, i2, i3);
        }
    }

    /* renamed from: a */
    private void m244860a(final C61303k kVar, final AdminSettings adminSettings, final CountryListManifest countryListManifest, final String str) {
        VcBizSender.m249268e(kVar.mo212091I().mo212490a().mo212475g()).mo219889a(new AbstractC63598b<C60982p>() {
            /* class com.ss.android.vc.meeting.module.p3148o.C62607d.C626092 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
            }

            /* renamed from: a */
            public void onSuccess(C60982p pVar) {
                String str = pVar.f152711a;
                if (pVar.f152714d != null && pVar.f152714d.getNumber() == VideoChat.MeetingSource.VC_FROM_INTERVIEW.getNumber()) {
                    str = UIHelper.mustacheFormat((int) R.string.View_M_VideoInterviewNameBraces, "name", pVar.f152711a);
                }
                VideoChatH323Setting videoChatH323Setting = null;
                if (!(kVar.mo212056e() == null || kVar.mo212056e().getVideoChatSettings() == null)) {
                    videoChatH323Setting = kVar.mo212056e().getVideoChatSettings().getH323Setting();
                }
                C60733aa.m235987a(pVar.f152712b, str, C62607d.this.mo216388z(), pVar.f152713c, adminSettings, countryListManifest, str, videoChatH323Setting, false);
            }
        });
    }

    /* renamed from: a */
    public void mo216387a(C61303k kVar, AdminSettings adminSettings, CountryListManifest countryListManifest, boolean z) {
        String str;
        VideoChatH323Setting videoChatH323Setting;
        if (kVar != null && kVar.mo212056e() != null) {
            VideoChat e = kVar.mo212056e();
            if (e == null || !e.getVideoChatSettings().isLocked()) {
                boolean z2 = false;
                if (kVar.mo212090H() != null && VideoChat.MeetingSource.VC_FROM_INTERVIEW.getNumber() == kVar.mo212090H().getNumber()) {
                    z2 = true;
                }
                if (!z || e == null || !mo216290r()) {
                    str = null;
                } else {
                    VideoChatSIPSetting sIPSetting = e.getVideoChatSettings().getSIPSetting();
                    if (sIPSetting != null) {
                        str = sIPSetting.getDomain();
                    } else {
                        str = null;
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = C60733aa.m235980a(e.getIsLarkMeeting());
                    }
                }
                if (z2) {
                    m244860a(kVar, adminSettings, countryListManifest, str);
                } else if (TextUtils.isEmpty(e.getMeetingUrl())) {
                    m244860a(kVar, adminSettings, countryListManifest, str);
                } else {
                    String meetNumber = e.getMeetNumber();
                    String topic = e.getVideoChatSettings().getTopic();
                    String z3 = mo216388z();
                    String meetingUrl = e.getMeetingUrl();
                    if (e.getVideoChatSettings() == null) {
                        videoChatH323Setting = null;
                    } else {
                        videoChatH323Setting = e.getVideoChatSettings().getH323Setting();
                    }
                    C60733aa.m235987a(meetNumber, topic, z3, meetingUrl, adminSettings, countryListManifest, str, videoChatH323Setting, false);
                }
            } else {
                C60700b.m235851b("SettingMoreControl", "[copyMeetingUrl]", "meeting is locked, can not share");
                C60738ac.m236037c((int) R.string.View_M_MeetingLocked);
            }
        }
    }
}
