package com.ss.android.socialbase.downloader.impls;

import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.constants.DownloadCacheSyncStatus;
import com.ss.android.socialbase.downloader.db.AbstractC60014b;
import com.ss.android.socialbase.downloader.db.ServiceConnectionC60015c;
import com.ss.android.socialbase.downloader.db.SqlDownloadCache;
import com.ss.android.socialbase.downloader.downloader.AbstractC60059i;
import com.ss.android.socialbase.downloader.downloader.AbstractC60061k;
import com.ss.android.socialbase.downloader.downloader.AbstractC60062l;
import com.ss.android.socialbase.downloader.downloader.AbstractC60068r;
import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.p3025b.C59990a;
import com.ss.android.socialbase.downloader.p3026c.C59992a;
import com.ss.android.socialbase.downloader.p3028e.HandlerC60077f;
import com.ss.android.socialbase.downloader.setting.C60148a;
import com.ss.android.socialbase.downloader.utils.C60161d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.impls.d */
public class C60090d implements AbstractC60059i {

    /* renamed from: a */
    public AbstractC60068r f149900a;

    /* renamed from: b */
    private final C60103k f149901b = new C60103k();

    /* renamed from: c */
    private volatile boolean f149902c;

    /* renamed from: d */
    private volatile boolean f149903d;

    /* renamed from: e */
    private HandlerC60077f.AbstractC60078a f149904e = new HandlerC60077f.AbstractC60078a() {
        /* class com.ss.android.socialbase.downloader.impls.C60090d.C600911 */

        @Override // com.ss.android.socialbase.downloader.p3028e.HandlerC60077f.AbstractC60078a
        /* renamed from: a */
        public void mo204876a(Message message) {
            if (message.what == 1) {
                C60046b.m233001k().execute(new Runnable() {
                    /* class com.ss.android.socialbase.downloader.impls.C60090d.C600911.RunnableC600921 */

                    public void run() {
                        try {
                            C60090d.this.mo204942f();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        }
    };

    /* renamed from: f */
    private HandlerC60077f f149905f = null;

    /* renamed from: a */
    public C60103k mo204937a() {
        return this.f149901b;
    }

    /* renamed from: b */
    public AbstractC60068r mo204938b() {
        return this.f149900a;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public boolean isDownloadCacheSyncSuccess() {
        return this.f149902c;
    }

    /* renamed from: d */
    public void mo204940d() {
        synchronized (this) {
            this.f149902c = true;
            notifyAll();
        }
    }

    /* renamed from: c */
    public void mo204939c() {
        C60046b.m232960a(DownloadCacheSyncStatus.SYNC_START);
        this.f149900a.init(this.f149901b.mo204951a(), this.f149901b.mo204952b(), new AbstractC60014b() {
            /* class com.ss.android.socialbase.downloader.impls.C60090d.C600943 */

            @Override // com.ss.android.socialbase.downloader.db.AbstractC60014b
            /* renamed from: a */
            public void mo204366a() {
                C60090d.this.mo204940d();
                C60090d.this.mo204941e();
                C60046b.m232960a(DownloadCacheSyncStatus.SYNC_SUCCESS);
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void clearData() {
        try {
            this.f149901b.clearData();
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
        if (C60161d.m233791b()) {
            AbstractC60062l a = C60104l.m233401a(true);
            if (a != null) {
                a.mo204817f();
            } else {
                this.f149900a.clearData();
            }
        } else {
            this.f149900a.clearData();
        }
    }

    /* renamed from: e */
    public void mo204941e() {
        long j;
        if (C60148a.m233727c().mo205473a("task_resume_delay")) {
            j = 4000;
        } else if (Build.VERSION.SDK_INT >= 23) {
            j = 1000;
        } else {
            j = 5000;
        }
        this.f149905f.sendMessageDelayed(this.f149905f.obtainMessage(1), j);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public boolean ensureDownloadCacheSyncSuccess() {
        if (this.f149902c) {
            return true;
        }
        synchronized (this) {
            if (!this.f149902c) {
                C59990a.m232840d("DefaultDownloadCache", "ensureDownloadCacheSyncSuccess: waiting start!!!!");
                try {
                    wait(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                C59990a.m232840d("DefaultDownloadCache", "ensureDownloadCacheSyncSuccess: waiting end!!!!");
            }
        }
        return this.f149902c;
    }

    public C60090d() {
        if (!C60148a.m233727c().mo205473a("fix_sigbus_downloader_db")) {
            this.f149900a = new SqlDownloadCache();
        } else if (C60161d.m233768a()) {
            this.f149900a = new SqlDownloadCache();
        } else {
            ServiceConnectionC60015c cVar = new ServiceConnectionC60015c();
            cVar.mo204368a(new ServiceConnectionC60015c.AbstractC60021a() {
                /* class com.ss.android.socialbase.downloader.impls.C60090d.C600932 */

                @Override // com.ss.android.socialbase.downloader.db.ServiceConnectionC60015c.AbstractC60021a
                /* renamed from: a */
                public void mo204378a() {
                    C60090d.this.f149900a = new SqlDownloadCache();
                    Log.e("DefaultDownloadCache", "rebind error,use backup sqlDownloadCache");
                }
            });
            this.f149900a = cVar;
        }
        this.f149902c = false;
        this.f149905f = new HandlerC60077f(Looper.getMainLooper(), this.f149904e);
        mo204939c();
    }

    /* renamed from: f */
    public void mo204942f() {
        ArrayList arrayList;
        List<String> list;
        if (this.f149902c) {
            if (this.f149903d) {
                C59990a.m232838b("DefaultDownloadCache", "resumeUnCompleteTask: has resumed, return!!!");
                return;
            }
            this.f149903d = true;
            if (C60161d.m233768a()) {
                AbstractC60061k s = C60046b.m233009s();
                if (s != null) {
                    list = s.mo204772a();
                    arrayList = (list == null || list.isEmpty()) ? null : new ArrayList();
                } else {
                    list = null;
                    arrayList = null;
                }
                SparseArray<DownloadInfo> a = this.f149901b.mo204951a();
                if (a != null) {
                    synchronized (a) {
                        for (int i = 0; i < a.size(); i++) {
                            int keyAt = a.keyAt(i);
                            if (keyAt != 0) {
                                DownloadInfo downloadInfo = a.get(keyAt);
                                if (downloadInfo != null) {
                                    int realStatus = downloadInfo.getRealStatus();
                                    int statusAtDbInit = downloadInfo.getStatusAtDbInit();
                                    if (statusAtDbInit >= 1 && statusAtDbInit <= 11) {
                                        C59992a.m232849a(C60046b.m232995g(), downloadInfo, (BaseException) null, -5);
                                    }
                                    if (list != null) {
                                        if (arrayList != null) {
                                            if (downloadInfo.getMimeType() != null) {
                                                if (list.contains(downloadInfo.getMimeType())) {
                                                    if (realStatus != -2 || downloadInfo.isPauseReserveOnWifi()) {
                                                        downloadInfo.setDownloadFromReserveWifi(false);
                                                        arrayList.add(downloadInfo);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (!(s == null || arrayList == null || arrayList.isEmpty())) {
                        s.mo204773a(arrayList, 1);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m233363a(DownloadInfo downloadInfo) {
        m233364a(downloadInfo, true);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public List<DownloadChunk> getDownloadChunk(int i) {
        return this.f149901b.getDownloadChunk(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo getDownloadInfo(int i) {
        return this.f149901b.getDownloadInfo(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public List<DownloadInfo> getDownloadInfoList(String str) {
        return this.f149901b.getDownloadInfoList(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public List<DownloadInfo> getFailedDownloadInfosWithMimeType(String str) {
        return this.f149901b.getFailedDownloadInfosWithMimeType(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        return this.f149901b.getSuccessedDownloadInfosWithMimeType(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        return this.f149901b.getUnCompletedDownloadInfosWithMimeType(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskIntercept(int i) {
        DownloadInfo OnDownloadTaskIntercept = this.f149901b.OnDownloadTaskIntercept(i);
        m233363a(OnDownloadTaskIntercept);
        return OnDownloadTaskIntercept;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskPrepare(int i) {
        DownloadInfo OnDownloadTaskPrepare = this.f149901b.OnDownloadTaskPrepare(i);
        m233363a(OnDownloadTaskPrepare);
        return OnDownloadTaskPrepare;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskRetry(int i) {
        DownloadInfo OnDownloadTaskRetry = this.f149901b.OnDownloadTaskRetry(i);
        m233363a(OnDownloadTaskRetry);
        return OnDownloadTaskRetry;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo onDownloadTaskStart(int i) {
        DownloadInfo onDownloadTaskStart = this.f149901b.onDownloadTaskStart(i);
        m233363a(onDownloadTaskStart);
        return onDownloadTaskStart;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void syncDownloadInfo(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            this.f149901b.updateDownloadInfo(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public boolean updateDownloadInfo(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return false;
        }
        boolean updateDownloadInfo = this.f149901b.updateDownloadInfo(downloadInfo);
        m233363a(downloadInfo);
        return updateDownloadInfo;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void addSubDownloadChunk(DownloadChunk downloadChunk) {
        if (C60161d.m233791b()) {
            AbstractC60062l a = C60104l.m233401a(true);
            if (a != null) {
                a.mo204790a(downloadChunk);
            } else {
                this.f149900a.addDownloadChunk(downloadChunk);
            }
        } else {
            this.f149900a.addDownloadChunk(downloadChunk);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void addDownloadChunk(DownloadChunk downloadChunk) {
        this.f149901b.addDownloadChunk(downloadChunk);
        if (C60161d.m233791b()) {
            AbstractC60062l a = C60104l.m233401a(true);
            if (a != null) {
                a.mo204790a(downloadChunk);
            } else {
                this.f149900a.addDownloadChunk(downloadChunk);
            }
        } else {
            this.f149900a.addDownloadChunk(downloadChunk);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void removeAllDownloadChunk(int i) {
        this.f149901b.removeAllDownloadChunk(i);
        if (C60161d.m233791b()) {
            AbstractC60062l a = C60104l.m233401a(true);
            if (a != null) {
                a.mo204827o(i);
            } else {
                this.f149900a.removeAllDownloadChunk(i);
            }
        } else {
            this.f149900a.removeAllDownloadChunk(i);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public boolean removeDownloadInfo(int i) {
        try {
            if (C60161d.m233791b()) {
                AbstractC60062l a = C60104l.m233401a(true);
                if (a != null) {
                    a.mo204826n(i);
                } else {
                    this.f149900a.removeDownloadInfo(i);
                }
            } else {
                this.f149900a.removeDownloadInfo(i);
            }
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
        return this.f149901b.removeDownloadInfo(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public boolean removeDownloadTaskData(int i) {
        if (C60161d.m233791b()) {
            AbstractC60062l a = C60104l.m233401a(true);
            if (a != null) {
                a.mo204828p(i);
            } else {
                this.f149900a.removeDownloadTaskData(i);
            }
        } else {
            this.f149900a.removeDownloadTaskData(i);
        }
        return this.f149901b.removeDownloadTaskData(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskCompleted(int i, long j) {
        DownloadInfo OnDownloadTaskCompleted = this.f149901b.OnDownloadTaskCompleted(i, j);
        syncDownloadInfoFromOtherCache(i, null);
        return OnDownloadTaskCompleted;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskError(int i, long j) {
        DownloadInfo OnDownloadTaskError = this.f149901b.OnDownloadTaskError(i, j);
        syncDownloadInfoFromOtherCache(i, null);
        return OnDownloadTaskError;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskPause(int i, long j) {
        DownloadInfo OnDownloadTaskPause = this.f149901b.OnDownloadTaskPause(i, j);
        syncDownloadInfoFromOtherCache(i, null);
        return OnDownloadTaskPause;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskProgress(int i, long j) {
        DownloadInfo OnDownloadTaskProgress = this.f149901b.OnDownloadTaskProgress(i, j);
        m233364a(OnDownloadTaskProgress, false);
        return OnDownloadTaskProgress;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo updateChunkCount(int i, int i2) {
        DownloadInfo updateChunkCount = this.f149901b.updateChunkCount(i, i2);
        m233363a(updateChunkCount);
        return updateChunkCount;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void syncDownloadChunks(int i, List<DownloadChunk> list) {
        if (list != null && list.size() != 0) {
            this.f149901b.syncDownloadChunks(i, list);
            if (C60161d.m233802c()) {
                this.f149900a.syncDownloadInfoFromOtherCache(i, list);
            }
        }
    }

    /* renamed from: a */
    private void m233364a(DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo != null) {
            if (!C60161d.m233791b()) {
                this.f149900a.updateDownloadInfo(downloadInfo);
            } else if (z) {
                AbstractC60062l a = C60104l.m233401a(true);
                if (a != null) {
                    a.mo204809c(downloadInfo);
                } else {
                    this.f149900a.updateDownloadInfo(downloadInfo);
                }
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void syncDownloadInfoFromOtherCache(int i, List<DownloadChunk> list) {
        try {
            updateDownloadInfo(this.f149901b.getDownloadInfo(i));
            if (list == null) {
                list = this.f149901b.getDownloadChunk(i);
            }
            if (C60161d.m233791b()) {
                AbstractC60062l a = C60104l.m233401a(true);
                if (a != null) {
                    a.mo204798b(i, list);
                } else {
                    this.f149900a.syncDownloadInfoFromOtherCache(i, list);
                }
            } else {
                this.f149900a.syncDownloadInfoFromOtherCache(i, list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void updateDownloadChunk(int i, int i2, long j) {
        this.f149901b.updateDownloadChunk(i, i2, j);
        if (C60161d.m233791b()) {
            AbstractC60062l a = C60104l.m233401a(true);
            if (a != null) {
                a.mo204781a(i, i2, j);
            } else {
                this.f149900a.updateDownloadChunk(i, i2, j);
            }
        } else {
            this.f149900a.updateDownloadChunk(i, i2, j);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskConnected(int i, long j, String str, String str2) {
        DownloadInfo OnDownloadTaskConnected = this.f149901b.OnDownloadTaskConnected(i, j, str, str2);
        m233363a(OnDownloadTaskConnected);
        return OnDownloadTaskConnected;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void updateSubDownloadChunkIndex(int i, int i2, int i3, int i4) {
        if (C60161d.m233791b()) {
            AbstractC60062l a = C60104l.m233401a(true);
            if (a != null) {
                a.mo204779a(i, i2, i3, i4);
            } else {
                this.f149900a.updateSubDownloadChunkIndex(i, i2, i3, i4);
            }
        } else {
            this.f149900a.updateSubDownloadChunkIndex(i, i2, i3, i4);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void updateSubDownloadChunk(int i, int i2, int i3, long j) {
        if (C60161d.m233791b()) {
            AbstractC60062l a = C60104l.m233401a(true);
            if (a != null) {
                a.mo204780a(i, i2, i3, j);
            } else {
                this.f149900a.updateSubDownloadChunk(i, i2, i3, j);
            }
        } else {
            this.f149900a.updateSubDownloadChunk(i, i2, i3, j);
        }
    }
}
