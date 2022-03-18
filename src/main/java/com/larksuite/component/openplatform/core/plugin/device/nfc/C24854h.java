package com.larksuite.component.openplatform.core.plugin.device.nfc;

import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.util.p718t.C13748k;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.tt.refer.p3400a.p3411h.AbstractC67730a;
import com.tt.refer.p3400a.p3411h.AbstractC67731b;
import com.tt.refer.p3400a.p3411h.AbstractC67732c;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.nfc.h */
public class C24854h implements NfcAdapter.ReaderCallback, AbstractC67730a {

    /* renamed from: a */
    public AbstractC67732c f61006a;

    /* renamed from: b */
    public IAppContext f61007b;

    /* renamed from: c */
    public NfcAdapter f61008c;

    /* renamed from: d */
    public Tag f61009d;

    /* renamed from: e */
    public HandlerThread f61010e;

    /* renamed from: f */
    public Handler f61011f;

    /* renamed from: g */
    private ConcurrentHashMap<String, AbstractC67731b> f61012g = new ConcurrentHashMap<>();

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public IAppContext getAppContext() {
        return this.f61007b;
    }

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67730a
    /* renamed from: b */
    public void mo87911b() {
        NfcAdapter nfcAdapter = this.f61008c;
        if (nfcAdapter != null) {
            nfcAdapter.disableReaderMode(this.f61007b.getCurrentActivity());
        }
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
        Handler handler = this.f61011f;
        if (handler != null) {
            handler.getLooper().quit();
        }
    }

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67730a
    /* renamed from: a */
    public void mo87907a() {
        NfcAdapter nfcAdapter = this.f61008c;
        if (nfcAdapter != null) {
            nfcAdapter.enableReaderMode(this.f61007b.getCurrentActivity(), this, 129, null);
        }
    }

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67730a
    /* renamed from: a */
    public void mo87909a(Runnable runnable) {
        Handler handler = this.f61011f;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public C24854h(IAppContext iAppContext) {
        this.f61007b = iAppContext;
    }

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67730a
    /* renamed from: a */
    public void mo87908a(final AbstractC67732c cVar) {
        C13748k.m55732a(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.device.nfc.C24854h.RunnableC248551 */

            /* renamed from: a */
            public static HandlerThread m90004a(String str) {
                return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
            }

            public void run() {
                if (C24854h.this.f61008c == null) {
                    C24854h hVar = C24854h.this;
                    hVar.f61008c = NfcAdapter.getDefaultAdapter(hVar.f61007b.getCurrentActivity());
                }
                if (C24854h.this.f61008c != null) {
                    if (C24854h.this.f61008c.isEnabled() && C24854h.this.f61010e == null) {
                        C24854h hVar2 = C24854h.this;
                        hVar2.f61010e = m90004a("NfcManager_" + C24854h.this.f61007b.getAppId());
                        C24854h.this.f61010e.start();
                        C24854h.this.f61011f = new Handler(C24854h.this.f61010e.getLooper());
                    }
                    C24854h.this.mo87907a();
                }
                if (C24854h.this.f61011f == null) {
                    AppBrandLogger.m52830i("NfcManager", "notify handler is null");
                    AbstractC67732c cVar = cVar;
                    if (cVar != null) {
                        cVar.mo87890a("nfc is not available");
                        return;
                    }
                    return;
                }
                C24854h.this.f61011f.post(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.plugin.device.nfc.C24854h.RunnableC248551.RunnableC248561 */

                    public void run() {
                        C24854h.this.f61006a = cVar;
                        if (cVar != null) {
                            cVar.mo87888a();
                        }
                    }
                });
            }
        });
    }

    public void onTagDiscovered(final Tag tag) {
        Handler handler = this.f61011f;
        if (handler == null) {
            AppBrandLogger.m52830i("NfcManager", "notify handler is null");
            return;
        }
        handler.post(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.device.nfc.C24854h.RunnableC248572 */

            public void run() {
                C24854h.this.f61009d = tag;
                if (C24854h.this.f61006a != null) {
                    C24854h.this.f61006a.mo87889a(tag);
                }
            }
        });
    }

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67730a
    /* renamed from: a */
    public <T extends AbstractC67731b> T mo87905a(String str) {
        T t = (T) this.f61012g.get(str);
        if (t == null) {
            return null;
        }
        if (t.mo87893a() != null && t.mo87893a().equals(this.f61009d)) {
            return t;
        }
        t.mo87897c();
        return null;
    }

    @Override // com.tt.refer.p3400a.p3411h.AbstractC67730a
    /* renamed from: a */
    public AbstractC67731b mo87906a(String str, String str2) {
        AbstractC67731b bVar = null;
        if (this.f61009d == null) {
            return null;
        }
        str.hashCode();
        if (str.equals("MIFARE-Classic")) {
            bVar = new C24846a(this.f61009d);
        } else if (str.equals("NFC-A")) {
            bVar = new C24864n(this.f61009d);
        }
        if (bVar != null) {
            mo87910a(str2 + "_" + str, bVar);
        }
        return bVar;
    }

    /* renamed from: a */
    public void mo87910a(String str, AbstractC67731b bVar) {
        this.f61012g.put(str, bVar);
    }
}
