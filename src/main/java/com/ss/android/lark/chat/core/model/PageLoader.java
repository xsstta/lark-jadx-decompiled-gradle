package com.ss.android.lark.chat.core.model;

import com.ss.android.lark.chat.core.model.PageLoader;
import com.ss.android.lark.chat.core.model.PageLoader.C33949b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

public abstract class PageLoader<T extends C33949b, PageData> {

    /* renamed from: a */
    Executor f87530a;

    public interface IReceiver<PageData> {

        @Retention(RetentionPolicy.SOURCE)
        public @interface ResultType {
        }

        /* renamed from: a */
        void mo122978a(int i, PageData pagedata);

        /* renamed from: a */
        void mo122979a(int i, Throwable th);
    }

    /* renamed from: com.ss.android.lark.chat.core.model.PageLoader$a */
    public interface AbstractC33948a<PageData> {
        /* renamed from: a */
        void mo124053a(PageData pagedata);

        /* renamed from: a */
        void mo124054a(Throwable th);
    }

    /* renamed from: com.ss.android.lark.chat.core.model.PageLoader$c */
    public interface AbstractC33950c {
        int getPosition();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo124046a(T t, AbstractC33948a<PageData> aVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo124050b(T t, AbstractC33948a<PageData> aVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void m131376d(T t, AbstractC33948a<PageData> aVar);

    /* renamed from: com.ss.android.lark.chat.core.model.PageLoader$b */
    public static class C33949b {

        /* renamed from: a */
        private final AbstractC33950c f87531a;

        /* renamed from: b */
        private final int f87532b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ int m131391a(int i) {
            return i;
        }

        /* renamed from: b */
        public int mo124056b() {
            return this.f87532b;
        }

        /* renamed from: a */
        public int mo124055a() {
            return this.f87531a.getPosition();
        }

        public C33949b(AbstractC33950c cVar, int i) {
            this.f87531a = cVar;
            this.f87532b = i;
        }

        public C33949b(int i, int i2) {
            this.f87531a = new AbstractC33950c(i) {
                /* class com.ss.android.lark.chat.core.model.$$Lambda$PageLoader$b$r81l5RQqzY305lxG25yC9fXZRE */
                public final /* synthetic */ int f$0;

                {
                    this.f$0 = r1;
                }

                @Override // com.ss.android.lark.chat.core.model.PageLoader.AbstractC33950c
                public final int getPosition() {
                    return PageLoader.C33949b.m131391a(this.f$0);
                }
            };
            this.f87532b = i2;
        }
    }

    public PageLoader(Executor executor) {
        this.f87530a = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.core.model.PageLoader$d */
    public static class C33951d<PageData> implements AbstractC33948a<PageData> {

        /* renamed from: a */
        IReceiver<PageData> f87533a;

        /* renamed from: b */
        private int f87534b;

        @Override // com.ss.android.lark.chat.core.model.PageLoader.AbstractC33948a
        /* renamed from: a */
        public void mo124053a(PageData pagedata) {
            IReceiver<PageData> iReceiver = this.f87533a;
            if (iReceiver != null) {
                iReceiver.mo122978a(this.f87534b, (Object) pagedata);
            }
        }

        @Override // com.ss.android.lark.chat.core.model.PageLoader.AbstractC33948a
        /* renamed from: a */
        public void mo124054a(Throwable th) {
            IReceiver<PageData> iReceiver = this.f87533a;
            if (iReceiver != null) {
                iReceiver.mo122979a(this.f87534b, th);
            }
        }

        public C33951d(IReceiver<PageData> iReceiver, int i) {
            this.f87533a = iReceiver;
            this.f87534b = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo124048a(Runnable runnable) {
        Executor executor = this.f87530a;
        if (executor != null) {
            executor.execute(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.lark.chat.core.model.PageLoader$b */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m131375d(C33949b bVar, IReceiver iReceiver) {
        mo124046a(bVar, new C33951d(iReceiver, 2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.lark.chat.core.model.PageLoader$b */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m131377e(C33949b bVar, IReceiver iReceiver) {
        mo124050b(bVar, new C33951d(iReceiver, 1));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.lark.chat.core.model.PageLoader$b */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m131378f(C33949b bVar, IReceiver iReceiver) {
        m131376d(bVar, new C33951d(iReceiver, 0));
    }

    /* renamed from: a */
    public void mo124045a(T t, IReceiver<PageData> iReceiver) {
        mo124048a(new Runnable(t, iReceiver) {
            /* class com.ss.android.lark.chat.core.model.$$Lambda$PageLoader$mYL3UufMOR7cpdReL1ZL0Se5SNU */
            public final /* synthetic */ PageLoader.C33949b f$1;
            public final /* synthetic */ PageLoader.IReceiver f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                PageLoader.this.m131378f(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: b */
    public void mo124049b(T t, IReceiver<PageData> iReceiver) {
        mo124048a(new Runnable(t, iReceiver) {
            /* class com.ss.android.lark.chat.core.model.$$Lambda$PageLoader$QxSKtMOGojDRFE3D5nx2mlEdiLA */
            public final /* synthetic */ PageLoader.C33949b f$1;
            public final /* synthetic */ PageLoader.IReceiver f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                PageLoader.this.m131377e(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: c */
    public void mo124051c(T t, IReceiver<PageData> iReceiver) {
        mo124048a(new Runnable(t, iReceiver) {
            /* class com.ss.android.lark.chat.core.model.$$Lambda$PageLoader$VjJ2b0kztzE_MvVmswsr2tSEnU */
            public final /* synthetic */ PageLoader.C33949b f$1;
            public final /* synthetic */ PageLoader.IReceiver f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                PageLoader.this.m131375d((PageLoader) this.f$1, (PageLoader.C33949b) this.f$2);
            }
        });
    }

    /* renamed from: a */
    public void mo124047a(T t, AbstractC33948a<PageData> aVar, Executor executor) {
        executor.execute(new Runnable(t, aVar) {
            /* class com.ss.android.lark.chat.core.model.$$Lambda$PageLoader$sDqWQ3fM2wgN0YltBi1TR6xRfFM */
            public final /* synthetic */ PageLoader.C33949b f$1;
            public final /* synthetic */ PageLoader.AbstractC33948a f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                PageLoader.this.m131376d((PageLoader) this.f$1, (PageLoader.C33949b) this.f$2);
            }
        });
    }
}
