package com.ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import com.ss.android.socialbase.downloader.constants.ListenerType;
import com.ss.android.socialbase.downloader.depend.AbstractC60031i;
import com.ss.android.socialbase.downloader.depend.AbstractC60036n;
import com.ss.android.socialbase.downloader.depend.AbstractC60040r;
import com.ss.android.socialbase.downloader.depend.AbstractC60042t;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.downloader.l */
public interface AbstractC60062l {
    /* renamed from: a */
    int mo204774a(String str, String str2);

    /* renamed from: a */
    List<DownloadInfo> mo204775a(String str);

    /* renamed from: a */
    void mo204776a();

    /* renamed from: a */
    void mo204777a(int i);

    /* renamed from: a */
    void mo204778a(int i, int i2);

    /* renamed from: a */
    void mo204779a(int i, int i2, int i3, int i4);

    /* renamed from: a */
    void mo204780a(int i, int i2, int i3, long j);

    /* renamed from: a */
    void mo204781a(int i, int i2, long j);

    /* renamed from: a */
    void mo204782a(int i, int i2, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z);

    /* renamed from: a */
    void mo204783a(int i, int i2, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z, boolean z2);

    /* renamed from: a */
    void mo204784a(int i, long j);

    /* renamed from: a */
    void mo204785a(int i, Notification notification);

    /* renamed from: a */
    void mo204786a(int i, AbstractC60036n nVar);

    /* renamed from: a */
    void mo204787a(int i, List<DownloadChunk> list);

    /* renamed from: a */
    void mo204788a(int i, boolean z);

    /* renamed from: a */
    void mo204789a(AbstractC60042t tVar);

    /* renamed from: a */
    void mo204790a(DownloadChunk downloadChunk);

    /* renamed from: a */
    void mo204791a(DownloadTask downloadTask);

    /* renamed from: a */
    void mo204792a(List<String> list);

    /* renamed from: a */
    void mo204793a(boolean z, boolean z2);

    /* renamed from: a */
    boolean mo204794a(DownloadInfo downloadInfo);

    /* renamed from: b */
    DownloadInfo mo204795b(String str, String str2);

    /* renamed from: b */
    List<DownloadInfo> mo204796b(String str);

    /* renamed from: b */
    void mo204797b(int i, int i2, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z);

    /* renamed from: b */
    void mo204798b(int i, List<DownloadChunk> list);

    /* renamed from: b */
    void mo204799b(int i, boolean z);

    /* renamed from: b */
    void mo204800b(DownloadInfo downloadInfo);

    /* renamed from: b */
    void mo204801b(DownloadTask downloadTask);

    /* renamed from: b */
    void mo204802b(List<String> list);

    /* renamed from: b */
    boolean mo204803b();

    /* renamed from: b */
    boolean mo204804b(int i);

    /* renamed from: c */
    List<DownloadInfo> mo204805c(String str);

    /* renamed from: c */
    void mo204806c(int i);

    /* renamed from: c */
    void mo204807c(int i, boolean z);

    /* renamed from: c */
    boolean mo204808c();

    /* renamed from: c */
    boolean mo204809c(DownloadInfo downloadInfo);

    /* renamed from: d */
    List<DownloadInfo> mo204810d(String str);

    /* renamed from: d */
    void mo204811d();

    /* renamed from: d */
    void mo204812d(int i);

    /* renamed from: e */
    long mo204813e(int i);

    /* renamed from: e */
    List<DownloadInfo> mo204814e(String str);

    /* renamed from: e */
    boolean mo204815e();

    /* renamed from: f */
    int mo204816f(int i);

    /* renamed from: f */
    void mo204817f();

    /* renamed from: g */
    boolean mo204818g();

    /* renamed from: g */
    boolean mo204819g(int i);

    /* renamed from: h */
    DownloadInfo mo204820h(int i);

    /* renamed from: i */
    List<DownloadChunk> mo204821i(int i);

    /* renamed from: j */
    void mo204822j(int i);

    /* renamed from: k */
    void mo204823k(int i);

    /* renamed from: l */
    boolean mo204824l(int i);

    /* renamed from: m */
    int mo204825m(int i);

    /* renamed from: n */
    boolean mo204826n(int i);

    /* renamed from: o */
    void mo204827o(int i);

    /* renamed from: p */
    boolean mo204828p(int i);

    /* renamed from: q */
    AbstractC60036n mo204829q(int i);

    /* renamed from: r */
    AbstractC60040r mo204830r(int i);

    /* renamed from: s */
    AbstractC60031i mo204831s(int i);
}
