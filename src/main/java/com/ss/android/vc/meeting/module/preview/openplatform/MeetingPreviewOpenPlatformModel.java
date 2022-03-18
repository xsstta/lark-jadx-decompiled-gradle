package com.ss.android.vc.meeting.module.preview.openplatform;

import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.MeetingConfig;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.response.IDTypeEntity;
import com.ss.android.vc.entity.response.JoinMeetingEntity;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.preview.AbstractC62650a;
import com.ss.android.vc.meeting.module.preview.AbstractC62710d;
import com.ss.android.vc.meeting.module.preview.openplatform.IVCPreviewOpenPlatformContract;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vc.trace.VCLauncherStatistics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0016J/\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0016¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u0005H\u0016J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u0005H\u0016R\u0014\u0010\u000b\u001a\u00020\tXD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011¨\u0006("}, d2 = {"Lcom/ss/android/vc/meeting/module/preview/openplatform/MeetingPreviewOpenPlatformModel;", "Lcom/ss/android/vc/meeting/module/preview/MeetingPreviewBaseModel;", "Lcom/ss/android/vc/meeting/module/preview/openplatform/IVCPreviewOpenPlatformContract$IModel$Delegate;", "Lcom/ss/android/vc/meeting/module/preview/openplatform/IVCPreviewOpenPlatformContract$IModel;", "micMute", "", "cameraMute", "speakerOpen", "reserveId", "", "(ZZZLjava/lang/String;)V", "TAG", "getTAG", "()Ljava/lang/String;", "getCameraMute", "()Z", "setCameraMute", "(Z)V", "getMicMute", "setMicMute", "getReserveId", "setReserveId", "(Ljava/lang/String;)V", "getSpeakerOpen", "setSpeakerOpen", "buildModelDelegate", "", "getMeetingConfig", "Lcom/ss/android/vc/entity/MeetingConfig;", "getReserveID", "sendRequestWrapper", "audioMute", "callback", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/JoinMeetingEntity;", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/ss/android/vc/net/request/IVcGetDataCallback;)V", "setDefaultToEarpieceWhenNoExtDevice", "defaultToEarpiece", "startLoadData", "fromUrl", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.preview.c.c */
public final class MeetingPreviewOpenPlatformModel extends AbstractC62710d<IVCPreviewOpenPlatformContract.IModel.Delegate> implements IVCPreviewOpenPlatformContract.IModel {

    /* renamed from: d */
    private final String f157753d;

    /* renamed from: e */
    private boolean f157754e;

    /* renamed from: f */
    private boolean f157755f;

    /* renamed from: g */
    private boolean f157756g;

    /* renamed from: h */
    private String f157757h;

    public MeetingPreviewOpenPlatformModel() {
        this(false, false, false, null, 15, null);
    }

    @Override // com.ss.android.vc.meeting.module.preview.openplatform.IVCPreviewOpenPlatformContract.IModel
    /* renamed from: f */
    public String mo216607f() {
        return this.f157757h;
    }

    /* renamed from: h */
    public final boolean mo216621h() {
        return this.f157754e;
    }

    /* renamed from: i */
    public final boolean mo216622i() {
        return this.f157755f;
    }

    /* renamed from: j */
    public final boolean mo216623j() {
        return this.f157756g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J>\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u0019\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\u0012\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u000bH\u0016J\b\u0010 \u001a\u00020\u000bH\u0016¨\u0006!"}, d2 = {"com/ss/android/vc/meeting/module/preview/openplatform/MeetingPreviewOpenPlatformModel$buildModelDelegate$1", "Lcom/ss/android/vc/meeting/module/preview/openplatform/IVCPreviewOpenPlatformContract$IModel$Delegate;", "getEnvId", "", "getMeetingConfigForStatistics", "isAudioBtnOn", "", "isCameraBtnOn", "isFrontCamera", "isPlaybackDigitalMute", "onAudioMuted", "", "onAudioStateChanged", "lastType", "Lcom/ss/android/vc/meeting/module/audio/MeetingAudioManager$AudioType;", "lastOutSpeaker", "currentType", "currentOutSpeaker", "needTrack", "bluetoothName", "onGetAvatarDataSuccess", "chatter", "Lcom/ss/android/lark/chat/export/entity/chatter/OpenChatter;", "onLoadMeetingInfoSuccess", "title", "onLoadMeetingTitleSuccess", "meetingTitle", "onMeetingInfoLoadFailed", "onMeetingInfoUpdate", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "recoveryState", "startLoading", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.preview.c.c$a */
    public static final class C62687a implements IVCPreviewOpenPlatformContract.IModel.Delegate {

        /* renamed from: a */
        final /* synthetic */ MeetingPreviewOpenPlatformModel f157758a;

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: a */
        public void mo216513a(OpenChatter openChatter) {
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: a */
        public void mo216514a(VideoChat videoChat) {
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: a */
        public void mo216515a(MeetingAudioManager.AudioType audioType, boolean z, MeetingAudioManager.AudioType audioType2, boolean z2, boolean z3, String str) {
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: a */
        public void mo216516a(String str) {
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: c */
        public boolean mo216519c() {
            return true;
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: d */
        public boolean mo216520d() {
            return false;
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: e */
        public void mo216521e() {
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: f */
        public void mo216522f() {
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: h */
        public String mo216524h() {
            return "";
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: b */
        public boolean mo216518b() {
            return !this.f157758a.mo216622i();
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: a */
        public boolean mo216517a() {
            return !this.f157758a.mo216621h();
        }

        @Override // com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62651a.AbstractC62652a
        /* renamed from: g */
        public String mo216523g() {
            if (!this.f157758a.mo216622i() && !this.f157758a.mo216621h()) {
                return "all_open";
            }
            if (!this.f157758a.mo216622i() && this.f157758a.mo216621h()) {
                return "only_video";
            }
            if (this.f157758a.mo216622i() && !this.f157758a.mo216621h()) {
                return "only_voice";
            }
            if (!this.f157758a.mo216622i() || !this.f157758a.mo216621h()) {
                return "";
            }
            return "all_close";
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62687a(MeetingPreviewOpenPlatformModel cVar) {
            this.f157758a = cVar;
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.openplatform.IVCPreviewOpenPlatformContract.IModel
    /* renamed from: g */
    public void mo216608g() {
        mo216508a(new C62687a(this));
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62710d
    public MeetingConfig bT_() {
        MeetingConfig meetingConfig = new MeetingConfig();
        AbstractC62650a.AbstractC62651a.AbstractC62652a aVar = this.f157788a;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "mModelDelegate");
        meetingConfig.isAudioOn = ((IVCPreviewOpenPlatformContract.IModel.Delegate) aVar).mo216517a();
        AbstractC62650a.AbstractC62651a.AbstractC62652a aVar2 = this.f157788a;
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "mModelDelegate");
        meetingConfig.isCameraOn = ((IVCPreviewOpenPlatformContract.IModel.Delegate) aVar2).mo216518b();
        AbstractC62650a.AbstractC62651a.AbstractC62652a aVar3 = this.f157788a;
        Intrinsics.checkExpressionValueIsNotNull(aVar3, "mModelDelegate");
        meetingConfig.isFrontCamera = ((IVCPreviewOpenPlatformContract.IModel.Delegate) aVar3).mo216519c();
        AbstractC62650a.AbstractC62651a.AbstractC62652a aVar4 = this.f157788a;
        Intrinsics.checkExpressionValueIsNotNull(aVar4, "mModelDelegate");
        meetingConfig.isPlaybackDigitalMute = ((IVCPreviewOpenPlatformContract.IModel.Delegate) aVar4).mo216520d();
        if (mo216510b() != null) {
            MeetingAudioManager b = mo216510b();
            Intrinsics.checkExpressionValueIsNotNull(b, "meetingAudioManager");
            meetingConfig.isSpeakerOn = b.mo212721z();
        } else {
            meetingConfig.isSpeakerOn = this.f157756g;
        }
        return meetingConfig;
    }

    /* renamed from: a */
    public final void mo216615a(String str) {
        this.f157757h = str;
    }

    /* renamed from: d */
    public final void mo216618d(boolean z) {
        this.f157754e = z;
    }

    /* renamed from: e */
    public final void mo216619e(boolean z) {
        this.f157755f = z;
    }

    @Override // com.ss.android.vc.meeting.module.preview.openplatform.IVCPreviewOpenPlatformContract.IModel
    /* renamed from: c */
    public void mo216606c(boolean z) {
        mo216660a(this.f157757h, IDTypeEntity.RESERVATION_ID, z);
    }

    /* renamed from: f */
    public final void mo216620f(boolean z) {
        this.f157756g = z;
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62710d
    /* renamed from: b */
    public void mo216616b(boolean z) {
        C60700b.m235851b(this.f157753d, "[setDefaultToEarpieceWhenNoExtDevice]", String.valueOf(z));
        this.f157789b.mo212694b(!this.f157756g);
    }

    @Override // com.ss.android.vc.meeting.module.preview.openplatform.IVCPreviewOpenPlatformContract.IModel
    /* renamed from: a */
    public void mo216605a(Boolean bool, Boolean bool2, AbstractC63598b<JoinMeetingEntity> bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "callback");
        String str = this.f157753d;
        C60700b.m235851b(str, "[sendRequestWrapper]", "audioMute = " + bool + ", cameraMute = " + bool2);
        VCLauncherStatistics.m250421a();
        C63693e.m249686c();
        if (bool == null) {
            AbstractC62650a.AbstractC62651a.AbstractC62652a aVar = this.f157788a;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "mModelDelegate");
            bool = Boolean.valueOf(!((IVCPreviewOpenPlatformContract.IModel.Delegate) aVar).mo216517a());
        }
        if (bool2 == null) {
            AbstractC62650a.AbstractC62651a.AbstractC62652a aVar2 = this.f157788a;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "mModelDelegate");
            bool2 = Boolean.valueOf(!((IVCPreviewOpenPlatformContract.IModel.Delegate) aVar2).mo216518b());
        }
        VcBizSender.m249208a(bool.booleanValue(), bool2.booleanValue(), this.f157757h, C60788y.m236247a(ar.m236694a()), C60788y.m236250b(ar.m236694a())).mo219889a(bVar);
    }

    public MeetingPreviewOpenPlatformModel(boolean z, boolean z2, boolean z3, String str) {
        this.f157754e = z;
        this.f157755f = z2;
        this.f157756g = z3;
        this.f157757h = str;
        this.f157753d = "MeetingPreviewOpenPlatformModel@";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MeetingPreviewOpenPlatformModel(boolean z, boolean z2, boolean z3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? null : str);
    }
}
