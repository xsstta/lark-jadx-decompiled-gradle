package com.ss.android.vc.meeting.module.lobby;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.meeting.module.audio.C61405a;
import com.ss.android.vc.meeting.module.audio.C61410c;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.receiver.AudioReceiverHolder;
import com.ss.android.vc.net.request.VcBizSender;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002:\u0001*B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0012J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\"\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\"\u0010\u001f\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\b\u0010 \u001a\u00020\u0019H\u0014J\u0006\u0010!\u001a\u00020\u0019J\u000e\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0007J\u001e\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0016J\u001e\u0010(\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0016J\u0006\u0010)\u001a\u00020\u0019R \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0004¢\u0006\u0002\n\u0000R#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR#\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006+"}, d2 = {"Lcom/ss/android/vc/meeting/module/lobby/MeetingLobbyViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ss/android/vc/meeting/module/audio/MeetingAudioManager$AudioStateChangedListener;", "()V", "_audioSwitchState", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "_cameraSwitchState", "_speakerState", "Lcom/ss/android/vc/meeting/module/lobby/MeetingLobbyViewModel$SpeakerState;", "audioSwitchState", "Landroidx/lifecycle/LiveData;", "getAudioSwitchState", "()Landroidx/lifecycle/LiveData;", "cameraSwitchState", "getCameraSwitchState", "mPreviewMeetingAudioManager", "Lcom/ss/android/vc/meeting/module/audio/MeetingAudioManager;", "speakerState", "getSpeakerState", "getAudioTypeName", "", "getMeetingAudioManager", "onAudioMuted", "", "onAudioStateChanged", "lastType", "Lcom/ss/android/vc/meeting/module/audio/MeetingAudioManager$AudioType;", "lastOutSpeaker", "needTrack", "onAudioStateUnchanged", "onCleared", "onCreate", "presetSpeakerState", "isOutSpeaker", "setAudioSwitchState", "isOpen", "isNeedShowToast", "meetingId", "setCameraSwitchState", "switchSpeaker", "SpeakerState", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.lobby.h */
public final class MeetingLobbyViewModel extends AbstractC1142af implements MeetingAudioManager.AbstractC61403a {
    private final C1177w<Pair<Boolean, Boolean>> _audioSwitchState;
    private final C1177w<Pair<Boolean, Boolean>> _cameraSwitchState;
    private final C1177w<SpeakerState> _speakerState;
    private final LiveData<Pair<Boolean, Boolean>> audioSwitchState;
    private final LiveData<Pair<Boolean, Boolean>> cameraSwitchState;
    private MeetingAudioManager mPreviewMeetingAudioManager = new C62147b();
    private final LiveData<SpeakerState> speakerState;

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioStateUnchanged(MeetingAudioManager.AudioType audioType, boolean z, boolean z2) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/ss/android/vc/meeting/module/lobby/MeetingLobbyViewModel$SpeakerState;", "", ShareHitPoint.f121869d, "Lcom/ss/android/vc/meeting/module/audio/MeetingAudioManager$AudioType;", "isOutSpeaker", "", "(Lcom/ss/android/vc/meeting/module/audio/MeetingAudioManager$AudioType;Z)V", "()Z", "getType", "()Lcom/ss/android/vc/meeting/module/audio/MeetingAudioManager$AudioType;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.lobby.h$a */
    public static final class SpeakerState {

        /* renamed from: a */
        private final MeetingAudioManager.AudioType f156101a;

        /* renamed from: b */
        private final boolean f156102b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpeakerState)) {
                return false;
            }
            SpeakerState aVar = (SpeakerState) obj;
            return Intrinsics.areEqual(this.f156101a, aVar.f156101a) && this.f156102b == aVar.f156102b;
        }

        public int hashCode() {
            MeetingAudioManager.AudioType audioType = this.f156101a;
            int hashCode = (audioType != null ? audioType.hashCode() : 0) * 31;
            boolean z = this.f156102b;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return hashCode + i;
        }

        public String toString() {
            return "SpeakerState(type=" + this.f156101a + ", isOutSpeaker=" + this.f156102b + ")";
        }

        /* renamed from: a */
        public final MeetingAudioManager.AudioType mo214981a() {
            return this.f156101a;
        }

        /* renamed from: b */
        public final boolean mo214982b() {
            return this.f156102b;
        }

        public SpeakerState(MeetingAudioManager.AudioType audioType, boolean z) {
            Intrinsics.checkParameterIsNotNull(audioType, ShareHitPoint.f121869d);
            this.f156101a = audioType;
            this.f156102b = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/lobby/MeetingLobbyViewModel$mPreviewMeetingAudioManager$1", "Lcom/ss/android/vc/meeting/module/audio/PreviewAudioManager;", "toast", "", "content", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.lobby.h$b */
    public static final class C62147b extends C61410c {
        C62147b() {
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager, com.ss.android.vc.meeting.module.audio.C61410c
        /* renamed from: a */
        public void mo212687a(String str) {
            C60738ac.m236041d(str);
        }
    }

    public final LiveData<Pair<Boolean, Boolean>> getAudioSwitchState() {
        return this.audioSwitchState;
    }

    public final LiveData<Pair<Boolean, Boolean>> getCameraSwitchState() {
        return this.cameraSwitchState;
    }

    public final MeetingAudioManager getMeetingAudioManager() {
        return this.mPreviewMeetingAudioManager;
    }

    public final LiveData<SpeakerState> getSpeakerState() {
        return this.speakerState;
    }

    public final void switchSpeaker() {
        this.mPreviewMeetingAudioManager.mo212708m();
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioMuted() {
        C60738ac.m236041d(UIHelper.getString(R.string.View_MV_MutedNoTalk_Toast));
    }

    public final String getAudioTypeName() {
        String a = C61405a.m239521a(this.mPreviewMeetingAudioManager.mo212720y(), this.mPreviewMeetingAudioManager.mo212721z());
        Intrinsics.checkExpressionValueIsNotNull(a, "AudioHelper.getAudioType…udioManager.isOutSpeaker)");
        return a;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        this.mPreviewMeetingAudioManager.mo212693b(this);
        this.mPreviewMeetingAudioManager.mo212715t();
        AudioReceiverHolder.f158409a.mo217328b(this.mPreviewMeetingAudioManager);
        super.onCleared();
    }

    public final void onCreate() {
        AudioReceiverHolder.f158409a.mo217325a(this.mPreviewMeetingAudioManager);
        this.mPreviewMeetingAudioManager.mo212685a(this);
    }

    public MeetingLobbyViewModel() {
        C1177w<Pair<Boolean, Boolean>> wVar = new C1177w<>();
        this._cameraSwitchState = wVar;
        this.cameraSwitchState = wVar;
        C1177w<Pair<Boolean, Boolean>> wVar2 = new C1177w<>();
        this._audioSwitchState = wVar2;
        this.audioSwitchState = wVar2;
        C1177w<SpeakerState> wVar3 = new C1177w<>();
        this._speakerState = wVar3;
        this.speakerState = wVar3;
    }

    public final void presetSpeakerState(boolean z) {
        this.mPreviewMeetingAudioManager.mo212694b(!z);
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioStateChanged(MeetingAudioManager.AudioType audioType, boolean z, boolean z2) {
        boolean z3 = this.mPreviewMeetingAudioManager.mo212721z();
        MeetingAudioManager.AudioType y = this.mPreviewMeetingAudioManager.mo212720y();
        C1177w<SpeakerState> wVar = this._speakerState;
        Intrinsics.checkExpressionValueIsNotNull(y, ShareHitPoint.f121869d);
        wVar.mo5926a(new SpeakerState(y, z3));
    }

    public final void setAudioSwitchState(boolean z, boolean z2, String str) {
        Intrinsics.checkParameterIsNotNull(str, "meetingId");
        this._audioSwitchState.mo5929b(new Pair<>(Boolean.valueOf(z), Boolean.valueOf(z2)));
        boolean z3 = true;
        boolean z4 = !z;
        Pair<Boolean, Boolean> b = this.cameraSwitchState.mo5927b();
        if (b == null || b.getFirst().booleanValue()) {
            z3 = false;
        }
        VcBizSender.m249207a(z4, z3, str).mo219896d();
    }

    public final void setCameraSwitchState(boolean z, boolean z2, String str) {
        boolean z3;
        Intrinsics.checkParameterIsNotNull(str, "meetingId");
        this._cameraSwitchState.mo5929b(new Pair<>(Boolean.valueOf(z), Boolean.valueOf(z2)));
        Pair<Boolean, Boolean> b = this.audioSwitchState.mo5927b();
        if (b == null || b.getFirst().booleanValue()) {
            z3 = false;
        } else {
            z3 = true;
        }
        VcBizSender.m249207a(z3, !z, str).mo219896d();
    }
}
