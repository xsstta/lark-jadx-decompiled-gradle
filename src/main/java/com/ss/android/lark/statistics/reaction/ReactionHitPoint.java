package com.ss.android.lark.statistics.reaction;

import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/statistics/reaction/ReactionHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.statistics.r.b */
public final class ReactionHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static String f135901a;

    /* renamed from: b */
    public static String f135902b;

    /* renamed from: c */
    public static final Companion f135903c = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J \u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\bJ6\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011J\u0016\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/statistics/reaction/ReactionHitPoint$Companion;", "", "()V", "REACTION_SDK_SPAN", "", "mReactionTraceKey", "mReactionTraceMessageId", "endReaction", "", "messageId", "endReactionCoastSpan", "key", "span", "errorReaction", "errorType", "Lcom/ss/android/lark/appreciablelib/ErrorType;", "errorCode", "", "errorMessage", "sendClickReactionShowLessEvent", "sendClickReactionShowMoreEvent", "startReaction", "reactionKey", "isCancel", "", "isCrypto", "chatType", "messageType", "startReactionCoastSpan", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.r.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo187697a() {
            Statistics.sendEvent("reaction_more");
        }

        /* renamed from: b */
        public final void mo187701b() {
            Statistics.sendEvent("reaction_less");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo187699a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            if (!(!Intrinsics.areEqual(ReactionHitPoint.f135902b, str))) {
                String str2 = ReactionHitPoint.f135901a;
                if (str2 != null) {
                    AppreciableKit.f73094h.mo103524a().mo103515a(str2);
                }
                String str3 = null;
                ReactionHitPoint.f135901a = str3;
                ReactionHitPoint.f135902b = str3;
            }
        }

        /* renamed from: a */
        public final void mo187700a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(str2, "span");
            AppreciableKit.f73094h.mo103524a().mo103517a(str, str2);
        }

        /* renamed from: b */
        public final void mo187702b(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(str2, "span");
            AppreciableKit.f73094h.mo103524a().mo103521b(str, str2);
        }

        /* renamed from: a */
        public final void mo187698a(ErrorType errorType, int i, String str) {
            Intrinsics.checkParameterIsNotNull(errorType, "errorType");
            AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Messenger, Scene.Chat, Event.show_reaction, errorType, ErrorLevel.Exception, i, null, null, str, false, null, null, null, 7168, null));
        }

        /* renamed from: a */
        public final String mo187696a(String str, String str2, boolean z, boolean z2, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(str, "reactionKey");
            Intrinsics.checkParameterIsNotNull(str2, "messageId");
            ReactionHitPoint.f135902b = str2;
            ReactionHitPoint.f135901a = AppreciableKit.f73094h.mo103524a().mo103510a(Biz.Messenger, Scene.Chat, Event.show_reaction, (String) null, false, (Map<String, ? extends Object>) null, MapsKt.mapOf(TuplesKt.to("reaction_key", str), TuplesKt.to("message_id", str2)), (Map<String, ? extends Object>) null, MapsKt.mapOf(TuplesKt.to("is_cancel", Boolean.valueOf(z)), TuplesKt.to("is_crypto", Boolean.valueOf(z2)), TuplesKt.to("chat_type", Integer.valueOf(i)), TuplesKt.to("message_type", Integer.valueOf(i2))));
            String str3 = ReactionHitPoint.f135901a;
            if (str3 != null) {
                return str3;
            }
            return "";
        }
    }
}
