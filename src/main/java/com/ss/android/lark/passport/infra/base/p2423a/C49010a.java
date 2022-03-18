package com.ss.android.lark.passport.infra.base.p2423a;

import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.ss.android.lark.passport.infra.base.a.a */
public class C49010a {

    /* renamed from: a */
    private final List<AbstractC49347c> f123042a = new ArrayList();

    /* renamed from: b */
    private final ReadWriteLock f123043b = new ReentrantReadWriteLock();

    /* renamed from: a */
    public void mo171121a() {
        try {
            this.f123043b.writeLock().lock();
            for (AbstractC49347c cVar : this.f123042a) {
                if (cVar != null) {
                    cVar.mo171123a();
                }
            }
            this.f123042a.clear();
        } finally {
            this.f123043b.writeLock().unlock();
        }
    }

    /* renamed from: a */
    public void mo171122a(AbstractC49347c cVar) {
        if (cVar != null) {
            try {
                this.f123043b.writeLock().lock();
                this.f123042a.add(cVar);
            } finally {
                this.f123043b.writeLock().unlock();
            }
        }
    }
}
