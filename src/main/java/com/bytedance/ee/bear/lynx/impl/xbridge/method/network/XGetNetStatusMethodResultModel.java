package com.bytedance.ee.bear.lynx.impl.xbridge.method.network;

import com.bytedance.ies.xbridge.model.results.XBaseResultModel;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/network/XGetNetStatusMethodResultModel;", "Lcom/bytedance/ies/xbridge/model/results/XBaseResultModel;", "()V", "isConnected", "", "()Ljava/lang/Boolean;", "setConnected", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", ShareHitPoint.f121869d, "", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "provideResultList", "", "", "Companion", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.network.c */
public final class XGetNetStatusMethodResultModel extends XBaseResultModel {

    /* renamed from: a */
    public static final Companion f23842a = new Companion(null);

    /* renamed from: b */
    private Boolean f23843b;

    /* renamed from: c */
    private Integer f23844c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/network/XGetNetStatusMethodResultModel$Companion;", "", "()V", "convert", "", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/network/XGetNetStatusMethodResultModel;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.network.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Map<String, Object> mo34004a(XGetNetStatusMethodResultModel cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean a = cVar.mo34000a();
            if (a != null) {
                linkedHashMap.put("isConnected", Boolean.valueOf(a.booleanValue()));
            }
            Integer b = cVar.mo34003b();
            if (b != null) {
                linkedHashMap.put(ShareHitPoint.f121869d, Integer.valueOf(b.intValue()));
            }
            return linkedHashMap;
        }
    }

    /* renamed from: a */
    public final Boolean mo34000a() {
        return this.f23843b;
    }

    /* renamed from: b */
    public final Integer mo34003b() {
        return this.f23844c;
    }

    /* renamed from: a */
    public final void mo34001a(Boolean bool) {
        this.f23843b = bool;
    }

    /* renamed from: a */
    public final void mo34002a(Integer num) {
        this.f23844c = num;
    }
}
