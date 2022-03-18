package com.tt.miniapp.ac;

import android.util.Log;
import android.util.SparseArray;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d;
import com.bytedance.ee.lark.infra.network.p622a.p626b.C12810b;
import com.bytedance.ee.lark.infra.network.p622a.p626b.C12811c;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.manager.C66420d;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.entity.C67522b;
import com.tt.refer.common.util.C67866g;
import okhttp3.Response;
import okio.ByteString;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.ac.a */
public class C65727a {

    /* renamed from: a */
    SparseArray<C12811c> f165610a = new SparseArray<>();

    /* renamed from: b */
    private int f165611b;

    /* renamed from: c */
    private IAppContext f165612c;

    /* renamed from: com.tt.miniapp.ac.a$a */
    public interface AbstractC65731a {
        /* renamed from: a */
        void mo230337a(String str, String str2);
    }

    /* renamed from: a */
    public boolean mo230336a(int i, ByteString byteString, C67522b bVar) {
        if (byteString == null) {
            bVar.mo234467a("data is null");
            return false;
        }
        C12811c cVar = this.f165610a.get(i);
        if (cVar == null) {
            bVar.mo234467a("socket no create socketId == ").mo234467a(Integer.valueOf(i));
        } else if (cVar.mo48381a() != null) {
            AppBrandLogger.m52828d("tma_SocketManager", "sendArrayBuffer ", byteString, " ", Integer.valueOf(i));
            return cVar.mo48381a().send(byteString);
        } else {
            bVar.mo234467a("webSocket no open");
        }
        return false;
    }

    /* renamed from: b */
    private int m257687b() {
        int i = this.f165611b + 1;
        this.f165611b = i;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.ac.a$b */
    public static class C65732b extends AbstractC12821d {

        /* renamed from: a */
        private int f165616a;

        /* renamed from: b */
        private AbstractC65731a f165617b;

        /* renamed from: c */
        private IAppContext f165618c;

        @Override // com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d
        /* renamed from: a */
        public void mo48408a() {
            AppBrandLogger.m52828d("tma_SocketManager", "onReconnect ");
        }

        @Override // com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d
        /* renamed from: a */
        public void mo48410a(String str) {
            AppBrandLogger.m52828d("tma_SocketManager", "onMessage String ", str);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("socketTaskId", this.f165616a);
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, C65727a.m257685a("onSocketTaskStateChange", "ok"));
                jSONObject.put("state", "message");
                jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str);
                C65727a.m257686a("onSocketTaskStateChange", jSONObject.toString(), this.f165617b, this.f165618c);
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "tma_SocketManager", e.getStackTrace());
            }
        }

        @Override // com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d
        /* renamed from: a */
        public void mo48412a(Response response) {
            AppBrandLogger.m52828d("tma_SocketManager", "onOpen");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("socketTaskId", this.f165616a);
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, C65727a.m257685a("onSocketTaskStateChange", "ok"));
                jSONObject.put("state", "open");
                if (!(response == null || response.headers() == null)) {
                    jSONObject.put("header", response.headers().toString());
                }
                C65727a.m257686a("onSocketTaskStateChange", jSONObject.toString(), this.f165617b, this.f165618c);
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "tma_SocketManager", e.getStackTrace());
            }
        }

        @Override // com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d
        /* renamed from: a */
        public void mo48413a(ByteString byteString) {
            AppBrandLogger.m52828d("tma_SocketManager", "onMessage ByteString ");
            if (byteString != null) {
                String base64 = byteString.base64();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("socketTaskId", this.f165616a);
                    jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, C65727a.m257685a("onSocketTaskStateChange", "ok"));
                    jSONObject.put("state", "message");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("key", Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    jSONObject2.put("base64", base64);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject2);
                    jSONObject.put("__nativeBuffers__", jSONArray);
                    C65727a.m257686a("onSocketTaskStateChange", jSONObject.toString(), this.f165617b, this.f165618c);
                } catch (Exception e) {
                    AppBrandLogger.stacktrace(6, "tma_SocketManager", e.getStackTrace());
                }
            }
        }

        @Override // com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d
        /* renamed from: a */
        public void mo48409a(int i, String str) {
            AppBrandLogger.m52828d("tma_SocketManager", "onClosing code ", Integer.valueOf(i), " reason ", str);
        }

        @Override // com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d
        /* renamed from: b */
        public void mo48414b(int i, String str) {
            AppBrandLogger.m52828d("tma_SocketManager", "onClosed code ", Integer.valueOf(i), " reason ", str);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("socketTaskId", this.f165616a);
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, C65727a.m257685a("onSocketTaskStateChange", "ok"));
                jSONObject.put("state", "close");
                C65727a.m257686a("onSocketTaskStateChange", jSONObject.toString(), this.f165617b, this.f165618c);
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "tma_SocketManager", e.getStackTrace());
            }
        }

        @Override // com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d
        /* renamed from: a */
        public void mo48411a(Throwable th, Response response) {
            if (th != null) {
                try {
                    AppBrandLogger.m52831w("tma_SocketManager", "onFailure ", Log.getStackTraceString(th));
                } catch (Exception e) {
                    AppBrandLogger.stacktrace(6, "tma_SocketManager", e.getStackTrace());
                    return;
                }
            } else {
                AppBrandLogger.m52831w("tma_SocketManager", "onFailure ");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("socketTaskId", this.f165616a);
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, C65727a.m257685a("onSocketTaskStateChange", "ok"));
            jSONObject.put("state", "close");
            C65727a.m257686a("onSocketTaskStateChange", jSONObject.toString(), this.f165617b, this.f165618c);
        }

        public C65732b(int i, AbstractC65731a aVar, IAppContext iAppContext) {
            this.f165616a = i;
            this.f165617b = aVar;
            this.f165618c = iAppContext;
        }
    }

    /* renamed from: a */
    public void mo230332a() {
        AppBrandLogger.m52828d("tma_SocketManager", "closeAllSocket");
        SparseArray<C12811c> clone = this.f165610a.clone();
        int size = clone.size();
        for (int i = 0; i < size; i++) {
            mo230333a(clone.keyAt(i), CommonCode.StatusCode.API_CLIENT_EXPIRED, "app in background");
        }
    }

    /* renamed from: a */
    public int mo230330a(C12810b bVar) {
        return mo230331a(bVar, (AbstractC65731a) null);
    }

    /* renamed from: a */
    public static C65727a m257684a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234287h();
    }

    public C65727a(IAppContext iAppContext) {
        this.f165612c = iAppContext;
        C66420d foreBackgroundManager = AppbrandApplicationImpl.getInst(iAppContext).getForeBackgroundManager();
        foreBackgroundManager.mo231958a(new C66420d.C66427b() {
            /* class com.tt.miniapp.ac.C65727a.C657281 */

            @Override // com.tt.miniapp.manager.C66420d.C66427b, com.tt.miniapp.manager.C66420d.AbstractC66428c
            /* renamed from: c */
            public void mo88042c() {
                C67866g.m264025a(new Action() {
                    /* class com.tt.miniapp.ac.C65727a.C657281.C657291 */

                    @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                    public void act() {
                        C65727a.this.mo230332a();
                    }
                }, Schedulers.shortIO());
            }
        });
        if (foreBackgroundManager.mo231963e()) {
            C67866g.m264025a(new Action() {
                /* class com.tt.miniapp.ac.C65727a.C657302 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    C65727a.this.mo230332a();
                }
            }, Schedulers.shortIO());
        }
    }

    /* renamed from: a */
    public static String m257685a(String str, String str2) {
        return str + ":" + str2;
    }

    /* renamed from: a */
    public int mo230331a(C12810b bVar, AbstractC65731a aVar) {
        C12811c a = new C12811c.C12820a(AppbrandContext.getInst().getApplicationContext()).mo48406a(false).mo48404a(bVar).mo48405a(bVar.f34201a).mo48407a(this.f165612c);
        int b = m257687b();
        this.f165610a.put(b, a);
        a.mo48383a((AbstractC12821d) new C65732b(b, aVar, this.f165612c));
        a.mo48386c();
        return b;
    }

    /* renamed from: a */
    public boolean mo230333a(int i, int i2, String str) {
        return mo230334a(i, i2, str, (AbstractC65731a) null);
    }

    /* renamed from: a */
    public boolean mo230335a(int i, String str, C67522b bVar) {
        C12811c cVar = this.f165610a.get(i);
        if (cVar == null) {
            bVar.mo234467a("socket no create socketId == ").mo234467a(Integer.valueOf(i));
            return false;
        } else if (cVar.mo48381a() != null) {
            Log.d("tma_SocketManager", "sendText " + str + " " + i);
            Log.d("tma_SocketManager", "ByteString.encodeUtf8(txt) " + ByteString.encodeUtf8(str) + " " + i);
            return cVar.mo48381a().send(str);
        } else {
            bVar.mo234467a("webSocket no open");
            return false;
        }
    }

    /* renamed from: a */
    public static void m257686a(String str, String str2, AbstractC65731a aVar, IAppContext iAppContext) {
        AppBrandLogger.m52828d("tma_SocketManager", "sendMsg ", str, " ", str2);
        if (aVar != null) {
            aVar.mo230337a(str, str2);
        } else {
            C67432a.m262319a(iAppContext).getJsBridge().sendMsgToJsCore(str, str2);
        }
    }

    /* renamed from: a */
    public boolean mo230334a(int i, int i2, String str, AbstractC65731a aVar) {
        C12811c cVar = this.f165610a.get(i);
        boolean z = false;
        if (!(cVar == null || cVar.mo48381a() == null)) {
            AppBrandLogger.m52828d("tma_SocketManager", "closeSocket ", Integer.valueOf(i2), " ", str, " ", Integer.valueOf(i));
            z = cVar.mo48381a().close(i2, str);
        }
        if (!z) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("socketTaskId", i);
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, m257685a("onSocketTaskStateChange", "ok"));
                jSONObject.put("state", "close");
                m257686a("onSocketTaskStateChange", jSONObject.toString(), aVar, this.f165612c);
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "tma_SocketManager", e.getStackTrace());
            }
        }
        return true;
    }
}
