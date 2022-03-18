package com.ss.android.lark.phone.statistics;

import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/phone/statistics/PhoneHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_phone_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.phone.b.b */
public final class PhoneHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f127860a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static void m199165a() {
        f127860a.mo176955h();
    }

    @JvmStatic
    /* renamed from: a */
    public static void m199166a(int i) {
        f127860a.mo176954a(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\b\u0010\u0007\u001a\u00020\u0004H\u0017J\b\u0010\b\u001a\u00020\u0004H\u0017J\b\u0010\t\u001a\u00020\u0004H\u0017J\b\u0010\n\u001a\u00020\u0004H\u0017J\b\u0010\u000b\u001a\u00020\u0004H\u0017J\b\u0010\f\u001a\u00020\u0004H\u0017J\b\u0010\r\u001a\u00020\u0004H\u0017J\b\u0010\u000e\u001a\u00020\u0004H\u0017J\b\u0010\u000f\u001a\u00020\u0004H\u0017¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/phone/statistics/PhoneHitPoint$Companion;", "Lcom/ss/android/lark/phone/statistics/IPhoneHitPoint;", "()V", "sendMeetingIDRecognizeClick", "", "which", "", "sendMeetingIDRecognizeView", "sendOnClickCall", "sendOnClickCancel", "sendOnClickPhone", "sendOnClickVideo", "sendOnClickVoice", "sendOnClickVoip", "sendVideoBlock", "sendVoiceBlock", "im_phone_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.phone.b.b$a */
    public static final class Companion implements IPhoneHitPoint {
        private Companion() {
        }

        @Override // com.ss.android.lark.phone.statistics.IPhoneHitPoint
        @JvmStatic
        /* renamed from: g */
        public void mo176953g() {
            Statistics.sendEvent("chat_voicecalls_blocked");
        }

        @Override // com.ss.android.lark.phone.statistics.IPhoneHitPoint
        @JvmStatic
        /* renamed from: a */
        public void mo176947a() {
            Statistics.sendEvent("chat_call_click", new JSONObject().put("from", "chat"));
        }

        @Override // com.ss.android.lark.phone.statistics.IPhoneHitPoint
        @JvmStatic
        /* renamed from: b */
        public void mo176948b() {
            Statistics.sendEvent("chat_call_phone_click", new JSONObject().put("from", "chat"));
        }

        @Override // com.ss.android.lark.phone.statistics.IPhoneHitPoint
        @JvmStatic
        /* renamed from: c */
        public void mo176949c() {
            Statistics.sendEvent("chat_call_voice_click", new JSONObject().put("from", "chat"));
        }

        @Override // com.ss.android.lark.phone.statistics.IPhoneHitPoint
        @JvmStatic
        /* renamed from: d */
        public void mo176950d() {
            Statistics.sendEvent("chat_call_voip_click", new JSONObject().put("from", "chat"));
        }

        @Override // com.ss.android.lark.phone.statistics.IPhoneHitPoint
        @JvmStatic
        /* renamed from: e */
        public void mo176951e() {
            Statistics.sendEvent("chat_call_video_click", new JSONObject().put("from", "chat"));
        }

        @Override // com.ss.android.lark.phone.statistics.IPhoneHitPoint
        @JvmStatic
        /* renamed from: f */
        public void mo176952f() {
            Statistics.sendEvent("chat_call_cancel_click", new JSONObject().put("from", "chat"));
        }

        @JvmStatic
        /* renamed from: h */
        public void mo176955h() {
            Map<String, Object> b = ChatParamUtils.m133148b();
            if (b != null) {
                Statistics.sendEvent("im_chat_meeting_id_recognize_view", new JSONObject(b));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public void mo176954a(int i) {
            String str;
            String str2;
            Map<String, Object> b = ChatParamUtils.m133148b();
            if (b != null) {
                if (i == 0) {
                    str = "join_meeting";
                } else if (i == 1) {
                    str = "call";
                } else if (i != 2) {
                    str = "cancel";
                } else {
                    str = "copy";
                }
                if (i == 0) {
                    str2 = "vc_meeting_pre_view";
                } else if (i != 1) {
                    str2 = "im_chat_main_view";
                } else {
                    str2 = "none";
                }
                Statistics.sendEvent("im_chat_meeting_id_recognize_click", new JSONObject(b).put("click", str).put("target", str2));
            }
        }
    }
}
