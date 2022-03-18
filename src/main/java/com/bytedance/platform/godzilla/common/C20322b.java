package com.bytedance.platform.godzilla.common;

import android.os.Looper;
import java.lang.Thread;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.platform.godzilla.common.b */
public class C20322b implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private boolean f49597a;

    /* renamed from: b */
    private Thread.UncaughtExceptionHandler f49598b;

    /* renamed from: c */
    private final List<AbstractC20328h> f49599c = new LinkedList();

    /* renamed from: b */
    public void mo68635b() {
        if (!this.f49597a) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            this.f49598b = defaultUncaughtExceptionHandler;
            if (defaultUncaughtExceptionHandler != this) {
                Thread.setDefaultUncaughtExceptionHandler(this);
            } else {
                this.f49598b = null;
            }
            this.f49597a = true;
        }
    }

    /* renamed from: a */
    public void mo68633a() {
        synchronized (this.f49599c) {
            this.f49599c.clear();
        }
    }

    /* renamed from: b */
    public boolean mo68636b(AbstractC20328h hVar) {
        boolean remove;
        synchronized (this.f49599c) {
            remove = this.f49599c.remove(hVar);
        }
        return remove;
    }

    /* renamed from: a */
    private boolean m74103a(Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (th != null) {
            try {
                if (th instanceof OutOfMemoryError) {
                    return true;
                }
                if (i > 20) {
                    return false;
                }
                i++;
                th = th.getCause();
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo68634a(AbstractC20328h hVar) {
        boolean add;
        synchronized (this.f49599c) {
            add = this.f49599c.add(hVar);
        }
        return add;
    }

    /* renamed from: a */
    private void m74102a(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f49598b;
        if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* renamed from: b */
    private boolean m74104b(Thread thread, Throwable th) throws Throwable {
        try {
            synchronized (this.f49599c) {
                for (AbstractC20328h hVar : this.f49599c) {
                    if (hVar.mo68568a(thread, th)) {
                        return true;
                    }
                }
                return false;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        try {
            if (m74103a(th) || !m74104b(thread, th)) {
                m74102a(thread, th);
            } else if (thread != null && thread.getName().equals("main")) {
                while (true) {
                    try {
                        Looper.loop();
                    } catch (Exception e) {
                        if (m74103a(e) || !m74104b(thread, e)) {
                            m74102a(thread, e);
                        }
                    }
                }
                m74102a(thread, e);
            }
        } catch (Throwable th2) {
            m74102a(thread, th2);
        }
    }
}
