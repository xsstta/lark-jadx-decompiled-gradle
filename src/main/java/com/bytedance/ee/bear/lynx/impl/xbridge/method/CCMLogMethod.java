package com.bytedance.ee.bear.lynx.impl.xbridge.method;

import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13616d;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.log.base.AbsXReportALogMethod;
import com.bytedance.ies.xbridge.log.model.XReportALogMethodParamModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/CCMLogMethod;", "Lcom/bytedance/ies/xbridge/log/base/AbsXReportALogMethod;", "()V", "name", "", "getName", "()Ljava/lang/String;", "handle", "", "params", "Lcom/bytedance/ies/xbridge/log/model/XReportALogMethodParamModel;", "callback", "Lcom/bytedance/ies/xbridge/log/base/AbsXReportALogMethod$XReportALogCallback;", ShareHitPoint.f121869d, "Lcom/bytedance/ies/xbridge/XBridgePlatformType;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.c */
public final class CCMLogMethod extends AbsXReportALogMethod {

    /* renamed from: a */
    private final String f23820a = "ccm.log";

    @Override // com.bytedance.ies.xbridge.XBridgeMethod, com.bytedance.ies.xbridge.log.base.AbsXReportALogMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f23820a;
    }

    @Override // com.bytedance.ies.xbridge.log.base.AbsXReportALogMethod
    /* renamed from: a */
    public void mo33983a(XReportALogMethodParamModel aVar, AbsXReportALogMethod.XReportALogCallback aVar2, XBridgePlatformType xBridgePlatformType) {
        String str;
        String str2;
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar2, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        StringBuilder sb = new StringBuilder(aVar.mo53068b().length() + 100);
        sb.append("[");
        XReportALogMethodParamModel.CodePosition d = aVar.mo53072d();
        Integer num = null;
        if (d != null) {
            str = d.mo53073a();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(", ");
        XReportALogMethodParamModel.CodePosition d2 = aVar.mo53072d();
        if (d2 != null) {
            str2 = d2.mo53074b();
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(", ");
        XReportALogMethodParamModel.CodePosition d3 = aVar.mo53072d();
        if (d3 != null) {
            num = Integer.valueOf(d3.mo53075c());
        }
        sb.append(num);
        sb.append("]");
        sb.append(aVar.mo53068b());
        Intrinsics.checkExpressionValueIsNotNull(sb, "StringBuilder(params.mes…\").append(params.message)");
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "builder.toString()");
        String str3 = "ccm-lynx: " + aVar.mo53070c();
        String a = aVar.mo53065a();
        switch (a.hashCode()) {
            case 3237038:
                if (a.equals("info")) {
                    C13479a.m54764b(str3, sb2);
                    return;
                }
                break;
            case 3641990:
                if (a.equals("warn")) {
                    C13479a.m54775e(str3, sb2);
                    return;
                }
                break;
            case 95458899:
                if (a.equals("debug")) {
                    C13479a.m54772d(str3, sb2);
                    return;
                }
                break;
            case 96784904:
                if (a.equals("error")) {
                    C13479a.m54758a(str3, sb2);
                    return;
                }
                break;
            case 351107458:
                if (a.equals("verbose")) {
                    C13479a.m54768c(str3, sb2);
                    return;
                }
                break;
        }
        if (!C13616d.m55261a()) {
            C13479a.m54764b(str3, sb2);
            return;
        }
        throw new IllegalArgumentException("Illegal level!");
    }
}
