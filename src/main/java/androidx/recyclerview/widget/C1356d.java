package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.C1354c;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: androidx.recyclerview.widget.d */
public class C1356d<T> {

    /* renamed from: e */
    private static final Executor f4798e = new ExecutorC1361b();

    /* renamed from: a */
    final C1354c<T> f4799a;

    /* renamed from: b */
    Executor f4800b;

    /* renamed from: c */
    int f4801c;

    /* renamed from: d */
    private final AbstractC1398p f4802d;

    /* renamed from: f */
    private final List<AbstractC1360a<T>> f4803f;

    /* renamed from: g */
    private List<T> f4804g;

    /* renamed from: h */
    private List<T> f4805h;

    /* renamed from: androidx.recyclerview.widget.d$a */
    public interface AbstractC1360a<T> {
        /* renamed from: a */
        void mo7386a(List<T> list, List<T> list2);
    }

    /* renamed from: a */
    public List<T> mo7374a() {
        return this.f4805h;
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    private static class ExecutorC1361b implements Executor {

        /* renamed from: a */
        final Handler f4814a = new Handler(Looper.getMainLooper());

        ExecutorC1361b() {
        }

        public void execute(Runnable runnable) {
            this.f4814a.post(runnable);
        }
    }

    /* renamed from: a */
    public void mo7375a(AbstractC1360a<T> aVar) {
        this.f4803f.add(aVar);
    }

    /* renamed from: a */
    public void mo7376a(List<T> list) {
        mo7378a(list, null);
    }

    public C1356d(RecyclerView.Adapter adapter, C1374g.AbstractC1378c<T> cVar) {
        this(new C1353b(adapter), new C1354c.C1355a(cVar).mo7373a());
    }

    /* renamed from: b */
    private void m6280b(List<T> list, Runnable runnable) {
        for (AbstractC1360a<T> aVar : this.f4803f) {
            aVar.mo7386a(list, this.f4805h);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public C1356d(AbstractC1398p pVar, C1354c<T> cVar) {
        this.f4803f = new CopyOnWriteArrayList();
        this.f4805h = Collections.emptyList();
        this.f4802d = pVar;
        this.f4799a = cVar;
        if (cVar.mo7369a() != null) {
            this.f4800b = cVar.mo7369a();
        } else {
            this.f4800b = f4798e;
        }
    }

    /* renamed from: a */
    public void mo7378a(final List<T> list, final Runnable runnable) {
        final int i = this.f4801c + 1;
        this.f4801c = i;
        final List<T> list2 = this.f4804g;
        if (list != list2) {
            List<T> list3 = this.f4805h;
            if (list == null) {
                int size = list2.size();
                this.f4804g = null;
                this.f4805h = Collections.emptyList();
                this.f4802d.mo7367b(0, size);
                m6280b(list3, runnable);
            } else if (list2 == null) {
                this.f4804g = list;
                this.f4805h = Collections.unmodifiableList(list);
                this.f4802d.mo7365a(0, list.size());
                m6280b(list3, runnable);
            } else {
                this.f4799a.mo7370b().execute(new Runnable() {
                    /* class androidx.recyclerview.widget.C1356d.RunnableC13571 */

                    public void run() {
                        final C1374g.C1377b a = C1374g.m6297a(new C1374g.AbstractC1376a() {
                            /* class androidx.recyclerview.widget.C1356d.RunnableC13571.C13581 */

                            @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
                            /* renamed from: a */
                            public int mo7380a() {
                                return list2.size();
                            }

                            @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
                            /* renamed from: b */
                            public int mo7382b() {
                                return list.size();
                            }

                            @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
                            /* renamed from: a */
                            public boolean mo7381a(int i, int i2) {
                                Object obj = list2.get(i);
                                Object obj2 = list.get(i2);
                                if (obj != null && obj2 != null) {
                                    return C1356d.this.f4799a.mo7371c().areItemsTheSame(obj, obj2);
                                }
                                if (obj == null && obj2 == null) {
                                    return true;
                                }
                                return false;
                            }

                            @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
                            /* renamed from: b */
                            public boolean mo7383b(int i, int i2) {
                                Object obj = list2.get(i);
                                Object obj2 = list.get(i2);
                                if (obj != null && obj2 != null) {
                                    return C1356d.this.f4799a.mo7371c().areContentsTheSame(obj, obj2);
                                }
                                if (obj == null && obj2 == null) {
                                    return true;
                                }
                                throw new AssertionError();
                            }

                            @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
                            /* renamed from: c */
                            public Object mo7384c(int i, int i2) {
                                Object obj = list2.get(i);
                                Object obj2 = list.get(i2);
                                if (obj != null && obj2 != null) {
                                    return C1356d.this.f4799a.mo7371c().getChangePayload(obj, obj2);
                                }
                                throw new AssertionError();
                            }
                        });
                        C1356d.this.f4800b.execute(new Runnable() {
                            /* class androidx.recyclerview.widget.C1356d.RunnableC13571.RunnableC13592 */

                            public void run() {
                                if (C1356d.this.f4801c == i) {
                                    C1356d.this.mo7377a(list, a, runnable);
                                }
                            }
                        });
                    }
                });
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7377a(List<T> list, C1374g.C1377b bVar, Runnable runnable) {
        List<T> list2 = this.f4805h;
        this.f4804g = list;
        this.f4805h = Collections.unmodifiableList(list);
        bVar.mo7413a(this.f4802d);
        m6280b(list2, runnable);
    }
}
