package com.ss.android.lark.keyboard.plugin.tool.more;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0013\u0014B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J*\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/more/PlusItemHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "CLICK", "", "TAG", "TARGET", "sendChatInputPlusClick", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "userId", "action", "Lcom/ss/android/lark/keyboard/plugin/tool/more/PlusItemHitPoint$PlusItemAction;", "target", "Lcom/ss/android/lark/keyboard/plugin/tool/more/PlusItemHitPoint$PlusItemTarget;", "param", "Lcom/ss/android/lark/statistics/extensions/IParam;", "PlusItemAction", "PlusItemTarget", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PlusItemHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final PlusItemHitPoint f104161a = new PlusItemHitPoint();

    private PlusItemHitPoint() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/more/PlusItemHitPoint$PlusItemAction;", "", "(Ljava/lang/String;I)V", "toString", "", "EVENT", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum PlusItemAction {
        EVENT;

        public String toString() {
            String str = super.toString();
            Locale locale = Locale.ROOT;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ROOT");
            if (str != null) {
                String lowerCase = str.toLowerCase(locale);
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                return lowerCase;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/more/PlusItemHitPoint$PlusItemTarget;", "", "(Ljava/lang/String;I)V", "toString", "", "CAL_EVENT_FULL_CREATE_VIEW", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum PlusItemTarget {
        CAL_EVENT_FULL_CREATE_VIEW;

        public String toString() {
            String str = super.toString();
            Locale locale = Locale.ROOT;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ROOT");
            if (str != null) {
                String lowerCase = str.toLowerCase(locale);
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                return lowerCase;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* renamed from: a */
    public final void mo147640a(Chat chat, String str, PlusItemAction plusItemAction, PlusItemTarget plusItemTarget) {
        Intrinsics.checkParameterIsNotNull(plusItemAction, "action");
        Intrinsics.checkParameterIsNotNull(plusItemTarget, "target");
        if (chat == null) {
            Log.m165383e("PlusItemHitpoint", "chat is null, send key im_chat_input_plus_click failed");
        } else {
            Statistics.sendEvent("im_chat_input_plus_click", new JSONObject(ChatParamUtils.m133137a(chat, str, (Chatter) null, 4, (Object) null)).put("click", plusItemAction.toString()).put("target", plusItemTarget.toString()));
        }
    }
}
