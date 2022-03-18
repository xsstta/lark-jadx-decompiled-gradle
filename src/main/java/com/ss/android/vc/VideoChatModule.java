package com.ss.android.vc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.andserver.ServerManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.suite.R;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.chat.export.ui.p1673c.AbstractC34033a;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.pb.videochat.GetPstnSipFeatureConfigRequest;
import com.ss.android.lark.pb.videoconference.v1.GetAdminSettingsResponse;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.applink.openplatfrom.ReservationCallManager;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60754h;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.AbstractC60880ae;
import com.ss.android.vc.dependency.AbstractC60885b;
import com.ss.android.vc.dependency.AbstractC60894j;
import com.ss.android.vc.dependency.AbstractC60897m;
import com.ss.android.vc.dependency.AbstractC60901p;
import com.ss.android.vc.dependency.AbstractC60912x;
import com.ss.android.vc.dependency.IVideoChatDependency;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.diskmanage.VideoChatCleanTask;
import com.ss.android.vc.dto.NewGuideConfig;
import com.ss.android.vc.dto.VideoChatContent;
import com.ss.android.vc.entity.PstnDetailInfoResponse;
import com.ss.android.vc.entity.VcMsgInfo;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.p3092a.C60930c;
import com.ss.android.vc.entity.request.JoinCalendarGroupMeetingEntityRequest;
import com.ss.android.vc.entity.request.JoinMeetingPreCheckEntityRequest;
import com.ss.android.vc.entity.response.C60979m;
import com.ss.android.vc.entity.response.IDTypeEntity;
import com.ss.android.vc.entity.response.JoinMeetingPreCheckEntity;
import com.ss.android.vc.entity.response.ReservationInfoEntity;
import com.ss.android.vc.lark.chatbanner.VcInfoBannerImpl;
import com.ss.android.vc.lark.chattitlebar.TitleBarVcEntryView;
import com.ss.android.vc.lark.guidetips.C61087a;
import com.ss.android.vc.lark.guidetips.VideoChatGuideConstants;
import com.ss.android.vc.lark.message.meeting.p3100a.C61105c;
import com.ss.android.vc.lark.message.p3099a.C61097c;
import com.ss.android.vc.lark.message.vc.C61157f;
import com.ss.android.vc.lark.notification.prompt.C61159a;
import com.ss.android.vc.lark.notification.ringing.C61165a;
import com.ss.android.vc.lark.notification.ringing.offline.C61172b;
import com.ss.android.vc.lark.setting.C61190d;
import com.ss.android.vc.lark.setting.VideoChatSettingActivity;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.module.guides.NewGuideDelegate;
import com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.PstnInvitationDialogActivity;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.presetting.MeetingPreSettingActivity;
import com.ss.android.vc.meeting.module.preview.facade.MeetingPreviewLauncher;
import com.ss.android.vc.meeting.module.preview.guest.GuestJoinMeetingUtil;
import com.ss.android.vc.meeting.module.preview.interview.MeetingPreviewInterviewFragment;
import com.ss.android.vc.meeting.module.preview.openplatform.MeetingPreviewOpenPlatformModel;
import com.ss.android.vc.meeting.module.preview.openplatform.OpenPlatformGotoMeetingManager;
import com.ss.android.vc.meeting.module.tab.C63228b;
import com.ss.android.vc.meeting.module.xiaomivoip.C63460a;
import com.ss.android.vc.meeting.utils.PstnSipUtils;
import com.ss.android.vc.meeting.utils.TimeConsumeUtils;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckData;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckUtils;
import com.ss.android.vc.meeting.utils.meetingcheck.rx.XConsumer;
import com.ss.android.vc.net.push.VideoChatPush;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63601d;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.p3068a.C60658a;
import com.ss.android.vc.p3074c.C60688a;
import com.ss.android.vc.p3074c.C60691b;
import com.ss.android.vc.p3074c.C60693d;
import com.ss.android.vc.p3095h.C61002a;
import com.ss.android.vc.p3095h.C61004b;
import com.ss.android.vc.p3095h.C61008c;
import com.ss.android.vc.service.AbstractC63632a;
import com.ss.android.vc.service.AbstractC63633b;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.service.IVideoChatService;
import com.ss.android.vc.service.XIGetDataCallback;
import com.ss.android.vc.service.impl.ChatVideoMeetingCardService;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vc.statistics.event.br;
import com.ss.android.vc.statistics.p3180a.C63697g;
import com.ss.android.vc.trace.C63784a;
import com.ss.android.vcxp.C63801c;
import com.ss.android.vcxp.XListener;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;
import com.ss.android.vcxp.annotation.XSingleton;
import io.reactivex.functions.Consumer;
import io.reactivex.p3457e.C68296b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

@XClass(isSingleton = true, runOnProcess = XProcess.VC)
public class VideoChatModule {

    /* renamed from: a */
    private static String f151642a = "getsays.cn";

    /* renamed from: b */
    private static Pattern f151643b = Pattern.compile("/share/\\w+$");

    /* renamed from: c */
    private static final C60656d f151644c = new C60656d();

    /* renamed from: e */
    private static AbstractC60901p f151645e = null;

    /* renamed from: d */
    private IVcRtcStatsListener f151646d;

    @XClass
    public interface IVcRtcStatsListener {
        void onRtcStats(long j, long j2);
    }

    @XClass(autoRelease = true, runOnProcess = XProcess.Original)
    public interface IVideoChatStatusListener {
        void onMeetingStatusChanged(String str, IDTypeEntity iDTypeEntity, boolean z);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.VideoChatModule$a */
    public static class C60652a {

        /* renamed from: a */
        public static final VideoChatModule f151710a = new VideoChatModule();
    }

    /* renamed from: com.ss.android.vc.VideoChatModule$b */
    public interface AbstractC60653b {

        /* renamed from: com.ss.android.vc.VideoChatModule$b$a */
        public interface AbstractC60654a {
            /* renamed from: a */
            void mo196514a();

            /* renamed from: a */
            void mo196515a(View view, int i);

            /* renamed from: a */
            void mo196516a(String str);
        }
    }

    /* renamed from: e */
    public static String m235661e() {
        return "videochat";
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.VideoChatModule$c */
    public static class C60655c {

        /* renamed from: a */
        public String f151711a;

        /* renamed from: b */
        public boolean f151712b;

        /* renamed from: c */
        public String f151713c;

        private C60655c() {
        }

        /* renamed from: a */
        public static C60655c m235715a(OpenChat openChat) {
            C60655c cVar = new C60655c();
            cVar.f151711a = openChat.getId();
            cVar.f151713c = openChat.getName();
            cVar.f151712b = openChat.isMeeting();
            return cVar;
        }
    }

    private VideoChatModule() {
    }

    @XSingleton
    /* renamed from: c */
    public static VideoChatModule m235659c() {
        return C60652a.f151710a;
    }

    /* renamed from: i */
    public static C60656d m235665i() {
        return f151644c;
    }

    /* renamed from: q */
    public static List<AbstractC28490a> m235668q() {
        return C60658a.f151721a;
    }

    @XMethod
    private void sendCopyMeetingLinkX() {
        br.m250212a();
    }

    /* renamed from: d */
    public VideoChatCleanTask mo208160d() {
        return VideoChatCleanTask.f152859a;
    }

    /* renamed from: j */
    public void mo208166j() {
        sendCopyMeetingLinkX();
    }

    /* renamed from: a */
    public void mo208135a(Context context) {
        startVideoChatSettingActivityX(context);
    }

    /* renamed from: a */
    public void mo208136a(Context context, String str) {
        startPreVideoChatSettingActivityX(context, str);
    }

    /* renamed from: a */
    public void mo208144a(final AbstractC63633b bVar) {
        MeetingManager.m238341a().addMeetingsSizeChangeListener(new IMeetingsSizeChangeListener() {
            /* class com.ss.android.vc.VideoChatModule.C606351 */

            @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener
            /* renamed from: a */
            public /* synthetic */ void mo208172a(List list) {
                IMeetingsSizeChangeListener.CC.$default$a(this, list);
            }

            @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener
            public void onMeetingsEnd() {
                AbstractC63633b bVar = bVar;
                if (bVar != null) {
                    bVar.mo196519b();
                }
            }

            @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener
            public void onMeetingsBegin(boolean z) {
                C63784a.m250428a("[VideoChat_Module_addStatusChangedListener]");
                AbstractC63633b bVar = bVar;
                if (bVar != null) {
                    bVar.mo196518a();
                }
                C63784a.m250429b("[VideoChat_Module_addStatusChangedListener]");
            }
        });
    }

    /* renamed from: a */
    public void mo208134a(long j, long j2) {
        onRtcStatsX(j, j2);
    }

    /* renamed from: a */
    public void mo208145a(String str) {
        sendQRCodeScanEventX(str);
    }

    /* renamed from: a */
    public void mo208137a(Context context, String str, String str2) {
        joinCalendarGroupMeetingX(context, str, str2);
    }

    /* renamed from: a */
    public void mo208138a(Context context, String str, String str2, boolean z) {
        joinCalendarGroupMeetingX(context, str, str2, z);
    }

    /* renamed from: a */
    public void mo208140a(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        joinOpenPlatformMeetingX(context, str, z, z2, z3, z4);
    }

    /* renamed from: a */
    public void mo208139a(Context context, String str, boolean z) {
        joinOpenPlatformCallX(context, str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m235654a(final boolean z, final String str) {
        C60700b.m235851b("VideoChatModule", "[joinOpenPlatformCall]", "cameraMute = " + z);
        ReservationCallManager.f151819b.mo208263a().mo208262a(str, new AbstractC63598b<ReservationInfoEntity>() {
            /* class com.ss.android.vc.VideoChatModule.AnonymousClass11 */

            /* renamed from: a */
            public void onSuccess(ReservationInfoEntity reservationInfoEntity) {
                C60700b.m235851b("VideoChatModule", "[joinOpenPlatformCallX2]", "getReservationCallInfo onSuccess");
                if (reservationInfoEntity != null) {
                    ReservationCallManager.f151819b.mo208263a().mo208261a(reservationInfoEntity, z);
                    return;
                }
                ReservationCallManager.f151819b.mo208263a().mo208261a(new ReservationInfoEntity(str), z);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VideoChatModule", "[joinOpenPlatformCallX3]", "getReservationCallInfo onError " + eVar.toString());
                ReservationCallManager.f151819b.mo208263a().mo208261a(new ReservationInfoEntity(str), z);
            }
        });
    }

    /* renamed from: a */
    public void mo208147a(String str, String str2, String str3, String str4, String str5, String str6, GetPstnSipFeatureConfigRequest.CalendarType calendarType, String str7, IGetDataCallback<PstnDetailInfoResponse> iGetDataCallback) {
        PstnSipUtils.f160323b.mo219587a(str, str2, str3, str4, str5, str6, calendarType, str7, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo208142a(GetAdminSettingsResponse getAdminSettingsResponse, String str) {
        String b = C60754h.m236086b(str);
        PstnInvitationDialogActivity.Companion aVar = PstnInvitationDialogActivity.f156566b;
        if (b == null) {
            b = "";
        }
        aVar.mo215485a(b, C60930c.m236829a(getAdminSettingsResponse));
    }

    /* renamed from: a */
    public void mo208146a(final String str, final String str2) {
        VideoChatService.m249602d().asyncCheckAndInit(new VideoChatService.OnInitFinishListener() {
            /* class com.ss.android.vc.VideoChatModule.C606477 */

            @Override // com.ss.android.vc.service.impl.VideoChatService.OnInitFinishListener
            @XMethod
            public void onInited() {
                GuestJoinMeetingUtil.joinMeetingByNumber(true, str, str2);
            }
        });
    }

    /* renamed from: a */
    public boolean mo208149a(Context context, String str, String str2, String str3, String str4) {
        return C63460a.m248690a().mo219567a(context, str, str2, str3, str4);
    }

    /* renamed from: a */
    public void mo208143a(IVcRtcStatsListener iVcRtcStatsListener) {
        setRtcStatsListenerX(iVcRtcStatsListener);
    }

    /* renamed from: a */
    public static void m235653a(String str, IVideoChatStatusListener iVideoChatStatusListener) {
        C60735ab.m236018e(new Runnable(str, iVideoChatStatusListener) {
            /* class com.ss.android.vc.$$Lambda$VideoChatModule$WwkBo9YFUWE_imZgiuzqyIAaux8 */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ VideoChatModule.IVideoChatStatusListener f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                VideoChatModule.m235658b(this.f$0, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public boolean mo208150a(OpenChat openChat) {
        if (openChat.isP2PChat()) {
            return true;
        }
        return !openChat.isP2PChat();
    }

    /* renamed from: a */
    public static boolean m235656a(C60979m mVar) {
        return mVar != null && mVar.f152703d.booleanValue() && mVar.f152702c != null && mVar.f152702c.size() > 0;
    }

    /* renamed from: a */
    public static boolean m235655a(JoinMeetingPreCheckEntity joinMeetingPreCheckEntity) {
        return (joinMeetingPreCheckEntity == null || joinMeetingPreCheckEntity.f152605b == null || joinMeetingPreCheckEntity.f152605b.f152607a == null || joinMeetingPreCheckEntity.f152605b.f152607a.size() <= 0) ? false : true;
    }

    /* renamed from: a */
    public boolean mo208148a(Context context, String str, int i) {
        if (i != 5 && i != 6) {
            return false;
        }
        try {
            Statistics.sendEvent("link_clicked", new JSONObject().put("link_source", "says"));
            return false;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public void mo208141a(final ErrorResult errorResult, final IGetDataCallback<String> iGetDataCallback) {
        C63602e eVar = new C63602e(errorResult);
        if (eVar.f160598a == null || !eVar.f160598a.is_show) {
            iGetDataCallback.onError(errorResult);
            return;
        }
        VcMsgInfo vcMsgInfo = eVar.f160598a;
        if ((!C63601d.m249419a(eVar.mo219899a()) || vcMsgInfo.is_override) && vcMsgInfo.msg_i18n_key != null && vcMsgInfo.type == VcMsgInfo.Type.TOAST) {
            VcBizSender.m249235b(vcMsgInfo.msg_i18n_key.newKey, vcMsgInfo.msg_i18n_key.params).mo219893b(new AbstractC63598b<String>() {
                /* class com.ss.android.vc.VideoChatModule.C606499 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    iGetDataCallback.onError(errorResult);
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    if (!TextUtils.isEmpty(str)) {
                        iGetDataCallback.onSuccess(str);
                    } else {
                        iGetDataCallback.onError(errorResult);
                    }
                }
            });
        } else {
            iGetDataCallback.onError(errorResult);
        }
    }

    /* renamed from: com.ss.android.vc.VideoChatModule$d */
    public static class C60656d {

        /* renamed from: a */
        private static final List<AbstractC60894j> f151714a = new CopyOnWriteArrayList();

        /* renamed from: b */
        private static final List<AbstractC60885b> f151715b = new CopyOnWriteArrayList();

        /* renamed from: c */
        private static final List<AbstractC60912x.AbstractC60913a> f151716c = new CopyOnWriteArrayList();

        /* renamed from: d */
        private static final List<AbstractC60880ae> f151717d = new CopyOnWriteArrayList();

        /* renamed from: e */
        private static final List<AbstractC60897m.AbstractC60898a> f151718e = new CopyOnWriteArrayList();

        /* renamed from: a */
        public void mo208187a() {
            f151714a.clear();
        }

        /* renamed from: b */
        public void mo208197b() {
            f151715b.clear();
        }

        /* renamed from: c */
        public void mo208201c() {
            f151716c.clear();
        }

        /* renamed from: a */
        public void mo208189a(AbstractC60880ae aeVar) {
            List<AbstractC60880ae> list = f151717d;
            if (!list.contains(aeVar)) {
                list.add(aeVar);
            }
        }

        /* renamed from: b */
        public void mo208198b(AbstractC60885b bVar) {
            f151715b.remove(bVar);
        }

        /* renamed from: a */
        public void mo208188a(int i) {
            for (AbstractC60912x.AbstractC60913a aVar : f151716c) {
                aVar.onLoginStatusChangedEvent(i);
            }
        }

        /* renamed from: b */
        public void mo208199b(AbstractC60894j jVar) {
            f151714a.remove(jVar);
        }

        /* renamed from: a */
        public void mo208190a(AbstractC60885b bVar) {
            List<AbstractC60885b> list = f151715b;
            if (!list.contains(bVar)) {
                list.add(bVar);
            }
        }

        /* renamed from: b */
        public void mo208200b(String str) {
            for (AbstractC60897m.AbstractC60898a aVar : f151718e) {
                aVar.onDeviceIdChange(str);
            }
        }

        /* renamed from: a */
        public void mo208191a(AbstractC60894j jVar) {
            List<AbstractC60894j> list = f151714a;
            if (!list.contains(jVar)) {
                list.add(jVar);
            }
        }

        /* renamed from: a */
        public void mo208192a(AbstractC60897m.AbstractC60898a aVar) {
            List<AbstractC60897m.AbstractC60898a> list = f151718e;
            if (!list.contains(aVar)) {
                list.add(aVar);
            }
        }

        /* renamed from: a */
        public void mo208193a(AbstractC60912x.AbstractC60913a aVar) {
            List<AbstractC60912x.AbstractC60913a> list = f151716c;
            if (!list.contains(aVar)) {
                list.add(aVar);
            }
        }

        /* renamed from: a */
        public void mo208194a(String str) {
            for (AbstractC60885b bVar : f151715b) {
                bVar.onAccountChange(str);
            }
        }

        /* renamed from: a */
        public void mo208196a(boolean z) {
            for (AbstractC60894j jVar : f151714a) {
                jVar.onConnStateChanged(z);
            }
        }

        /* renamed from: a */
        public void mo208195a(Locale locale, Locale locale2) {
            for (AbstractC60880ae aeVar : f151717d) {
                aeVar.onLanguageChange(locale, locale2);
            }
        }
    }

    @XMethod
    public static IVideoChatDependency getDependency() {
        return VideoChatModuleDependency.getDependency();
    }

    @XMethod
    public static IVideoChatService getVideoChatService() {
        return VideoChatService.m249602d();
    }

    /* renamed from: h */
    public static AbstractC63632a m235664h() {
        return ChatVideoMeetingCardService.m249562a();
    }

    /* renamed from: o */
    public static List<String> m235667o() {
        return VideoChatGuideConstants.m237575a();
    }

    /* renamed from: k */
    public boolean mo208167k() {
        return C63634c.m249496b("byteview.callmeeting.android.screenshare_entry");
    }

    /* renamed from: p */
    public boolean mo208171p() {
        return C63634c.m249496b("byteview.meeting.android.setting");
    }

    /* renamed from: f */
    public static boolean m235662f() {
        return VideoChatService.m249602d().mo220182f();
    }

    @XMethod
    public boolean hasMeetingOngoingOnVcVoip() {
        return VideoChatService.m249602d().hasMeetingOngoingOnVcVoip();
    }

    /* renamed from: l */
    public boolean mo208168l() {
        return getDependency().getMeetingFeatureSwitch();
    }

    /* renamed from: m */
    public boolean mo208169m() {
        return getDependency().getMeetingFeatureSwitch();
    }

    /* renamed from: g */
    public static List<AbstractNotification> m235663g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C61165a());
        arrayList.add(new C61172b());
        arrayList.add(new C61159a());
        return arrayList;
    }

    /* renamed from: n */
    public static List<IOpenMessageCellFactory> m235666n() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C61157f());
        arrayList.add(new C61097c());
        arrayList.add(new C61105c());
        return arrayList;
    }

    /* renamed from: a */
    public static AbstractC60901p m235645a() {
        if (f151645e == null) {
            f151645e = VideoChatModuleDependency.getFeatureGatingDependency();
        }
        return f151645e;
    }

    /* renamed from: b */
    public String mo208151b() {
        return C61237h.m238223a().mo210561s();
    }

    /* renamed from: a */
    public static void m235650a(IVideoChatDependency iVideoChatDependency) {
        VideoChatModuleDependency.setDependency(iVideoChatDependency);
    }

    @XMethod
    private void sendQRCodeScanEventX(String str) {
        br.m250213a(str);
    }

    @XMethod
    private void setRtcStatsListenerX(IVcRtcStatsListener iVcRtcStatsListener) {
        this.f151646d = iVcRtcStatsListener;
    }

    /* renamed from: e */
    public void mo208162e(Context context) {
        VideoChatService.m249602d().mo220183g();
    }

    /* renamed from: c */
    public void mo208158c(Context context) {
        VideoChatService.m249602d().openJoinMeetingPage(context, "join_room");
    }

    /* renamed from: d */
    public void mo208161d(Context context) {
        VideoChatService.m249602d().openCreateMeetingPage(context, "plus_new_meeting");
    }

    /* renamed from: b */
    private static AbstractC34033a m235657b(final OpenChat openChat) {
        if (!openChat.isGroup() || openChat.isOnCall() || openChat.isCustomerService()) {
            return null;
        }
        return new AbstractC34033a() {
            /* class com.ss.android.vc.VideoChatModule.AnonymousClass12 */

            /* renamed from: a */
            public TitleBarVcEntryView f151659a;

            /* renamed from: c */
            private XListener.PushVideoChatStatusListener f151661c;

            @Override // com.ss.android.lark.chat.export.ui.p1673c.AbstractC34033a
            /* renamed from: a */
            public void mo126139a() {
                if (this.f151661c != null) {
                    VideoChatPush.m249004a().removePushVideoChatStatusListener(this.f151661c);
                    this.f151661c.release();
                    this.f151661c = null;
                }
            }

            /* renamed from: b */
            private void m235706b(Activity activity) {
                if (!NewGuideDelegate.m240533b()) {
                    C61087a.m237579a(activity, this.f151659a);
                } else if (!VideoChatModule.getDependency().getGuideDependency().checkToShow("mobile_sidebar")) {
                    NewGuideDelegate.m240526a(new NewGuideConfig(this.f151659a, "all_lark_view_video_meeting_moved", null, C60773o.m236119a((int) R.string.View_M_VideoMeetingMoved), 80));
                }
            }

            @Override // com.ss.android.lark.chat.export.ui.p1673c.AbstractC34033a
            /* renamed from: a */
            public View mo126138a(final Activity activity) {
                final FrameLayout frameLayout = new FrameLayout(activity);
                this.f151659a = new TitleBarVcEntryView(activity);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(UIHelper.dp2px(24.0f), UIHelper.dp2px(24.0f));
                layoutParams.gravity = 17;
                frameLayout.addView(this.f151659a, layoutParams);
                this.f151659a.setSecret(openChat.isSecret());
                this.f151659a.setPostPermission(openChat.isAllowPost());
                this.f151659a.setAllowCreateMeeting(VideoChatModule.getDependency().getChatDependency().mo196347a(openChat));
                C606499.C606501 r1 = new IVideoChatStatusListener() {
                    /* class com.ss.android.vc.VideoChatModule.C606499.C606501 */

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public /* synthetic */ void m235711a(boolean z) {
                        AnonymousClass12.this.f151659a.mo211325a(z);
                    }

                    @Override // com.ss.android.vc.VideoChatModule.IVideoChatStatusListener
                    public void onMeetingStatusChanged(String str, IDTypeEntity iDTypeEntity, boolean z) {
                        if (iDTypeEntity == IDTypeEntity.GROUP_ID && TextUtils.equals(str, openChat.getId())) {
                            UICallbackExecutor.execute(new Runnable(z) {
                                /* class com.ss.android.vc.$$Lambda$VideoChatModule$9$1$LWfGJHIWIOa03yuyKWwqEi5SmaA */
                                public final /* synthetic */ boolean f$1;

                                {
                                    this.f$1 = r2;
                                }

                                public final void run() {
                                    VideoChatModule.C606499.C606501.this.m235711a(this.f$1);
                                }
                            });
                        }
                    }
                };
                this.f151661c = new XListener.PushVideoChatStatusListener(r1) {
                    /* class com.ss.android.vc.VideoChatModule.C606499.C606512 */

                    /* renamed from: a */
                    final /* synthetic */ IVideoChatStatusListener f151708a;

                    @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63584x
                    @XMethod
                    public void onPushVideoChatStatus(C60979m mVar) {
                        String str;
                        if (this.f151708a != null) {
                            if (mVar == null) {
                                str = "";
                            } else {
                                str = mVar.f152700a;
                            }
                            this.f151708a.onMeetingStatusChanged(str, mVar.f152701b, VideoChatModule.m235656a(mVar));
                        }
                    }

                    {
                        this.f151708a = r2;
                    }
                };
                VideoChatPush.m249004a().addPushVideoChatStatusListener(this.f151661c);
                VideoChatModule.m235653a(openChat.getId(), r1);
                frameLayout.setOnClickListener(new OnSingleClickListener() {
                    /* class com.ss.android.vc.VideoChatModule.AnonymousClass12.C606381 */

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        frameLayout.setEnabled(false);
                        if (openChat.isSecret()) {
                            try {
                                Statistics.sendEvent("vc_meeting_lark_entry", new JSONObject().put("action_name", "encryption_chat"));
                            } catch (Exception e) {
                                C60700b.m235864f("VideoChatModule", "[onCreateView]", e.getLocalizedMessage());
                            }
                        }
                        if (!AnonymousClass12.this.f151659a.mo211327b() && !AnonymousClass12.this.f151659a.mo211326a()) {
                            C60738ac.m236023a((int) R.string.View_M_CannotStartMeetings);
                            frameLayout.setEnabled(true);
                        } else if (AnonymousClass12.this.f151659a.mo211328c() || AnonymousClass12.this.f151659a.mo211326a()) {
                            VideoChatModule.gotoMeeting(activity, C60655c.m235715a(openChat), UUID.randomUUID().toString(), new VideoChatModule$9$3$1(this));
                        } else {
                            C60738ac.m236023a((int) R.string.Lark_Groups_OnlyGroupOwnerAdminCanVideoMeet);
                            frameLayout.setEnabled(true);
                        }
                    }
                });
                m235706b(activity);
                return frameLayout;
            }
        };
    }

    /* renamed from: c */
    private static String m235660c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < str.length() / 3) {
            int i2 = i * 3;
            i++;
            stringBuffer.append((CharSequence) str, i2, i * 3);
            stringBuffer.append(" ");
        }
        int i3 = i * 3;
        if (i3 < str.length()) {
            stringBuffer.append((CharSequence) str, i3, str.length());
        }
        return stringBuffer.toString();
    }

    @XMethod
    private void startVideoChatSettingActivityX(Context context) {
        if (DesktopUtil.m144301a(context)) {
            C60735ab.m236001a(new Runnable(new MainWindowParams.C36570a(ContainerType.Right).mo134958a("system_setting").mo134930b()) {
                /* class com.ss.android.vc.$$Lambda$VideoChatModule$w8CBLHbIDwgaeFPqKOhR06BQiM */
                public final /* synthetic */ MainWindowParams f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    VideoChatModule.m235652a(C61190d.this, this.f$1);
                }
            });
            return;
        }
        Intent intent = new Intent(context, VideoChatSettingActivity.class);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* renamed from: f */
    public Map<String, AbstractC29186b> mo208163f(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("/client/videochat/open", new C60693d(context));
        hashMap.put("/client/videochat/cert", new C60688a(context));
        hashMap.put("/client/livestudio/open", new C60691b(context));
        return hashMap;
    }

    /* renamed from: b */
    public void mo208152b(Context context) {
        VideoChatService.m249602d().openLocalSharePage(context, "vr_sharescreen");
    }

    /* renamed from: a */
    public static void m235647a(Configuration configuration) {
        VideoChatService.m249602d().mo220178a(configuration);
    }

    /* renamed from: b */
    public boolean mo208157b(String str) {
        if (!C26252ad.m94993b(ar.m236694a()) && !C63801c.m250500a(C26252ad.m94994c(ar.m236694a()))) {
            Log.m165389i("VideoChatModule", "isSaysUrl call from unexpected Process, return false");
            return false;
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            Uri parse = Uri.parse(str);
            if (!f151642a.equals(parse.getHost()) || !f151643b.matcher(parse.getPath()).find()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static void m235651a(AbstractC60901p pVar) {
        f151645e = pVar;
    }

    /* renamed from: b */
    public void mo208153b(Context context, String str) {
        joinInterviewGroupMeetingX(context, str, "");
    }

    /* renamed from: c */
    public void mo208159c(Context context, String str) {
        openPreViewPage(context, str, "", false);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m235658b(final String str, final IVideoChatStatusListener iVideoChatStatusListener) {
        getVideoChatService().mo220077a(str, IDTypeEntity.GROUP_ID, new IGetDataCallback<C60979m>() {
            /* class com.ss.android.vc.VideoChatModule.C606434 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            @XMethod
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(C60979m mVar) {
                IVideoChatStatusListener iVideoChatStatusListener = iVideoChatStatusListener;
                if (iVideoChatStatusListener != null) {
                    iVideoChatStatusListener.onMeetingStatusChanged(str, IDTypeEntity.GROUP_ID, VideoChatModule.m235656a(mVar));
                }
            }
        });
    }

    @XMethod
    private void onRtcStatsX(long j, long j2) {
        C60700b.m235851b("VideoChatModule", "[onRtcStats]", "rxBytes = " + j + ", txBytes = " + j2);
        IVcRtcStatsListener iVcRtcStatsListener = this.f151646d;
        if (iVcRtcStatsListener != null) {
            iVcRtcStatsListener.onRtcStats(j, j2);
        }
    }

    @XMethod
    private void startPreVideoChatSettingActivityX(Context context, String str) {
        Intent intent = new Intent(context, MeetingPreSettingActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("param_calendar_unique_id", str);
        intent.putExtras(bundle);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    @XMethod
    public void init(Context context, IVideoChatDependency iVideoChatDependency) {
        ServerManager.getInstance().startServer(ar.m236694a());
        m235650a(iVideoChatDependency);
        ar.m236696a(context);
        C61237h.m238223a().mo211782G();
        C61008c.m237262a();
        C61002a.m237238a();
        C61004b.m237248a();
    }

    /* renamed from: b */
    public void mo208156b(String str, final String str2) {
        VideoChatService.m249602d().asyncCheckAndInit(new VideoChatService.OnInitFinishListener() {
            /* class com.ss.android.vc.VideoChatModule.C606488 */

            @Override // com.ss.android.vc.service.impl.VideoChatService.OnInitFinishListener
            @XMethod
            public void onInited() {
                GuestJoinMeetingUtil.joinMeetingByNumber(false, "", str2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m235652a(C61190d dVar, MainWindowParams mainWindowParams) {
        C36512a.m144041a().mo134763a(dVar, mainWindowParams);
    }

    /* renamed from: b */
    public void mo208154b(Context context, String str, String str2) {
        joinInterviewGroupMeetingX(context, str, str2);
    }

    /* renamed from: a */
    public static AbstractC34033a m235642a(Activity activity, OpenChat openChat, OpenChatter openChatter) {
        return m235657b(openChat);
    }

    @XMethod(methodId = "1")
    private void joinCalendarGroupMeetingX(Context context, String str, String str2) {
        mo208138a(context, str, str2, false);
    }

    @XMethod(methodId = "1")
    private void joinInterviewGroupMeetingX(Context context, String str, String str2) {
        mo208155b(context, str, str2, false);
    }

    /* renamed from: a */
    public static AbstractC44552i m235643a(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        return new C63228b(context, eVar, iTitleController);
    }

    @XMethod
    private void joinOpenPlatformCallX(Context context, String str, boolean z) {
        VideoChatService.m249602d().asyncCheckAndInit(new VideoChatService.OnInitFinishListener(z, str) {
            /* class com.ss.android.vc.$$Lambda$VideoChatModule$I18lRtwA61DzFI3D1shJTHYYM2Y */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.vc.service.impl.VideoChatService.OnInitFinishListener
            public final void onInited() {
                VideoChatModule.this.m235654a((VideoChatModule) this.f$1, (boolean) this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m235649a(IVideoChatStatusListener iVideoChatStatusListener, C60655c cVar, boolean z) {
        if (iVideoChatStatusListener != null) {
            iVideoChatStatusListener.onMeetingStatusChanged(cVar.f151711a, IDTypeEntity.GROUP_ID, z);
        }
    }

    /* renamed from: a */
    public static AbstractC60653b m235644a(Activity activity, OpenChat openChat, OpenChatter openChatter, AbstractC60653b.AbstractC60654a aVar) {
        return new VcInfoBannerImpl(activity, openChat, openChatter, aVar);
    }

    @XMethod(isStatic = true)
    public static void gotoMeeting(final Context context, final C60655c cVar, final String str, final IVideoChatStatusListener iVideoChatStatusListener) {
        C63697g.m249703a();
        final C68296b<Boolean> a = TimeConsumeUtils.m248927a("VideoChatModule:gotoMeeting");
        VideoChatService.m249602d().asyncCheckAndInit(new VideoChatService.OnInitFinishListener() {
            /* class com.ss.android.vc.VideoChatModule.AnonymousClass10 */

            @Override // com.ss.android.vc.service.impl.VideoChatService.OnInitFinishListener
            public void onInited() {
                MeetingCheckUtils.meetingCheck(context, cVar.f151711a, JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.GROUPID, true, "chat_window_banner", str, 1, true).subscribe(new XConsumer<MeetingCheckData>() {
                    /* class com.ss.android.vc.VideoChatModule.AnonymousClass10.C606361 */

                    @XMethod
                    public void accept(MeetingCheckData bVar) throws Exception {
                        String str;
                        if (bVar.mo219661a().booleanValue()) {
                            TimeConsumeUtils.m248928a(a);
                            if (bVar.mo219665b() == null || bVar.mo219665b().f152605b == null) {
                                str = "";
                            } else {
                                str = bVar.mo219665b().f152605b.f152608b;
                            }
                            if (VideoChatModule.m235655a(bVar.mo219665b())) {
                                try {
                                    LinkedList linkedList = new LinkedList();
                                    linkedList.add(bVar.mo219665b().f152605b.f152607a.get(0).getId());
                                    VideoChatModule.m235646a(ar.m236694a(), cVar, str, new C60979m(cVar.f151711a, IDTypeEntity.GROUP_ID, linkedList, true, null, null, null, null), iVideoChatStatusListener, str, bVar.mo219666c());
                                } catch (Exception e) {
                                    C60700b.m235864f("VideoChatModule", "[gotoMeeting]", e.getLocalizedMessage());
                                }
                            } else {
                                VideoChatModule.m235646a(ar.m236694a(), cVar, str, null, iVideoChatStatusListener, str, bVar.mo219666c());
                            }
                        } else if (bVar.mo219665b() != null) {
                            iVideoChatStatusListener.onMeetingStatusChanged(cVar.f151711a, IDTypeEntity.GROUP_ID, VideoChatModule.m235655a(bVar.mo219665b()));
                        } else {
                            VideoChatModule.getVideoChatService().mo220077a(cVar.f151711a, IDTypeEntity.GROUP_ID, new XIGetDataCallback<C60979m>() {
                                /* class com.ss.android.vc.VideoChatModule.AnonymousClass10.C606361.C606371 */

                                @Override // com.larksuite.framework.callback.IGetDataCallback
                                @XMethod
                                public void onError(ErrorResult errorResult) {
                                    iVideoChatStatusListener.onMeetingStatusChanged(cVar.f151711a, IDTypeEntity.GROUP_ID, false);
                                }

                                @XMethod
                                public void onSuccess(C60979m mVar) {
                                    iVideoChatStatusListener.onMeetingStatusChanged(cVar.f151711a, IDTypeEntity.GROUP_ID, VideoChatModule.m235656a(mVar));
                                }
                            });
                        }
                    }
                });
            }
        });
    }

    @XMethod(methodId = "2")
    private void joinCalendarGroupMeetingX(final Context context, final String str, final String str2, final boolean z) {
        C63697g.m249703a();
        final C68296b<Boolean> a = TimeConsumeUtils.m248927a("VideoChatModule:joinCalendarGroupMeetingX");
        VideoChatService.m249602d().asyncCheckAndInit(new VideoChatService.OnInitFinishListener() {
            /* class com.ss.android.vc.VideoChatModule.C606392 */

            @Override // com.ss.android.vc.service.impl.VideoChatService.OnInitFinishListener
            public void onInited() {
                C60700b.m235851b("VideoChatModule", "[joinCalendarGroupMeetingX]", "joinCalendarGroupMeeting, uniqueId = " + str + ", title = " + str2);
                final String uuid = UUID.randomUUID().toString();
                MeetingCheckUtils.meetingCheck(context, str, JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.UNIQUEID, true, "calendar_detail", uuid, 1, true).subscribe(new XConsumer<MeetingCheckData>() {
                    /* class com.ss.android.vc.VideoChatModule.C606392.C606401 */

                    @XMethod
                    public void accept(MeetingCheckData bVar) throws Exception {
                        C60700b.m235851b("VideoChatModule", "[joinCalendarGroupMeetingX2]", "joinCalendarGroupMeeting, show preview page, isPassed = " + bVar.mo219661a());
                        if (bVar.mo219661a().booleanValue()) {
                            TimeConsumeUtils.m248928a(a);
                            MeetingPreviewLauncher.m245467a(context, str2, str, null, JoinCalendarGroupMeetingEntityRequest.EntrySource.FROM_CALENDAR_DETAIL.getNumber(), uuid, bVar.mo219666c(), z);
                        }
                    }
                });
            }
        });
    }

    @XMethod(methodId = "2")
    private void joinInterviewGroupMeetingX(final Context context, final String str, final String str2, final boolean z) {
        C63697g.m249703a();
        VideoChatService.m249602d().asyncCheckAndInit(new VideoChatService.OnInitFinishListener() {
            /* class com.ss.android.vc.VideoChatModule.C606445 */

            @Override // com.ss.android.vc.service.impl.VideoChatService.OnInitFinishListener
            public void onInited() {
                C60700b.m235851b("VideoChatModule", "[joinInterviewGroupMeeting]", "interviewId = " + str + ", role = " + str2);
                if (MeetingPreviewInterviewFragment.m245555a(str)) {
                    C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(MeetingPreviewInterviewFragment.m245556b(str));
                    C60700b.m235851b("VideoChatModule", "[joinInterviewGroupMeeting2]", "reopen meeting from interview link");
                    if (kVar.mo212067p() == DisplayMode.NONE) {
                        ByteRTCMeetingActivity.m244034a(kVar, false, true);
                    } else {
                        ByteRTCMeetingActivity.m244032a(kVar);
                    }
                    C63697g.m249707e();
                    return;
                }
                final C68296b<Boolean> a = TimeConsumeUtils.m248927a("VideoChatModule:joinInterviewGroupMeetingX:meetingCheck");
                final String uuid = UUID.randomUUID().toString();
                MeetingCheckUtils.m248876a(context, str, JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.INTERVIEWUID, str2, false, "calendar_detail", uuid, 1, (Boolean) true).subscribe(new Consumer<MeetingCheckData>() {
                    /* class com.ss.android.vc.VideoChatModule.C606445.C606451 */

                    @XMethod
                    public void accept(MeetingCheckData bVar) throws Exception {
                        if (bVar.mo219661a().booleanValue()) {
                            TimeConsumeUtils.m248928a(a);
                            MeetingPreviewLauncher.m245468a(context, str, str2, uuid, z);
                        }
                    }
                });
            }
        });
    }

    @XMethod
    public void openPreViewPage(final Context context, final String str, final String str2, final boolean z) {
        C63697g.m249703a();
        final C68296b<Boolean> a = TimeConsumeUtils.m248927a("VideoChatModule:openPreViewPage");
        VideoChatService.m249602d().asyncCheckAndInit(new VideoChatService.OnInitFinishListener() {
            /* class com.ss.android.vc.VideoChatModule.C606466 */

            @Override // com.ss.android.vc.service.impl.VideoChatService.OnInitFinishListener
            public void onInited() {
                MeetingPreviewLauncher.m245470b(context, UUID.randomUUID().toString(), str, str2, z);
                TimeConsumeUtils.m248928a(a);
            }
        });
    }

    /* renamed from: b */
    public void mo208155b(Context context, String str, String str2, boolean z) {
        joinInterviewGroupMeetingX(context, str, str2, z);
    }

    /* renamed from: a */
    public static void m235648a(TextView textView, TextView textView2, ImageView imageView, Content content) {
        if (content instanceof VideoChatContent) {
            textView.setVisibility(0);
            textView2.setVisibility(0);
            imageView.setVisibility(0);
            VideoChatContent videoChatContent = (VideoChatContent) content;
            textView.setText(videoChatContent.meetingCard.topic);
            textView2.setText(UIHelper.getString(R.string.View_M_MeetingIdColon) + m235660c(videoChatContent.meetingCard.meetNumber));
            imageView.setImageResource(R.drawable.ic_dialog_forward_videochat);
        }
    }

    @XMethod
    private void joinOpenPlatformMeetingX(final Context context, final String str, final boolean z, final boolean z2, final boolean z3, final boolean z4) {
        C63697g.m249703a();
        final C68296b<Boolean> a = TimeConsumeUtils.m248927a("VideoChatModule:joinOpenPlatformMeetingX");
        VideoChatService.m249602d().asyncCheckAndInit(new VideoChatService.OnInitFinishListener() {
            /* class com.ss.android.vc.VideoChatModule.C606413 */

            @Override // com.ss.android.vc.service.impl.VideoChatService.OnInitFinishListener
            public void onInited() {
                C60700b.m235851b("VideoChatModule", "[joinOpenPlatformMeeting]", "preview = " + z + ", micMute = " + z2 + ", cameraMute = " + z3 + ", speaker = " + z4);
                final String uuid = UUID.randomUUID().toString();
                MeetingCheckUtils.meetingCheck(context, str, JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.RESERVATION_ID, false, "", uuid, 1, true).subscribe(new XConsumer<MeetingCheckData>() {
                    /* class com.ss.android.vc.VideoChatModule.C606413.C606421 */

                    @XMethod
                    public void accept(MeetingCheckData bVar) throws Exception {
                        C60700b.m235851b("VideoChatModule", "[joinOpenPlatformMeetingX2]", "meetingCheck, isPassed = " + bVar.mo219661a());
                        if (bVar.mo219661a().booleanValue()) {
                            TimeConsumeUtils.m248928a(a);
                            if (z) {
                                MeetingPreviewLauncher.m245469a(context, z2, z3, z4, str, uuid, true);
                                return;
                            }
                            OpenPlatformGotoMeetingManager fVar = new OpenPlatformGotoMeetingManager(null, new MeetingPreviewOpenPlatformModel(z2, z3, z4, str));
                            fVar.mo216633b();
                            fVar.mo216632a(Boolean.valueOf(z2), Boolean.valueOf(z3));
                        }
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public static void m235646a(Context context, C60655c cVar, String str, C60979m mVar, IVideoChatStatusListener iVideoChatStatusListener, String str2, VideoChat.VendorType vendorType) {
        boolean a = m235656a(mVar);
        C60735ab.m236001a(new Runnable(cVar, a) {
            /* class com.ss.android.vc.$$Lambda$VideoChatModule$Qjqg6IBRLNDtxJ4w7QHBA7e1jhY */
            public final /* synthetic */ VideoChatModule.C60655c f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                VideoChatModule.m235649a(VideoChatModule.IVideoChatStatusListener.this, this.f$1, this.f$2);
            }
        });
        if (a) {
            getVideoChatService().joinVideoMeeting(context, mVar.f152702c.get(0), "chat_window_banner", str2, vendorType);
        } else if (!cVar.f151712b || TextUtils.isEmpty(str)) {
            getVideoChatService().launchVideoMeeting(context, str, cVar.f151711a, IDTypeEntity.GROUP_ID, "", "chat_window_banner", str2, vendorType);
        } else {
            String str3 = cVar.f151713c;
            if (TextUtils.isEmpty(str3)) {
                str3 = context.getResources().getString(R.string.Lark_Legacy_EventNoTitle);
            }
            getVideoChatService().launchVideoMeeting(context, str, cVar.f151711a, IDTypeEntity.UNIQUE_ID, str3, "chat_window_banner", str2, vendorType);
        }
    }
}
