package com.bytedance.geckox.p770f;

import com.bytedance.geckox.utils.C14356d;
import com.bytedance.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bytedance.geckox.f.a */
public class C14271a {

    /* renamed from: a */
    private static final Map<String, Lock> f37525a = new HashMap();

    /* renamed from: b */
    private FileLock f37526b;

    /* renamed from: c */
    private String f37527c;

    /* renamed from: a */
    public void mo52245a() {
        Map<String, Lock> map = f37525a;
        synchronized (map) {
            try {
                this.f37526b.mo52472a();
                this.f37526b.mo52473b();
                map.get(this.f37527c).unlock();
            } catch (Throwable th) {
                f37525a.get(this.f37527c).unlock();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static C14271a m57593a(String str) throws Exception {
        Map<String, Lock> map = f37525a;
        synchronized (map) {
            Lock lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
            if (!lock.tryLock()) {
                return null;
            }
            try {
                FileLock c = FileLock.m57802c(str);
                if (c == null) {
                    lock.unlock();
                    return null;
                }
                return new C14271a(str, c);
            } catch (Exception e) {
                lock.unlock();
                C14356d.m57820a(new RuntimeException(e));
                return null;
            }
        }
    }

    private C14271a(String str, FileLock fileLock) {
        this.f37527c = str;
        this.f37526b = fileLock;
    }
}
