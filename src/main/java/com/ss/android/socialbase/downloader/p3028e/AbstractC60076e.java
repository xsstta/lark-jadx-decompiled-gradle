package com.ss.android.socialbase.downloader.p3028e;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.RetryCheckStatus;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.network.AbstractC60135e;

/* renamed from: com.ss.android.socialbase.downloader.e.e */
public interface AbstractC60076e {
    /* renamed from: a */
    RetryCheckStatus mo204844a(BaseException baseException, long j);

    /* renamed from: a */
    RetryCheckStatus mo204845a(DownloadChunk downloadChunk, BaseException baseException, long j);

    /* renamed from: a */
    DownloadChunk mo204846a(int i);

    /* renamed from: a */
    void mo204848a(RunnableC60070b bVar);

    /* renamed from: a */
    void mo204849a(BaseException baseException, boolean z);

    /* renamed from: a */
    void mo204850a(AbstractC60135e eVar);

    /* renamed from: a */
    boolean mo204853a(long j) throws BaseException;

    /* renamed from: a */
    boolean mo204854a(BaseException baseException);

    /* renamed from: b */
    void mo204857b(BaseException baseException);

    /* renamed from: c */
    void mo204859c(BaseException baseException);
}
