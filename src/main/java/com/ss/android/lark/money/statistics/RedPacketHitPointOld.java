package com.ss.android.lark.money.statistics;

import com.ss.android.lark.statistics.Statistics;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import org.json.JSONObject;

@Deprecated(level = DeprecationLevel.WARNING, message = "Old hit point", replaceWith = @ReplaceWith(expression = "RedPacketHitPoint", imports = {}))
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/money/statistics/RedPacketHitPointOld;", "", "()V", "sendClickSendRedPacketNowEvent", "", "redPacketType", "", "sendGrabRedPacketEvent", "chatType", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.money.statistics.a */
public final class RedPacketHitPointOld {

    /* renamed from: a */
    public static final RedPacketHitPointOld f121291a = new RedPacketHitPointOld();

    private RedPacketHitPointOld() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m190217a(String str) {
        Statistics.sendEvent("hongbao_receive", new JSONObject().put("chat_type", str));
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m190218b(String str) {
        Statistics.sendEvent("hongbao_sendnow", new JSONObject().put("hongbao_type", str));
    }
}
