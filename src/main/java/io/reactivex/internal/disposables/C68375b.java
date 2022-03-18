package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.util.C68981f;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: io.reactivex.internal.disposables.b */
public final class C68375b implements Disposable, AbstractC68374a {

    /* renamed from: a */
    List<Disposable> f171681a;

    /* renamed from: b */
    volatile boolean f171682b;

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f171682b;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        if (!this.f171682b) {
            synchronized (this) {
                if (!this.f171682b) {
                    this.f171682b = true;
                    List<Disposable> list = this.f171681a;
                    this.f171681a = null;
                    mo238088a(list);
                }
            }
        }
    }

    @Override // io.reactivex.internal.disposables.AbstractC68374a
    /* renamed from: b */
    public boolean mo237940b(Disposable disposable) {
        if (!mo237941c(disposable)) {
            return false;
        }
        disposable.dispose();
        return true;
    }

    @Override // io.reactivex.internal.disposables.AbstractC68374a
    /* renamed from: a */
    public boolean mo237937a(Disposable disposable) {
        C68362b.m265229a((Object) disposable, "d is null");
        if (!this.f171682b) {
            synchronized (this) {
                if (!this.f171682b) {
                    List list = this.f171681a;
                    if (list == null) {
                        list = new LinkedList();
                        this.f171681a = list;
                    }
                    list.add(disposable);
                    return true;
                }
            }
        }
        disposable.dispose();
        return false;
    }

    @Override // io.reactivex.internal.disposables.AbstractC68374a
    /* renamed from: c */
    public boolean mo237941c(Disposable disposable) {
        C68362b.m265229a((Object) disposable, "Disposable item is null");
        if (this.f171682b) {
            return false;
        }
        synchronized (this) {
            if (this.f171682b) {
                return false;
            }
            List<Disposable> list = this.f171681a;
            if (list != null) {
                if (list.remove(disposable)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo238088a(List<Disposable> list) {
        if (list != null) {
            ArrayList arrayList = null;
            for (Disposable disposable : list) {
                try {
                    disposable.dispose();
                } catch (Throwable th) {
                    C68306a.m265071b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw C68981f.m265557a((Throwable) arrayList.get(0));
            }
            throw new CompositeException(arrayList);
        }
    }
}
