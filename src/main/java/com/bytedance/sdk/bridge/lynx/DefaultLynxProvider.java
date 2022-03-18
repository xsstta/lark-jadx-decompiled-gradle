package com.bytedance.sdk.bridge.lynx;

import com.lynx.tasm.LynxView;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/sdk/bridge/lynx/DefaultLynxProvider;", "Lcom/bytedance/sdk/bridge/lynx/ILynxViewProvider;", "()V", "ref", "Ljava/lang/ref/WeakReference;", "Lcom/lynx/tasm/LynxView;", "getLynxView", "setLynxView", "", "lynxView", "lynx-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.lynx.a */
public final class DefaultLynxProvider implements ILynxViewProvider {

    /* renamed from: a */
    private WeakReference<LynxView> f50516a;

    @Override // com.bytedance.sdk.bridge.lynx.ILynxViewProvider
    /* renamed from: a */
    public LynxView mo69740a() {
        WeakReference<LynxView> weakReference = this.f50516a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public void mo69741a(LynxView lynxView) {
        Intrinsics.checkParameterIsNotNull(lynxView, "lynxView");
        this.f50516a = new WeakReference<>(lynxView);
    }
}
