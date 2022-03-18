package com.bytedance.ee.util.db;

import android.content.Context;
import androidx.p038g.p039a.AbstractC1082b;
import androidx.room.RoomDatabase;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.db.DBController;
import com.bytedance.ee.util.p701d.C13615c;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.util.db.e */
public class C13641e {

    /* renamed from: a */
    private static final Object f35825a = new Object();

    /* renamed from: b */
    private static C13641e f35826b;

    /* renamed from: a */
    public static C13641e m55359a() {
        if (f35826b == null) {
            synchronized (f35825a) {
                if (f35826b == null) {
                    f35826b = new C13641e(C13615c.f35773a);
                }
            }
        }
        return f35826b;
    }

    /* renamed from: b */
    private synchronized KeyValueDatabase m55360b() {
        return (KeyValueDatabase) DBController.m55314a().mo50590b("docs_keyvaule.db");
    }

    private C13641e(Context context) {
        DBController.m55314a().mo50588a("docs_keyvaule.db", new DBController.C13632a(context).mo50597a("docs_keyvaule.db").mo50596a(KeyValueDatabase.class).mo50595a(new RoomDatabase.AbstractC1417b() {
            /* class com.bytedance.ee.util.db.C13641e.C136421 */

            @Override // androidx.room.RoomDatabase.AbstractC1417b
            /* renamed from: a */
            public void mo7559a(AbstractC1082b bVar) {
                super.mo7559a(bVar);
                C13479a.m54772d("KeyValueManager", "onCreate: ");
            }

            @Override // androidx.room.RoomDatabase.AbstractC1417b
            /* renamed from: b */
            public void mo7560b(AbstractC1082b bVar) {
                super.mo7560b(bVar);
                C13479a.m54772d("KeyValueManager", "onOpen: ");
            }
        }));
    }

    /* renamed from: a */
    public long mo50603a(C13645f fVar) {
        try {
            return m55360b().mo16369m().mo50599a(fVar);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return -1;
        }
    }

    /* renamed from: b */
    public AbstractC68307f<Long> mo50605b(C13645f fVar) {
        return AbstractC68307f.m265083a(fVar).mo237985a(C11678b.m48479c()).mo238020d(new Function<C13645f, Long>() {
            /* class com.bytedance.ee.util.db.C13641e.C136443 */

            /* renamed from: a */
            public Long apply(C13645f fVar) throws Exception {
                return Long.valueOf(C13641e.this.mo50603a(fVar));
            }
        });
    }

    /* renamed from: a */
    public C13645f mo50604a(String str) {
        try {
            return m55360b().mo16369m().mo50600a(str);
        } catch (Exception e) {
            C13606d.m55244a(e);
            return null;
        }
    }

    /* renamed from: b */
    public AbstractC68307f<C13645f> mo50606b(String str) {
        return AbstractC68307f.m265083a(str).mo237985a(C11678b.m48479c()).mo238020d(new Function<String, C13645f>() {
            /* class com.bytedance.ee.util.db.C13641e.C136432 */

            /* renamed from: a */
            public C13645f apply(String str) throws Exception {
                return C13641e.this.mo50604a(str);
            }
        });
    }
}
