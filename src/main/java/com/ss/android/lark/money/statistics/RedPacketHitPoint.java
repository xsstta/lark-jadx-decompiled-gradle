package com.ss.android.lark.money.statistics;

import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0004H\u0007J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/money/statistics/RedPacketHitPoint;", "", "()V", "CLICK", "", "CONFIRM", "COVER_ID", "HONGBAO_ID", "IM_HONGBAO_RECEIVE_DETAIL_VIEW", "IM_HONGBAO_SEND_VIEW", "NONE", "OPEN", "TARGET", "THEME_TYPE", "sendHongbaoReceiveClick", "", "redPacketId", "sendHongbaoSendClick", "params", "Lcom/ss/android/lark/money/statistics/RedPacketHitPoint$HongbaoSendClickParams;", "coverId", "", "sendHongbaoSendView", "sendHongbaoThemeClick", "themeType", "sendHongbaoThemeView", "HongbaoSendClickParams", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class RedPacketHitPoint {

    /* renamed from: a */
    public static final RedPacketHitPoint f121290a = new RedPacketHitPoint();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/money/statistics/RedPacketHitPoint$HongbaoSendClickParams;", "", "action", "", "target", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getTarget", "HONGBAO_THEME", "HONGBAO_SEND", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum HongbaoSendClickParams {
        HONGBAO_THEME("hongbao_theme", "none"),
        HONGBAO_SEND("hongbao_send", "none");
        
        private final String action;
        private final String target;

        public final String getAction() {
            return this.action;
        }

        public final String getTarget() {
            return this.target;
        }

        private HongbaoSendClickParams(String str, String str2) {
            this.action = str;
            this.target = str2;
        }
    }

    private RedPacketHitPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m190212a() {
        Statistics.sendEvent("im_hongbao_send_view");
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m190215a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "redPacketId");
        Statistics.sendEvent("im_hongbao_receive_click", new JSONObject(MapsKt.mapOf(TuplesKt.to("click", "open"), TuplesKt.to("target", "im_hongbao_receive_detail_view"), TuplesKt.to("hongbao_id", str))));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m190213a(long j, String str) {
        Intrinsics.checkParameterIsNotNull(str, "themeType");
        Statistics.sendEvent("im_hongbao_theme_view", new JSONObject(MapsKt.mapOf(TuplesKt.to("cover_id", String.valueOf(j)), TuplesKt.to("theme_type", str))));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m190214a(HongbaoSendClickParams hongbaoSendClickParams, long j) {
        Intrinsics.checkParameterIsNotNull(hongbaoSendClickParams, "params");
        Statistics.sendEvent("im_hongbao_send_click", new JSONObject(MapsKt.mapOf(TuplesKt.to("click", hongbaoSendClickParams.getAction()), TuplesKt.to("target", hongbaoSendClickParams.getTarget()), TuplesKt.to("cover_id", Long.valueOf(j)))));
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m190216b(long j, String str) {
        Intrinsics.checkParameterIsNotNull(str, "themeType");
        Statistics.sendEvent("im_hongbao_theme_click", new JSONObject(MapsKt.mapOf(TuplesKt.to("click", "confirm"), TuplesKt.to("target", "im_hongbao_send_view"), TuplesKt.to("cover_id", String.valueOf(j)), TuplesKt.to("theme_type", str))));
    }
}
