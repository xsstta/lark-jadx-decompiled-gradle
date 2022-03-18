package com.ss.android.lark.member_manage.impl.statistics;

import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/statistics/SelectContactHitPoint;", "", "()V", "CHANNEL", "", "sendEnterProfileCloseClick", "", "sendEnterProfileSelectClick", "sendProfileMessageSent", "channel", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.statistics.e */
public final class SelectContactHitPoint {

    /* renamed from: a */
    public static final SelectContactHitPoint f114610a = new SelectContactHitPoint();

    private SelectContactHitPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m179753a() {
        Statistics.sendEvent("message_usercard_close");
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m179755b() {
        Statistics.sendEvent("message_usercard_enter");
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m179754a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "channel");
        Statistics.sendEvent("message_usercard_success", new JSONObject().put("usercard_select_channel", str));
    }
}
