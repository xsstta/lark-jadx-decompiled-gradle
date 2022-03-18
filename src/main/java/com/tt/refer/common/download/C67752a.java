package com.tt.refer.common.download;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.refer.common.download.engine.model.C67780a;
import com.tt.refer.common.download.engine.model.DownloadRequest;
import com.tt.refer.common.download.engine.p3419a.AbstractC67758a;
import com.tt.refer.common.download.engine.p3421c.AbstractC67762a;
import com.tt.refer.common.download.engine.p3421c.AbstractC67769b;
import com.tt.refer.common.download.engine.p3421c.p3422a.C67763a;
import com.tt.refer.common.download.engine.p3423d.AbstractC67774b;
import com.tt.refer.common.download.engine.p3423d.AbstractC67775c;
import com.tt.refer.common.download.engine.p3423d.C67771a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.tt.refer.common.download.a */
public class C67752a implements AbstractC67757b<DownloadRequest> {

    /* renamed from: a */
    public Map<String, List<IDownloadListener<DownloadRequest>>> f170639a = new HashMap();

    /* renamed from: b */
    public AbstractC67758a<DownloadRequest> f170640b = new AbstractC67758a<DownloadRequest>() {
        /* class com.tt.refer.common.download.C67752a.C677531 */

        /* renamed from: a */
        public String mo235137a(DownloadRequest downloadRequest) {
            return downloadRequest.getId();
        }
    };

    /* renamed from: c */
    private AbstractC67775c<DownloadRequest> f170641c;

    /* renamed from: com.tt.refer.common.download.a$a */
    private class C67755a implements AbstractC67769b<DownloadRequest> {
        @Override // com.tt.refer.common.download.engine.p3421c.AbstractC67769b
        /* renamed from: a */
        public void mo235139a() {
            AppBrandLogger.m52830i("file_download_impl", "###FileDownload >>>onNoDowningTask");
        }

        @Override // com.tt.refer.common.download.engine.p3421c.AbstractC67769b
        /* renamed from: b */
        public void mo235146b() {
            AppBrandLogger.m52830i("file_download_impl", "###FileDownload >>>onFinishAll");
        }

        private C67755a() {
        }

        /* renamed from: c */
        public void mo235140a(DownloadRequest downloadRequest) {
            List<IDownloadListener<DownloadRequest>> list = C67752a.this.f170639a.get(downloadRequest.getId());
            if (list == null) {
                AppBrandLogger.m52830i("file_download_impl", "###FileDownload >>>onReady>>listener null!");
                return;
            }
            for (IDownloadListener<DownloadRequest> iDownloadListener : list) {
                iDownloadListener.onReady(downloadRequest);
            }
        }

        /* renamed from: a */
        public void mo235149c(DownloadRequest downloadRequest) {
            AppBrandLogger.m52830i("file_download_impl", "###FileDownload >>>onStart:", downloadRequest.getFileName());
            List<IDownloadListener<DownloadRequest>> list = C67752a.this.f170639a.get(downloadRequest.getId());
            if (list == null) {
                AppBrandLogger.m52830i("file_download_impl", "###FileDownload >>>onStart>>listener null!");
                return;
            }
            for (IDownloadListener<DownloadRequest> iDownloadListener : list) {
                iDownloadListener.onStart(downloadRequest);
            }
        }

        /* renamed from: b */
        public void mo235147b(DownloadRequest downloadRequest) {
            AppBrandLogger.m52830i("file_download_impl", "###FileDownload >>>onComplete", downloadRequest.getFileName());
            C67752a.this.f170640b.mo235158c(downloadRequest);
            List<IDownloadListener<DownloadRequest>> list = C67752a.this.f170639a.get(downloadRequest.getId());
            if (list == null) {
                AppBrandLogger.m52830i("file_download_impl", "###FileDownload >>>onComplete>>listener null!");
                return;
            }
            C67752a.this.f170639a.remove(downloadRequest.getId());
            for (IDownloadListener<DownloadRequest> iDownloadListener : list) {
                iDownloadListener.onComplete(downloadRequest);
            }
        }

        /* renamed from: a */
        public void mo235141a(DownloadRequest downloadRequest, long j) {
            List<IDownloadListener<DownloadRequest>> list = C67752a.this.f170639a.get(downloadRequest.getId());
            if (list == null) {
                AppBrandLogger.m52830i("file_download_impl", "###FileDownload >>>onDoing>>listener null!");
                return;
            }
            for (IDownloadListener<DownloadRequest> iDownloadListener : list) {
                iDownloadListener.onDownloading(downloadRequest);
            }
        }

        /* renamed from: a */
        public void mo235142a(DownloadRequest downloadRequest, String str, String str2) {
            AppBrandLogger.m52830i("file_download_impl", "###FileDownload >>>onError", downloadRequest.getFileName());
            downloadRequest.setErrorInfo(str, str2);
            C67752a.this.f170640b.mo235158c(downloadRequest);
            List<IDownloadListener<DownloadRequest>> list = C67752a.this.f170639a.get(downloadRequest.getId());
            if (list == null) {
                AppBrandLogger.m52830i("file_download_impl", "onError->listeners is null!");
                return;
            }
            C67752a.this.f170639a.remove(downloadRequest.getId());
            for (IDownloadListener<DownloadRequest> iDownloadListener : list) {
                iDownloadListener.onError(downloadRequest);
            }
        }
    }

    public C67752a() {
        C67771a aVar = new C67771a(new AbstractC67774b<DownloadRequest>() {
            /* class com.tt.refer.common.download.C67752a.C677542 */

            @Override // com.tt.refer.common.download.engine.p3423d.AbstractC67774b
            /* renamed from: a */
            public AbstractC67762a<DownloadRequest> mo235138a(String str) {
                AppBrandLogger.m52830i("file_download_impl", "createDownloadTask taskId:", str);
                DownloadRequest a = C67752a.this.f170640b.mo235154a(str);
                if (a == null) {
                    AppBrandLogger.m52829e("file_download_impl", "createDownloadTask mBean is null");
                    return null;
                } else if (a.getTaskCreator() != null) {
                    AppBrandLogger.m52830i("file_download_impl", "mBean.getTaskCreator is not null!,mBean:", a);
                    return a.getTaskCreator().mo235207a(a);
                } else {
                    AppBrandLogger.m52830i("file_download_impl", "mBean.getTaskCreator is null!,mBean:", a);
                    return new C67763a(a);
                }
            }
        }, 5);
        this.f170641c = aVar;
        aVar.mo235200a(new C67755a());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.tt.refer.common.download.engine.model.DownloadBean, com.tt.refer.common.download.IDownloadListener] */
    @Override // com.tt.refer.common.download.AbstractC67757b
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo235134a(DownloadRequest downloadRequest, IDownloadListener iDownloadListener) {
        return mo235135a(downloadRequest, (IDownloadListener<DownloadRequest>) iDownloadListener);
    }

    /* renamed from: a */
    public boolean mo235135a(DownloadRequest downloadRequest, IDownloadListener<DownloadRequest> iDownloadListener) {
        boolean z;
        if (downloadRequest == null) {
            AppBrandLogger.m52830i("file_download_impl", "addDownloadTask ->task is empty!");
            return false;
        }
        if (!this.f170640b.mo235159d(downloadRequest)) {
            C67780a<DownloadRequest> aVar = new C67780a<>(downloadRequest.getId(), downloadRequest.getStatus());
            aVar.mo235247b(downloadRequest.getPriority());
            this.f170641c.mo235203a(aVar);
            this.f170640b.mo235157b(downloadRequest);
            z = true;
        } else {
            z = false;
        }
        if (iDownloadListener != null) {
            synchronized (this.f170639a) {
                List<IDownloadListener<DownloadRequest>> list = this.f170639a.get(downloadRequest.getId());
                if (list == null) {
                    list = new CopyOnWriteArrayList<>();
                    this.f170639a.put(downloadRequest.getId(), list);
                }
                list.add(iDownloadListener);
            }
        }
        if (z) {
            this.f170641c.mo235202a();
        } else {
            AppBrandLogger.m52830i("file_download_impl", "is already add:", downloadRequest);
        }
        return true;
    }
}
