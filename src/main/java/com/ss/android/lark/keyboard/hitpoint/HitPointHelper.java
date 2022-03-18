package com.ss.android.lark.keyboard.hitpoint;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.vesdk.C64034n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/keyboard/hitpoint/HitPointHelper;", "", "()V", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.hitpoint.a */
public final class HitPointHelper {

    /* renamed from: a */
    public static int f103321a = 1;

    /* renamed from: b */
    public static final Companion f103322b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000fJ\u0010\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u000fH\u0002J\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u000fJ\u000e\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u0004J\u0006\u0010'\u001a\u00020\u001bJ\u0016\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u0004J\u0016\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u001dJ\u000e\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u001dJ\u0006\u0010/\u001a\u00020\u001bJ\u0006\u00100\u001a\u00020\u001bJ\u000e\u00101\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u0004J\u0006\u00102\u001a\u00020\u001bJ\u000e\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u0004J\u0006\u00105\u001a\u00020\u001bJ\u000e\u00106\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/ss/android/lark/keyboard/hitpoint/HitPointHelper$Companion;", "", "()V", "ACTION_FROM_BUTTON", "", "ACTION_FROM_MENU", "AUDIO2TEXT_ACTION", "AUDIO2TEXT_CHINESE", "AUDIO2TEXT_EDITED", "AUDIO2TEXT_ENGLISH", "AUDIO2TEXT_RESULT", "AUDIOANDTEXT_LOCATION", "CHAT_ID", "CHAT_TYPE", "DEFAULT_INDEX_POSITION", "", "N", "PANEL_AUDIO_ONLY", "PANEL_AUDIO_WITH_TEXT", "STICKER_ID", "STICKER_SET_ID", "STICKER_SET_MANAGER_ENTRY", "TIMER_PRE_SELECTION", "TIMER_SELECTED", "Y", "currentPagerViewPosition", "adjustSecretTimer", "", "isGroup", "", "preBurnTime", "afterBurnTime", "getBurnName", "burnTime", "secretTimerClick", "sendAtSomeBody", "atCount", "sendAudioAndText", "entrance", "sendAudioOnly", "sendRecord2TextClick", "recognized", "sendRecord2TextLanguageChange", "action", "audioWithText", "sendRecord2TextSend", "edited", "sendRecordCanceled", "sendRecordClick", "sendRecordLongPressed", "sendStickerAdd", "sendStickerSetManager", "location", "sendStickerSetStoreClick", "setCurrentPagerViewPosition", "position", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.hitpoint.a$a */
    public static final class Companion {
        /* renamed from: b */
        private final String m160857b(int i) {
            return i != 60 ? i != 3600 ? i != 86400 ? i != 604800 ? "un_know" : "one_week" : "one_day" : "one_hour" : "one_min";
        }

        private Companion() {
        }

        /* renamed from: a */
        public final void mo146874a() {
            Statistics.sendEvent("sticker_add");
        }

        /* renamed from: b */
        public final void mo146881b() {
            Statistics.sendEvent("audio_record_click");
        }

        /* renamed from: c */
        public final void mo146884c() {
            Statistics.sendEvent("select_send_audio_only");
        }

        /* renamed from: d */
        public final void mo146886d() {
            Statistics.sendEvent("audio_record_cancel");
        }

        /* renamed from: e */
        public final void mo146887e() {
            Statistics.sendEvent("stickerpack_store_click");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo146875a(int i) {
            try {
                Statistics.sendEvent("message_at", new JSONObject().put("at_count", i));
            } catch (Throwable th) {
                Log.m165382e(th.getMessage());
            }
        }

        /* renamed from: b */
        public final void mo146882b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "entrance");
            Statistics.sendEvent("send_audio_and_text", new JSONObject().put("location", str));
        }

        /* renamed from: c */
        public final void mo146885c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "location");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("stickerpack_manage_location", str);
                Statistics.sendEvent("stickerpack_manage", jSONObject);
            } catch (Throwable th) {
                Log.m165382e(th.getMessage());
            }
        }

        /* renamed from: a */
        public final void mo146876a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "entrance");
            Statistics.sendEvent("audio_record_long_press", new JSONObject().put("location", str));
        }

        /* renamed from: b */
        public final void mo146883b(boolean z) {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                if (z) {
                    str = "group_secret";
                } else {
                    str = "single_secret";
                }
                jSONObject.put("chat_type", str);
                Statistics.sendEvent("timer_click", jSONObject);
            } catch (Throwable th) {
                Log.m165382e(th.getMessage());
            }
        }

        /* renamed from: a */
        public final void mo146878a(boolean z) {
            String str;
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = "y";
            } else {
                str = C64034n.f161683a;
            }
            Statistics.sendEvent("send_speech_to_text_message", jSONObject.put("is_edit", str));
        }

        /* renamed from: a */
        public final void mo146877a(String str, boolean z) {
            String str2;
            Intrinsics.checkParameterIsNotNull(str, "action");
            JSONObject put = new JSONObject().put("action", str);
            if (z) {
                str2 = "audio_and_text";
            } else {
                str2 = "audio_only";
            }
            Statistics.sendEvent("set_audio_to_text_language", put.put("location", str2));
        }

        /* renamed from: a */
        public final void mo146880a(boolean z, String str) {
            String str2;
            Intrinsics.checkParameterIsNotNull(str, "entrance");
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str2 = "y";
            } else {
                str2 = C64034n.f161683a;
            }
            Statistics.sendEvent("speech_to_text", jSONObject.put("result", str2).put("location", str));
        }

        /* renamed from: a */
        public final void mo146879a(boolean z, int i, int i2) {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                if (z) {
                    str = "group_secret";
                } else {
                    str = "single_secret";
                }
                jSONObject.put("chat_type", str);
                jSONObject.put("timer_pre_selection", m160857b(i));
                jSONObject.put("timer_selected", m160857b(i2));
                Statistics.sendEvent("timer_adjusted", jSONObject);
            } catch (Throwable th) {
                Log.m165382e(th.getMessage());
            }
        }
    }
}
