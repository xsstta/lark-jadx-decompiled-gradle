package com.bytedance.ee.bear.lynx.impl.xbridge.method.storage;

import android.content.Context;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.model.results.XDefaultResultModel;
import com.bytedance.ies.xbridge.storage.base.AbsXRemoveStorageItemMethod;
import com.bytedance.ies.xbridge.storage.model.XRemoveStorageItemMethodParamModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/storage/CCMRemoveStorageItemMethod;", "Lcom/bytedance/ies/xbridge/storage/base/AbsXRemoveStorageItemMethod;", "()V", "name", "", "getName", "()Ljava/lang/String;", "handle", "", "params", "Lcom/bytedance/ies/xbridge/storage/model/XRemoveStorageItemMethodParamModel;", "callback", "Lcom/bytedance/ies/xbridge/storage/base/AbsXRemoveStorageItemMethod$XRemoveStorageItemCallback;", ShareHitPoint.f121869d, "Lcom/bytedance/ies/xbridge/XBridgePlatformType;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.storage.e */
public final class CCMRemoveStorageItemMethod extends AbsXRemoveStorageItemMethod {

    /* renamed from: a */
    private final String f23851a = "ccm.removeStorageItem";

    @Override // com.bytedance.ies.xbridge.XBridgeMethod, com.bytedance.ies.xbridge.storage.base.AbsXRemoveStorageItemMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f23851a;
    }

    @Override // com.bytedance.ies.xbridge.storage.base.AbsXRemoveStorageItemMethod
    /* renamed from: a */
    public void mo34018a(XRemoveStorageItemMethodParamModel cVar, AbsXRemoveStorageItemMethod.XRemoveStorageItemCallback aVar, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(cVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        if (((Context) mo52930a(Context.class)) != null) {
            CCMNativeStorage.f23849a.mo34015a(cVar.mo53170a());
            AbsXRemoveStorageItemMethod.XRemoveStorageItemCallback.C14443a.m58401a(aVar, new XDefaultResultModel(), null, 2, null);
            return;
        }
        aVar.mo53160a(0, "Context not provided in host");
    }
}
