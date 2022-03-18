package com.bytedance.sdk.bridge.lynx;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.sdk.bridge.js.delegate.JsBridgeDelegate;
import com.bytedance.sdk.bridge.js.delegate.JsBridgeRequest;
import com.google.firebase.messaging.Constants;
import com.lynx.jsbridge.LynxContextModule;
import com.lynx.jsbridge.LynxMethod;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.AbstractC26684l;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/bytedance/sdk/bridge/lynx/LynxDelegateBridgeModule;", "Lcom/lynx/jsbridge/LynxContextModule;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "(Lcom/lynx/tasm/behavior/LynxContext;)V", "obj", "", "(Lcom/lynx/tasm/behavior/LynxContext;Ljava/lang/Object;)V", "getContext", "()Lcom/lynx/tasm/behavior/LynxContext;", "getObj", "()Ljava/lang/Object;", "call", "", "bridgeName", "", "params", "Lcom/lynx/react/bridge/ReadableMap;", "callback", "Lcom/lynx/react/bridge/Callback;", "Companion", "lynx-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class LynxDelegateBridgeModule extends LynxContextModule {
    public static final Companion Companion = new Companion(null);
    private final AbstractC26684l context;
    private final Object obj;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/sdk/bridge/lynx/LynxDelegateBridgeModule$Companion;", "", "()V", "NAME", "", "lynx-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.sdk.bridge.lynx.LynxDelegateBridgeModule$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final AbstractC26684l getContext() {
        return this.context;
    }

    public final Object getObj() {
        return this.obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LynxDelegateBridgeModule(AbstractC26684l lVar) {
        this(lVar, null);
        Intrinsics.checkParameterIsNotNull(lVar, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxDelegateBridgeModule(AbstractC26684l lVar, Object obj2) {
        super(lVar, obj2);
        Intrinsics.checkParameterIsNotNull(lVar, "context");
        this.context = lVar;
        this.obj = obj2;
    }

    @LynxMethod
    public final void call(String str, ReadableMap readableMap, Callback callback) {
        ILynxCellWebView bVar;
        ILynxViewProvider cVar;
        Intrinsics.checkParameterIsNotNull(str, "bridgeName");
        Lifecycle lifecycle = null;
        if (this.mParam instanceof HashMap) {
            Object obj2 = this.mParam;
            if (obj2 != null) {
                Object obj3 = ((HashMap) obj2).get(ILynxCellWebView.class);
                if (!(obj3 instanceof ILynxCellWebView)) {
                    obj3 = null;
                }
                bVar = (ILynxCellWebView) obj3;
                if (bVar == null) {
                    bVar = LynxBridge.m75308a(this.context);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.HashMap<*, *> /* = java.util.HashMap<*, *> */");
            }
        } else {
            bVar = LynxBridge.m75308a(this.context);
        }
        if (this.mParam instanceof HashMap) {
            Object obj4 = this.mParam;
            if (obj4 != null) {
                Object obj5 = ((HashMap) obj4).get(ILynxViewProvider.class);
                if (!(obj5 instanceof ILynxViewProvider)) {
                    obj5 = null;
                }
                cVar = (ILynxViewProvider) obj5;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.HashMap<*, *> /* = java.util.HashMap<*, *> */");
            }
        } else {
            cVar = null;
        }
        if (bVar.mo69704b() instanceof LifecycleOwner) {
            Activity b = bVar.mo69704b();
            if (!(b instanceof LifecycleOwner)) {
                b = null;
            }
            LifecycleOwner lifecycleOwner = (LifecycleOwner) b;
            if (lifecycleOwner != null) {
                lifecycle = lifecycleOwner.getLifecycle();
            }
        }
        bVar.mo69744a(callback);
        bVar.mo69743a(bVar.mo69745d() + 1);
        JSONObject jSONObject = new JSONObject();
        if (readableMap != null) {
            ReadableMap map = readableMap.getMap(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (map != null && (map instanceof JavaOnlyMap)) {
                jSONObject = LynxBridgeConverter.m75315a((JavaOnlyMap) map);
            }
            JsBridgeRequest a = LynxBridge.m75306a(str, jSONObject, String.valueOf(bVar.mo69745d()));
            JsBridgeDelegate.f50450a.mo69601a(a, LynxBridge.m75307a(bVar, a.mo69610a(), a.mo69611b(), cVar, callback), lifecycle);
        }
    }

    public static /* synthetic */ void call$default(LynxDelegateBridgeModule lynxDelegateBridgeModule, String str, ReadableMap readableMap, Callback callback, int i, Object obj2) {
        if ((i & 2) != 0) {
            readableMap = null;
        }
        if ((i & 4) != 0) {
            callback = null;
        }
        lynxDelegateBridgeModule.call(str, readableMap, callback);
    }
}
