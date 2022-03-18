package com.ss.android.vc.meeting.module.multi.sharecontent;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61293a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamManagerGlobal;
import com.ss.android.vc.meeting.model.C61381c;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.model.C61394h;
import com.ss.android.vc.meeting.model.MeetingSpecificData;
import com.ss.android.vc.meeting.module.multi.sharecontent.ShareContentModel;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0007H\u0016J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0016J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0007H\u0016J\b\u0010\"\u001a\u00020\u0014H\u0016J\b\u0010#\u001a\u00020\u0014H\u0002J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0007H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/sharecontent/ShareContentControl;", "Lcom/ss/android/vc/meeting/module/multi/sharecontent/AbsShareContentControl;", "Lcom/ss/android/vc/meeting/model/ScreenShareProcessor$ShareScreenChangeListener;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "isMeSharing", "", "mSdkListener", "Lcom/ss/android/vc/meeting/framework/meeting/AbsByteRtcListener;", "mShareContentModel", "Lcom/ss/android/vc/meeting/module/multi/sharecontent/ShareContentModel;", "getMShareContentModel", "()Lcom/ss/android/vc/meeting/module/multi/sharecontent/ShareContentModel;", "setMShareContentModel", "(Lcom/ss/android/vc/meeting/module/multi/sharecontent/ShareContentModel;)V", "mShareContentViewListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/vc/meeting/module/multi/sharecontent/IShareContentViewListener;", "addShareContentViewListener", "", "listener", "getShareContentModel", "isSharing", "onSelfSharingChanged", "newSelfSharing", "onShareScreenChanged", "hasFollow", "refreshShareName", "refreshShareScreen", "registerRtcSdkListener", "removeShareContentViewListener", "setSketchEnabled", "enable", "unregisterRtcSdkListener", "updateScreenShare", "updateScreenStreamSubscribe", "muted", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.multi.b.d */
public final class ShareContentControl extends AbsShareContentControl implements C61394h.AbstractC61395a {

    /* renamed from: a */
    public static final Companion f157211a = new Companion(null);

    /* renamed from: b */
    private ShareContentModel f157212b;

    /* renamed from: c */
    private CopyOnWriteArrayList<IShareContentViewListener> f157213c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    private boolean f157214d;

    /* renamed from: e */
    private final AbstractC61293a f157215e = new C62495b(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/sharecontent/ShareContentControl$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.b.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.sharecontent.AbsShareContentControl
    /* renamed from: a */
    public ShareContentModel mo216065a() {
        return this.f157212b;
    }

    @Override // com.ss.android.vc.meeting.module.multi.sharecontent.AbsShareContentControl
    /* renamed from: f */
    public boolean mo216075f() {
        return this.f157214d;
    }

    @Override // com.ss.android.vc.meeting.module.multi.sharecontent.AbsShareContentControl
    /* renamed from: e */
    public boolean mo216074e() {
        if (this.f157212b != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.multi.sharecontent.AbsShareContentControl
    /* renamed from: b */
    public void mo216068b() {
        Iterator<IShareContentViewListener> it = this.f157213c.iterator();
        while (it.hasNext()) {
            IShareContentViewListener next = it.next();
            if (next != null) {
                next.mo216077b();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.sharecontent.AbsShareContentControl
    /* renamed from: c */
    public void mo216070c() {
        C60700b.m235851b("ShareContentControl@", "[registerRtcSdkListener]", "registerRtcSdkListener");
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.mo212164x().mo211751a(this.f157215e);
    }

    @Override // com.ss.android.vc.meeting.module.multi.sharecontent.AbsShareContentControl
    /* renamed from: d */
    public void mo216072d() {
        C60700b.m235851b("ShareContentControl@", "[unregisterRtcSdkListener]", "unregisterRtcSdkListener");
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.mo212164x().mo211761b(this.f157215e);
    }

    /* renamed from: g */
    private final void m244315g() {
        C61303k kVar = this.mMeeting;
        Intrinsics.checkExpressionValueIsNotNull(kVar, "mMeeting");
        String m = kVar.mo212092J().mo212556m();
        C61303k kVar2 = this.mMeeting;
        Intrinsics.checkExpressionValueIsNotNull(kVar2, "mMeeting");
        String n = kVar2.mo212092J().mo212558n();
        C61303k kVar3 = this.mMeeting;
        Intrinsics.checkExpressionValueIsNotNull(kVar3, "mMeeting");
        ParticipantType o = kVar3.mo212092J().mo212560o();
        C60700b.m235851b("ShareContentControl@", "[updateScreenShare]", "shareDeviceId = " + m + ", shareUserId = " + n);
        ShareContentModel eVar = null;
        Participant participant = null;
        eVar = null;
        if (!TextUtils.isEmpty(m) && !TextUtils.isEmpty(n)) {
            ShareContentModel eVar2 = this.f157212b;
            if (eVar2 != null) {
                if (eVar2 != null) {
                    participant = eVar2.mo216089a();
                }
                if (ParticipantUtil.m248717a(participant, n, m, o)) {
                    return;
                }
            }
            ShareContentModel.Companion aVar = ShareContentModel.f157217a;
            C61303k kVar4 = this.mMeeting;
            Intrinsics.checkExpressionValueIsNotNull(kVar4, "mMeeting");
            if (o == null) {
                Intrinsics.throwNpe();
            }
            eVar = aVar.mo216090a(kVar4, m, n, o);
        }
        this.f157212b = eVar;
    }

    @Override // com.ss.android.vc.meeting.model.C61394h.AbstractC61395a
    /* renamed from: b */
    public void mo212629b(boolean z) {
        this.f157214d = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/vc/meeting/module/multi/sharecontent/ShareContentControl$mSdkListener$1", "Lcom/ss/android/vc/meeting/framework/meeting/AbsByteRtcListener;", "onFirstRemoteScreenFrame", "", "rtcJoinId", "", "width", "", "height", "onScreenStreamAdd", "streamId", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.b.d$b */
    public static final class C62495b extends AbstractC61293a {

        /* renamed from: a */
        final /* synthetic */ ShareContentControl f157216a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62495b(ShareContentControl dVar) {
            this.f157216a = dVar;
        }

        @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
        /* renamed from: c */
        public void mo211770c(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "rtcJoinId");
            Intrinsics.checkParameterIsNotNull(str2, "streamId");
            C60700b.m235851b("ShareContentControl@", "[onScreenStreamAdd]", "onScreenStreamAdd");
            C61303k meeting = this.f157216a.getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "getMeeting()");
            meeting.mo212102T().mo212216a(str2, false);
        }

        @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d, com.ss.android.vc.meeting.framework.meeting.AbstractC61293a
        /* renamed from: b */
        public void mo211763b(String str, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(str, "rtcJoinId");
            C60700b.m235851b("ShareContentControl@", "[onFirstRemoteScreenFrame]", "onFirstRemoteScreenFrame");
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.sharecontent.AbsShareContentControl
    /* renamed from: a */
    public void mo216066a(IShareContentViewListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f157213c.add(bVar);
    }

    @Override // com.ss.android.vc.meeting.module.multi.sharecontent.AbsShareContentControl
    /* renamed from: b */
    public void mo216069b(IShareContentViewListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f157213c.remove(bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareContentControl(C61303k kVar) {
        super(kVar);
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        C61383d I = kVar.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
        C61381c a = I.mo212490a();
        Intrinsics.checkExpressionValueIsNotNull(a, "meeting.meetingData.inMeetingInfoData");
        a.mo212469b().mo212627a(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61394h.AbstractC61395a, com.ss.android.vc.meeting.module.multi.sharecontent.AbsShareContentControl
    /* renamed from: a */
    public void mo216067a(boolean z) {
        C60700b.m235851b("ShareContentControl@", "[onShareScreenChanged]", "onShareScreenChanged");
        m244315g();
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        meeting.ag().closeSketchPenel();
        Iterator<IShareContentViewListener> it = this.f157213c.iterator();
        while (it.hasNext()) {
            IShareContentViewListener next = it.next();
            if (next != null) {
                next.mo216076a(z);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.sharecontent.AbsShareContentControl
    /* renamed from: d */
    public void mo216073d(boolean z) {
        Iterator<IShareContentViewListener> it = this.f157213c.iterator();
        while (it.hasNext()) {
            IShareContentViewListener next = it.next();
            if (next != null) {
                next.mo216078b(z);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.multi.sharecontent.AbsShareContentControl
    /* renamed from: c */
    public void mo216071c(boolean z) {
        String str;
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        C61383d I = meeting.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
        C61388g b = I.mo212494b();
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        String n = meeting2.mo212092J().mo212558n();
        C61303k meeting3 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
        ParticipantType o = meeting3.mo212092J().mo212560o();
        C61303k meeting4 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting4, "meeting");
        Participant a = b.mo212589a(n, o, meeting4.mo212092J().mo212556m());
        StringBuilder sb = new StringBuilder();
        sb.append("muted = ");
        sb.append(z);
        sb.append(", mShareScreenRtcId = ");
        C61303k meeting5 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting5, "meeting");
        sb.append(meeting5.mo212092J().mo212534d());
        sb.append(", participant rtcJoinId = ");
        String str2 = null;
        if (a != null) {
            str = a.getRtcJoinId();
        } else {
            str = null;
        }
        sb.append(str);
        C60700b.m235851b("ShareContentControl@", "[updateStreamSubscribe]", sb.toString());
        C61303k meeting6 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting6, "meeting");
        if (!TextUtils.isEmpty(meeting6.mo212092J().mo212534d())) {
            C61303k meeting7 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting7, "meeting");
            String d = meeting7.mo212092J().mo212534d();
            if (a != null) {
                str2 = a.getRtcJoinId();
            }
            if (!TextUtils.equals(d, str2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("no match mShareScreenRtcId: ");
                C61303k meeting8 = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting8, "meeting");
                sb2.append(meeting8.mo212092J().mo212534d());
                C60700b.m235864f("ShareContentControl@", "[updateStreamSubscribe2]", sb2.toString());
                if (a != null) {
                    C61303k meeting9 = getMeeting();
                    Intrinsics.checkExpressionValueIsNotNull(meeting9, "meeting");
                    MeetingSpecificData J = meeting9.mo212092J();
                    String rtcJoinId = a.getRtcJoinId();
                    Intrinsics.checkExpressionValueIsNotNull(rtcJoinId, "it.rtcJoinId");
                    J.mo212529b(rtcJoinId);
                }
            }
        } else if (a != null) {
            C61303k meeting10 = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting10, "meeting");
            MeetingSpecificData J2 = meeting10.mo212092J();
            String rtcJoinId2 = a.getRtcJoinId();
            Intrinsics.checkExpressionValueIsNotNull(rtcJoinId2, "it.rtcJoinId");
            J2.mo212529b(rtcJoinId2);
        }
        C61303k kVar = this.mMeeting;
        Intrinsics.checkExpressionValueIsNotNull(kVar, "mMeeting");
        StreamManagerGlobal T = kVar.mo212102T();
        C61303k meeting11 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting11, "meeting");
        String h = T.mo212232h(meeting11.mo212092J().mo212534d());
        if (TextUtils.isEmpty(h)) {
            C60700b.m235851b("ShareContentControl@", "[updateStreamSubscribe3]", "shareStreamId is null, return");
            return;
        }
        C61303k kVar2 = this.mMeeting;
        Intrinsics.checkExpressionValueIsNotNull(kVar2, "mMeeting");
        kVar2.mo212102T().mo212216a(h, z);
    }
}
