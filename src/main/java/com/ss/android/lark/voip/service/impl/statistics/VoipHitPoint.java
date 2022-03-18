package com.ss.android.lark.voip.service.impl.statistics;

import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.p2911a.AbstractC57987d;
import com.ss.android.lark.voip.service.impl.app.C58133t;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;
import com.ss.android.lark.voip.service.impl.service.VoiceCallFeedback;
import com.ss.android.lark.voip.service.impl.util.VoIPAudioManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001c\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\rH\u0003J\u001e\u0010\u000e\u001a\u00020\u00052\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0003J@\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007J0\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\b\u0010\u001e\u001a\u00020\u0013H\u0007J\b\u0010\u001f\u001a\u00020\u0013H\u0007J \u0010 \u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001dH\u0007J \u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007J2\u0010$\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010\nH\u0007J\u0018\u0010(\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010)\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0005H\u0007J\u0018\u0010*\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007J(\u0010+\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\b\u0010-\u001a\u00020\u0013H\u0007J \u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007J \u00100\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u00101\u001a\u00020\u0013H\u0007J\b\u00102\u001a\u00020\u0013H\u0007J\u0010\u00103\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u0005H\u0007J\b\u00104\u001a\u00020\u0013H\u0007J \u00105\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u00106\u001a\u000207H\u0007J\u0018\u00108\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u00109\u001a\u00020\u0013H\u0007J:\u0010:\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\r2\u0006\u0010;\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010\nH\u0007J\u0018\u0010<\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007J\"\u0010=\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\b\u0010>\u001a\u0004\u0018\u00010?H\u0007J\u0018\u0010@\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007J(\u0010A\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007J \u0010B\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020\rH\u0007J\b\u0010D\u001a\u00020\u0013H\u0007J\b\u0010E\u001a\u00020\u0013H\u0007J \u0010F\u001a\u00020\u00132\u0006\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u00052\u0006\u0010I\u001a\u00020JH\u0007J\u0018\u0010K\u001a\u00020\u00132\u0006\u0010L\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u0005H\u0007J\b\u0010N\u001a\u00020\u0013H\u0007J.\u0010O\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020R0Q2\u0006\u0010S\u001a\u00020\rH\u0007J\u0012\u0010T\u001a\u00020\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0007J \u0010U\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u000207H\u0007J\u0018\u0010V\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010W\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010X\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010Y\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007J \u0010Z\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010[\u001a\u00020\rH\u0007J\u0018\u0010\\\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006]"}, d2 = {"Lcom/ss/android/lark/voip/service/impl/statistics/VoipHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "TAG", "", "ntpService", "Lcom/ss/android/lark/voip/dependency/IVoipModuleDependency$ISettingDependency;", "kotlin.jvm.PlatformType", "getCommonParams", "Lorg/json/JSONObject;", "id", "isCaller", "", "getFeatureGating", "featureMap", "", "getNetworkType", "sendAudioTypeChangedEvent", "", "key", "lastType", "Lcom/ss/android/lark/voip/service/impl/util/VoIPAudioManager$AudioType;", "lastIsOutSpeaker", ShareHitPoint.f121869d, "isOutSpeaker", "sendAudioTypeUnchangedEvent", "sendCalleeToCallTimeClockDuration", "duration", "", "sendChatVoipCallBack", "sendCloseClick", "sendFromJoinToRemoteAudio", "time", "sendInitHardwareStatusEvent", "isMicOn", "sendMissedCallEvent", "error", "isOnTheCall", "extras", "sendNoAudioPermission", "sendOnAccept", "sendOnCallSuccess", "sendOnCallToStream", "param", "sendOnClickVoipCallOnSecretChat", "sendOnJoinRoom", "sdkType", "sendOnJoinRoomSuccess", "sendOnMinimizeClick", "sendOnMuteClick", "sendOnReceiveVoice", "sendOnRinging", "sendOnSdkError", "errorCode", "", "sendOnShortConference", "sendOnSpeakerClick", "sendOnVoipException", "needByteRtcSP", "sendPatchOnTheCall", "sendPatchOnTheCallFailure", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "sendPatchOnTheCallSuccess", "sendPhoneCallInterruptEvent", "sendRingingDuration", "isOffline", "sendRingingPageShow", "sendShadowClick", "sendStateMachineException", "eventName", "content", "voiceCall", "Lcom/ss/android/lark/voip/service/impl/service/VoiceCall;", "sendSubmitFeedback", "tag", Comment.f24093e, "sendVoiceCallGoodClick", "sendVoiceCallPoorClick", "tags", "", "Lcom/ss/android/lark/voip/service/impl/service/VoiceCallFeedback$Tag;", "hasComment", "sendVoipCallCancel", "sendVoipCallFinish", "sendVoipCallPageRingFromPull", "sendVoipCallPageRingFromPush", "sendVoipConnection", "sendVoipHangup", "sendVoipMonitorSdk", "success", "sendVoipVcInterrupted", "voip_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.voip.service.impl.d.g */
public final class VoipHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final VoipHitPoint f143056a = new VoipHitPoint();

    /* renamed from: b */
    private static final AbstractC57987d.AbstractC57996g f143057b;

    private VoipHitPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225617a(String str, boolean z, List<? extends VoiceCallFeedback.Tag> list, boolean z2) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(list, "tags");
        JSONObject j = m225641j(str, z);
        if (j != null) {
            String str3 = "";
            for (VoiceCallFeedback.Tag tag : list) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                int number = tag.getNumber();
                if (number == VoiceCallFeedback.Tag.HUNG_UP_UNEXPECTEDLY.getNumber()) {
                    str2 = "Hung up unexpectedly";
                } else if (number == VoiceCallFeedback.Tag.NOT_CLEAR_AND_NOISY.getNumber()) {
                    str2 = "Not clear and noisy";
                } else if (number == VoiceCallFeedback.Tag.GOES_ON_AND_OFF.getNumber()) {
                    str2 = "Goes on and off";
                } else if (number == VoiceCallFeedback.Tag.CANNOT_HEAR.getNumber()) {
                    str2 = "Can't hear";
                } else {
                    str2 = "";
                }
                sb.append(str2);
                str3 = sb.toString() + ";";
            }
            if (z2) {
                str3 = str3 + "Other;";
            }
            j.put("feedback", str3);
            Log.m165379d("VoipHitPoint", "[sendVoiceCallPoorClick], params = " + j);
            Statistics.sendEvent("voip_feedback_badclick", j);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225608a(String str, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "sdkType");
        Intrinsics.checkParameterIsNotNull(str2, "id");
        JSONObject j = m225641j(str2, z);
        if (j != null) {
            j.put("sdk_type", str);
            Statistics.sendEvent("voip_join_room", j);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225609a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        JSONObject j = m225641j(str, z);
        if (j != null) {
            Log.m165379d("VoipHitPoint", "[sendNoAudioPermission] params = " + j);
            Statistics.sendEvent("voip_root_check", j);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225611a(String str, boolean z, long j) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        JSONObject j2 = m225641j(str, z);
        if (j2 != null) {
            j2.put("audio_duration", j);
            Log.m165379d("VoipHitPoint", "[sendFromJoinToRemoteAudio] params = " + j2);
            Statistics.sendEvent("voip_monitor_join_to_stream", j2);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225610a(String str, boolean z, int i) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        JSONObject j = m225641j(str, z);
        if (j != null) {
            j.put(UpdateKey.STATUS, i);
            Log.m165379d("VoipHitPoint", "[sendOnSdkError] params = " + j);
            Statistics.sendEvent("voipex_bytertc_sdk", j);
            AbstractC57987d c = C57977a.m224905c();
            Intrinsics.checkExpressionValueIsNotNull(c, "VoIpModule.getDependency()");
            if ((!C26284k.m95185a(C57977a.m224905c().getContext())) && c.isProductionEnv()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(UpdateKey.STATUS, i);
                MonitorUtils.monitorDuration("voipex_bytertc_sdk", jSONObject, new JSONObject());
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225616a(String str, boolean z, String str2, boolean z2, boolean z3, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "error");
        if (z3) {
            C57744a.m224104a().putBoolean("isBytertc", true);
        }
        JSONObject j = m225641j(str, z);
        if (j != null) {
            j.put("error_type_alarm", str2);
            j.put("on_the_call", z2);
            if (jSONObject != null) {
                j.put("extra_payload", jSONObject);
            }
            Log.m165379d("VoipHitPoint", "[sendOnVoipException] params = " + j);
            Statistics.sendEvent("voipex_call_error", j);
            AbstractC57987d c = C57977a.m224905c();
            Intrinsics.checkExpressionValueIsNotNull(c, "VoIpModule.getDependency()");
            if ((!C26284k.m95185a(C57977a.m224905c().getContext())) && c.isProductionEnv()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("error_type_alarm", str2);
                if (jSONObject != null) {
                    jSONObject2.put("extra_payload", jSONObject);
                }
                MonitorUtils.monitorDuration("voipex_call_error", jSONObject2, new JSONObject());
            }
            if (z3) {
                C57744a.m224104a().remove("isBytertc");
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225615a(String str, boolean z, String str2, boolean z2, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "error");
        JSONObject j = m225641j(str, z);
        if (j != null) {
            j.put("error_type_alarm", str2);
            j.put("on_the_call", z2);
            if (jSONObject != null) {
                j.put("extra_payload", jSONObject);
            }
            Log.m165379d("VoipHitPoint", "[sendMissedCallEvent] params = " + j);
            Statistics.sendEvent("voipex_call_error", j);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225613a(String str, boolean z, String str2, long j) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "param");
        Log.m165379d("VoipHitPoint", "[sendOnCallToStream] param = " + str2 + ", duration = " + j);
        JSONObject j2 = m225641j(str, z);
        if (j2 != null) {
            j2.put(str2, j);
            Statistics.sendEvent("voip_monitor_oncall_to_stream", j2);
            AbstractC57987d c = C57977a.m224905c();
            Intrinsics.checkExpressionValueIsNotNull(c, "VoIpModule.getDependency()");
            if ((!C26284k.m95185a(C57977a.m224905c().getContext())) && c.isProductionEnv()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str2, j);
                MonitorUtils.monitorDuration("voip_monitor_oncall_to_stream", jSONObject, new JSONObject());
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225612a(String str, boolean z, ErrorResult errorResult) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        JSONObject j = m225641j(str, z);
        if (j != null) {
            if (errorResult != null) {
                j.put("errorMsg", errorResult.getDisplayMsg());
                j.put("errorCode", errorResult.getErrorCode());
            }
            Statistics.sendEvent("voip_patch_on_the_call_failure", j);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225618a(String str, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        JSONObject j = m225641j(str, z);
        if (j != null) {
            if (!z2) {
                j.put("action_name", "join");
            } else if (z2) {
                j.put("action_name", "join_success");
            }
            Statistics.sendEvent("voip_monitor_sdk", j);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225614a(String str, boolean z, String str2, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "id");
        JSONObject j = m225641j(str2, z2);
        if (j != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_source", z ? "onthecall_page" : "calling_page");
            j.put("extend_value", jSONObject);
            Statistics.sendEvent(str, j);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225619a(boolean z, String str, boolean z2) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "id");
        JSONObject j = m225641j(str, z2);
        if (j != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mic", z ? "unmute" : "mute");
            jSONObject.put("camera", "mute");
            VoIPAudioManager a = VoIPAudioManager.m225760a();
            Intrinsics.checkExpressionValueIsNotNull(a, "VoIPAudioManager.getInstance()");
            if (a.mo197192g()) {
                str2 = "speaker";
            } else {
                VoIPAudioManager a2 = VoIPAudioManager.m225760a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "VoIPAudioManager.getInstance()");
                VoIPAudioManager.AudioType f = a2.mo197191f();
                if (f != null) {
                    int i = C58153h.f143059b[f.ordinal()];
                    if (i == 1) {
                        str2 = "earpiece";
                    } else if (i == 2) {
                        str2 = "bluetooth";
                    } else if (i == 3) {
                        str2 = "headphone";
                    }
                }
                throw new NoWhenBranchMatchedException();
            }
            jSONObject.put("audio_output", str2);
            j.put("action_name", "hardware_status");
            j.put("extend_value", jSONObject);
            Statistics.sendEvent("voip_call_page_onthecall", j);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225601a() {
        Statistics.sendEvent("voip_feedback_goodclick");
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m225628d() {
        Statistics.sendEvent("voip_minimize_click");
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m225630e() {
        Statistics.sendEvent("voip_mute_click");
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m225632f() {
        Statistics.sendEvent("voip_speaker_click");
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m225636h() {
        JSONObject j = m225641j(null, true);
        if (j != null) {
            Statistics.sendEvent("chat_call_voip_callback", j);
        }
    }

    static {
        AbstractC57987d c = C57977a.m224905c();
        Intrinsics.checkExpressionValueIsNotNull(c, "VoIpModule.getDependency()");
        f143057b = c.getSettingDependency();
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m225620b() {
        Statistics.sendEvent("voip_feedback_exit", new JSONObject().put("exit_type", "clickbtn"));
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m225625c() {
        Statistics.sendEvent("voip_feedback_exit", new JSONObject().put("exit_type", "clickshadow"));
    }

    @JvmStatic
    /* renamed from: i */
    public static final void m225638i() {
        Statistics.sendEvent("voip_call_click", new JSONObject().put("action_name", "encryption_chat"));
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m225634g() {
        JSONObject j = m225641j("", false);
        if (j != null) {
            j.put("action_name", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            Log.m165379d("VoipHitPoint", "[sendRingingPageShow] params = " + j);
            Statistics.sendEvent("voip_page_ringing", j);
        }
    }

    @JvmStatic
    /* renamed from: j */
    private static final String m225640j() {
        NetworkUtils.NetworkType networkType = NetworkUtils.getNetworkType(C57977a.m224905c().getContext());
        if (networkType != null) {
            int i = C58153h.f143058a[networkType.ordinal()];
            if (i == 1) {
                return "wifi";
            }
            if (i == 2) {
                return "2g";
            }
            if (i == 3) {
                return "3g";
            }
            if (i != 4) {
                return "others";
            }
            return "4g";
        }
        return "others";
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m225626c(String str) {
        JSONObject j = m225641j(str, true);
        if (j != null) {
            Statistics.sendEvent("voip_call_cancel", j);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225602a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "sdkType");
        Log.m165379d("VoipHitPoint", "[sendOnReceiveVoice] ");
        Statistics.sendEvent("voip_receive_voice", new JSONObject().put("sdk_type", str));
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m225621b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        JSONObject j = m225641j(str, false);
        if (j != null) {
            Log.m165379d("VoipHitPoint", "[sendOnAccept] params = " + j);
            Statistics.sendEvent("voip_call_accept", j);
        }
    }

    /* renamed from: a */
    private final String m225600a(Map<String, Boolean> map) {
        boolean z;
        String str;
        StringBuilder sb = new StringBuilder();
        if (map != null && (!map.isEmpty())) {
            Iterator<Map.Entry<String, Boolean>> it = map.entrySet().iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Boolean> next = it.next();
                if (next != null) {
                    str = next.getKey();
                } else {
                    str = null;
                }
                if (!(str == null || next.getValue() == null || !StringsKt.startsWith$default(next.getKey(), "byteview", false, 2, (Object) null))) {
                    sb.append(next.getKey());
                    sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb.append(next.getValue().booleanValue());
                    sb.append(ContainerUtils.FIELD_DELIMITER);
                }
            }
            if (sb.length() > 0) {
                z = true;
            }
            if (z) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "builder.toString()");
        return sb2;
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m225631e(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        JSONObject j = m225641j(str, z);
        if (j != null) {
            Statistics.sendEvent("voip_patch_on_the_call", j);
        }
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m225633f(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        JSONObject j = m225641j(str, z);
        if (j != null) {
            Statistics.sendEvent("voip_patch_on_the_call_success", j);
        }
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m225635g(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        JSONObject j = m225641j(str, z);
        if (j != null) {
            j.put("action_name", "ringing");
            j.put("from_source", "ws");
            Statistics.sendEvent("voip_call_page_ringing", j);
        }
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m225637h(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        JSONObject j = m225641j(str, z);
        if (j != null) {
            j.put("action_name", "ringing");
            j.put("from_source", "pull");
            Statistics.sendEvent("voip_call_page_ringing", j);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225603a(String str, long j) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        JSONObject j2 = m225641j(str, true);
        if (j2 != null) {
            j2.put("client_duration", j);
            Log.m165383e("VoipHitPoint", "[sendCalleeToCallTimeClockDuration] params= " + j2);
            Statistics.sendEvent("voip_call_oncallLoading", j2);
        }
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m225629d(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        JSONObject j = m225641j(str, z);
        if (j != null) {
            Log.m165383e("VoipHitPoint", "[sendVoipHangup] params= " + j);
            Statistics.sendEvent("voip_call_hangup", j);
        }
    }

    @JvmStatic
    /* renamed from: i */
    public static final void m225639i(String str, boolean z) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "id");
        JSONObject put = new JSONObject().put("conference_id", str);
        if (z) {
            str2 = "caller";
        } else {
            str2 = "callee";
        }
        Statistics.sendEvent("vc_voip_interrupted", put.put("user_type", str2));
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m225627c(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        JSONObject j = m225641j(str, z);
        if (j != null) {
            Log.m165379d("VoipHitPoint", "[sendOnShortConference] params = " + j);
            Statistics.sendEvent("voipex_short_conference", j);
            AbstractC57987d c = C57977a.m224905c();
            Intrinsics.checkExpressionValueIsNotNull(c, "VoIpModule.getDependency()");
            if ((!C26284k.m95185a(C57977a.m224905c().getContext())) && c.isProductionEnv()) {
                MonitorUtils.monitorDuration("voipex_short_conference", new JSONObject(), new JSONObject());
            }
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m225623b(String str, boolean z) {
        JSONObject j;
        Intrinsics.checkParameterIsNotNull(str, "id");
        if (z && (j = m225641j(str, true)) != null) {
            Log.m165379d("VoipHitPoint", "[sendOnCallSuccess] params = " + j);
            Statistics.sendEvent("voip_call_success", j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004e, code lost:
        if (r0.isPreReleaseenv() != false) goto L_0x0050;
     */
    @kotlin.jvm.JvmStatic
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final org.json.JSONObject m225641j(java.lang.String r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.voip.service.impl.statistics.VoipHitPoint.m225641j(java.lang.String, boolean):org.json.JSONObject");
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225604a(String str, long j, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        JSONObject j2 = m225641j(str, false);
        if (j2 != null) {
            j2.put("client_duration", j);
            j2.put("is_offline", z ? 1 : 0);
            Log.m165383e("VoipHitPoint", "[sendRingingDuration] params= " + j2);
            Statistics.sendEvent("voip_call_receiveduration", j2);
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m225622b(String str, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "sdkType");
        Intrinsics.checkParameterIsNotNull(str2, "id");
        JSONObject j = m225641j(str2, z);
        if (j != null) {
            j.put("sdk_type", str);
            Statistics.sendEvent("voip_join_room_success", j);
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m225624b(String str, boolean z, int i) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        JSONObject j = m225641j(str, z);
        if (j != null) {
            j.put("voip_finish_type", i);
            Log.m165383e("VoipHitPoint", "[sendVoipCallFinish] params= " + j);
            Statistics.sendEvent("voip_call_finish", j);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225607a(String str, String str2, VoiceCall voiceCall) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        Intrinsics.checkParameterIsNotNull(str2, "content");
        Intrinsics.checkParameterIsNotNull(voiceCall, "voiceCall");
        JSONObject j = m225641j(voiceCall.getId(), C58133t.m225480a(voiceCall));
        if (j != null) {
            j.put("route_alarm", str2);
            Statistics.sendEvent(str, j);
            if (!C26284k.m95185a(C57977a.m224905c().getContext())) {
                AbstractC57987d c = C57977a.m224905c();
                Intrinsics.checkExpressionValueIsNotNull(c, "VoIpModule.getDependency()");
                if (c.isProductionEnv()) {
                    MonitorUtils.monitorDuration(str, j, m225641j(voiceCall.getId(), C58133t.m225480a(voiceCall)));
                }
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225606a(String str, VoIPAudioManager.AudioType audioType, boolean z, String str2, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(audioType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(str2, "id");
        JSONObject j = m225641j(str2, z2);
        if (j != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_voice_source", VoIPAudioManager.m225761a(audioType, z));
            jSONObject.put("after_voice_source", 0);
            j.put("action_name", "voice_source_unchanged");
            j.put("extend_value", jSONObject);
            Statistics.sendEvent(str, j);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m225605a(String str, VoIPAudioManager.AudioType audioType, boolean z, VoIPAudioManager.AudioType audioType2, boolean z2, String str2, boolean z3) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(audioType, "lastType");
        Intrinsics.checkParameterIsNotNull(audioType2, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(str2, "id");
        JSONObject j = m225641j(str2, z3);
        if (j != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_voice_source", VoIPAudioManager.m225761a(audioType, z));
            jSONObject.put("after_voice_source", VoIPAudioManager.m225761a(audioType2, z2));
            j.put("action_name", "voice_source_changed");
            j.put("extend_value", jSONObject);
            Statistics.sendEvent(str, j);
        }
    }
}
