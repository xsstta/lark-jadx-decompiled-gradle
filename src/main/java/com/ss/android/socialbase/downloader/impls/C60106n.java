package com.ss.android.socialbase.downloader.impls;

import android.app.Notification;
import android.os.IBinder;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.constants.ListenerType;
import com.ss.android.socialbase.downloader.depend.AbstractC60031i;
import com.ss.android.socialbase.downloader.depend.AbstractC60036n;
import com.ss.android.socialbase.downloader.depend.AbstractC60040r;
import com.ss.android.socialbase.downloader.depend.AbstractC60042t;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.AbstractC60062l;
import com.ss.android.socialbase.downloader.downloader.AbstractC60063m;
import com.ss.android.socialbase.downloader.downloader.AbstractC60064n;
import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.downloader.C60048c;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.IDownloadAidlService;
import com.ss.android.socialbase.downloader.downloader.IndependentProcessDownloadService;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.p3025b.C59990a;
import com.ss.android.socialbase.downloader.utils.C60161d;
import com.ss.android.socialbase.downloader.utils.C60162e;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.impls.n */
public class C60106n implements AbstractC60062l, AbstractC60063m {

    /* renamed from: a */
    private static final String f149928a = "n";

    /* renamed from: b */
    private volatile IDownloadAidlService f149929b;

    /* renamed from: c */
    private AbstractC60064n<IndependentProcessDownloadService> f149930c;

    /* renamed from: d */
    private AbstractC60062l f149931d = new C60108o();

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: b */
    public void mo204800b(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60063m
    /* renamed from: h */
    public void mo204833h() {
        this.f149929b = null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204788a(int i, boolean z) {
        if (this.f149929b != null) {
            try {
                this.f149929b.cancel(i, z);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204792a(List<String> list) {
        if (this.f149929b == null) {
            this.f149931d.mo204792a(list);
            return;
        }
        try {
            this.f149929b.restartAllFailedDownloadTasks(list);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public boolean mo204794a(DownloadInfo downloadInfo) {
        if (this.f149929b == null) {
            return this.f149931d.mo204794a(downloadInfo);
        }
        try {
            this.f149929b.isDownloadSuccessAndFileNotExist(downloadInfo);
            return false;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204785a(int i, Notification notification) {
        if (this.f149929b == null) {
            C59990a.m232840d(f149928a, "startForeground, aidlService is null");
            return;
        }
        String str = f149928a;
        C59990a.m232839c(str, "aidlService.startForeground, id = " + i);
        try {
            this.f149929b.startForeground(i, notification);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204793a(boolean z, boolean z2) {
        if (this.f149929b == null) {
            C59990a.m232840d(f149928a, "stopForeground, aidlService is null");
            return;
        }
        C59990a.m232839c(f149928a, "aidlService.stopForeground");
        try {
            this.f149929b.stopForeground(z2);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204791a(DownloadTask downloadTask) {
        AbstractC60064n<IndependentProcessDownloadService> nVar;
        if (downloadTask != null && (nVar = this.f149930c) != null) {
            nVar.mo204662b(downloadTask);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204787a(int i, List<DownloadChunk> list) {
        if (this.f149929b != null) {
            try {
                this.f149929b.syncDownloadChunks(i, list);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204790a(DownloadChunk downloadChunk) {
        if (this.f149929b == null) {
            this.f149931d.mo204790a(downloadChunk);
            return;
        }
        try {
            this.f149929b.addDownloadChunk(downloadChunk);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204789a(AbstractC60042t tVar) {
        if (this.f149929b != null) {
            try {
                this.f149929b.addProcessCallback(C60162e.m233840a(tVar));
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204786a(int i, AbstractC60036n nVar) {
        if (this.f149929b != null) {
            try {
                this.f149929b.setDownloadNotificationEventListener(i, C60162e.m233837a(nVar));
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60063m
    /* renamed from: a */
    public void mo204832a(IBinder iBinder) {
        this.f149929b = IDownloadAidlService.Stub.asInterface(iBinder);
        if (C60161d.m233768a()) {
            mo204789a(new AbstractC60042t() {
                /* class com.ss.android.socialbase.downloader.impls.C60106n.C601071 */

                @Override // com.ss.android.socialbase.downloader.depend.AbstractC60042t
                /* renamed from: a */
                public void mo204530a(int i, int i2) {
                    if (i2 == 1) {
                        Downloader.getInstance(C60046b.m232945G()).pause(i);
                        List<DownloadChunk> i3 = C60104l.m233401a(false).mo204821i(i);
                        if (i3 != null) {
                            C60104l.m233401a(true).mo204787a(i, C60161d.m233754a(i3));
                        }
                    } else if (i2 == 2) {
                        Downloader.getInstance(C60046b.m232945G()).cancel(i);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204784a(int i, long j) {
        if (this.f149929b != null) {
            try {
                this.f149929b.setThrottleNetSpeed(i, j);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: c */
    public boolean mo204808c() {
        return C60046b.m232946H();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: d */
    public void mo204811d() {
        AbstractC60064n<IndependentProcessDownloadService> nVar = this.f149930c;
        if (nVar != null) {
            nVar.mo204668f();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: g */
    public boolean mo204818g() {
        if (this.f149929b != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204776a() {
        if (this.f149929b != null) {
            try {
                this.f149929b.pauseAll();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public C60106n() {
        AbstractC60064n<IndependentProcessDownloadService> v = C60046b.m233012v();
        this.f149930c = v;
        v.mo204657a(this);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: f */
    public void mo204817f() {
        if (this.f149929b == null) {
            this.f149931d.mo204817f();
            return;
        }
        try {
            this.f149929b.clearData();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: e */
    public boolean mo204815e() {
        if (this.f149929b == null) {
            return this.f149931d.mo204815e();
        }
        try {
            return this.f149929b.isDownloadCacheSyncSuccess();
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: b */
    public boolean mo204803b() {
        if (this.f149929b == null) {
            C59990a.m232840d(f149928a, "isServiceForeground, aidlService is null");
            return false;
        }
        C59990a.m232839c(f149928a, "aidlService.isServiceForeground");
        try {
            return this.f149929b.isServiceForeground();
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: k */
    public void mo204823k(int i) {
        AbstractC60064n<IndependentProcessDownloadService> nVar = this.f149930c;
        if (nVar != null) {
            nVar.mo204653a(i);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: c */
    public void mo204806c(int i) {
        if (this.f149929b != null) {
            try {
                this.f149929b.resume(i);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: d */
    public void mo204812d(int i) {
        if (this.f149929b != null) {
            try {
                this.f149929b.restart(i);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public List<DownloadInfo> mo204775a(String str) {
        if (this.f149929b == null) {
            return this.f149931d.mo204775a(str);
        }
        try {
            return this.f149929b.getDownloadInfoList(str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: b */
    public List<DownloadInfo> mo204796b(String str) {
        if (this.f149929b == null) {
            return this.f149931d.mo204796b(str);
        }
        try {
            return this.f149929b.getFailedDownloadInfosWithMimeType(str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: c */
    public List<DownloadInfo> mo204805c(String str) {
        if (this.f149929b == null) {
            return this.f149931d.mo204805c(str);
        }
        try {
            return this.f149929b.getSuccessedDownloadInfosWithMimeType(str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: d */
    public List<DownloadInfo> mo204810d(String str) {
        if (this.f149929b == null) {
            return this.f149931d.mo204810d(str);
        }
        try {
            return this.f149929b.getUnCompletedDownloadInfosWithMimeType(str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: e */
    public long mo204813e(int i) {
        if (this.f149929b == null) {
            return 0;
        }
        try {
            return this.f149929b.getCurBytes(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: f */
    public int mo204816f(int i) {
        if (this.f149929b == null) {
            return 0;
        }
        try {
            return this.f149929b.getStatus(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: g */
    public boolean mo204819g(int i) {
        if (this.f149929b == null) {
            return false;
        }
        try {
            return this.f149929b.isDownloading(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: h */
    public DownloadInfo mo204820h(int i) {
        if (this.f149929b == null) {
            return this.f149931d.mo204820h(i);
        }
        try {
            return this.f149929b.getDownloadInfo(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: i */
    public List<DownloadChunk> mo204821i(int i) {
        if (this.f149929b == null) {
            return this.f149931d.mo204821i(i);
        }
        try {
            return this.f149929b.getDownloadChunk(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: j */
    public void mo204822j(int i) {
        if (this.f149929b == null) {
            this.f149931d.mo204822j(i);
            return;
        }
        try {
            this.f149929b.forceDownloadIngoreRecommendSize(i);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: l */
    public boolean mo204824l(int i) {
        if (this.f149929b == null) {
            return false;
        }
        try {
            return this.f149929b.retryDelayStart(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: m */
    public int mo204825m(int i) {
        if (this.f149929b == null) {
            return C60048c.m233017a().mo204684b(i);
        }
        try {
            return this.f149929b.getDownloadWithIndependentProcessStatus(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: n */
    public boolean mo204826n(int i) {
        if (this.f149929b == null) {
            return this.f149931d.mo204826n(i);
        }
        try {
            return this.f149929b.removeDownloadInfo(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: o */
    public void mo204827o(int i) {
        if (this.f149929b == null) {
            this.f149931d.mo204827o(i);
            return;
        }
        try {
            this.f149929b.removeAllDownloadChunk(i);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: p */
    public boolean mo204828p(int i) {
        if (this.f149929b == null) {
            return this.f149931d.mo204828p(i);
        }
        try {
            return this.f149929b.removeDownloadTaskData(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: q */
    public AbstractC60036n mo204829q(int i) {
        if (this.f149929b == null) {
            return null;
        }
        try {
            return C60162e.m233850a(this.f149929b.getDownloadNotificationEventListener(i));
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: r */
    public AbstractC60040r mo204830r(int i) {
        if (this.f149929b == null) {
            return null;
        }
        try {
            return C60162e.m233851a(this.f149929b.getNotificationClickCallback(i));
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: s */
    public AbstractC60031i mo204831s(int i) {
        if (this.f149929b == null) {
            return null;
        }
        try {
            return C60162e.m233845a(this.f149929b.getDownloadFileUriProvider(i));
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204777a(int i) {
        if (this.f149929b != null) {
            try {
                this.f149929b.pause(i);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: e */
    public List<DownloadInfo> mo204814e(String str) {
        if (this.f149929b == null) {
            return null;
        }
        try {
            return this.f149929b.getDownloadingDownloadInfosWithMimeType(str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: c */
    public boolean mo204809c(DownloadInfo downloadInfo) {
        if (this.f149929b == null) {
            return this.f149931d.mo204809c(downloadInfo);
        }
        try {
            return this.f149929b.updateDownloadInfo(downloadInfo);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: b */
    public void mo204801b(DownloadTask downloadTask) {
        AbstractC60064n<IndependentProcessDownloadService> nVar;
        if (downloadTask != null && (nVar = this.f149930c) != null) {
            nVar.mo204665c(downloadTask);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: b */
    public void mo204802b(List<String> list) {
        if (this.f149929b == null) {
            this.f149931d.mo204802b(list);
            return;
        }
        try {
            this.f149929b.restartAllPauseReserveOnWifiDownloadTasks(list);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: b */
    public boolean mo204804b(int i) {
        if (this.f149929b == null) {
            return false;
        }
        try {
            return this.f149929b.canResume(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public int mo204774a(String str, String str2) {
        return C60046b.m232951a(str, str2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: b */
    public DownloadInfo mo204795b(String str, String str2) {
        return mo204820h(mo204774a(str, str2));
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: c */
    public void mo204807c(int i, boolean z) {
        if (this.f149929b != null) {
            try {
                this.f149929b.setDownloadWithIndependentProcessStatus(i, z);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204778a(int i, int i2) {
        if (this.f149929b != null) {
            try {
                this.f149929b.dispatchProcessCallback(i, i2);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: b */
    public void mo204798b(int i, List<DownloadChunk> list) {
        if (this.f149929b == null) {
            this.f149931d.mo204798b(i, list);
            return;
        }
        try {
            this.f149929b.syncDownloadInfoFromOtherCache(i, list);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: b */
    public void mo204799b(int i, boolean z) {
        if (this.f149929b == null) {
            this.f149931d.mo204799b(i, z);
            return;
        }
        try {
            this.f149929b.clearDownloadData(i, z);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204781a(int i, int i2, long j) {
        if (this.f149929b == null) {
            this.f149931d.mo204781a(i, i2, j);
            return;
        }
        try {
            this.f149929b.updateDownloadChunk(i, i2, j);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204779a(int i, int i2, int i3, int i4) {
        if (this.f149929b == null) {
            this.f149931d.mo204779a(i, i2, i3, i4);
            return;
        }
        try {
            this.f149929b.updateSubDownloadChunkIndex(i, i2, i3, i4);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204780a(int i, int i2, int i3, long j) {
        if (this.f149929b == null) {
            this.f149931d.mo204780a(i, i2, i3, j);
            return;
        }
        try {
            this.f149929b.updateSubDownloadChunk(i, i2, i3, j);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: b */
    public void mo204797b(int i, int i2, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z) {
        boolean z2;
        if (this.f149929b != null) {
            try {
                IDownloadAidlService iDownloadAidlService = this.f149929b;
                if (listenerType == ListenerType.SUB) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                iDownloadAidlService.removeDownloadListener(i, i2, C60162e.m233829a(iDownloadListener, z2), listenerType.ordinal(), z);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204782a(int i, int i2, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z) {
        boolean z2;
        if (this.f149929b != null) {
            try {
                IDownloadAidlService iDownloadAidlService = this.f149929b;
                if (listenerType == ListenerType.SUB) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                iDownloadAidlService.addDownloadListener(i, i2, C60162e.m233829a(iDownloadListener, z2), listenerType.ordinal(), z);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204783a(int i, int i2, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z, boolean z2) {
        boolean z3;
        if (this.f149929b != null) {
            try {
                IDownloadAidlService iDownloadAidlService = this.f149929b;
                if (listenerType == ListenerType.SUB) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                iDownloadAidlService.addDownloadListener1(i, i2, C60162e.m233829a(iDownloadListener, z3), listenerType.ordinal(), z, z2);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }
}
