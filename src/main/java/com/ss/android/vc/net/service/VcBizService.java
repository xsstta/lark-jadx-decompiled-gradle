package com.ss.android.vc.net.service;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.pb.videochat.VCManageApplyResponse;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.aj;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.dto.VideoChatSearchChatterResponse;
import com.ss.android.vc.entity.ByteViewUserInfo;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.C60933b;
import com.ss.android.vc.entity.C60937f;
import com.ss.android.vc.entity.C60940j;
import com.ss.android.vc.entity.C60946m;
import com.ss.android.vc.entity.ChannelMeta;
import com.ss.android.vc.entity.CheckVcManageCapabilitiesEntity;
import com.ss.android.vc.entity.FeedbackBean;
import com.ss.android.vc.entity.FeedbackReasons;
import com.ss.android.vc.entity.MeetingSecuritySetting;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.QuerySource;
import com.ss.android.vc.entity.Room;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.breakoutroom.BreakoutRoomManage;
import com.ss.android.vc.entity.breakoutroom.VCBreakoutRoomJoinEntity;
import com.ss.android.vc.entity.request.HostManageRequest;
import com.ss.android.vc.entity.request.JoinMeetingPreCheckEntityRequest;
import com.ss.android.vc.entity.request.ManageApprovalRequest;
import com.ss.android.vc.entity.request.ParticipantSettingRequest;
import com.ss.android.vc.entity.request.ShareScreenToRoomEntityRequest;
import com.ss.android.vc.entity.response.C60959ae;
import com.ss.android.vc.entity.response.C60960af;
import com.ss.android.vc.entity.response.C60965at;
import com.ss.android.vc.entity.response.C60966b;
import com.ss.android.vc.entity.response.C60972f;
import com.ss.android.vc.entity.response.C60975i;
import com.ss.android.vc.entity.response.GrootChannelEntity;
import com.ss.android.vc.entity.response.JoinMeetingEntity;
import com.ss.android.vc.entity.response.RejoinVideoChatEntity;
import com.ss.android.vc.entity.response.SearchUsersAndChatsEntity;
import com.ss.android.vc.entity.response.SketchStartEntity;
import com.ss.android.vc.entity.response.ao;
import com.ss.android.vc.entity.response.aw;
import com.ss.android.vc.entity.response.ax;
import com.ss.android.vc.entity.response.az;
import com.ss.android.vc.entity.sketch.SketchOperationUnit;
import com.ss.android.vc.entity.tab.VCMeetingJoinInfoEntity;
import com.ss.android.vc.entity.tab.VCTabListHistoryListEntity;
import com.ss.android.vc.entity.tab.VCTabListItem;
import com.ss.android.vc.entity.tab.VcTabDetailResponse;
import com.ss.android.vc.lark.setting.C61188b;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.manager.p3106a.C61273c;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.EventSource;
import com.ss.android.vc.meeting.framework.statemachine.AbstractC61346l;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.busyring.C61543c;
import com.ss.android.vc.meeting.module.feedback.C61677e;
import com.ss.android.vc.meeting.module.lobby.AbsJoinLobbyIntercept;
import com.ss.android.vc.meeting.module.multi.MeetingNetDisconnectActivity;
import com.ss.android.vc.meeting.utils.TimeConsumeUtils;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckData;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckUtils;
import com.ss.android.vc.meeting.utils.meetingcheck.rx.XConsumer;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.C63603f;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.request.VcBizTask;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.p3069b.p3072c.C60675a;
import com.ss.android.vc.service.VideoChatManager;
import com.ss.android.vc.service.XIGetDataCallback;
import com.ss.android.vc.statistics.event.C63739ai;
import com.ss.android.vc.statistics.event.C63758h;
import com.ss.android.vc.statistics.event.C63760j;
import com.ss.android.vc.statistics.event.am;
import com.ss.android.vc.statistics.monitor.C63780b;
import com.ss.android.vc.statistics.monitor.C63781c;
import com.ss.android.vc.statistics.p3180a.C63690d;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vc.statistics.p3182c.C63726b;
import com.ss.android.vc.trace.C63784a;
import com.ss.android.vc.trace.VCLauncherStatistics;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import io.reactivex.p3457e.C68296b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;

@XClass(isStatic = true)
public class VcBizService {

    @Retention(RetentionPolicy.SOURCE)
    public @interface RejoinMeetingType {
    }

    public static void sendManageRequest(String str, String str2, BreakoutRoomManage breakoutRoomManage, HostManageRequest.Action action, String str3, String str4, ParticipantType participantType, boolean z, boolean z2, boolean z3, Boolean bool, String str5) {
        sendManageRequest(str, str2, breakoutRoomManage, action, str3, str4, participantType, z, z2, z3, bool, null, str5);
    }

    public static void sendManageRequest(String str, String str2, BreakoutRoomManage breakoutRoomManage, HostManageRequest.Action action, String str3, String str4, ParticipantType participantType, boolean z, boolean z2, boolean z3, Boolean bool, String str5, String str6) {
        if (action != null) {
            HostManageRequest hostManageRequest = new HostManageRequest();
            hostManageRequest.setAction(action);
            hostManageRequest.setBreakoutRoomId(str2);
            hostManageRequest.setBreakoutRoomManage(breakoutRoomManage);
            hostManageRequest.setMuted(z);
            hostManageRequest.setLocked(z2);
            hostManageRequest.setTopic(str6);
            hostManageRequest.setMuteOnEntry(z3);
            hostManageRequest.setAllowPartiUnmute(bool);
            hostManageRequest.setParticipantId(str3);
            hostManageRequest.setParticipantDeviceId(str4);
            hostManageRequest.setParticipantType(participantType);
            hostManageRequest.setMeetingId(str);
            hostManageRequest.setGlobalSpokenLanguage(str5);
            VcBizSender.m249150a(hostManageRequest).mo219893b(new VcBizSender.C63594a("hostManage"));
        }
    }

    public static void initForFeedback() {
        VcBizSender.m249259d().mo219893b(new AbstractC63598b<FeedbackReasons>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass31 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VcBizService", "[initForFeedback2]", "[onError] " + eVar.toString());
            }

            public void onSuccess(FeedbackReasons feedbackReasons) {
                C61677e a;
                C60700b.m235843a("VcBizService", "[initForFeedback]", "[onSuccess] " + feedbackReasons);
                if (feedbackReasons != null && (a = C61677e.m240737a()) != null) {
                    a.mo213625a(feedbackReasons.meetingFeedbackReason);
                }
            }
        });
    }

    public static void triggerPushFullMeetingInfo() {
        VcBizSender.m249135a().mo219893b(new AbstractC63598b<C60946m>() {
            /* class com.ss.android.vc.net.service.VcBizService.C636248 */

            public void onSuccess(C60946m mVar) {
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VcBizService", "[triggerPushFullMeetingInfo2]", "error: " + eVar.toString());
            }
        });
    }

    public static void triggerPushSelfInfo() {
        VcBizSender.m249225b().mo219893b(new AbstractC63598b<aw>() {
            /* class com.ss.android.vc.net.service.VcBizService.C636259 */

            public void onSuccess(aw awVar) {
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VcBizService", "[triggerPushSelfInfo2]", "error: " + eVar.toString());
            }
        });
    }

    public static void getVCMeetingJoinStatus(final AbstractC63598b bVar) {
        VcBizSender.m249289i().mo219889a(new AbstractC63598b<VCMeetingJoinInfoEntity>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass16 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onError(eVar);
                }
            }

            public void onSuccess(VCMeetingJoinInfoEntity vCMeetingJoinInfoEntity) {
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onSuccess(vCMeetingJoinInfoEntity);
                }
            }
        });
    }

    public static void getVideoChatUserSetting(final AbstractC63598b bVar) {
        VcBizSender.m249292j().mo219889a(new AbstractC63598b<C61188b>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass28 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onError(eVar);
                }
            }

            public void onSuccess(C61188b bVar) {
                AbstractC63598b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.onSuccess(bVar);
                }
            }
        });
    }

    public static void noticeByteviewEvent(boolean z) {
        VcBizSender.m249242b(z).mo219893b(new AbstractC63598b<C60959ae>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass32 */

            public void onSuccess(C60959ae aeVar) {
                C60700b.m235843a("VcBizService", "[noticeByteviewEvent]", "success");
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VcBizService", "[noticeByteviewEvent2]", "error = " + eVar.toString());
            }
        });
    }

    public static void submit1v1Feedback(FeedbackBean feedbackBean) {
        VcBizSender.m249144a(feedbackBean).mo219893b(new AbstractC63598b<String>() {
            /* class com.ss.android.vc.net.service.VcBizService.C636183 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VcBizService", "[submit1v1Feedback2]", "error " + eVar.toString());
            }

            public void onSuccess(String str) {
                C60700b.m235843a("VcBizService", "[submit1v1Feedback]", "success " + str);
            }
        });
    }

    public static void backToMainBreakoutRoom(String str, AbstractC63598b<VCBreakoutRoomJoinEntity> bVar) {
        VcBizSender.m249220a(str, "1", bVar);
    }

    public static void fetchAllSketchData(String str, final AbstractC63598b<C60975i> bVar) {
        VcBizSender.m249286h(str).mo219889a(new AbstractC63598b<C60975i>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass23 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                bVar.onError(eVar);
            }

            public void onSuccess(C60975i iVar) {
                bVar.onSuccess(iVar);
            }
        });
    }

    public static void getBriefPrimaryCalendar(boolean z, final AbstractC63598b bVar) {
        VcBizSender.m249205a(z).mo219889a(new AbstractC63598b<String>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass15 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onError(eVar);
                }
            }

            public void onSuccess(String str) {
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onSuccess(str);
                }
            }
        });
    }

    public static void getChatterById(String str, IGetDataCallback<OpenChatter> iGetDataCallback) {
        C60735ab.m236018e(new Runnable(str, iGetDataCallback) {
            /* class com.ss.android.vc.net.service.$$Lambda$VcBizService$hPSEi7jlb0O8_gc7yEgHHi4A30g */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ IGetDataCallback f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                VideoChatModuleDependency.getChatDependency().getChatterById(this.f$0, new XIGetDataCallback<OpenChatter>(this.f$1) {
                    /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass30 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    @XMethod
                    public void onError(ErrorResult errorResult) {
                        C60735ab.m236001a(new Runnable(errorResult) {
                            /* class com.ss.android.vc.net.service.$$Lambda$VcBizService$30$_uXmiy1oPZ7dbnHcwGPmPqWDI */
                            public final /* synthetic */ ErrorResult f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                VcBizService.AnonymousClass30.lambda$onError$1(IGetDataCallback.this, this.f$1);
                            }
                        });
                    }

                    @XMethod
                    public void onSuccess(OpenChatter openChatter) {
                        C60735ab.m236001a(new Runnable(openChatter) {
                            /* class com.ss.android.vc.net.service.$$Lambda$VcBizService$30$09hCulZCUxCd766JGebij2rKz8 */
                            public final /* synthetic */ OpenChatter f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                VcBizService.AnonymousClass30.lambda$onSuccess$0(IGetDataCallback.this, this.f$1);
                            }
                        });
                    }

                    static /* synthetic */ void lambda$onError$1(IGetDataCallback iGetDataCallback, ErrorResult errorResult) {
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onError(errorResult);
                        }
                    }

                    static /* synthetic */ void lambda$onSuccess$0(IGetDataCallback iGetDataCallback, OpenChatter openChatter) {
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(openChatter);
                        }
                    }
                });
            }
        });
    }

    public static void getRoomById(final List<String> list, final UIGetDataCallback<Map<String, Room>> uIGetDataCallback) {
        VcBizSender.m249200a(list).mo219893b(new AbstractC63598b<Map<String, Room>>() {
            /* class com.ss.android.vc.net.service.VcBizService.C636161 */

            public void onSuccess(Map<String, Room> map) {
                C60700b.m235843a("VcBizService", "[getRoomById]", "success");
                UIGetDataCallback uIGetDataCallback = uIGetDataCallback;
                if (uIGetDataCallback != null) {
                    uIGetDataCallback.onSuccess(map);
                }
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VcBizService", "[getRoomById2]", "error = " + eVar + ", roomIds = " + list);
                UIGetDataCallback uIGetDataCallback = uIGetDataCallback;
                if (uIGetDataCallback != null) {
                    uIGetDataCallback.onError(eVar.f160599b);
                }
            }
        });
    }

    public static void getVCTabListUpcoming(Long l, final AbstractC63598b bVar) {
        VcBizSender.m249156a(l).mo219889a(new AbstractC63598b<List<VCTabListItem>>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass14 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onError(eVar);
                }
            }

            public void onSuccess(List<VCTabListItem> list) {
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onSuccess(list);
                }
            }
        });
    }

    public static void askHostForHelp(String str, String str2, AbstractC63598b<VCManageApplyResponse> bVar) {
        VcBizSender.m249248b(str, str2, bVar);
    }

    public static void checkVCManageCapabilities(String str, ByteviewUser byteviewUser, AbstractC63598b<CheckVcManageCapabilitiesEntity> bVar) {
        VcBizSender.m249161a(str, byteviewUser).mo219893b(bVar);
    }

    public static void pullParticipantInfos(String str, Map<String, ParticipantType> map, AbstractC63598b<List<ByteViewUserInfo>> bVar) {
        VcBizSender.m249253c(str, map).mo219893b(bVar);
    }

    public static void requestI18nTemplate(List<String> list, Map<String, String> map, AbstractC63598b<List<String>> bVar) {
        VcBizSender.m249241b(list, map).mo219889a(bVar);
    }

    public static void entrustServerTrack(String str, String str2, final AbstractC63598b<Boolean> bVar) {
        VcBizSender.m249281g(str, str2).mo219893b(new AbstractC63598b<C60933b>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass34 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onError(eVar);
                }
            }

            public void onSuccess(C60933b bVar) {
                AbstractC63598b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.onSuccess(true);
                }
            }
        });
    }

    public static void grootCloseChannel(ChannelMeta.GrootChannel grootChannel, String str, final AbstractC63598b bVar) {
        VcBizSender.m249227b(grootChannel, str).mo219889a(new AbstractC63598b<C60972f>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass21 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                bVar.onError(eVar);
            }

            public void onSuccess(C60972f fVar) {
                bVar.onSuccess(fVar);
            }
        });
    }

    public static void grootOpenChannelWithoutVersion(ChannelMeta.GrootChannel grootChannel, String str, final AbstractC63598b bVar) {
        VcBizSender.m249141a(grootChannel, str).mo219889a(new AbstractC63598b<C60960af>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass20 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                bVar.onError(eVar);
            }

            public void onSuccess(C60960af afVar) {
                bVar.onSuccess(afVar);
            }
        });
    }

    public static void modifyVideoChatUserSetting(int i, boolean z, final AbstractC63598b bVar) {
        VcBizSender.m249139a(i, z).mo219893b(new AbstractC63598b<C61188b>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass29 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onError(eVar);
                }
            }

            public void onSuccess(C61188b bVar) {
                AbstractC63598b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.onSuccess(bVar);
                }
            }
        });
    }

    public static void sendGrootChannelHeartBeat(String str, GrootChannelEntity grootChannelEntity, final AbstractC63598b bVar) {
        VcBizSender.m249173a(str, grootChannelEntity).mo219889a(new AbstractC63598b<ao>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass24 */

            public void onSuccess(ao aoVar) {
                C60700b.m235843a("VcBizService", "[sendGrootChannelHeartBeat]", "success " + aoVar);
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onSuccess(aoVar);
                }
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VcBizService", "[sendGrootChannelHeartBeat2]", "error " + eVar.toString());
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onError(eVar);
                }
            }
        });
    }

    public static void sendSketchAccessibilityRequest(String str, String str2, final AbstractC63598b<C60966b> bVar) {
        VcBizSender.m249275f(str, str2).mo219893b(new AbstractC63598b<C60966b>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass27 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                bVar.onError(eVar);
            }

            public void onSuccess(C60966b bVar) {
                bVar.onSuccess(bVar);
            }
        });
    }

    public static void sendSketchStartRequest(String str, String str2, final AbstractC63598b bVar) {
        VcBizSender.m249252c(str, str2).mo219893b(new AbstractC63598b<SketchStartEntity>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass25 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onError(eVar);
                }
            }

            public void onSuccess(SketchStartEntity sketchStartEntity) {
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onSuccess(sketchStartEntity);
                }
            }
        });
    }

    @XMethod
    public static void searchUserInMeeting(IGetDataCallback<VideoChatSearchChatterResponse> iGetDataCallback, String str, String str2, int i) {
        VcBizSender.m249213a(iGetDataCallback, str, str2, i);
    }

    @XMethod
    public static void searchUserRealInMeeting(IGetDataCallback<VideoChatSearchChatterResponse> iGetDataCallback, String str, String str2, int i) {
        VcBizSender.m249244b(iGetDataCallback, str, str2, i);
    }

    public static void getVcTabDetailInfo(String str, String str2, boolean z, final AbstractC63598b bVar) {
        VcBizSender.m249191a(str, str2, z).mo219889a(new AbstractC63598b<VcTabDetailResponse>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass17 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                bVar.onError(eVar);
            }

            public void onSuccess(VcTabDetailResponse gVar) {
                bVar.onSuccess(gVar);
            }
        });
    }

    public static void grootOpenChannel(ChannelMeta.GrootChannel grootChannel, String str, int i, final AbstractC63598b bVar) {
        VcBizSender.m249142a(grootChannel, str, i).mo219889a(new AbstractC63598b<C60960af>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass19 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                bVar.onError(eVar);
            }

            public void onSuccess(C60960af afVar) {
                bVar.onSuccess(afVar);
            }
        });
    }

    public static void sendSketchGrootCellRequest(String str, String str2, List<SketchOperationUnit> list, final AbstractC63598b<ao> bVar) {
        VcBizSender.m249190a(str, str2, list).mo219893b(new AbstractC63598b<ao>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass26 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onError(eVar);
                }
            }

            public void onSuccess(ao aoVar) {
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onSuccess(aoVar);
                }
            }
        });
    }

    public static void muteCamera(String str, boolean z, boolean z2, boolean z3) {
        VcBizTask<String> a = VcBizSender.m249198a(str, z, z2, z3);
        a.mo219893b(new VcBizSender.C63594a("muteCamera " + z));
    }

    public static void reJoinVideoMeeting(final int i, String str, final boolean z, final AbstractC63598b<RejoinVideoChatEntity> bVar) {
        if (!TextUtils.isEmpty(str)) {
            C63690d.m249677a();
            VcBizSender.m249195a(str, z).mo219893b(new AbstractC63598b<RejoinVideoChatEntity>() {
                /* class com.ss.android.vc.net.service.VcBizService.C636194 */
                private final Context context = ar.m236694a();

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("VcBizService", "[reJoinVideoMeeting3]", "onError " + eVar.toString());
                    if (!eVar.f160600c) {
                        C60738ac.m236023a((int) R.string.View_M_FailedToJoinMeeting);
                    }
                    AbstractC63598b bVar = bVar;
                    if (bVar != null) {
                        bVar.onError(eVar);
                    }
                }

                public void onSuccess(final RejoinVideoChatEntity rejoinVideoChatEntity) {
                    if (rejoinVideoChatEntity == null || rejoinVideoChatEntity.f152612b == null) {
                        C60738ac.m236023a((int) R.string.View_M_FailedToJoinMeeting);
                    } else if (i != 2 || MeetingNetDisconnectActivity.m244183c() || z) {
                        MeetingCheckUtils.meetingCheck(ar.m236694a(), "0", JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.GROUPID, false, "meeting_disconnect_rejoin_click", UUID.randomUUID().toString(), 1, false).subscribe(new XConsumer<MeetingCheckData>() {
                            /* class com.ss.android.vc.net.service.VcBizService.C636194.C636201 */

                            @XMethod
                            public void accept(MeetingCheckData bVar) throws Exception {
                                if (bVar.mo219661a().booleanValue()) {
                                    if (rejoinVideoChatEntity.f152612b == RejoinVideoChatEntity.StatusCode.SUCCESS) {
                                        if (rejoinVideoChatEntity.f152611a != null) {
                                            if (i == 1) {
                                                MeetingAudioManager.m239471k().mo212694b(false);
                                            }
                                            VideoChat videoChat = rejoinVideoChatEntity.f152611a;
                                            C60700b.m235851b("VcBizService", "[reJoinVideoMeeting2]", "success sendVideoChatToStateMachine");
                                            C57744a.m224104a().putBoolean("is_rejoin", true);
                                            if (AbsJoinLobbyIntercept.processIntercept(rejoinVideoChatEntity) == AbsJoinLobbyIntercept.LobbyJoinType.UNKNOWN) {
                                                VideoChatManager.m249444a().mo220105a(videoChat);
                                            } else {
                                                VideoChatManager.m249444a().mo220115a(true);
                                                VideoChatManager.m249444a().mo220118b(true);
                                                VideoChatManager.m249444a().mo220113a((Boolean) false);
                                                VideoChatManager.m249444a().mo220121c(false);
                                                VideoChatManager.m249444a().mo220117b((Boolean) true);
                                                VideoChatManager.m249444a().mo220126e((Boolean) false);
                                                C61273c.m238400a(rejoinVideoChatEntity.f152611a, rejoinVideoChatEntity.f152613c);
                                            }
                                        }
                                        C63603f.m249428a(rejoinVideoChatEntity);
                                    } else if (rejoinVideoChatEntity.f152612b == RejoinVideoChatEntity.StatusCode.MEETING_END_ERROR) {
                                        C60738ac.m236023a((int) R.string.View_M_MeetingHasEnded);
                                    } else if (rejoinVideoChatEntity.f152612b == RejoinVideoChatEntity.StatusCode.PARTICIPANT_LIMIT_EXCEED_ERROR) {
                                        C60738ac.m236023a((int) R.string.View_M_CapacityReached);
                                    } else if (rejoinVideoChatEntity.f152612b == RejoinVideoChatEntity.StatusCode.VoIP_BUSY_ERROR) {
                                        C60738ac.m236023a((int) R.string.View_G_CurrentlyInCall);
                                    } else {
                                        C60738ac.m236023a((int) R.string.View_M_FailedToJoinMeeting);
                                    }
                                    if (bVar != null) {
                                        bVar.onSuccess(rejoinVideoChatEntity);
                                    }
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public static String createVideoChatCall(VideoChat videoChat, String str, C61303k kVar, AbstractC63598b<Unit> bVar) {
        if (videoChat == null || videoChat.getType() == VideoChat.Type.MEET) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(videoChat.getParticipants().get(0).getId());
        return createVideoChat(videoChat, arrayList, str, "", kVar, bVar);
    }

    public static void sendManageRequest(String str, HostManageRequest.Action action, MeetingSecuritySetting meetingSecuritySetting, AbstractC63598b<String> bVar) {
        if (action != null) {
            HostManageRequest hostManageRequest = new HostManageRequest();
            hostManageRequest.setAction(action);
            hostManageRequest.setMuted(false);
            hostManageRequest.setSecuritySetting(meetingSecuritySetting);
            hostManageRequest.setTopic(null);
            hostManageRequest.setMuteOnEntry(false);
            hostManageRequest.setParticipantId(null);
            hostManageRequest.setParticipantDeviceId(null);
            hostManageRequest.setParticipantType(null);
            hostManageRequest.setMeetingId(str);
            VcBizSender.m249150a(hostManageRequest).mo219889a(bVar);
        }
    }

    public static void sendManageRequest(String str, HostManageRequest.Action action, boolean z, List<C60940j> list) {
        if (action != null) {
            HostManageRequest hostManageRequest = new HostManageRequest();
            hostManageRequest.setAction(action);
            hostManageRequest.setMeetingId(str);
            C60937f fVar = new C60937f();
            fVar.f152494a = z;
            fVar.f152495b = list;
            hostManageRequest.setInterpretationSetting(fVar);
            VcBizSender.m249150a(hostManageRequest).mo219893b(new VcBizSender.C63594a("hostManage"));
        }
    }

    public static void createVcTabMeetingStatisticsInfo(String str, String str2, boolean z, String str3, final AbstractC63598b<Object> bVar) {
        VcBizSender.m249223a(str, str2, z, str3, new AbstractC63598b<Object>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass18 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                bVar.onError(eVar);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                bVar.onSuccess(obj);
            }
        });
    }

    public static void getVCTabListHistory(String str, Long l, boolean z, final AbstractC63598b bVar, boolean z2) {
        VcBizSender.m249177a(str, l, z).mo219891a(z2, new AbstractC63598b<VCTabListHistoryListEntity>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass13 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onError(eVar);
                }
            }

            public void onSuccess(VCTabListHistoryListEntity vCTabListHistoryListEntity) {
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onSuccess(vCTabListHistoryListEntity);
                }
            }
        });
    }

    public static void openFollowGrootChannel(ChannelMeta.GrootChannel grootChannel, String str, String str2, int i, final AbstractC63598b bVar) {
        VcBizSender.m249143a(grootChannel, str, str2, i).mo219889a(new AbstractC63598b<C60960af>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass11 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                bVar.onError(eVar);
            }

            public void onSuccess(C60960af afVar) {
                bVar.onSuccess(afVar);
            }
        });
    }

    public static void openVCTabGrootChannel(ChannelMeta.GrootChannel grootChannel, String str, String str2, int i, final AbstractC63598b bVar) {
        VcBizSender.m249228b(grootChannel, str, str2, i).mo219889a(new AbstractC63598b<C60960af>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass12 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onError(eVar);
                }
            }

            public void onSuccess(C60960af afVar) {
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onSuccess(afVar);
                }
            }
        });
    }

    public static void pullParticipantInfo(String str, String str2, ParticipantType participantType, String str3, final UIGetDataCallback<ByteViewUserInfo> uIGetDataCallback) {
        VcBizSender.m249181a(str, str2, participantType, str3).mo219893b(new AbstractC63598b<ByteViewUserInfo>() {
            /* class com.ss.android.vc.net.service.VcBizService.C636172 */

            public void onSuccess(ByteViewUserInfo byteViewUserInfo) {
                UIGetDataCallback uIGetDataCallback = uIGetDataCallback;
                if (uIGetDataCallback != null) {
                    uIGetDataCallback.onSuccess(byteViewUserInfo);
                }
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                UIGetDataCallback uIGetDataCallback = uIGetDataCallback;
                if (uIGetDataCallback != null) {
                    uIGetDataCallback.onError(eVar.f160599b);
                }
            }
        });
    }

    public static void searchUserAndChatterForSharing(String str, int i, int i2, boolean z, final AbstractC63598b<SearchUsersAndChatsEntity> bVar) {
        VcBizSender.m249159a(str, i, i2, z).mo219893b(new AbstractC63598b<SearchUsersAndChatsEntity>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass33 */

            public void onSuccess(SearchUsersAndChatsEntity searchUsersAndChatsEntity) {
                C60700b.m235843a("VcBizService", "[searchUserAndChatterForSharing]", "success");
                bVar.onSuccess(searchUsersAndChatsEntity);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VcBizService", "[searchUserAndChatterForSharing2]", "error = " + eVar.toString());
                bVar.onError(eVar);
            }
        });
    }

    public static String updateVideoChat(C61303k kVar, String str, int i, ParticipantSettings participantSettings, AbstractC63598b bVar) {
        return updateVideoChat(kVar, str, null, i, participantSettings, bVar);
    }

    public static void manageApproval(String str, ManageApprovalRequest.ApprovalType approvalType, ManageApprovalRequest.ApprovalAction approvalAction, List<ByteviewUser> list, AbstractC63598b<String> bVar) {
        ManageApprovalRequest manageApprovalRequest = new ManageApprovalRequest();
        manageApprovalRequest.setMeetingId(str);
        manageApprovalRequest.setApprovalType(approvalType);
        manageApprovalRequest.setApprovalAction(approvalAction);
        manageApprovalRequest.setByteviewUsers(list);
        VcBizSender.m249152a(manageApprovalRequest).mo219893b(bVar);
    }

    public static void muteAudio(String str, String str2, boolean z, boolean z2, boolean z3) {
        VcBizTask<String> a = VcBizSender.m249192a(str, str2, z, z2, z3);
        a.mo219893b(new VcBizSender.C63594a("muteAudio " + z));
    }

    public static void changeOwnSetting(String str, ParticipantSettings participantSettings, ParticipantSettings.EquipmentStatus equipmentStatus, ParticipantSettings.EquipmentStatus equipmentStatus2, boolean z, boolean z2) {
        changeOwnSetting(str, participantSettings, equipmentStatus, equipmentStatus2, z, z2, null);
    }

    public static String createVideoChatMeet(VideoChat videoChat, boolean z, String str, boolean z2, AbstractC63598b bVar, C61303k kVar) {
        if (videoChat == null || videoChat.getType() == VideoChat.Type.CALL) {
            return "";
        }
        return createMeeting(videoChat, videoChat.getGroudId(), z, str, z2, kVar, bVar);
    }

    public static void shareScreenToRoom(ShareScreenToRoomEntityRequest.JoinPath joinPath, String str, String str2, ShareScreenToRoomEntityRequest.ShareType shareType, String str3, AbstractC63598b<C60965at> bVar) {
        ShareScreenToRoomEntityRequest shareScreenToRoomEntityRequest = new ShareScreenToRoomEntityRequest();
        shareScreenToRoomEntityRequest.mo210048a(joinPath);
        shareScreenToRoomEntityRequest.mo210051a(str);
        shareScreenToRoomEntityRequest.mo210053b(str2);
        shareScreenToRoomEntityRequest.mo210049a(shareType);
        if (!TextUtils.isEmpty(str3)) {
            shareScreenToRoomEntityRequest.mo210050a(new ShareScreenToRoomEntityRequest.MagicShareInfo(str3));
        }
        VcBizSender.m249154a(shareScreenToRoomEntityRequest).mo219893b(bVar);
    }

    public static String createVideoChat(final VideoChat videoChat, List<String> list, String str, String str2, final C61303k kVar, final AbstractC63598b<Unit> bVar) {
        String str3 = "";
        if (videoChat == null) {
            return str3;
        }
        aj settingDependency = VideoChatModuleDependency.getSettingDependency();
        int number = VideoChat.VendorType.UNKNOWN_VENDOR_TYPE.getNumber();
        final String creatingId = videoChat.getCreatingId();
        final VideoChat.Type type = videoChat.getType();
        if (type == VideoChat.Type.MEET) {
            number = VideoChat.VendorType.RTC.getNumber();
        } else {
            VideoChat.Type type2 = VideoChat.Type.CALL;
        }
        long syncNtpTimeMillis = settingDependency.getSyncNtpTimeMillis();
        C636215 r15 = new AbstractC63598b<VideoChat>() {
            /* class com.ss.android.vc.net.service.VcBizService.C636215 */

            public void onSuccess(VideoChat videoChat) {
                if (videoChat != null) {
                    C60700b.m235851b("VcBizService", "[createVideoChat2]", "Success, meeting = " + videoChat.getId());
                    VcBizService.goIntoMeeting(videoChat, videoChat, kVar, creatingId, type, bVar);
                }
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                String str;
                int i;
                C61303k kVar;
                StringBuilder sb = new StringBuilder();
                sb.append("err = ");
                sb.append(eVar);
                sb.append(" , meeting = ");
                if (kVar == null) {
                    str = "null";
                } else {
                    str = "notNull";
                }
                sb.append(str);
                C60700b.m235864f("VcBizService", "[createVideoChat3]", sb.toString());
                VideoChat videoChat = new VideoChat();
                videoChat.setCreatingId(creatingId);
                videoChat.setType(type);
                C61303k kVar2 = kVar;
                if (kVar2 != null) {
                    kVar2.mo212052b().mo212267b().mo212274a(EventSource.EVENT_SENDER.toString(), "createVideoChat err");
                    kVar.mo212051a(C61344j.m239002a().mo212330a(videoChat).mo212329a(SmEvents.EVENT_RE).mo212331a(EventSource.EVENT_SENDER));
                    C60700b.m235845a("Rust", "StateEngine", "create vc error!!!", "VcBizService", "[dispatch] event=113");
                }
                VideoChat.Type type = type;
                int i2 = 0;
                if (eVar == null) {
                    i = 0;
                } else {
                    i = eVar.mo219899a();
                }
                C63781c.m250415a(type, i);
                ar.m236694a();
                if (eVar == null || eVar.mo219899a() != 220001) {
                    if (eVar == null || eVar.mo219899a() != 220002) {
                        if (eVar == null || eVar.mo219899a() != 220005) {
                            if (eVar == null || eVar.mo219899a() != 220003) {
                                if (eVar != null && eVar.mo219899a() == 220006) {
                                    am.m250022a("banned");
                                } else if (eVar == null || !(eVar.mo219899a() == 10008 || eVar.mo219899a() == 10009)) {
                                    if (type != VideoChat.Type.CALL) {
                                        am.m250021a();
                                    } else if (eVar != null && eVar.mo219899a() >= 220000 && eVar.mo219899a() < 230000) {
                                        C63760j.m250295a(6, videoChat.isVoiceCall(), kVar.mo212093K());
                                    } else if (eVar == null || eVar.mo219899a() < 10000 || eVar.mo219899a() >= 11000) {
                                        C63760j.m250295a(100, videoChat.isVoiceCall(), kVar.mo212093K());
                                    } else {
                                        C63760j.m250295a(7, videoChat.isVoiceCall(), kVar.mo212093K());
                                    }
                                    if (!eVar.f160600c) {
                                        if (eVar != null) {
                                            i2 = eVar.mo219899a();
                                        }
                                        C60738ac.m236029a(UIHelper.mustacheFormat((int) R.string.View_VM_OperationFailedCodeErrorCode, "error_code", Integer.toString(i2)));
                                    }
                                } else {
                                    if (type == VideoChat.Type.CALL) {
                                        C63760j.m250295a(1, videoChat.isVoiceCall(), kVar.mo212093K());
                                    } else {
                                        am.m250021a();
                                    }
                                    C60738ac.m236023a((int) R.string.View_G_ConnectionError);
                                }
                            } else if (type == VideoChat.Type.CALL) {
                                C63760j.m250295a(2, videoChat.isVoiceCall(), kVar.mo212093K());
                            } else {
                                am.m250021a();
                            }
                        } else if (type == VideoChat.Type.CALL) {
                            C63760j.m250295a(5, videoChat.isVoiceCall(), kVar.mo212093K());
                        } else {
                            am.m250021a();
                        }
                    } else if (type == VideoChat.Type.CALL) {
                        C63760j.m250295a(3, videoChat.isVoiceCall(), kVar.mo212093K());
                    } else {
                        am.m250021a();
                    }
                } else if (type == VideoChat.Type.CALL) {
                    C63760j.m250295a(4, videoChat.isVoiceCall(), kVar.mo212093K());
                } else {
                    am.m250021a();
                }
                if (eVar != null && (kVar = kVar) != null) {
                    kVar.mo212110a(eVar.f160598a);
                }
            }
        };
        if (kVar.mo212084B() != null) {
            str3 = kVar.mo212084B().mo212205f();
        }
        VcBizTask<VideoChat> a = VcBizSender.m249163a(str2, type, list, number, str, syncNtpTimeMillis, false, videoChat.isVoiceCall(), kVar.mo212092J().mo212504A(), kVar.mo212092J().mo212505B(), str3);
        a.mo219893b(r15);
        return a.mo219895c();
    }

    public static void sendManageRequest(String str, HostManageRequest.Action action, String str2, String str3, ParticipantType participantType, HostManageRequest.CoHostAction coHostAction) {
        if (action != null) {
            HostManageRequest hostManageRequest = new HostManageRequest();
            hostManageRequest.setAction(action);
            hostManageRequest.setParticipantId(str2);
            hostManageRequest.setParticipantDeviceId(str3);
            hostManageRequest.setParticipantType(participantType);
            hostManageRequest.setMeetingId(str);
            if (coHostAction != null) {
                hostManageRequest.setCoHostAction(coHostAction);
            }
            VcBizSender.m249150a(hostManageRequest).mo219893b(new VcBizSender.C63594a("hostManage"));
        }
    }

    public static String updateVideoChat(final C61303k kVar, String str, String str2, int i, ParticipantSettings participantSettings, final AbstractC63598b bVar) {
        ParticipantSettings.EquipmentStatus equipmentStatus;
        ParticipantSettings.EquipmentStatus equipmentStatus2;
        boolean z;
        boolean z2;
        if (participantSettings != null) {
            boolean isCameraMuted = participantSettings.isCameraMuted();
            z2 = participantSettings.isMicrophoneMuted();
            z = isCameraMuted;
            equipmentStatus = participantSettings.getCameraStatus();
            equipmentStatus2 = participantSettings.getMicrophoneStatus();
        } else {
            equipmentStatus2 = null;
            equipmentStatus = null;
            z2 = false;
            z = false;
        }
        long syncNtpTimeMillis = VideoChatModuleDependency.getSettingDependency().getSyncNtpTimeMillis();
        final VideoChat.UpdateVideoChatAction forNumber = VideoChat.UpdateVideoChatAction.forNumber(i);
        AnonymousClass10 r0 = new AbsJoinLobbyIntercept<ax>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass10 */

            public void onLobbySuccess(ax axVar) {
                C63693e.m249689e();
                if (forNumber == VideoChat.UpdateVideoChatAction.ACCEPT) {
                    C61543c.m240214a(kVar, (int) SmEvents.EVENT_NW);
                }
                kVar.mo212111a(axVar.f152663a, axVar.f152664b);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                String str;
                VCLauncherStatistics.m250426d();
                C63693e.m249689e();
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onError(null);
                }
                if (forNumber == VideoChat.UpdateVideoChatAction.ACCEPT && kVar != null) {
                    kVar.mo212051a(C61344j.m239002a().mo212329a(SmEvents.EVENT_UA_ERROR).mo212331a(EventSource.EVENT_SENDER));
                    C60700b.m235841a(kVar.mo212056e(), "Rust", "StateEngine", "dispatch event = " + SmEvents.EVENT_UA_ERROR, "VcBizService", "[dispatch] event = " + SmEvents.EVENT_UA_ERROR);
                    C63780b.m250409a("failAccept", kVar.mo212056e());
                }
                C61303k kVar = kVar;
                if (kVar != null) {
                    kVar.mo212052b().mo212267b().mo212274a(EventSource.EVENT_SENDER.toString(), "updateVideoChat err");
                }
                StringBuilder sb = new StringBuilder();
                sb.append("onError: ");
                sb.append(eVar);
                sb.append(" , meeting = ");
                if (kVar == null) {
                    str = "null";
                } else {
                    str = "notNull";
                }
                sb.append(str);
                C60700b.m235864f("VcBizService", "[updateVideoChat2]", sb.toString());
            }

            public void onNoLobbySuccess(ax axVar) {
                VCLauncherStatistics.m250424b();
                C63693e.m249688d();
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onSuccess(null);
                }
                if (forNumber == VideoChat.UpdateVideoChatAction.ACCEPT) {
                    VideoChat videoChat = axVar.f152663a;
                    if (kVar != null) {
                        C60675a.m235774e().mo208234a();
                        C63739ai.m250012a(videoChat, kVar.mo212093K());
                        C61543c.m240214a(kVar, (int) SmEvents.EVENT_UA_SUCCESS);
                        C61344j a = C61344j.m239002a().mo212330a(videoChat).mo212329a(SmEvents.EVENT_UA_SUCCESS).mo212331a(EventSource.EVENT_SENDER);
                        C68296b<Boolean> a2 = TimeConsumeUtils.m248927a("VcBizService:updateVideoChat:onNoLobbySuccess:sendMessage");
                        kVar.mo212051a(a);
                        TimeConsumeUtils.m248928a(a2);
                        C60700b.m235841a(videoChat, "Rust", "StateEngine", "dispatch event = " + SmEvents.EVENT_UA_SUCCESS, "VcBizService", "[dispatch] event = " + SmEvents.EVENT_UA_SUCCESS);
                    }
                }
                C61303k kVar = kVar;
                if (kVar != null) {
                    kVar.mo212052b().mo212267b().mo212274a(EventSource.EVENT_SENDER.toString(), "updateVideoChat suc");
                }
            }
        };
        C63693e.m249686c();
        VcBizTask<ax> a = VcBizSender.m249138a(i, str, str2, z2, z, equipmentStatus2, equipmentStatus, forNumber, syncNtpTimeMillis);
        a.mo219889a(r0);
        return a.mo219895c();
    }

    public static void goIntoMeeting(VideoChat videoChat, VideoChat videoChat2, final C61303k kVar, String str, final VideoChat.Type type, final AbstractC63598b<Unit> bVar) {
        int i;
        C63784a.m250428a("[VideoChat_VcBizService_goIntoMeeting]");
        videoChat.setCreatingId(str);
        MeetingManager.m238341a().mo211896c().mo211937a(videoChat);
        if (kVar != null) {
            kVar.mo212052b().mo212267b().mo212274a(EventSource.EVENT_SENDER.toString(), "createVideoChat suc");
            if (type == VideoChat.Type.CALL) {
                C63758h.m250287a(videoChat, kVar.mo212093K());
                i = SmEvents.EVENT_RS;
            } else if (type == VideoChat.Type.MEET) {
                C63739ai.m250012a(videoChat, kVar.mo212093K());
                i = SmEvents.EVENT_NO;
            } else {
                i = -1;
            }
            if (i != -1) {
                if (!kVar.mo212062k() || i != 116) {
                    kVar.mo212051a(C61344j.m239002a().mo212330a(videoChat).mo212329a(i).mo212331a(EventSource.EVENT_SENDER).mo212333a(new AbstractC61346l() {
                        /* class com.ss.android.vc.net.service.VcBizService.C636237 */

                        @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61346l
                        public void eventHandledOnState(int i) {
                            if (type == VideoChat.Type.CALL) {
                                C60700b.m235851b("VcBizService", "[goIntoMeeting]", "[eventHandledOnState] state = " + i + ", init rtc sdk");
                                kVar.mo212165y().mo211989a();
                                AbstractC63598b bVar = bVar;
                                if (bVar != null) {
                                    bVar.onSuccess(null);
                                }
                            }
                        }
                    }));
                } else {
                    updateVideoChat(kVar, videoChat.getId(), VideoChat.UpdateVideoChatAction.CANCEL.getNumber(), null, null);
                }
                C60700b.m235841a(videoChat, "Rust", "StateEngine", "create vc success, roomId = " + videoChat.getId(), "VcBizService", "[dispatch] event=" + i + " , type=" + type);
            }
        }
        C63726b.m249913a("vc_monitor_caller_receive_meeting_id", videoChat);
        C63603f.m249425a(videoChat2);
        C63784a.m250429b("[VideoChat_VcBizService_goIntoMeeting]");
    }

    public static void searchVcDoc(String str, String str2, int i, int i2, boolean z, QuerySource querySource, final AbstractC63598b bVar) {
        VcBizSender.m249180a(str, str2, i, i2, z, querySource).mo219889a(new AbstractC63598b<az>() {
            /* class com.ss.android.vc.net.service.VcBizService.AnonymousClass22 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                bVar.onError(eVar);
            }

            public void onSuccess(az azVar) {
                bVar.onSuccess(azVar);
            }
        });
    }

    public static void changeOwnSetting(String str, ParticipantSettings participantSettings, ParticipantSettings.EquipmentStatus equipmentStatus, ParticipantSettings.EquipmentStatus equipmentStatus2, boolean z, boolean z2, String str2) {
        if (participantSettings != null) {
            participantSettings.setCameraStatus(equipmentStatus);
            participantSettings.setMicrophoneStatus(equipmentStatus2);
            ParticipantSettingRequest participantSettingRequest = new ParticipantSettingRequest();
            participantSettingRequest.setMeetingId(str);
            participantSettingRequest.setParticipantSettings(participantSettings);
            VcBizSender.m249153a(participantSettingRequest, str2).mo219893b(new VcBizSender.C63594a("changeParticipantSettingRequest"));
            com.ss.android.vc.statistics.event.aw.m250123a(str, z, z2);
        }
    }

    public static String createMeeting(VideoChat videoChat, String str, boolean z, String str2, boolean z2, final C61303k kVar, final AbstractC63598b bVar) {
        if (videoChat == null) {
            return "";
        }
        aj settingDependency = VideoChatModuleDependency.getSettingDependency();
        final String creatingId = videoChat.getCreatingId();
        final VideoChat.Type type = videoChat.getType();
        long syncNtpTimeMillis = settingDependency.getSyncNtpTimeMillis();
        C63784a.m250430c("[VideoChat_VcBizService_createMeeting]");
        VCLauncherStatistics.m250421a();
        C63693e.m249686c();
        C636226 r9 = new AbsJoinLobbyIntercept<JoinMeetingEntity>() {
            /* class com.ss.android.vc.net.service.VcBizService.C636226 */

            public void onLobbySuccess(JoinMeetingEntity joinMeetingEntity) {
                VCLauncherStatistics.m250424b();
                C63784a.m250431d("[VideoChat_VcBizService_createMeeting]");
                kVar.mo212111a(joinMeetingEntity.f152601b, joinMeetingEntity.f152603d);
                AbstractC63598b bVar = bVar;
                if (bVar != null && (bVar instanceof AbsJoinLobbyIntercept)) {
                    ((AbsJoinLobbyIntercept) bVar).onLobbySuccess(joinMeetingEntity);
                }
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                String str;
                VCLauncherStatistics.m250426d();
                C63693e.m249689e();
                StringBuilder sb = new StringBuilder();
                sb.append("err = ");
                sb.append(eVar);
                sb.append(" , meeting = ");
                if (kVar == null) {
                    str = "null";
                } else {
                    str = "notNull";
                }
                sb.append(str);
                C60700b.m235864f("VcBizService", "[createMeeting3]", sb.toString());
                if (kVar != null) {
                    kVar.mo212051a(C61344j.m239002a().mo212329a(SmEvents.EVENT_RE));
                    C60700b.m235845a("Rust", "StateEngine", "create vc error!!!", "VcBizService", "[dispatch] event=113");
                }
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onError(eVar);
                }
            }

            public void onNoLobbySuccess(JoinMeetingEntity joinMeetingEntity) {
                VCLauncherStatistics.m250424b();
                C63693e.m249688d();
                C63784a.m250431d("[VideoChat_VcBizService_createMeeting]");
                if (joinMeetingEntity.f152600a != JoinMeetingEntity.Type.SUCCESS || joinMeetingEntity.f152601b == null) {
                    VCLauncherStatistics.m250426d();
                    C63693e.m249689e();
                    if (kVar != null) {
                        kVar.mo212051a(C61344j.m239002a().mo212329a(SmEvents.EVENT_RE));
                        C60700b.m235845a("Rust", "StateEngine", "create vc error!!!", "VcBizService", "[dispatch] event=113");
                    }
                } else {
                    VcBizService.goIntoMeeting(joinMeetingEntity.f152601b, joinMeetingEntity.f152601b, kVar, creatingId, type, null);
                }
                AbstractC63598b bVar = bVar;
                if (bVar != null && (bVar instanceof AbsJoinLobbyIntercept)) {
                    ((AbsJoinLobbyIntercept) bVar).onNoLobbySuccess(joinMeetingEntity);
                }
            }
        };
        VcBizTask<JoinMeetingEntity> a = VcBizSender.m249196a(str2, z2, type, str, syncNtpTimeMillis, kVar.mo212092J().mo212504A(), kVar.mo212092J().mo212505B());
        a.mo219889a(r9);
        return a.mo219895c();
    }

    public static void sendManageRequest(String str, HostManageRequest.Action action, String str2, String str3, ParticipantType participantType, Boolean bool, Boolean bool2, Boolean bool3) {
        if (action != null) {
            HostManageRequest hostManageRequest = new HostManageRequest();
            hostManageRequest.setAction(action);
            hostManageRequest.setParticipantId(str2);
            hostManageRequest.setParticipantDeviceId(str3);
            hostManageRequest.setParticipantType(participantType);
            hostManageRequest.setMeetingId(str);
            if (bool != null) {
                hostManageRequest.setOnlyHostCanShare(bool.booleanValue());
            }
            if (bool2 != null) {
                hostManageRequest.setOnlyHostCanReplaceShare(bool2.booleanValue());
            }
            if (bool3 != null) {
                hostManageRequest.setOnlyPresenterCanAnnotate(bool3.booleanValue());
            }
            VcBizSender.m249150a(hostManageRequest).mo219893b(new VcBizSender.C63594a("hostManage"));
        }
    }

    public static void sendManageRequest(String str, HostManageRequest.Action action, String str2, String str3, ParticipantType participantType, boolean z, boolean z2, boolean z3, Boolean bool, String str4) {
        sendManageRequest(str, action, str2, str3, participantType, z, z2, z3, bool, null, str4);
    }

    public static void sendManageRequest(String str, HostManageRequest.Action action, String str2, String str3, ParticipantType participantType, boolean z, boolean z2, boolean z3, Boolean bool, String str4, String str5) {
        if (action != null) {
            HostManageRequest hostManageRequest = new HostManageRequest();
            hostManageRequest.setAction(action);
            hostManageRequest.setMuted(z);
            hostManageRequest.setLocked(z2);
            hostManageRequest.setTopic(str5);
            hostManageRequest.setMuteOnEntry(z3);
            hostManageRequest.setAllowPartiUnmute(bool);
            hostManageRequest.setParticipantId(str2);
            hostManageRequest.setParticipantDeviceId(str3);
            hostManageRequest.setParticipantType(participantType);
            hostManageRequest.setMeetingId(str);
            hostManageRequest.setGlobalSpokenLanguage(str4);
            VcBizSender.m249150a(hostManageRequest).mo219893b(new VcBizSender.C63594a("hostManage"));
        }
    }

    public static void sendManageRequest(String str, HostManageRequest.Action action, String str2, String str3, ParticipantType participantType, boolean z, boolean z2, boolean z3, Boolean bool, String str4, String str5, VcBizSender.C63594a aVar) {
        if (action != null) {
            HostManageRequest hostManageRequest = new HostManageRequest();
            hostManageRequest.setAction(action);
            hostManageRequest.setMuted(z);
            hostManageRequest.setLocked(z2);
            hostManageRequest.setTopic(str5);
            hostManageRequest.setMuteOnEntry(z3);
            hostManageRequest.setAllowPartiUnmute(bool);
            hostManageRequest.setParticipantId(str2);
            hostManageRequest.setParticipantDeviceId(str3);
            hostManageRequest.setParticipantType(participantType);
            hostManageRequest.setMeetingId(str);
            hostManageRequest.setGlobalSpokenLanguage(str4);
            VcBizSender.m249150a(hostManageRequest).mo219893b(aVar);
        }
    }
}
