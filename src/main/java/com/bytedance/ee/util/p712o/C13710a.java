package com.bytedance.ee.util.p712o;

import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.ee.util.o.a */
public class C13710a<V> {

    /* renamed from: a */
    public AbstractC68323g<V> f35906a;

    /* renamed from: b */
    private Disposable f35907b;

    /* renamed from: com.bytedance.ee.util.o.a$a */
    public interface AbstractC13714a<V> {
        void onSubscribe(V v);
    }

    /* renamed from: a */
    public void mo50678a() {
        Disposable disposable = this.f35907b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: a */
    public void mo50679a(V v) {
        AbstractC68323g<V> gVar = this.f35906a;
        if (gVar != null && !gVar.isCancelled()) {
            C13479a.m54772d("DebounceFlowableWrapper", "onNext: " + ((Object) v));
            this.f35906a.onNext(v);
        }
    }

    public C13710a(long j, AbstractC13714a<V> aVar) {
        this(j, aVar, BackpressureStrategy.LATEST);
    }

    public C13710a(long j, final AbstractC13714a<V> aVar, BackpressureStrategy backpressureStrategy) {
        this.f35907b = AbstractC68307f.m265080a(new AbstractC68324h<V>() {
            /* class com.bytedance.ee.util.p712o.C13710a.C137133 */

            @Override // io.reactivex.AbstractC68324h
            public void subscribe(AbstractC68323g<V> gVar) throws Exception {
                C13710a.this.f35906a = gVar;
            }
        }, backpressureStrategy == null ? BackpressureStrategy.LATEST : backpressureStrategy).mo238003b(j, TimeUnit.MILLISECONDS, C11678b.m48480d()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer<V>() {
            /* class com.bytedance.ee.util.p712o.C13710a.C137111 */

            @Override // io.reactivex.functions.Consumer
            public void accept(V v) throws Exception {
                if (aVar != null) {
                    C13479a.m54772d("DebounceFlowableWrapper", "onSubscribe: " + ((Object) v));
                    aVar.onSubscribe(v);
                }
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.util.p712o.C13710a.C137122 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C13479a.m54774d("DebounceFlowableWrapper", th);
            }
        });
    }
}
