package com.ss.android.lark.setting.service.usersetting.p2680h;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.setting.dto.C54124e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.ss.android.lark.setting.service.usersetting.h.a */
public class C54702a {

    /* renamed from: a */
    public volatile C54124e f135122a;

    /* renamed from: b */
    public Map<AbstractC54704a, Object> f135123b = new ConcurrentHashMap();

    /* renamed from: c */
    private ReadWriteLock f135124c = new ReentrantReadWriteLock();

    /* renamed from: com.ss.android.lark.setting.service.usersetting.h.a$a */
    public interface AbstractC54704a {
        /* renamed from: a */
        void mo186636a(boolean z);
    }

    /* renamed from: d */
    private void m212292d() {
        CoreThreadPool.getSerialTaskHandler().post(new Runnable() {
            /* class com.ss.android.lark.setting.service.usersetting.p2680h.C54702a.RunnableC547031 */

            public void run() {
                for (AbstractC54704a aVar : C54702a.this.f135123b.keySet()) {
                    if (C54702a.this.f135122a == null) {
                        aVar.mo186636a(false);
                    } else {
                        aVar.mo186636a(C54702a.this.f135122a.f134009b);
                    }
                }
            }
        });
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo186815a() {
        try {
            this.f135124c.writeLock().lock();
            this.f135122a = null;
            this.f135124c.writeLock().unlock();
            m212292d();
        } catch (Throwable th) {
            this.f135124c.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public boolean mo186819b() {
        boolean z;
        try {
            this.f135124c.readLock().lock();
            if (this.f135122a == null) {
                z = false;
            } else {
                z = this.f135122a.f134009b;
            }
            return z;
        } finally {
            this.f135124c.readLock().unlock();
        }
    }

    /* renamed from: c */
    public boolean mo186820c() {
        boolean z;
        try {
            this.f135124c.readLock().lock();
            if (this.f135122a == null) {
                z = false;
            } else {
                z = this.f135122a.f134008a;
            }
            return z;
        } finally {
            this.f135124c.readLock().unlock();
        }
    }

    /* renamed from: a */
    public void mo186817a(AbstractC54704a aVar) {
        if (aVar != null) {
            this.f135123b.put(aVar, new Object());
        }
    }

    /* renamed from: b */
    public void mo186818b(AbstractC54704a aVar) {
        if (aVar != null) {
            this.f135123b.remove(aVar);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo186816a(C54124e eVar) {
        try {
            this.f135124c.writeLock().lock();
            this.f135122a = eVar;
            this.f135124c.writeLock().unlock();
            m212292d();
        } catch (Throwable th) {
            this.f135124c.writeLock().unlock();
            throw th;
        }
    }
}
