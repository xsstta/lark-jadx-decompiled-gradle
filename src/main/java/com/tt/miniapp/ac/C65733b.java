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
import com.tt.frontendapiinterface.IApiOutputParam;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.manager.C66420d;
import com.tt.miniapp.p3324r.p3325a.C66698b;
import com.tt.miniapp.p3324r.p3325a.C66712f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.entity.C67522b;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.refer.common.util.C67866g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import okhttp3.Response;
import okio.ByteString;

/* renamed from: com.tt.miniapp.ac.b */
public class C65733b {

    /* renamed from: a */
    SparseArray<C12811c> f165619a = new SparseArray<>();

    /* renamed from: b */
    private int f165620b;

    /* renamed from: c */
    private IAppContext f165621c;

    /* renamed from: b */
    private int m257707b() {
        int i = this.f165620b + 1;
        this.f165620b = i;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.ac.b$a */
    public static class C65737a extends AbstractC12821d {

        /* renamed from: a */
        private int f165625a;

        /* renamed from: b */
        private IAppContext f165626b;

        @Override // com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d
        /* renamed from: a */
        public void mo48408a() {
            AppBrandLogger.m52830i("tma_SocketManagerV2", "WsListener->onReconnect.... ");
        }

        @Override // com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d
        /* renamed from: a */
        public void mo48410a(String str) {
            if (DebugUtil.debug()) {
                AppBrandLogger.m52828d("tma_SocketManagerV2", "onMessage String ", str);
            } else {
                AppBrandLogger.m52830i("tma_SocketManagerV2", "WsListener->onMessage....string");
            }
            try {
                C66698b.C66700b bVar = new C66698b.C66700b();
                bVar.f168377d = this.f165625a;
                bVar.f168374a = C65733b.m257705a("onSocketTaskStateChange", "ok");
                bVar.f168378e = "message";
                bVar.f168380g = str;
                C65733b.m257706a("onSocketTaskStateChange", bVar, this.f165626b);
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "tma_SocketManagerV2", e.getStackTrace());
            }
        }

        @Override // com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d
        /* renamed from: a */
        public void mo48412a(Response response) {
            AppBrandLogger.m52830i("tma_SocketManagerV2", "WsListener->onOpen>>", Integer.valueOf(this.f165625a));
            try {
                C66698b.C66700b bVar = new C66698b.C66700b();
                bVar.f168377d = this.f165625a;
                bVar.f168374a = C65733b.m257705a("onSocketTaskStateChange", "ok");
                bVar.f168378e = "open";
                if (!(response == null || response.headers() == null)) {
                    bVar.f168379f = response.headers().toString();
                }
                C65733b.m257706a("onSocketTaskStateChange", bVar, this.f165626b);
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "tma_SocketManagerV2", e.getStackTrace());
            }
        }

        @Override // com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d
        /* renamed from: a */
        public void mo48413a(ByteString byteString) {
            AppBrandLogger.m52830i("tma_SocketManagerV2", "WsListener->onMessage...ByteString ");
            if (byteString != null) {
                try {
                    C66698b.C66700b bVar = new C66698b.C66700b();
                    bVar.f168377d = this.f165625a;
                    bVar.f168374a = C65733b.m257705a("onSocketTaskStateChange", "ok");
                    bVar.f168378e = "message";
                    C66712f fVar = new C66712f(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, ByteBuffer.wrap(byteString.toByteArray()));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(fVar);
                    bVar.f168381h = arrayList;
                    C65733b.m257706a("onSocketTaskStateChange", bVar, this.f165626b);
                } catch (Exception e) {
                    AppBrandLogger.stacktrace(6, "tma_SocketManagerV2", e.getStackTrace());
                }
            }
        }

        public C65737a(int i, IAppContext iAppContext) {
            this.f165625a = i;
            this.f165626b = iAppContext;
        }

        @Override // com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d
        /* renamed from: a */
        public void mo48409a(int i, String str) {
            AppBrandLogger.m52830i("tma_SocketManagerV2", "onClosing code ", Integer.valueOf(i), " reason ", str);
        }

        @Override // com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d
        /* renamed from: b */
        public void mo48414b(int i, String str) {
            AppBrandLogger.m52830i("tma_SocketManagerV2", "onClosed code ", Integer.valueOf(i), " reason ", str);
            try {
                C66698b.C66700b bVar = new C66698b.C66700b();
                bVar.f168377d = this.f165625a;
                bVar.f168374a = C65733b.m257705a("onSocketTaskStateChange", "ok");
                bVar.f168378e = "close";
                C65733b.m257706a("onSocketTaskStateChange", bVar, this.f165626b);
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "tma_SocketManagerV2", e.getStackTrace());
            }
        }

        @Override // com.bytedance.ee.lark.infra.network.p622a.p626b.AbstractC12821d
        /* renamed from: a */
        public void mo48411a(Throwable th, Response response) {
            if (th != null) {
                try {
                    AppBrandLogger.m52831w("tma_SocketManagerV2", "onFailure ", Log.getStackTraceString(th));
                } catch (Exception e) {
                    AppBrandLogger.stacktrace(6, "tma_SocketManagerV2", e.getStackTrace());
                    return;
                }
            } else {
                AppBrandLogger.m52831w("tma_SocketManagerV2", "onFailure ");
            }
            C66698b.C66700b bVar = new C66698b.C66700b();
            bVar.f168377d = this.f165625a;
            bVar.f168374a = C65733b.m257705a("onSocketTaskStateChange", "ok");
            bVar.f168378e = "close";
            C65733b.m257706a("onSocketTaskStateChange", bVar, this.f165626b);
        }
    }

    /* renamed from: a */
    public void mo230339a() {
        AppBrandLogger.m52830i("tma_SocketManagerV2", "closeAllSocket");
        SparseArray<C12811c> clone = this.f165619a.clone();
        int size = clone.size();
        for (int i = 0; i < size; i++) {
            mo230340a(clone.keyAt(i), CommonCode.StatusCode.API_CLIENT_EXPIRED, "app in background");
        }
    }

    /* renamed from: a */
    public static C65733b m257704a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234288i();
    }

    public C65733b(IAppContext iAppContext) {
        this.f165621c = iAppContext;
        C66420d foreBackgroundManager = AppbrandApplicationImpl.getInst(iAppContext).getForeBackgroundManager();
        foreBackgroundManager.mo231958a(new C66420d.C66427b() {
            /* class com.tt.miniapp.ac.C65733b.C657341 */

            @Override // com.tt.miniapp.manager.C66420d.C66427b, com.tt.miniapp.manager.C66420d.AbstractC66428c
            /* renamed from: c */
            public void mo88042c() {
                C67866g.m264025a(new Action() {
                    /* class com.tt.miniapp.ac.C65733b.C657341.C657351 */

                    @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                    public void act() {
                        C65733b.this.mo230339a();
                    }
                }, Schedulers.shortIO());
            }
        });
        if (foreBackgroundManager.mo231963e()) {
            C67866g.m264025a(new Action() {
                /* class com.tt.miniapp.ac.C65733b.C657362 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    C65733b.this.mo230339a();
                }
            }, Schedulers.shortIO());
        }
    }

    /* renamed from: a */
    public int mo230338a(C12810b bVar) {
        AppBrandLogger.m52830i("tma_SocketManagerV2", "create task.......");
        C12811c a = new C12811c.C12820a(AppbrandContext.getInst().getApplicationContext()).mo48406a(false).mo48404a(bVar).mo48405a(bVar.f34201a).mo48407a(this.f165621c);
        int b = m257707b();
        this.f165619a.put(b, a);
        a.mo48383a((AbstractC12821d) new C65737a(b, this.f165621c));
        a.mo48386c();
        AppBrandLogger.m52830i("tma_SocketManagerV2", "wsManager start Connect .......and webSocketId:", Integer.valueOf(b));
        return b;
    }

    /* renamed from: a */
    public static String m257705a(String str, String str2) {
        return str + ":" + str2;
    }

    /* renamed from: a */
    public static void m257706a(String str, IApiOutputParam iApiOutputParam, IAppContext iAppContext) {
        AppBrandLogger.m52830i("tma_SocketManagerV2", "sendMsg ", str);
        C67432a.m262319a(iAppContext).getJsBridge().sendMsgToJsCore2(str, iApiOutputParam, false);
    }

    /* renamed from: a */
    public boolean mo230340a(int i, int i2, String str) {
        boolean z;
        AppBrandLogger.m52830i("tma_SocketManagerV2", "closeSocket socketId:", Integer.valueOf(i), "code:", Integer.valueOf(i2), "reason:", str);
        C12811c cVar = this.f165619a.get(i);
        if (cVar == null || cVar.mo48381a() == null) {
            z = false;
        } else {
            AppBrandLogger.m52830i("tma_SocketManagerV2", "closeSocket success! socketId:", Integer.valueOf(i));
            z = cVar.mo48381a().close(i2, str);
        }
        if (!z) {
            AppBrandLogger.m52830i("tma_SocketManagerV2", "noClose webSocket ,notify close success!,SocketId:", Integer.valueOf(i));
            try {
                C66698b.C66700b bVar = new C66698b.C66700b();
                bVar.f168377d = i;
                bVar.f168374a = m257705a("onSocketTaskStateChange", "ok");
                bVar.f168378e = "close";
                m257706a("onSocketTaskStateChange", bVar, this.f165621c);
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "tma_SocketManagerV2", e.getStackTrace());
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo230341a(int i, String str, C67522b bVar) {
        C12811c cVar = this.f165619a.get(i);
        if (cVar == null) {
            AppBrandLogger.m52830i("tma_SocketManagerV2", "socket no create socketId->", Integer.valueOf(i));
            bVar.mo234467a("socket no create socketId == ").mo234467a(Integer.valueOf(i));
        } else if (cVar.mo48381a() != null) {
            AppBrandLogger.m52828d("tma_SocketManagerV2", "sendText " + str + " " + i);
            AppBrandLogger.m52828d("tma_SocketManagerV2", "ByteString.encodeUtf8(txt) " + ByteString.encodeUtf8(str) + " " + i);
            return cVar.mo48381a().send(str);
        } else {
            AppBrandLogger.m52830i("tma_SocketManagerV2", "web socket no open!");
            bVar.mo234467a("webSocket no open");
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo230342a(int i, ByteString byteString, C67522b bVar) {
        if (byteString == null) {
            AppBrandLogger.m52830i("tma_SocketManagerV2", "send array buffer -> data is null!");
            bVar.mo234467a("data is null");
            return false;
        }
        C12811c cVar = this.f165619a.get(i);
        if (cVar == null) {
            AppBrandLogger.m52830i("tma_SocketManagerV2", "send array buffer,socket no create socketId:", Integer.valueOf(i));
            bVar.mo234467a("socket no create socketId == ").mo234467a(Integer.valueOf(i));
        } else if (cVar.mo48381a() != null) {
            AppBrandLogger.m52828d("tma_SocketManagerV2", "sendArrayBuffer ", byteString, " ", Integer.valueOf(i));
            return cVar.mo48381a().send(byteString);
        } else {
            AppBrandLogger.m52830i("tma_SocketManagerV2", "send array buffer websocket no open!");
            bVar.mo234467a("webSocket no open");
        }
        return false;
    }
}
