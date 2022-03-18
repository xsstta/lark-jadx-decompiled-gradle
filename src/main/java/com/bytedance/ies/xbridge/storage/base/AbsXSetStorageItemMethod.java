package com.bytedance.ies.xbridge.storage.base;

import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.bridgeInterfaces.XCoreBridgeMethod;
import com.bytedance.ies.xbridge.model.results.XDefaultResultModel;
import com.bytedance.ies.xbridge.storage.model.XSetStorageItemMethodParamModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bytedance.ies.xbridge.g.a.d */
public abstract class AbsXSetStorageItemMethod extends XCoreBridgeMethod {

    /* renamed from: a */
    private final String f38073a = "x.setStorageItem";

    /* renamed from: c */
    private final XBridgeMethod.Access f38074c = XBridgeMethod.Access.PRIVATE;

    /* renamed from: a */
    public abstract void mo34019a(XSetStorageItemMethodParamModel dVar, XSetStorageItemCallback aVar, XBridgePlatformType xBridgePlatformType);

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f38073a;
    }

    /* renamed from: com.bytedance.ies.xbridge.g.a.d$b */
    public static final class C14446b implements XSetStorageItemCallback {

        /* renamed from: a */
        final /* synthetic */ AbsXSetStorageItemMethod f38075a;

        /* renamed from: b */
        final /* synthetic */ XBridgeMethod.Callback f38076b;

        C14446b(AbsXSetStorageItemMethod dVar, XBridgeMethod.Callback aVar) {
            this.f38075a = dVar;
            this.f38076b = aVar;
        }

        @Override // com.bytedance.ies.xbridge.storage.base.AbsXSetStorageItemMethod.XSetStorageItemCallback
        /* renamed from: a */
        public void mo53162a(int i, String str) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            XCoreBridgeMethod.m58217a(this.f38075a, this.f38076b, i, str, null, 8, null);
        }

        @Override // com.bytedance.ies.xbridge.storage.base.AbsXSetStorageItemMethod.XSetStorageItemCallback
        /* renamed from: a */
        public void mo53163a(XDefaultResultModel bVar, String str) {
            Intrinsics.checkParameterIsNotNull(bVar, "result");
            Intrinsics.checkParameterIsNotNull(str, "msg");
            this.f38075a.mo52932a(this.f38076b, XDefaultResultModel.f38032a.mo53121a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public void mo33975a(XReadableMap hVar, XBridgeMethod.Callback aVar, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(hVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        XSetStorageItemMethodParamModel a = XSetStorageItemMethodParamModel.f38083c.mo53177a(hVar);
        if (a == null) {
            XCoreBridgeMethod.m58217a(this, aVar, -3, null, null, 12, null);
        } else {
            mo34019a(a, new C14446b(this, aVar), xBridgePlatformType);
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.g.a.d$a */
    public interface XSetStorageItemCallback {
        /* renamed from: a */
        void mo53162a(int i, String str);

        /* renamed from: a */
        void mo53163a(XDefaultResultModel bVar, String str);

        /* renamed from: com.bytedance.ies.xbridge.g.a.d$a$a */
        public static final class C14445a {
            /* renamed from: a */
            public static /* synthetic */ void m58409a(XSetStorageItemCallback aVar, XDefaultResultModel bVar, String str, int i, Object obj) {
                if (obj == null) {
                    if ((i & 2) != 0) {
                        str = "";
                    }
                    aVar.mo53163a(bVar, str);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSuccess");
            }
        }
    }
}
