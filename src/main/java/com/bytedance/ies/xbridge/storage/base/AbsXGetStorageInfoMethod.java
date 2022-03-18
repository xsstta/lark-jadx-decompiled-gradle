package com.bytedance.ies.xbridge.storage.base;

import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.bridgeInterfaces.XCoreBridgeMethod;
import com.bytedance.ies.xbridge.model.params.XDefaultParamModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ies/xbridge/storage/base/AbsXGetStorageInfoMethod;", "Lcom/bytedance/ies/xbridge/bridgeInterfaces/XCoreBridgeMethod;", "()V", "access", "Lcom/bytedance/ies/xbridge/XBridgeMethod$Access;", "getAccess", "()Lcom/bytedance/ies/xbridge/XBridgeMethod$Access;", "name", "", "getName", "()Ljava/lang/String;", "handle", "", "params", "Lcom/bytedance/ies/xbridge/XReadableMap;", "callback", "Lcom/bytedance/ies/xbridge/XBridgeMethod$Callback;", ShareHitPoint.f121869d, "Lcom/bytedance/ies/xbridge/XBridgePlatformType;", "Lcom/bytedance/ies/xbridge/model/params/XDefaultParamModel;", "Lcom/bytedance/ies/xbridge/storage/base/AbsXGetStorageInfoMethod$XGetStorageInfoCallback;", "provideParamModel", "Ljava/lang/Class;", "provideResultModel", "Lcom/bytedance/ies/xbridge/storage/model/XGetStorageInfoMethodResultModel;", "XGetStorageInfoCallback", "x-bridge-storage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.g.a.a */
public abstract class AbsXGetStorageInfoMethod extends XCoreBridgeMethod {

    /* renamed from: a */
    private final String f38061a = "x.getStorageInfo";

    /* renamed from: c */
    private final XBridgeMethod.Access f38062c = XBridgeMethod.Access.PRIVATE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ies/xbridge/storage/base/AbsXGetStorageInfoMethod$XGetStorageInfoCallback;", "", "onFailure", "", "code", "", "msg", "", "onSuccess", "result", "Lcom/bytedance/ies/xbridge/storage/model/XGetStorageInfoMethodResultModel;", "x-bridge-storage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.g.a.a$a */
    public interface XGetStorageInfoCallback {
        /* renamed from: a */
        void mo53157a(int i, String str);
    }

    /* renamed from: a */
    public abstract void mo34013a(XDefaultParamModel bVar, XGetStorageInfoCallback aVar, XBridgePlatformType xBridgePlatformType);

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f38061a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/bytedance/ies/xbridge/storage/base/AbsXGetStorageInfoMethod$handle$1", "Lcom/bytedance/ies/xbridge/storage/base/AbsXGetStorageInfoMethod$XGetStorageInfoCallback;", "onFailure", "", "code", "", "msg", "", "onSuccess", "result", "Lcom/bytedance/ies/xbridge/storage/model/XGetStorageInfoMethodResultModel;", "x-bridge-storage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.g.a.a$b */
    public static final class C14440b implements XGetStorageInfoCallback {

        /* renamed from: a */
        final /* synthetic */ AbsXGetStorageInfoMethod f38063a;

        /* renamed from: b */
        final /* synthetic */ XBridgeMethod.Callback f38064b;

        C14440b(AbsXGetStorageInfoMethod aVar, XBridgeMethod.Callback aVar2) {
            this.f38063a = aVar;
            this.f38064b = aVar2;
        }

        @Override // com.bytedance.ies.xbridge.storage.base.AbsXGetStorageInfoMethod.XGetStorageInfoCallback
        /* renamed from: a */
        public void mo53157a(int i, String str) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            XCoreBridgeMethod.m58217a(this.f38063a, this.f38064b, i, str, null, 8, null);
        }
    }

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public void mo33975a(XReadableMap hVar, XBridgeMethod.Callback aVar, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(hVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        mo34013a(XDefaultParamModel.f38031a.mo53120a(hVar), new C14440b(this, aVar), xBridgePlatformType);
    }
}
