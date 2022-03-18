package com.bytedance.ee.bear.lynx.impl.xbridge.method.network;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.lynx.impl.utli.ServiceDependence;
import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.bridgeInterfaces.XCoreBridgeMethod;
import com.bytedance.ies.xbridge.model.collections.defaultimpl.DefaultXReadableMapImpl;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/network/CCMNetStatusMethod;", "Lcom/bytedance/ies/xbridge/bridgeInterfaces/XCoreBridgeMethod;", "()V", "name", "", "getName", "()Ljava/lang/String;", "networkObserver", "Landroidx/lifecycle/Observer;", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "handle", "", "params", "Lcom/bytedance/ies/xbridge/XReadableMap;", "callback", "Lcom/bytedance/ies/xbridge/XBridgeMethod$Callback;", ShareHitPoint.f121869d, "Lcom/bytedance/ies/xbridge/XBridgePlatformType;", "release", "Companion", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.network.b */
public final class CCMNetStatusMethod extends XCoreBridgeMethod {

    /* renamed from: a */
    public static final Companion f23838a = new Companion(null);

    /* renamed from: c */
    private final AbstractC1178x<ConnectionService.NetworkState> f23839c;

    /* renamed from: d */
    private final String f23840d = "ccm.getNetStatus";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/network/CCMNetStatusMethod$Companion;", "", "()V", "NET_CHANGED_EVENT_NAME", "", "TAG", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.network.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f23840d;
    }

    @Override // com.bytedance.ies.xbridge.bridgeInterfaces.XCoreBridgeMethod, com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: b */
    public void mo33998b() {
        super.mo33998b();
        C5084ad.m20847d().mo20037a().mo5925a(this.f23839c);
    }

    public CCMNetStatusMethod() {
        C8854b bVar = new C8854b(this);
        this.f23839c = bVar;
        ((ConnectionService) ServiceDependence.f23778b.mo33929a(ConnectionService.class)).mo20037a().mo5925a(bVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.network.b$b */
    static final class C8854b<T> implements AbstractC1178x<ConnectionService.NetworkState> {

        /* renamed from: a */
        final /* synthetic */ CCMNetStatusMethod f23841a;

        C8854b(CCMNetStatusMethod bVar) {
            this.f23841a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(ConnectionService.NetworkState networkState) {
            XGetNetStatusMethodResultModel cVar = new XGetNetStatusMethodResultModel();
            Intrinsics.checkExpressionValueIsNotNull(networkState, "it");
            cVar.mo34001a(Boolean.valueOf(networkState.mo20041b()));
            cVar.mo34002a(Integer.valueOf(networkState.mo20040a()));
            XBridgeMethod.JsEventDelegate dVar = (XBridgeMethod.JsEventDelegate) this.f23841a.mo52930a(XBridgeMethod.JsEventDelegate.class);
            if (dVar != null) {
                Map<String, Object> a = XGetNetStatusMethodResultModel.f23842a.mo34004a(cVar);
                if (a != null) {
                    dVar.mo33965a("ccm.netStateChangedEvent", new DefaultXReadableMapImpl(new JSONObject(a)));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            }
        }
    }

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public void mo33975a(XReadableMap hVar, XBridgeMethod.Callback aVar, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(hVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        ConnectionService d = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
        ConnectionService.NetworkState b = d.mo20038b();
        XGetNetStatusMethodResultModel cVar = new XGetNetStatusMethodResultModel();
        Intrinsics.checkExpressionValueIsNotNull(b, "networkState");
        cVar.mo34001a(Boolean.valueOf(b.mo20041b()));
        cVar.mo34002a(Integer.valueOf(b.mo20040a()));
        XCoreBridgeMethod.m58218a(this, aVar, XGetNetStatusMethodResultModel.f23842a.mo34004a(cVar), null, 4, null);
    }
}
