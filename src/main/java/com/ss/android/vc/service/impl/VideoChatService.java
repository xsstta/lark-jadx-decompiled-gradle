package com.ss.android.vc.service.impl;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.desktopmode.p1787a.C36519d;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.AbstractC60728a;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.common.widget.DialogC60856d;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.an;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.dto.VCLaunchError;
import com.ss.android.vc.entity.C60998v;
import com.ss.android.vc.entity.MeetingConfig;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatConfig;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.request.JoinMeetingPreCheckEntityRequest;
import com.ss.android.vc.entity.request.StartByteviewHeartbeatEntityRequest;
import com.ss.android.vc.entity.response.C60978l;
import com.ss.android.vc.entity.response.C60979m;
import com.ss.android.vc.entity.response.IDTypeEntity;
import com.ss.android.vc.entity.response.JoinMeetingEntity;
import com.ss.android.vc.entity.response.JoinMeetingPreCheckEntity;
import com.ss.android.vc.entity.response.ReservationInfoEntity;
import com.ss.android.vc.lark.rvc.RvcActivity;
import com.ss.android.vc.lark.rvc.RvcJSProtocol;
import com.ss.android.vc.lark.rvc.RvcManager;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.module.admin.VideoChatAdminSettings;
import com.ss.android.vc.meeting.module.base.MeetingShadowActivity;
import com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneUtil;
import com.ss.android.vc.meeting.module.feedback.C61676d;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.preview.facade.MeetingPreviewLauncher;
import com.ss.android.vc.meeting.module.receiver.AudioReceiverHolder;
import com.ss.android.vc.meeting.module.sharebox.LocalSharePrepareActivity;
import com.ss.android.vc.meeting.utils.TimeConsumeUtils;
import com.ss.android.vc.meeting.utils.UserCallStatusMonitor;
import com.ss.android.vc.meeting.utils.meetingcheck.C63511a;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckData;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckUtils;
import com.ss.android.vc.meeting.utils.meetingcheck.rx.XConsumer;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.request.VcBizTask;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.service.C63635e;
import com.ss.android.vc.service.IVideoChatService;
import com.ss.android.vc.service.VideoChatCalleeType;
import com.ss.android.vc.service.VideoChatManager;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vc.statistics.event.C63736af;
import com.ss.android.vc.statistics.event.C63759i;
import com.ss.android.vc.statistics.event.LocalShareEvent;
import com.ss.android.vc.statistics.event.MeetingEntryEvent2;
import com.ss.android.vc.statistics.event.aj;
import com.ss.android.vc.statistics.event2.MeetingEntryEvent3;
import com.ss.android.vc.statistics.p3180a.C63687b;
import com.ss.android.vc.statistics.p3180a.C63697g;
import com.ss.android.vc.statistics.p3182c.C63726b;
import com.ss.android.vcxp.C63801c;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;
import com.ss.android.vcxp.annotation.XSingleton;
import io.reactivex.functions.Consumer;
import io.reactivex.p3457e.C68296b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import org.json.JSONObject;

@XClass(isSingleton = true, runOnProcess = XProcess.VC)
public class VideoChatService implements IVideoChatService {

    /* renamed from: a */
    private final ReentrantLock f160692a;

    /* renamed from: b */
    private final AtomicBoolean f160693b;

    /* renamed from: c */
    private VideoChatInitor f160694c;

    /* renamed from: d */
    private HashMap<Integer, Integer> f160695d;

    /* renamed from: e */
    private List<IAppConfigurationChangeListener> f160696e;

    @XClass(autoRelease = true, runOnProcess = XProcess.Original)
    public interface OnInitFinishListener {
        void onInited();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.service.impl.VideoChatService$a */
    public static final class C63680a {

        /* renamed from: a */
        public static final VideoChatService f160759a = new VideoChatService();
    }

    @XSingleton
    /* renamed from: d */
    public static VideoChatService m249602d() {
        return C63680a.f160759a;
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    @XMethod(runOnProcess = XProcess.Main)
    public void dismissLoadingDialog() {
        DialogC60856d.m236548a();
    }

    /* renamed from: f */
    public boolean mo220182f() {
        return C61676d.f154755a;
    }

    /* renamed from: g */
    public void mo220183g() {
        EnterprisePhoneUtil.m240608a();
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    @XMethod
    public void notifyVoipOnCall() {
        UserCallStatusMonitor.m248760a();
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    /* renamed from: a */
    public boolean mo220080a() {
        return this.f160693b.get();
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    /* renamed from: a */
    public void mo220078a(String str, String str2) {
        EnterprisePhoneUtil.m240614a(str, str2);
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    /* renamed from: a */
    public void mo220075a(OpenChatter openChatter, String str, String str2, boolean z, boolean z2, IVideoChatService.AbstractC63626a aVar) {
        mo220076a(VideoChatCalleeType.OPEN_CHATTER, openChatter, (ReservationInfoEntity) null, str, str2, z, z2, aVar);
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    /* renamed from: a */
    public void mo220076a(final VideoChatCalleeType videoChatCalleeType, final OpenChatter openChatter, final ReservationInfoEntity reservationInfoEntity, final String str, final String str2, final boolean z, final boolean z2, final IVideoChatService.AbstractC63626a aVar) {
        C60700b.m235851b("VideoChatService", "[launchVideoChat]", "start...");
        C63687b.m249666a();
        asyncCheckAndInit(new OnInitFinishListener() {
            /* class com.ss.android.vc.service.impl.VideoChatService.C636713 */

            @Override // com.ss.android.vc.service.impl.VideoChatService.OnInitFinishListener
            @XMethod
            public void onInited() {
                Activity activity;
                if (DesktopUtil.m144301a(ar.m236694a())) {
                    activity = C36519d.m144080a().mo134826h();
                } else {
                    activity = VideoChatModuleDependency.getLifeCycleDependency().mo196414b();
                }
                if (!C63634c.m249496b("lark.client.contact.opt")) {
                    VideoChatService.this.requestPermitAndLaunchSingle(videoChatCalleeType, openChatter, reservationInfoEntity, str, str2, z, z2);
                    return;
                }
                C63511a.m248909a(activity).subscribe(new Consumer(videoChatCalleeType, reservationInfoEntity, openChatter, activity, str2, UUID.randomUUID().toString(), aVar, str, z, z2) {
                    /* class com.ss.android.vc.service.impl.$$Lambda$VideoChatService$3$WN1qevFJZ8d1knZpQhh_5XsPQw */
                    public final /* synthetic */ VideoChatCalleeType f$1;
                    public final /* synthetic */ boolean f$10;
                    public final /* synthetic */ ReservationInfoEntity f$2;
                    public final /* synthetic */ OpenChatter f$3;
                    public final /* synthetic */ Activity f$4;
                    public final /* synthetic */ String f$5;
                    public final /* synthetic */ String f$6;
                    public final /* synthetic */ IVideoChatService.AbstractC63626a f$7;
                    public final /* synthetic */ String f$8;
                    public final /* synthetic */ boolean f$9;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                        this.f$5 = r6;
                        this.f$6 = r7;
                        this.f$7 = r8;
                        this.f$8 = r9;
                        this.f$9 = r10;
                        this.f$10 = r11;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        VideoChatService.C636713.this.m249630a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, (Boolean) obj);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m249630a(final VideoChatCalleeType videoChatCalleeType, final ReservationInfoEntity reservationInfoEntity, final OpenChatter openChatter, Activity activity, final String str, String str2, final IVideoChatService.AbstractC63626a aVar, final String str3, final boolean z, final boolean z2, Boolean bool) throws Exception {
                JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType joinMeetingCheckIDType;
                String str4;
                if (bool.booleanValue()) {
                    JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType joinMeetingCheckIDType2 = JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.CALL_TARGET_USER;
                    if (videoChatCalleeType == VideoChatCalleeType.RESERVATION_PSTN_SIP) {
                        str4 = reservationInfoEntity.mo210085b();
                        joinMeetingCheckIDType = JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.RESERVATION_ID;
                    } else {
                        str4 = openChatter.getId();
                        joinMeetingCheckIDType = JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.CALL_TARGET_USER;
                    }
                    MeetingCheckUtils.meetingCheck(activity, str4, joinMeetingCheckIDType, false, str, str2, 1, true, false).subscribe(new XConsumer<MeetingCheckData>() {
                        /* class com.ss.android.vc.service.impl.VideoChatService.C636713.C636721 */

                        @XMethod
                        public void accept(MeetingCheckData bVar) {
                            C26171w.m94675a(new Runnable(bVar, aVar, videoChatCalleeType, openChatter, reservationInfoEntity, str3, str, z, z2) {
                                /* class com.ss.android.vc.service.impl.$$Lambda$VideoChatService$3$1$wQ5FocCGi2ehy6z8qSfL7bjGat4 */
                                public final /* synthetic */ MeetingCheckData f$1;
                                public final /* synthetic */ IVideoChatService.AbstractC63626a f$2;
                                public final /* synthetic */ VideoChatCalleeType f$3;
                                public final /* synthetic */ OpenChatter f$4;
                                public final /* synthetic */ ReservationInfoEntity f$5;
                                public final /* synthetic */ String f$6;
                                public final /* synthetic */ String f$7;
                                public final /* synthetic */ boolean f$8;
                                public final /* synthetic */ boolean f$9;

                                {
                                    this.f$1 = r2;
                                    this.f$2 = r3;
                                    this.f$3 = r4;
                                    this.f$4 = r5;
                                    this.f$5 = r6;
                                    this.f$6 = r7;
                                    this.f$7 = r8;
                                    this.f$8 = r9;
                                    this.f$9 = r10;
                                }

                                public final void run() {
                                    VideoChatService.C636713.C636721.this.m249631a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9);
                                }
                            });
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public /* synthetic */ void m249631a(MeetingCheckData bVar, IVideoChatService.AbstractC63626a aVar, VideoChatCalleeType videoChatCalleeType, OpenChatter openChatter, ReservationInfoEntity reservationInfoEntity, String str, String str2, boolean z, boolean z2) {
                            JoinMeetingPreCheckEntity b = bVar.mo219665b();
                            if (b == null) {
                                C60700b.m235864f("VideoChatService", "[launchVideoChat2]", " launch failed because of response is null");
                            } else if (b.f152604a == JoinMeetingPreCheckEntity.JoinMeetingCheckType.COLLABORATION_BLOCKED) {
                                C60700b.m235864f("VideoChatService", "[launchVideoChat3]", "launch failed because of collaboration blocked");
                                if (aVar != null) {
                                    aVar.onError(VCLaunchError.COLLABORATION_AUTH_FAILED_BLOCKED);
                                }
                            } else if (b.f152604a == JoinMeetingPreCheckEntity.JoinMeetingCheckType.COLLABORATION_NO_RIGHTS) {
                                C60700b.m235864f("VideoChatService", "[launchVideoChat4]", "launch failed because of collaboration no right");
                                if (aVar != null) {
                                    aVar.onError(VCLaunchError.COLLABORATION_AUTH_FAILED_NO_RIGHTS);
                                }
                            } else if (b.f152604a == JoinMeetingPreCheckEntity.JoinMeetingCheckType.COLLABORATION_BE_BLOCKED) {
                                C60700b.m235864f("VideoChatService", "[launchVideoChat5]", "launch failed because of collaboration be blocked");
                                if (aVar != null) {
                                    aVar.onError(VCLaunchError.COLLABORATION_AUTH_FAILED_BE_BLOCKED);
                                }
                            } else if (bVar.mo219661a().booleanValue()) {
                                C60700b.m235851b("VideoChatService", "[launchVideoChat6]", "meeting preCheck passed");
                                VideoChatService.this.requestPermitAndLaunchSingle(videoChatCalleeType, openChatter, reservationInfoEntity, str, str2, z, z2);
                            }
                        }
                    });
                }
            }
        });
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    /* renamed from: a */
    public void mo220077a(String str, IDTypeEntity iDTypeEntity, final IGetDataCallback<C60979m> iGetDataCallback) {
        VcBizSender.m249230b(str, iDTypeEntity).mo219893b(new AbstractC63598b<C60979m>() {
            /* class com.ss.android.vc.service.impl.VideoChatService.C636745 */

            /* renamed from: a */
            public void onSuccess(C60979m mVar) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(mVar);
                }
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null && eVar != null) {
                    iGetDataCallback.onError(eVar.f160599b);
                }
            }
        });
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    /* renamed from: a */
    public void mo220079a(boolean z) {
        if (z) {
            try {
                Statistics.sendEvent("vc_call_click", new JSONObject().put("action_name", "encryption_chat"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    /* renamed from: a */
    public void mo220072a(Context context, OpenChatter openChatter, IVideoChatService.AbstractC63627b bVar) {
        if (!C63634c.m249496b("lark.client.contact.opt")) {
            bVar.mo197025a();
        } else {
            C63511a.m248909a(context).subscribe(new Consumer(context, openChatter, bVar) {
                /* class com.ss.android.vc.service.impl.$$Lambda$VideoChatService$VUO4FHgaBHghIJSKJqvExCIBh2M */
                public final /* synthetic */ Context f$1;
                public final /* synthetic */ OpenChatter f$2;
                public final /* synthetic */ IVideoChatService.AbstractC63627b f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    VideoChatService.this.m249596a(this.f$1, this.f$2, this.f$3, (Boolean) obj);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo220179a(IAppConfigurationChangeListener aVar) {
        List<IAppConfigurationChangeListener> list;
        if (aVar != null && (list = this.f160696e) != null && !list.contains(aVar)) {
            this.f160696e.add(aVar);
        }
    }

    /* renamed from: a */
    public void mo220178a(Configuration configuration) {
        C60700b.m235843a("VideoChatService", "[onConfigurationChanged]", "newConfig is " + configuration);
        C60776r.m236145c();
        for (IAppConfigurationChangeListener aVar : this.f160696e) {
            if (aVar != null) {
                aVar.mo213662a(configuration);
            }
        }
        if (UDUiModeUtils.m93320a(configuration) != C60776r.m236156n()) {
            m249603l();
        }
        C60776r.m236142a(UDUiModeUtils.m93320a(configuration));
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    /* renamed from: c */
    public boolean mo220083c() {
        return VideoChatAdminSettings.m239411c();
    }

    /* renamed from: e */
    public boolean mo220181e() {
        return MeetingManager.m238341a().mo211899f();
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    @XMethod(runOnProcess = XProcess.Main)
    public boolean isLiveInFloat() {
        return VideoChatModuleDependency.getMinutesDependency().mo196444f();
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    @XMethod
    public boolean isRinging() {
        return MeetingManager.m238341a().mo211898e();
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    /* renamed from: b */
    public void mo220082b() {
        MeetingManager.m238341a().mo211891a(C61344j.m239002a().mo212329a(211));
        RvcManager.f153240a.mo211551a((String) null);
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    @XMethod(runOnProcess = XProcess.Main)
    public void interruptFloatLive() {
        C60700b.m235851b("VideoChatService", "[interruptFloatLive]", "interrupt");
        VideoChatModuleDependency.getMinutesDependency().mo196445g();
    }

    /* renamed from: k */
    public void mo220190k() {
        VideoChatModule.getDependency().getPreloadXMLDependency().mo196461a(new Integer[]{Integer.valueOf((int) R.layout.activity_meeting_preview)});
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    @XMethod
    public void otherOpenCamera() {
        C60700b.m235851b("VideoChatService", "[otherOpenCamera]", "otherOpenCamera");
        C61303k kVar = (C61303k) MeetingManager.m238341a().mo211906j();
        if (kVar != null) {
            kVar.mo212165y().mo212017d();
        }
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    @XMethod
    public void unInit() {
        AudioReceiverHolder.f158409a.mo217327b(ar.m236694a());
        C63635e.m249513a().mo220152c();
    }

    /* renamed from: h */
    public void mo220185h() {
        C60700b.m235843a("VideoChatService", "[preloadLayout]", "preloadLayout");
        if (VideoChatModule.getDependency().getPreloadXMLDependency().isPreloadEnabled()) {
            VideoChatModule.getDependency().getPreloadXMLDependency().mo196460a(m249602d().f160695d);
        }
    }

    @XMethod
    public boolean hasMeetingOngoingOnVcVoip() {
        boolean z;
        boolean a = MeetingManager.m238341a().mo211892a(true);
        an voIpDependency = VideoChatModuleDependency.getVoIpDependency();
        if (voIpDependency == null || !voIpDependency.hasMeetingOngoing()) {
            z = false;
        } else {
            z = true;
        }
        C60700b.m235851b("VideoChatService", "[hasMeetingOngoingOnVcVoip]", "vc = " + a + ", voip = " + z);
        if (a || z) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public void mo220187i() {
        C60700b.m235843a("VideoChatService", "[clearPreloadCache]", "clearPreloadCache");
        VideoChatModule.getDependency().getPreloadXMLDependency().mo196461a((Integer[]) this.f160695d.keySet().toArray(new Integer[0]));
    }

    /* renamed from: j */
    public void mo220188j() {
        if (VideoChatModule.getDependency().getPreloadXMLDependency().isPreloadEnabled()) {
            mo220190k();
            HashMap hashMap = new HashMap(1);
            hashMap.put(Integer.valueOf((int) R.layout.activity_meeting_preview), 1);
            VideoChatModule.getDependency().getPreloadXMLDependency().mo196460a(hashMap);
        }
    }

    private VideoChatService() {
        this.f160692a = new ReentrantLock();
        this.f160693b = new AtomicBoolean(false);
        this.f160694c = new VideoChatInitor();
        this.f160695d = new HashMap<>();
        this.f160696e = new ArrayList();
        this.f160695d.put(Integer.valueOf((int) R.layout.fragment_in_meeting_ui_skeleton), 1);
        this.f160695d.put(Integer.valueOf((int) R.layout.vc_top_bar_layout), 1);
        this.f160695d.put(Integer.valueOf((int) R.layout.vc_bottom_bar_layout), 1);
        this.f160695d.put(Integer.valueOf((int) R.layout.layout_vc_reaction_panel_top), 1);
        this.f160695d.put(Integer.valueOf((int) R.layout.vc_view_im_general), 1);
        this.f160695d.put(Integer.valueOf((int) R.layout.fragment_meeting_2), 1);
    }

    /* renamed from: l */
    private void m249603l() {
        ByteRTCMeetingActivity a;
        C61303k kVar = (C61303k) MeetingManager.m238341a().mo211908l();
        if (kVar != null && kVar.aE().mo208293c() && (a = kVar.aE().mo208290a()) != null && !a.isFinishing()) {
            if (kVar.mo212067p() == DisplayMode.WINDOW || kVar.mo212067p() == DisplayMode.FAST_ENTRY) {
                a.finishAndRemoveTask();
                return;
            }
            ByteRTCMeetingActivity.m244035a(true);
            MeetingShadowActivity.m239604a(ar.m236694a(), true, a);
        }
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    @XMethod
    public void checkAndInit() {
        if (!mo220080a()) {
            long currentTimeMillis = System.currentTimeMillis();
            C60700b.m235851b("VideoChatService", "[checkAndInit]", "BEGIN");
            try {
                this.f160692a.lock();
                if (!mo220080a()) {
                    this.f160694c.mo220168a(ar.m236694a());
                    this.f160693b.compareAndSet(false, true);
                    if (VideoChatModuleDependency.getLoginDependency().isLogin() && !VideoChatModuleDependency.getLoginDependency().mo196421c()) {
                        this.f160694c.mo220172c();
                    }
                    VideoChatModuleDependency.getVoIpDependency().initVoIp();
                    this.f160692a.unlock();
                    C60700b.m235851b("VideoChatService", "[checkAndInit2]", "END, time = " + (System.currentTimeMillis() - currentTimeMillis));
                }
            } finally {
                this.f160692a.unlock();
            }
        }
    }

    @XMethod
    public void recoverX() {
        long currentTimeMillis = System.currentTimeMillis();
        C60700b.m235851b("VideoChatService", "[recoverX]", "BEGIN");
        try {
            this.f160694c.mo220169a(ar.m236694a(), true);
            VideoChatModuleDependency.getVoIpDependency().initVoIp();
            if (MeetingManager.m238341a().mo211892a(true)) {
                VcBizSender.m249214a(MeetingManager.m238341a().mo211908l().mo212056e(), VideoChatManager.m249444a().mo220132j(), StartByteviewHeartbeatEntityRequest.ServiceType.VC);
            }
            if (VideoChatModuleDependency.getLoginDependency().isLogin() && !VideoChatModuleDependency.getLoginDependency().mo196421c()) {
                this.f160694c.mo220172c();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        C60700b.m235851b("VideoChatService", "[recoverX2]", "END, time = " + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: b */
    public void mo220180b(IAppConfigurationChangeListener aVar) {
        List<IAppConfigurationChangeListener> list = this.f160696e;
        if (list != null && aVar != null) {
            list.remove(aVar);
        }
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    @XMethod
    public boolean isOngoing(boolean z) {
        return MeetingManager.m238341a().mo211892a(z);
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    @XMethod
    public void asyncCheckAndInit(final OnInitFinishListener onInitFinishListener) {
        if (mo220080a()) {
            C60735ab.m236001a(new Runnable() {
                /* class com.ss.android.vc.service.impl.VideoChatService.RunnableC636691 */

                public void run() {
                    OnInitFinishListener onInitFinishListener = onInitFinishListener;
                    if (onInitFinishListener != null) {
                        onInitFinishListener.onInited();
                    }
                }
            });
            return;
        }
        C60700b.m235851b("VideoChatService", "[asyncCheckAndInit]", "need init");
        C60735ab.m235996a(new AbstractC60728a<Void>() {
            /* class com.ss.android.vc.service.impl.VideoChatService.C636702 */

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public Void mo208348a() {
                VideoChatService.this.checkAndInit();
                return null;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo208351b(Void r1) {
                super.mo208351b(r1);
                OnInitFinishListener onInitFinishListener = onInitFinishListener;
                if (onInitFinishListener != null) {
                    onInitFinishListener.onInited();
                }
            }
        });
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    @XMethod
    public boolean isVCUrl(String str) {
        boolean z;
        boolean z2;
        if (RvcJSProtocol.m237940a(str)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (C26252ad.m94993b(ar.m236694a()) || C63801c.m250500a(C26252ad.m94994c(ar.m236694a()))) {
            C60700b.m235843a("VideoChatService", "[isVCUrl3]", "url= " + str);
            Uri parse = Uri.parse(str);
            VideoChatConfig j = VideoChatManager.m249444a().mo220132j();
            if (j == null) {
                C60700b.m235843a("VideoChatService", "[isVCUrl2]", "end for config is null");
                return false;
            }
            List<String> meetingUrlKeys = j.getMeetingUrlKeys();
            List<String> meetingUrlPathKeys = j.getMeetingUrlPathKeys();
            if (CollectionUtils.isEmpty(meetingUrlKeys) || CollectionUtils.isEmpty(meetingUrlPathKeys)) {
                C60700b.m235843a("VideoChatService", "[isVCUrl2]", "end for invalid keys");
                return false;
            }
            Iterator<String> it = meetingUrlKeys.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().equals(parse.getHost())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            C60700b.m235843a("VideoChatService", "[isVCUrl4]", "targetDomain= " + z);
            if (z) {
                C60700b.m235843a("VideoChatService", "[isVCUrl5]", "target domain success: path= " + parse.getPath());
                Iterator<String> it2 = meetingUrlPathKeys.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Pattern.compile(it2.next(), 2).matcher(parse.getPath()).find()) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (!z2) {
                    C60700b.m235843a("VideoChatService", "[isVCUrl6]", "target path fail");
                }
            } else {
                z2 = false;
            }
            C60700b.m235843a("VideoChatService", "[isVCUrl2]", "end for success");
            if (!z || !z2) {
                return false;
            }
            return true;
        }
        C60700b.m235851b("VideoChatService", "[isVCUrl]", " call from unexpected Process, return false");
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m249597a(Context context, String str) {
        openJoinMeetingPage(context, str, null);
    }

    @XMethod(methodId = "1")
    public void openJoinMeetingPage(Context context, String str) {
        asyncCheckAndInit(new OnInitFinishListener(context, str) {
            /* class com.ss.android.vc.service.impl.$$Lambda$VideoChatService$XGXqYmzA0PqEiaOvSJmB8044xyQ */
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.vc.service.impl.VideoChatService.OnInitFinishListener
            public final void onInited() {
                VideoChatService.this.m249597a((VideoChatService) this.f$1, (Context) this.f$2);
            }
        });
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    @XMethod(runOnProcess = XProcess.Main)
    public void showLoadingDialog(Context context, String str) {
        if (context != null) {
            if (TextUtils.isEmpty(str)) {
                str = context.getResources().getString(R.string.View_VM_Loading);
            }
            DialogC60856d.m236549a(VideoChatModuleDependency.getLifeCycleDependency().mo196414b(), str);
        }
    }

    @XMethod
    public void openCreateMeetingPage(final Context context, final String str) {
        C63697g.m249703a();
        final C68296b<Boolean> a = TimeConsumeUtils.m248927a("VideoChatService:openCreateMeetingPage:MeetingCheck");
        final String uuid = UUID.randomUUID().toString();
        MeetingCheckUtils.meetingCheck(context, "0", JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.GROUPID, false, str, uuid, 0, true).subscribe(new XConsumer<MeetingCheckData>() {
            /* class com.ss.android.vc.service.impl.VideoChatService.AnonymousClass11 */

            @XMethod
            public void accept(MeetingCheckData bVar) throws Exception {
                if (bVar.mo219661a().booleanValue()) {
                    TimeConsumeUtils.m248928a(a);
                    VideoChatService.this.launchVideoMeeting(context, null, "0", IDTypeEntity.GROUP_ID, "", str, uuid, bVar.mo219666c());
                }
            }
        });
    }

    @XMethod
    public void openLocalSharePage(Context context, String str) {
        int i;
        boolean z;
        VideoChat videoChat;
        C60700b.m235851b("VideoChatService", "[openLocalSharePage]", "source is " + str);
        String uuid = UUID.randomUUID().toString();
        C61303k kVar = (C61303k) MeetingManager.m238341a().mo211906j();
        if (kVar == null) {
            i = 0;
        } else {
            i = 1;
        }
        LocalShareEvent.m249993a(str, i, uuid);
        if (kVar == null || kVar.mo212056e() == null || kVar.mo212056e().getVideoChatSettings() == null || kVar.mo212056e().getVideoChatSettings().getSubType() != VideoChatSettings.SubType.SCREEN_SHARE || !kVar.mo212056e().getVideoChatSettings().isBoxSharing()) {
            LocalSharePrepareActivity.m246698a(context, str, uuid);
        } else {
            ByteRTCMeetingActivity.m244032a(kVar);
        }
        MeetingEntryEvent2 a = MeetingEntryEvent2.m250016a();
        if (kVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (kVar != null) {
            videoChat = kVar.mo212056e();
        } else {
            videoChat = null;
        }
        a.mo220390a("share_screen", "none", z, videoChat, uuid);
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    @XMethod
    public void openVCUrl(Context context, String str) {
        String str2;
        if (RvcJSProtocol.m237940a(str)) {
            Uri parse = Uri.parse(str);
            if (TextUtils.isEmpty(parse.getQueryParameter("paddingTop"))) {
                Locale languageSetting = VideoChatModuleDependency.getLanguageDependency().getLanguageSetting();
                Uri.Builder buildUpon = parse.buildUpon();
                str = buildUpon.appendQueryParameter("lang", languageSetting.getLanguage().toLowerCase(Locale.getDefault()) + languageSetting.getCountry().toUpperCase(Locale.getDefault())).appendQueryParameter("paddingTop", String.valueOf(UIUtils.px2dip(context, (float) UIUtils.getStatusBarHeight(context)))).appendQueryParameter("deviceID", VideoChatModuleDependency.m236629b()).build().toString();
            }
            RvcActivity.m237918a(context, str);
            return;
        }
        Uri parse2 = Uri.parse(str);
        Pattern compile = Pattern.compile("[^0-9]", 2);
        String queryParameter = parse2.getQueryParameter("no");
        if (!TextUtils.isEmpty(queryParameter)) {
            str2 = compile.matcher(queryParameter).replaceAll("").trim();
        } else {
            str2 = compile.matcher(parse2.getPath()).replaceAll("").trim();
        }
        if (TextUtils.isEmpty(str2)) {
            C60700b.m235851b("VideoChatService", "[openVCUrl]", "fail with empty meeting number ");
            return;
        }
        if (str2.length() > 9) {
            str2 = str2.substring(0, 9);
        }
        C60700b.m235851b("VideoChatService", "[openVCUrl2]", "url: " + str + " meetingNo: " + str2);
        openJoinMeetingPage(context, "meeting_link_join", str2);
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    /* renamed from: a */
    public void mo220074a(OpenChatter openChatter, String str, String str2) {
        EnterprisePhoneUtil.m240610a(openChatter, str, str2);
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    /* renamed from: a */
    public void mo220073a(Context context, String str, String str2) {
        MeetingPreviewLauncher.m245470b(context, UUID.randomUUID().toString(), str, str2, true);
    }

    @XMethod
    public void loadLatestVideoChatInfo(String str, IDTypeEntity iDTypeEntity, final IGetDataCallback<C60978l> iGetDataCallback) {
        VcBizSender.m249174a(str, iDTypeEntity).mo219889a(new AbstractC63598b<C60978l>() {
            /* class com.ss.android.vc.service.impl.VideoChatService.C636756 */

            /* renamed from: a */
            public void onSuccess(C60978l lVar) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(lVar);
                }
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null && eVar != null) {
                    iGetDataCallback.onError(eVar.f160599b);
                }
            }
        });
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    @XMethod(methodId = "2")
    public void openJoinMeetingPage(final Context context, final String str, final String str2) {
        C63697g.m249703a();
        final C68296b<Boolean> a = TimeConsumeUtils.m248927a("VideoChatService:openJoinMeetingPage:MeetingCheck");
        final String uuid = UUID.randomUUID().toString();
        MeetingCheckUtils.meetingCheck(context, "0", JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.GROUPID, false, str, uuid, 1, true).subscribe(new XConsumer<MeetingCheckData>() {
            /* class com.ss.android.vc.service.impl.VideoChatService.C636788 */

            @XMethod
            public void accept(MeetingCheckData bVar) throws Exception {
                if (bVar.mo219661a().booleanValue()) {
                    TimeConsumeUtils.m248928a(a);
                    aj.m250015a(str, false, null, uuid);
                    MeetingPreviewLauncher.m245465a(context, uuid, bVar.mo219666c(), str2);
                }
            }
        });
        if (TextUtils.equals(str, "meeting_link_join")) {
            MeetingEntryEvent3.m249802a().mo220286a("msg_link", "vc_meeting_pre_view", null, uuid);
        }
    }

    @XMethod(methodId = "3")
    public void openNormalJoinMeetingPage(final Context context, final String str, final String str2, final String str3) {
        C63697g.m249703a();
        final C68296b<Boolean> a = TimeConsumeUtils.m248927a("VideoChatService:openNormalJoinMeetingPage:MeetingCheck");
        final String uuid = UUID.randomUUID().toString();
        MeetingCheckUtils.meetingCheck(context, "0", JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.GROUPID, false, str, uuid, 1, true).subscribe(new XConsumer<MeetingCheckData>() {
            /* class com.ss.android.vc.service.impl.VideoChatService.C636799 */

            @XMethod
            public void accept(MeetingCheckData bVar) throws Exception {
                if (bVar.mo219661a().booleanValue()) {
                    TimeConsumeUtils.m248928a(a);
                    if (!TextUtils.equals(str, "tab_meeting_detail_join")) {
                        aj.m250015a(str, false, null, uuid);
                    }
                    MeetingPreviewLauncher.showJoinPreviewPage(context, str2, str3, false, uuid, bVar.mo219666c());
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m249596a(Context context, OpenChatter openChatter, final IVideoChatService.AbstractC63627b bVar, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            MeetingCheckUtils.meetingCheck(context, openChatter.getId(), JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.CALL_TARGET_USER, false, "", UUID.randomUUID().toString(), 1, true, false).subscribe(new XConsumer<MeetingCheckData>() {
                /* class com.ss.android.vc.service.impl.VideoChatService.AnonymousClass10 */

                @XMethod
                public void accept(MeetingCheckData bVar) throws Exception {
                    C60735ab.m236001a(new Runnable(bVar) {
                        /* class com.ss.android.vc.service.impl.$$Lambda$VideoChatService$10$HsJnMllvE_Ff6VVECjwfcJwm_4 */
                        public final /* synthetic */ IVideoChatService.AbstractC63627b f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            VideoChatService.AnonymousClass10.m249625a(MeetingCheckData.this, this.f$1);
                        }
                    });
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m249625a(MeetingCheckData bVar, IVideoChatService.AbstractC63627b bVar2) {
                    JoinMeetingPreCheckEntity b = bVar.mo219665b();
                    if (b == null) {
                        C60700b.m235864f("VideoChatService", "[checkVoIpCollaborationAuth]", "launch failed because of response is null");
                    } else if (b.f152604a == JoinMeetingPreCheckEntity.JoinMeetingCheckType.COLLABORATION_BLOCKED) {
                        C60700b.m235864f("VideoChatService", "[checkVoIpCollaborationAuth2]", "launch failed because of collaboration blocked");
                        if (bVar2 != null) {
                            bVar2.mo197026a(VCLaunchError.COLLABORATION_AUTH_FAILED_BLOCKED);
                        }
                    } else if (b.f152604a == JoinMeetingPreCheckEntity.JoinMeetingCheckType.COLLABORATION_NO_RIGHTS) {
                        C60700b.m235864f("VideoChatService", "[checkVoIpCollaborationAuth3]", "launch failed because of collaboration no right");
                        if (bVar2 != null) {
                            bVar2.mo197026a(VCLaunchError.COLLABORATION_AUTH_FAILED_NO_RIGHTS);
                        }
                    } else if (b.f152604a == JoinMeetingPreCheckEntity.JoinMeetingCheckType.COLLABORATION_BE_BLOCKED) {
                        C60700b.m235864f("VideoChatService", "[checkVoIpCollaborationAuth4]", "launch failed because of collaboration be blocked");
                        if (bVar2 != null) {
                            bVar2.mo197026a(VCLaunchError.COLLABORATION_AUTH_FAILED_BE_BLOCKED);
                        }
                    } else if (bVar.mo219661a().booleanValue()) {
                        C60700b.m235851b("VideoChatService", "[checkVoIpCollaborationAuth5]", "meeting preCheck passed");
                        if (bVar2 != null) {
                            bVar2.mo197025a();
                        }
                    }
                }
            });
        }
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    @XMethod
    public void joinVideoMeeting(Context context, String str, String str2, String str3, VideoChat.VendorType vendorType) {
        asyncCheckAndInit(new OnInitFinishListener(str, str2, str3, context, vendorType) {
            /* class com.ss.android.vc.service.impl.$$Lambda$VideoChatService$cUQGu3nnEeuLd9IoqUlorkwRFV8 */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ Context f$3;
            public final /* synthetic */ VideoChat.VendorType f$4;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // com.ss.android.vc.service.impl.VideoChatService.OnInitFinishListener
            public final void onInited() {
                VideoChatService.m249600a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m249600a(String str, String str2, String str3, Context context, VideoChat.VendorType vendorType) {
        C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(str);
        if (kVar == null || !kVar.mo212065n()) {
            aj.m250015a(str2, false, str, str3);
            VideoMeetingController.m249637a(context, str, str3, vendorType);
            return;
        }
        C63697g.m249707e();
        ByteRTCMeetingActivity.m244032a(kVar);
    }

    @XMethod
    public void joinMeetingById(final String str, final boolean z, final boolean z2, final String str2, final String str3, final AbstractC63598b<JoinMeetingEntity> bVar) {
        asyncCheckAndInit(new OnInitFinishListener() {
            /* class com.ss.android.vc.service.impl.VideoChatService.C636767 */

            @Override // com.ss.android.vc.service.impl.VideoChatService.OnInitFinishListener
            public void onInited() {
                VcBizTask<JoinMeetingEntity> b = VcBizSender.m249238b(str, z, z2, C60788y.m236247a(ar.m236694a()), C60788y.m236250b(ar.m236694a()));
                b.mo219889a(new AbstractC63598b<JoinMeetingEntity>() {
                    /* class com.ss.android.vc.service.impl.VideoChatService.C636767.C636771 */

                    /* renamed from: a */
                    public void onSuccess(JoinMeetingEntity joinMeetingEntity) {
                        bVar.onSuccess(joinMeetingEntity);
                    }

                    @Override // com.ss.android.vc.net.request.AbstractC63598b
                    public void onError(C63602e eVar) {
                        bVar.onError(eVar);
                    }
                });
                C63736af.m250004d(str2, str, str3, b.mo219895c());
            }
        });
    }

    @XMethod
    private void gotoSingleMeeting(final VideoChatCalleeType videoChatCalleeType, final OpenChatter openChatter, final ReservationInfoEntity reservationInfoEntity, final String str, final String str2, final boolean z, final boolean z2) {
        Context a = ar.m236694a();
        C60700b.m235851b("VideoChatService", "[gotoSingleMeeting]", "init, source = " + str2 + ", isSecretChat = " + z);
        C63511a.m248909a(a).subscribe(new Consumer<Boolean>() {
            /* class com.ss.android.vc.service.impl.VideoChatService.C636734 */

            /* renamed from: a */
            public void accept(Boolean bool) throws Exception {
                if (bool.booleanValue()) {
                    C63759i.m250293c();
                    C63759i.m250288a();
                    C60700b.m235851b("VideoChatService", "[gotoSingleMeeting2]", "[initVideoChat] success");
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (z2) {
                            jSONObject.put("only_voice", 1);
                        }
                        C63726b.m249914a("vc_monitor_caller_start", jSONObject);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    C60998v vVar = new C60998v();
                    vVar.f152836a = 2000;
                    if (videoChatCalleeType == VideoChatCalleeType.RESERVATION_PSTN_SIP) {
                        ReservationInfoEntity reservationInfoEntity = reservationInfoEntity;
                        if (reservationInfoEntity == null || reservationInfoEntity.mo210081a() == null || reservationInfoEntity.mo210081a().mo210091a() == null || reservationInfoEntity.mo210081a().mo210091a().size() <= 0 || reservationInfoEntity.mo210081a().mo210091a().get(0) == null) {
                            vVar.f152837b = "";
                            vVar.f152840e = ParticipantType.PSTN_USER;
                            vVar.f152838c = "";
                        } else {
                            ReservationInfoEntity.User bVar = reservationInfoEntity.mo210081a().mo210091a().get(0);
                            if (!(bVar.mo210099c() == null || bVar.mo210099c().mo210106b() == null)) {
                                vVar.f152839d = bVar.mo210099c().mo210106b().mo210100a();
                            }
                            if (bVar.mo210099c() == null || bVar.mo210099c().mo210103a() == null) {
                                vVar.f152838c = "";
                            } else {
                                vVar.f152838c = bVar.mo210099c().mo210103a();
                            }
                            vVar.f152837b = bVar.mo210098b();
                            vVar.f152840e = bVar.mo210094a();
                        }
                        vVar.f152857v = reservationInfoEntity.mo210085b();
                    } else {
                        vVar.f152839d = openChatter.getAvatarKey();
                        vVar.f152837b = openChatter.getId();
                        vVar.f152838c = VideoChatModuleDependency.getChatterNameDependency().getDisplayNameByAliaskName(openChatter);
                    }
                    vVar.f152841f = z;
                    vVar.f152852q = z2;
                    vVar.f152854s = UUID.randomUUID().toString();
                    vVar.f152856u = str2;
                    if (z) {
                        vVar.f152842g = str;
                    }
                    if (videoChatCalleeType == VideoChatCalleeType.OPEN_CHATTER && openChatter != null) {
                        C60700b.m235845a("Entry", "StateEngine", "launchCall uid = " + openChatter.getId(), "VideoChatService", "[launchVideoChat] uid = " + openChatter.getId());
                    }
                    VideoChatManager.m249444a().mo220108a(vVar);
                }
            }
        });
    }

    @XMethod(runOnProcess = XProcess.Main)
    public void requestPermitAndLaunchSingle(VideoChatCalleeType videoChatCalleeType, OpenChatter openChatter, ReservationInfoEntity reservationInfoEntity, String str, String str2, boolean z, boolean z2) {
        Activity activity;
        C60700b.m235851b("VideoChatService", "[requestRecordPermission]", "start ...");
        if (DesktopUtil.m144301a(ar.m236694a())) {
            activity = C36519d.m144080a().mo134826h();
        } else {
            activity = VideoChatModuleDependency.getLifeCycleDependency().mo196414b();
        }
        C26171w.m94675a(new Runnable(activity, z2, videoChatCalleeType, openChatter, reservationInfoEntity, str, str2, z) {
            /* class com.ss.android.vc.service.impl.$$Lambda$VideoChatService$qBkREXNrmv9IWoYVEt8tmfuQDug */
            public final /* synthetic */ Activity f$1;
            public final /* synthetic */ boolean f$2;
            public final /* synthetic */ VideoChatCalleeType f$3;
            public final /* synthetic */ OpenChatter f$4;
            public final /* synthetic */ ReservationInfoEntity f$5;
            public final /* synthetic */ String f$6;
            public final /* synthetic */ String f$7;
            public final /* synthetic */ boolean f$8;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r8;
                this.f$8 = r9;
            }

            public final void run() {
                VideoChatService.this.m249595a((VideoChatService) this.f$1, (Activity) this.f$2, (boolean) this.f$3, (VideoChatCalleeType) this.f$4, (OpenChatter) this.f$5, (ReservationInfoEntity) this.f$6, this.f$7, (String) this.f$8);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m249595a(Activity activity, boolean z, VideoChatCalleeType videoChatCalleeType, OpenChatter openChatter, ReservationInfoEntity reservationInfoEntity, String str, String str2, boolean z2) {
        C57805b.m224326a(activity, new C57805b.AbstractC57809a(z, videoChatCalleeType, openChatter, reservationInfoEntity, str, str2, z2, activity) {
            /* class com.ss.android.vc.service.impl.$$Lambda$VideoChatService$1o3ukpGhSMlhZPU9bdEEwtQUNY */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ VideoChatCalleeType f$2;
            public final /* synthetic */ OpenChatter f$3;
            public final /* synthetic */ ReservationInfoEntity f$4;
            public final /* synthetic */ String f$5;
            public final /* synthetic */ String f$6;
            public final /* synthetic */ boolean f$7;
            public final /* synthetic */ Activity f$8;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r8;
                this.f$8 = r9;
            }

            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
            public final void permissionGranted(boolean z) {
                VideoChatService.this.m249601a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, z);
            }
        });
    }

    @Override // com.ss.android.vc.service.IVideoChatService
    @XMethod
    public void launchVideoMeeting(Context context, String str, String str2, IDTypeEntity iDTypeEntity, String str3, String str4, String str5, VideoChat.VendorType vendorType) {
        asyncCheckAndInit(new OnInitFinishListener(str4, str5, context, str, str2, iDTypeEntity, str3, vendorType) {
            /* class com.ss.android.vc.service.impl.$$Lambda$VideoChatService$8cD5dRbRi_Dr5ebI1VW1nWYOG4 */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ Context f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ String f$4;
            public final /* synthetic */ IDTypeEntity f$5;
            public final /* synthetic */ String f$6;
            public final /* synthetic */ VideoChat.VendorType f$7;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r8;
            }

            @Override // com.ss.android.vc.service.impl.VideoChatService.OnInitFinishListener
            public final void onInited() {
                VideoChatService.m249599a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7);
            }
        });
    }

    /* renamed from: a */
    private void m249594a(Activity activity, VideoChatCalleeType videoChatCalleeType, OpenChatter openChatter, ReservationInfoEntity reservationInfoEntity, String str, String str2, boolean z, boolean z2) {
        C60700b.m235851b("VideoChatService", "[requestCameraPermitAndLaunchSingle]", "start ...");
        C57805b.m224331b(activity, new C57805b.AbstractC57809a(videoChatCalleeType, openChatter, reservationInfoEntity, str, str2, z, z2) {
            /* class com.ss.android.vc.service.impl.$$Lambda$VideoChatService$lq69oO1RugG6bTBUINogA32mm4s */
            public final /* synthetic */ VideoChatCalleeType f$1;
            public final /* synthetic */ OpenChatter f$2;
            public final /* synthetic */ ReservationInfoEntity f$3;
            public final /* synthetic */ String f$4;
            public final /* synthetic */ String f$5;
            public final /* synthetic */ boolean f$6;
            public final /* synthetic */ boolean f$7;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r8;
            }

            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
            public final void permissionGranted(boolean z) {
                VideoChatService.this.m249598a((VideoChatService) this.f$1, (VideoChatCalleeType) this.f$2, (OpenChatter) this.f$3, (ReservationInfoEntity) this.f$4, this.f$5, (String) this.f$6, this.f$7, z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m249598a(VideoChatCalleeType videoChatCalleeType, OpenChatter openChatter, ReservationInfoEntity reservationInfoEntity, String str, String str2, boolean z, boolean z2, boolean z3) {
        C60700b.m235851b("VideoChatService", "[requestCameraPermitAndLaunchSingle2]", "granted=" + z3);
        if (z3) {
            gotoSingleMeeting(videoChatCalleeType, openChatter, reservationInfoEntity, str, str2, z, z2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m249599a(String str, String str2, Context context, String str3, String str4, IDTypeEntity iDTypeEntity, String str5, VideoChat.VendorType vendorType) {
        aj.m250015a(str, true, "", str2);
        VideoMeetingController.m249638a(context, str3, str4, iDTypeEntity, str5, str2, vendorType);
    }

    @XMethod
    public void gotoVideoMeeting(List<String> list, String str, boolean z, String str2, boolean z2, MeetingConfig meetingConfig, AbstractC63598b bVar, String str3, String str4) {
        C60700b.m235851b("VideoChatService", "[gotoVideoMeeting]", "[initVideoChat] success");
        C60998v vVar = new C60998v();
        vVar.f152853r = bVar;
        vVar.f152836a = 2001;
        vVar.f152844i = list;
        vVar.f152843h = str;
        vVar.f152845j = z;
        vVar.f152846k = str2;
        vVar.f152847l = z2;
        vVar.f152854s = str3;
        vVar.f152855t = str4;
        if (meetingConfig != null) {
            VideoChatManager.m249444a().mo220115a(!meetingConfig.isCameraOn);
            VideoChatManager.m249444a().mo220118b(!meetingConfig.isAudioOn);
            VideoChatManager.m249444a().mo220113a(Boolean.valueOf(!meetingConfig.isSpeakerOn));
            VideoChatManager.m249444a().mo220117b(Boolean.valueOf(meetingConfig.isFrontCamera));
            VideoChatManager.m249444a().mo220121c(meetingConfig.isPlaybackDigitalMute);
            VideoChatManager.m249444a().mo220126e((Boolean) true);
        }
        vVar.f152848m = VideoChat.VendorType.RTC.getNumber();
        C60700b.m235845a("Entry", "StateEngine", "launchMeet groupId = " + str, "VideoChatService", "[gotoVideoMeeting] groupId = " + str + ",topic = " + str2);
        VideoChatManager.m249444a().mo220108a(vVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m249601a(boolean z, VideoChatCalleeType videoChatCalleeType, OpenChatter openChatter, ReservationInfoEntity reservationInfoEntity, String str, String str2, boolean z2, Activity activity, boolean z3) {
        C60700b.m235851b("VideoChatService", "[requestRecordPermission2]", "granted=" + z3);
        if (!z3) {
            return;
        }
        if (z) {
            gotoSingleMeeting(videoChatCalleeType, openChatter, reservationInfoEntity, str, str2, z2, z);
        } else {
            m249594a(activity, videoChatCalleeType, openChatter, reservationInfoEntity, str, str2, z2, z);
        }
    }
}
