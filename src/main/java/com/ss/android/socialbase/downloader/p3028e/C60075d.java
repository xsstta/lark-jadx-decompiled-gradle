package com.ss.android.socialbase.downloader.p3028e;

import android.util.SparseArray;
import com.ss.android.socialbase.downloader.depend.AbstractC60035m;
import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.p3026c.C59992a;
import com.ss.android.socialbase.downloader.setting.C60148a;
import com.ss.android.socialbase.downloader.utils.C60158a;
import com.ss.android.socialbase.downloader.utils.C60161d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.ss.android.socialbase.downloader.e.d */
public class C60075d {

    /* renamed from: a */
    private volatile SparseArray<RunnableC60071c> f149867a = new SparseArray<>();

    /* renamed from: b */
    private int f149868b;

    /* renamed from: a */
    public List<Integer> mo204868a() {
        ArrayList arrayList;
        synchronized (C60075d.class) {
            m233295b();
            arrayList = new ArrayList();
            for (int i = 0; i < this.f149867a.size(); i++) {
                RunnableC60071c cVar = this.f149867a.get(this.f149867a.keyAt(i));
                if (cVar != null) {
                    arrayList.add(Integer.valueOf(cVar.mo204861e()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private void m233295b() {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f149867a.size(); i++) {
                int keyAt = this.f149867a.keyAt(i);
                if (!this.f149867a.get(keyAt).mo204860d()) {
                    arrayList.add(Integer.valueOf(keyAt));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                try {
                    Integer num = (Integer) arrayList.get(i2);
                    if (num != null) {
                        this.f149867a.remove(num.intValue());
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* renamed from: c */
    public void mo204874c(int i) {
        synchronized (C60075d.class) {
            m233295b();
            RunnableC60071c cVar = this.f149867a.get(i);
            if (cVar != null) {
                cVar.mo204847a();
                m233296c(cVar);
                this.f149867a.remove(i);
            }
        }
    }

    /* renamed from: b */
    public RunnableC60071c mo204872b(int i) {
        synchronized (C60075d.class) {
            m233295b();
            RunnableC60071c cVar = this.f149867a.get(i);
            if (cVar == null) {
                return null;
            }
            cVar.mo204855b();
            m233296c(cVar);
            this.f149867a.remove(i);
            return cVar;
        }
    }

    /* renamed from: c */
    private void m233296c(RunnableC60071c cVar) {
        Future h;
        if (cVar != null) {
            try {
                ExecutorService o = C60046b.m233005o();
                DownloadTask c = cVar.mo204858c();
                if (!(c == null || c.getDownloadInfo() == null)) {
                    int executorGroup = c.getDownloadInfo().getExecutorGroup();
                    if (executorGroup == 3) {
                        o = C60046b.m233003m();
                    } else if (executorGroup == 4) {
                        o = C60046b.m233004n();
                    }
                }
                if (o != null && (o instanceof ThreadPoolExecutor)) {
                    ((ThreadPoolExecutor) o).remove(cVar);
                    if (C60148a.m233720a(cVar.mo204861e()).mo205475b("pause_with_interrupt", false) && (h = cVar.mo204864h()) != null) {
                        h.cancel(true);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public boolean mo204871a(int i) {
        synchronized (C60075d.class) {
            boolean z = false;
            if (this.f149867a != null) {
                if (this.f149867a.size() > 0) {
                    RunnableC60071c cVar = this.f149867a.get(i);
                    if (cVar != null && cVar.mo204860d()) {
                        z = true;
                    }
                    return z;
                }
            }
            return false;
        }
    }

    /* renamed from: b */
    public void mo204873b(RunnableC60071c cVar) {
        if (cVar != null) {
            synchronized (C60075d.class) {
                try {
                    if (C60158a.m233738a(524288)) {
                        int indexOfValue = this.f149867a.indexOfValue(cVar);
                        if (indexOfValue >= 0) {
                            this.f149867a.removeAt(indexOfValue);
                        }
                    } else {
                        this.f149867a.remove(cVar.mo204861e());
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo204870a(RunnableC60071c cVar) {
        int i;
        int i2;
        cVar.mo204862f();
        synchronized (C60075d.class) {
            int i3 = this.f149868b;
            i = 0;
            if (i3 >= 500) {
                m233295b();
                this.f149868b = 0;
            } else {
                this.f149868b = i3 + 1;
            }
            this.f149867a.put(cVar.mo204861e(), cVar);
        }
        DownloadTask c = cVar.mo204858c();
        try {
            ExecutorService o = C60046b.m233005o();
            if (!(c == null || c.getDownloadInfo() == null)) {
                if ("mime_type_plg".equals(c.getDownloadInfo().getMimeType()) && C60148a.m233727c().mo205470a("divide_plugin", 1) == 1) {
                    c.getDownloadInfo().setExecutorGroup(3);
                }
                int executorGroup = c.getDownloadInfo().getExecutorGroup();
                if (executorGroup == 3) {
                    o = C60046b.m233003m();
                } else if (executorGroup == 4) {
                    o = C60046b.m233004n();
                }
            }
            if (o == null) {
                AbstractC60035m monitorDepend = c.getMonitorDepend();
                DownloadInfo downloadInfo = c.getDownloadInfo();
                BaseException baseException = new BaseException(1003, "execute failed cpu thread executor service is null");
                if (c.getDownloadInfo() != null) {
                    i2 = c.getDownloadInfo().getStatus();
                } else {
                    i2 = 0;
                }
                C59992a.m232850a(monitorDepend, downloadInfo, baseException, i2);
            } else if (C60148a.m233720a(cVar.mo204861e()).mo205475b("pause_with_interrupt", false)) {
                cVar.mo204852a(o.submit(cVar));
            } else {
                o.execute(cVar);
            }
        } catch (Exception e) {
            if (c != null) {
                AbstractC60035m monitorDepend2 = c.getMonitorDepend();
                DownloadInfo downloadInfo2 = c.getDownloadInfo();
                BaseException baseException2 = new BaseException(1003, C60161d.m233788b(e, "DownloadThreadPoolExecute"));
                if (c.getDownloadInfo() != null) {
                    i = c.getDownloadInfo().getStatus();
                }
                C59992a.m232850a(monitorDepend2, downloadInfo2, baseException2, i);
            }
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            if (c != null) {
                AbstractC60035m monitorDepend3 = c.getMonitorDepend();
                DownloadInfo downloadInfo3 = c.getDownloadInfo();
                BaseException baseException3 = new BaseException(1003, "execute OOM");
                if (c.getDownloadInfo() != null) {
                    i = c.getDownloadInfo().getStatus();
                }
                C59992a.m232850a(monitorDepend3, downloadInfo3, baseException3, i);
            }
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo204869a(int i, long j) {
        RunnableC60071c cVar = this.f149867a.get(i);
        if (cVar != null) {
            cVar.mo204856b(j);
        }
    }
}
