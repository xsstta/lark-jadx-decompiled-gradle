package com.ss.android.lark.wschannelprocess.statistics;

import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.wschannelprocess.C59307d;
import com.ss.android.lark.wschannelprocess.dto.AbstractC59312a;
import com.ss.android.lark.wschannelprocess.p2985a.AbstractC59297a;
import com.ss.android.lark.wschannelprocess.statistics.db.C59325a;
import com.ss.android.lark.wschannelprocess.statistics.db.DBData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.wschannelprocess.statistics.c */
public class C59320c<T extends AbstractC59312a> {

    /* renamed from: a */
    public AbstractC59314a<T> f147284a;

    /* renamed from: b */
    public Executor f147285b;

    /* renamed from: c */
    public volatile AtomicBoolean f147286c;

    /* renamed from: d */
    public AbstractC59317b<T> f147287d;

    /* renamed from: e */
    public String f147288e;

    /* renamed from: f */
    private AbstractC59297a.AbstractC59298a f147289f;

    /* renamed from: g */
    private Callable<Boolean> f147290g = new Callable<Boolean>() {
        /* class com.ss.android.lark.wschannelprocess.statistics.C59320c.CallableC593232 */

        /* renamed from: a */
        public Boolean call() throws Exception {
            try {
                List<DBData> a = C59325a.m230337a().mo201649a(C59320c.this.f147288e, 100);
                if (CollectionUtils.isEmpty(a)) {
                    Log.m165389i("RecorderImpl", C59320c.this.f147288e + " records size is 0");
                    return true;
                }
                if (C59320c.this.f147287d != null) {
                    if (C59320c.this.f147287d.mo201633a(C59320c.this.mo201638a(a))) {
                        Log.m165389i("RecorderImpl", C59320c.this.f147288e + " consume records: " + a.size());
                        C59325a.m230337a().mo201651a(C59320c.this.f147288e, a);
                    } else {
                        Log.m165383e("RecorderImpl", "consume records fail -- check ipc status");
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                Log.m165383e("RecorderImpl", C59320c.this.f147288e + " consume records fail :" + e.getMessage());
                return true;
            }
        }
    };

    /* renamed from: c */
    private void m230329c() {
        this.f147289f.mo177790a(new AbstractC59297a.AbstractC59298a.AbstractC59299a() {
            /* class com.ss.android.lark.wschannelprocess.statistics.C59320c.C593211 */

            @Override // com.ss.android.lark.wschannelprocess.p2985a.AbstractC59297a.AbstractC59298a.AbstractC59299a
            /* renamed from: a */
            public void mo201568a(final boolean z) {
                C59320c.this.f147285b.execute(new Runnable() {
                    /* class com.ss.android.lark.wschannelprocess.statistics.C59320c.C593211.RunnableC593221 */

                    public void run() {
                        try {
                            Log.m165389i("RecorderImpl", C59320c.this.f147288e + " on app state changed: is front :" + C59320c.this.f147286c.get());
                            C59320c.this.f147286c.set(z);
                            if (z) {
                                C59320c.this.mo201639a();
                            }
                        } catch (Exception e) {
                            Log.m165383e("RecorderImpl", e.getMessage());
                        }
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo201642b() {
        if (this.f147286c.get()) {
            mo201639a();
        }
    }

    /* renamed from: a */
    public void mo201639a() {
        boolean z = false;
        while (!z) {
            try {
                z = ((Boolean) CoreThreadPool.getDefault().getScheduleThreadPool().schedule(this.f147290g, 500, TimeUnit.MILLISECONDS).get()).booleanValue();
            } catch (Exception e) {
                Log.m165383e("RecorderImpl", this.f147288e + " query occurs wrong: " + e.getMessage());
            }
        }
        Log.m165389i("RecorderImpl", this.f147288e + " record upload complete");
    }

    /* renamed from: a */
    public void mo201641a(AbstractC59317b<T> bVar) {
        this.f147287d = bVar;
    }

    /* renamed from: a */
    public void mo201640a(final T t) {
        this.f147285b.execute(new Runnable() {
            /* class com.ss.android.lark.wschannelprocess.statistics.C59320c.RunnableC593243 */

            /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: com.ss.android.lark.wschannelprocess.statistics.a<T extends com.ss.android.lark.wschannelprocess.dto.a> */
            /* JADX WARN: Multi-variable type inference failed */
            public void run() {
                try {
                    Log.m165389i("RecorderImpl", C59320c.this.f147288e + " record begin ");
                    C59325a.m230337a().mo201650a(C59320c.this.f147288e, C59320c.this.f147284a.mo201628a((T) t));
                    C59320c.this.mo201642b();
                } catch (Exception e) {
                    Log.m165383e("RecorderImpl", C59320c.this.f147288e + " record occurs wrong: " + e.getMessage());
                }
            }
        });
    }

    /* renamed from: a */
    public List<T> mo201638a(List<DBData> list) {
        ArrayList arrayList = new ArrayList();
        for (DBData dBData : list) {
            Log.m165379d("RecorderImpl", this.f147288e + " get record: key -- " + dBData.getTime() + " value -- " + dBData.getData());
            T a = this.f147284a.mo201627a(dBData.getData());
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    public C59320c(String str, AbstractC59314a<T> aVar, Executor executor) {
        this.f147288e = str;
        this.f147284a = aVar;
        this.f147285b = executor;
        this.f147289f = C59307d.m230286b().mo177788f();
        this.f147286c = new AtomicBoolean(this.f147289f.mo177791a());
        Log.m165389i("RecorderImpl", this.f147288e + " app state is front :" + this.f147286c.get());
        m230329c();
    }
}
