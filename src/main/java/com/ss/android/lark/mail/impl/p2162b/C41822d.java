package com.ss.android.lark.mail.impl.p2162b;

import android.os.Handler;
import android.os.Looper;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.utils.C43849u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.b.d */
public class C41822d {

    /* renamed from: a */
    public AbstractC41829c f106171a;

    /* renamed from: b */
    public List<AbstractC41817a> f106172b;

    /* renamed from: c */
    public AbstractC41817a f106173c;

    /* renamed from: d */
    private final String f106174d;

    /* renamed from: e */
    private Handler f106175e;

    /* renamed from: com.ss.android.lark.mail.impl.b.d$a */
    public static abstract class AbstractC41826a {
        /* renamed from: a */
        public abstract void mo150379a();

        /* renamed from: b */
        public abstract void mo150380b();
    }

    /* renamed from: com.ss.android.lark.mail.impl.b.d$c */
    public interface AbstractC41829c {
        /* renamed from: a */
        void mo150394a(AbstractC41817a aVar);

        /* renamed from: a */
        void mo150395a(boolean z);
    }

    /* renamed from: a */
    public void mo150384a() {
        Log.m165389i("OperationChain", "start");
        mo150386b();
    }

    /* renamed from: b */
    public void mo150386b() {
        m166123a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.p2162b.C41822d.RunnableC418231 */

            public void run() {
                Log.m165389i("OperationChain", "runNextOperation");
                if (CollectionUtils.isEmpty(C41822d.this.f106172b)) {
                    Log.m165389i("OperationChain", "runNextOperation run out of operation");
                    C41822d.this.mo150385a(false);
                    return;
                }
                C41822d dVar = C41822d.this;
                dVar.f106173c = dVar.f106172b.remove(0);
                if (C41822d.this.f106173c == null) {
                    Log.m165383e("OperationChain", "runNextOperation invalid operation");
                    C41822d.this.mo150385a(false);
                    return;
                }
                C41822d.this.f106173c.run(new AbstractC41826a() {
                    /* class com.ss.android.lark.mail.impl.p2162b.C41822d.RunnableC418231.C418241 */

                    @Override // com.ss.android.lark.mail.impl.p2162b.C41822d.AbstractC41826a
                    /* renamed from: a */
                    public void mo150379a() {
                        Log.m165389i("OperationChain", "stop");
                        if (C41822d.this.f106171a != null) {
                            C41822d.this.f106171a.mo150394a(C41822d.this.f106173c);
                        }
                        C41822d.this.mo150385a(true);
                    }

                    @Override // com.ss.android.lark.mail.impl.p2162b.C41822d.AbstractC41826a
                    /* renamed from: b */
                    public void mo150380b() {
                        Log.m165389i("OperationChain", "done");
                        if (C41822d.this.f106171a != null) {
                            C41822d.this.f106171a.mo150394a(C41822d.this.f106173c);
                        }
                        C41822d.this.mo150386b();
                    }
                });
            }
        });
    }

    /* renamed from: com.ss.android.lark.mail.impl.b.d$b */
    public static final class C41827b {

        /* renamed from: a */
        private Handler f106180a;

        /* renamed from: b */
        private AbstractC41829c f106181b;

        /* renamed from: c */
        private final List<AbstractC41817a> f106182c = new ArrayList();

        /* renamed from: a */
        public C41822d mo150393a() {
            Handler handler = this.f106180a;
            if (handler == null) {
                handler = C43849u.m173824a();
            }
            return new C41822d(handler, this.f106181b, this.f106182c);
        }

        /* renamed from: a */
        public C41827b mo150389a(Handler handler) {
            this.f106180a = handler;
            return this;
        }

        /* renamed from: a */
        public C41827b mo150390a(AbstractC41817a aVar) {
            this.f106182c.add(aVar);
            return this;
        }

        /* renamed from: a */
        public C41827b mo150391a(AbstractC41829c cVar) {
            this.f106181b = cVar;
            return this;
        }

        /* renamed from: a */
        public C41827b mo150392a(String str, final AbstractC41817a aVar) {
            this.f106182c.add(new AbstractC41821c(str) {
                /* class com.ss.android.lark.mail.impl.p2162b.C41822d.C41827b.C418281 */

                @Override // com.ss.android.lark.mail.impl.p2162b.AbstractC41817a
                public void run(AbstractC41826a aVar) {
                    aVar.run(aVar);
                }
            });
            return this;
        }
    }

    /* renamed from: a */
    private void m166123a(Runnable runnable) {
        if (Looper.myLooper() == this.f106175e.getLooper()) {
            runnable.run();
        } else {
            this.f106175e.post(runnable);
        }
    }

    /* renamed from: a */
    public void mo150385a(final boolean z) {
        m166123a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.p2162b.C41822d.RunnableC418252 */

            public void run() {
                Log.m165389i("OperationChain", "destroy");
                if (C41822d.this.f106171a != null) {
                    C41822d.this.f106171a.mo150395a(z);
                }
                C41822d.this.f106173c = null;
                C41822d.this.f106172b = null;
            }
        });
    }

    private C41822d(Handler handler, AbstractC41829c cVar, List<AbstractC41817a> list) {
        this.f106174d = "OperationChain";
        this.f106175e = handler;
        this.f106171a = cVar;
        this.f106172b = list;
    }
}
