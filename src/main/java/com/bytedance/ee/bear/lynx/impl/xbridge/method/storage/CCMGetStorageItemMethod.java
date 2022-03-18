package com.bytedance.ee.bear.lynx.impl.xbridge.method.storage;

import android.content.Context;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.storage.base.AbsXGetStorageItemMethod;
import com.bytedance.ies.xbridge.storage.model.XGetStorageItemMethodParamModel;
import com.bytedance.ies.xbridge.storage.model.XGetStorageItemMethodResultModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/storage/CCMGetStorageItemMethod;", "Lcom/bytedance/ies/xbridge/storage/base/AbsXGetStorageItemMethod;", "()V", "name", "", "getName", "()Ljava/lang/String;", "handle", "", "params", "Lcom/bytedance/ies/xbridge/storage/model/XGetStorageItemMethodParamModel;", "callback", "Lcom/bytedance/ies/xbridge/storage/base/AbsXGetStorageItemMethod$XGetStorageItemCallback;", ShareHitPoint.f121869d, "Lcom/bytedance/ies/xbridge/XBridgePlatformType;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.storage.b */
public final class CCMGetStorageItemMethod extends AbsXGetStorageItemMethod {

    /* renamed from: a */
    private final String f23848a = "ccm.getStorageItem";

    @Override // com.bytedance.ies.xbridge.XBridgeMethod, com.bytedance.ies.xbridge.storage.base.AbsXGetStorageItemMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f23848a;
    }

    @Override // com.bytedance.ies.xbridge.storage.base.AbsXGetStorageItemMethod
    /* renamed from: a */
    public void mo34014a(XGetStorageItemMethodParamModel aVar, AbsXGetStorageItemMethod.XGetStorageItemCallback aVar2, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar2, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        if (((Context) mo52930a(Context.class)) != null) {
            Object b = CCMNativeStorage.f23849a.mo34017b(aVar.mo53164a());
            XGetStorageItemMethodResultModel bVar = new XGetStorageItemMethodResultModel();
            bVar.mo53168a(b);
            AbsXGetStorageItemMethod.XGetStorageItemCallback.C14441a.m58393a(aVar2, bVar, null, 2, null);
            return;
        }
        aVar2.mo53158a(0, "Context not provided in host");
    }
}
