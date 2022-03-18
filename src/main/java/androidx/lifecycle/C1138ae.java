package androidx.lifecycle;

import androidx.p011a.p012a.p015c.AbstractC0193a;

/* renamed from: androidx.lifecycle.ae */
public class C1138ae {
    /* renamed from: a */
    public static <X, Y> LiveData<Y> m5354a(LiveData<X> liveData, final AbstractC0193a<X, Y> aVar) {
        final C1174u uVar = new C1174u();
        uVar.mo6042a(liveData, new AbstractC1178x<X>() {
            /* class androidx.lifecycle.C1138ae.C11391 */

            @Override // androidx.lifecycle.AbstractC1178x
            public void onChanged(X x) {
                uVar.mo5929b(aVar.apply(x));
            }
        });
        return uVar;
    }

    /* renamed from: b */
    public static <X, Y> LiveData<Y> m5355b(LiveData<X> liveData, final AbstractC0193a<X, LiveData<Y>> aVar) {
        final C1174u uVar = new C1174u();
        uVar.mo6042a(liveData, new AbstractC1178x<X>() {
            /* class androidx.lifecycle.C1138ae.C11402 */

            /* renamed from: a */
            LiveData<Y> f4252a;

            @Override // androidx.lifecycle.AbstractC1178x
            public void onChanged(X x) {
                LiveData<Y> liveData = (LiveData) aVar.apply(x);
                LiveData<Y> liveData2 = this.f4252a;
                if (liveData2 != liveData) {
                    if (liveData2 != null) {
                        uVar.mo6041a((LiveData) liveData2);
                    }
                    this.f4252a = liveData;
                    if (liveData != null) {
                        uVar.mo6042a(liveData, new AbstractC1178x<Y>() {
                            /* class androidx.lifecycle.C1138ae.C11402.C11411 */

                            @Override // androidx.lifecycle.AbstractC1178x
                            public void onChanged(Y y) {
                                uVar.mo5929b((Object) y);
                            }
                        });
                    }
                }
            }
        });
        return uVar;
    }
}
