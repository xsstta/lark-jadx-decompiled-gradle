package com.ss.android.lark.calendar.p1430a.p1431a;

import com.larksuite.framework.callback.AbstractC25971e;
import io.reactivex.disposables.Disposable;

/* renamed from: com.ss.android.lark.calendar.a.a.ab */
public interface AbstractC30029ab {

    /* renamed from: com.ss.android.lark.calendar.a.a.ab$b */
    public interface AbstractC30031b<T> {
        /* renamed from: a */
        void mo108172a(T t);
    }

    /* renamed from: com.ss.android.lark.calendar.a.a.ab$c */
    public interface AbstractC30032c<T> {
        /* renamed from: a */
        T mo108174a();
    }

    /* renamed from: a */
    <T> Disposable mo108171a(AbstractC30032c<T> cVar, AbstractC30031b<T> bVar);

    /* renamed from: com.ss.android.lark.calendar.a.a.ab$a */
    public static abstract class AbstractC30030a<T> implements AbstractC25971e, AbstractC30031b<T> {

        /* renamed from: a */
        private volatile boolean f74887a;

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo108173b(T t) {
        }

        @Override // com.larksuite.framework.callback.AbstractC25971e
        public synchronized boolean isCanceled() {
            return this.f74887a;
        }

        @Override // com.larksuite.framework.callback.AbstractC25971e
        public synchronized void cancel() {
            this.f74887a = true;
        }

        @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30029ab.AbstractC30031b
        /* renamed from: a */
        public void mo108172a(T t) {
            if (!isCanceled()) {
                mo108173b(t);
            }
        }
    }
}
