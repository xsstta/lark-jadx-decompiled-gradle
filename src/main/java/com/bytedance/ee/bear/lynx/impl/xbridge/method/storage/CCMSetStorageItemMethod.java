package com.bytedance.ee.bear.lynx.impl.xbridge.method.storage;

import android.content.Context;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.XDynamic;
import com.bytedance.ies.xbridge.model.results.XDefaultResultModel;
import com.bytedance.ies.xbridge.storage.base.AbsXSetStorageItemMethod;
import com.bytedance.ies.xbridge.storage.model.XSetStorageItemMethodParamModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/storage/CCMSetStorageItemMethod;", "Lcom/bytedance/ies/xbridge/storage/base/AbsXSetStorageItemMethod;", "()V", "name", "", "getName", "()Ljava/lang/String;", "handle", "", "params", "Lcom/bytedance/ies/xbridge/storage/model/XSetStorageItemMethodParamModel;", "callback", "Lcom/bytedance/ies/xbridge/storage/base/AbsXSetStorageItemMethod$XSetStorageItemCallback;", ShareHitPoint.f121869d, "Lcom/bytedance/ies/xbridge/XBridgePlatformType;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.storage.f */
public final class CCMSetStorageItemMethod extends AbsXSetStorageItemMethod {

    /* renamed from: a */
    private final String f23852a = "ccm.setStorageItem";

    @Override // com.bytedance.ies.xbridge.XBridgeMethod, com.bytedance.ies.xbridge.storage.base.AbsXSetStorageItemMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f23852a;
    }

    @Override // com.bytedance.ies.xbridge.storage.base.AbsXSetStorageItemMethod
    /* renamed from: a */
    public void mo34019a(XSetStorageItemMethodParamModel dVar, AbsXSetStorageItemMethod.XSetStorageItemCallback aVar, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(dVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        boolean z = false;
        if (((Context) mo52930a(Context.class)) != null) {
            String a = dVar.mo53173a();
            XDynamic b = dVar.mo53176b();
            switch (C8856g.f23853a[b.mo53082a().ordinal()]) {
                case 1:
                    z = CCMNativeStorage.f23849a.mo34016a(a, Boolean.valueOf(b.mo53083b()));
                    break;
                case 2:
                    z = CCMNativeStorage.f23849a.mo34016a(a, Integer.valueOf(b.mo53085d()));
                    break;
                case 3:
                    z = CCMNativeStorage.f23849a.mo34016a(a, b.mo53086e());
                    break;
                case 4:
                    z = CCMNativeStorage.f23849a.mo34016a(a, Double.valueOf(b.mo53084c()));
                    break;
                case 5:
                    z = CCMNativeStorage.f23849a.mo34016a(a, b.mo53087f());
                    break;
                case 6:
                    z = CCMNativeStorage.f23849a.mo34016a(a, b.mo53088g());
                    break;
            }
            if (z) {
                AbsXSetStorageItemMethod.XSetStorageItemCallback.C14445a.m58409a(aVar, new XDefaultResultModel(), null, 2, null);
            } else {
                aVar.mo53162a(-3, "Illegal value type");
            }
        } else {
            aVar.mo53162a(0, "Context not provided in host");
        }
    }
}
