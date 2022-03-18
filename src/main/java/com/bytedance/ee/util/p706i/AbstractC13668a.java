package com.bytedance.ee.util.p706i;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1174u;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.thread.C11678b;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.util.i.a */
public abstract class AbstractC13668a<T> extends C1174u<T> {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m55447b(LiveData liveData) throws Exception {
    }

    /* renamed from: f */
    public abstract LiveData<T> mo31656f();

    public AbstractC13668a() {
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.util.p706i.$$Lambda$a$YXq8xPn5XemWIOKvb8MkjtAw7Mw */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return AbstractC13668a.this.m55446b((String) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238005b(new Consumer() {
            /* class com.bytedance.ee.util.p706i.$$Lambda$a$s_8UtQnCkTLRzv2TAX5YR5qSqCY */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC13668a.this.m55448c((LiveData) obj);
            }
        }).mo238001b($$Lambda$a$jr9Kn3Jhjy0eLJPXI0OHlJ3SwVg.INSTANCE, $$Lambda$a$HE5hDFEdVTyBdgCtgE5R5yePJ8.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ LiveData m55446b(String str) throws Exception {
        return mo31656f();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m55448c(LiveData liveData) throws Exception {
        mo6042a(liveData, new AbstractC1178x() {
            /* class com.bytedance.ee.util.p706i.$$Lambda$a0bAEQPbiElvMCgZeteyFPP1gI */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                AbstractC13668a.this.mo5929b(obj);
            }
        });
    }
}
