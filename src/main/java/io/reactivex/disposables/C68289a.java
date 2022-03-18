package io.reactivex.disposables;

import io.reactivex.exceptions.C68306a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.AbstractC68374a;
import io.reactivex.internal.p3459a.C68362b;
import io.reactivex.internal.util.C68981f;
import io.reactivex.internal.util.C68985i;
import java.util.ArrayList;

/* renamed from: io.reactivex.disposables.a */
public final class C68289a implements Disposable, AbstractC68374a {

    /* renamed from: a */
    C68985i<Disposable> f171592a;

    /* renamed from: b */
    volatile boolean f171593b;

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f171593b;
    }

    /* renamed from: a */
    public void mo237935a() {
        if (!this.f171593b) {
            synchronized (this) {
                if (!this.f171593b) {
                    C68985i<Disposable> iVar = this.f171592a;
                    this.f171592a = null;
                    mo237936a(iVar);
                }
            }
        }
    }

    /* renamed from: b */
    public int mo237939b() {
        int i = 0;
        if (this.f171593b) {
            return 0;
        }
        synchronized (this) {
            if (this.f171593b) {
                return 0;
            }
            C68985i<Disposable> iVar = this.f171592a;
            if (iVar != null) {
                i = iVar.mo238769c();
            }
            return i;
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        if (!this.f171593b) {
            synchronized (this) {
                if (!this.f171593b) {
                    this.f171593b = true;
                    C68985i<Disposable> iVar = this.f171592a;
                    this.f171592a = null;
                    mo237936a(iVar);
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
        if (!this.f171593b) {
            synchronized (this) {
                if (!this.f171593b) {
                    C68985i<Disposable> iVar = this.f171592a;
                    if (iVar == null) {
                        iVar = new C68985i<>();
                        this.f171592a = iVar;
                    }
                    iVar.mo238766a(disposable);
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
        if (this.f171593b) {
            return false;
        }
        synchronized (this) {
            if (this.f171593b) {
                return false;
            }
            C68985i<Disposable> iVar = this.f171592a;
            if (iVar != null) {
                if (iVar.mo238767b(disposable)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo237936a(C68985i<Disposable> iVar) {
        if (iVar != null) {
            ArrayList arrayList = null;
            Object[] b = iVar.mo238768b();
            for (Object obj : b) {
                if (obj instanceof Disposable) {
                    try {
                        ((Disposable) obj).dispose();
                    } catch (Throwable th) {
                        C68306a.m265071b(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
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

    /* renamed from: a */
    public boolean mo237938a(Disposable... disposableArr) {
        C68362b.m265229a((Object) disposableArr, "ds is null");
        if (!this.f171593b) {
            synchronized (this) {
                if (!this.f171593b) {
                    C68985i<Disposable> iVar = this.f171592a;
                    if (iVar == null) {
                        iVar = new C68985i<>(disposableArr.length + 1);
                        this.f171592a = iVar;
                    }
                    for (Disposable disposable : disposableArr) {
                        C68362b.m265229a((Object) disposable, "d is null");
                        iVar.mo238766a(disposable);
                    }
                    return true;
                }
            }
        }
        for (Disposable disposable2 : disposableArr) {
            disposable2.dispose();
        }
        return false;
    }
}
