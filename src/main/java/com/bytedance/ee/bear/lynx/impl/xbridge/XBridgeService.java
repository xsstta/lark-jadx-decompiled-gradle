package com.bytedance.ee.bear.lynx.impl.xbridge;

import com.bytedance.ee.bear.lynx.impl.xbridge.method.CCMClosePageMethod;
import com.bytedance.ee.bear.lynx.impl.xbridge.method.CCMHideLoadingMethod;
import com.bytedance.ee.bear.lynx.impl.xbridge.method.CCMLogMethod;
import com.bytedance.ee.bear.lynx.impl.xbridge.method.CCMOpenPageMethod;
import com.bytedance.ee.bear.lynx.impl.xbridge.method.CCMShowLoadingMethod;
import com.bytedance.ee.bear.lynx.impl.xbridge.method.CCMShowToastMethod;
import com.bytedance.ee.bear.lynx.impl.xbridge.method.CCMTeaEventMethod;
import com.bytedance.ee.bear.lynx.impl.xbridge.method.fg.CCMGetFgMethod;
import com.bytedance.ee.bear.lynx.impl.xbridge.method.network.CCMNetRequestMethod;
import com.bytedance.ee.bear.lynx.impl.xbridge.method.network.CCMNetStatusMethod;
import com.bytedance.ee.bear.lynx.impl.xbridge.method.setting.CCMGetSettingMethod;
import com.bytedance.ee.bear.lynx.impl.xbridge.method.storage.CCMGetStorageInfoMethod;
import com.bytedance.ee.bear.lynx.impl.xbridge.method.storage.CCMGetStorageItemMethod;
import com.bytedance.ee.bear.lynx.impl.xbridge.method.storage.CCMRemoveStorageItemMethod;
import com.bytedance.ee.bear.lynx.impl.xbridge.method.storage.CCMSetStorageItemMethod;
import com.bytedance.ee.bear.lynx.impl.xbridge.method.view.SendContainerEventMethod;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ies.xbridge.XBridge;
import com.bytedance.ies.xbridge.XBridgeMethod;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bH\u0002J\b\u0010\n\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/XBridgeService;", "", "()V", "TAG", "", "registerBridgeMethod", "", "methodClazz", "Ljava/lang/Class;", "Lcom/bytedance/ies/xbridge/XBridgeMethod;", "registerXBridges", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.e */
public final class XBridgeService {

    /* renamed from: a */
    public static final XBridgeService f23811a = new XBridgeService();

    private XBridgeService() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m37101a() {
        C13479a.m54764b("ccm-lynx: XBridgeService", "registerXBridges");
        XBridgeService eVar = f23811a;
        eVar.m37102a(CCMLogMethod.class);
        eVar.m37102a(CCMTeaEventMethod.class);
        eVar.m37102a(SendContainerEventMethod.class);
        eVar.m37102a(CCMNetRequestMethod.class);
        eVar.m37102a(CCMGetSettingMethod.class);
        eVar.m37102a(CCMGetFgMethod.class);
        eVar.m37102a(CCMShowLoadingMethod.class);
        eVar.m37102a(CCMHideLoadingMethod.class);
        eVar.m37102a(CCMOpenPageMethod.class);
        eVar.m37102a(CCMClosePageMethod.class);
        eVar.m37102a(CCMGetStorageInfoMethod.class);
        eVar.m37102a(CCMGetStorageItemMethod.class);
        eVar.m37102a(CCMRemoveStorageItemMethod.class);
        eVar.m37102a(CCMSetStorageItemMethod.class);
        eVar.m37102a(CCMNetStatusMethod.class);
        eVar.m37102a(CCMShowToastMethod.class);
    }

    /* renamed from: a */
    private final void m37102a(Class<? extends XBridgeMethod> cls) {
        XBridge.m58210a(XBridge.f37982a, cls, null, "ccm-bridge", 2, null);
    }
}
