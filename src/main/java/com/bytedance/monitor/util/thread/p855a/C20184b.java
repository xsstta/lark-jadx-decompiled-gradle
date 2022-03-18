package com.bytedance.monitor.util.thread.p855a;

import android.util.Pair;
import com.bytedance.monitor.util.thread.AbstractC20193e;
import com.bytedance.monitor.util.thread.AbstractRunnableC20192d;
import com.bytedance.monitor.util.thread.C20188b;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.monitor.util.thread.a.b */
public class C20184b extends ScheduledThreadPoolExecutor implements AbstractC20187c {

    /* renamed from: a */
    public final String f49310a = getClass().getSimpleName();

    /* renamed from: b */
    private boolean f49311b = true;

    /* renamed from: c */
    private AbstractC20193e f49312c;

    /* renamed from: d */
    private final Map<Integer, List<ScheduledFuture<?>>> f49313d = new ConcurrentHashMap();

    /* renamed from: e */
    private final Map<ScheduledFuture<?>, Pair<Integer, Boolean>> f49314e = new ConcurrentHashMap();

    /* renamed from: f */
    private ExecutorService f49315f;

    /* renamed from: g */
    private ThreadPoolExecutor f49316g;

    /* renamed from: h */
    private int f49317h;

    /* renamed from: i */
    private C20186a f49318i;

    /* access modifiers changed from: protected */
    public void terminated() {
        super.terminated();
    }

    /* renamed from: a */
    public boolean mo68341a() {
        AbstractC20193e eVar;
        return this.f49311b && (eVar = this.f49312c) != null && eVar.mo68353a();
    }

    /* renamed from: b */
    private boolean m73671b() {
        if (this.f49317h > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.monitor.util.thread.a.b$a */
    public class C20186a {

        /* renamed from: a */
        public Runnable f49321a;

        /* renamed from: b */
        public Thread f49322b;

        /* renamed from: c */
        public long f49323c = System.currentTimeMillis();

        /* renamed from: d */
        public int f49324d;

        /* renamed from: a */
        public boolean mo68349a() {
            if (System.currentTimeMillis() - this.f49323c > ((long) this.f49324d)) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public void mo68350b() {
            Runnable runnable = this.f49321a;
            if (runnable != null && (runnable instanceof FutureTask)) {
                boolean cancel = ((FutureTask) runnable).cancel(true);
                if (C20184b.this.mo68341a()) {
                    C20184b bVar = C20184b.this;
                    bVar.mo68339a("TimeSensitive + mCancelOverTimeTaskRunnable run ------------ cancel FutureTask, canceled?" + cancel);
                }
            }
        }

        public C20186a(Runnable runnable, Thread thread, int i) {
            this.f49321a = runnable;
            this.f49322b = thread;
            this.f49324d = i;
        }
    }

    /* renamed from: c */
    private void m73672c() {
        C20186a aVar = this.f49318i;
        if (aVar != null && aVar.mo68349a()) {
            this.f49318i.mo68350b();
            this.f49318i = null;
        }
    }

    /* renamed from: a */
    public void mo68338a(AbstractC20193e eVar) {
        this.f49312c = eVar;
    }

    /* renamed from: a */
    public void mo68339a(String str) {
        C20188b.m73692a(this.f49312c, this.f49310a, str);
    }

    /* renamed from: a */
    private String m73667a(Runnable runnable) {
        if (runnable instanceof AbstractRunnableC20192d) {
            return ((AbstractRunnableC20192d) runnable).mo12092a();
        }
        if (runnable == null) {
            return "null";
        }
        return runnable.toString();
    }

    @Override // com.bytedance.monitor.util.thread.p855a.AbstractC20187c
    /* renamed from: b */
    public void mo68328b(AbstractRunnableC20192d dVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f49316g;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.remove(dVar);
        }
        if (!m73673c(dVar) && mo68341a()) {
            mo68339a("z-debug-removeTask " + C20188b.m73691a(dVar) + ", remove failed");
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        if (this.f49315f == null) {
            return super.submit(runnable);
        }
        if (mo68341a()) {
            mo68339a("submit task to outer-executor: " + m73667a(runnable));
        }
        return this.f49315f.submit(runnable);
    }

    /* renamed from: c */
    private boolean m73673c(AbstractRunnableC20192d dVar) {
        boolean z;
        boolean z2 = false;
        if (dVar == null) {
            return false;
        }
        int hashCode = dVar.hashCode();
        List<ScheduledFuture<?>> list = this.f49313d.get(Integer.valueOf(hashCode));
        StringBuilder sb = new StringBuilder();
        sb.append("z-debug scheduledFutures in ?");
        if (list != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        mo68339a(sb.toString());
        if (list != null && !list.isEmpty()) {
            if (mo68341a()) {
                mo68339a("z-debug-removeTask from mTaskFutureMap" + C20188b.m73691a(dVar));
                mo68339a("z-debug scheduledFutures size:" + list.size());
            }
            for (ScheduledFuture<?> scheduledFuture : list) {
                if (!scheduledFuture.isCancelled()) {
                    if (scheduledFuture.cancel(true)) {
                        z2 = true;
                    }
                    m73668a(Integer.valueOf(hashCode), scheduledFuture);
                }
            }
        }
        return z2;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        if (this.f49315f == null) {
            return super.submit(callable);
        }
        if (mo68341a()) {
            mo68339a("submit task to outer-executor: " + callable);
        }
        return this.f49315f.submit(callable);
    }

    @Override // com.bytedance.monitor.util.thread.p855a.AbstractC20187c
    /* renamed from: a */
    public void mo68322a(AbstractRunnableC20192d dVar) {
        if (mo68341a()) {
            mo68339a("post " + C20188b.m73691a(dVar));
        }
        submit(dVar);
        m73672c();
        if (this.f49315f == null && mo68341a()) {
            mo68339a("current task count: " + getQueue().size());
        }
    }

    /* renamed from: a */
    public void mo68340a(final ExecutorService executorService) {
        if (executorService == null) {
            this.f49315f = null;
            this.f49316g = null;
            return;
        }
        if (executorService instanceof ThreadPoolExecutor) {
            this.f49316g = (ThreadPoolExecutor) executorService;
        }
        this.f49315f = (ExecutorService) Proxy.newProxyInstance(executorService.getClass().getClassLoader(), new Class[]{ExecutorService.class}, new InvocationHandler() {
            /* class com.bytedance.monitor.util.thread.p855a.C20184b.C201851 */

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                Object invoke = method.invoke(executorService, objArr);
                if (C20184b.this.mo68341a()) {
                    String str = "null";
                    if (objArr != null) {
                        for (Object obj2 : objArr) {
                            str = str + obj2;
                        }
                    }
                    C20184b.this.mo68339a("call outer-executor " + method.getName() + ", args: " + str);
                    if ("submit".equals(method.getName())) {
                        C20184b.this.mo68339a("call outer-executor " + method.getName() + ", args: " + str);
                    }
                }
                return invoke;
            }
        });
    }

    /* access modifiers changed from: protected */
    public void beforeExecute(Thread thread, Runnable runnable) {
        m73670a(true, runnable, thread);
        super.beforeExecute(thread, runnable);
    }

    public C20184b(int i, ThreadFactory threadFactory) {
        super(i, threadFactory);
    }

    /* renamed from: a */
    private void m73668a(Integer num, ScheduledFuture scheduledFuture) {
        boolean z;
        List<ScheduledFuture<?>> list = this.f49313d.get(num);
        if (list != null) {
            z = list.remove(scheduledFuture);
            if (list.isEmpty()) {
                this.f49313d.remove(num);
            }
        } else {
            z = false;
        }
        this.f49314e.remove(scheduledFuture);
        if (mo68341a()) {
            mo68339a("z-debug removeMapRecord: " + scheduledFuture + ", removed: " + z);
        }
    }

    /* access modifiers changed from: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        ScheduledFuture scheduledFuture;
        Pair<Integer, Boolean> pair;
        super.afterExecute(runnable, th);
        m73670a(false, runnable, (Thread) null);
        if ((runnable instanceof ScheduledFuture) && (pair = this.f49314e.get((scheduledFuture = (ScheduledFuture) runnable))) != null && pair.first != null) {
            int intValue = ((Integer) pair.first).intValue();
            Boolean bool = (Boolean) pair.second;
            if (bool != null && !bool.booleanValue()) {
                if (mo68341a()) {
                    mo68339a("z-debug postDelay or scheduled task: " + runnable + ", taskHashCode: " + intValue + ", in map? " + this.f49313d.containsKey(Integer.valueOf(intValue)));
                }
                m73668a(Integer.valueOf(intValue), scheduledFuture);
            }
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        if (this.f49315f == null) {
            return super.submit(runnable, t);
        }
        if (mo68341a()) {
            mo68339a("submit task to outer-executor: " + m73667a(runnable));
        }
        return this.f49315f.submit(runnable, t);
    }

    @Override // com.bytedance.monitor.util.thread.p855a.AbstractC20187c
    /* renamed from: a */
    public void mo68323a(AbstractRunnableC20192d dVar, long j) {
        if (dVar != null) {
            if (mo68341a()) {
                mo68339a("postDelayed " + C20188b.m73691a(dVar));
            }
            m73669a(schedule(dVar, j, TimeUnit.MILLISECONDS), dVar.hashCode(), false);
            m73672c();
        }
    }

    /* renamed from: a */
    private void m73670a(boolean z, Runnable runnable, Thread thread) {
        if (m73671b()) {
            if (z) {
                this.f49318i = new C20186a(runnable, thread, this.f49317h);
            } else {
                this.f49318i = null;
            }
        }
    }

    /* renamed from: a */
    private void m73669a(ScheduledFuture<?> scheduledFuture, int i, boolean z) {
        List<ScheduledFuture<?>> list = this.f49313d.get(Integer.valueOf(i));
        if (list == null) {
            list = new CopyOnWriteArrayList<>();
            this.f49313d.put(Integer.valueOf(i), list);
        }
        list.add(scheduledFuture);
        this.f49314e.put(scheduledFuture, new Pair<>(Integer.valueOf(i), Boolean.valueOf(z)));
        if (mo68341a()) {
            mo68339a("z-debug saveToMap -current task count: " + getQueue().size() + ", thread-count; " + getActiveCount());
            mo68339a("z-debug saveToMap >>>>>> mTaskFutureMap size: " + this.f49313d.size() + ", mFutureTaskMap size: " + this.f49314e.size());
            StringBuilder sb = new StringBuilder();
            sb.append("z-debug saveToMap >>>>>> sameHashCodeFutures size: ");
            sb.append(list.size());
            mo68339a(sb.toString());
        }
    }

    @Override // com.bytedance.monitor.util.thread.p855a.AbstractC20187c
    /* renamed from: a */
    public void mo68324a(AbstractRunnableC20192d dVar, long j, long j2) {
        if (dVar != null) {
            if (mo68341a()) {
                mo68339a("scheduleWithFixedDelay " + C20188b.m73691a(dVar) + ", initialDelay: " + j + ", delayInMillis: " + j2 + "\n task count: " + getQueue().size());
            }
            m73673c(dVar);
            m73669a(scheduleWithFixedDelay(dVar, j, j2, TimeUnit.MILLISECONDS), dVar.hashCode(), true);
            m73672c();
        }
    }
}
