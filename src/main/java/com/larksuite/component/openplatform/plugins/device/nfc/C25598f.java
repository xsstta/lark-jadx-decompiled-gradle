package com.larksuite.component.openplatform.plugins.device.nfc;

import android.app.Activity;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.log.Log;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.larksuite.component.openplatform.plugins.device.nfc.f */
public class C25598f implements NfcAdapter.ReaderCallback, AbstractC25593a {

    /* renamed from: a */
    public AbstractC25597e f62271a;

    /* renamed from: b */
    public NfcAdapter f62272b;

    /* renamed from: c */
    public Tag f62273c;

    /* renamed from: d */
    public HandlerThread f62274d;

    /* renamed from: e */
    public Handler f62275e;

    /* renamed from: f */
    public AbstractC25905b f62276f;

    /* renamed from: g */
    private ConcurrentHashMap<String, AbstractC25594b> f62277g = new ConcurrentHashMap<>();

    /* renamed from: a */
    public void mo88808a() {
        if (this.f62272b == null) {
            return;
        }
        if (this.f62276f.mo92207a() instanceof Activity) {
            this.f62272b.enableReaderMode((Activity) this.f62276f.mo92207a(), this, 129, null);
        } else {
            Log.m165383e("NfcManager", "context is not activity");
        }
    }

    @Override // com.larksuite.component.openplatform.plugins.device.nfc.AbstractC25593a
    /* renamed from: a */
    public void mo88799a(Runnable runnable) {
        Handler handler = this.f62275e;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public C25598f(AbstractC25905b bVar) {
        this.f62276f = bVar;
    }

    @Override // com.larksuite.component.openplatform.plugins.device.nfc.AbstractC25593a
    /* renamed from: a */
    public void mo88798a(final AbstractC25597e eVar) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.larksuite.component.openplatform.plugins.device.nfc.C25598f.RunnableC255991 */

            /* renamed from: a */
            public static HandlerThread m91347a(String str) {
                return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
            }

            public void run() {
                if (C25598f.this.f62272b == null) {
                    C25598f fVar = C25598f.this;
                    fVar.f62272b = NfcAdapter.getDefaultAdapter(fVar.f62276f.mo92207a());
                    if (C25598f.this.f62272b != null && C25598f.this.f62272b.isEnabled()) {
                        C25598f fVar2 = C25598f.this;
                        fVar2.f62274d = m91347a("NfcManager_" + C25598f.this.f62276f.hashCode());
                        C25598f.this.f62274d.start();
                        C25598f.this.f62275e = new Handler(C25598f.this.f62274d.getLooper());
                    }
                    C25598f.this.mo88808a();
                }
                if (C25598f.this.f62275e == null) {
                    Log.m165389i("NfcManager", "notify handler is null");
                    AbstractC25597e eVar = eVar;
                    if (eVar != null) {
                        eVar.mo88794a("nfc is not available");
                        return;
                    }
                    return;
                }
                C25598f.this.f62275e.post(new Runnable() {
                    /* class com.larksuite.component.openplatform.plugins.device.nfc.C25598f.RunnableC255991.RunnableC256001 */

                    public void run() {
                        C25598f.this.f62271a = eVar;
                        if (eVar != null) {
                            eVar.mo88792a();
                        }
                    }
                });
            }
        });
    }

    public void onTagDiscovered(final Tag tag) {
        Handler handler = this.f62275e;
        if (handler == null) {
            Log.m165389i("NfcManager", "notify handler is null");
        } else {
            handler.post(new Runnable() {
                /* class com.larksuite.component.openplatform.plugins.device.nfc.C25598f.RunnableC256012 */

                public void run() {
                    C25598f.this.f62273c = tag;
                    if (C25598f.this.f62271a != null) {
                        C25598f.this.f62271a.mo88793a(tag);
                    }
                }
            });
        }
    }

    @Override // com.larksuite.component.openplatform.plugins.device.nfc.AbstractC25593a
    /* renamed from: a */
    public <T extends AbstractC25594b> T mo88796a(String str) {
        T t = (T) this.f62277g.get(str);
        if (t == null) {
            return null;
        }
        if (t.mo88807f() != null && t.mo88807f().equals(this.f62273c)) {
            return t;
        }
        t.mo88803b();
        return null;
    }

    /* renamed from: a */
    public void mo88809a(String str, AbstractC25594b bVar) {
        this.f62277g.put(str, bVar);
    }

    @Override // com.larksuite.component.openplatform.plugins.device.nfc.AbstractC25593a
    /* renamed from: a */
    public AbstractC25594b mo88797a(String str, String str2) {
        AbstractC25594b bVar = null;
        if (this.f62273c == null) {
            return null;
        }
        str.hashCode();
        if (str.equals("MIFARE-Classic")) {
            bVar = new C25595c(this.f62273c);
        } else if (str.equals("NFC-A")) {
            bVar = new C25602g(this.f62273c);
        }
        if (bVar != null) {
            mo88809a(str2 + "_" + str, bVar);
        }
        return bVar;
    }
}
