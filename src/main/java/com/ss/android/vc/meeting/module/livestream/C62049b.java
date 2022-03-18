package com.ss.android.vc.meeting.module.livestream;

import android.app.Activity;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.livestream.C60944d;
import com.ss.android.vc.entity.livestream.MsgWithUrlInfo;
import com.ss.android.vc.entity.request.VideoChatLiveActionEntityRequest;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.livestream.HostReceiveLivingRequestData;
import com.ss.android.vc.meeting.module.livestream.p3133a.C62013b;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.p3148o.p3149a.C62577g;
import com.ss.android.vc.meeting.module.p3148o.p3149a.C62578h;
import com.ss.android.vc.meeting.module.p3148o.p3149a.C62579i;
import com.ss.android.vc.meeting.module.p3148o.p3149a.C62580j;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.service.VideoChatUIConfigService;
import com.ss.android.vc.statistics.event.aq;
import com.ss.android.vc.statistics.event2.MeetingPopupEvent;

/* renamed from: com.ss.android.vc.meeting.module.livestream.b */
public class C62049b {

    /* renamed from: a */
    public C61303k f155876a;

    /* renamed from: b */
    public C62013b f155877b;

    /* renamed from: c */
    private boolean f155878c = C62075j.m242553c();

    /* renamed from: d */
    private HostReceiveLivingRequestData f155879d;

    /* renamed from: e */
    private AbstractC61222a f155880e;

    /* renamed from: b */
    public C61303k mo214775b() {
        return this.f155876a;
    }

    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ void m242434g() {
        AbstractC61222a aVar = this.f155880e;
        if (aVar != null) {
            aVar.mo211606a();
        }
    }

    /* renamed from: c */
    private void m242429c() {
        C60700b.m235851b("HostReceiveLivingRequestModelLives", "[hostAcceptParticipant]", "accept");
        this.f155879d.mo214667d();
    }

    /* renamed from: d */
    private boolean m242431d() {
        if (mo214775b().mo212058g() == VideoChat.Type.MEET) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.vc.meeting.module.livestream.b$5 */
    public static /* synthetic */ class C620545 {

        /* renamed from: a */
        static final /* synthetic */ int[] f155890a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.vc.meeting.module.livestream.HostReceiveLivingRequestData$Step[] r0 = com.ss.android.vc.meeting.module.livestream.HostReceiveLivingRequestData.Step.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.livestream.C62049b.C620545.f155890a = r0
                com.ss.android.vc.meeting.module.livestream.HostReceiveLivingRequestData$Step r1 = com.ss.android.vc.meeting.module.livestream.HostReceiveLivingRequestData.Step.Request     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.livestream.C62049b.C620545.f155890a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.meeting.module.livestream.HostReceiveLivingRequestData$Step r1 = com.ss.android.vc.meeting.module.livestream.HostReceiveLivingRequestData.Step.Setting     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.livestream.C62049b.C620545.<clinit>():void");
        }
    }

    /* renamed from: e */
    private boolean m242432e() {
        return mo214775b().mo212091I().mo212490a().mo212476h();
    }

    /* renamed from: f */
    private boolean m242433f() {
        if (!m242431d() || !m242432e() || !VideoChatUIConfigService.m249504g(mo214775b())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo214770a() {
        C60700b.m235851b("HostReceiveLivingRequestModelLives", "[dismissDialog]", "dismiss dialog");
        AbstractC61222a aVar = this.f155880e;
        if (aVar != null) {
            aVar.dismiss();
        }
        this.f155880e = null;
        C62013b bVar = this.f155877b;
        if (bVar != null) {
            bVar.mo214692a();
        }
        this.f155877b = null;
    }

    /* renamed from: a */
    private boolean m242428a(ByteviewUser byteviewUser) {
        return ParticipantUtil.m248712a(byteviewUser, mo214775b().mo212091I().mo212494b().mo212601f());
    }

    /* renamed from: b */
    public void mo214777b(InMeetingData.LiveMeetingData liveMeetingData) {
        C60700b.m235851b("HostReceiveLivingRequestModelLives", "[hostRefuseParticipant]", "refuse");
        VcBizSender.m249167a(mo214775b().mo212055d(), VideoChatLiveActionEntityRequest.Action.HOST_REFUSE, liveMeetingData.mo209035d(), (String) null).mo219893b(new AbstractC63598b<C60944d>() {
            /* class com.ss.android.vc.meeting.module.livestream.C62049b.C620534 */

            /* renamed from: a */
            public void onSuccess(C60944d dVar) {
                C60700b.m235851b("HostReceiveLivingRequestModelLives", "[HOST_REFUSE]", "<LiveStreamTag> onSuccess");
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("HostReceiveLivingRequestModelLives", "[HOST_REFUSE2]", "<LiveStreamTag> error=" + eVar);
            }
        });
        this.f155879d.mo214667d();
    }

    /* renamed from: a */
    public void mo214771a(Activity activity) {
        C60700b.m235851b("HostReceiveLivingRequestModelLives", "[recoveryDialogWhenActivity]", "start");
        if (this.f155879d.mo214665b() && !mo214775b().am().mo214676b()) {
            HostReceiveLivingRequestData.Step c = this.f155879d.mo214666c();
            InMeetingData.LiveMeetingData a = this.f155879d.mo214662a();
            C60700b.m235851b("HostReceiveLivingRequestModelLives", "[recoveryDialogWhenActivity2]", "step is " + c);
            if (!C60773o.m236120a(C60773o.m236124b(activity))) {
                C60700b.m235851b("HostReceiveLivingRequestModelLives", "[recoveryDialogWhenActivity3]", "checkActivity error then return");
            } else {
                m242425a(activity, a, c);
            }
        }
    }

    /* renamed from: a */
    public void mo214774a(InMeetingData.LiveMeetingData liveMeetingData) {
        C60700b.m235851b("HostReceiveLivingRequestModelLives", "[receiveRequestInWindow]", "receiveRequestInWindow");
        m242425a((Activity) null, liveMeetingData, HostReceiveLivingRequestData.Step.Request);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m242427a(InMeetingData.LiveMeetingData liveMeetingData, boolean z) {
        if (z) {
            m242429c();
        } else {
            mo214777b(liveMeetingData);
        }
        this.f155880e = null;
    }

    public C62049b(C61303k kVar, HostReceiveLivingRequestData hostReceiveLivingRequestData) {
        this.f155879d = hostReceiveLivingRequestData;
        this.f155876a = kVar;
        C60700b.m235851b("HostReceiveLivingRequestModelLives", "[HostReceiveLivingRequestModel]", "init isOverseaEnv=" + this.f155878c);
    }

    /* renamed from: c */
    private void m242430c(Activity activity, InMeetingData.LiveMeetingData liveMeetingData) {
        C60700b.m235851b("HostReceiveLivingRequestModelLives", "[showHostReceiveLivingReqDialog]", "show dialog");
        if (liveMeetingData != null && liveMeetingData.mo209035d() != null) {
            this.f155879d.mo214664a(HostReceiveLivingRequestData.Step.Request);
            ByteviewUser d = liveMeetingData.mo209035d();
            UserInfoService.getUserInfoById(mo214775b().mo212055d(), d.getUserId(), d.getParticipantType(), new GetUserInfoListener(activity, liveMeetingData) {
                /* class com.ss.android.vc.meeting.module.livestream.$$Lambda$b$renIlYbjwRp_v8MwQmo4B_p1lYA */
                public final /* synthetic */ Activity f$1;
                public final /* synthetic */ InMeetingData.LiveMeetingData f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.ss.android.vc.net.service.GetUserInfoListener
                public final void onGetUserInfo(VideoChatUser videoChatUser) {
                    C62049b.lambda$renIlYbjwRp_v8MwQmo4B_p1lYA(C62049b.this, this.f$1, this.f$2, videoChatUser);
                }
            });
        }
    }

    /* renamed from: b */
    public void mo214776b(final Activity activity, final InMeetingData.LiveMeetingData liveMeetingData) {
        C60700b.m235851b("HostReceiveLivingRequestModelLives", "[showLiveSettingDialog]", "show dialog");
        aq.m250044b(mo214775b().mo212056e());
        this.f155879d.mo214664a(HostReceiveLivingRequestData.Step.Setting);
        C62075j.m242550a(m242431d(), new AbstractC63598b() {
            /* class com.ss.android.vc.meeting.module.livestream.C62049b.C620523 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60738ac.m236023a((int) R.string.View_M_LivestreamingErrorTryAgainLaterNew);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                MsgWithUrlInfo bVar = (MsgWithUrlInfo) obj;
                Activity activity = activity;
                if (activity == null) {
                    C61303k b = C62049b.this.mo214775b();
                    if (b != null && b.mo212065n()) {
                        ByteRTCMeetingActivity.m244034a(C62049b.this.mo214775b(), true, false);
                        return;
                    }
                    return;
                }
                C62049b.this.mo214773a(activity, liveMeetingData, bVar);
            }
        });
    }

    /* renamed from: a */
    public void mo214772a(Activity activity, InMeetingData.LiveMeetingData liveMeetingData) {
        C60700b.m235851b("HostReceiveLivingRequestModelLives", "[receiveRequestInActivity]", "receiveRequestInActivity");
        if (!C60773o.m236120a(C60773o.m236124b(activity))) {
            C60700b.m235851b("HostReceiveLivingRequestModelLives", "[receiveRequestInActivity2]", "checkActivity error then return");
        } else {
            m242425a(activity, liveMeetingData, HostReceiveLivingRequestData.Step.Request);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m242426a(final Activity activity, final InMeetingData.LiveMeetingData liveMeetingData, VideoChatUser videoChatUser) {
        String str;
        String a = C60773o.m236119a((int) R.string.View_M_RequestToLivestreamInfoBracesNewSettings);
        if (videoChatUser == null) {
            str = "";
        } else {
            str = videoChatUser.getName();
        }
        this.f155877b = C62013b.m242308a(activity, R.string.View_M_RequestToLivestreamNew, UIHelper.mustacheFormat(a, "name", str), new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.livestream.C62049b.View$OnClickListenerC620501 */

            public void onClick(View view) {
                aq.m250031a(C62049b.this.mo214775b().mo212056e());
                C62049b.this.mo214777b(liveMeetingData);
                C62049b.this.f155877b = null;
                MeetingPopupEvent.m249838a().mo220319a("cancel", "receive_live_request", C62049b.this.f155876a.mo212056e(), "none");
            }
        }, new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.livestream.C62049b.View$OnClickListenerC620512 */

            public void onClick(View view) {
                C62049b.this.mo214776b(activity, liveMeetingData);
                C62049b.this.f155877b = null;
                MeetingPopupEvent.m249838a().mo220319a("agree", "receive_live_request", C62049b.this.f155876a.mo212056e(), "none");
            }
        });
        MeetingPopupEvent.m249838a().mo220315a(this.f155876a, "receive_live_request");
    }

    /* renamed from: a */
    private void m242425a(Activity activity, InMeetingData.LiveMeetingData liveMeetingData, HostReceiveLivingRequestData.Step step) {
        boolean z;
        boolean z2;
        C60700b.m235851b("HostReceiveLivingRequestModelLives", "[receiveRequestInternal]", "step=" + step);
        C62013b bVar = this.f155877b;
        boolean z3 = false;
        if (bVar == null || !bVar.mo214694b()) {
            z = false;
        } else {
            z = true;
        }
        AbstractC61222a aVar = this.f155880e;
        if (aVar instanceof C62578h) {
            z2 = ((C62578h) aVar).mo215092k();
        } else if (aVar instanceof C62577g) {
            z2 = ((C62577g) aVar).mo216345k();
        } else {
            z2 = false;
        }
        if (z || z2) {
            z3 = true;
        }
        if (z3) {
            C60700b.m235851b("HostReceiveLivingRequestModelLives", "[receiveRequestInternal2]", "is showing, return");
        } else if (liveMeetingData == null) {
            C60700b.m235851b("HostReceiveLivingRequestModelLives", "[receiveRequestInternal3]", "liveMeetingData == null return");
        } else if (m242433f() && liveMeetingData.mo209035d() != null && m242428a(liveMeetingData.mo209035d()) && !mo214775b().am().mo214676b()) {
            this.f155879d.mo214663a(liveMeetingData);
            int i = C620545.f155890a[step.ordinal()];
            if (i == 1) {
                m242430c(activity, liveMeetingData);
            } else if (i == 2) {
                mo214776b(activity, liveMeetingData);
            }
        }
    }

    /* renamed from: a */
    public void mo214773a(Activity activity, InMeetingData.LiveMeetingData liveMeetingData, MsgWithUrlInfo bVar) {
        if (activity != null && liveMeetingData != null && bVar != null) {
            this.f155880e = C62579i.m244771a(activity, mo214775b(), bVar, new C62580j.AbstractC62589a(liveMeetingData) {
                /* class com.ss.android.vc.meeting.module.livestream.$$Lambda$b$OOpL8zhn7Z_dnw6Pmu5JWJyTCI */
                public final /* synthetic */ InMeetingData.LiveMeetingData f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.vc.meeting.module.p3148o.p3149a.C62580j.AbstractC62589a
                public final void onChanged(boolean z) {
                    C62049b.m271278lambda$OOpL8zhn7Z_dnw6Pmu5JWJyTCI(C62049b.this, this.f$1, z);
                }
            }, VideoChatLiveActionEntityRequest.Action.HOST_ACCEPT);
            C60735ab.m236001a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.livestream.$$Lambda$b$yPGdlZgIgtmYz7QY06zyyvW7to0 */

                public final void run() {
                    C62049b.lambda$yPGdlZgIgtmYz7QY06zyyvW7to0(C62049b.this);
                }
            });
        }
    }
}
