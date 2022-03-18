package com.ss.android.lark.forward.impl.statistics.favourite;

import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.extensions.IParam;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/forward/impl/statistics/favourite/ForwardHitPointNew;", "", "()V", "Companion", "Params", "Value", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.forward.impl.statistics.favourite.b */
public final class ForwardHitPointNew {

    /* renamed from: a */
    public static final Companion f98834a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/forward/impl/statistics/favourite/ForwardHitPointNew$Companion;", "", "()V", "sendMultiSelectShareClick", "", "click", "", "target", "sendMultiSelectShareView", "sendPublicSendToView", "sendSendMsgConfirmClick", "param", "Lcom/ss/android/lark/statistics/extensions/IParam;", "sendSendMsgConfirmView", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.forward.impl.statistics.favourite.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo141015a() {
            Statistics.sendEvent("public_multi_select_share_view");
        }

        /* renamed from: b */
        public final void mo141018b() {
            Statistics.sendEvent("public_send_to_view");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo141016a(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "param");
            Statistics.sendEvent("im_msg_send_confirm_view", cVar.toJson());
        }

        /* renamed from: b */
        public final void mo141019b(IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "param");
            Statistics.sendEvent("im_msg_send_confirm_click", cVar.toJson());
        }

        /* renamed from: a */
        public final void mo141017a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "click");
            Intrinsics.checkParameterIsNotNull(str2, "target");
            Statistics.sendEvent("public_multi_select_share_click", new JSONObject().put("click", str).put("target", str2));
        }
    }
}
