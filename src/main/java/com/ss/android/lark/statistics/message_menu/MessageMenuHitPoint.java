package com.ss.android.lark.statistics.message_menu;

import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/statistics/message_menu/MessageMenuHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.statistics.o.b */
public final class MessageMenuHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f135850a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u0004¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/statistics/message_menu/MessageMenuHitPoint$Companion;", "", "()V", "sendClickBuzzEvent", "", "sendClickDeleteEvent", "sendClickFavoriteEvent", "sendClickForwardEvent", "sendClickMoreReactonEvent", "sendClickMultiSelectEvent", "sendClickPinEvent", "isAdd", "", "sendClickRecallEvent", "sendClickReplyEvent", "sendClickTranslateEvent", "sendCliickCopyEvent", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.o.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo187644a() {
            Statistics.sendEvent("message_menu_buzz_click");
        }

        /* renamed from: b */
        public final void mo187646b() {
            Statistics.sendEvent("message_menu_reply_click");
        }

        /* renamed from: c */
        public final void mo187647c() {
            Statistics.sendEvent("message_menu_copy_click");
        }

        /* renamed from: d */
        public final void mo187648d() {
            Statistics.sendEvent("message_menu_forward_click");
        }

        /* renamed from: e */
        public final void mo187649e() {
            Statistics.sendEvent("message_menu_favorite_click");
        }

        /* renamed from: f */
        public final void mo187650f() {
            Statistics.sendEvent("message_menu_multi-select_click");
        }

        /* renamed from: g */
        public final void mo187651g() {
            Statistics.sendEvent("message_menu_recall_click");
        }

        /* renamed from: h */
        public final void mo187652h() {
            Statistics.sendEvent("message_menu_translate_click");
        }

        /* renamed from: i */
        public final void mo187653i() {
            Statistics.sendEvent("message_menu_delete_click");
        }

        /* renamed from: j */
        public final void mo187654j() {
            Statistics.sendEvent("message_menu_more_reaction_click");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo187645a(boolean z) {
            String str;
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = "pin";
            } else {
                str = "unpin";
            }
            Statistics.sendEvent("message_menu_pin_click", jSONObject.put("interaction", str));
        }
    }
}
