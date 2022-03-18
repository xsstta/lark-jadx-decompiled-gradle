package com.ss.android.lark.ai.statistics.translate;

import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ai/statistics/translate/TranslateHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ai.d.e.b */
public final class TranslateHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static Map<String, String> f71691a;

    /* renamed from: b */
    public static final Companion f71692b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J0\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J \u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\u0018\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/ai/statistics/translate/TranslateHitPoint$Companion;", "Lcom/ss/android/lark/ai/statistics/translate/ITranslateHitPoint;", "()V", "MESSAGE_TYPE_TRANSFER", "", "", "getMessageTypeHitItem", "key", "sendCheckSuggestTranslation", "", "statusEnabled", "", "sendClickDataPolicy", "sendClickMsgTranslationFeedback", "msgType", "msgId", "srcLang", "tgtLang", "sendClickOutsideExitMobile", "sendCloseTranslationFeedback", "ifRate", "ifSuggest", "ifEdit", "sendEditSuggestTranslation", "sendTranslationFeedback", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.d.e.b$a */
    public static final class Companion implements ITranslateHitPoint {
        private Companion() {
        }

        @Override // com.ss.android.lark.ai.statistics.translate.ITranslateHitPoint
        /* renamed from: a */
        public void mo101600a() {
            Statistics.sendEvent("click_data_policy");
        }

        @Override // com.ss.android.lark.ai.statistics.translate.ITranslateHitPoint
        /* renamed from: b */
        public void mo101603b() {
            Statistics.sendEvent("edit_suggest_translation");
        }

        @Override // com.ss.android.lark.ai.statistics.translate.ITranslateHitPoint
        /* renamed from: c */
        public void mo101604c() {
            Statistics.sendEvent("click_outside_exit_mobile");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.ss.android.lark.ai.statistics.translate.ITranslateHitPoint
        /* renamed from: a */
        public void mo101601a(boolean z, boolean z2) {
            Statistics.sendEvent("send_translation_feedback", new JSONObject().put("if_suggest", z ? 1 : 0).put("if_edit", z2 ? 1 : 0));
        }

        @Override // com.ss.android.lark.ai.statistics.translate.ITranslateHitPoint
        /* renamed from: a */
        public void mo101602a(boolean z, boolean z2, boolean z3) {
            Statistics.sendEvent("close_translation_feedback", new JSONObject().put("if_rage", z ? 1 : 0).put("if_suggest", z2 ? 1 : 0).put("if_edit", z3 ? 1 : 0));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f71691a = hashMap;
        hashMap.put("POST", "richtext");
        f71691a.put("FILE", "file");
        f71691a.put("TEXT", "text");
        f71691a.put("IMAGE", "image");
        f71691a.put("AUDIO", "voice");
        f71691a.put("TEXT_IMAGE", "text_image");
        f71691a.put("SYSTEM", "system");
        f71691a.put("EMAIL", "mail");
        f71691a.put("SHARE_GROUP_CHAT", "share_group_chat");
        f71691a.put("STICKER", "sticker");
        f71691a.put("SHARE_USER_CARD", "share_user_card");
    }
}
