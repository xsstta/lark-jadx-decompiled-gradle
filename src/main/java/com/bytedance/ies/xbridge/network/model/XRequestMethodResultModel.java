package com.bytedance.ies.xbridge.network.model;

import com.bytedance.ies.xbridge.model.results.XBaseResultModel;
import com.google.firebase.messaging.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u0016R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ies/xbridge/network/model/XRequestMethodResultModel;", "Lcom/bytedance/ies/xbridge/model/results/XBaseResultModel;", "()V", "header", "", "", "", "getHeader", "()Ljava/util/Map;", "setHeader", "(Ljava/util/Map;)V", "httpCode", "", "getHttpCode", "()Ljava/lang/Integer;", "setHttpCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "response", "getResponse", "setResponse", "provideResultList", "", "Companion", "x-bridge-network_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.e.b.b */
public final class XRequestMethodResultModel extends XBaseResultModel {

    /* renamed from: a */
    public static final Companion f38043a = new Companion(null);

    /* renamed from: b */
    private Integer f38044b;

    /* renamed from: c */
    private Map<String, ? extends Object> f38045c;

    /* renamed from: d */
    private Map<String, ? extends Object> f38046d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/bytedance/ies/xbridge/network/model/XRequestMethodResultModel$Companion;", "", "()V", "convert", "", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ies/xbridge/network/model/XRequestMethodResultModel;", "x-bridge-network_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.e.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Map<String, Object> mo53140a(XRequestMethodResultModel bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Integer a = bVar.mo53135a();
            if (a != null) {
                a.intValue();
                if (bVar.mo53139c() != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Integer a2 = bVar.mo53135a();
                    if (a2 == null) {
                        Intrinsics.throwNpe();
                    }
                    linkedHashMap.put("httpCode", a2);
                    Map<String, Object> c = bVar.mo53139c();
                    if (c == null) {
                        Intrinsics.throwNpe();
                    }
                    linkedHashMap.put("response", c);
                    Map<String, Object> b = bVar.mo53138b();
                    if (b != null) {
                        linkedHashMap.put("header", b);
                    }
                    return linkedHashMap;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public final Integer mo53135a() {
        return this.f38044b;
    }

    /* renamed from: b */
    public final Map<String, Object> mo53138b() {
        return this.f38045c;
    }

    /* renamed from: c */
    public final Map<String, Object> mo53139c() {
        return this.f38046d;
    }

    /* renamed from: a */
    public final void mo53136a(Integer num) {
        this.f38044b = num;
    }

    /* renamed from: a */
    public final void mo53137a(Map<String, ? extends Object> map) {
        this.f38046d = map;
    }
}
