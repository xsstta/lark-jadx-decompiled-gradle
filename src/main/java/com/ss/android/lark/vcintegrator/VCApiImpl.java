package com.ss.android.lark.vcintegrator;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.pb.basic.v1.Command;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler;
import com.ss.android.lark.biz.core.api.aj;
import com.ss.android.lark.biz.core.api.contact.IInitBuilder;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.p1666f.AbstractC33989a;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.chat.export.ui.p1673c.AbstractC34033a;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.diskmanage.clean.IDiskCleanTask;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.im.C39438c;
import com.ss.android.lark.integrator.minutes.C39876a;
import com.ss.android.lark.integrator.p2017d.C39399a;
import com.ss.android.lark.integrator.voip.VoIpModuleProvider;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.p2567s.p2568a.p2578j.C53213a;
import com.ss.android.lark.p2567s.p2568a.p2578j.C53214b;
import com.ss.android.lark.pb.videochat.GetPstnSipFeatureConfigRequest;
import com.ss.android.lark.pb.videoconference.v1.GetAdminSettingsResponse;
import com.ss.android.lark.pb.videoconference.v1.GetMeetingURLInfoRequest;
import com.ss.android.lark.pb.videoconference.v1.GetMeetingURLInfoResponse;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.vc.api.AbstractC57899a;
import com.ss.android.lark.vc.api.AbstractC57900b;
import com.ss.android.lark.vc.api.AbstractC57901c;
import com.ss.android.lark.vc.api.AbstractC57902d;
import com.ss.android.lark.vc.api.IVCApi;
import com.ss.android.lark.vc.api.PstnDetailInfoResponse2;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.service.AbstractC58002c;
import com.ss.android.lark.voip.service.AbstractC58003d;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.dto.VCLaunchError;
import com.ss.android.vc.dto.VideoChatContent;
import com.ss.android.vc.entity.PstnDetailInfoResponse;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.lark.guidetips.C61087a;
import com.ss.android.vc.lark.message.meeting.chatcell.VideoMeetingContentVO;
import com.ss.android.vc.lark.message.meeting.chatcell.VideoMeetingMessageDisplay;
import com.ss.android.vc.service.AbstractC63633b;
import com.ss.android.vc.service.IVideoChatService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@ClaymoreImpl(IVCApi.class)
public class VCApiImpl implements IVCApi {
    static /* synthetic */ void lambda$launchVideoChat$11(Boolean bool) {
    }

    static /* synthetic */ void lambda$openCreateMeetingPage$9(Boolean bool) {
    }

    static /* synthetic */ void lambda$openJoinMeetingPage$7(Boolean bool) {
    }

    static /* synthetic */ void lambda$openLocalSharePage$5(Boolean bool) {
    }

    static /* synthetic */ void lambda$setRtcStatsListener$14(Boolean bool) {
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void dismissLoadingDialog() {
        VideoChatModuleProvider.m224874c();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public Map<String, String> getAutoInitModuleConfigMap() {
        return C53213a.f131551a;
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public Map<String, String> getThirdPartyModuleConfigMap() {
        return C53213a.f131552b;
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public Map<String, String> getThirdPartyPrefixModuleConfigMap() {
        return C53213a.f131553c;
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void onChatTitleDismissAnimation() {
        C61087a.m237578a();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public List<AbstractC28490a> getAbTestExperiments() {
        VideoChatModuleProvider.m224872a();
        return VideoChatModule.m235668q();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public ILaunchTask getInitVideoChatTask() {
        return new InitVideoChatTask();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public String getMinutesPackageName() {
        return C39876a.m158360c();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public String getPackageName() {
        return VideoChatModuleProvider.m224876e();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public IQRCodeScanResultHandler getQRCodeScanResultHandler() {
        return new IQRCodeScanResultHandler() {
            /* class com.ss.android.lark.vcintegrator.VCApiImpl.C579677 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ Object m224865a(byte[] bArr) throws IOException {
                return GetMeetingURLInfoResponse.ADAPTER.decode(bArr);
            }

            /* renamed from: b */
            private String m224867b(String str) {
                return Uri.parse(str).getQueryParameter("meetingId");
            }

            /* renamed from: a */
            private boolean m224866a(String str) {
                if (str.startsWith("feishu://client/byteview/share")) {
                    return true;
                }
                return false;
            }

            @Override // com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler
            /* renamed from: a */
            public boolean mo105369a(String str, final aj ajVar, int i) {
                final ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
                if (!m224866a(str)) {
                    return false;
                }
                final String b = m224867b(str);
                if (C57782ag.m224241a(b)) {
                    return false;
                }
                if (VideoChatModuleDependency.getFeatureGatingDependency().mo196393a("byteview.meeting.android.copymeetinglink")) {
                    SdkSender.asynSendRequestNonWrap(Command.GET_MEETING_URL_INFO, new GetMeetingURLInfoRequest.C50657a().mo175290a(b), new IGetDataCallback<GetMeetingURLInfoResponse>() {
                        /* class com.ss.android.lark.vcintegrator.VCApiImpl.C579677.C579681 */

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public static /* synthetic */ void m224870a(Boolean bool) {
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public static /* synthetic */ Boolean m224869a() {
                            VideoChatModuleProvider.m224872a().mo208166j();
                            return true;
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Log.m165383e("VideoChatQRHandler", "[GET_MEETING_URL_INFO] error " + errorResult.toString());
                        }

                        /* renamed from: a */
                        public void onSuccess(GetMeetingURLInfoResponse getMeetingURLInfoResponse) {
                            String str;
                            if (VideoChatModuleDependency.getChatDependency().getLoginChatter() != null) {
                                str = VideoChatModuleDependency.getChatDependency().getLoginChatter().getName();
                            } else {
                                str = "";
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append(UIHelper.mustacheFormat((int) R.string.View_M_InvitedToMeetingNameBraces, "name", str));
                            sb.append("\n");
                            sb.append(UIHelper.getString(R.string.View_M_MeetingIdColon) + getMeetingURLInfoResponse.meeting_no);
                            sb.append("\n");
                            if (getMeetingURLInfoResponse.meeting_source.getValue() == VideoChat.MeetingSource.VC_FROM_INTERVIEW.getNumber()) {
                                sb.append(UIHelper.getString(R.string.View_N_MeetingTopicColon) + UIHelper.mustacheFormat((int) R.string.View_M_VideoInterviewNameBraces, "name", getMeetingURLInfoResponse.topic));
                            } else {
                                sb.append(UIHelper.getString(R.string.View_N_MeetingTopicColon) + getMeetingURLInfoResponse.topic);
                            }
                            sb.append("\n");
                            sb.append(UIHelper.getString(R.string.View_N_MeetingLinkColon) + getMeetingURLInfoResponse.meeting_url);
                            if (!TextUtils.isEmpty(sb.toString())) {
                                ((ClipboardManager) ar.m236694a().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("meetingUrl", sb.toString()));
                                LKUIToast.show(ajVar.mo105591a(), UIHelper.getString(R.string.View_M_LinkCopied));
                                C57865c.m224574a($$Lambda$VCApiImpl$7$1$Z5PGuoo3j2WCvyWjsb9jYYb57E.INSTANCE, $$Lambda$VCApiImpl$7$1$oIui5oJJ0XqAWOE7xWPm8OigyU.INSTANCE);
                                iCoreApi.goShareVideoMeeting(ajVar.mo105591a(), b, sb.toString());
                            }
                        }
                    }, $$Lambda$VCApiImpl$7$q_pg1aYmR_85UQ1vvMQ2XvZYK4.INSTANCE);
                    return true;
                }
                iCoreApi.goShareVideoMeeting(ajVar.mo105591a(), b, null);
                VideoChatModuleProvider.m224872a().mo208145a(b);
                return true;
            }
        };
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public Collection<? extends String> getSyncKeys() {
        return VideoChatModuleProvider.m224875d();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public Collection<? extends IOpenMessageCellFactory> getVCMessageCellFactories() {
        VideoChatModuleProvider.m224872a();
        return VideoChatModule.m235666n();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public String getVeSdkVersion() {
        return VideoChatModuleProvider.m224878g();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public boolean hasMeetingOngoingOnCurrentProcess() {
        return VideoChatModuleProvider.m224879h();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void logout() {
        VideoChatModuleProvider.m224877f().mo220082b();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void otherOpenCamera() {
        VideoChatModuleProvider.m224877f().otherOpenCamera();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public boolean shouldShowVcInternalFeedbackDialog() {
        VideoChatModuleProvider.m224872a();
        return VideoChatModule.m235662f();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void stopLiveFloat() {
        C39399a.m155624a().mo149307c();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public String getRtcSdkVersion() {
        return VideoChatModuleProvider.m224872a().mo208151b();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public Object getVCDebugPlugin() {
        try {
            return Class.forName("com.ss.lark.vc.debugger.VcPlugin").newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public IDiskCleanTask getVideoChatCleanTask() {
        return VideoChatModuleProvider.m224872a().mo208160d();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public boolean hasMeetingOngoingOnVcVoip() {
        return VideoChatModuleProvider.m224872a().hasMeetingOngoingOnVcVoip();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public boolean isEnterprisePhoneAuthorized() {
        return VideoChatModuleProvider.m224877f().mo220083c();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public boolean isFloatToastPlan() {
        return VoIpModuleProvider.m158862a().mo196604d().mo196629b();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public boolean isInMeeting() {
        return VideoChatModuleProvider.m224877f().isOngoing(true);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public boolean isLivingInFloat() {
        return C39399a.m155624a().mo149306b();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public boolean isMmRecording() {
        return C39876a.m158359b().mo161088c();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public boolean isMmTabEnable() {
        return C39876a.m158359b().mo161087b();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public boolean isVideoChatSettingEnable() {
        return VideoChatModuleProvider.m224872a().mo208171p();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public boolean needShowPlusIconCreate() {
        return VideoChatModuleProvider.m224872a().mo208169m();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public boolean needShowPlusIconJoin() {
        return VideoChatModuleProvider.m224872a().mo208168l();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public boolean needShowPlusIconLocalShare() {
        return VideoChatModuleProvider.m224872a().mo208167k();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public Collection<? extends AbstractNotification> provideNotificationImpls() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(VoIpModuleProvider.m158862a().mo196606f());
        VideoChatModuleProvider.m224872a();
        arrayList.addAll(VideoChatModule.m235663g());
        return arrayList;
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void unInit() {
        C57977a a = VoIpModuleProvider.m158862a();
        if (a != null) {
            a.mo196604d().mo196624a();
        }
        VideoChatModuleProvider.m224877f().unInit();
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void initProcessorDoInit(String str) {
        C53214b.m205847a(str);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public AbstractC54125a getChatSettingComponent(Activity activity) {
        return new C57970a(activity);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void onConfigurationChanged(Configuration configuration) {
        VideoChatModuleProvider.m224872a();
        VideoChatModule.m235647a(configuration);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void startVideoChatSettingActivity(Activity activity) {
        VideoChatModuleProvider.m224872a().mo208135a(activity);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void addVideoChatStatusChangedListener(final AbstractC57900b bVar) {
        VideoChatModuleProvider.m224872a().mo208144a(new AbstractC63633b() {
            /* class com.ss.android.lark.vcintegrator.VCApiImpl.C579655 */

            @Override // com.ss.android.vc.service.AbstractC63633b
            /* renamed from: a */
            public void mo196518a() {
                AbstractC57900b bVar = bVar;
                if (bVar != null) {
                    bVar.mo143235a();
                }
            }

            @Override // com.ss.android.vc.service.AbstractC63633b
            /* renamed from: b */
            public void mo196519b() {
                AbstractC57900b bVar = bVar;
                if (bVar != null) {
                    bVar.mo143236b();
                }
            }
        });
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void addVoipStatusChangedListener(final AbstractC57902d dVar) {
        VoIpModuleProvider.m158862a().mo196599a(new AbstractC58002c() {
            /* class com.ss.android.lark.vcintegrator.VCApiImpl.C579666 */

            @Override // com.ss.android.lark.voip.service.AbstractC58002c
            /* renamed from: a */
            public void mo196520a() {
                AbstractC57902d dVar = dVar;
                if (dVar != null) {
                    dVar.mo143237a();
                }
            }

            @Override // com.ss.android.lark.voip.service.AbstractC58002c
            /* renamed from: b */
            public void mo196521b() {
                AbstractC57902d dVar = dVar;
                if (dVar != null) {
                    dVar.mo143238b();
                }
            }
        });
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public Map<? extends String, ? extends AbstractC29186b> getAppLinkHandlers(Context context) {
        return VideoChatModuleProvider.m224872a().mo208163f(context);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public String getVideoChatCardReplyDigest(Message message) {
        return VideoMeetingMessageDisplay.f153038a.mo211354a((VideoChatContent) message.getContent());
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public boolean isSaysUrl(String str) {
        return VideoChatModuleProvider.m224872a().mo208157b(str);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public boolean isVCUrl(String str) {
        return VideoChatModuleProvider.m224877f().isVCUrl(str);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public boolean isVcLiveUrl(String str) {
        return C39399a.m155624a().mo149305a(str);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void openCreateMeetingPage(Context context) {
        C57865c.m224574a(new C57865c.AbstractC57873d(context) {
            /* class com.ss.android.lark.vcintegrator.$$Lambda$VCApiImpl$S_NTIoKAzP7ES35KR5a_3gDdr8w */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return VideoChatModuleProvider.m224872a().mo208161d(this.f$0);
            }
        }, $$Lambda$VCApiImpl$d6N9iGx8OeAEtbvPR02VaTEiibQ.INSTANCE);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void openJoinMeetingPage(Context context) {
        C57865c.m224574a(new C57865c.AbstractC57873d(context) {
            /* class com.ss.android.lark.vcintegrator.$$Lambda$VCApiImpl$yRzoeS2d6glC7shLRN0N99zGQI */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return VideoChatModuleProvider.m224872a().mo208158c(this.f$0);
            }
        }, $$Lambda$VCApiImpl$A2lTPAwP6POE_FNoy60r63z_W4A.INSTANCE);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void openLocalSharePage(Context context) {
        C57865c.m224574a(new C57865c.AbstractC57873d(context) {
            /* class com.ss.android.lark.vcintegrator.$$Lambda$VCApiImpl$wUBns1bAgK9Crr3eYcG9ad0YHr4 */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return VideoChatModuleProvider.m224872a().mo208152b(this.f$0);
            }
        }, $$Lambda$VCApiImpl$C69uXomEhnicnrLX6h8DXULcC4.INSTANCE);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public Content parseVideoChatContent(com.bytedance.lark.pb.basic.v1.Content content) {
        VideoChatModuleProvider.m224872a();
        return VideoChatModule.m235664h().parseVideoChatContent(content);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public boolean isMMUrl(String str) {
        if (C37239a.m146648b().mo136955b("byteview_mm_android_native", false)) {
            return C39876a.m158359b().mo161086a(str);
        }
        return false;
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public boolean isMeetingCard(ContentVO aVar) {
        if (!(aVar instanceof VideoMeetingContentVO)) {
            return false;
        }
        VideoMeetingContentVO aVar2 = (VideoMeetingContentVO) aVar;
        if (aVar2.mo211346a() == 1 || aVar2.mo211346a() == 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void setRtcStatsListener(AbstractC57899a aVar) {
        C57865c.m224574a(new C57865c.AbstractC57873d() {
            /* class com.ss.android.lark.vcintegrator.$$Lambda$VCApiImpl$nQZcK5Bh__Vs7NGNCiDQ3h9fpNw */

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return VideoChatModuleProvider.m224872a().mo208143a((AbstractC57899a) new VideoChatModule.IVcRtcStatsListener() {
                    /* class com.ss.android.lark.vcintegrator.$$Lambda$VCApiImpl$l5SwQDbJN_WKWO3_U4DQo7FBiQ */

                    @Override // com.ss.android.vc.VideoChatModule.IVcRtcStatsListener
                    public final void onRtcStats(long j, long j2) {
                        VCApiImpl.lambda$null$12(AbstractC57899a.this, j, j2);
                    }
                });
            }
        }, $$Lambda$VCApiImpl$3YN7WqxV8VQL57fr8ZL6GpgSNW0.INSTANCE);
        VoIpModuleProvider.m158862a().mo196600a(new AbstractC58003d() {
            /* class com.ss.android.lark.vcintegrator.$$Lambda$VCApiImpl$rInJ5Ch3zT97gTt07UskTlv09Q */

            @Override // com.ss.android.lark.voip.service.AbstractC58003d
            public final void onRtcStats(long j, long j2) {
                VCApiImpl.lambda$setRtcStatsListener$15(AbstractC57899a.this, j, j2);
            }
        });
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void getViewI18nTemplate(ErrorResult errorResult, IGetDataCallback<String> iGetDataCallback) {
        VideoChatModuleProvider.m224872a().mo208141a(errorResult, iGetDataCallback);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void guestOpenInMeetingPage(String str, String str2) {
        VideoChatModuleProvider.m224872a().mo208146a(str, str2);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void joinInterviewGroupMeeting(Context context, String str) {
        VideoChatModuleProvider.m224872a().mo208153b(context, str);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void openMeetingCodeInputPage(Context context, String str) {
        VideoChatModuleProvider.m224872a().mo208159c(context, str);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void openVCUrl(Context context, String str) {
        VideoChatModuleProvider.m224877f().openVCUrl(context, str);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void showPstnDetail(GetAdminSettingsResponse getAdminSettingsResponse, String str) {
        VideoChatModuleProvider.m224872a().mo208142a(getAdminSettingsResponse, str);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void simplifyOpenInMeetingPage(String str, String str2) {
        VideoChatModuleProvider.m224872a().mo208156b(str, str2);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void startPreVideoChatSettingActivity(Context context, String str) {
        VideoChatModuleProvider.m224872a().mo208136a(context, str);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public AbstractC58992f<MessageInfo, ? extends RecyclerView.ViewHolder> createVideoMeetingCardHolderView(Context context, Chat chat) {
        VideoChatModuleProvider.m224872a();
        return VideoChatModule.m235664h().mo220138a(context, chat);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void startVoIpActivityCheckPermission(Activity activity, String str) {
        C57865c.m224574a(new C57865c.AbstractC57873d(str) {
            /* class com.ss.android.lark.vcintegrator.$$Lambda$VCApiImpl$tqUM28Ogj7sO51n_VycFRLl98 */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return ((IIMApi) ApiUtils.getApi(IIMApi.class)).getChatterById(this.f$0);
            }
        }, new C57865c.AbstractC57871b(activity) {
            /* class com.ss.android.lark.vcintegrator.$$Lambda$VCApiImpl$fb2223WDlX7Ho6OPqKdYCRgrGo */
            public final /* synthetic */ Activity f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public final void consume(Object obj) {
                Activity activity;
                Chatter chatter;
                VoIpModuleProvider.m158862a().mo196598a(activity, chatter, null, new AbstractC57901c(this.f$0, (Chatter) obj) {
                    /* class com.ss.android.lark.vcintegrator.$$Lambda$VCApiImpl$_nN9_BcLFGUn8COxfbarERs8j4M */
                    public final /* synthetic */ Activity f$0;
                    public final /* synthetic */ Chatter f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.lark.vc.api.AbstractC57901c
                    public final void onError(VCLaunchError vCLaunchError) {
                        VCApiImpl.lambda$null$2(this.f$0, this.f$1, vCLaunchError);
                    }
                });
            }
        });
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void openJoinMeetingPage(Context context, String str) {
        VideoChatModuleProvider.m224877f().openJoinMeetingPage(context, "meeting_link_join", str);
    }

    static /* synthetic */ void lambda$null$12(AbstractC57899a aVar, long j, long j2) {
        if (aVar != null) {
            aVar.mo143234a(j, j2);
        }
    }

    static /* synthetic */ void lambda$setRtcStatsListener$15(AbstractC57899a aVar, long j, long j2) {
        if (aVar != null) {
            aVar.mo143234a(j, j2);
        }
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public AbstractC44552i getTabPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        VideoChatModuleProvider.m224872a();
        return VideoChatModule.m235643a(context, eVar, iTitleController);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void joinCalendarGroupMeeting(Context context, String str, String str2) {
        VideoChatModuleProvider.m224872a().mo208137a(context, str, str2);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void openEnterprisePhonePage(Chatter chatter, String str, String str2) {
        VideoChatModuleProvider.m224877f().mo220074a(chatter, str, str2);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void openJoinMeetingPage(Context context, String str, String str2) {
        VideoChatModuleProvider.m224877f().openJoinMeetingPage(context, str, str2);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void openJoinMeetingPageFromUrl(Context context, String str, String str2) {
        VideoChatModuleProvider.m224877f().mo220073a(context, str, str2);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public AbstractC34033a getChatTitleBarRightView(Activity activity, Chat chat, Chatter chatter) {
        return new C39438c().mo143324a(activity, chat, chatter);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public AbstractC44552i getMinutesTabPageSpec(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        return C39876a.m158359b().mo161081a(context, eVar, iTitleController);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public boolean handleSaysUrl(Context context, String str, int i) {
        return VideoChatModuleProvider.m224872a().mo208148a(context, str, i);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public boolean handleVcLiveUrl(Context context, String str, int i) {
        return C39399a.m155624a().mo149304a(context, str, i);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void joinInterviewGroupMeeting(Context context, String str, String str2) {
        VideoChatModuleProvider.m224872a().mo208154b(context, str, str2);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void launchVideoChat(Chatter chatter, boolean z, IGetDataCallback<VCLaunchError> iGetDataCallback) {
        C57865c.m224574a(new C57865c.AbstractC57873d(chatter, z, iGetDataCallback) {
            /* class com.ss.android.lark.vcintegrator.$$Lambda$VCApiImpl$ODv87UjGirFQDLxf_Mcfkz7bul8 */
            public final /* synthetic */ Chatter f$1;
            public final /* synthetic */ boolean f$2;
            public final /* synthetic */ IGetDataCallback f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return VCApiImpl.this.lambda$launchVideoChat$10$VCApiImpl(this.f$1, this.f$2, this.f$3);
            }
        }, $$Lambda$VCApiImpl$PGisAnJvGoRWg4no4V1N4ZItv9o.INSTANCE);
    }

    public /* synthetic */ Boolean lambda$launchVideoChat$10$VCApiImpl(Chatter chatter, boolean z, final IGetDataCallback iGetDataCallback) {
        VideoChatModuleProvider.m224877f().mo220075a(chatter, null, "user_profile", false, z, new IVideoChatService.AbstractC63626a() {
            /* class com.ss.android.lark.vcintegrator.VCApiImpl.C579644 */

            @Override // com.ss.android.vc.service.IVideoChatService.AbstractC63626a
            public void onError(VCLaunchError vCLaunchError) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(vCLaunchError);
                }
            }
        });
        return true;
    }

    static /* synthetic */ void lambda$null$2(Activity activity, Chatter chatter, VCLaunchError vCLaunchError) {
        if (vCLaunchError == VCLaunchError.COLLABORATION_AUTH_FAILED_NO_RIGHTS) {
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).showApplyCollabDialog(activity, new IInitBuilder() {
                /* class com.ss.android.lark.vcintegrator.$$Lambda$VCApiImpl$Ym29MUMnAWtuXCr17Hv1gwrmDf0 */

                @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder
                public final void init(IInitBuilder.IDialogBuilder cVar) {
                    Chatter chatter;
                    ((IInitBuilder.IApplyCollabDialogBuilder) ((IInitBuilder.IApplyCollabDialogBuilder) cVar).mo105548a(new Contact(chatter.getId(), chatter.getAvatarKey(), Chatter.this.getLocalizedName())).mo105555d("chat_vc_confirm")).mo105547a((Chatter) new ContactSource.C29531a().mo104726a(5).mo104728a());
                }
            });
        } else if (vCLaunchError == VCLaunchError.COLLABORATION_AUTH_FAILED_BLOCKED) {
            LKUIToast.show(activity, UIUtils.getString(activity, R.string.Lark_NewContacts_BlockedOthersUnableToXToastGeneral));
        } else if (vCLaunchError == VCLaunchError.COLLABORATION_AUTH_FAILED_BE_BLOCKED) {
            LKUIToast.show(activity, UIUtils.getString(activity, R.string.Lark_NewContacts_BlockedUnableToXToastGeneral));
        }
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void openMMUrl(Context context, String str, int i) {
        if (i == 5 || i == 6) {
            try {
                Statistics.sendEvent("link_clicked", new JSONObject().put("link_source", "minutes"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        C39876a.m158359b().mo161084a(context, str, i);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void bindViewWithVCMsg(TextView textView, TextView textView2, ImageView imageView, Content content) {
        VideoChatModule.m235648a(textView, textView2, imageView, content);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void startVoIpActivityCheckPermission(Activity activity, OpenChatter openChatter, String str, AbstractC57901c cVar) {
        VoIpModuleProvider.m158862a().mo196598a(activity, openChatter, str, cVar);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public AbstractC33989a getVcInfoBanner(Activity activity, Chat chat, Chatter chatter, final AbstractC33989a.AbstractC33990a aVar) {
        VideoChatModuleProvider.m224872a();
        final VideoChatModule.AbstractC60653b a = VideoChatModule.m235644a(activity, chat, chatter, new VideoChatModule.AbstractC60653b.AbstractC60654a() {
            /* class com.ss.android.lark.vcintegrator.VCApiImpl.C579611 */

            @Override // com.ss.android.vc.VideoChatModule.AbstractC60653b.AbstractC60654a
            /* renamed from: a */
            public void mo196514a() {
                aVar.mo124930a();
            }

            @Override // com.ss.android.vc.VideoChatModule.AbstractC60653b.AbstractC60654a
            /* renamed from: a */
            public void mo196516a(String str) {
                aVar.mo124932a(str);
            }

            @Override // com.ss.android.vc.VideoChatModule.AbstractC60653b.AbstractC60654a
            /* renamed from: a */
            public void mo196515a(View view, int i) {
                aVar.mo124931a(view, i);
            }
        });
        return new AbstractC33989a() {
            /* class com.ss.android.lark.vcintegrator.VCApiImpl.C579622 */
        };
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public boolean openXiaoMiVoip(Context context, String str, String str2, String str3, String str4) {
        return VideoChatModuleProvider.m224872a().mo208149a(context, str, str2, str3, str4);
    }

    @Override // com.ss.android.lark.vc.api.IVCApi
    public void getPstnDetailInfo(String str, String str2, String str3, String str4, String str5, String str6, GetPstnSipFeatureConfigRequest.CalendarType calendarType, String str7, final IGetDataCallback<PstnDetailInfoResponse2> iGetDataCallback) {
        VideoChatModuleProvider.m224872a().mo208147a(str, str2, str3, str4, str5, str6, calendarType, str7, new IGetDataCallback<PstnDetailInfoResponse>() {
            /* class com.ss.android.lark.vcintegrator.VCApiImpl.C579633 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(PstnDetailInfoResponse hVar) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback == null) {
                    return;
                }
                if (hVar != null) {
                    iGetDataCallback.onSuccess(new PstnDetailInfoResponse2(hVar.mo209904a(), hVar.mo209905b(), hVar.mo209906c(), hVar.mo209907d()));
                } else {
                    iGetDataCallback.onError(new ErrorResult("PstnDetailInfoResponse is null"));
                }
            }
        });
    }
}
