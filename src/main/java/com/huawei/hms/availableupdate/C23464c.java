package com.huawei.hms.availableupdate;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.utils.Checker;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.huawei.hms.availableupdate.c */
public class C23464c implements AbstractC23471e {

    /* renamed from: b */
    public static final Executor f57872b = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    public final AbstractC23471e f57873a;

    /* renamed from: com.huawei.hms.availableupdate.c$a */
    public static class C23465a implements AbstractC23474f {

        /* renamed from: a */
        public final /* synthetic */ AbstractC23474f f57874a;

        /* renamed from: com.huawei.hms.availableupdate.c$a$a */
        public class RunnableC23466a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f57875a;

            /* renamed from: b */
            public final /* synthetic */ C23477g f57876b;

            public void run() {
                C23465a.this.f57874a.mo82118a(this.f57875a, this.f57876b);
            }

            public RunnableC23466a(int i, C23477g gVar) {
                this.f57875a = i;
                this.f57876b = gVar;
            }
        }

        /* renamed from: com.huawei.hms.availableupdate.c$a$b */
        public class RunnableC23467b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f57878a;

            /* renamed from: b */
            public final /* synthetic */ int f57879b;

            /* renamed from: c */
            public final /* synthetic */ int f57880c;

            /* renamed from: d */
            public final /* synthetic */ File f57881d;

            public void run() {
                C23465a.this.f57874a.mo82117a(this.f57878a, this.f57879b, this.f57880c, this.f57881d);
            }

            public RunnableC23467b(int i, int i2, int i3, File file) {
                this.f57878a = i;
                this.f57879b = i2;
                this.f57880c = i3;
                this.f57881d = file;
            }
        }

        public C23465a(AbstractC23474f fVar) {
            this.f57874a = fVar;
        }

        @Override // com.huawei.hms.availableupdate.AbstractC23474f
        /* renamed from: a */
        public void mo82118a(int i, C23477g gVar) {
            new Handler(Looper.getMainLooper()).post(new RunnableC23466a(i, gVar));
        }

        @Override // com.huawei.hms.availableupdate.AbstractC23474f
        /* renamed from: a */
        public void mo82117a(int i, int i2, int i3, File file) {
            new Handler(Looper.getMainLooper()).post(new RunnableC23467b(i, i2, i3, file));
        }
    }

    @Override // com.huawei.hms.availableupdate.AbstractC23471e
    /* renamed from: a */
    public void mo82115a() {
        this.f57873a.mo82115a();
    }

    /* renamed from: com.huawei.hms.availableupdate.c$b */
    public class RunnableC23468b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AbstractC23474f f57883a;

        /* renamed from: b */
        public final /* synthetic */ C23477g f57884b;

        public void run() {
            C23464c.this.f57873a.mo82116a(C23464c.m85110b(this.f57883a), this.f57884b);
        }

        public RunnableC23468b(AbstractC23474f fVar, C23477g gVar) {
            this.f57883a = fVar;
            this.f57884b = gVar;
        }
    }

    /* renamed from: b */
    public static AbstractC23474f m85110b(AbstractC23474f fVar) {
        return new C23465a(fVar);
    }

    public C23464c(AbstractC23471e eVar) {
        Checker.checkNonNull(eVar, "update must not be null.");
        this.f57873a = eVar;
    }

    @Override // com.huawei.hms.availableupdate.AbstractC23471e
    /* renamed from: a */
    public void mo82116a(AbstractC23474f fVar, C23477g gVar) {
        f57872b.execute(new RunnableC23468b(fVar, gVar));
    }
}
