package com.ss.android.lark.utils;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ViewUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.utils.af */
public class C57768af {

    /* renamed from: com.ss.android.lark.utils.af$c */
    public static abstract class AbstractRunnableC57773c<T> implements Runnable {

        /* renamed from: a */
        private boolean f142287a;

        /* renamed from: b */
        private long f142288b;

        /* renamed from: c */
        private RunnableC57771a f142289c;

        /* renamed from: g */
        public volatile boolean f142290g;

        /* renamed from: h */
        public volatile boolean f142291h;

        /* renamed from: i */
        public volatile boolean f142292i;

        /* renamed from: j */
        public ViewUtils.AbstractC57752b f142293j;

        /* renamed from: k */
        public Runnable f142294k;

        /* renamed from: l */
        public Runnable f142295l;

        /* renamed from: a */
        public abstract void mo130914a(T t);

        /* renamed from: b */
        public abstract T mo130916b();

        public AbstractRunnableC57773c() {
            this(true);
        }

        public void run() {
            mo196076b(mo130916b());
        }

        /* renamed from: c */
        public void mo196077c() {
            ViewUtils.m224148a(new Runnable() {
                /* class com.ss.android.lark.utils.C57768af.AbstractRunnableC57773c.RunnableC577741 */

                public void run() {
                    if (!AbstractRunnableC57773c.this.f142291h && !AbstractRunnableC57773c.this.f142290g) {
                        AbstractRunnableC57773c.this.f142292i = true;
                        if (AbstractRunnableC57773c.this.f142294k == null || !AbstractRunnableC57773c.this.mo196080f()) {
                            AbstractRunnableC57773c.this.mo196081g();
                            return;
                        }
                        AbstractRunnableC57773c.this.f142293j.mo196042e();
                        ViewUtils.m224149a(new Runnable() {
                            /* class com.ss.android.lark.utils.C57768af.AbstractRunnableC57773c.RunnableC577741.RunnableC577751 */

                            public void run() {
                                if (AbstractRunnableC57773c.this.f142294k != null && AbstractRunnableC57773c.this.mo196080f()) {
                                    AbstractRunnableC57773c.this.f142294k.run();
                                }
                                AbstractRunnableC57773c.this.mo196081g();
                            }
                        }, 100);
                    }
                }
            });
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo196079e() {
            ViewUtils.m224148a(new Runnable() {
                /* class com.ss.android.lark.utils.C57768af.AbstractRunnableC57773c.RunnableC577784 */

                public void run() {
                    if (!AbstractRunnableC57773c.this.f142291h && !AbstractRunnableC57773c.this.f142292i) {
                        AbstractRunnableC57773c.this.f142290g = true;
                        if (AbstractRunnableC57773c.this.f142295l == null || !AbstractRunnableC57773c.this.mo196080f()) {
                            AbstractRunnableC57773c.this.mo196081g();
                            return;
                        }
                        AbstractRunnableC57773c.this.f142293j.mo196042e();
                        ViewUtils.m224149a(new Runnable() {
                            /* class com.ss.android.lark.utils.C57768af.AbstractRunnableC57773c.RunnableC577784.RunnableC577791 */

                            public void run() {
                                if (AbstractRunnableC57773c.this.f142295l != null && AbstractRunnableC57773c.this.mo196080f()) {
                                    AbstractRunnableC57773c.this.f142295l.run();
                                }
                                AbstractRunnableC57773c.this.mo196081g();
                            }
                        }, 100);
                    }
                }
            });
        }

        /* renamed from: f */
        public boolean mo196080f() {
            ViewUtils.AbstractC57752b bVar = this.f142293j;
            if (bVar == null) {
                return false;
            }
            return bVar.mo196044g();
        }

        /* renamed from: g */
        public void mo196081g() {
            this.f142294k = null;
            this.f142295l = null;
            this.f142289c = null;
            this.f142293j = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo196078d() {
            if (this.f142294k != null) {
                this.f142293j.mo196036a(new DialogInterface.OnCancelListener() {
                    /* class com.ss.android.lark.utils.C57768af.AbstractRunnableC57773c.DialogInterface$OnCancelListenerC577762 */

                    public void onCancel(DialogInterface dialogInterface) {
                        AbstractRunnableC57773c.this.mo196077c();
                    }
                });
            }
            if (this.f142288b > 0 && this.f142295l != null) {
                ViewUtils.m224149a(new Runnable() {
                    /* class com.ss.android.lark.utils.C57768af.AbstractRunnableC57773c.RunnableC577773 */

                    public void run() {
                        AbstractRunnableC57773c.this.mo196079e();
                    }
                }, this.f142288b);
            }
            this.f142293j.mo196039b();
            if (this.f142287a) {
                CoreThreadPool.getDefault().getCachedThreadPool().execute(this.f142289c);
            } else {
                run();
            }
        }

        /* renamed from: a */
        public AbstractRunnableC57773c mo196074a(ViewUtils.AbstractC57752b bVar) {
            this.f142293j = bVar;
            return this;
        }

        public AbstractRunnableC57773c(boolean z) {
            this.f142289c = new RunnableC57771a(this);
            this.f142287a = z;
        }

        /* renamed from: a */
        public AbstractRunnableC57773c<T> mo196075a(Runnable runnable) {
            this.f142294k = runnable;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo196076b(final T t) {
            ViewUtils.m224148a(new Runnable() {
                /* class com.ss.android.lark.utils.C57768af.AbstractRunnableC57773c.RunnableC577805 */

                public void run() {
                    if (!AbstractRunnableC57773c.this.f142290g && !AbstractRunnableC57773c.this.f142292i) {
                        AbstractRunnableC57773c.this.f142291h = true;
                        if (AbstractRunnableC57773c.this.mo196080f()) {
                            AbstractRunnableC57773c.this.f142293j.mo196042e();
                            ViewUtils.m224149a(new Runnable() {
                                /* class com.ss.android.lark.utils.C57768af.AbstractRunnableC57773c.RunnableC577805.RunnableC577811 */

                                /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: com.ss.android.lark.utils.af$c */
                                /* JADX WARN: Multi-variable type inference failed */
                                public void run() {
                                    if (AbstractRunnableC57773c.this.mo196080f()) {
                                        AbstractRunnableC57773c.this.mo130914a(t);
                                    }
                                    AbstractRunnableC57773c.this.mo196081g();
                                }
                            }, 100);
                            return;
                        }
                        AbstractRunnableC57773c.this.mo196081g();
                    }
                }
            });
        }

        /* renamed from: a */
        public AbstractRunnableC57773c<T> mo196073a(long j, Runnable runnable) {
            this.f142288b = j;
            this.f142295l = runnable;
            return this;
        }
    }

    /* renamed from: com.ss.android.lark.utils.af$a */
    public static class RunnableC57771a implements Runnable {

        /* renamed from: a */
        private WeakReference<Runnable> f142283a;

        public void run() {
            Runnable runnable = this.f142283a.get();
            if (runnable != null) {
                runnable.run();
            }
        }

        public RunnableC57771a(Runnable runnable) {
            this.f142283a = new WeakReference<>(runnable);
        }
    }

    /* renamed from: com.ss.android.lark.utils.af$b */
    public static class C57772b<T> {

        /* renamed from: a */
        private CountDownLatch f142284a = new CountDownLatch(1);

        /* renamed from: b */
        private AtomicBoolean f142285b = new AtomicBoolean();

        /* renamed from: c */
        private T f142286c;

        /* renamed from: a */
        public T mo196071a() {
            if (!this.f142285b.get()) {
                try {
                    this.f142284a.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return this.f142286c;
        }

        /* renamed from: a */
        public void mo196072a(T t) {
            if (this.f142285b.compareAndSet(false, true)) {
                this.f142286c = t;
                this.f142284a.countDown();
            }
        }
    }

    /* renamed from: a */
    public static ViewUtils.AbstractC57752b m224217a(Context context, boolean z) {
        if (z) {
            return ViewUtils.m224154c(context);
        }
        return ViewUtils.m224155d(context);
    }

    /* renamed from: b */
    public static <T> void m224220b(final Context context, final AbstractRunnableC57773c<T> cVar) {
        ViewUtils.m224148a(new Runnable() {
            /* class com.ss.android.lark.utils.C57768af.RunnableC577702 */

            public void run() {
                Context context = context;
                C57768af.m224219a(context, cVar, C57768af.m224217a(context, true));
            }
        });
    }

    /* renamed from: a */
    public static <T> void m224218a(final Context context, final AbstractRunnableC57773c<T> cVar) {
        ViewUtils.m224148a(new Runnable() {
            /* class com.ss.android.lark.utils.C57768af.RunnableC577691 */

            public void run() {
                Context context = context;
                C57768af.m224219a(context, cVar, C57768af.m224217a(context, false));
            }
        });
    }

    /* renamed from: a */
    public static <T> void m224219a(Context context, AbstractRunnableC57773c<T> cVar, ViewUtils.AbstractC57752b bVar) {
        if (!ViewUtils.m224153b(context)) {
            Log.m165397w("TaskUtils", "context is not alive: " + context);
            return;
        }
        cVar.mo196074a(bVar).mo196078d();
    }
}
