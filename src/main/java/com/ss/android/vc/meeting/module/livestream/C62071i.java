package com.ss.android.vc.meeting.module.livestream;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.dependency.AbstractC60902q;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.livestream.C60944d;
import com.ss.android.vc.entity.livestream.LiveExtraInfo;
import com.ss.android.vc.entity.livestream.LiveInfo;
import com.ss.android.vc.entity.livestream.MsgWithUrlInfo;
import com.ss.android.vc.entity.request.VideoChatLiveActionEntityRequest;
import com.ss.android.vc.entity.response.C60981o;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.livestream.C62071i;
import com.ss.android.vc.meeting.module.livestream.activity.RealAuthenticationActivity;
import com.ss.android.vc.meeting.module.p3148o.p3149a.C62578h;
import com.ss.android.vc.meeting.module.p3148o.p3149a.C62579i;
import com.ss.android.vc.meeting.module.p3148o.p3149a.C62580j;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event.aq;
import com.ss.android.vc.statistics.event2.MeetingPopupEvent;

/* renamed from: com.ss.android.vc.meeting.module.livestream.i */
public class C62071i extends AbstractC61424d implements AbstractC62062c {

    /* renamed from: a */
    public AbstractC61222a f155934a;

    /* renamed from: b */
    private AbstractC62011a f155935b;

    /* renamed from: c */
    private C62075j f155936c;

    /* renamed from: d */
    private C62049b f155937d;

    /* renamed from: e */
    private C62066e f155938e;

    /* renamed from: f */
    private boolean f155939f;

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62062c
    /* renamed from: a */
    public void mo214791a(LiveExtraInfo liveExtraInfo) {
    }

    /* renamed from: b */
    public void mo214812b() {
        m242524d();
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62062c
    /* renamed from: f */
    public void mo214681f() {
        m242524d();
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62062c
    /* renamed from: g */
    public void mo214795g() {
        mo214812b();
    }

    /* renamed from: a */
    public void mo214811a(boolean z, final Activity activity) {
        C60700b.m235851b("LivestreamViewControl", "[openSettingDialog]", "start");
        if (C60773o.m236120a(activity)) {
            LiveInfo c = getMeeting().am().mo214677c();
            if (z) {
                aq.m250039a(Long.valueOf(c != null ? c.mo209952j() : 0), getMeeting().mo212056e());
            } else {
                aq.m250043a("vc_live_setting_page", "identity_verification_success", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, getMeeting().mo212056e());
            }
            C62075j.m242550a(isMeetType(), new AbstractC63598b() {
                /* class com.ss.android.vc.meeting.module.livestream.C62071i.C620743 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60738ac.m236023a((int) R.string.View_M_LivestreamingErrorTryAgainLaterNew);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m242546a(boolean z) {
                    C62071i.this.mo214812b();
                    C62071i.this.mo214810a();
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onSuccess(Object obj) {
                    Activity activity = activity;
                    if (activity != null) {
                        C60735ab.m236001a(new Runnable(activity, (MsgWithUrlInfo) obj) {
                            /* class com.ss.android.vc.meeting.module.livestream.$$Lambda$i$3$AOcoLCjBPN2GweVaye2MOJFAiHc */
                            public final /* synthetic */ Activity f$1;
                            public final /* synthetic */ MsgWithUrlInfo f$2;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                            }

                            public final void run() {
                                C62071i.C620743.this.m242545a(this.f$1, this.f$2);
                            }
                        });
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m242545a(Activity activity, MsgWithUrlInfo bVar) {
                    C62071i iVar = C62071i.this;
                    iVar.f155934a = C62579i.m244771a(activity, iVar.getMeeting(), bVar, new C62580j.AbstractC62589a() {
                        /* class com.ss.android.vc.meeting.module.livestream.$$Lambda$i$3$n0OF7PjlptQbgRF_jEzjVWWVhw */

                        @Override // com.ss.android.vc.meeting.module.p3148o.p3149a.C62580j.AbstractC62589a
                        public final void onChanged(boolean z) {
                            C62071i.C620743.this.m242546a(z);
                        }
                    }, VideoChatLiveActionEntityRequest.Action.START);
                    if (C62071i.this.f155934a != null) {
                        C62071i.this.f155934a.mo211606a();
                    }
                }
            });
        }
    }

    /* renamed from: e */
    private void m242527e() {
        long j;
        LiveInfo c = getMeeting().am().mo214677c();
        if (c != null) {
            j = c.mo209952j();
        } else {
            j = 0;
        }
        aq.m250045b(Long.valueOf(j), getMeeting().mo212056e());
        VcBizSender.m249167a(getMeeting().mo212055d(), VideoChatLiveActionEntityRequest.Action.PARTICIPANT_REQUEST_START, (ByteviewUser) null, (String) null).mo219889a(new AbstractC63598b<C60944d>() {
            /* class com.ss.android.vc.meeting.module.livestream.C62071i.C620732 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("LivestreamViewControl", "[requestLiveAction2]", "<LiveStreamTag> error=" + eVar);
            }

            /* renamed from: a */
            public void onSuccess(C60944d dVar) {
                C60700b.m235851b("LivestreamViewControl", "[requestLiveAction]", "<LiveStreamTag> onSuccess");
                C60738ac.m236037c((int) R.string.View_G_RequestSent);
                C62071i.this.getMeeting().am().mo214672a(true);
                C62071i.this.mo214812b();
            }
        });
        mo214810a();
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        C60700b.m235851b("LivestreamViewControl", "[destroy]", "destroy");
        getMeeting().am().mo214674b(this);
        this.f155936c.mo214815a();
        this.f155937d.mo214770a();
        mo214810a();
    }

    /* renamed from: c */
    private void m242521c() {
        boolean z;
        String str;
        AbstractC60902q guideDependency = VideoChatModule.getDependency().getGuideDependency();
        if (getMeeting().aa().mo216279g()) {
            if (getMeeting().f153550c == VideoChat.Type.MEET) {
                str = "all_vc_meet_live_entrance";
            } else {
                str = "all_vc_call_live_entrance";
            }
            z = guideDependency.checkToShow(str);
        } else {
            z = false;
            str = "";
        }
        C60700b.m235851b("LivestreamViewControl", "[processLiveRedDot]", "start shouldShowLivestreamEntranceGuide = " + z);
        if (z) {
            guideDependency.completeGuide(str, true);
        }
        m242517a(z);
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void init() {
        this.f155939f = C60776r.m236143a(C60773o.m236124b(this.mPresent.mo212916a()));
        AbstractC62011a am = getMeeting().am();
        this.f155935b = am;
        am.mo214671a(this);
        this.f155937d = new C62049b(getMeeting(), this.f155935b.mo214678d());
        this.f155936c = this.f155935b.mo214680e();
        this.f155937d.mo214771a(getActivity());
        this.f155936c.mo214818a(false, getActivity());
    }

    /* renamed from: d */
    private void m242524d() {
        if (this.f155938e != null) {
            if (!isMeetType()) {
                this.f155938e.f155917d.setText(R.string.View_M_LivestreamNew);
                this.f155938e.f155915b.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_livestream_filled));
            } else if (isMeetHostUnderUIConfig()) {
                this.f155938e.f155917d.setText(R.string.View_M_LivestreamNew);
                this.f155938e.f155915b.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_livestream_filled));
            } else if (getMeeting().am().mo214676b()) {
                this.f155938e.f155915b.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_sharelink_filled));
                this.f155938e.f155917d.setText(R.string.View_M_CopyLivestreamingLinkNew);
            } else if (getMeeting().am().mo214673a()) {
                this.f155938e.f155915b.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_livestream_filled));
                this.f155938e.f155917d.setText(R.string.View_M_LivestreamNew);
            } else {
                this.f155938e.f155915b.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_livestream_filled));
                this.f155938e.f155917d.setText(R.string.View_M_LivestreamNew);
            }
            if (!isMeetType() || isMeetHostUnderUIConfig() || !getMeeting().am().mo214673a()) {
                this.f155938e.f155917d.setTextColor(C60773o.m236126d(R.color.ud_N600));
            } else {
                this.f155938e.f155917d.setTextColor(C60773o.m236126d(R.color.ud_N400));
            }
        }
    }

    /* renamed from: a */
    public void mo214810a() {
        C60700b.m235851b("LivestreamViewControl", "[dismissLiveSettingDialog]", "dismissLiveSettingDialog");
        AbstractC61222a aVar = this.f155934a;
        if (aVar != null) {
            aVar.dismiss();
        }
        this.f155934a = null;
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62062c
    /* renamed from: c */
    public void mo214794c(boolean z) {
        mo214812b();
    }

    public C62071i(AbstractC61429i iVar) {
        super(iVar);
        init();
    }

    /* renamed from: b */
    private void m242518b(Activity activity) {
        C60700b.m235851b("LivestreamViewControl", "[callLiveClick]", "callLiveClick");
        m242522c(activity);
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62062c
    /* renamed from: a */
    public void mo214792a(LiveInfo aVar) {
        this.f155936c.mo214816a(DisplayMode.ACTIVITY, getActivity());
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62062c
    /* renamed from: d */
    public void mo214679d(boolean z) {
        if (z) {
            mo214811a(false, getActivity());
        }
    }

    /* renamed from: a */
    private void m242515a(Activity activity) {
        C60700b.m235851b("LivestreamViewControl", "[meetLiveClick]", "meetLiveClick");
        if (isMeetHostUnderUIConfig()) {
            m242522c(activity);
        } else {
            m242525d(activity);
        }
    }

    /* renamed from: b */
    private void m242520b(InMeetingData.LiveMeetingData liveMeetingData) {
        C60700b.m235851b("LivestreamViewControl", "[liveStatusChange]", "liveStatusChange");
        mo214812b();
        this.f155936c.mo214818a(true, getActivity());
    }

    /* renamed from: d */
    private void m242526d(InMeetingData.LiveMeetingData liveMeetingData) {
        C60700b.m235851b("LivestreamViewControl", "[participantRequest]", "participantRequest");
        this.f155937d.mo214772a(getActivity(), liveMeetingData);
    }

    /* renamed from: a */
    private void m242517a(boolean z) {
        int i;
        C60700b.m235851b("LivestreamViewControl", "[showLiveRedDot]", "show = " + z);
        ImageView imageView = this.f155938e.f155916c;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: c */
    private void m242522c(final Activity activity) {
        boolean z;
        C60700b.m235851b("LivestreamViewControl", "[authThenSetting]", "<LiveAuth> start");
        if (this.f155935b.mo214677c() != null) {
            z = this.f155935b.mo214677c().mo209943b();
        } else {
            z = false;
        }
        if (z) {
            mo214811a(true, activity);
        } else {
            VcBizSender.m249285h().mo219889a(new AbstractC63598b<C60981o>() {
                /* class com.ss.android.vc.meeting.module.livestream.C62071i.C620721 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235851b("LivestreamViewControl", "[shouldAuth]", "<LiveAuth> onError error=" + eVar);
                }

                /* renamed from: a */
                public void onSuccess(C60981o oVar) {
                    boolean z;
                    C60700b.m235851b("LivestreamViewControl", "[authThenSetting2]", "LiveAuth> onSuccess response=" + oVar);
                    if (oVar == null || oVar.f152710a) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        C62071i.this.mo214811a(true, activity);
                        return;
                    }
                    aq.m250043a("vc_meeting_popup", "identity_verification_popup", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, C62071i.this.getMeeting().mo212056e());
                    Activity activity = activity;
                    if (activity != null) {
                        VCDialogUtils.m236177a((Context) activity, (int) R.string.View_G_PersonalRealNameAuthentication, 2, (int) R.string.View_G_AuthenticateToLivestreamLegal, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                            /* class com.ss.android.vc.meeting.module.livestream.$$Lambda$i$1$CfWKwKWUiJK23JIbz200qW_Jeno */

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                C62071i.C620721.this.m242542a(dialogInterface, i);
                            }
                        }, (int) R.string.View_G_GoToAuthentication, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(activity) {
                            /* class com.ss.android.vc.meeting.module.livestream.$$Lambda$i$1$YzxDO280GwpxcgQgdAfpD6GS1o */
                            public final /* synthetic */ Activity f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                C62071i.C620721.this.m242541a(this.f$1, dialogInterface, i);
                            }
                        }, false);
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m242542a(DialogInterface dialogInterface, int i) {
                    aq.m250043a("vc_meeting_popup", "identity_verification_popup", "cancel", C62071i.this.getMeeting().mo212056e());
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m242541a(Activity activity, DialogInterface dialogInterface, int i) {
                    aq.m250043a("vc_meeting_popup", "identity_verification_popup", "confirm", C62071i.this.getMeeting().mo212056e());
                    C60700b.m235851b("LivestreamViewControl", "[authThenSetting3]", "<LiveAuth> onSuccess gotoAuthPage");
                    RealAuthenticationActivity.m242374a(activity, C62071i.this.getMeeting().mo212055d(), false);
                }
            });
        }
    }

    /* renamed from: d */
    private void m242525d(Activity activity) {
        if (getMeeting().am().mo214673a() || getMeeting().am().mo214676b()) {
            if (getMeeting().am().mo214676b()) {
                C63742at.m250109p(getMeeting().mo212056e());
                new RunnableC62069g(getMeeting()).run();
            }
        } else if (activity != null) {
            VCDialogUtils.m236177a((Context) activity, (int) R.string.View_G_AskHostToLivestreamQuestion, 2, (int) R.string.View_G_AskHostToLivestreamInfo, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.livestream.$$Lambda$i$Rn9865J4UfsnW5YKGUILaTU0Dw */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C62071i.this.m242519b(dialogInterface, i);
                }
            }, (int) R.string.View_M_SendRequest, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.livestream.$$Lambda$i$ThmtnRKY3pSdgCfqVz22L35Jw */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C62071i.this.m242516a((C62071i) dialogInterface, (DialogInterface) i);
                }
            }, false);
            MeetingPopupEvent.m249838a().mo220315a(getMeeting(), "send_live_request");
        }
    }

    /* renamed from: c */
    private void m242523c(InMeetingData.LiveMeetingData liveMeetingData) {
        C60700b.m235851b("LivestreamViewControl", "[hostResponse]", "hostResponse");
        if (isMeetParticipant() && !liveMeetingData.mo209034c()) {
            C60738ac.m236037c((int) R.string.View_M_HostDeclinedToLivestreamNew);
            getMeeting().am().mo214675b(liveMeetingData.mo209034c());
            mo214812b();
        }
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62062c
    /* renamed from: a */
    public void mo214670a(View view) {
        C62066e eVar = new C62066e();
        this.f155938e = eVar;
        eVar.mo214806a(view);
        mo214681f();
        m242521c();
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62062c
    /* renamed from: a */
    public void mo214790a(InMeetingData.LiveMeetingData liveMeetingData) {
        if (liveMeetingData.mo209033b() == InMeetingData.LiveMeetingData.Type.LIVE_INFO_CHANGE) {
            m242520b(liveMeetingData);
        } else if (liveMeetingData.mo209033b() == InMeetingData.LiveMeetingData.Type.PARTICIPANT_REQUEST) {
            if (this.mPresent != null) {
                m242526d(liveMeetingData);
            }
        } else if (liveMeetingData.mo209033b() == InMeetingData.LiveMeetingData.Type.HOST_RESPONSE) {
            m242523c(liveMeetingData);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61300h
    /* renamed from: a */
    public void mo212080a(VideoChat.Type type) {
        if (type == VideoChat.Type.MEET) {
            mo214812b();
            if (isMeetParticipant()) {
                mo214810a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m242519b(DialogInterface dialogInterface, int i) {
        aq.m250038a(getMeeting().mo212056e(), "cancel");
        MeetingPopupEvent.m249838a().mo220319a("cancel", "send_live_request", getMeeting().mo212056e(), "none");
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onOrientation(boolean z, boolean z2) {
        super.onOrientation(z, z2);
        this.f155939f = z;
        C60700b.m235851b("LivestreamViewControl", "[onOrientation]", "mIsLandscape=" + this.f155939f);
        AbstractC61222a aVar = this.f155934a;
        if (aVar != null && (aVar instanceof C62578h)) {
            ((C62578h) aVar).mo211634b(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m242516a(DialogInterface dialogInterface, int i) {
        MeetingPopupEvent.m249838a().mo220319a("send_request", "send_live_request", getMeeting().mo212056e(), "none");
        aq.m250038a(getMeeting().mo212056e(), "confirm");
        if (isMeetHostUnderUIConfig()) {
            C60738ac.m236037c((int) R.string.View_G_CouldNotSendRequest);
        } else if (getMeeting().am().mo214676b()) {
            C60738ac.m236037c((int) R.string.View_M_LivestreamingStartedNew);
        } else {
            m242527e();
        }
    }

    @Override // com.ss.android.vc.meeting.module.livestream.AbstractC62062c
    /* renamed from: a */
    public void mo214793a(AbstractC61222a aVar, Activity activity) {
        if (this.f155936c.mo214819b()) {
            C60700b.m235851b("LivestreamViewControl", "[meetLiveClick]", "isOverseaVoting then return");
        } else if (isMeetType()) {
            m242515a(activity);
        } else {
            m242518b(activity);
        }
    }
}
