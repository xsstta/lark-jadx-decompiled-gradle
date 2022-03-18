package com.ss.android.lark.setting.service.usersetting.base;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.ss.android.lark.setting.service.usersetting.base.a */
public class C54663a {

    /* renamed from: c */
    private static final Object f135062c = new Object();

    /* renamed from: a */
    public volatile UserSetting f135063a;

    /* renamed from: b */
    public Map<AbstractC54665a, Object> f135064b = new ConcurrentHashMap();

    /* renamed from: d */
    private ReadWriteLock f135065d = new ReentrantReadWriteLock();

    /* renamed from: com.ss.android.lark.setting.service.usersetting.base.a$a */
    public interface AbstractC54665a {
        /* renamed from: a */
        void mo186665a(UserSetting userSetting, UserSetting userSetting2);
    }

    /* renamed from: b */
    public UserSetting mo186756b() {
        try {
            this.f135065d.readLock().lock();
            return this.f135063a;
        } finally {
            this.f135065d.readLock().unlock();
        }
    }

    /* renamed from: a */
    public void mo186753a() {
        try {
            this.f135065d.writeLock().lock();
            this.f135063a = null;
        } finally {
            this.f135065d.writeLock().unlock();
        }
    }

    /* renamed from: b */
    private void m212220b(final UserSetting userSetting) {
        CoreThreadPool.getSerialTaskHandler().post(new Runnable() {
            /* class com.ss.android.lark.setting.service.usersetting.base.C54663a.RunnableC546641 */

            public void run() {
                for (AbstractC54665a aVar : C54663a.this.f135064b.keySet()) {
                    aVar.mo186665a(userSetting, C54663a.this.f135063a);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo186755a(AbstractC54665a aVar) {
        if (aVar != null) {
            this.f135064b.put(aVar, f135062c);
        }
    }

    /* renamed from: a */
    public void mo186754a(UserSetting userSetting) {
        if (userSetting != null) {
            try {
                this.f135065d.writeLock().lock();
                if (this.f135063a != null) {
                    if (userSetting.compareTo(this.f135063a) < 0) {
                        Log.m165383e("UserSettingCache", "update user setting fail for older userSetting");
                    }
                }
                UserSetting userSetting2 = this.f135063a;
                this.f135063a = userSetting;
                m212220b(userSetting2);
            } finally {
                this.f135065d.writeLock().unlock();
            }
        }
    }
}
