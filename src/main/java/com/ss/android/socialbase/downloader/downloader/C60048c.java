package com.ss.android.socialbase.downloader.downloader;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.constants.ListenerType;
import com.ss.android.socialbase.downloader.depend.AbstractC60025c;
import com.ss.android.socialbase.downloader.depend.AbstractC60031i;
import com.ss.android.socialbase.downloader.depend.AbstractC60036n;
import com.ss.android.socialbase.downloader.depend.AbstractC60039q;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.impls.C60104l;
import com.ss.android.socialbase.downloader.impls.DownloadHandleService;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.p3026c.C59992a;
import com.ss.android.socialbase.downloader.utils.C60158a;
import com.ss.android.socialbase.downloader.utils.C60161d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.downloader.c */
public class C60048c {

    /* renamed from: a */
    private static volatile C60048c f149730a;

    /* renamed from: b */
    private volatile SparseArray<Boolean> f149731b = new SparseArray<>();

    /* renamed from: c */
    private Handler f149732c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private volatile List<AbstractC60039q> f149733d = new ArrayList();

    /* renamed from: a */
    public void mo204680a(AbstractC60039q qVar) {
        if (qVar != null) {
            if (C60161d.m233802c()) {
                qVar.mo204524a();
                return;
            }
            if (C60104l.m233401a(true).mo204818g()) {
                qVar.mo204524a();
            }
            synchronized (this.f149733d) {
                if (!this.f149733d.contains(qVar)) {
                    this.f149733d.add(qVar);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo204682a(List<String> list) {
        AbstractC60062l a = C60104l.m233401a(false);
        if (a != null) {
            a.mo204792a(list);
        }
        AbstractC60062l a2 = C60104l.m233401a(true);
        if (a2 != null) {
            a2.mo204792a(list);
        }
    }

    /* renamed from: b */
    public void mo204692b(List<String> list) {
        AbstractC60062l a = C60104l.m233401a(false);
        if (a != null) {
            a.mo204802b(list);
        }
        AbstractC60062l a2 = C60104l.m233401a(true);
        if (a2 != null) {
            a2.mo204802b(list);
        }
    }

    /* renamed from: a */
    public boolean mo204683a(DownloadInfo downloadInfo) {
        AbstractC60062l c;
        if (downloadInfo == null || (c = mo204693c(downloadInfo.getId())) == null) {
            return false;
        }
        return c.mo204794a(downloadInfo);
    }

    /* renamed from: a */
    public void mo204681a(final DownloadTask downloadTask) {
        final AbstractC60062l b = m233019b(downloadTask);
        if (b == null) {
            if (downloadTask != null) {
                C59992a.m232850a(downloadTask.getMonitorDepend(), downloadTask.getDownloadInfo(), new BaseException(1003, "tryDownload but getDownloadHandler failed"), downloadTask.getDownloadInfo() != null ? downloadTask.getDownloadInfo().getStatus() : 0);
            }
        } else if (downloadTask.isNeedDelayForCacheSync()) {
            this.f149732c.postDelayed(new Runnable() {
                /* class com.ss.android.socialbase.downloader.downloader.C60048c.RunnableC600491 */

                public void run() {
                    b.mo204791a(downloadTask);
                }
            }, 500);
        } else {
            b.mo204791a(downloadTask);
        }
    }

    /* renamed from: d */
    public boolean mo204700d() {
        return C60046b.m232946H();
    }

    /* renamed from: e */
    public boolean mo204702e() {
        AbstractC60062l a = C60104l.m233401a(false);
        if (a != null) {
            return a.mo204815e();
        }
        return false;
    }

    /* renamed from: a */
    public static C60048c m233017a() {
        if (f149730a == null) {
            synchronized (C60048c.class) {
                f149730a = new C60048c();
            }
        }
        return f149730a;
    }

    /* renamed from: c */
    public void mo204695c() {
        AbstractC60062l a = C60104l.m233401a(false);
        if (a != null) {
            a.mo204776a();
        }
        AbstractC60062l a2 = C60104l.m233401a(true);
        if (a2 != null) {
            a2.mo204776a();
        }
    }

    /* renamed from: b */
    public void mo204687b() {
        synchronized (this.f149733d) {
            for (AbstractC60039q qVar : this.f149733d) {
                if (qVar != null) {
                    qVar.mo204524a();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo204679a(AbstractC60025c cVar) {
        C60046b.m232961a(cVar);
    }

    /* renamed from: b */
    public void mo204690b(AbstractC60025c cVar) {
        C60046b.m232984b(cVar);
    }

    /* renamed from: d */
    public void mo204698d(int i) {
        AbstractC60062l c = mo204693c(i);
        if (c != null) {
            c.mo204777a(i);
        }
    }

    /* renamed from: f */
    public void mo204704f(int i) {
        AbstractC60062l c = mo204693c(i);
        if (c != null) {
            c.mo204806c(i);
        }
    }

    /* renamed from: g */
    public void mo204705g(int i) {
        AbstractC60062l c = mo204693c(i);
        if (c != null) {
            c.mo204812d(i);
        }
    }

    /* renamed from: h */
    public long mo204706h(int i) {
        AbstractC60062l c = mo204693c(i);
        if (c == null) {
            return 0;
        }
        return c.mo204813e(i);
    }

    /* renamed from: i */
    public int mo204707i(int i) {
        AbstractC60062l c = mo204693c(i);
        if (c == null) {
            return 0;
        }
        return c.mo204816f(i);
    }

    /* renamed from: j */
    public boolean mo204708j(int i) {
        AbstractC60062l c = mo204693c(i);
        if (c == null) {
            return false;
        }
        return c.mo204819g(i);
    }

    /* renamed from: k */
    public DownloadInfo mo204709k(int i) {
        AbstractC60062l c = mo204693c(i);
        if (c == null) {
            return null;
        }
        return c.mo204820h(i);
    }

    /* renamed from: l */
    public AbstractC60036n mo204710l(int i) {
        AbstractC60062l c = mo204693c(i);
        if (c == null) {
            return null;
        }
        return c.mo204829q(i);
    }

    /* renamed from: m */
    public void mo204711m(int i) {
        AbstractC60062l c = mo204693c(i);
        if (c != null) {
            c.mo204822j(i);
        }
    }

    /* renamed from: n */
    public boolean mo204712n(int i) {
        AbstractC60062l c = mo204693c(i);
        if (c == null) {
            return false;
        }
        return c.mo204824l(i);
    }

    /* renamed from: q */
    public AbstractC60031i mo204715q(int i) {
        AbstractC60062l c = mo204693c(i);
        if (c == null) {
            return null;
        }
        return c.mo204831s(i);
    }

    /* renamed from: b */
    public synchronized int mo204684b(int i) {
        if (this.f149731b.get(i) == null) {
            return -1;
        }
        return this.f149731b.get(i).booleanValue() ? 1 : 0;
    }

    /* renamed from: c */
    public AbstractC60062l mo204693c(int i) {
        boolean z = true;
        if (mo204671a(i) != 1 || C60161d.m233802c()) {
            z = false;
        }
        return C60104l.m233401a(z);
    }

    /* renamed from: e */
    public boolean mo204703e(int i) {
        AbstractC60062l c = mo204693c(i);
        if (c == null) {
            return false;
        }
        return c.mo204804b(i);
    }

    /* renamed from: o */
    public void mo204713o(int i) {
        AbstractC60062l a = C60104l.m233401a(false);
        if (a != null) {
            a.mo204823k(i);
        }
        AbstractC60062l a2 = C60104l.m233401a(true);
        if (a2 != null) {
            a2.mo204823k(i);
        }
    }

    /* renamed from: p */
    public void mo204714p(int i) {
        if (i != 0) {
            Boolean bool = Boolean.TRUE;
            mo204689b(i, true);
            AbstractC60062l a = C60104l.m233401a(true);
            if (a != null) {
                a.mo204811d();
            }
        }
    }

    /* renamed from: a */
    public int mo204671a(int i) {
        if (C60161d.m233802c() || !C60104l.m233401a(true).mo204818g()) {
            return mo204684b(i);
        }
        return C60104l.m233401a(true).mo204825m(i);
    }

    /* renamed from: c */
    public List<DownloadInfo> mo204694c(String str) {
        List<DownloadInfo> list;
        SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        AbstractC60062l a = C60104l.m233401a(false);
        List<DownloadInfo> list2 = null;
        if (a != null) {
            list = a.mo204805c(str);
        } else {
            list = null;
        }
        AbstractC60062l a2 = C60104l.m233401a(true);
        if (a2 != null) {
            list2 = a2.mo204805c(str);
        }
        return m233018a(list, list2, sparseArray);
    }

    /* renamed from: d */
    public List<DownloadInfo> mo204697d(String str) {
        List<DownloadInfo> list;
        SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        AbstractC60062l a = C60104l.m233401a(false);
        List<DownloadInfo> list2 = null;
        if (a != null) {
            list = a.mo204810d(str);
        } else {
            list = null;
        }
        AbstractC60062l a2 = C60104l.m233401a(true);
        if (a2 != null) {
            list2 = a2.mo204810d(str);
        }
        return m233018a(list, list2, sparseArray);
    }

    /* renamed from: e */
    public List<DownloadInfo> mo204701e(String str) {
        List<DownloadInfo> list;
        SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        AbstractC60062l a = C60104l.m233401a(false);
        List<DownloadInfo> list2 = null;
        if (a != null) {
            list = a.mo204814e(str);
        } else {
            list = null;
        }
        AbstractC60062l a2 = C60104l.m233401a(true);
        if (a2 != null) {
            list2 = a2.mo204814e(str);
        }
        return m233018a(list, list2, sparseArray);
    }

    /* renamed from: b */
    public List<DownloadInfo> mo204686b(String str) {
        List<DownloadInfo> list;
        SparseArray<DownloadInfo> sparseArray = new SparseArray<>();
        AbstractC60062l a = C60104l.m233401a(false);
        List<DownloadInfo> list2 = null;
        if (a != null) {
            list = a.mo204796b(str);
        } else {
            list = null;
        }
        AbstractC60062l a2 = C60104l.m233401a(true);
        if (a2 != null) {
            list2 = a2.mo204796b(str);
        }
        return m233018a(list, list2, sparseArray);
    }

    /* renamed from: b */
    private AbstractC60062l m233019b(DownloadTask downloadTask) {
        DownloadInfo downloadInfo;
        boolean z;
        List<DownloadChunk> i;
        if (downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null) {
            return null;
        }
        boolean isNeedIndependentProcess = downloadInfo.isNeedIndependentProcess();
        boolean z2 = true;
        if (C60161d.m233802c() || !C60161d.m233768a()) {
            isNeedIndependentProcess = true;
        }
        int a = mo204671a(downloadInfo.getId());
        if (a >= 0 && a != isNeedIndependentProcess) {
            if (a == 1) {
                try {
                    if (C60161d.m233768a()) {
                        C60104l.m233401a(true).mo204777a(downloadInfo.getId());
                        DownloadInfo h = C60104l.m233401a(true).mo204820h(downloadInfo.getId());
                        if (h != null) {
                            C60104l.m233401a(false).mo204800b(h);
                        }
                        if (h.getChunkCount() > 1 && (i = C60104l.m233401a(true).mo204821i(downloadInfo.getId())) != null) {
                            C60104l.m233401a(false).mo204787a(downloadInfo.getId(), C60161d.m233754a(i));
                        }
                    }
                } catch (Throwable unused) {
                }
            } else if (C60161d.m233768a()) {
                C60104l.m233401a(false).mo204777a(downloadInfo.getId());
                List<DownloadChunk> i2 = C60104l.m233401a(false).mo204821i(downloadInfo.getId());
                if (i2 != null) {
                    C60104l.m233401a(true).mo204787a(downloadInfo.getId(), C60161d.m233754a(i2));
                }
            } else {
                downloadTask.setNeedDelayForCacheSync(true);
                C60104l.m233401a(true).mo204778a(1, downloadInfo.getId());
            }
        }
        int id = downloadInfo.getId();
        if (isNeedIndependentProcess) {
            z = true;
        } else {
            z = false;
        }
        mo204678a(id, z);
        if (!isNeedIndependentProcess) {
            z2 = false;
        }
        return C60104l.m233401a(z2);
    }

    /* renamed from: a */
    public List<DownloadInfo> mo204673a(String str) {
        List<DownloadInfo> a = C60104l.m233401a(false).mo204775a(str);
        List<DownloadInfo> a2 = C60104l.m233401a(true).mo204775a(str);
        if (a == null && a2 == null) {
            return null;
        }
        if (a == null || a2 == null) {
            return a != null ? a : a2;
        }
        ArrayList arrayList = new ArrayList(a);
        arrayList.addAll(a2);
        return arrayList;
    }

    /* renamed from: b */
    public void mo204691b(AbstractC60039q qVar) {
        if (qVar != null) {
            synchronized (this.f149733d) {
                if (this.f149733d.contains(qVar)) {
                    this.f149733d.remove(qVar);
                }
            }
        }
    }

    /* renamed from: a */
    public int mo204672a(String str, String str2) {
        return C60046b.m232951a(str, str2);
    }

    /* renamed from: a */
    public void mo204674a(int i, long j) {
        AbstractC60062l c = mo204693c(i);
        if (c != null) {
            c.mo204784a(i, j);
        }
    }

    /* renamed from: d */
    public void mo204699d(int i, boolean z) {
        AbstractC60062l c = mo204693c(i);
        if (c != null) {
            c.mo204799b(i, z);
        }
    }

    /* renamed from: b */
    public DownloadInfo mo204685b(String str, String str2) {
        int a = mo204672a(str, str2);
        AbstractC60062l c = mo204693c(a);
        if (c == null) {
            return null;
        }
        return c.mo204820h(a);
    }

    /* renamed from: c */
    public void mo204696c(int i, boolean z) {
        if (!C60161d.m233768a()) {
            AbstractC60062l c = mo204693c(i);
            if (c != null) {
                c.mo204788a(i, z);
            }
            C60104l.m233401a(true).mo204778a(2, i);
        } else if (C60158a.m233738a(8388608)) {
            AbstractC60062l a = C60104l.m233401a(true);
            if (a != null) {
                a.mo204788a(i, z);
            }
            AbstractC60062l a2 = C60104l.m233401a(false);
            if (a2 != null) {
                a2.mo204788a(i, z);
            }
        } else {
            AbstractC60062l a3 = C60104l.m233401a(false);
            if (a3 != null) {
                a3.mo204788a(i, z);
            }
            AbstractC60062l a4 = C60104l.m233401a(true);
            if (a4 != null) {
                a4.mo204788a(i, z);
            }
        }
    }

    /* renamed from: a */
    public void mo204677a(int i, AbstractC60036n nVar) {
        AbstractC60062l c = mo204693c(i);
        if (c != null) {
            c.mo204786a(i, nVar);
        }
    }

    /* renamed from: b */
    public synchronized void mo204689b(int i, boolean z) {
        Boolean bool;
        SparseArray<Boolean> sparseArray = this.f149731b;
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        sparseArray.put(i, bool);
    }

    /* renamed from: a */
    public void mo204678a(int i, boolean z) {
        mo204689b(i, z);
        if (!C60161d.m233802c() && C60104l.m233401a(true).mo204818g()) {
            C60104l.m233401a(true).mo204807c(i, z);
        }
        if (!C60046b.m232988c() && !C60161d.m233802c() && !C60161d.m233768a()) {
            try {
                Intent intent = new Intent(C60046b.m232945G(), DownloadHandleService.class);
                intent.setAction("com.ss.android.downloader.action.PROCESS_NOTIFY");
                intent.putExtra("extra_download_id", i);
                C60046b.m232945G().startService(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private List<DownloadInfo> m233018a(List<DownloadInfo> list, List<DownloadInfo> list2, SparseArray<DownloadInfo> sparseArray) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (DownloadInfo downloadInfo : list) {
                if (downloadInfo != null && sparseArray.get(downloadInfo.getId()) == null) {
                    sparseArray.put(downloadInfo.getId(), downloadInfo);
                }
            }
        }
        if (list2 != null) {
            for (DownloadInfo downloadInfo2 : list2) {
                if (downloadInfo2 != null && sparseArray.get(downloadInfo2.getId()) == null) {
                    sparseArray.put(downloadInfo2.getId(), downloadInfo2);
                }
            }
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add(sparseArray.get(sparseArray.keyAt(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo204675a(int i, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z) {
        int i2;
        AbstractC60062l c = mo204693c(i);
        if (c != null) {
            if (iDownloadListener == null) {
                i2 = 0;
            } else {
                i2 = iDownloadListener.hashCode();
            }
            c.mo204797b(i, i2, iDownloadListener, listenerType, z);
        }
    }

    /* renamed from: b */
    public void mo204688b(int i, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z) {
        AbstractC60062l c = mo204693c(i);
        if (c != null) {
            c.mo204782a(i, iDownloadListener.hashCode(), iDownloadListener, listenerType, z);
        }
    }

    /* renamed from: a */
    public void mo204676a(int i, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z, boolean z2) {
        AbstractC60062l c = mo204693c(i);
        if (c != null) {
            c.mo204783a(i, iDownloadListener.hashCode(), iDownloadListener, listenerType, z, z2);
        }
    }
}
