package com.ss.android.socialbase.downloader.impls;

import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.constants.C59997c;
import com.ss.android.socialbase.downloader.downloader.AbstractC60059i;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.impls.k */
public class C60103k implements AbstractC60059i {

    /* renamed from: a */
    private final SparseArray<DownloadInfo> f149920a = new SparseArray<>();

    /* renamed from: b */
    private final SparseArray<List<DownloadChunk>> f149921b = new SparseArray<>();

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void addSubDownloadChunk(DownloadChunk downloadChunk) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public boolean ensureDownloadCacheSyncSuccess() {
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public boolean isDownloadCacheSyncSuccess() {
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void syncDownloadInfoFromOtherCache(int i, List<DownloadChunk> list) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void updateSubDownloadChunkIndex(int i, int i2, int i3, int i4) {
    }

    /* renamed from: a */
    public SparseArray<DownloadInfo> mo204951a() {
        return this.f149920a;
    }

    /* renamed from: b */
    public SparseArray<List<DownloadChunk>> mo204952b() {
        return this.f149921b;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void clearData() {
        synchronized (this.f149920a) {
            this.f149920a.clear();
            this.f149921b.clear();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void syncDownloadInfo(DownloadInfo downloadInfo) {
        updateDownloadInfo(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public boolean removeDownloadTaskData(int i) {
        removeDownloadInfo(i);
        removeAllDownloadChunk(i);
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskIntercept(int i) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setStatus(-7);
        }
        return downloadInfo;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskPrepare(int i) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setStatus(1);
        }
        return downloadInfo;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskRetry(int i) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setStatus(5);
            downloadInfo.setFirstDownload(false);
        }
        return downloadInfo;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public List<DownloadChunk> getDownloadChunk(int i) {
        return this.f149921b.get(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo onDownloadTaskStart(int i) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setStatus(2);
        }
        return downloadInfo;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public synchronized void removeAllDownloadChunk(int i) {
        this.f149921b.remove(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public boolean removeDownloadInfo(int i) {
        synchronized (this.f149920a) {
            this.f149920a.remove(i);
        }
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo getDownloadInfo(int i) {
        DownloadInfo downloadInfo;
        synchronized (this.f149920a) {
            try {
                downloadInfo = this.f149920a.get(i);
            } catch (Exception e) {
                e.printStackTrace();
                downloadInfo = null;
            }
        }
        return downloadInfo;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public synchronized void addDownloadChunk(DownloadChunk downloadChunk) {
        int k = downloadChunk.mo205019k();
        List<DownloadChunk> list = this.f149921b.get(k);
        if (list == null) {
            list = new ArrayList<>();
            this.f149921b.put(k, list);
        }
        list.add(downloadChunk);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public List<DownloadInfo> getDownloadInfoList(String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f149920a) {
            try {
                int size = this.f149920a.size();
                for (int i = 0; i < size; i++) {
                    DownloadInfo valueAt = this.f149920a.valueAt(i);
                    if (str != null && str.equals(valueAt.getUrl())) {
                        arrayList.add(valueAt);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public boolean updateDownloadInfo(DownloadInfo downloadInfo) {
        boolean z = true;
        if (downloadInfo == null) {
            return true;
        }
        synchronized (this.f149920a) {
            if (this.f149920a.get(downloadInfo.getId()) == null) {
                z = false;
            }
            this.f149920a.put(downloadInfo.getId(), downloadInfo);
        }
        return z;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public List<DownloadInfo> getFailedDownloadInfosWithMimeType(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f149920a) {
            if (this.f149920a.size() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f149920a.size(); i++) {
                DownloadInfo downloadInfo = this.f149920a.get(this.f149920a.keyAt(i));
                if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && C59997c.m232862g(downloadInfo.getStatus())) {
                    arrayList.add(downloadInfo);
                }
            }
            return arrayList;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f149920a) {
            if (this.f149920a.size() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f149920a.size(); i++) {
                DownloadInfo downloadInfo = this.f149920a.get(this.f149920a.keyAt(i));
                if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && downloadInfo.getStatus() == -3) {
                    arrayList.add(downloadInfo);
                }
            }
            return arrayList;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f149920a) {
            if (this.f149920a.size() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f149920a.size(); i++) {
                DownloadInfo downloadInfo = this.f149920a.get(this.f149920a.keyAt(i));
                if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && C59997c.m232861f(downloadInfo.getStatus())) {
                    arrayList.add(downloadInfo);
                }
            }
            return arrayList;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskPause(int i, long j) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setCurBytes(j, false);
            downloadInfo.setStatus(-2);
        }
        return downloadInfo;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo updateChunkCount(int i, int i2) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setChunkCount(i2);
        }
        return downloadInfo;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskCompleted(int i, long j) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setCurBytes(j, false);
            downloadInfo.setStatus(-3);
            downloadInfo.setFirstDownload(false);
            downloadInfo.setFirstSuccess(false);
        }
        return downloadInfo;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskError(int i, long j) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setCurBytes(j, false);
            downloadInfo.setStatus(-1);
            downloadInfo.setFirstDownload(false);
        }
        return downloadInfo;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskProgress(int i, long j) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setCurBytes(j, false);
            if (!(downloadInfo.getStatus() == -3 || downloadInfo.getStatus() == -2 || C59997c.m232862g(downloadInfo.getStatus()) || downloadInfo.getStatus() == -4)) {
                downloadInfo.setStatus(4);
            }
        }
        return downloadInfo;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void syncDownloadChunks(int i, List<DownloadChunk> list) {
        if (list != null) {
            removeAllDownloadChunk(i);
            for (DownloadChunk downloadChunk : list) {
                if (downloadChunk != null) {
                    addDownloadChunk(downloadChunk);
                    if (downloadChunk.mo205014f()) {
                        for (DownloadChunk downloadChunk2 : downloadChunk.mo205015g()) {
                            addDownloadChunk(downloadChunk2);
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void updateDownloadChunk(int i, int i2, long j) {
        List<DownloadChunk> downloadChunk = getDownloadChunk(i);
        if (downloadChunk != null) {
            for (DownloadChunk downloadChunk2 : downloadChunk) {
                if (downloadChunk2 != null && downloadChunk2.mo205027s() == i2) {
                    downloadChunk2.mo205006b(j);
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskConnected(int i, long j, String str, String str2) {
        DownloadInfo downloadInfo = getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setTotalBytes(j);
            downloadInfo.seteTag(str);
            if (TextUtils.isEmpty(downloadInfo.getName()) && !TextUtils.isEmpty(str2)) {
                downloadInfo.setName(str2);
            }
            downloadInfo.setStatus(3);
        }
        return downloadInfo;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void updateSubDownloadChunk(int i, int i2, int i3, long j) {
        List<DownloadChunk> downloadChunk = getDownloadChunk(i);
        if (downloadChunk != null) {
            for (DownloadChunk downloadChunk2 : downloadChunk) {
                if (!(downloadChunk2 == null || downloadChunk2.mo205027s() != i3 || downloadChunk2.mo205014f())) {
                    if (downloadChunk2.mo205015g() != null) {
                        for (DownloadChunk downloadChunk3 : downloadChunk2.mo205015g()) {
                            if (downloadChunk3 != null && downloadChunk3.mo205027s() == i2) {
                                downloadChunk3.mo205006b(j);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
