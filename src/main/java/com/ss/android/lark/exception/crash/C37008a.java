package com.ss.android.lark.exception.crash;

import android.content.Context;
import com.ss.android.lark.exception.crash.p1828a.C37012a;
import java.lang.Thread;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.exception.crash.a */
public class C37008a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private Thread.UncaughtExceptionHandler f95117a;

    /* renamed from: b */
    private List<AbstractC37010a> f95118b;

    /* renamed from: com.ss.android.lark.exception.crash.a$a */
    public interface AbstractC37010a {
        /* renamed from: a */
        boolean mo136537a(Thread thread, Throwable th);
    }

    /* renamed from: com.ss.android.lark.exception.crash.a$b */
    public static class C37011b {

        /* renamed from: a */
        public static final C37008a f95119a = new C37008a();
    }

    /* renamed from: a */
    public static C37008a m146044a() {
        return C37011b.f95119a;
    }

    private C37008a() {
        this.f95118b = new CopyOnWriteArrayList();
    }

    /* renamed from: a */
    public void mo136535a(AbstractC37010a aVar) {
        this.f95118b.add(aVar);
    }

    /* renamed from: a */
    public void mo136534a(Context context) {
        this.f95117a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
        mo136535a(new C37012a(context));
    }

    public void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f95117a;
        if (!(uncaughtExceptionHandler == null || uncaughtExceptionHandler == this)) {
            for (AbstractC37010a aVar : this.f95118b) {
                aVar.mo136537a(thread, th);
            }
            this.f95117a.uncaughtException(thread, th);
        }
    }
}
