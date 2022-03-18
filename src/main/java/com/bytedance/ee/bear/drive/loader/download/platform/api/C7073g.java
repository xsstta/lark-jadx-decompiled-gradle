package com.bytedance.ee.bear.drive.loader.download.platform.api;

import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.api.g */
public class C7073g {

    /* renamed from: a */
    private final Lock f19035a;

    /* renamed from: b */
    private Condition f19036b;

    /* renamed from: c */
    private AtomicBoolean f19037c = new AtomicBoolean(false);

    /* renamed from: d */
    private AtomicBoolean f19038d = new AtomicBoolean(false);

    /* renamed from: e */
    private AtomicBoolean f19039e = new AtomicBoolean(false);

    /* renamed from: f */
    private AtomicBoolean f19040f = new AtomicBoolean(false);

    /* renamed from: a */
    public boolean mo27651a() {
        return this.f19037c.get();
    }

    /* renamed from: b */
    public boolean mo27652b() {
        return this.f19038d.get();
    }

    /* renamed from: c */
    public void mo27653c() {
        C13479a.m54764b("DrivePlatform_Sync", "sync tools, set pushOk.");
        this.f19037c.compareAndSet(false, true);
    }

    /* renamed from: d */
    public void mo27654d() {
        C13479a.m54764b("DrivePlatform_Sync", "sync tools, set pullOk.");
        this.f19038d.compareAndSet(false, true);
    }

    /* renamed from: e */
    public void mo27655e() {
        C13479a.m54764b("DrivePlatform_Sync", "sync tools, set start working.");
        this.f19039e.compareAndSet(false, true);
    }

    /* renamed from: f */
    public boolean mo27656f() {
        boolean z = this.f19039e.get();
        if (z) {
            C13479a.m54764b("DrivePlatform_Sync", "sync tools, set stop working.");
            this.f19039e.compareAndSet(true, false);
            mo27658h();
        }
        return z;
    }

    C7073g() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f19035a = reentrantLock;
        this.f19036b = reentrantLock.newCondition();
    }

    /* renamed from: g */
    public void mo27657g() {
        this.f19035a.lock();
        try {
            C13479a.m54764b("DrivePlatform_Sync", "sync tools, thread id: " + Thread.currentThread().getId() + " enter lock waiting queue.");
            this.f19036b.await();
        } catch (InterruptedException e) {
            C13479a.m54758a("DrivePlatform_Sync", "sync tools, enter lock waiting queue failed, throwable:" + e);
        } catch (Throwable th) {
            this.f19035a.unlock();
            throw th;
        }
        this.f19035a.unlock();
    }

    /* renamed from: h */
    public void mo27658h() {
        if (this.f19040f.get()) {
            C13479a.m54764b("DrivePlatform_Sync", "sync tools, has already wake up before.");
            return;
        }
        C13479a.m54764b("DrivePlatform_Sync", "sync tools, wake up all thread.");
        this.f19040f.compareAndSet(false, true);
        this.f19035a.lock();
        try {
            C13479a.m54764b("DrivePlatform_Sync", "sync tools, signal all thread.");
            this.f19036b.signalAll();
        } catch (Exception e) {
            C13479a.m54758a("DrivePlatform_Sync", "sync tools, signal all failed, throwable: " + e);
        } catch (Throwable th) {
            this.f19035a.unlock();
            throw th;
        }
        this.f19035a.unlock();
    }
}
