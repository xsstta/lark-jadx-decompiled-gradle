package com.bytedance.ee.bridge.connectormodule;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.facebook.react.bridge.ReactContext;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.ee.bridge.connectormodule.a */
public class C12603a {

    /* renamed from: a */
    public Set<AbstractC12607c> f33743a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public WeakReference<NativeToJsBridge> f33744b;

    /* renamed from: c */
    private volatile HandlerC12605b f33745c;

    /* renamed from: d */
    private volatile HandlerC12604a f33746d;

    /* renamed from: e */
    private ReactContext f33747e;

    /* renamed from: a */
    private void m52312a() {
        try {
            if (C12606b.f33754e) {
                C13479a.m54772d(C12606b.f33755f, "init: begin");
            }
            this.f33744b = new WeakReference<>(this.f33747e.getJSModule(NativeToJsBridge.class));
            JsToNativeBridge jsToNativeBridge = (JsToNativeBridge) this.f33747e.getNativeModule(JsToNativeBridge.class);
            this.f33745c = new HandlerC12605b();
            this.f33746d = new HandlerC12604a();
            if (jsToNativeBridge != null) {
                jsToNativeBridge.setConnector(this);
            }
        } catch (Exception e) {
            C13479a.m54759a(C12606b.f33755f, "init: ", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.bytedance.ee.bridge.connectormodule.a$a */
    public final class HandlerC12604a extends Handler {
        public HandlerC12604a() {
        }

        public void handleMessage(Message message) {
            String str = C12606b.f33753d;
            C13479a.m54772d(str, "ReceiverHandler.handleMessage: 101 " + message);
            int i = message.what;
            if (i == 1) {
                AbstractC12607c cVar = (AbstractC12607c) message.obj;
                if (C12606b.f33752c) {
                    String str2 = C12606b.f33753d;
                    C13479a.m54772d(str2, "registerDataChangeListener: listener size=" + C12603a.this.f33743a.size());
                }
                if (cVar != null) {
                    C12603a.this.f33743a.add(cVar);
                } else {
                    C13479a.m54775e(C12606b.f33753d, "registerDataChangeListener: listener is null");
                }
            } else if (i == 2) {
                AbstractC12607c cVar2 = (AbstractC12607c) message.obj;
                if (C12606b.f33752c) {
                    String str3 = C12606b.f33753d;
                    C13479a.m54772d(str3, "unRegisterDataChangeListener: listener size=" + C12603a.this.f33743a.size());
                }
                if (cVar2 != null) {
                    C12603a.this.f33743a.remove(cVar2);
                } else {
                    C13479a.m54775e(C12606b.f33753d, "unRegisterDataChangeListener: listener is null");
                }
            }
        }

        /* renamed from: a */
        public void mo47895a(int i, AbstractC12607c cVar) {
            sendMessage(Message.obtain(this, i, cVar));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.bytedance.ee.bridge.connectormodule.a$b */
    public final class HandlerC12605b extends Handler {
        public HandlerC12605b() {
        }

        public void handleMessage(Message message) {
            String str = C12606b.f33751b;
            C13479a.m54772d(str, "SenderHandler.handleMessage: 89 " + message);
            int i = message.what;
            if (i == 3) {
                String str2 = (String) message.obj;
                if (C12606b.f33750a) {
                    String str3 = C12606b.f33751b;
                    C13479a.m54772d(str3, "requestFromNative:  request=" + str2);
                }
                if (C12603a.this.f33744b == null || TextUtils.isEmpty(str2)) {
                    C13479a.m54758a(C12606b.f33751b, "requestFromNative: mNativeToJsBridge is null ");
                    return;
                }
                NativeToJsBridge nativeToJsBridge = C12603a.this.f33744b.get();
                if (nativeToJsBridge != null) {
                    String str4 = C12606b.f33751b;
                    C13479a.m54772d(str4, "BridgeConnector.requestFromNative: string start send " + System.currentTimeMillis());
                    nativeToJsBridge.requestFromNative(str2);
                    return;
                }
                C13479a.m54775e(C12606b.f33751b, "requestFromNative: bridge is null");
            } else if (i == 5) {
                String str5 = (String) message.obj;
                if (C12606b.f33750a) {
                    String str6 = C12606b.f33751b;
                    C13479a.m54772d(str6, "requestFromDocs:  request=" + str5);
                }
                if (C12603a.this.f33744b == null || TextUtils.isEmpty(str5)) {
                    C13479a.m54758a(C12606b.f33751b, "requestFromDocs: mNativeToJsBridge is null ");
                    return;
                }
                NativeToJsBridge nativeToJsBridge2 = C12603a.this.f33744b.get();
                if (nativeToJsBridge2 != null) {
                    String str7 = C12606b.f33751b;
                    C13479a.m54772d(str7, "BridgeConnector.requestFromDocs: string start send " + System.currentTimeMillis());
                    nativeToJsBridge2.requestFromDocs(str5);
                    return;
                }
                C13479a.m54775e(C12606b.f33751b, "requestFromDocs: bridge is null");
            }
        }

        /* renamed from: a */
        public void mo47897a(int i, String str) {
            sendMessage(Message.obtain(this, i, str));
        }
    }

    public C12603a(ReactContext reactContext) {
        this.f33747e = reactContext;
        m52312a();
    }

    /* renamed from: a */
    public void mo47889a(AbstractC12607c cVar) {
        if (C12606b.f33752c) {
            String str = C12606b.f33753d;
            C13479a.m54772d(str, "registerDataChangeListener: listener size=" + this.f33743a.size());
        }
        this.f33746d.mo47895a(1, cVar);
    }

    /* renamed from: b */
    public void mo47891b(AbstractC12607c cVar) {
        if (C12606b.f33754e) {
            String str = C12606b.f33755f;
            C13479a.m54772d(str, "unRegisterDataChangeListener: listener size=" + this.f33743a.size());
        }
        this.f33746d.mo47895a(2, cVar);
    }

    /* renamed from: c */
    public void mo47893c(String str) {
        if (C12606b.f33750a) {
            String str2 = C12606b.f33751b;
            C13479a.m54772d(str2, "requestFromNative:  request=" + str);
        }
        this.f33745c.mo47897a(3, str);
    }

    /* renamed from: d */
    public void mo47894d(String str) {
        if (C12606b.f33750a) {
            String str2 = C12606b.f33751b;
            C13479a.m54772d(str2, "requestFromDocs:  request=" + str);
        }
        this.f33745c.mo47897a(5, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo47892b(String str) {
        if (this.f33743a.isEmpty()) {
            C13479a.m54764b(C12606b.f33753d, "responseFromDocs: no listener");
            return;
        }
        for (AbstractC12607c cVar : this.f33743a) {
            cVar.mo47850c(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo47890a(String str) {
        if (this.f33743a.isEmpty()) {
            C13479a.m54764b(C12606b.f33753d, "responseFromJs: no listener");
            return;
        }
        for (AbstractC12607c cVar : this.f33743a) {
            cVar.mo47848b(str);
        }
    }
}
