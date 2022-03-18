package com.bytedance.ies.xbridge.storage.base;

import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.bridgeInterfaces.XCoreBridgeMethod;
import com.bytedance.ies.xbridge.model.results.XDefaultResultModel;
import com.bytedance.ies.xbridge.storage.model.XRemoveStorageItemMethodParamModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bytedance.ies.xbridge.g.a.c */
public abstract class AbsXRemoveStorageItemMethod extends XCoreBridgeMethod {

    /* renamed from: a */
    private final String f38069a = "x.removeStorageItem";

    /* renamed from: c */
    private final XBridgeMethod.Access f38070c = XBridgeMethod.Access.PRIVATE;

    /* renamed from: a */
    public abstract void mo34018a(XRemoveStorageItemMethodParamModel cVar, XRemoveStorageItemCallback aVar, XBridgePlatformType xBridgePlatformType);

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f38069a;
    }

    /* renamed from: com.bytedance.ies.xbridge.g.a.c$b */
    public static final class C14444b implements XRemoveStorageItemCallback {

        /* renamed from: a */
        final /* synthetic */ AbsXRemoveStorageItemMethod f38071a;

        /* renamed from: b */
        final /* synthetic */ XBridgeMethod.Callback f38072b;

        C14444b(AbsXRemoveStorageItemMethod cVar, XBridgeMethod.Callback aVar) {
            this.f38071a = cVar;
            this.f38072b = aVar;
        }

        @Override // com.bytedance.ies.xbridge.storage.base.AbsXRemoveStorageItemMethod.XRemoveStorageItemCallback
        /* renamed from: a */
        public void mo53160a(int i, String str) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            XCoreBridgeMethod.m58217a(this.f38071a, this.f38072b, i, str, null, 8, null);
        }

        @Override // com.bytedance.ies.xbridge.storage.base.AbsXRemoveStorageItemMethod.XRemoveStorageItemCallback
        /* renamed from: a */
        public void mo53161a(XDefaultResultModel bVar, String str) {
            Intrinsics.checkParameterIsNotNull(bVar, "result");
            Intrinsics.checkParameterIsNotNull(str, "msg");
            this.f38071a.mo52932a(this.f38072b, XDefaultResultModel.f38032a.mo53121a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public void mo33975a(XReadableMap hVar, XBridgeMethod.Callback aVar, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(hVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        XRemoveStorageItemMethodParamModel a = XRemoveStorageItemMethodParamModel.f38081b.mo53172a(hVar);
        if (a == null) {
            XCoreBridgeMethod.m58217a(this, aVar, -3, null, null, 12, null);
        } else {
            mo34018a(a, new C14444b(this, aVar), xBridgePlatformType);
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.g.a.c$a */
    public interface XRemoveStorageItemCallback {
        /* renamed from: a */
        void mo53160a(int i, String str);

        /* renamed from: a */
        void mo53161a(XDefaultResultModel bVar, String str);

        /* renamed from: com.bytedance.ies.xbridge.g.a.c$a$a */
        public static final class C14443a {
            /* renamed from: a */
            public static /* synthetic */ void m58401a(XRemoveStorageItemCallback aVar, XDefaultResultModel bVar, String str, int i, Object obj) {
                if (obj == null) {
                    if ((i & 2) != 0) {
                        str = "";
                    }
                    aVar.mo53161a(bVar, str);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSuccess");
            }
        }
    }
}
