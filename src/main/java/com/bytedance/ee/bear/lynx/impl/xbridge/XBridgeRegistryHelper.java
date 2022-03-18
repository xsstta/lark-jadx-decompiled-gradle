package com.bytedance.ee.bear.lynx.impl.xbridge;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ies.xbridge.XBridge;
import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.api.IContainerIDProvider;
import com.bytedance.ies.xbridge.api.INameSpaceProvider;
import com.bytedance.ies.xbridge.model.collections.defaultimpl.DefaultXReadableMapImpl;
import com.bytedance.ies.xbridge.model.context.XContextProviderFactory;
import com.bytedance.sdk.bridge.js.delegate.JsCallHandler;
import com.bytedance.sdk.bridge.js.delegate.JsCallInterceptor;
import com.bytedance.sdk.bridge.js.delegate.JsCallInterceptorManager;
import com.bytedance.sdk.bridge.js.spec.JsBridgeContext;
import com.bytedance.sdk.bridge.lynx.ILynxViewProvider;
import com.bytedance.sdk.bridge.lynx.LynxBridgeContext;
import com.bytedance.sdk.bridge.model.BridgeResult;
import com.google.firebase.messaging.Constants;
import com.lynx.tasm.LynxView;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007J\u0006\u0010\u0016\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/XBridgeRegistryHelper;", "Lcom/bytedance/sdk/bridge/js/delegate/JsCallInterceptor;", "()V", "idProvider", "Lcom/bytedance/ee/bear/lynx/impl/xbridge/ContainerIDProvider;", "myViewRef", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "getContainerId", "", "getView", "context", "Lcom/bytedance/sdk/bridge/js/spec/JsBridgeContext;", "intercept", "", "name", "params", "Lorg/json/JSONObject;", "registerXBridges", "", "Landroid/content/Context;", "view", "unRegisterXBridges", "Companion", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.d */
public final class XBridgeRegistryHelper extends JsCallInterceptor {

    /* renamed from: a */
    public static final Companion f23806a = new Companion(null);

    /* renamed from: c */
    private final ContainerIDProvider f23807c = new ContainerIDProvider();

    /* renamed from: d */
    private WeakReference<View> f23808d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/XBridgeRegistryHelper$Companion;", "", "()V", "TAG", "", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/lynx/impl/xbridge/XBridgeRegistryHelper$registerXBridges$contextProviderFactory$1$1", "Lcom/bytedance/ies/xbridge/api/INameSpaceProvider;", "getNameSpace", "", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.d$c */
    public static final class C8849c implements INameSpaceProvider {
        C8849c() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/lynx/impl/xbridge/XBridgeRegistryHelper$registerXBridges$1$1$1", "Lcom/bytedance/sdk/bridge/js/delegate/JsCallHandler;", "invoke", "", "params", "Lorg/json/JSONObject;", "context", "Lcom/bytedance/sdk/bridge/js/spec/JsBridgeContext;", "onTerminate", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.d$b */
    public static final class C8847b implements JsCallHandler {

        /* renamed from: a */
        final /* synthetic */ XBridgeMethod f23809a;

        @Override // com.bytedance.sdk.bridge.js.delegate.JsCallHandler
        /* renamed from: a */
        public void mo33970a() {
            this.f23809a.mo33998b();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/lynx/impl/xbridge/XBridgeRegistryHelper$registerXBridges$1$1$1$invoke$1", "Lcom/bytedance/ies/xbridge/XBridgeMethod$Callback;", "invoke", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "", "", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.d$b$a */
        public static final class C8848a implements XBridgeMethod.Callback {

            /* renamed from: a */
            final /* synthetic */ JsBridgeContext f23810a;

            C8848a(JsBridgeContext dVar) {
                this.f23810a = dVar;
            }

            @Override // com.bytedance.ies.xbridge.XBridgeMethod.Callback
            /* renamed from: a */
            public void mo33972a(Map<String, Object> map) {
                Object obj;
                Intrinsics.checkParameterIsNotNull(map, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                try {
                    Result.Companion aVar = Result.Companion;
                    C8848a aVar2 = this;
                    Object obj2 = map.get("code");
                    Object obj3 = map.get("msg");
                    if (obj3 != null) {
                        String str = (String) obj3;
                        Object obj4 = map.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                        if (!(obj4 instanceof Map)) {
                            obj4 = null;
                        }
                        Map map2 = (Map) obj4;
                        if (Intrinsics.areEqual(obj2, (Object) 1)) {
                            BridgeResult.Companion aVar3 = BridgeResult.f50535a;
                            if (map2 == null) {
                                map2 = MapsKt.emptyMap();
                            }
                            this.f23810a.mo69666a(aVar3.mo69763a(new JSONObject(map2), str));
                        } else {
                            if (map2 == null) {
                                map2 = MapsKt.emptyMap();
                            }
                            JSONObject jSONObject = new JSONObject(map2);
                            jSONObject.put("errorCode", obj2);
                            this.f23810a.mo69666a(BridgeResult.f50535a.mo69761a(str, jSONObject));
                        }
                        obj = Result.m271569constructorimpl(Unit.INSTANCE);
                        Throwable r5 = Result.m271572exceptionOrNullimpl(obj);
                        if (r5 != null) {
                            this.f23810a.mo69666a(BridgeResult.Companion.m75332a(BridgeResult.f50535a, r5.getMessage(), (JSONObject) null, 2, (Object) null));
                            return;
                        }
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                } catch (Throwable th) {
                    Result.Companion aVar4 = Result.Companion;
                    obj = Result.m271569constructorimpl(C69097g.m265890a(th));
                }
            }
        }

        C8847b(XBridgeMethod xBridgeMethod) {
            this.f23809a = xBridgeMethod;
        }

        @Override // com.bytedance.sdk.bridge.js.delegate.JsCallHandler
        /* renamed from: a */
        public void mo33971a(JSONObject jSONObject, JsBridgeContext dVar) {
            XBridgePlatformType xBridgePlatformType;
            Intrinsics.checkParameterIsNotNull(dVar, "context");
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            if (dVar.mo69665a() != null) {
                xBridgePlatformType = XBridgePlatformType.WEB;
            } else {
                xBridgePlatformType = XBridgePlatformType.LYNX;
            }
            this.f23809a.mo33975a(new DefaultXReadableMapImpl(jSONObject), new C8848a(dVar), xBridgePlatformType);
        }
    }

    /* renamed from: a */
    public final String mo33966a() {
        return this.f23807c.mo33964a();
    }

    /* renamed from: b */
    public final void mo33969b() {
        JsCallInterceptorManager.f50478a.mo69619b(this);
        WeakReference<View> weakReference = this.f23808d;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f23808d = null;
        C13479a.m54764b("ccm-lynx: XBridgeRegistryHelper", "unRegisterXBridges");
    }

    /* renamed from: a */
    private final View m37093a(JsBridgeContext dVar) {
        LynxView lynxView;
        if (!(dVar instanceof LynxBridgeContext)) {
            return dVar.mo69665a();
        }
        ILynxViewProvider g = ((LynxBridgeContext) dVar).mo69748g();
        if (g != null) {
            lynxView = g.mo69740a();
        } else {
            lynxView = null;
        }
        return lynxView;
    }

    /* renamed from: a */
    public final void mo33967a(Context context, View view) {
        View view2;
        boolean z;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "view");
        C13479a.m54764b("ccm-lynx: XBridgeRegistryHelper", "registerXBridges");
        WeakReference<View> weakReference = this.f23808d;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (view2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.f23808d = new WeakReference<>(view);
        if (z) {
            C13479a.m54764b("ccm-lynx: XBridgeRegistryHelper", "has register bridges");
            return;
        }
        XBridgeService.m37101a();
        XContextProviderFactory cVar = new XContextProviderFactory();
        cVar.mo53117a(Context.class, context);
        cVar.mo53118b(INameSpaceProvider.class, new C8849c());
        cVar.mo53118b(XBridgeMethod.JsEventDelegate.class, new XBridgeJsEventDelegate(view));
        cVar.mo53118b(IContainerIDProvider.class, this.f23807c);
        Map<String, Class<? extends XBridgeMethod>> a = XBridge.f37982a.mo52925a(XBridgePlatformType.ALL, "ccm-bridge");
        if (a != null) {
            for (Map.Entry<String, Class<? extends XBridgeMethod>> entry : a.entrySet()) {
                try {
                    Result.Companion aVar = Result.Companion;
                    XBridgeMethod xBridgeMethod = (XBridgeMethod) entry.getValue().newInstance();
                    xBridgeMethod.mo52923a(cVar);
                    mo69614a(xBridgeMethod.mo33973a(), new C8847b(xBridgeMethod));
                    Result.m271569constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion aVar2 = Result.Companion;
                    Result.m271569constructorimpl(C69097g.m265890a(th));
                }
            }
        }
        JsCallInterceptorManager.f50478a.mo69617a(this);
    }

    @Override // com.bytedance.sdk.bridge.js.delegate.JsCallInterceptor
    /* renamed from: a */
    public boolean mo33968a(String str, JSONObject jSONObject, JsBridgeContext dVar) {
        View view;
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(dVar, "context");
        WeakReference<View> weakReference = this.f23808d;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (view == null || !Intrinsics.areEqual(m37093a(dVar), view)) {
            return false;
        }
        return super.mo33968a(str, jSONObject, dVar);
    }
}
