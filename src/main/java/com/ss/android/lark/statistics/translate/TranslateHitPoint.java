package com.ss.android.lark.statistics.translate;

import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.vesdk.C64034n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/statistics/translate/TranslateHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.statistics.x.a */
public final class TranslateHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f135913a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J0\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\u0012\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0016J&\u0010\u0019\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\nH\u0016J \u0010\"\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010#\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J \u0010&\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020!H\u0016J\u0018\u0010*\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010+\u001a\u00020\u0004H\u0016J\b\u0010,\u001a\u00020\u0004H\u0016¨\u0006-"}, d2 = {"Lcom/ss/android/lark/statistics/translate/TranslateHitPoint$Companion;", "Lcom/ss/android/lark/statistics/translate/ITranslateHitPoint;", "()V", "sendCheckSuggestTranslation", "", "statusEnabled", "", "sendClickDataPolicy", "sendClickMsgTranslationFeedback", "msgType", "", "msgId", "srcLang", "tgtLang", "sendClickOutsideExitMobile", "sendCloseTranslationFeedback", "ifRate", "ifSuggest", "ifEdit", "sendEditSuggestTranslation", "sendGetTranslateSettingErrorEvent", "error_message", "sendManualTranslateAudioMsg", "sendMessageAutoTranslateEvent", "result", "sendMessageTranslate", "messageId", "chatType", "messageType", "sendMessageUnTranslateEvent", "isManualTranslate", "sendSetTranslateSettingErrorEvent", "setting_type", "", "sendTranslateErrorEvent", "error_count", "sendTranslateTextChooseLanguage", "sendTranslateTextMenuClicked", "sendTranslateTimeOutEvent", "callback_time", "", "translate_count", "sendTranslationFeedback", "sendUndoTranslateAudioMsgByToggleASR", "sendUndoTranslateAudioMsgByUndoTranslate", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.x.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public void mo187758a() {
            Statistics.sendEvent("manually_translate_asr_message");
        }

        /* renamed from: b */
        public void mo187766b() {
            Statistics.sendEvent("untranslate_asr_message_by_undo_asr");
        }

        /* renamed from: c */
        public void mo187768c() {
            Statistics.sendEvent("untranslate_asr_message_by_undo_translate");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public void mo187767b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "error_message");
            Statistics.sendEvent("get_translate_setting_error", new JSONObject().put("error_message", str));
        }

        /* renamed from: a */
        public void mo187760a(String str) {
            Statistics.sendEvent("message_autotranslate", new JSONObject().put("autotranslate_results", str));
        }

        /* renamed from: a */
        public void mo187759a(int i, String str) {
            Intrinsics.checkParameterIsNotNull(str, "error_message");
            Statistics.sendEvent("set_translate_setting_error", new JSONObject().put("setting_type", i).put("error_message", str));
        }

        /* renamed from: a */
        public void mo187764a(boolean z, String str) {
            String str2;
            JSONObject put = new JSONObject().put("chat_type", str);
            if (z) {
                str2 = C64034n.f161683a;
            } else {
                str2 = "y";
            }
            Statistics.sendEvent("message_untranslate", put.put("is_autotranslate", str2));
        }

        /* renamed from: a */
        public void mo187761a(String str, String str2, String str3) {
            Statistics.sendEvent("message_translate", new JSONObject().put("message_id", str).put("chat_type", str2).put("message_type", str3));
        }

        /* renamed from: a */
        public void mo187763a(boolean z, long j, int i) {
            int i2;
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            Statistics.sendEvent("translate_callback_timeout", jSONObject.put("translateType", i2).put("callback_time", j).put("translate_count", i));
        }

        /* renamed from: a */
        public void mo187765a(boolean z, String str, int i) {
            int i2;
            Intrinsics.checkParameterIsNotNull(str, "error_message");
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            Statistics.sendEvent("translate_error", jSONObject.put("translateType", i2).put("error_message", str).put("error_count", i));
        }

        /* renamed from: a */
        public void mo187762a(String str, String str2, String str3, String str4) {
            Statistics.sendEvent("click_message_translation_feedback", new JSONObject().put("message_type", MessageHitPoint.f135779d.mo187547c(str)).put("message_id", str2).put("src_language", str3).put("tgt_language", str4));
        }
    }
}
