package com.ss.android.lark.notification.env;

import com.larksuite.framework.thread.CoreThreadPool;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.ss.android.lark.notification.env.a */
public class C48475a {

    /* renamed from: a */
    public volatile NotificationEnv f121966a = new NotificationEnv();

    /* renamed from: b */
    public Map<AbstractC48477a, Object> f121967b = new ConcurrentHashMap();

    /* renamed from: c */
    private ReadWriteLock f121968c = new ReentrantReadWriteLock();

    /* renamed from: com.ss.android.lark.notification.env.a$a */
    public interface AbstractC48477a {
        /* renamed from: a */
        void mo169543a(NotificationEnv notificationEnv);
    }

    /* renamed from: b */
    private void m191174b() {
        CoreThreadPool.getSerialTaskHandler().post(new Runnable() {
            /* class com.ss.android.lark.notification.env.C48475a.RunnableC484761 */

            public void run() {
                for (AbstractC48477a aVar : C48475a.this.f121967b.keySet()) {
                    if (C48475a.this.f121966a != null) {
                        aVar.mo169543a(C48475a.this.f121966a);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public NotificationEnv mo169539a() {
        try {
            this.f121968c.readLock().lock();
            return this.f121966a;
        } finally {
            this.f121968c.readLock().unlock();
        }
    }

    /* renamed from: a */
    public void mo169541a(AbstractC48477a aVar) {
        this.f121967b.put(aVar, new Object());
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo169540a(NotificationEnv notificationEnv) {
        try {
            this.f121968c.writeLock().lock();
            this.f121966a = notificationEnv;
            this.f121968c.writeLock().unlock();
            m191174b();
        } catch (Throwable th) {
            this.f121968c.writeLock().unlock();
            throw th;
        }
    }
}
