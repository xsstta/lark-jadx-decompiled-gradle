package com.bytedance.ies.xbridge.storage.base;

import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.bridgeInterfaces.XCoreBridgeMethod;
import com.bytedance.ies.xbridge.storage.model.XGetStorageItemMethodParamModel;
import com.bytedance.ies.xbridge.storage.model.XGetStorageItemMethodResultModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bytedance.ies.xbridge.g.a.b */
public abstract class AbsXGetStorageItemMethod extends XCoreBridgeMethod {

    /* renamed from: a */
    private final String f38065a = "x.getStorageItem";

    /* renamed from: c */
    private final XBridgeMethod.Access f38066c = XBridgeMethod.Access.PRIVATE;

    /* renamed from: a */
    public abstract void mo34014a(XGetStorageItemMethodParamModel aVar, XGetStorageItemCallback aVar2, XBridgePlatformType xBridgePlatformType);

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f38065a;
    }

    /* renamed from: com.bytedance.ies.xbridge.g.a.b$b */
    public static final class C14442b implements XGetStorageItemCallback {

        /* renamed from: a */
        final /* synthetic */ AbsXGetStorageItemMethod f38067a;

        /* renamed from: b */
        final /* synthetic */ XBridgeMethod.Callback f38068b;

        C14442b(AbsXGetStorageItemMethod bVar, XBridgeMethod.Callback aVar) {
            this.f38067a = bVar;
            this.f38068b = aVar;
        }

        @Override // com.bytedance.ies.xbridge.storage.base.AbsXGetStorageItemMethod.XGetStorageItemCallback
        /* renamed from: a */
        public void mo53158a(int i, String str) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            XCoreBridgeMethod.m58217a(this.f38067a, this.f38068b, i, str, null, 8, null);
        }

        @Override // com.bytedance.ies.xbridge.storage.base.AbsXGetStorageItemMethod.XGetStorageItemCallback
        /* renamed from: a */
        public void mo53159a(XGetStorageItemMethodResultModel bVar, String str) {
            Intrinsics.checkParameterIsNotNull(bVar, "result");
            Intrinsics.checkParameterIsNotNull(str, "msg");
            Map<String, Object> a = XGetStorageItemMethodResultModel.f38079a.mo53169a(bVar);
            if (a == null) {
                XCoreBridgeMethod.m58217a(this.f38067a, this.f38068b, -5, null, null, 12, null);
            } else {
                this.f38067a.mo52932a(this.f38068b, a, str);
            }
        }
    }

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public void mo33975a(XReadableMap hVar, XBridgeMethod.Callback aVar, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(hVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        XGetStorageItemMethodParamModel a = XGetStorageItemMethodParamModel.f38077b.mo53166a(hVar);
        if (a == null) {
            XCoreBridgeMethod.m58217a(this, aVar, -3, null, null, 12, null);
        } else {
            mo34014a(a, new C14442b(this, aVar), xBridgePlatformType);
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.g.a.b$a */
    public interface XGetStorageItemCallback {
        /* renamed from: a */
        void mo53158a(int i, String str);

        /* renamed from: a */
        void mo53159a(XGetStorageItemMethodResultModel bVar, String str);

        /* renamed from: com.bytedance.ies.xbridge.g.a.b$a$a */
        public static final class C14441a {
            /* renamed from: a */
            public static /* synthetic */ void m58393a(XGetStorageItemCallback aVar, XGetStorageItemMethodResultModel bVar, String str, int i, Object obj) {
                if (obj == null) {
                    if ((i & 2) != 0) {
                        str = "";
                    }
                    aVar.mo53159a(bVar, str);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSuccess");
            }
        }
    }
}
