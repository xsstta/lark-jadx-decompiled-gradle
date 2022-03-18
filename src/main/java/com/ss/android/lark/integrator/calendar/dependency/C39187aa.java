package com.ss.android.lark.integrator.calendar.dependency;

import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30029ab;
import com.ss.android.lark.utils.rxjava.C57865c;
import io.reactivex.disposables.Disposable;

/* renamed from: com.ss.android.lark.integrator.calendar.dependency.aa */
public class C39187aa implements AbstractC30029ab {
    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30029ab
    /* renamed from: a */
    public <T> Disposable mo108171a(final AbstractC30029ab.AbstractC30032c<T> cVar, final AbstractC30029ab.AbstractC30031b<T> bVar) {
        return C57865c.m224574a(new C57865c.AbstractC57873d<T>() {
            /* class com.ss.android.lark.integrator.calendar.dependency.C39187aa.C391881 */

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public T produce() {
                return (T) cVar.mo108174a();
            }
        }, new C57865c.AbstractC57871b<T>() {
            /* class com.ss.android.lark.integrator.calendar.dependency.C39187aa.C391892 */

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public void consume(T t) {
                bVar.mo108172a(t);
            }
        });
    }
}
