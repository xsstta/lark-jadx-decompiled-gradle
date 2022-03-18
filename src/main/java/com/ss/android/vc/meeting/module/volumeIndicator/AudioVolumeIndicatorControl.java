package com.ss.android.vc.meeting.module.volumeIndicator;

import com.alibaba.fastjson.JSON;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.irtc.RtcAudioVolumeInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61420b;
import com.ss.android.vc.meeting.module.sharebox.AbstractC63022a;
import com.ss.android.vc.net.service.VCSettingsService;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.statistics.event.C63742at;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u0004\u0018\u00010\tJ\n\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002J\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/vc/meeting/module/volumeIndicator/AudioVolumeIndicatorControl;", "Lcom/ss/android/vc/meeting/module/base/BaseControl;", "Lcom/ss/android/vc/meeting/module/volumeIndicator/IVolumeIndicatorCallback;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "(Lcom/ss/android/vc/meeting/framework/meeting/Meeting;)V", "DEFAULT_VC_MUTE_PROMT_SETTINGS", "", "vcMutePromptConfig", "Lcom/ss/android/vc/meeting/module/volumeIndicator/AudioVolumeBean;", "getAudioVolumeBean", "getVcMutePromptConfig", "isEnableFg", "", "onLocalAudioVolumeIndication", "", "rtcAudioVolumeInfo", "Lcom/ss/android/vc/irtc/RtcAudioVolumeInfo;", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.volumeIndicator.a */
public final class AudioVolumeIndicatorControl extends AbstractC61420b {

    /* renamed from: a */
    public static final Companion f160304a = new Companion(null);

    /* renamed from: d */
    private static final String f160305d = AudioVolumeIndicatorControl.class.getSimpleName();

    /* renamed from: b */
    private AudioVolumeBean f160306b;

    /* renamed from: c */
    private final String f160307c = "{\n\t\"interval\": 400,\n\t\"level\": -20\n}";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/vc/meeting/module/volumeIndicator/AudioVolumeIndicatorControl$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.volumeIndicator.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final AudioVolumeBean mo219555b() {
        return this.f160306b;
    }

    /* renamed from: a */
    public final boolean mo219554a() {
        if (C63634c.m249496b("byteview.meeting.android.mute_prompt")) {
            C61303k meeting = getMeeting();
            Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
            AbstractC63022a ak = meeting.ak();
            Intrinsics.checkExpressionValueIsNotNull(ak, "meeting.shareBoxControl");
            if (!ak.mo217756b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final AudioVolumeBean m248674c() {
        AudioVolumeBean audioVolumeBean = this.f160306b;
        if (audioVolumeBean != null) {
            return audioVolumeBean;
        }
        String settings = VCSettingsService.getSettings("vc_mute_prompt_config");
        if (settings == null) {
            settings = this.f160307c;
        }
        try {
            String str = f160305d + "MutePromptConfig";
            StringBuilder sb = new StringBuilder();
            sb.append("settings = ");
            if (settings == null) {
                Intrinsics.throwNpe();
            }
            sb.append(settings);
            C60700b.m235851b(str, "[getVcMutePromptConfig]", sb.toString());
            AudioVolumeBean audioVolumeBean2 = (AudioVolumeBean) JSON.parseObject(settings, AudioVolumeBean.class);
            if (audioVolumeBean2 == null) {
                audioVolumeBean2 = (AudioVolumeBean) JSON.parseObject(this.f160307c, AudioVolumeBean.class);
            }
            this.f160306b = audioVolumeBean2;
        } catch (Exception e) {
            C60700b.m235864f(f160305d + "MutePromptConfig", "[getVcMutePromptConfig2]", e.getMessage());
            if (this.f160306b == null) {
                this.f160306b = (AudioVolumeBean) JSON.parseObject(this.f160307c, AudioVolumeBean.class);
            }
        }
        return this.f160306b;
    }

    /* renamed from: a */
    public void mo219553a(RtcAudioVolumeInfo rtcAudioVolumeInfo) {
        Intrinsics.checkParameterIsNotNull(rtcAudioVolumeInfo, "rtcAudioVolumeInfo");
        String str = f160305d;
        C60700b.m235851b(str, "[onLocalAudioVolumeIndication]", "smoothVolume= " + rtcAudioVolumeInfo.f152889c);
        C60738ac.m236032b((int) R.string.View_G_MutedTurnOnToSpeak);
        C61303k meeting = getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "meeting");
        C63742at.m250057a(meeting.mo212056e(), rtcAudioVolumeInfo.f152889c);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioVolumeIndicatorControl(C61303k kVar) {
        super(kVar);
        Integer num;
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        m248674c();
        if (this.f160306b != null) {
            String str = f160305d;
            StringBuilder sb = new StringBuilder();
            sb.append("internal=");
            AudioVolumeBean audioVolumeBean = this.f160306b;
            Integer num2 = null;
            if (audioVolumeBean != null) {
                num = Integer.valueOf(audioVolumeBean.getInterval());
            } else {
                num = null;
            }
            sb.append(num);
            sb.append(" level= ");
            AudioVolumeBean audioVolumeBean2 = this.f160306b;
            sb.append(audioVolumeBean2 != null ? Integer.valueOf(audioVolumeBean2.getLevel()) : num2);
            C60700b.m235851b(str, "[init]", sb.toString());
        }
    }
}
