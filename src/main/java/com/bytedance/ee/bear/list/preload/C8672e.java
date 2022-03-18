package com.bytedance.ee.bear.list.preload;

import android.content.Context;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.preload.C8672e;
import com.bytedance.ee.bear.list.recent.C8685h;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.list.preload.e */
public class C8672e {

    /* renamed from: a */
    private static volatile C8672e f23470a;

    /* renamed from: b */
    private C8685h f23471b;

    /* renamed from: c */
    private ArrayList<Document> f23472c;

    /* renamed from: d */
    private Disposable f23473d;

    /* renamed from: com.bytedance.ee.bear.list.preload.e$a */
    public interface AbstractC8673a {
        /* renamed from: a */
        void mo33681a();
    }

    /* renamed from: a */
    public C8685h mo33677a() {
        return this.f23471b;
    }

    /* renamed from: b */
    public ArrayList<Document> mo33679b() {
        return this.f23472c;
    }

    /* renamed from: c */
    public void mo33680c() {
        Disposable disposable = this.f23473d;
        if (disposable != null && !disposable.isDisposed()) {
            this.f23473d.dispose();
        }
        this.f23472c = null;
        C8685h hVar = this.f23471b;
        if (hVar != null) {
            hVar.destroy();
            this.f23471b = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m36236b(AbstractC8673a aVar) throws Exception {
        if (aVar != null) {
            aVar.mo33681a();
        }
    }

    private C8672e(Context context) {
        C8685h hVar = new C8685h(null, context, new C10917c(new C10929e()));
        this.f23471b = hVar;
        hVar.create();
    }

    /* renamed from: a */
    public static C8672e m36232a(Context context) {
        if (f23470a == null) {
            synchronized (C8672e.class) {
                if (f23470a == null) {
                    f23470a = new C8672e(context);
                }
            }
        }
        return f23470a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m36233a(Boolean bool) throws Exception {
        this.f23471b.mo33711l();
        return AbstractC68307f.m265100b(this.f23471b.mo32591j(), this.f23471b.mo32720k());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36235a(Throwable th) throws Exception {
        C13479a.m54758a("SpaceDataPreLoader", "preload()...failed, error = " + th);
    }

    /* renamed from: a */
    public void mo33678a(AbstractC8673a aVar) {
        C13479a.m54764b("SpaceDataPreLoader", "preload()...start");
        Disposable disposable = this.f23473d;
        if (disposable == null || disposable.isDisposed()) {
            this.f23473d = AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238014c(new Function() {
                /* class com.bytedance.ee.bear.list.preload.$$Lambda$e$WZLZ28fgiCjVUog5QNFCQCovmb4 */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C8672e.this.m36233a((Boolean) obj);
                }
            }).mo237995a((AbstractC68309a) new AbstractC68309a() {
                /* class com.bytedance.ee.bear.list.preload.$$Lambda$e$S13o9etX03dHY41hjaFY4Ac7Jes */

                @Override // io.reactivex.functions.AbstractC68309a
                public final void run() {
                    C8672e.m36236b(C8672e.AbstractC8673a.this);
                }
            }).mo237998a((AbstractC68322n) $$Lambda$TzFZCqcgOn5o_KmhCFFSN51CmY.INSTANCE).mo238001b(new Consumer(aVar) {
                /* class com.bytedance.ee.bear.list.preload.$$Lambda$e$0GcBKqV_jt0JvFqLbCSVWGEwcv0 */
                public final /* synthetic */ C8672e.AbstractC8673a f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8672e.this.m36234a(this.f$1, (ArrayList) obj);
                }
            }, $$Lambda$e$dk_5RQFpRTveFqM_7ePIxfy6cBk.INSTANCE);
        } else {
            C13479a.m54764b("SpaceDataPreLoader", "already in preloading...");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36234a(AbstractC8673a aVar, ArrayList arrayList) throws Exception {
        C13479a.m54764b("SpaceDataPreLoader", "preload()...success");
        this.f23472c = arrayList;
        if (aVar != null) {
            aVar.mo33681a();
        }
    }
}
