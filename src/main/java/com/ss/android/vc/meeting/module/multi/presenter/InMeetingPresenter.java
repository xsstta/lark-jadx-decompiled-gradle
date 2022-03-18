package com.ss.android.vc.meeting.module.multi.presenter;

import android.content.Intent;
import com.google.firebase.messaging.Constants;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.entity.InterpreterSetting;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61381c;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.module.base.AbstractC61427g;
import com.ss.android.vc.meeting.module.base.C61438p;
import com.ss.android.vc.meeting.module.multi.AbstractC62493b;
import com.ss.android.vc.statistics.event.au;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u0003:\u00018B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0013J\u000e\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0018J\u0006\u0010$\u001a\u00020\u0015J\u0012\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010'\u001a\u00020\bH\u0002J \u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00152\b\u0010+\u001a\u0004\u0018\u00010,J\u0012\u0010-\u001a\u00020 2\b\u0010+\u001a\u0004\u0018\u00010.H\u0016J\u001c\u0010/\u001a\u00020 2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u000101H\u0016J\u0006\u00103\u001a\u00020 J\u000e\u00104\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0013J\u0006\u00105\u001a\u00020 J\u000e\u00106\u001a\u00020 2\u0006\u00107\u001a\u00020\u0015R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u00069"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/presenter/InMeetingPresenter;", "Lcom/ss/android/vc/meeting/module/base/RtcViewModel;", "Lcom/ss/android/vc/meeting/model/ParticipantData$ParticipantDataChange;", "Lcom/ss/android/vc/meeting/model/InMeetingInfoData$InMeetingInfoListener;", "()V", "TAG", "", "mInMeetingActived", "", "getMInMeetingActived", "()Z", "setMInMeetingActived", "(Z)V", "mInstanceId", "mIsLandscape", "getMIsLandscape", "setMIsLandscape", "mResultCallbackList", "", "Lcom/ss/android/vc/meeting/module/base/IActivityResultCallback;", "mScreenHeight", "", "mScreenWidth", "mView", "Lcom/ss/android/vc/meeting/module/multi/IInMeetingView;", "screenShareRenderListeners", "Lcom/ss/android/vc/meeting/module/base/IScreenShareRenderListener;", "getScreenShareRenderListeners", "()Ljava/util/List;", "setScreenShareRenderListeners", "(Ljava/util/List;)V", "addActivityResultCallback", "", "callback", "bindView", "view", "getScreenWidth", "init", "meetingId", "isInstanceValid", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onInMeetingInfoUpdate", "Lcom/ss/android/vc/entity/VideoChatInMeetingInfo;", "onSelfRtcModeUpdate", "lastSelf", "Lcom/ss/android/vc/entity/Participant;", "currentSelf", "registerListeners", "removeActivityResultCallback", "unregisterListeners", "updateVcRtcServiceRotation", "rotation", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.multi.presenter.b */
public class InMeetingPresenter extends C61438p implements C61381c.AbstractC61382a, C61388g.AbstractC61393a {
    public static final Companion Companion = new Companion(null);
    public static String currentInstanceId = "";
    private final String TAG = "InMeetingPresenter";
    private boolean mInMeetingActived;
    private String mInstanceId = "";
    private boolean mIsLandscape;
    private final List<AbstractC61427g> mResultCallbackList = new ArrayList();
    private int mScreenHeight;
    private int mScreenWidth;
    private AbstractC62493b mView;
    private List<Object> screenShareRenderListeners = new CopyOnWriteArrayList();

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212617a(InterpreterSetting interpreterSetting, InterpreterSetting interpreterSetting2) {
        C61388g.AbstractC61393a.CC.$default$a(this, interpreterSetting, interpreterSetting2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212618a(LanguageType languageType, LanguageType languageType2) {
        C61388g.AbstractC61393a.CC.$default$a(this, languageType, languageType2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212619a(Participant participant) {
        C61388g.AbstractC61393a.CC.$default$a(this, participant);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: a */
    public /* synthetic */ void mo212620a(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$a(this, participant, participant2);
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    /* renamed from: a */
    public /* synthetic */ void mo212486a(List list) {
        C61381c.AbstractC61382a.CC.$default$a(this, list);
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    /* renamed from: a */
    public /* synthetic */ void mo212487a(boolean z) {
        C61381c.AbstractC61382a.CC.$default$a(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    /* renamed from: b */
    public /* synthetic */ void mo212621b(Participant participant, Participant participant2) {
        C61388g.AbstractC61393a.CC.$default$b(this, participant, participant2);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bB_() {
        C61388g.AbstractC61393a.CC.$default$bB_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bD_() {
        C61388g.AbstractC61393a.CC.$default$bD_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public /* synthetic */ void bG_() {
        C61388g.AbstractC61393a.CC.$default$bG_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    public /* synthetic */ void h_(boolean z) {
        C61381c.AbstractC61382a.CC.$default$h_(this, z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/presenter/InMeetingPresenter$Companion;", "", "()V", "currentInstanceId", "", "getCurrentInstanceId", "()Ljava/lang/String;", "setCurrentInstanceId", "(Ljava/lang/String;)V", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.multi.presenter.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean getMInMeetingActived() {
        return this.mInMeetingActived;
    }

    public final boolean getMIsLandscape() {
        return this.mIsLandscape;
    }

    public final List<Object> getScreenShareRenderListeners() {
        return this.screenShareRenderListeners;
    }

    private final boolean isInstanceValid() {
        return Intrinsics.areEqual(currentInstanceId, this.mInstanceId);
    }

    public final int getScreenWidth() {
        if (this.mIsLandscape) {
            return Math.max(this.mScreenWidth, this.mScreenHeight);
        }
        return Math.min(this.mScreenWidth, this.mScreenHeight);
    }

    public final void registerListeners() {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        C61383d I = meeting.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
        I.mo212490a().mo212468a(this);
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        C61383d I2 = meeting2.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I2, "meeting.meetingData");
        I2.mo212494b().mo212593a(this);
    }

    public final void unregisterListeners() {
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        C61383d I = meeting.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
        I.mo212490a().mo212470b(this);
        C61303k meeting2 = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
        C61383d I2 = meeting2.mo212091I();
        Intrinsics.checkExpressionValueIsNotNull(I2, "meeting.meetingData");
        I2.mo212494b().mo212597b(this);
    }

    public final void setMInMeetingActived(boolean z) {
        this.mInMeetingActived = z;
    }

    public final void setMIsLandscape(boolean z) {
        this.mIsLandscape = z;
    }

    public final void bindView(AbstractC62493b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        this.mView = bVar;
    }

    public final void setScreenShareRenderListeners(List<Object> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.screenShareRenderListeners = list;
    }

    public final void addActivityResultCallback(AbstractC61427g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        synchronized (this.mResultCallbackList) {
            if (!this.mResultCallbackList.contains(gVar)) {
                this.mResultCallbackList.add(gVar);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void removeActivityResultCallback(AbstractC61427g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        synchronized (this.mResultCallbackList) {
            if (this.mResultCallbackList.contains(gVar)) {
                this.mResultCallbackList.remove(gVar);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.C61437o, com.ss.android.vc.meeting.module.base.C61438p
    public boolean init(String str) {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkExpressionValueIsNotNull(uuid, "UUID.randomUUID().toString()");
        currentInstanceId = uuid;
        this.mInstanceId = uuid;
        boolean init = super.init(str);
        this.mScreenWidth = C60776r.m236139a();
        this.mScreenHeight = C60776r.m236144b();
        return init;
    }

    public final void updateVcRtcServiceRotation(int i) {
        if (i == 0) {
            C61237h.m238223a().mo210524b(0);
        } else if (i == 1) {
            C61237h.m238223a().mo210524b(90);
        } else if (i == 2) {
            C61237h.m238223a().mo210524b(180);
        } else if (i != 3) {
            C61237h.m238223a().mo210524b(0);
        } else {
            C61237h.m238223a().mo210524b(270);
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    public void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        if (!isInstanceValid()) {
            C60700b.m235864f(this.TAG, "[onInMeetingInfoUpdate]", "presenter is invalid");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.mView == null || videoChatInMeetingInfo == null || getMeeting() == null) {
            C60700b.m235864f(this.TAG, "[onInMeetingInfoUpdate2]", "activity = null || data == null || meeting == nul");
            return;
        }
        AbstractC62493b bVar = this.mView;
        if (bVar == null) {
            Intrinsics.throwNpe();
        }
        if (bVar.bQ_()) {
            C60700b.m235864f(this.TAG, "[onInMeetingInfoUpdate3]", "View is finishing.");
            return;
        }
        if (videoChatInMeetingInfo.getVideoChatSettings() != null) {
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            C61383d I = meeting.mo212091I();
            Intrinsics.checkExpressionValueIsNotNull(I, "meeting.meetingData");
            C61388g b = I.mo212494b();
            Intrinsics.checkExpressionValueIsNotNull(b, "meeting.meetingData.participantData");
            if (b.mo212601f() != null) {
                C61303k meeting2 = getMeeting();
                Intrinsics.checkExpressionValueIsNotNull(meeting2, "meeting");
                if (!Intrinsics.areEqual(meeting2.mo212055d(), videoChatInMeetingInfo.getId())) {
                    String str = this.TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("current meeting = ");
                    C61303k meeting3 = getMeeting();
                    Intrinsics.checkExpressionValueIsNotNull(meeting3, "meeting");
                    sb.append(meeting3.mo212054c());
                    sb.append(", push id = ");
                    sb.append(videoChatInMeetingInfo.getId());
                    C60700b.m235864f(str, "[onInMeetingInfoUpdate5]", sb.toString());
                    return;
                } else if (Math.random() > ((double) 0.66f)) {
                    au.m250120a(System.currentTimeMillis() - currentTimeMillis);
                    return;
                } else {
                    return;
                }
            }
        }
        C60700b.m235864f(this.TAG, "[onInMeetingInfoUpdate4]", "data = null");
    }

    @Override // com.ss.android.vc.meeting.model.C61388g.AbstractC61393a
    public void onSelfRtcModeUpdate(Participant participant, Participant participant2) {
        ParticipantSettings.RtcMode rtcMode;
        ParticipantSettings participantSettings;
        ParticipantSettings.RtcMode rtcMode2;
        ParticipantSettings participantSettings2;
        ParticipantSettings participantSettings3;
        ParticipantSettings.RtcMode rtcMode3 = null;
        if (participant == null || (participantSettings3 = participant.getParticipantSettings()) == null) {
            rtcMode = null;
        } else {
            rtcMode = participantSettings3.getRtcMode();
        }
        if (!(participant2 == null || (participantSettings2 = participant2.getParticipantSettings()) == null)) {
            rtcMode3 = participantSettings2.getRtcMode();
        }
        if (rtcMode != rtcMode3 && participant2 != null && (participantSettings = participant2.getParticipantSettings()) != null && (rtcMode2 = participantSettings.getRtcMode()) != null) {
            getByteRtc().mo212013c(rtcMode2.getNumber());
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        synchronized (this.mResultCallbackList) {
            for (AbstractC61427g gVar : this.mResultCallbackList) {
                gVar.onActivityResult(i, i2, intent);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
