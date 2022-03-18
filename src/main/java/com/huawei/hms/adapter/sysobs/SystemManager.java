package com.huawei.hms.adapter.sysobs;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class SystemManager {

    /* renamed from: a */
    public static SystemManager f57775a = new SystemManager();

    /* renamed from: b */
    public static final Object f57776b = new Object();

    /* renamed from: c */
    public static SystemNotifier f57777c = new C23441a();

    public static SystemManager getInstance() {
        return f57775a;
    }

    public static SystemNotifier getSystemNotifier() {
        return f57777c;
    }

    public void notifyUpdateResult(int i) {
        f57777c.notifyObservers(i);
    }

    /* renamed from: com.huawei.hms.adapter.sysobs.SystemManager$a */
    public static class C23441a implements SystemNotifier {

        /* renamed from: a */
        public final List<SystemObserver> f57778a = new ArrayList();

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void unRegisterObserver(SystemObserver systemObserver) {
            synchronized (SystemManager.f57776b) {
                this.f57778a.remove(systemObserver);
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void registerObserver(SystemObserver systemObserver) {
            if (systemObserver != null && !this.f57778a.contains(systemObserver)) {
                synchronized (SystemManager.f57776b) {
                    this.f57778a.add(systemObserver);
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(int i) {
            synchronized (SystemManager.f57776b) {
                Iterator<SystemObserver> it = this.f57778a.iterator();
                while (it.hasNext()) {
                    if (it.next().onUpdateResult(i)) {
                        it.remove();
                    }
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(Intent intent, String str) {
            synchronized (SystemManager.f57776b) {
                Iterator<SystemObserver> it = this.f57778a.iterator();
                while (it.hasNext()) {
                    if (it.next().onSolutionResult(intent, str)) {
                        it.remove();
                    }
                }
            }
        }
    }

    public void notifyResolutionResult(Intent intent, String str) {
        f57777c.notifyObservers(intent, str);
    }
}
