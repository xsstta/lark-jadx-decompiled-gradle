package com.ss.android.vc.meeting.module.audio;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.suite.R;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.widget.actionsheet.VCActionSheetBuilder;
import com.ss.android.vc.common.widget.actionsheet.VCActionSheetController;
import com.ss.android.vc.common.widget.actionsheet.VCActionSheetDialogAdapter;
import com.ss.android.vc.meeting.framework.meeting.ByteRtc;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.MeetingSpecificData;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.p3155q.AbstractC62782a;
import com.ss.android.vc.meeting.module.preview.guest.GuestJoinMeetingUtil;
import com.ss.android.vc.meeting.utils.ProximityUtil;
import com.ss.android.vc.service.C63634c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 ;2\u00020\u0001:\u0003;<=B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020\u00122\b\u0010'\u001a\u0004\u0018\u00010(J\u000e\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020\u0012J\u0012\u0010+\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\b\u0010,\u001a\u00020\u0012H\u0002J\u0006\u0010-\u001a\u00020\u0012J\b\u0010.\u001a\u00020%H\u0016J\"\u0010/\u001a\u00020%2\b\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u0012H\u0016J\"\u00104\u001a\u00020%2\b\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u0012H\u0016J\u000e\u00105\u001a\u00020%2\u0006\u00106\u001a\u00020\u0012J\u000e\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020\u0012J\u0010\u00109\u001a\u00020%2\b\u0010:\u001a\u0004\u0018\u00010!R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/ss/android/vc/meeting/module/audio/AudioRouteHelper;", "Lcom/ss/android/vc/meeting/module/audio/MeetingAudioManager$AudioStateChangedListener;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "audioManager", "Lcom/ss/android/vc/meeting/module/audio/MeetingAudioManager;", "routeAction", "Lcom/ss/android/vc/meeting/module/audio/AudioRouteHelper$IRouteAction;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/module/audio/MeetingAudioManager;Lcom/ss/android/vc/meeting/module/audio/AudioRouteHelper$IRouteAction;)V", "actionSheetBuilder", "Lcom/ss/android/vc/common/widget/actionsheet/VCActionSheetBuilder;", "getAudioManager", "()Lcom/ss/android/vc/meeting/module/audio/MeetingAudioManager;", "setAudioManager", "(Lcom/ss/android/vc/meeting/module/audio/MeetingAudioManager;)V", "earPieceData", "Lcom/ss/android/vc/common/widget/actionsheet/VCActionSheetDialogAdapter$ActionSheetData;", "enableIntercept", "", "items", "", "getMeeting", "()Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "setMeeting", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "muteData", "outSpeakerData", "playbackDigitalMute", "getRouteAction", "()Lcom/ss/android/vc/meeting/module/audio/AudioRouteHelper$IRouteAction;", "setRouteAction", "(Lcom/ss/android/vc/meeting/module/audio/AudioRouteHelper$IRouteAction;)V", "statisAction", "Lcom/ss/android/vc/meeting/module/audio/AudioRouteHelper$IStatisAction;", "udDialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "destroy", "", "handleAudioRouteSelect", "context", "Landroid/content/Context;", "handleMicOpen", "audioGranted", "initAndShowActionSheet", "isGuestOrSimplify", "isPlaybackDigitalMute", "onAudioMuted", "onAudioStateChanged", "lastType", "Lcom/ss/android/vc/meeting/module/audio/MeetingAudioManager$AudioType;", "lastOutSpeaker", "needTrack", "onAudioStateUnchanged", "setEnableIntercept", "intercept", "setPlaybackDigitalMute", "mute", "setStatisAction", "sa", "Companion", "IRouteAction", "IStatisAction", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.audio.b */
public final class AudioRouteHelper implements MeetingAudioManager.AbstractC61403a {

    /* renamed from: f */
    public static final String f153956f = f153956f;

    /* renamed from: g */
    public static final Companion f153957g = new Companion(null);

    /* renamed from: a */
    public final List<VCActionSheetDialogAdapter.ActionSheetData> f153958a = new ArrayList();

    /* renamed from: b */
    public VCActionSheetDialogAdapter.ActionSheetData f153959b;

    /* renamed from: c */
    public VCActionSheetDialogAdapter.ActionSheetData f153960c;

    /* renamed from: d */
    public VCActionSheetDialogAdapter.ActionSheetData f153961d;

    /* renamed from: e */
    public IStatisAction f153962e;

    /* renamed from: h */
    private boolean f153963h;

    /* renamed from: i */
    private boolean f153964i;

    /* renamed from: j */
    private VCActionSheetBuilder f153965j;

    /* renamed from: k */
    private UDDialog f153966k;

    /* renamed from: l */
    private C61303k f153967l;

    /* renamed from: m */
    private MeetingAudioManager f153968m;

    /* renamed from: n */
    private IRouteAction f153969n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/audio/AudioRouteHelper$IRouteAction;", "", "onAudioRouteSwitch", "", "onPlaybackDigitalMute", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.audio.b$b */
    public interface IRouteAction {
        void bV_();

        void bW_();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/meeting/module/audio/AudioRouteHelper$IStatisAction;", "", "onSpeakerClick", "", "action", "", "onSpeakerView", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.audio.b$c */
    public interface IStatisAction {
        /* renamed from: a */
        void mo212748a();

        /* renamed from: a */
        void mo212749a(String str);
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioMuted() {
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioStateUnchanged(MeetingAudioManager.AudioType audioType, boolean z, boolean z2) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/vc/meeting/module/audio/AudioRouteHelper$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "isAudioMuteEnable", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.audio.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo212744a() {
            return AudioRouteHelper.f153956f;
        }

        @JvmStatic
        /* renamed from: b */
        public final boolean mo212745b() {
            return C63634c.m249496b("byteview.meeting.android.speakerdisconnect");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final MeetingAudioManager mo212741c() {
        return this.f153968m;
    }

    /* renamed from: d */
    public final IRouteAction mo212743d() {
        return this.f153969n;
    }

    /* renamed from: a */
    public final boolean mo212737a() {
        return this.f153964i;
    }

    /* renamed from: e */
    private final boolean m239527e() {
        if (GuestJoinMeetingUtil.m245480b() || GuestJoinMeetingUtil.m245482d()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo212739b() {
        MeetingAudioManager.AudioType audioType;
        String str = f153956f;
        StringBuilder sb = new StringBuilder();
        MeetingAudioManager meetingAudioManager = this.f153968m;
        if (meetingAudioManager != null) {
            audioType = meetingAudioManager.mo212720y();
        } else {
            audioType = null;
        }
        sb.append(audioType);
        sb.append(", ");
        sb.append(this.f153968m);
        C60700b.m235851b(str, "[destroy]", sb.toString());
        MeetingAudioManager meetingAudioManager2 = this.f153968m;
        if (meetingAudioManager2 != null) {
            meetingAudioManager2.mo212693b(this);
        }
    }

    /* renamed from: a */
    public final void mo212735a(IStatisAction cVar) {
        this.f153962e = cVar;
    }

    /* renamed from: a */
    public final void mo212736a(boolean z) {
        this.f153963h = z;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onCancel", "com/ss/android/vc/meeting/module/audio/AudioRouteHelper$initAndShowActionSheet$4$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.audio.b$f */
    public static final class DialogInterface$OnCancelListenerC61409f implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ AudioRouteHelper f153974a;

        /* renamed from: b */
        final /* synthetic */ Context f153975b;

        DialogInterface$OnCancelListenerC61409f(AudioRouteHelper bVar, Context context) {
            this.f153974a = bVar;
            this.f153975b = context;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            IStatisAction cVar = this.f153974a.f153962e;
            if (cVar != null) {
                cVar.mo212749a("cancel");
            }
        }
    }

    /* renamed from: a */
    public final boolean mo212738a(Context context) {
        MeetingAudioManager.AudioType audioType;
        if (!f153957g.mo212745b() || this.f153963h || m239527e()) {
            IRouteAction bVar = this.f153969n;
            if (bVar != null) {
                bVar.bV_();
            }
            return false;
        }
        MeetingAudioManager meetingAudioManager = this.f153968m;
        if (meetingAudioManager != null) {
            audioType = meetingAudioManager.mo212720y();
        } else {
            audioType = null;
        }
        String str = f153956f;
        C60700b.m235851b(str, "[handleAudioRouteSelect]", "playbackDigitalMute: " + this.f153964i + ", audioType: " + audioType);
        if (audioType == MeetingAudioManager.AudioType.Bluetooth || audioType == MeetingAudioManager.AudioType.HeadPhone) {
            IRouteAction bVar2 = this.f153969n;
            if (bVar2 != null) {
                bVar2.bV_();
            }
            return false;
        }
        m239526b(context);
        return true;
    }

    /* renamed from: b */
    public final void mo212740b(boolean z) {
        MeetingAudioManager.AudioType audioType;
        if (z && f153957g.mo212745b() && !this.f153963h && !m239527e()) {
            String str = f153956f;
            StringBuilder sb = new StringBuilder();
            sb.append("playbackDigitalMute: ");
            sb.append(this.f153964i);
            sb.append(", audioType: ");
            MeetingAudioManager meetingAudioManager = this.f153968m;
            MeetingAudioManager.AudioType audioType2 = null;
            if (meetingAudioManager != null) {
                audioType = meetingAudioManager.mo212720y();
            } else {
                audioType = null;
            }
            sb.append(audioType);
            C60700b.m235851b(str, "[handleMicOpen]", sb.toString());
            if (this.f153964i) {
                MeetingAudioManager meetingAudioManager2 = this.f153968m;
                if (meetingAudioManager2 != null) {
                    audioType2 = meetingAudioManager2.mo212720y();
                }
                if (audioType2 != MeetingAudioManager.AudioType.Bluetooth && audioType2 != MeetingAudioManager.AudioType.HeadPhone) {
                    mo212742c(false);
                    MeetingAudioManager meetingAudioManager3 = this.f153968m;
                    if (meetingAudioManager3 != null) {
                        meetingAudioManager3.mo212702f(meetingAudioManager3.mo212721z());
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo212742c(boolean z) {
        Activity c;
        ByteRtc y;
        MeetingSpecificData J;
        String str = f153956f;
        C60700b.m235851b(str, "[setPlaybackDigitalMute]", "mute : " + z);
        this.f153964i = z;
        C61303k kVar = this.f153967l;
        if (!(kVar == null || (J = kVar.mo212092J()) == null)) {
            J.mo212552k(this.f153964i);
        }
        C61303k kVar2 = this.f153967l;
        if (!(kVar2 == null || (y = kVar2.mo212165y()) == null)) {
            y.mo212022f(this.f153964i);
        }
        C61303k kVar3 = this.f153967l;
        if (kVar3 != null && (c = VCAppLifeCycle.m236256c()) != null) {
            C60700b.m235851b(str, "[setPlaybackDigitalMute]", "proximity check");
            ProximityUtil.m248869a(c, kVar3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/vc/meeting/module/audio/AudioRouteHelper$initAndShowActionSheet$4$1", "Lcom/ss/android/vc/common/widget/actionsheet/VCActionSheetController$OnItemClickListener;", "onItemClick", "", "index", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.audio.b$d */
    public static final class C61407d implements VCActionSheetController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ AudioRouteHelper f153970a;

        /* renamed from: b */
        final /* synthetic */ Context f153971b;

        @Override // com.ss.android.vc.common.widget.actionsheet.VCActionSheetController.OnItemClickListener
        /* renamed from: a */
        public void mo208588a(int i) {
            MeetingAudioManager c;
            C60700b.m235851b(AudioRouteHelper.f153957g.mo212744a(), "[onItemClick]", String.valueOf(i));
            if (Intrinsics.areEqual(this.f153970a.f153958a.get(i), this.f153970a.f153961d)) {
                if (!this.f153970a.f153958a.get(i).mo208600c()) {
                    this.f153970a.mo212742c(true);
                    IRouteAction d = this.f153970a.mo212743d();
                    if (d != null) {
                        d.bW_();
                    }
                    IStatisAction cVar = this.f153970a.f153962e;
                    if (cVar != null) {
                        cVar.mo212749a("mute");
                    }
                    MeetingAudioManager c2 = this.f153970a.mo212741c();
                    if (c2 != null) {
                        c2.mo212718w();
                    }
                }
            } else if (!this.f153970a.f153958a.get(i).mo208600c()) {
                this.f153970a.mo212742c(false);
                if (!Intrinsics.areEqual(this.f153970a.f153958a.get(i), this.f153970a.f153960c) || (c = this.f153970a.mo212741c()) == null || c.mo212721z()) {
                    IRouteAction d2 = this.f153970a.mo212743d();
                    if (d2 != null) {
                        d2.bV_();
                    }
                } else {
                    MeetingAudioManager c3 = this.f153970a.mo212741c();
                    if (c3 != null) {
                        c3.mo212702f(false);
                        c3.mo212707l();
                    }
                }
                if (Intrinsics.areEqual(this.f153970a.f153958a.get(i), this.f153970a.f153959b)) {
                    IStatisAction cVar2 = this.f153970a.f153962e;
                    if (cVar2 != null) {
                        cVar2.mo212749a("loudspeaker");
                        return;
                    }
                    return;
                }
                IStatisAction cVar3 = this.f153970a.f153962e;
                if (cVar3 != null) {
                    cVar3.mo212749a("receiver");
                }
            }
        }

        C61407d(AudioRouteHelper bVar, Context context) {
            this.f153970a = bVar;
            this.f153971b = context;
        }
    }

    /* renamed from: b */
    private final void m239526b(Context context) {
        boolean z;
        if (context != null) {
            boolean z2 = false;
            if (this.f153958a.isEmpty()) {
                String string = context.getString(R.string.View_A_Speaker);
                Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.View_A_Speaker)");
                this.f153959b = new VCActionSheetDialogAdapter.ActionSheetData(R.drawable.ud_icon_speaker_outlined, string, false);
                String string2 = context.getString(R.string.View_G_Receiver);
                Intrinsics.checkExpressionValueIsNotNull(string2, "context.getString(R.string.View_G_Receiver)");
                this.f153960c = new VCActionSheetDialogAdapter.ActionSheetData(R.drawable.ud_icon_ear_outlined, string2, false);
                String string3 = context.getString(R.string.View_MV_MuteButton);
                Intrinsics.checkExpressionValueIsNotNull(string3, "context.getString(R.string.View_MV_MuteButton)");
                this.f153961d = new VCActionSheetDialogAdapter.ActionSheetData(R.drawable.ud_icon_speaker_mute_outlined, string3, false);
                VCActionSheetDialogAdapter.ActionSheetData aVar = this.f153959b;
                if (aVar != null) {
                    this.f153958a.add(aVar);
                }
                VCActionSheetDialogAdapter.ActionSheetData aVar2 = this.f153960c;
                if (aVar2 != null) {
                    this.f153958a.add(aVar2);
                }
                VCActionSheetDialogAdapter.ActionSheetData aVar3 = this.f153961d;
                if (aVar3 != null) {
                    this.f153958a.add(aVar3);
                }
            }
            VCActionSheetDialogAdapter.ActionSheetData aVar4 = this.f153959b;
            if (aVar4 != null) {
                MeetingAudioManager meetingAudioManager = this.f153968m;
                if (meetingAudioManager == null || !meetingAudioManager.mo212721z() || this.f153964i) {
                    z = false;
                } else {
                    z = true;
                }
                aVar4.mo208598a(z);
            }
            VCActionSheetDialogAdapter.ActionSheetData aVar5 = this.f153960c;
            if (aVar5 != null) {
                MeetingAudioManager meetingAudioManager2 = this.f153968m;
                if (meetingAudioManager2 != null && meetingAudioManager2.mo212681A() && !this.f153964i) {
                    z2 = true;
                }
                aVar5.mo208598a(z2);
            }
            VCActionSheetDialogAdapter.ActionSheetData aVar6 = this.f153961d;
            if (aVar6 != null) {
                aVar6.mo208598a(this.f153964i);
            }
            VCActionSheetBuilder aVar7 = new VCActionSheetBuilder(context);
            this.f153965j = aVar7;
            VCActionSheetBuilder a = aVar7.mo208580a(this.f153958a).mo208579a(new C61407d(this, context));
            String string4 = context.getString(R.string.View_N_Cancel);
            Intrinsics.checkExpressionValueIsNotNull(string4, "context.getString(R.string.View_N_Cancel)");
            a.addActionButton(R.id.ud_dialog_btn_cancel, string4, new DialogInterface$OnClickListenerC61408e(this, context));
            UDDialog build = aVar7.build();
            this.f153966k = build;
            if (build == null) {
                Intrinsics.throwNpe();
            }
            build.setOnCancelListener(new DialogInterface$OnCancelListenerC61409f(this, context));
            UDDialog uDDialog = this.f153966k;
            if (uDDialog == null) {
                Intrinsics.throwNpe();
            }
            uDDialog.show();
            IStatisAction cVar = this.f153962e;
            if (cVar != null) {
                cVar.mo212748a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick", "com/ss/android/vc/meeting/module/audio/AudioRouteHelper$initAndShowActionSheet$4$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.audio.b$e */
    public static final class DialogInterface$OnClickListenerC61408e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AudioRouteHelper f153972a;

        /* renamed from: b */
        final /* synthetic */ Context f153973b;

        DialogInterface$OnClickListenerC61408e(AudioRouteHelper bVar, Context context) {
            this.f153972a = bVar;
            this.f153973b = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            IStatisAction cVar = this.f153972a.f153962e;
            if (cVar != null) {
                cVar.mo212749a("cancel");
            }
        }
    }

    public AudioRouteHelper(C61303k kVar, MeetingAudioManager meetingAudioManager, IRouteAction bVar) {
        MeetingAudioManager.AudioType audioType;
        C61303k kVar2;
        boolean z;
        this.f153967l = kVar;
        this.f153968m = meetingAudioManager;
        this.f153969n = bVar;
        String str = f153956f;
        StringBuilder sb = new StringBuilder();
        Companion aVar = f153957g;
        sb.append(aVar.mo212745b());
        sb.append(", init: ");
        MeetingAudioManager meetingAudioManager2 = this.f153968m;
        MeetingAudioManager.AudioType audioType2 = null;
        if (meetingAudioManager2 != null) {
            audioType = meetingAudioManager2.mo212720y();
        } else {
            audioType = null;
        }
        sb.append(audioType);
        sb.append(", ");
        sb.append(this.f153968m);
        C60700b.m235851b(str, "[init]", sb.toString());
        MeetingAudioManager meetingAudioManager3 = this.f153968m;
        if (meetingAudioManager3 != null) {
            meetingAudioManager3.mo212685a(this);
        }
        if (aVar.mo212745b() && (kVar2 = this.f153967l) != null) {
            MeetingAudioManager meetingAudioManager4 = this.f153968m;
            if ((meetingAudioManager4 != null ? meetingAudioManager4.mo212720y() : audioType2) != MeetingAudioManager.AudioType.Default || !kVar2.mo212092J().mo212510G()) {
                z = false;
            } else {
                z = true;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("setPlaybackDigitalMute: ");
            sb2.append(z);
            sb2.append(" isOffHook: ");
            AbstractC62782a af = kVar2.af();
            Intrinsics.checkExpressionValueIsNotNull(af, "it.telephoneControl");
            sb2.append(af.mo216825c());
            C60700b.m235851b(str, "[init2]", sb2.toString());
            mo212742c(z);
        }
    }

    @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
    public void onAudioStateChanged(MeetingAudioManager.AudioType audioType, boolean z, boolean z2) {
        MeetingAudioManager.AudioType audioType2;
        MeetingAudioManager.AudioType audioType3;
        Boolean bool;
        if (this.f153964i) {
            MeetingAudioManager meetingAudioManager = this.f153968m;
            if (meetingAudioManager != null) {
                audioType2 = meetingAudioManager.mo212720y();
            } else {
                audioType2 = null;
            }
            if (audioType2 != MeetingAudioManager.AudioType.Default) {
                String str = f153956f;
                StringBuilder sb = new StringBuilder();
                sb.append("lastType: ");
                sb.append(audioType);
                sb.append(", type: ");
                MeetingAudioManager meetingAudioManager2 = this.f153968m;
                if (meetingAudioManager2 != null) {
                    audioType3 = meetingAudioManager2.mo212720y();
                } else {
                    audioType3 = null;
                }
                sb.append(audioType3);
                sb.append(", lastOutSpeaker: ");
                sb.append(z);
                sb.append(", outSpeaker: ");
                MeetingAudioManager meetingAudioManager3 = this.f153968m;
                if (meetingAudioManager3 != null) {
                    bool = Boolean.valueOf(meetingAudioManager3.mo212721z());
                } else {
                    bool = null;
                }
                sb.append(bool);
                sb.append(", playbackDigitalMute: ");
                sb.append(this.f153964i);
                C60700b.m235851b(str, "[onAudioStateChanged]", sb.toString());
                mo212742c(false);
            }
        }
        UDDialog uDDialog = this.f153966k;
        if (uDDialog != null) {
            if (uDDialog.isShowing()) {
                uDDialog.dismiss();
                IStatisAction cVar = this.f153962e;
                if (cVar != null) {
                    cVar.mo212749a("other");
                }
            }
            this.f153966k = null;
        }
    }
}
