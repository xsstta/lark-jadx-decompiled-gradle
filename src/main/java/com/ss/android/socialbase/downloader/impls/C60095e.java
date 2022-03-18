package com.ss.android.socialbase.downloader.impls;

import com.ss.android.socialbase.downloader.constants.C59997c;
import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.p3025b.C59990a;
import com.ss.android.socialbase.downloader.p3028e.C60075d;
import com.ss.android.socialbase.downloader.p3028e.RunnableC60071c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.ss.android.socialbase.downloader.impls.e */
public class C60095e extends AbstractC60081a {

    /* renamed from: b */
    private static C60075d f149910b;

    @Override // com.ss.android.socialbase.downloader.impls.AbstractC60081a
    /* renamed from: a */
    public List<Integer> mo204896a() {
        return f149910b.mo204868a();
    }

    public C60095e() {
        f149910b = new C60075d();
    }

    /* renamed from: c */
    public static void m233374c(List<Callable<Object>> list) throws InterruptedException {
        ExecutorService p = C60046b.m233006p();
        if (p != null) {
            p.invokeAll(list);
        }
    }

    @Override // com.ss.android.socialbase.downloader.impls.AbstractC60081a
    /* renamed from: b */
    public void mo204911b(int i) {
        C60075d dVar = f149910b;
        if (dVar != null) {
            dVar.mo204874c(i);
        }
    }

    @Override // com.ss.android.socialbase.downloader.impls.AbstractC60081a
    /* renamed from: a */
    public void mo204904a(RunnableC60071c cVar) {
        C60075d dVar = f149910b;
        if (dVar != null) {
            dVar.mo204873b(cVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.socialbase.downloader.impls.AbstractC60081a
    /* renamed from: c */
    public RunnableC60071c mo204916c(int i) {
        C60075d dVar = f149910b;
        if (dVar == null) {
            return null;
        }
        return dVar.mo204872b(i);
    }

    /* renamed from: d */
    public static List<Future> m233375d(List<Runnable> list) {
        ExecutorService p = C60046b.m233006p();
        ArrayList arrayList = new ArrayList(list.size());
        for (Runnable runnable : list) {
            arrayList.add(p.submit(runnable));
        }
        return arrayList;
    }

    /* renamed from: e */
    public static Runnable m233376e(List<Future> list) {
        BlockingQueue<Runnable> queue;
        Runnable runnable;
        if (list != null && !list.isEmpty()) {
            try {
                ExecutorService p = C60046b.m233006p();
                if ((p instanceof ThreadPoolExecutor) && (queue = ((ThreadPoolExecutor) p).getQueue()) != null && !queue.isEmpty()) {
                    Iterator<Future> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            runnable = null;
                            break;
                        }
                        Future next = it.next();
                        if ((next instanceof Runnable) && queue.remove(next)) {
                            runnable = (Runnable) next;
                            break;
                        }
                    }
                    if (runnable != null) {
                        list.remove(runnable);
                        return runnable;
                    }
                }
            } catch (Throwable th) {
                C59990a.m232840d("DefaultDownloadEngine", "getUnstartedTask() error: " + th.toString());
            }
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.impls.AbstractC60081a
    /* renamed from: a */
    public boolean mo204907a(int i) {
        DownloadInfo d;
        C60075d dVar = f149910b;
        if (dVar == null || !dVar.mo204871a(i) || (d = mo204918d(i)) == null) {
            return false;
        }
        if (C59997c.m232857b(d.getStatus())) {
            return true;
        }
        mo204911b(i);
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.impls.AbstractC60081a
    /* renamed from: a */
    public void mo204901a(int i, long j) {
        C60075d dVar = f149910b;
        if (dVar != null) {
            dVar.mo204869a(i, j);
        }
    }

    @Override // com.ss.android.socialbase.downloader.impls.AbstractC60081a
    /* renamed from: a */
    public void mo204903a(int i, DownloadTask downloadTask) {
        if (downloadTask != null) {
            C59990a.m232838b("DownloadTask", "start doDownload for task : " + i);
            f149910b.mo204870a(new RunnableC60071c(downloadTask, this.f149873a));
        }
    }
}
