package com.bytedance.ee.bear.lynx.impl.xbridge.method.fg;

import com.bytedance.ies.xbridge.model.results.XBaseResultModel;
import com.google.firebase.messaging.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0016R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/fg/CCMGetFgMethodResultModel;", "Lcom/bytedance/ies/xbridge/model/results/XBaseResultModel;", "()V", "fgMap", "", "", "", "getFgMap", "()Ljava/util/Map;", "setFgMap", "(Ljava/util/Map;)V", "provideResultList", "", "Companion", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.a.c */
public final class CCMGetFgMethodResultModel extends XBaseResultModel {

    /* renamed from: a */
    public static final Companion f23818a = new Companion(null);

    /* renamed from: b */
    private Map<String, Object> f23819b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/fg/CCMGetFgMethodResultModel$Companion;", "", "()V", "convert", "", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/fg/CCMGetFgMethodResultModel;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Map<String, Object> mo33981a(CCMGetFgMethodResultModel cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (cVar.mo33979a() == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, Object> a = cVar.mo33979a();
            if (a != null) {
                linkedHashMap.put("fg", a);
            }
            return linkedHashMap;
        }
    }

    /* renamed from: a */
    public final Map<String, Object> mo33979a() {
        return this.f23819b;
    }

    /* renamed from: a */
    public final void mo33980a(Map<String, Object> map) {
        this.f23819b = map;
    }
}
