package com.ss.android.lark.audit.db;

import android.content.Context;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.audit.AbstractC29324f;
import com.ss.android.lark.audit.C29304b;
import com.ss.android.lark.audit.db.AbstractC29316c;
import com.ss.android.lark.audit.http.AbstractC29334c;
import com.ss.android.lark.audit.http.C29333b;
import com.ss.android.lark.audit.p1377a.C29288e;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.audit.db.f */
public class C29319f<T extends AbstractC29316c> {

    /* renamed from: a */
    public AbstractC29317d<T> f73363a;

    /* renamed from: b */
    public AbstractC29318e<T> f73364b;

    /* renamed from: c */
    public String f73365c;

    /* renamed from: d */
    public final AbstractC29324f.AbstractC29325a f73366d;

    /* renamed from: e */
    private Executor f73367e;

    /* renamed from: f */
    private Callable<Boolean> f73368f = new Callable<Boolean>() {
        /* class com.ss.android.lark.audit.db.C29319f.CallableC293201 */

        /* renamed from: a */
        public Boolean call() throws Exception {
            if (C29319f.this.f73366d == null) {
                Log.m165383e("RecorderImpl", "audit record failed for null DataHandler");
                return true;
            }
            try {
                final List<AuditDBData> queryAuditData = C29319f.this.f73366d.queryAuditData(C29319f.this.f73365c, 50);
                if (queryAuditData != null) {
                    if (!queryAuditData.isEmpty()) {
                        if (C29319f.this.f73364b == null) {
                            return false;
                        }
                        C29319f.this.f73364b.mo103878a(C29319f.this.mo103895a(queryAuditData), new AbstractC29334c<Boolean>() {
                            /* class com.ss.android.lark.audit.db.C29319f.CallableC293201.C293211 */

                            @Override // com.ss.android.lark.audit.http.AbstractC29334c
                            /* renamed from: a */
                            public void mo103880a(C29333b bVar) {
                                Log.m165383e("RecorderImpl", "processRecords records fail " + bVar.toString());
                                C29288e.m107657a().mo103811a(String.valueOf(bVar.f73376a), bVar.f73377b);
                            }

                            /* renamed from: a */
                            public void mo103881a(Boolean bool) {
                                Log.m165389i("RecorderImpl", "processRecords onResponse " + bool);
                                if (bool.booleanValue()) {
                                    Log.m165389i("RecorderImpl", C29319f.this.f73365c + " consume delete records: " + queryAuditData.size());
                                    C29319f.this.f73366d.deleteAuditData(C29319f.this.f73365c, queryAuditData);
                                    C29288e.m107657a().mo103815b();
                                    return;
                                }
                                Log.m165383e("RecorderImpl", "processRecords records fail");
                                C29288e.m107657a().mo103811a("inner_network_error", (String) null);
                            }
                        });
                        return true;
                    }
                }
                Log.m165389i("RecorderImpl", C29319f.this.f73365c + " records size is 0");
                C29288e.m107657a().mo103811a("inner_data_error", (String) null);
                return true;
            } catch (Exception e) {
                Log.m165383e("RecorderImpl", C29319f.this.f73365c + " consume records fail :" + e.getMessage());
                C29288e.m107657a().mo103811a("inner_exception", e.getMessage());
                return true;
            }
        }
    };

    /* renamed from: a */
    public void mo103896a() {
        m107755b();
    }

    /* renamed from: b */
    private void m107755b() {
        boolean z = false;
        while (!z) {
            try {
                z = ((Boolean) CoreThreadPool.getDefault().getScheduleThreadPool().schedule(this.f73368f, 500, TimeUnit.MILLISECONDS).get()).booleanValue();
            } catch (Exception e) {
                Log.m165383e("RecorderImpl", this.f73365c + " query occurs wrong: " + e.getMessage());
                C29288e.m107657a().mo103811a("inner_exception", e.getMessage());
            }
        }
        Log.m165389i("RecorderImpl", this.f73365c + " record upload complete");
    }

    /* renamed from: a */
    public void mo103898a(AbstractC29318e<T> eVar) {
        this.f73364b = eVar;
    }

    /* renamed from: a */
    public void mo103897a(final T t) {
        this.f73367e.execute(new Runnable() {
            /* class com.ss.android.lark.audit.db.C29319f.RunnableC293222 */

            /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: com.ss.android.lark.audit.db.d<T extends com.ss.android.lark.audit.db.c> */
            /* JADX WARN: Multi-variable type inference failed */
            public void run() {
                if (C29319f.this.f73366d == null) {
                    Log.m165383e("RecorderImpl", "audit record failed for null DataHandler");
                    return;
                }
                try {
                    Log.m165389i("RecorderImpl", C29319f.this.f73365c + " record begin ");
                    String a = C29319f.this.f73363a.mo103875a(t);
                    List<AuditDBData> queryAuditData = C29319f.this.f73366d.queryAuditData(C29319f.this.f73365c, ParticipantRepo.f117150c);
                    if (queryAuditData != null && queryAuditData.size() == 500) {
                        Log.m165389i("RecorderImpl", "db data more than MAX_LIMIT clear data");
                        C29319f.this.f73366d.deleteAuditData(C29319f.this.f73365c, queryAuditData);
                    }
                    C29319f.this.f73366d.recordAuditData(C29319f.this.f73365c, a);
                    C29319f.this.mo103896a();
                } catch (Exception e) {
                    Log.m165383e("RecorderImpl", C29319f.this.f73365c + " record occurs wrong: " + e.getMessage());
                    C29288e.m107657a().mo103811a("inner_db_error", (String) null);
                }
            }
        });
    }

    /* renamed from: a */
    public List<T> mo103895a(List<AuditDBData> list) {
        ArrayList arrayList = new ArrayList();
        for (AuditDBData auditDBData : list) {
            T b = this.f73363a.mo103876b(auditDBData.mo103882a());
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    public C29319f(String str, AbstractC29317d<T> dVar, Executor executor, AbstractC29324f fVar) {
        AbstractC29324f.AbstractC29325a aVar;
        this.f73365c = str;
        this.f73363a = dVar;
        this.f73367e = executor;
        Context c = C29304b.m107713a().mo103857c();
        if (C26252ad.m94993b(c)) {
            aVar = C29313b.m107749a();
        } else {
            aVar = fVar.mo103868b(c);
        }
        this.f73366d = aVar;
    }
}
