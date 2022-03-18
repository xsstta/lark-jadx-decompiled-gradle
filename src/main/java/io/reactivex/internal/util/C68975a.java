package io.reactivex.internal.util;

import io.reactivex.AbstractC69009q;
import io.reactivex.functions.AbstractC68322n;
import org.p3511d.AbstractC70021c;

/* renamed from: io.reactivex.internal.util.a */
public class C68975a<T> {

    /* renamed from: a */
    final int f172979a;

    /* renamed from: b */
    final Object[] f172980b;

    /* renamed from: c */
    Object[] f172981c;

    /* renamed from: d */
    int f172982d;

    /* renamed from: io.reactivex.internal.util.a$a */
    public interface AbstractC68976a<T> extends AbstractC68322n<T> {
        @Override // io.reactivex.functions.AbstractC68322n
        boolean test(T t);
    }

    /* renamed from: b */
    public void mo238761b(T t) {
        this.f172980b[0] = t;
    }

    public C68975a(int i) {
        this.f172979a = i;
        Object[] objArr = new Object[(i + 1)];
        this.f172980b = objArr;
        this.f172981c = objArr;
    }

    /* renamed from: a */
    public void mo238757a(AbstractC68976a<? super T> aVar) {
        int i = this.f172979a;
        for (Object[] objArr = this.f172980b; objArr != null; objArr = objArr[i]) {
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                if (obj == null) {
                    continue;
                    break;
                } else if (aVar.test(obj)) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo238758a(T t) {
        int i = this.f172979a;
        int i2 = this.f172982d;
        if (i2 == i) {
            Object[] objArr = new Object[(i + 1)];
            this.f172981c[i] = objArr;
            this.f172981c = objArr;
            i2 = 0;
        }
        this.f172981c[i2] = t;
        this.f172982d = i2 + 1;
    }

    /* renamed from: a */
    public <U> boolean mo238759a(AbstractC69009q<? super U> qVar) {
        Object[] objArr = this.f172980b;
        int i = this.f172979a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (NotificationLite.acceptFull(objArr2, qVar)) {
                    return true;
                }
            }
            objArr = objArr[i];
        }
    }

    /* renamed from: a */
    public <U> boolean mo238760a(AbstractC70021c<? super U> cVar) {
        Object[] objArr = this.f172980b;
        int i = this.f172979a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (NotificationLite.acceptFull(objArr2, cVar)) {
                    return true;
                }
            }
            objArr = objArr[i];
        }
    }
}
