package com.ss.android.lark.impl.hitpoint;

import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/impl/hitpoint/ShareHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "core_share_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.n.a.a */
public final class ShareHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final String f121866a = f121866a;

    /* renamed from: b */
    public static final String f121867b = f121867b;

    /* renamed from: c */
    public static final String f121868c = f121868c;

    /* renamed from: d */
    public static final String f121869d = f121869d;

    /* renamed from: e */
    public static final Companion f121870e = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u0016\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u001a\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/impl/hitpoint/ShareHitPoint$Companion;", "", "()V", "SLARDAR_ENTER_FORWARD_SDK", "", "SLARDAR_FORWARD_CONFIRM_SDK", "SOURCE_KEY", "TYPE_KEY", "sendConfirmForward", "", ShareHitPoint.f121868c, ShareHitPoint.f121869d, "sendEnterForwardListEvent", "sendShareFromSDK", "appName", "sendSystemShare", "messageType", "core_share_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.n.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo169313a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "messageType");
            Statistics.sendEvent("sys_share", new JSONObject().put("message_type", str));
        }

        /* renamed from: b */
        public final void mo169315b(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
            Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121869d);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121868c, str);
            jSONObject.put(ShareHitPoint.f121869d, str2);
            Statistics.sendEvent(ShareHitPoint.f121866a, jSONObject);
        }

        /* renamed from: c */
        public final void mo169316c(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
            Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121869d);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121868c, str);
            jSONObject.put(ShareHitPoint.f121869d, str2);
            Statistics.sendEvent(ShareHitPoint.f121867b, jSONObject);
        }

        /* renamed from: a */
        public final void mo169314a(String str, String str2) {
            Statistics.sendEvent("sharesdk_open_feishu", new JSONObject().put("appname", str).put(ShareHitPoint.f121869d, str2));
        }
    }
}
