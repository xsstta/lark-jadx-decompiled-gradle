package com.ss.android.socialbase.downloader.downloader;

import android.util.SparseArray;
import com.ss.android.socialbase.downloader.db.AbstractC60014b;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.downloader.r */
public interface AbstractC60068r extends AbstractC60059i {
    void init(SparseArray<DownloadInfo> sparseArray, SparseArray<List<DownloadChunk>> sparseArray2, AbstractC60014b bVar);
}
