package com.bytedance.ies.xbridge.log.model;

import com.bytedance.ies.xbridge.C14434d;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.model.params.XBaseParamModel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ies/xbridge/log/model/XReportAppLogMethodParamModel;", "Lcom/bytedance/ies/xbridge/model/params/XBaseParamModel;", "()V", "eventName", "", "getEventName", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", "params", "Lcom/bytedance/ies/xbridge/XReadableMap;", "getParams", "()Lcom/bytedance/ies/xbridge/XReadableMap;", "setParams", "(Lcom/bytedance/ies/xbridge/XReadableMap;)V", "provideParamList", "", "Companion", "x-bridge-log_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.c.b.b */
public final class XReportAppLogMethodParamModel extends XBaseParamModel {

    /* renamed from: c */
    public static final Companion f38019c = new Companion(null);

    /* renamed from: a */
    public String f38020a;

    /* renamed from: b */
    public XReadableMap f38021b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ies/xbridge/log/model/XReportAppLogMethodParamModel$Companion;", "", "()V", "convert", "Lcom/bytedance/ies/xbridge/log/model/XReportAppLogMethodParamModel;", "map", "Lcom/bytedance/ies/xbridge/XReadableMap;", "x-bridge-log_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.c.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final XReportAppLogMethodParamModel mo53081a(XReadableMap hVar) {
            boolean z;
            XReadableMap a;
            Intrinsics.checkParameterIsNotNull(hVar, "map");
            String a2 = C14434d.m58266a(hVar, "eventName", (String) null, 2, (Object) null);
            if (a2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || (a = C14434d.m58264a(hVar, "params", (XReadableMap) null, 2, (Object) null)) == null) {
                return null;
            }
            XReportAppLogMethodParamModel bVar = new XReportAppLogMethodParamModel();
            bVar.mo53079a(a2);
            bVar.mo53078a(a);
            return bVar;
        }
    }

    /* renamed from: a */
    public final String mo53077a() {
        String str = this.f38020a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventName");
        }
        return str;
    }

    /* renamed from: b */
    public final XReadableMap mo53080b() {
        XReadableMap hVar = this.f38021b;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        return hVar;
    }

    /* renamed from: a */
    public final void mo53078a(XReadableMap hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "<set-?>");
        this.f38021b = hVar;
    }

    /* renamed from: a */
    public final void mo53079a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f38020a = str;
    }
}
