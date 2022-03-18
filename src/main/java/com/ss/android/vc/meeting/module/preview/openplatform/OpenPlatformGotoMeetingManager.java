package com.ss.android.vc.meeting.module.preview.openplatform;

import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.response.JoinMeetingEntity;
import com.ss.android.vc.meeting.module.lobby.AbsJoinLobbyIntercept;
import com.ss.android.vc.meeting.module.preview.AbstractC62650a;
import com.ss.android.vc.meeting.module.preview.openplatform.IVCPreviewOpenPlatformContract;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vc.trace.VCLauncherStatistics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0013\u001a\u00020\u0014J\u001f\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/ss/android/vc/meeting/module/preview/openplatform/OpenPlatformGotoMeetingManager;", "", "view", "Lcom/ss/android/vc/meeting/module/preview/openplatform/IVCPreviewOpenPlatformContract$IView;", "model", "Lcom/ss/android/vc/meeting/module/preview/openplatform/IVCPreviewOpenPlatformContract$IModel;", "(Lcom/ss/android/vc/meeting/module/preview/openplatform/IVCPreviewOpenPlatformContract$IView;Lcom/ss/android/vc/meeting/module/preview/openplatform/IVCPreviewOpenPlatformContract$IModel;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getModel", "()Lcom/ss/android/vc/meeting/module/preview/openplatform/IVCPreviewOpenPlatformContract$IModel;", "setModel", "(Lcom/ss/android/vc/meeting/module/preview/openplatform/IVCPreviewOpenPlatformContract$IModel;)V", "getView", "()Lcom/ss/android/vc/meeting/module/preview/openplatform/IVCPreviewOpenPlatformContract$IView;", "setView", "(Lcom/ss/android/vc/meeting/module/preview/openplatform/IVCPreviewOpenPlatformContract$IView;)V", "buildModelDelegate", "", "gotoMeeting", "audioMute", "", "cameraMute", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.preview.c.f */
public final class OpenPlatformGotoMeetingManager {

    /* renamed from: a */
    private final String f157766a;

    /* renamed from: b */
    private IVCPreviewOpenPlatformContract.IView f157767b;

    /* renamed from: c */
    private IVCPreviewOpenPlatformContract.IModel f157768c;

    public OpenPlatformGotoMeetingManager() {
        this(null, null, 3, null);
    }

    /* renamed from: a */
    public final String mo216631a() {
        return this.f157766a;
    }

    /* renamed from: c */
    public final IVCPreviewOpenPlatformContract.IView mo216634c() {
        return this.f157767b;
    }

    /* renamed from: d */
    public final IVCPreviewOpenPlatformContract.IModel mo216635d() {
        return this.f157768c;
    }

    /* renamed from: b */
    public final void mo216633b() {
        IVCPreviewOpenPlatformContract.IModel aVar = this.f157768c;
        if (aVar != null) {
            aVar.mo216608g();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/vc/meeting/module/preview/openplatform/OpenPlatformGotoMeetingManager$gotoMeeting$1", "Lcom/ss/android/vc/meeting/module/lobby/AbsJoinLobbyIntercept;", "Lcom/ss/android/vc/entity/response/JoinMeetingEntity;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onLobbySuccess", "joinMeetingResponse", "onNoLobbySuccess", "response", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.preview.c.f$a */
    public static final class C62694a extends AbsJoinLobbyIntercept<JoinMeetingEntity> {

        /* renamed from: a */
        final /* synthetic */ OpenPlatformGotoMeetingManager f157769a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onPageDismiss"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.preview.c.f$a$a */
        public static final class C62695a implements AbstractC62650a.AbstractC62655c {

            /* renamed from: a */
            public static final C62695a f157770a = new C62695a();

            C62695a() {
            }

            @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62655c
            public final void onPageDismiss() {
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onPageDismiss"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.preview.c.f$a$b */
        public static final class C62696b implements AbstractC62650a.AbstractC62655c {

            /* renamed from: a */
            final /* synthetic */ C62694a f157771a;

            /* renamed from: b */
            final /* synthetic */ VideoChat f157772b;

            C62696b(C62694a aVar, VideoChat videoChat) {
                this.f157771a = aVar;
                this.f157772b = videoChat;
            }

            @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62655c
            public final void onPageDismiss() {
                IVCPreviewOpenPlatformContract.IModel d = this.f157771a.f157769a.mo216635d();
                if (d != null) {
                    d.mo216506a(this.f157772b);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62694a(OpenPlatformGotoMeetingManager fVar) {
            this.f157769a = fVar;
        }

        /* renamed from: a */
        public void onLobbySuccess(JoinMeetingEntity joinMeetingEntity) {
            Intrinsics.checkParameterIsNotNull(joinMeetingEntity, "joinMeetingResponse");
            C60700b.m235851b(this.f157769a.mo216631a(), "[gotoMeeting2]", "onLobbySuccess");
            C63693e.m249689e();
            IVCPreviewOpenPlatformContract.IModel d = this.f157769a.mo216635d();
            if (d != null) {
                d.mo216507a(joinMeetingEntity.f152601b, joinMeetingEntity.f152603d);
            }
            IVCPreviewOpenPlatformContract.IView c = this.f157769a.mo216634c();
            if (c != null) {
                c.mo216528a(C62695a.f157770a);
            }
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "error");
            String a = this.f157769a.mo216631a();
            C60700b.m235864f(a, "[sendJoinMeetingRequest]", "error: " + eVar);
            VCLauncherStatistics.m250426d();
            C63693e.m249689e();
            IVCPreviewOpenPlatformContract.IView c = this.f157769a.mo216634c();
            if (c != null) {
                c.mo216537j();
            }
            if (!eVar.f160600c) {
                if (C60785x.m236238b()) {
                    C60738ac.m236023a((int) R.string.View_M_FailedToJoinMeeting);
                } else {
                    C60738ac.m236023a((int) R.string.View_G_NoConnection);
                }
            }
            IVCPreviewOpenPlatformContract.IView c2 = this.f157769a.mo216634c();
            if (c2 != null) {
                c2.mo216528a((AbstractC62650a.AbstractC62655c) null);
            }
        }

        /* renamed from: b */
        public void onNoLobbySuccess(JoinMeetingEntity joinMeetingEntity) {
            boolean z;
            IVCPreviewOpenPlatformContract.IView c;
            Intrinsics.checkParameterIsNotNull(joinMeetingEntity, "response");
            C60700b.m235851b(this.f157769a.mo216631a(), "[gotoMeeting3]", "onNoLobbySuccess");
            if (joinMeetingEntity.f152601b != null) {
                VCLauncherStatistics.m250424b();
                C63693e.m249688d();
                VideoChat videoChat = joinMeetingEntity.f152601b;
                C60700b.m235841a(videoChat, "Entry", "StateEngine", "joinOpenPlatformMeeting", "MeetingPreviewOpenPlatformPresenter@", "[sendJoinMeetingRequest] sendVideoChatToStateMachine");
                if (this.f157769a.mo216635d() != null) {
                    IVCPreviewOpenPlatformContract.IModel d = this.f157769a.mo216635d();
                    if (d == null) {
                        Intrinsics.throwNpe();
                    }
                    if (d.mo216607f() != null) {
                        Map<String, String> map = MeetingPreviewOpenPlatformFragment.f157745f;
                        IVCPreviewOpenPlatformContract.IModel d2 = this.f157769a.mo216635d();
                        if (d2 == null) {
                            Intrinsics.throwNpe();
                        }
                        String f = d2.mo216607f();
                        if (f == null) {
                            Intrinsics.throwNpe();
                        }
                        Intrinsics.checkExpressionValueIsNotNull(videoChat, "videoChat");
                        String id = videoChat.getId();
                        Intrinsics.checkExpressionValueIsNotNull(id, "videoChat.id");
                        map.put(f, id);
                    }
                }
                if (this.f157769a.mo216634c() != null) {
                    IVCPreviewOpenPlatformContract.IView c2 = this.f157769a.mo216634c();
                    if (c2 != null) {
                        c2.mo216528a(new C62696b(this, videoChat));
                    }
                } else {
                    IVCPreviewOpenPlatformContract.IModel d3 = this.f157769a.mo216635d();
                    if (d3 != null) {
                        d3.mo216506a(videoChat);
                    }
                }
                z = true;
            } else {
                VCLauncherStatistics.m250426d();
                C63693e.m249689e();
                C60738ac.m236023a((int) R.string.View_M_FailedToJoinMeeting);
                IVCPreviewOpenPlatformContract.IView c3 = this.f157769a.mo216634c();
                if (c3 != null) {
                    c3.mo216528a((AbstractC62650a.AbstractC62655c) null);
                }
                z = false;
            }
            if (!z && (c = this.f157769a.mo216634c()) != null) {
                c.mo216537j();
            }
        }
    }

    public OpenPlatformGotoMeetingManager(IVCPreviewOpenPlatformContract.IView bVar, IVCPreviewOpenPlatformContract.IModel aVar) {
        this.f157767b = bVar;
        this.f157768c = aVar;
        this.f157766a = "OpenPlatformGotoMeetingManager@";
    }

    /* renamed from: a */
    public final void mo216632a(Boolean bool, Boolean bool2) {
        C60700b.m235851b(this.f157766a, "[gotoMeeting]", "go");
        IVCPreviewOpenPlatformContract.IView bVar = this.f157767b;
        if (bVar != null) {
            bVar.mo216538k();
        }
        VCLauncherStatistics.m250423a(VCLauncherStatistics.SCENE.NORMAL_JOIN);
        IVCPreviewOpenPlatformContract.IModel aVar = this.f157768c;
        if (aVar != null) {
            aVar.mo216605a(bool, bool2, new C62694a(this));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OpenPlatformGotoMeetingManager(IVCPreviewOpenPlatformContract.IView bVar, IVCPreviewOpenPlatformContract.IModel aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bVar, (i & 2) != 0 ? null : aVar);
    }
}
