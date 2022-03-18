package com.huawei.updatesdk.p1046b.p1053e.p1054a;

import android.os.AsyncTask;
import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import com.huawei.updatesdk.p1029a.p1039b.p1044d.AsyncTaskC23864b;
import com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c.AbstractC23865a;
import com.huawei.updatesdk.p1046b.p1050b.C23880c;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.huawei.updatesdk.b.e.a.b */
public class C23888b {

    /* renamed from: a */
    private static List<AsyncTask> f59131a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public static AsyncTaskC23864b m87346a(C23880c cVar, AbstractC23865a aVar) {
        AsyncTaskC23864b bVar = new AsyncTaskC23864b(cVar, aVar);
        m87349a(bVar, cVar);
        return bVar;
    }

    /* renamed from: a */
    public static List<AsyncTask> m87347a() {
        return f59131a;
    }

    /* renamed from: a */
    public static void m87348a(AsyncTask asyncTask) {
        if (asyncTask != null) {
            for (AsyncTask asyncTask2 : f59131a) {
                if (asyncTask2 != null && (asyncTask2.getStatus() == AsyncTask.Status.FINISHED || asyncTask2.isCancelled())) {
                    f59131a.remove(asyncTask);
                }
            }
            f59131a.add(asyncTask);
        }
    }

    /* renamed from: a */
    private static void m87349a(AsyncTaskC23864b bVar, C23880c cVar) {
        C23834a.m87116a("StoreAgent", "executeTask, ActiveCount:" + C23889c.f59132a.getActiveCount() + ", TaskCount:" + C23889c.f59132a.getTaskCount());
        bVar.mo85613a(C23889c.f59132a);
    }
}
