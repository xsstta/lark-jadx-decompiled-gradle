package com.ss.android.vc.meeting.module.localshare;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.entity.MeetingConfig;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.Room;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.request.ShareScreenToRoomEntityRequest;
import com.ss.android.vc.entity.response.C60965at;
import com.ss.android.vc.entity.response.GetShareCodeInfoEntity;
import com.ss.android.vc.entity.response.PullVideoChatByShareCodeEntity;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.service.C63634c;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0004 !\"#B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u001e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0016J\u0018\u0010\u0017\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bJ4\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fJ:\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006$"}, d2 = {"Lcom/ss/android/vc/meeting/module/localshare/LocalShareManager;", "", "()V", "shareType", "Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$ShareType;", "getShareType", "()Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$ShareType;", "setShareType", "(Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$ShareType;)V", "checkAndShareScreenToRoomByMeetingNumber", "", "meetingNumber", "", "docUrl", "callback", "Lcom/ss/android/vc/meeting/module/localshare/LocalShareManager$ICheckAndShareToRoomByMeetingNumber;", "checkLocalMeetingByShareCode", "shareCode", "Lcom/ss/android/vc/meeting/module/localshare/LocalShareManager$ICheckLocalMeetingCallbak;", "getMeetingConfig", "Lcom/ss/android/vc/entity/MeetingConfig;", "getRoomNameByShareCode", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "getShareCodeInfo", "Lcom/ss/android/vc/meeting/module/localshare/LocalShareManager$IGetShareCodeInfoCallback;", "goToShareMeetingByVideoChat", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "shareScreenToRoomByMeetingNumber", "meetingId", "shareScreenToRoomByShareCode", "Lcom/ss/android/vc/entity/response/ShareScreenToRoomEntity;", "Companion", "ICheckAndShareToRoomByMeetingNumber", "ICheckLocalMeetingCallbak", "IGetShareCodeInfoCallback", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.localshare.g */
public final class LocalShareManager {

    /* renamed from: a */
    public static final Lazy f156169a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C62172b.INSTANCE);

    /* renamed from: b */
    public static final Companion f156170b = new Companion(null);

    /* renamed from: c */
    private ShareScreenToRoomEntityRequest.ShareType f156171c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/vc/meeting/module/localshare/LocalShareManager$ICheckAndShareToRoomByMeetingNumber;", "", "alReadyInOtherMeeting", "", "alReadyInRoomNormalMeeting", "alReadyInRoomShareMeeting", "invalidShareCode", "magicShareNotSupport", "noRoomInMeeting", "noSharePermission", "notSupportShareToRoom", "onJoinMeetingSuccess", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "otherError", "roomInWiredShare", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.g$c */
    public interface ICheckAndShareToRoomByMeetingNumber {
        /* renamed from: a */
        void mo215055a();

        /* renamed from: a */
        void mo215056a(VideoChat videoChat);

        /* renamed from: b */
        void mo215057b();

        /* renamed from: c */
        void mo215058c();

        /* renamed from: d */
        void mo215059d();

        /* renamed from: e */
        void mo215060e();

        /* renamed from: f */
        void mo215061f();

        /* renamed from: g */
        void mo215062g();

        /* renamed from: h */
        void mo215063h();

        /* renamed from: i */
        void mo215064i();

        /* renamed from: j */
        void mo215065j();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/vc/meeting/module/localshare/LocalShareManager$ICheckLocalMeetingCallbak;", "", "hasNoMeeting", "", "inDiffNormalMeeting", "inSameNormalMeeting", "isSharingToRoom", "localInNormalMeetingAndRoomInWiredMeeting", "onError", "err", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onlyLocalInNormalMeeting", "meetingId", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.g$d */
    public interface ICheckLocalMeetingCallbak {
        /* renamed from: a */
        void mo215045a();

        /* renamed from: a */
        void mo215046a(C63602e eVar);

        /* renamed from: a */
        void mo215047a(String str);

        /* renamed from: b */
        void mo215048b();

        /* renamed from: c */
        void mo215049c();

        /* renamed from: d */
        void mo215050d();

        /* renamed from: e */
        void mo215051e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/vc/meeting/module/localshare/LocalShareManager$IGetShareCodeInfoCallback;", "", "isRoom", "", "isShareBox", "onError", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.g$e */
    public interface IGetShareCodeInfoCallback {
        /* renamed from: a */
        void mo215042a();

        /* renamed from: a */
        void mo215043a(C63602e eVar);

        /* renamed from: b */
        void mo215044b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/meeting/module/localshare/LocalShareManager$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/vc/meeting/module/localshare/LocalShareManager;", "instance$annotations", "getInstance", "()Lcom/ss/android/vc/meeting/module/localshare/LocalShareManager;", "instance$delegate", "Lkotlin/Lazy;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.g$a */
    public static final class Companion {
        /* renamed from: a */
        public final LocalShareManager mo215084a() {
            Lazy lazy = LocalShareManager.f156169a;
            Companion aVar = LocalShareManager.f156170b;
            return (LocalShareManager) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/meeting/module/localshare/LocalShareManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.g$b */
    static final class C62172b extends Lambda implements Function0<LocalShareManager> {
        public static final C62172b INSTANCE = new C62172b();

        C62172b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LocalShareManager invoke() {
            return new LocalShareManager();
        }
    }

    /* renamed from: a */
    private final MeetingConfig m242776a() {
        MeetingConfig meetingConfig = new MeetingConfig();
        meetingConfig.isAudioOn = false;
        meetingConfig.isCameraOn = false;
        meetingConfig.isSpeakerOn = false;
        meetingConfig.isFrontCamera = false;
        if (C63634c.m249496b("vc.share.mobile.rooms.mute.audio.device")) {
            meetingConfig.isPlaybackDigitalMute = true;
        }
        return meetingConfig;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/localshare/LocalShareManager$getRoomNameByShareCode$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "", "onError", "", "err", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", "roomId", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.g$g */
    public static final class C62174g implements AbstractC63598b<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC63598b f156174a;

        C62174g(AbstractC63598b bVar) {
            this.f156174a = bVar;
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "err");
            this.f156174a.onError(eVar);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/vc/meeting/module/localshare/LocalShareManager$getRoomNameByShareCode$1$onSuccess$1", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "", "", "Lcom/ss/android/vc/entity/Room;", "onErrored", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccessed", "roomMap", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.localshare.g$g$a */
        public static final class C62175a extends UIGetDataCallback<Map<String, ? extends Room>> {

            /* renamed from: a */
            final /* synthetic */ C62174g f156175a;

            /* renamed from: b */
            final /* synthetic */ String f156176b;

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "error");
                this.f156175a.f156174a.onError(new C63602e(errorResult));
            }

            /* renamed from: a */
            public void onSuccessed(Map<String, ? extends Room> map) {
                String str;
                if (C60752f.m236080a(map)) {
                    this.f156175a.f156174a.onError(new C63602e(new ErrorResult("roomMap id is null")));
                    return;
                }
                AbstractC63598b bVar = this.f156175a.f156174a;
                Room room = (Room) map.get(this.f156176b);
                if (room != null) {
                    str = room.primaryNameParticipant;
                } else {
                    str = null;
                }
                bVar.onSuccess(str);
            }

            C62175a(C62174g gVar, String str) {
                this.f156175a = gVar;
                this.f156176b = str;
            }
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f156174a.onError(new C63602e(new ErrorResult("room id is null")));
            } else {
                VcBizService.getRoomById(CollectionsKt.listOf(str), new C62175a(this, str));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/localshare/LocalShareManager$getShareCodeInfo$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/GetShareCodeInfoEntity;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.g$h */
    public static final class C62176h implements AbstractC63598b<GetShareCodeInfoEntity> {

        /* renamed from: a */
        final /* synthetic */ IGetShareCodeInfoCallback f156177a;

        C62176h(IGetShareCodeInfoCallback eVar) {
            this.f156177a = eVar;
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            this.f156177a.mo215043a(eVar);
        }

        /* renamed from: a */
        public void onSuccess(GetShareCodeInfoEntity uVar) {
            if (uVar != null) {
                ParticipantType participantType = uVar.mo210134a().getParticipantType();
                if (participantType != null) {
                    int i = C62178h.f156183a[participantType.ordinal()];
                    if (i == 1) {
                        this.f156177a.mo215042a();
                        return;
                    } else if (i == 2) {
                        this.f156177a.mo215044b();
                        return;
                    }
                }
                this.f156177a.mo215043a(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/vc/meeting/module/localshare/LocalShareManager$shareScreenToRoomByMeetingNumber$1$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/ShareScreenToRoomEntity;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.g$i */
    public static final class C62177i implements AbstractC63598b<C60965at> {

        /* renamed from: a */
        final /* synthetic */ String f156178a;

        /* renamed from: b */
        final /* synthetic */ String f156179b;

        /* renamed from: c */
        final /* synthetic */ ShareScreenToRoomEntityRequest.ShareType f156180c;

        /* renamed from: d */
        final /* synthetic */ String f156181d;

        /* renamed from: e */
        final /* synthetic */ ICheckAndShareToRoomByMeetingNumber f156182e;

        /* renamed from: a */
        public void onSuccess(C60965at atVar) {
            VideoChat videoChat;
            if (atVar != null && (videoChat = atVar.f152659a) != null) {
                this.f156182e.mo215056a(videoChat);
            }
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            Integer num;
            if (eVar != null) {
                num = Integer.valueOf(eVar.mo219899a());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 231107) {
                this.f156182e.mo215057b();
            } else if (num != null && num.intValue() == 231108) {
                this.f156182e.mo215058c();
            } else if (num != null && num.intValue() == 231109) {
                this.f156182e.mo215059d();
            } else if (num != null && num.intValue() == 232401) {
                this.f156182e.mo215060e();
            } else if (num != null && num.intValue() == 236001) {
                this.f156182e.mo215061f();
            } else if (num != null && num.intValue() == 232402) {
                this.f156182e.mo215062g();
            } else if (num != null && num.intValue() == 231106) {
                this.f156182e.mo215063h();
            } else if (num != null && num.intValue() == 231110) {
                this.f156182e.mo215064i();
            } else {
                this.f156182e.mo215065j();
            }
        }

        C62177i(String str, String str2, ShareScreenToRoomEntityRequest.ShareType shareType, String str3, ICheckAndShareToRoomByMeetingNumber cVar) {
            this.f156178a = str;
            this.f156179b = str2;
            this.f156180c = shareType;
            this.f156181d = str3;
            this.f156182e = cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/localshare/LocalShareManager$checkLocalMeetingByShareCode$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/PullVideoChatByShareCodeEntity;", "onError", "", "err", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.g$f */
    public static final class C62173f implements AbstractC63598b<PullVideoChatByShareCodeEntity> {

        /* renamed from: a */
        final /* synthetic */ C61303k f156172a;

        /* renamed from: b */
        final /* synthetic */ ICheckLocalMeetingCallbak f156173b;

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "err");
            C60700b.m235864f("LocalShareManager@", "[checkLocalMeeting]", "error code = " + eVar.mo219899a());
            this.f156173b.mo215046a(eVar);
        }

        /* renamed from: a */
        public void onSuccess(PullVideoChatByShareCodeEntity ajVar) {
            VideoChat videoChat;
            String str;
            VideoChat a;
            VideoChatSettings videoChatSettings;
            VideoChatSettings.SubType subType = null;
            if (ajVar != null) {
                videoChat = ajVar.mo210112a();
            } else {
                videoChat = null;
            }
            if (videoChat != null) {
                VideoChat a2 = ajVar.mo210112a();
                if (a2 != null) {
                    str = a2.getId();
                } else {
                    str = null;
                }
                VideoChat e = this.f156172a.mo212056e();
                Intrinsics.checkExpressionValueIsNotNull(e, "meeting.videoChat");
                if (TextUtils.equals(str, e.getId())) {
                    this.f156173b.mo215048b();
                    return;
                }
                if (!(ajVar == null || (a = ajVar.mo210112a()) == null || (videoChatSettings = a.getVideoChatSettings()) == null)) {
                    subType = videoChatSettings.getSubType();
                }
                if (subType == VideoChatSettings.SubType.WIRED_SCREEN_SHARE) {
                    this.f156173b.mo215050d();
                } else {
                    this.f156173b.mo215049c();
                }
            } else {
                this.f156173b.mo215047a(this.f156172a.mo212055d());
            }
        }

        C62173f(C61303k kVar, ICheckLocalMeetingCallbak dVar) {
            this.f156172a = kVar;
            this.f156173b = dVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x008d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo215077a(com.ss.android.vc.entity.VideoChat r8) {
        /*
        // Method dump skipped, instructions count: 167
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.localshare.LocalShareManager.mo215077a(com.ss.android.vc.entity.VideoChat):void");
    }

    /* renamed from: a */
    public final void mo215080a(String str, IGetShareCodeInfoCallback eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "callback");
        VcBizSender.m249257c(str, new C62176h(eVar));
    }

    /* renamed from: a */
    public final void mo215081a(String str, AbstractC63598b<String> bVar) {
        Intrinsics.checkParameterIsNotNull(str, "shareCode");
        Intrinsics.checkParameterIsNotNull(bVar, "callback");
        VcBizSender.m249219a(str, new C62174g(bVar));
    }

    /* renamed from: a */
    public final void mo215079a(String str, ICheckLocalMeetingCallbak dVar) {
        VideoChat e;
        VideoChatSettings videoChatSettings;
        VideoChatSettings videoChatSettings2;
        Intrinsics.checkParameterIsNotNull(dVar, "callback");
        MeetingManager a = MeetingManager.m238341a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MeetingManager.getInstance()");
        AbstractC61294b j = a.mo211906j();
        VideoChatSettings.SubType subType = null;
        if (!(j instanceof C61303k)) {
            j = null;
        }
        C61303k kVar = (C61303k) j;
        if (kVar == null) {
            dVar.mo215045a();
            return;
        }
        VideoChat e2 = kVar.mo212056e();
        if (!(e2 == null || (videoChatSettings2 = e2.getVideoChatSettings()) == null)) {
            subType = videoChatSettings2.getSubType();
        }
        if (subType != VideoChatSettings.SubType.SCREEN_SHARE || (e = kVar.mo212056e()) == null || (videoChatSettings = e.getVideoChatSettings()) == null || videoChatSettings.isBoxSharing()) {
            VcBizSender.m249247b(str, new C62173f(kVar, dVar));
        } else {
            dVar.mo215051e();
        }
    }

    /* renamed from: a */
    public final void mo215078a(String str, ShareScreenToRoomEntityRequest.ShareType shareType, String str2, ICheckAndShareToRoomByMeetingNumber cVar) {
        VideoChat e;
        VideoChatSettings videoChatSettings;
        VideoChatSettings videoChatSettings2;
        Intrinsics.checkParameterIsNotNull(str, "meetingNumber");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        MeetingManager a = MeetingManager.m238341a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MeetingManager.getInstance()");
        AbstractC61294b j = a.mo211906j();
        VideoChatSettings.SubType subType = null;
        if (!(j instanceof C61303k)) {
            j = null;
        }
        C61303k kVar = (C61303k) j;
        if (kVar == null) {
            mo215082a(str, (String) null, shareType, str2, cVar);
            return;
        }
        VideoChat e2 = kVar.mo212056e();
        if (!(e2 == null || (videoChatSettings2 = e2.getVideoChatSettings()) == null)) {
            subType = videoChatSettings2.getSubType();
        }
        if (subType != VideoChatSettings.SubType.SCREEN_SHARE || (e = kVar.mo212056e()) == null || (videoChatSettings = e.getVideoChatSettings()) == null || videoChatSettings.isBoxSharing()) {
            mo215082a(str, kVar.mo212055d(), shareType, str2, cVar);
        } else {
            cVar.mo215055a();
        }
    }

    /* renamed from: a */
    public final void mo215082a(String str, String str2, ShareScreenToRoomEntityRequest.ShareType shareType, String str3, ICheckAndShareToRoomByMeetingNumber cVar) {
        Intrinsics.checkParameterIsNotNull(str, "meetingNumber");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        this.f156171c = shareType;
        if (shareType != null) {
            VcBizService.shareScreenToRoom(ShareScreenToRoomEntityRequest.JoinPath.JOIN_BY_MEETING_NUMBER, str, str2, shareType, str3, new C62177i(str, str2, shareType, str3, cVar));
        }
    }

    /* renamed from: a */
    public final void mo215083a(String str, String str2, ShareScreenToRoomEntityRequest.ShareType shareType, String str3, AbstractC63598b<C60965at> bVar) {
        Intrinsics.checkParameterIsNotNull(str, "shareCode");
        Intrinsics.checkParameterIsNotNull(bVar, "callback");
        this.f156171c = shareType;
        if (shareType != null) {
            VcBizService.shareScreenToRoom(ShareScreenToRoomEntityRequest.JoinPath.JOIN_BY_SHARE_CODE, str, str2, shareType, str3, bVar);
        }
    }
}
