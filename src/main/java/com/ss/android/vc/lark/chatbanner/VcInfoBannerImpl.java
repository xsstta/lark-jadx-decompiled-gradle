package com.ss.android.vc.lark.chatbanner;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.utils.C57766ad;
import com.ss.android.lark.utils.C57858o;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60733aa;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.dependency.AbstractC60892h;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.Status;
import com.ss.android.vc.entity.VCMeetingAbbrInfo;
import com.ss.android.vc.entity.VCParticipantAbbrInfo;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.request.JoinMeetingPreCheckEntityRequest;
import com.ss.android.vc.entity.response.C60979m;
import com.ss.android.vc.entity.response.C60982p;
import com.ss.android.vc.entity.response.JoinMeetingPreCheckEntity;
import com.ss.android.vc.lark.chatbanner.VcInfoBannerImpl;
import com.ss.android.vc.lark.chatbanner.VcInfoBannerView;
import com.ss.android.vc.lark.message.meeting.cardview.attendee.MeetingAttendeeActivity;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.meeting.framework.statemachine.StatusNode;
import com.ss.android.vc.meeting.utils.TimeConsumeUtils;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckData;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckUtils;
import com.ss.android.vc.meeting.utils.meetingcheck.rx.XConsumer;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.service.XIGetDataCallback;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vc.statistics.C63685a;
import com.ss.android.vc.statistics.p3180a.C63697g;
import com.ss.android.vcxp.XListener;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;
import io.reactivex.p3457e.C68296b;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

@XClass(isStatic = true)
public class VcInfoBannerImpl implements VideoChatModule.AbstractC60653b, VcInfoBannerView.AbstractC61084a {

    /* renamed from: a */
    public OpenChat f152954a;

    /* renamed from: b */
    public OpenChatter f152955b;

    /* renamed from: c */
    public VcInfoBannerView f152956c;

    /* renamed from: d */
    public volatile XListener.PushVideoChatStatusListener f152957d;

    /* renamed from: e */
    public VCMeetingAbbrInfo f152958e;

    /* renamed from: f */
    public Handler f152959f = new Handler(Looper.getMainLooper()) {
        /* class com.ss.android.vc.lark.chatbanner.VcInfoBannerImpl.HandlerC610751 */

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 16) {
                if (VcInfoBannerImpl.this.f152956c != null) {
                    VcInfoBannerImpl.this.f152956c.mo211314a();
                }
                VcInfoBannerImpl.this.f152959f.sendEmptyMessageDelayed(16, 1000);
            }
        }
    };

    /* renamed from: g */
    private Activity f152960g;

    /* renamed from: h */
    private VideoChatModule.AbstractC60653b.AbstractC60654a f152961h;

    /* renamed from: i */
    private volatile XListener.MeetingsStateChangedListener f152962i;

    @Override // com.ss.android.vc.lark.chatbanner.VcInfoBannerView.AbstractC61084a
    /* renamed from: c */
    public void mo211301c() {
        C60700b.m235843a("VcInfoBannerImpl", "[onCancel]", "onCancel");
        m237519a("cancel");
    }

    @Override // com.ss.android.vc.lark.chatbanner.VcInfoBannerView.AbstractC61084a
    /* renamed from: g */
    public void mo211305g() {
        C60700b.m235843a("VcInfoBannerImpl", "[onShowParticipants]", "onShowParticipants");
        mo211306h();
    }

    /* renamed from: l */
    private void m237527l() {
        C60700b.m235851b("VcInfoBannerImpl", "[endTimerTask]", "endTimerTask");
        this.f152959f.removeMessages(16);
    }

    @Override // com.ss.android.vc.lark.chatbanner.VcInfoBannerView.AbstractC61084a
    /* renamed from: b */
    public void mo211300b() {
        C60700b.m235843a("VcInfoBannerImpl", "[onCopy]", "onCopy");
        VCMeetingAbbrInfo sVar = this.f152958e;
        if (sVar != null) {
            m237523b(sVar.mo210141b());
            m237519a("copy_meeting_link");
        }
    }

    @Override // com.ss.android.vc.lark.chatbanner.VcInfoBannerView.AbstractC61084a
    /* renamed from: f */
    public void mo211304f() {
        if (this.f152961h != null) {
            C60700b.m235843a("VcInfoBannerImpl", "[onHide]", "onHide");
            this.f152961h.mo196514a();
        }
        m237527l();
    }

    /* renamed from: i */
    private void m237524i() {
        C60700b.m235851b("VcInfoBannerImpl", "[updadteInner]", "updadteInner");
        VCMeetingAbbrInfo sVar = this.f152958e;
        if (sVar == null) {
            VcInfoBannerView vcInfoBannerView = this.f152956c;
            if (vcInfoBannerView != null) {
                vcInfoBannerView.mo211315a((VCMeetingAbbrInfo) null);
            }
        } else if (!joined(sVar.mo210141b()).booleanValue()) {
            if (this.f152956c == null) {
                m237525j();
            }
            this.f152956c.mo211315a(this.f152958e);
        }
    }

    /* renamed from: j */
    private void m237525j() {
        if (this.f152956c == null) {
            C60700b.m235851b("VcInfoBannerImpl", "[createBannerView]", " creating");
            VcInfoBannerView vcInfoBannerView = new VcInfoBannerView(this.f152960g);
            this.f152956c = vcInfoBannerView;
            vcInfoBannerView.setActionListener(this);
            this.f152962i = new XListener.MeetingsStateChangedListener() {
                /* class com.ss.android.vc.lark.chatbanner.VcInfoBannerImpl.C610784 */

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m237539a(String str, StatusNode statusNode) {
                    VcInfoBannerImpl.this.mo211299a(str, statusNode);
                }

                @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsStateChangedListener
                @XMethod
                public void stateChanged(String str, StatusNode statusNode, VideoChat videoChat) {
                    C60735ab.m236001a(new Runnable(str, statusNode) {
                        /* class com.ss.android.vc.lark.chatbanner.$$Lambda$VcInfoBannerImpl$4$EbLnR7UBFBHYyHpYWzXd791xqlU */
                        public final /* synthetic */ String f$1;
                        public final /* synthetic */ StatusNode f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            VcInfoBannerImpl.C610784.this.m237539a(this.f$1, this.f$2);
                        }
                    });
                }
            };
            MeetingManager.m238341a().registerMeetingsStateChangeListener(this.f152962i);
        }
        C60700b.m235861e("VcInfoBannerImpl", "[createBannerView2]", " view already exists");
    }

    /* renamed from: k */
    private void m237526k() {
        C60700b.m235851b("VcInfoBannerImpl", "[startTimerTask]", "startTimerTask");
        if (!this.f152959f.hasMessages(16)) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f152959f.sendEmptyMessageDelayed(16, (((currentTimeMillis / 1000) + 1) * 1000) - currentTimeMillis);
        }
    }

    @Override // com.ss.android.vc.lark.chatbanner.VcInfoBannerView.AbstractC61084a
    /* renamed from: e */
    public void mo211303e() {
        if (this.f152961h != null) {
            C60700b.m235843a("VcInfoBannerImpl", "[onShow]", "onShow");
            this.f152961h.mo196515a(this.f152956c, this.f152960g.getResources().getDimensionPixelSize(R.dimen.vc_banner_height));
            m237526k();
        }
    }

    @Override // com.ss.android.vc.lark.chatbanner.VcInfoBannerView.AbstractC61084a
    /* renamed from: d */
    public void mo211302d() {
        C60700b.m235843a("VcInfoBannerImpl", "[onJoin]", "onJoin");
        VCMeetingAbbrInfo sVar = this.f152958e;
        if (sVar == null || TextUtils.isEmpty(sVar.mo210141b())) {
            C60700b.m235861e("VcInfoBannerImpl", "[onJoin2]", " get meeting id failed");
        } else if (this.f152958e.mo210140a() && C61086a.m237567a(this.f152958e) == 0) {
            C60738ac.m236023a((int) R.string.View_M_MeetingLocked);
            C60700b.m235861e("VcInfoBannerImpl", "[onJoin3]", " current meeting is locked");
        } else if (this.f152958e.mo210148h() == null || !this.f152958e.mo210148h().booleanValue()) {
            onJoinInternal(UUID.randomUUID().toString(), this.f152958e.mo210141b(), this.f152954a.getId());
        } else {
            C60738ac.m236023a((int) R.string.View_M_CapacityReachedAndroid);
            C60700b.m235861e("VcInfoBannerImpl", "[onJoin4]", " current meeting is full");
        }
    }

    /* renamed from: h */
    public void mo211306h() {
        String str;
        VCMeetingAbbrInfo sVar = this.f152958e;
        if (sVar == null) {
            C60700b.m235864f("VcInfoBannerImpl", "[showParticipants]", "get meeting info failed");
            return;
        }
        ByteviewUser e = sVar.mo210144e();
        List<VCParticipantAbbrInfo> g = this.f152958e.mo210147g();
        if (g == null || g.isEmpty()) {
            C60700b.m235864f("VcInfoBannerImpl", "[showParticipants2]", "get participants failed");
            return;
        }
        List<VCParticipantAbbrInfo> a = m237517a(g, Status.ON_THE_CALL);
        int size = a.size();
        final Context a2 = ar.m236694a();
        if (size == 1 && a.get(0).mo210170b().getParticipantType() == ParticipantType.LARK_USER) {
            String userId = a.get(0).mo210170b().getUserId();
            AbstractC60892h chatDependency = VideoChatModuleDependency.getChatDependency();
            if (chatDependency != null) {
                chatDependency.getChatterById(userId, new XIGetDataCallback<OpenChatter>() {
                    /* class com.ss.android.vc.lark.chatbanner.VcInfoBannerImpl.C610806 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    @XMethod
                    public void onError(ErrorResult errorResult) {
                        C60738ac.m236029a(errorResult.getDisplayMsg(UIHelper.getString(R.string.View_G_NoConnection)));
                    }

                    @XMethod
                    public void onSuccess(OpenChatter openChatter) {
                        VideoChatModuleDependency.getDependency().startContactsProfileActivity(a2, openChatter.getId(), VcInfoBannerImpl.this.f152958e.mo210142c(), VcInfoBannerImpl.this.f152958e.mo210141b(), VcInfoBannerImpl.this.f152958e.mo210144e());
                    }
                });
                return;
            }
            return;
        }
        String[] strArr = new String[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = a.get(i).mo210170b().getUserId();
            iArr[i] = a.get(i).mo210170b().getParticipantType().getNumber();
            iArr2[i] = a.get(i).mo210171c().getNumber();
        }
        C57766ad a3 = C57858o.m224559a(MeetingAttendeeActivity.class).mo196058a("extra.meeting_id", this.f152958e.mo210141b()).mo196062a("extra.participant_ids", strArr).mo196061a("extra.participant_types", iArr).mo196061a("extra.participant_device_types", iArr2).mo196058a("extra.meeting.topic", this.f152958e.mo210142c());
        if (e == null) {
            str = "";
        } else {
            str = e.getUserId();
        }
        a3.mo196058a("extra.creator.id", str).mo196064a(a2);
    }

    @Override // com.ss.android.vc.lark.chatbanner.VcInfoBannerView.AbstractC61084a
    /* renamed from: a */
    public void mo211297a() {
        String str;
        C60700b.m235843a("VcInfoBannerImpl", "[onShare]", "onShare");
        VCMeetingAbbrInfo sVar = this.f152958e;
        if (sVar == null || !sVar.mo210140a()) {
            if (this.f152961h != null) {
                VCMeetingAbbrInfo sVar2 = this.f152958e;
                if (sVar2 == null) {
                    str = "";
                } else {
                    str = sVar2.mo210141b();
                }
                if (!TextUtils.isEmpty(str)) {
                    this.f152961h.mo196516a(str);
                }
            }
            m237519a("share");
            return;
        }
        C60700b.m235851b("VcInfoBannerImpl", "[onShare2]", "meeting is locked!");
        C60738ac.m236023a((int) R.string.View_M_MeetingLocked);
    }

    /* renamed from: com.ss.android.vc.lark.chatbanner.VcInfoBannerImpl$2 */
    class C610762 extends XListener.PushVideoChatStatusListener {

        /* renamed from: a */
        final /* synthetic */ VcInfoBannerImpl f152964a;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m237538a(C60979m mVar) {
            this.f152964a.mo211298a(mVar);
        }

        @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63584x
        @XMethod
        public void onPushVideoChatStatus(C60979m mVar) {
            if (mVar != null && TextUtils.equals(mVar.f152700a, this.f152964a.f152954a.getId())) {
                C60735ab.m236001a(new Runnable(mVar) {
                    /* class com.ss.android.vc.lark.chatbanner.$$Lambda$VcInfoBannerImpl$2$uC5YyGiCWlRxT9irkOzc47vP59o */
                    public final /* synthetic */ C60979m f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        VcInfoBannerImpl.C610762.this.m237538a(this.f$1);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private void m237521a(boolean z) {
        VcInfoBannerView vcInfoBannerView = this.f152956c;
        if (vcInfoBannerView != null) {
            vcInfoBannerView.mo211316a(z);
        }
    }

    /* renamed from: b */
    private void m237523b(final String str) {
        m237518a(new XIGetDataCallback<OpenChatter>() {
            /* class com.ss.android.vc.lark.chatbanner.VcInfoBannerImpl.C610817 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            @XMethod
            public void onError(ErrorResult errorResult) {
            }

            @XMethod
            public void onSuccess(final OpenChatter openChatter) {
                if (VcInfoBannerImpl.this.f152955b == null) {
                    VcInfoBannerImpl.this.f152955b = openChatter;
                }
                VcBizSender.m249268e(str).mo219893b(new AbstractC63598b<C60982p>() {
                    /* class com.ss.android.vc.lark.chatbanner.VcInfoBannerImpl.C610817.C610821 */

                    @Override // com.ss.android.vc.net.request.AbstractC63598b
                    public void onError(C63602e eVar) {
                    }

                    /* renamed from: a */
                    public void onSuccess(C60982p pVar) {
                        String str = pVar.f152711a;
                        if (pVar.f152714d != null && pVar.f152714d.getNumber() == VideoChat.MeetingSource.VC_FROM_INTERVIEW.getNumber()) {
                            str = UIHelper.mustacheFormat((int) R.string.View_M_VideoInterviewNameBraces, "name", pVar.f152711a);
                        }
                        C60733aa.m235986a(pVar.f152712b, str, openChatter.getName(), pVar.f152713c);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    private void m237518a(XIGetDataCallback<OpenChatter> xIGetDataCallback) {
        OpenChatter openChatter = this.f152955b;
        if (openChatter != null) {
            xIGetDataCallback.onSuccess(openChatter);
            return;
        }
        VideoChatModuleDependency.getChatDependency().getChatterById(VideoChatModule.getDependency().getUserId(), xIGetDataCallback);
    }

    /* renamed from: com.ss.android.vc.lark.chatbanner.VcInfoBannerImpl$3 */
    class C610773 extends XIGetDataCallback<C60979m> {

        /* renamed from: a */
        final /* synthetic */ VcInfoBannerImpl f152965a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        @XMethod
        public void onError(ErrorResult errorResult) {
        }

        @XMethod
        public void onSuccess(C60979m mVar) {
            try {
                if (this.f152965a.f152957d != null) {
                    C60700b.m235851b("VcInfoBannerImpl", "[onCreate]", "loadLatestVideoChatStatus succeed: " + mVar);
                    this.f152965a.f152957d.onPushVideoChatStatus(mVar);
                }
            } catch (Exception unused) {
            }
        }
    }

    @XMethod(runOnProcess = XProcess.VC)
    private static Boolean joined(String str) {
        for (AbstractC61294b bVar : MeetingManager.m238341a().mo211894b()) {
            if (TextUtils.equals(bVar.mo212055d(), str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m237519a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", str);
            C63685a.m249653a("vc_meeting_group_banner", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static boolean m237522a(JoinMeetingPreCheckEntity joinMeetingPreCheckEntity) {
        if (joinMeetingPreCheckEntity == null || joinMeetingPreCheckEntity.f152605b == null || joinMeetingPreCheckEntity.f152605b.f152607a == null || joinMeetingPreCheckEntity.f152605b.f152607a.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo211298a(C60979m mVar) {
        if (mVar == null || !mVar.f152703d.booleanValue() || mVar.f152704e != null) {
            if (mVar == null || !mVar.f152703d.booleanValue()) {
                this.f152958e = null;
            } else {
                this.f152958e = mVar.f152704e;
            }
            C60700b.m235851b("VcInfoBannerImpl", "[onUpdate2]", "VcInfoBannerImpl onUpdate meeting: " + this.f152958e);
            m237524i();
            return;
        }
        C60700b.m235861e("VcInfoBannerImpl", "[onUpdate]", " invalid data: " + mVar);
    }

    /* renamed from: a */
    private List<VCParticipantAbbrInfo> m237517a(List<VCParticipantAbbrInfo> list, Status status) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (VCParticipantAbbrInfo tVar : list) {
            if (tVar.mo210169a() == status) {
                arrayList.add(tVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo211299a(String str, StatusNode statusNode) {
        C60700b.m235851b("VcInfoBannerImpl", "[onMeetingsStateChanged]", "[status]" + statusNode);
        VCMeetingAbbrInfo sVar = this.f152958e;
        if (sVar != null && TextUtils.equals(str, sVar.mo210141b())) {
            if (statusNode == StatusNode.OnTheCall) {
                m237521a(true);
            } else if (statusNode != StatusNode.Idle) {
            } else {
                if (this.f152956c == null) {
                    m237524i();
                } else {
                    m237521a(false);
                }
            }
        }
    }

    @XMethod(runOnProcess = XProcess.VC)
    private static void onJoinInternal(String str, String str2, String str3) {
        C63697g.m249703a();
        VideoChatService.m249602d().asyncCheckAndInit(new VideoChatService.OnInitFinishListener(str3, str, TimeConsumeUtils.m248927a("VcInfoBannerImpl:onJoinInternal"), str2) {
            /* class com.ss.android.vc.lark.chatbanner.$$Lambda$VcInfoBannerImpl$yYuPd1tLw7SSWg7SfUxKndWlGIM */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ C68296b f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.ss.android.vc.service.impl.VideoChatService.OnInitFinishListener
            public final void onInited() {
                VcInfoBannerImpl.m237520a(this.f$0, this.f$1, this.f$2, this.f$3);
            }
        });
    }

    public VcInfoBannerImpl(Activity activity, OpenChat openChat, OpenChatter openChatter, VideoChatModule.AbstractC60653b.AbstractC60654a aVar) {
        this.f152960g = activity;
        this.f152954a = openChat;
        this.f152955b = openChatter;
        this.f152961h = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m237520a(String str, final String str2, final C68296b bVar, final String str3) {
        MeetingCheckUtils.meetingCheck(ar.m236694a(), str, JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.GROUPID, true, "group_chat_banner", str2, 1, true).subscribe(new XConsumer<MeetingCheckData>() {
            /* class com.ss.android.vc.lark.chatbanner.VcInfoBannerImpl.C610795 */

            @XMethod
            public void accept(MeetingCheckData bVar) throws Exception {
                boolean z;
                if (!bVar.mo219661a().booleanValue() || !VcInfoBannerImpl.m237522a(bVar.mo219665b())) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    TimeConsumeUtils.m248928a(bVar);
                    VideoChatModule.getVideoChatService().joinVideoMeeting(ar.m236694a(), str3, "group_chat_banner", str2, bVar.mo219666c());
                    return;
                }
                C63697g.m249707e();
            }
        });
    }
}
