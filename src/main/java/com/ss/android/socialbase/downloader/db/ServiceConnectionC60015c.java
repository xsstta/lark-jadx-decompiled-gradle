package com.ss.android.socialbase.downloader.db;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl;
import com.ss.android.socialbase.downloader.downloader.AbstractC60068r;
import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.downloader.SqlDownloadCacheService;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.p3025b.C59990a;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.socialbase.downloader.db.c */
public class ServiceConnectionC60015c implements ServiceConnection, AbstractC60068r {

    /* renamed from: b */
    public static boolean f149640b;

    /* renamed from: i */
    private static int f149641i;

    /* renamed from: j */
    private static long f149642j;

    /* renamed from: a */
    public ISqlDownloadCacheAidl f149643a;

    /* renamed from: c */
    public Handler f149644c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public ISqlCacheLoadCompleteCallbackAidl f149645d = null;

    /* renamed from: e */
    public AbstractC60021a f149646e;

    /* renamed from: f */
    public Runnable f149647f = new Runnable() {
        /* class com.ss.android.socialbase.downloader.db.ServiceConnectionC60015c.RunnableC600161 */

        public void run() {
            if (!ServiceConnectionC60015c.f149640b && ServiceConnectionC60015c.this.f149646e != null) {
                ServiceConnectionC60015c.this.f149646e.mo204378a();
            }
        }
    };

    /* renamed from: g */
    public Future<?> f149648g;

    /* renamed from: h */
    public CountDownLatch f149649h = new CountDownLatch(1);

    /* renamed from: com.ss.android.socialbase.downloader.db.c$a */
    public interface AbstractC60021a {
        /* renamed from: a */
        void mo204378a();
    }

    /* renamed from: b */
    public void mo204370b() {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                iSqlDownloadCacheAidl.init();
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void clearData() {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                iSqlDownloadCacheAidl.clearData();
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public boolean ensureDownloadCacheSyncSuccess() {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                return iSqlDownloadCacheAidl.ensureDownloadCacheSyncSuccess();
            }
            return false;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public boolean isDownloadCacheSyncSuccess() {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                return iSqlDownloadCacheAidl.isDownloadCacheSyncSuccess();
            }
            return false;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public ServiceConnectionC60015c() {
        SqlDownloadCacheService.m232921a(C60046b.m232945G(), this);
    }

    /* renamed from: a */
    public boolean mo204369a() {
        if (Build.VERSION.SDK_INT >= 26 || f149640b) {
            return false;
        }
        if (f149641i > 5) {
            C59990a.m232840d("SqlDownloadCacheAidlWra", "bindMainProcess: bind too many times!!! ");
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f149642j < 15000) {
            C59990a.m232840d("SqlDownloadCacheAidlWra", "bindMainProcess: time too short since last bind!!! ");
            return false;
        }
        f149641i++;
        f149642j = currentTimeMillis;
        this.f149644c.postDelayed(new Runnable() {
            /* class com.ss.android.socialbase.downloader.db.ServiceConnectionC60015c.RunnableC600193 */

            public void run() {
                SqlDownloadCacheService.m232921a(C60046b.m232945G(), ServiceConnectionC60015c.this);
            }
        }, 1000);
        return true;
    }

    /* renamed from: a */
    public void mo204368a(AbstractC60021a aVar) {
        this.f149646e = aVar;
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f149643a = null;
        f149640b = false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskIntercept(int i) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                return iSqlDownloadCacheAidl.OnDownloadTaskIntercept(i);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskPrepare(int i) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                return iSqlDownloadCacheAidl.OnDownloadTaskPrepare(i);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskRetry(int i) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                return iSqlDownloadCacheAidl.OnDownloadTaskRetry(i);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void addDownloadChunk(DownloadChunk downloadChunk) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                iSqlDownloadCacheAidl.addDownloadChunk(downloadChunk);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void addSubDownloadChunk(DownloadChunk downloadChunk) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                iSqlDownloadCacheAidl.addSubDownloadChunk(downloadChunk);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public List<DownloadChunk> getDownloadChunk(int i) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                return iSqlDownloadCacheAidl.getDownloadChunk(i);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo getDownloadInfo(int i) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                return iSqlDownloadCacheAidl.getDownloadInfo(i);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public List<DownloadInfo> getDownloadInfoList(String str) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                return iSqlDownloadCacheAidl.getDownloadInfoList(str);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public List<DownloadInfo> getFailedDownloadInfosWithMimeType(String str) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                return iSqlDownloadCacheAidl.getFailedDownloadInfosWithMimeType(str);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                return iSqlDownloadCacheAidl.getSuccessedDownloadInfosWithMimeType(str);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                return iSqlDownloadCacheAidl.getUnCompletedDownloadInfosWithMimeType(str);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo onDownloadTaskStart(int i) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                return iSqlDownloadCacheAidl.onDownloadTaskStart(i);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void removeAllDownloadChunk(int i) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                iSqlDownloadCacheAidl.removeAllDownloadChunk(i);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public boolean removeDownloadInfo(int i) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                return iSqlDownloadCacheAidl.removeDownloadInfo(i);
            }
            return false;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public boolean removeDownloadTaskData(int i) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                return iSqlDownloadCacheAidl.removeDownloadTaskData(i);
            }
            return false;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void syncDownloadInfo(DownloadInfo downloadInfo) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                iSqlDownloadCacheAidl.syncDownloadInfo(downloadInfo);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public boolean updateDownloadInfo(DownloadInfo downloadInfo) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                return iSqlDownloadCacheAidl.updateDownloadInfo(downloadInfo);
            }
            return false;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public void mo204367a(ISqlCacheLoadCompleteCallbackAidl iSqlCacheLoadCompleteCallbackAidl) {
        synchronized (this) {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                try {
                    iSqlDownloadCacheAidl.setInitCallback(iSqlCacheLoadCompleteCallbackAidl);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                this.f149645d = iSqlCacheLoadCompleteCallbackAidl;
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskCompleted(int i, long j) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                return iSqlDownloadCacheAidl.OnDownloadTaskCompleted(i, j);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskError(int i, long j) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                return iSqlDownloadCacheAidl.OnDownloadTaskError(i, j);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskPause(int i, long j) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                return iSqlDownloadCacheAidl.OnDownloadTaskPause(i, j);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskProgress(int i, long j) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                return iSqlDownloadCacheAidl.OnDownloadTaskProgress(i, j);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void syncDownloadChunks(int i, List<DownloadChunk> list) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                iSqlDownloadCacheAidl.syncDownloadChunks(i, list);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void syncDownloadInfoFromOtherCache(int i, List<DownloadChunk> list) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                iSqlDownloadCacheAidl.syncDownloadInfoFromOtherCache(i, list);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo updateChunkCount(int i, int i2) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                return iSqlDownloadCacheAidl.updateChunkCount(i, i2);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        f149640b = true;
        this.f149644c.removeCallbacks(this.f149647f);
        try {
            this.f149643a = ISqlDownloadCacheAidl.Stub.asInterface(iBinder);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f149648g = C60046b.m233001k().submit(new Runnable() {
            /* class com.ss.android.socialbase.downloader.db.ServiceConnectionC60015c.RunnableC600172 */

            /* JADX INFO: finally extract failed */
            public void run() {
                IBinder iBinder;
                C600181 r2;
                synchronized (this) {
                    try {
                        if (!(ServiceConnectionC60015c.this.f149645d == null || ServiceConnectionC60015c.this.f149643a == null)) {
                            ServiceConnectionC60015c.this.f149643a.setInitCallback(ServiceConnectionC60015c.this.f149645d);
                        }
                        ServiceConnectionC60015c.this.f149649h.countDown();
                        try {
                            iBinder = iBinder;
                            r2 = new IBinder.DeathRecipient() {
                                /* class com.ss.android.socialbase.downloader.db.ServiceConnectionC60015c.RunnableC600172.C600181 */

                                public void binderDied() {
                                    ServiceConnectionC60015c.f149640b = false;
                                    if (!ServiceConnectionC60015c.this.mo204369a() && ServiceConnectionC60015c.this.f149646e != null) {
                                        ServiceConnectionC60015c.this.f149644c.postDelayed(ServiceConnectionC60015c.this.f149647f, 2000);
                                    }
                                }
                            };
                            iBinder.linkToDeath(r2, 0);
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable th) {
                        ServiceConnectionC60015c.this.f149649h.countDown();
                        try {
                            iBinder.linkToDeath(new IBinder.DeathRecipient() {
                                /* class com.ss.android.socialbase.downloader.db.ServiceConnectionC60015c.RunnableC600172.C600181 */

                                public void binderDied() {
                                    ServiceConnectionC60015c.f149640b = false;
                                    if (!ServiceConnectionC60015c.this.mo204369a() && ServiceConnectionC60015c.this.f149646e != null) {
                                        ServiceConnectionC60015c.this.f149644c.postDelayed(ServiceConnectionC60015c.this.f149647f, 2000);
                                    }
                                }
                            }, 0);
                        } catch (Throwable unused2) {
                        }
                        throw th;
                    }
                }
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60068r
    public void init(final SparseArray<DownloadInfo> sparseArray, final SparseArray<List<DownloadChunk>> sparseArray2, final AbstractC60014b bVar) {
        C60046b.m233001k().submit(new Runnable() {
            /* class com.ss.android.socialbase.downloader.db.ServiceConnectionC60015c.RunnableC600204 */

            public void run() {
                boolean z;
                AbstractC60014b bVar;
                Future<?> future;
                ServiceConnectionC60015c.this.mo204367a(new SqlDownloadCacheAidlWrapper$4$1(this));
                try {
                    z = !ServiceConnectionC60015c.this.f149649h.await(5000, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    th.printStackTrace();
                    z = false;
                }
                if (z && (future = ServiceConnectionC60015c.this.f149648g) != null) {
                    future.cancel(true);
                }
                ServiceConnectionC60015c.this.mo204370b();
                if (z && (bVar = bVar) != null) {
                    bVar.mo204366a();
                }
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void updateDownloadChunk(int i, int i2, long j) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                iSqlDownloadCacheAidl.updateDownloadChunk(i, i2, j);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void updateSubDownloadChunkIndex(int i, int i2, int i3, int i4) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                iSqlDownloadCacheAidl.updateSubDownloadChunkIndex(i, i2, i3, i4);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskConnected(int i, long j, String str, String str2) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                return iSqlDownloadCacheAidl.OnDownloadTaskConnected(i, j, str, str2);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void updateSubDownloadChunk(int i, int i2, int i3, long j) {
        try {
            ISqlDownloadCacheAidl iSqlDownloadCacheAidl = this.f149643a;
            if (iSqlDownloadCacheAidl != null) {
                iSqlDownloadCacheAidl.updateSubDownloadChunk(i, i2, i3, j);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
