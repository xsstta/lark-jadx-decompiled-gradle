package com.ss.android.lark.statistics.redpacket;

import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Deprecated(level = DeprecationLevel.WARNING, message = "Old hit point")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/statistics/redpacket/RedPacketHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.statistics.s.a */
public final class RedPacketHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f135904a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m213531a(boolean z, boolean z2) {
        f135904a.mo187707b(z, z2);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m213532b(boolean z, boolean z2) {
        f135904a.mo187708c(z, z2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/statistics/redpacket/RedPacketHitPoint$Companion;", "", "()V", "sendClickSendRedPacketEvent", "", "chatType", "", "sendCreateRedPacketPluginEvent", "isInstalled", "", "isLoaded", "sendOpenRedPacketPluginEvent", "sendOpenWalletPluginEvent", "sendRedPacketReactionEvent", "sendRedPacketReplyEvent", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.s.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo187703a() {
            Statistics.sendEvent("mobile_hongbao_reaction");
        }

        /* renamed from: b */
        public final void mo187706b() {
            Statistics.sendEvent("mobile_hongbao_reply");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo187704a(String str) {
            Statistics.sendEvent("hongbao_send", new JSONObject().put("chat_type", str));
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo187707b(boolean z, boolean z2) {
            Statistics.sendEvent("money_plugin", new JSONObject().put("scene", "open_wallet").put("install_status", z ? 1 : 0).put("load_status", z2 ? 1 : 0));
        }

        @JvmStatic
        /* renamed from: c */
        public final void mo187708c(boolean z, boolean z2) {
            Statistics.sendEvent("money_plugin", new JSONObject().put("scene", "open_red_packet").put("install_status", z ? 1 : 0).put("load_status", z2 ? 1 : 0));
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo187705a(boolean z, boolean z2) {
            Statistics.sendEvent("money_plugin", new JSONObject().put("scene", "create_red_packet").put("install_status", z ? 1 : 0).put("load_status", z2 ? 1 : 0));
        }
    }
}
