package com.bytedance.ee.bear.connection;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.connection.c */
public class C4975c extends LiveData<NetworkType> {

    /* renamed from: a */
    public Context f14578a;

    /* renamed from: f */
    private Disposable f14579f;

    /* renamed from: g */
    private AbstractC4973a f14580g = new AbstractC4973a() {
        /* class com.bytedance.ee.bear.connection.C4975c.C49761 */

        @Override // com.bytedance.ee.bear.connection.AbstractC4973a
        /* renamed from: a */
        public void mo19669a() {
            C13479a.m54772d("NetworkDetector", "network is disconnected.");
            C4975c.this.mo5926a(NetworkType.NETWORK_NO);
        }

        @Override // com.bytedance.ee.bear.connection.AbstractC4973a
        /* renamed from: a */
        public void mo19670a(NetworkType networkType) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("network is connected. netWorkType =");
            if (networkType == null) {
                str = null;
            } else {
                str = networkType.name();
            }
            sb.append(str);
            C13479a.m54772d("NetworkDetector", sb.toString());
            C4975c.this.mo5926a(networkType);
        }
    };

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    /* renamed from: d */
    public void mo5931d() {
        super.mo5931d();
        Disposable disposable = this.f14579f;
        if (disposable != null && !disposable.isDisposed()) {
            this.f14579f.dispose();
        }
        C13479a.m54772d("NetworkDetector", "unregister observer in inactive state.");
        NetStateChangeReceiver.m20615b(this.f14580g);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    /* renamed from: a */
    public void mo5920a() {
        super.mo5920a();
        this.f14579f = AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48478b()).mo238001b(new Consumer<Boolean>() {
            /* class com.bytedance.ee.bear.connection.C4975c.C49772 */

            /* renamed from: a */
            public void accept(Boolean bool) {
                C4975c cVar = C4975c.this;
                cVar.mo5926a(C4974b.m20620a(cVar.f14578a));
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.connection.C4975c.C49783 */

            /* renamed from: a */
            public void accept(Throwable th) {
                C13479a.m54761a("NetworkDetector", th);
            }
        });
        C13479a.m54772d("NetworkDetector", "register observer in active state.");
        NetStateChangeReceiver.m20613a(this.f14580g);
    }

    public C4975c(Context context) {
        this.f14578a = context.getApplicationContext();
    }
}
