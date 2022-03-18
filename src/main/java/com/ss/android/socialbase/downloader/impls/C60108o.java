package com.ss.android.socialbase.downloader.impls;

import android.app.Notification;
import com.ss.android.socialbase.downloader.constants.ListenerType;
import com.ss.android.socialbase.downloader.depend.AbstractC60031i;
import com.ss.android.socialbase.downloader.depend.AbstractC60036n;
import com.ss.android.socialbase.downloader.depend.AbstractC60040r;
import com.ss.android.socialbase.downloader.depend.AbstractC60042t;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.AbstractC60059i;
import com.ss.android.socialbase.downloader.downloader.AbstractC60062l;
import com.ss.android.socialbase.downloader.downloader.AbstractC60064n;
import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.downloader.C60048c;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.p3025b.C59990a;
import com.ss.android.socialbase.downloader.p3026c.C59992a;
import com.ss.android.socialbase.downloader.setting.C60148a;
import com.ss.android.socialbase.downloader.utils.C60158a;
import com.ss.android.socialbase.downloader.utils.C60161d;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.impls.o */
public class C60108o implements AbstractC60062l {

    /* renamed from: a */
    private final AbstractC60081a f149933a;

    /* renamed from: b */
    private final AbstractC60059i f149934b;

    /* renamed from: c */
    private final AbstractC60064n f149935c;

    /* renamed from: d */
    private final boolean f149936d;

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: d */
    public void mo204811d() {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204788a(int i, boolean z) {
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            aVar.mo204908a(i, z);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204792a(List<String> list) {
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            aVar.mo204906a(list);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public boolean mo204794a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return false;
        }
        boolean a = C60161d.m233771a(downloadInfo.getStatus(), downloadInfo.getSavePath(), downloadInfo.getName());
        if (a) {
            if (C60158a.m233738a(33554432)) {
                mo204799b(downloadInfo.getId(), true);
            } else {
                mo204956d(downloadInfo.getId(), true);
            }
        }
        return a;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204785a(int i, Notification notification) {
        AbstractC60064n nVar = this.f149935c;
        if (nVar != null) {
            nVar.mo204654a(i, notification);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204793a(boolean z, boolean z2) {
        AbstractC60064n nVar = this.f149935c;
        if (nVar != null) {
            nVar.mo204660a(z2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204791a(DownloadTask downloadTask) {
        AbstractC60064n nVar = this.f149935c;
        if (nVar != null) {
            nVar.mo204662b(downloadTask);
        } else if (downloadTask != null) {
            C59992a.m232850a(downloadTask.getMonitorDepend(), downloadTask.getDownloadInfo(), new BaseException(1003, "downloadServiceHandler is null"), downloadTask.getDownloadInfo() != null ? downloadTask.getDownloadInfo().getStatus() : 0);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204787a(int i, List<DownloadChunk> list) {
        this.f149934b.syncDownloadChunks(i, list);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204790a(DownloadChunk downloadChunk) {
        this.f149934b.addDownloadChunk(downloadChunk);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204786a(int i, AbstractC60036n nVar) {
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            aVar.mo204902a(i, nVar);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204784a(int i, long j) {
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            aVar.mo204913b(i, j);
        }
    }

    public C60108o() {
        this(false);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: e */
    public boolean mo204815e() {
        return this.f149934b.isDownloadCacheSyncSuccess();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: f */
    public void mo204817f() {
        this.f149934b.clearData();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204776a() {
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            aVar.mo204910b();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: g */
    public boolean mo204818g() {
        AbstractC60064n nVar;
        if (!this.f149936d || (nVar = this.f149935c) == null || !nVar.mo204661a()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: c */
    public boolean mo204808c() {
        return C60046b.m232946H();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: b */
    public boolean mo204803b() {
        AbstractC60064n nVar = this.f149935c;
        if (nVar != null) {
            return nVar.mo204663b();
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204789a(AbstractC60042t tVar) {
        C60046b.m232965a(tVar);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: k */
    public void mo204823k(int i) {
        C59990a.m232832a(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: c */
    public void mo204806c(int i) {
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            aVar.mo204922f(i);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: d */
    public void mo204812d(int i) {
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            aVar.mo204923g(i);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: i */
    public List<DownloadChunk> mo204821i(int i) {
        return this.f149934b.getDownloadChunk(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: j */
    public void mo204822j(int i) {
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            aVar.mo204929m(i);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: n */
    public boolean mo204826n(int i) {
        return this.f149934b.removeDownloadInfo(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: o */
    public void mo204827o(int i) {
        this.f149934b.removeAllDownloadChunk(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: p */
    public boolean mo204828p(int i) {
        return this.f149934b.removeDownloadTaskData(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public List<DownloadInfo> mo204775a(String str) {
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            return aVar.mo204897a(str);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: c */
    public List<DownloadInfo> mo204805c(String str) {
        AbstractC60059i iVar = this.f149934b;
        if (iVar != null) {
            return iVar.getSuccessedDownloadInfosWithMimeType(str);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: d */
    public List<DownloadInfo> mo204810d(String str) {
        AbstractC60059i iVar = this.f149934b;
        if (iVar != null) {
            return iVar.getUnCompletedDownloadInfosWithMimeType(str);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: e */
    public List<DownloadInfo> mo204814e(String str) {
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            return aVar.mo204909b(str);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: g */
    public boolean mo204819g(int i) {
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            return aVar.mo204907a(i);
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: h */
    public DownloadInfo mo204820h(int i) {
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            return aVar.mo204918d(i);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: l */
    public boolean mo204824l(int i) {
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            return aVar.mo204927k(i);
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: m */
    public int mo204825m(int i) {
        return C60048c.m233017a().mo204671a(i);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: q */
    public AbstractC60036n mo204829q(int i) {
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            return aVar.mo204925i(i);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: s */
    public AbstractC60031i mo204831s(int i) {
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            return aVar.mo204926j(i);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: b */
    public List<DownloadInfo> mo204796b(String str) {
        AbstractC60059i iVar = this.f149934b;
        if (iVar != null) {
            return iVar.getFailedDownloadInfosWithMimeType(str);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: f */
    public int mo204816f(int i) {
        DownloadInfo d;
        AbstractC60081a aVar = this.f149933a;
        if (aVar == null || (d = aVar.mo204918d(i)) == null) {
            return 0;
        }
        return d.getStatus();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: r */
    public AbstractC60040r mo204830r(int i) {
        AbstractC60040r rVar;
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            rVar = aVar.mo204924h(i);
        } else {
            rVar = null;
        }
        if (rVar == null) {
            return C60046b.m232942D();
        }
        return rVar;
    }

    public C60108o(boolean z) {
        this.f149933a = C60046b.m233014x();
        this.f149934b = C60046b.m233010t();
        if (!z) {
            this.f149935c = C60046b.m233011u();
        } else {
            this.f149935c = C60046b.m233012v();
        }
        this.f149936d = C60148a.m233727c().mo205475b("service_alive", false);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204777a(int i) {
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            aVar.mo204921e(i);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: e */
    public long mo204813e(int i) {
        DownloadInfo downloadInfo;
        AbstractC60059i iVar = this.f149934b;
        if (iVar == null || (downloadInfo = iVar.getDownloadInfo(i)) == null) {
            return 0;
        }
        int chunkCount = downloadInfo.getChunkCount();
        if (chunkCount <= 1) {
            return downloadInfo.getCurBytes();
        }
        List<DownloadChunk> downloadChunk = this.f149934b.getDownloadChunk(i);
        if (downloadChunk == null || downloadChunk.size() != chunkCount) {
            return 0;
        }
        return C60161d.m233783b(downloadChunk);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: c */
    public boolean mo204809c(DownloadInfo downloadInfo) {
        return this.f149934b.updateDownloadInfo(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: b */
    public void mo204800b(DownloadInfo downloadInfo) {
        this.f149934b.syncDownloadInfo(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: b */
    public void mo204801b(DownloadTask downloadTask) {
        AbstractC60064n nVar = this.f149935c;
        if (nVar != null) {
            nVar.mo204665c(downloadTask);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: b */
    public void mo204802b(List<String> list) {
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            aVar.mo204915b(list);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: b */
    public boolean mo204804b(int i) {
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            return aVar.mo204930n(i);
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public int mo204774a(String str, String str2) {
        return C60046b.m232951a(str, str2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: b */
    public void mo204798b(int i, List<DownloadChunk> list) {
        this.f149934b.syncDownloadInfoFromOtherCache(i, list);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: b */
    public DownloadInfo mo204795b(String str, String str2) {
        return mo204820h(C60046b.m232951a(str, str2));
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: c */
    public void mo204807c(int i, boolean z) {
        C60048c.m233017a().mo204678a(i, z);
    }

    /* renamed from: d */
    public void mo204956d(int i, boolean z) {
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            aVar.mo204919d(i, z);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204778a(int i, int i2) {
        if (C60046b.m232991e() != null) {
            for (AbstractC60042t tVar : C60046b.m232991e()) {
                if (tVar != null) {
                    tVar.mo204530a(i2, i);
                }
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: b */
    public void mo204799b(int i, boolean z) {
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            aVar.mo204914b(i, z);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204781a(int i, int i2, long j) {
        this.f149934b.updateDownloadChunk(i, i2, j);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204779a(int i, int i2, int i3, int i4) {
        this.f149934b.updateSubDownloadChunkIndex(i, i2, i3, i4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204780a(int i, int i2, int i3, long j) {
        this.f149934b.updateSubDownloadChunk(i, i2, i3, j);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: b */
    public void mo204797b(int i, int i2, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z) {
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            aVar.mo204899a(i, i2, iDownloadListener, listenerType, z);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204782a(int i, int i2, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z) {
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            aVar.mo204912b(i, i2, iDownloadListener, listenerType, z);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60062l
    /* renamed from: a */
    public void mo204783a(int i, int i2, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z, boolean z2) {
        AbstractC60081a aVar = this.f149933a;
        if (aVar != null) {
            aVar.mo204900a(i, i2, iDownloadListener, listenerType, z, z2);
        }
    }
}
