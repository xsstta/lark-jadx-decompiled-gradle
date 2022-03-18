package com.ss.android.lark.ai.statistics.smartcompose;

import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ai/statistics/smartcompose/SmartComposeHitpoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ai.d.c.a */
public final class SmartComposeHitpoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f71690a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006JF\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006J6\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006J>\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/ai/statistics/smartcompose/SmartComposeHitpoint$Companion;", "", "()V", "sendSmartComposeCancel", "", "chatId", "", "id", "language", "editor", "vid", "", "convoType", "sendSmartComposeComplete", "completeChars", "gesture", "sendSmartComposeOverwrite", "sendSmartComposeShow", "totalChars", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.d.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final void mo101596b(String str, String str2, String str3, String str4, int i, String str5) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(str2, "id");
            Intrinsics.checkParameterIsNotNull(str3, "language");
            Intrinsics.checkParameterIsNotNull(str4, "editor");
            Intrinsics.checkParameterIsNotNull(str5, "convoType");
            Statistics.sendEvent("suite_ai_composer_cancel", new JSONObject().put("chat_id", str).put("id", str2).put("language", str3).put("editor", str4).put("vid", i).put("convo_type", str5));
        }

        /* renamed from: a */
        public final void mo101595a(String str, String str2, String str3, String str4, int i, String str5) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(str2, "id");
            Intrinsics.checkParameterIsNotNull(str3, "language");
            Intrinsics.checkParameterIsNotNull(str4, "editor");
            Intrinsics.checkParameterIsNotNull(str5, "convoType");
            Statistics.sendEvent("suite_ai_composer_overwrite", new JSONObject().put("chat_id", str).put("id", str2).put("language", str3).put("editor", str4).put("vid", i).put("convo_type", str5));
        }

        /* renamed from: a */
        public final void mo101593a(String str, String str2, int i, String str3, String str4, int i2, String str5) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(str2, "id");
            Intrinsics.checkParameterIsNotNull(str3, "language");
            Intrinsics.checkParameterIsNotNull(str4, "editor");
            Intrinsics.checkParameterIsNotNull(str5, "convoType");
            Statistics.sendEvent("suite_ai_composer_view", new JSONObject().put("chat_id", str).put("id", str2).put("total_chars", i).put("language", str3).put("editor", str4).put("vid", i2).put("convo_type", str5));
        }

        /* renamed from: a */
        public final void mo101594a(String str, String str2, int i, String str3, String str4, int i2, String str5, String str6) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(str2, "id");
            Intrinsics.checkParameterIsNotNull(str3, "language");
            Intrinsics.checkParameterIsNotNull(str4, "editor");
            Intrinsics.checkParameterIsNotNull(str5, "convoType");
            Intrinsics.checkParameterIsNotNull(str6, "gesture");
            Statistics.sendEvent("suite_ai_composer_complete", new JSONObject().put("chat_id", str).put("id", str2).put("completed_chars", i).put("language", str3).put("editor", str4).put("vid", i2).put("convo_type", str5).put("gesture", str6));
        }
    }
}
