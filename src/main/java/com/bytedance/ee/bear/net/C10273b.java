package com.bytedance.ee.bear.net;

import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.Function;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.net.b */
public class C10273b implements Function<C10288i, AbstractC68307f<C10288i>> {

    /* renamed from: a */
    public AbstractC10278f f27747a;

    public C10273b(AbstractC10278f fVar) {
        this.f27747a = fVar;
    }

    /* renamed from: a */
    public AbstractC68307f<C10288i> apply(final C10288i iVar) throws Exception {
        if (this.f27747a != null) {
            return AbstractC68307f.m265080a(new AbstractC68324h<C10288i>() {
                /* class com.bytedance.ee.bear.net.C10273b.C102741 */

                @Override // io.reactivex.AbstractC68324h
                public void subscribe(final AbstractC68323g<C10288i> gVar) throws Exception {
                    C10273b.this.f27747a.mo30716a(new AbstractC10272a() {
                        /* class com.bytedance.ee.bear.net.C10273b.C102741.C102751 */

                        @Override // com.bytedance.ee.bear.net.AbstractC10272a
                        /* renamed from: a */
                        public void mo39277a(boolean z, String str, String str2) {
                            if (z) {
                                C13479a.m54772d("CheckLoginFun", "onCheckOver: you have login, and supported the token");
                                if (!TextUtils.isEmpty(str2)) {
                                    iVar.mo39300a(str2);
                                }
                                gVar.onNext(iVar);
                                gVar.onComplete();
                            } else if (!gVar.isCancelled()) {
                                gVar.onError(new Exception("You are not login, so denied your http request."));
                                gVar.onComplete();
                            }
                        }
                    });
                }
            }, BackpressureStrategy.BUFFER);
        }
        C13479a.m54758a("CheckLoginFun", "login checker is null.");
        return AbstractC68307f.m265083a(iVar);
    }
}
