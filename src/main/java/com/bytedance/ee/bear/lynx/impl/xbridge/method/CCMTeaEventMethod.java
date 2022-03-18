package com.bytedance.ee.bear.lynx.impl.xbridge.method;

import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.lynx.impl.utli.ServiceDependence;
import com.bytedance.ee.bear.lynx.impl.xbridge.C8846a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13616d;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.XDynamic;
import com.bytedance.ies.xbridge.XKeyIterator;
import com.bytedance.ies.xbridge.XReadableArray;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.log.base.AbsXReportAppLogMethod;
import com.bytedance.ies.xbridge.log.model.XReportAppLogMethodParamModel;
import com.bytedance.ies.xbridge.model.results.XDefaultResultModel;
import com.bytedance.ies.xbridge.utils.XReadableJSONUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/CCMTeaEventMethod;", "Lcom/bytedance/ies/xbridge/log/base/AbsXReportAppLogMethod;", "()V", "name", "", "getName", "()Ljava/lang/String;", "handle", "", "params", "Lcom/bytedance/ies/xbridge/log/model/XReportAppLogMethodParamModel;", "callback", "Lcom/bytedance/ies/xbridge/log/base/AbsXReportAppLogMethod$XReportAppLogCallback;", ShareHitPoint.f121869d, "Lcom/bytedance/ies/xbridge/XBridgePlatformType;", "Companion", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.g */
public final class CCMTeaEventMethod extends AbsXReportAppLogMethod {

    /* renamed from: a */
    public static final Companion f23824a = new Companion(null);

    /* renamed from: c */
    private final String f23825c = "ccm.teaSendEvent";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/CCMTeaEventMethod$Companion;", "", "()V", "TAG", "", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.XBridgeMethod, com.bytedance.ies.xbridge.log.base.AbsXReportAppLogMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f23825c;
    }

    @Override // com.bytedance.ies.xbridge.log.base.AbsXReportAppLogMethod
    /* renamed from: a */
    public void mo33987a(XReportAppLogMethodParamModel bVar, AbsXReportAppLogMethod.XReportAppLogCallback aVar, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(bVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        String a = bVar.mo53077a();
        XReadableMap b = bVar.mo53080b();
        XKeyIterator a2 = b.mo53100a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (a2.mo53089a()) {
            String b2 = a2.mo53090b();
            XDynamic i = b.mo53110i(b2);
            switch (C8850h.f23826a[i.mo53082a().ordinal()]) {
                case 1:
                    linkedHashMap.put(b2, String.valueOf(i.mo53083b()));
                    break;
                case 2:
                    linkedHashMap.put(b2, String.valueOf(i.mo53085d()));
                    break;
                case 3:
                    linkedHashMap.put(b2, C8846a.m37088a(b, b2).toString());
                    break;
                case 4:
                    linkedHashMap.put(b2, i.mo53086e());
                    break;
                case 5:
                    XReadableMap g = i.mo53088g();
                    if (g == null) {
                        break;
                    } else {
                        String jSONObject = XReadableJSONUtils.f38087a.mo53181a(g).toString();
                        Intrinsics.checkExpressionValueIsNotNull(jSONObject, "XReadableJSONUtils.xRead…JSONObject(it).toString()");
                        String str = (String) linkedHashMap.put(b2, jSONObject);
                        break;
                    }
                case 6:
                    XReadableArray f = i.mo53087f();
                    if (f == null) {
                        break;
                    } else {
                        String jSONArray = XReadableJSONUtils.f38087a.mo53180a(f).toString();
                        Intrinsics.checkExpressionValueIsNotNull(jSONArray, "XReadableJSONUtils\n     …oJSONArray(it).toString()");
                        String str2 = (String) linkedHashMap.put(b2, jSONArray);
                        break;
                    }
                default:
                    if (!C13616d.m55261a()) {
                        C13479a.m54775e("ccm-lynx: XTeaEventMethod", "event param type unknown");
                        break;
                    } else {
                        throw new IllegalArgumentException("Illegal level!");
                    }
            }
        }
        ((AbstractC5233x) ServiceDependence.f23778b.mo33929a(AbstractC5233x.class)).mo21084b(a, linkedHashMap);
        AbsXReportAppLogMethod.XReportAppLogCallback.C14432a.m58239a(aVar, new XDefaultResultModel(), null, 2, null);
    }
}
