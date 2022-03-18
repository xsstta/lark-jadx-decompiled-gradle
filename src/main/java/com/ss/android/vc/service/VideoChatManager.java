package com.ss.android.vc.service;

import android.app.Activity;
import android.content.Context;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.C60998v;
import com.ss.android.vc.entity.InMeetingChangedInfo;
import com.ss.android.vc.entity.InMeetingUpdateMessage;
import com.ss.android.vc.entity.ParticipantChange;
import com.ss.android.vc.entity.VCNotice;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatCombinedInfo;
import com.ss.android.vc.entity.VideoChatConfig;
import com.ss.android.vc.entity.VideoChatExtraInfo;
import com.ss.android.vc.entity.background.C60936b;
import com.ss.android.vc.meeting.framework.manager.C61274b;
import com.ss.android.vc.meeting.framework.manager.C61282e;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsStateChangedListener;
import com.ss.android.vc.meeting.framework.manager.p3106a.C61271b;
import com.ss.android.vc.meeting.framework.manager.p3106a.C61273c;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.framework.statemachine.StatusNode;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.module.base.MeetingActivity;
import com.ss.android.vc.meeting.module.lobby.pb.C62148a;
import com.ss.android.vc.meeting.module.lobby.pb.VCManageNotify;
import com.ss.android.vc.meeting.module.lobby.pb.VCManageResult;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62261j;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessage;
import com.ss.android.vc.meeting.utils.C63490f;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;
import com.ss.android.vcxp.annotation.XSingleton;
import java.util.ArrayList;
import java.util.Locale;

@XClass(isSingleton = true, runOnProcess = XProcess.VC)
public class VideoChatManager {

    /* renamed from: a */
    public C63490f f160604a;

    /* renamed from: b */
    public volatile VideoChatConfig f160605b;

    /* renamed from: c */
    private Boolean f160606c;

    /* renamed from: d */
    private Boolean f160607d;

    /* renamed from: e */
    private Boolean f160608e;

    /* renamed from: f */
    private Boolean f160609f;

    /* renamed from: g */
    private boolean f160610g;

    /* renamed from: h */
    private boolean f160611h;

    /* renamed from: i */
    private boolean f160612i;

    /* renamed from: j */
    private boolean f160613j;

    /* renamed from: k */
    private boolean f160614k;

    /* renamed from: l */
    private C61282e f160615l;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.service.VideoChatManager$a */
    public static class C63631a {

        /* renamed from: a */
        public static final VideoChatManager f160620a = new VideoChatManager();
    }

    @XSingleton
    /* renamed from: a */
    public static final VideoChatManager m249444a() {
        return C63631a.f160620a;
    }

    /* renamed from: k */
    public C61282e mo220133k() {
        return this.f160615l;
    }

    /* renamed from: l */
    public C63490f mo220134l() {
        return this.f160604a;
    }

    /* renamed from: a */
    public void mo220114a(ArrayList<InteractionMessage> arrayList) {
        C60735ab.m236001a(new Runnable(arrayList) {
            /* class com.ss.android.vc.service.$$Lambda$VideoChatManager$MdNWP3LJcQeKLMkyqnrL7MIUHgQ */
            public final /* synthetic */ ArrayList f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                VideoChatManager.m249453b(this.f$0);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m249453b(ArrayList arrayList) {
        C61303k kVar;
        if (C63634c.m249496b("byteview.meeting.android.chat") && (kVar = (C61303k) MeetingManager.m238341a().mo211906j()) != null) {
            kVar.ar().mo216852a(arrayList);
            kVar.as().mo213370a(arrayList);
        }
    }

    /* renamed from: a */
    public void mo220110a(VCManageNotify vCManageNotify) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.service.$$Lambda$VideoChatManager$r7FTDNyERQfO2EpQrBuQoZgdywQ */

            public final void run() {
                VideoChatManager.m249450b(VCManageNotify.this);
            }
        });
    }

    /* renamed from: a */
    public void mo220111a(VCManageResult vCManageResult) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.service.$$Lambda$VideoChatManager$VO1IIcDWaZ4iY8s1FXl6yLCmfJM */

            public final void run() {
                VideoChatManager.m249451b(VCManageResult.this);
            }
        });
    }

    /* renamed from: a */
    public void mo220112a(C62148a aVar) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.service.$$Lambda$VideoChatManager$tlgGkwrvCj8RSkALO4YrutVjTlQ */

            public final void run() {
                VideoChatManager.m249452b(C62148a.this);
            }
        });
    }

    /* renamed from: a */
    public void mo220109a(C61344j jVar) {
        if (jVar != null) {
            C60700b.m235841a(jVar.f153704b, "Rust", "StateEngine", "dispatch event = " + jVar.f153703a, "VideoChatManager", "[dispatch] event = " + jVar.f153703a);
            MeetingManager.m238341a().mo211891a(jVar);
        }
    }

    /* renamed from: a */
    public void mo220108a(final C60998v vVar) {
        if (C60735ab.m236014c()) {
            C60735ab.m236018e(new Runnable() {
                /* class com.ss.android.vc.service.VideoChatManager.RunnableC636292 */

                public void run() {
                    C61274b.m238402a(vVar);
                }
            });
        } else {
            C61274b.m238402a(vVar);
        }
    }

    /* renamed from: a */
    public void mo220115a(boolean z) {
        this.f160606c = Boolean.valueOf(z);
    }

    /* renamed from: b */
    public void mo220118b(boolean z) {
        this.f160607d = Boolean.valueOf(z);
    }

    /* renamed from: b */
    public Boolean mo220116b() {
        Boolean bool = this.f160606c;
        this.f160606c = null;
        return bool;
    }

    /* renamed from: c */
    public Boolean mo220119c() {
        Boolean bool = this.f160607d;
        this.f160607d = null;
        return bool;
    }

    /* renamed from: d */
    public Boolean mo220122d() {
        Boolean bool = this.f160608e;
        this.f160608e = null;
        return bool;
    }

    /* renamed from: e */
    public Boolean mo220125e() {
        Boolean bool = this.f160609f;
        this.f160609f = null;
        return bool;
    }

    /* renamed from: h */
    public boolean mo220130h() {
        boolean z = this.f160612i;
        this.f160612i = false;
        return z;
    }

    /* renamed from: f */
    public Boolean mo220128f() {
        boolean z = this.f160610g;
        this.f160610g = false;
        return Boolean.valueOf(z);
    }

    /* renamed from: g */
    public Boolean mo220129g() {
        boolean z = this.f160611h;
        this.f160611h = false;
        return Boolean.valueOf(z);
    }

    /* renamed from: i */
    public Boolean mo220131i() {
        boolean z = this.f160614k;
        this.f160614k = false;
        return Boolean.valueOf(z);
    }

    /* renamed from: m */
    public void mo220135m() {
        C60700b.m235851b("VideoChatManager", "[refreshVideoChatConfig]", "refreshVideoChatConfig");
        VcBizSender.pullVideoChatConfig().mo219893b(new AbstractC63598b<VideoChatConfig>() {
            /* class com.ss.android.vc.service.VideoChatManager.C636303 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
            }

            /* renamed from: a */
            public void onSuccess(VideoChatConfig videoChatConfig) {
                VideoChatManager.this.f160605b = videoChatConfig;
                C60700b.m235851b("VideoChatManager", "[refreshVideoChatConfig2]", "success");
            }
        });
    }

    private VideoChatManager() {
        this.f160615l = new C61282e();
        this.f160604a = new C63490f();
        MeetingManager.m238341a().registerMeetingsStateChangeListener(new IMeetingsStateChangedListener() {
            /* class com.ss.android.vc.service.VideoChatManager.C636281 */

            @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsStateChangedListener
            @XMethod
            public void stateChanged(String str, StatusNode statusNode, VideoChat videoChat) {
                VideoChatManager.this.f160604a.mo219636a(videoChat, statusNode);
            }
        });
        C60700b.m235851b("VideoChatManager", "[VideoChatManager]", "9f9a3f0a 3.43.0-20220125184122-9f9a3f0a 5.2.19 suite");
    }

    /* renamed from: j */
    public VideoChatConfig mo220132j() {
        if (this.f160605b == null) {
            if (C60735ab.m236005a(false)) {
                C60700b.m235864f("VideoChatManager", "[getVideoChatConfig]", "null in main thread");
                mo220135m();
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                this.f160605b = VcBizSender.syncPullVideoChatConfig();
                C60700b.m235864f("VideoChatManager", "[getVideoChatConfig2]", String.format(Locale.getDefault(), "in background thread spend %d ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            }
        }
        return this.f160605b;
    }

    /* renamed from: c */
    public void mo220121c(boolean z) {
        this.f160612i = z;
    }

    /* renamed from: e */
    public void mo220127e(boolean z) {
        this.f160613j = z;
    }

    /* renamed from: a */
    public void mo220113a(Boolean bool) {
        this.f160608e = bool;
    }

    /* renamed from: b */
    public void mo220117b(Boolean bool) {
        this.f160609f = bool;
    }

    /* renamed from: c */
    public void mo220120c(Boolean bool) {
        this.f160610g = bool.booleanValue();
    }

    /* renamed from: d */
    public void mo220123d(Boolean bool) {
        this.f160611h = bool.booleanValue();
    }

    /* renamed from: e */
    public void mo220126e(Boolean bool) {
        this.f160614k = bool.booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m249445b(InMeetingChangedInfo inMeetingChangedInfo) {
        C61303k kVar = (C61303k) MeetingManager.m238341a().mo211908l();
        if (kVar != null) {
            kVar.mo212091I().mo212498e().mo212442a(inMeetingChangedInfo);
        }
    }

    /* renamed from: d */
    public boolean mo220124d(boolean z) {
        if (!z) {
            return this.f160613j;
        }
        boolean z2 = this.f160613j;
        this.f160613j = false;
        return z2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m249446b(InMeetingUpdateMessage inMeetingUpdateMessage) {
        C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(inMeetingUpdateMessage.getMeetingId());
        if (kVar != null) {
            kVar.mo212091I().mo212494b().mo212590a(inMeetingUpdateMessage);
        }
    }

    /* renamed from: a */
    public void mo220102a(InMeetingChangedInfo inMeetingChangedInfo) {
        if (inMeetingChangedInfo == null) {
            C60700b.m235864f("VideoChatManager", "[onPushInMeetingChangedInfo]", "info is null");
        } else {
            C60735ab.m236001a(new Runnable() {
                /* class com.ss.android.vc.service.$$Lambda$VideoChatManager$zjqL_8EQXWn13DHVgpi4IJE */

                public final void run() {
                    VideoChatManager.m249445b(InMeetingChangedInfo.this);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m249447b(ParticipantChange participantChange) {
        C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(participantChange.getMeetingId());
        if (kVar != null) {
            C61388g b = kVar.mo212091I().mo212494b();
            b.mo212591a(participantChange);
            if (kVar.mo212057f() == VideoChat.Type.MEET && b.mo212600e() != null && b.mo212600e().size() >= 2) {
                Activity c = VCAppLifeCycle.m236256c();
                if (c instanceof MeetingActivity) {
                    ((MeetingActivity) c).mo212796w();
                } else {
                    kVar.mo212156c((VCNotice) null);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo220103a(InMeetingUpdateMessage inMeetingUpdateMessage) {
        if (inMeetingUpdateMessage == null) {
            C60700b.m235864f("VideoChatManager", "[onPushFullMeetingInfo]", "info is null");
        } else {
            C60735ab.m236001a(new Runnable() {
                /* class com.ss.android.vc.service.$$Lambda$VideoChatManager$hIWJtuujLRSAIpsWpJyXI_miQ */

                public final void run() {
                    VideoChatManager.m249446b(InMeetingUpdateMessage.this);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m249448b(VideoChatCombinedInfo videoChatCombinedInfo) {
        C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(videoChatCombinedInfo.getVideoChatInMeetingInfo().getId());
        if (kVar != null) {
            kVar.mo212091I().mo212492a(videoChatCombinedInfo);
        }
    }

    /* renamed from: a */
    public void mo220104a(ParticipantChange participantChange) {
        if (participantChange == null) {
            C60700b.m235864f("VideoChatManager", "[onPushParticipantChange]", "info is null");
        } else {
            C60735ab.m236001a(new Runnable() {
                /* class com.ss.android.vc.service.$$Lambda$VideoChatManager$GCGB9YgI5xNesy4zMxoHx_Izxc */

                public final void run() {
                    VideoChatManager.m249447b(ParticipantChange.this);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m249450b(VCManageNotify vCManageNotify) {
        C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(vCManageNotify.meeting_id);
        if (kVar != null) {
            kVar.mo212091I().mo212497d().mo212416a(vCManageNotify);
        }
    }

    /* renamed from: a */
    public void mo220105a(VideoChat videoChat) {
        m249444a().mo220100a(ar.m236694a(), videoChat);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m249451b(VCManageResult vCManageResult) {
        C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(vCManageResult.f156103a);
        if (kVar != null) {
            kVar.mo212105W().mo212842u().mo214935a(vCManageResult);
            kVar.mo212105W().mo212836o().mo213166a(vCManageResult);
        }
    }

    /* renamed from: a */
    public void mo220106a(VideoChatCombinedInfo videoChatCombinedInfo) {
        if (videoChatCombinedInfo == null) {
            C60700b.m235864f("VideoChatManager", "[onPushMeetingManageInfo]", "combinedInfo is null");
        } else {
            C60735ab.m236001a(new Runnable() {
                /* class com.ss.android.vc.service.$$Lambda$VideoChatManager$K05GqnSyDrytgWCTWKFwczHfZ8 */

                public final void run() {
                    VideoChatManager.m249448b(VideoChatCombinedInfo.this);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m249452b(C62148a aVar) {
        C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(aVar.f156113a);
        if (kVar != null) {
            kVar.mo212091I().mo212497d().mo212417a(aVar);
        }
    }

    /* renamed from: a */
    public void mo220107a(C60936b bVar) {
        C60700b.m235843a("VideoChatManager", "[onPushVCVirtualBackground]", "" + bVar);
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.service.$$Lambda$VideoChatManager$sgZRLfGL83qvlUT9Orvh_r4Cy9s */

            public final void run() {
                C62261j.m243148a(C60936b.this);
            }
        });
    }

    /* renamed from: a */
    public void mo220100a(Context context, VideoChat videoChat) {
        if (videoChat == null) {
            C60700b.m235864f("VideoChatManager", "[onPushStatus]", "VideoChatManager not inited");
        } else {
            C61273c.m238399a(videoChat);
        }
    }

    /* renamed from: a */
    public void mo220101a(Context context, VideoChatExtraInfo videoChatExtraInfo) {
        if (videoChatExtraInfo == null) {
            C60700b.m235864f("VideoChatManager", "[onPushExtraInfo]", "extrainfo is null");
        } else {
            C61271b.m238395b(videoChatExtraInfo);
        }
    }
}
