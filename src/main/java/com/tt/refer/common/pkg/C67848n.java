package com.tt.refer.common.pkg;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.tt.miniapp.ttapkgdecoder.p3334b.C66984e;
import com.tt.miniapp.ttapkgdecoder.utils.C66987b;
import com.tt.refer.common.download.engine.model.DownloadRequest;
import com.tt.refer.common.download.engine.p3421c.p3422a.AbstractC67767c;
import com.tt.refer.common.pkg.p3425b.C67824b;
import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: com.tt.refer.common.pkg.n */
public class C67848n extends AbstractC67819a implements C66987b.AbstractC66989a {

    /* renamed from: b */
    private IAppContext f170905b;

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.pkg.AbstractC67819a
    /* renamed from: h */
    public AbstractC67822b mo235429h() {
        return new C67849a(this);
    }

    /* renamed from: com.tt.refer.common.pkg.n$a */
    class C67849a extends AbstractC67822b {
        @Override // com.tt.refer.common.pkg.AbstractC67822b, com.tt.refer.common.download.engine.p3420b.AbstractRunnableC67760a
        /* renamed from: a */
        public long mo235160a(long j) {
            return 1000;
        }

        /* access modifiers changed from: protected */
        @Override // com.tt.refer.common.pkg.AbstractC67822b
        /* renamed from: f */
        public boolean mo235445f() {
            return true;
        }

        @Override // com.tt.refer.common.pkg.AbstractC67822b
        /* renamed from: e */
        public DownloadRequest mo235161a() {
            return (DownloadRequest) this.f170829d.mo235172a();
        }

        /* renamed from: e */
        public boolean mo235164c(DownloadRequest downloadRequest) {
            boolean z;
            AppBrandLogger.m52830i("app_start_load_pkg_mgr_stream_download_task", mo235161a().getFileName(), ">>onRepeatExecute");
            try {
                int a = C67848n.this.mo235484a(downloadRequest);
                if (a == 1000) {
                    if (this.f170827b.renameTo(this.f170828c)) {
                        if (downloadRequest.verifyHandler != null) {
                            int a2 = downloadRequest.verifyHandler.mo235151a(this.f170828c);
                            if (a2 == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.f170826a = z;
                            if (!this.f170826a) {
                                DownloadRequest e = mo235161a();
                                String b = AbstractC67767c.C67768a.f170668i.mo235193b();
                                e.setErrorInfo(b, AbstractC67767c.C67768a.f170668i.mo235192a() + " :" + a2);
                                this.f170828c.delete();
                            }
                        } else {
                            this.f170826a = true;
                        }
                        return this.f170826a;
                    }
                    mo235161a().setErrorInfo(AbstractC67767c.C67768a.f170671l);
                    AppBrandLogger.m52829e("app_start_load_pkg_mgr_stream_download_task", "downloading file rename complete file failed!", downloadRequest.getFileName(), "errorCode:", Integer.valueOf(a));
                }
                this.f170826a = false;
                return false;
            } catch (Exception e2) {
                e2.printStackTrace();
                AppBrandLogger.m52829e("app_start_load_pkg_mgr_stream_download_task", "onRepeatExecute>>", e2.getMessage());
                DownloadRequest e3 = mo235161a();
                String b2 = AbstractC67767c.C67768a.f170669j.mo235193b();
                e3.setErrorInfo(b2, AbstractC67767c.C67768a.f170669j.mo235192a() + e2.getMessage());
                if (this.f170827b.exists()) {
                    this.f170827b.delete();
                }
                return false;
            }
        }

        protected C67849a(AbstractC67819a aVar) {
            super(aVar);
        }
    }

    @Override // com.tt.miniapp.ttapkgdecoder.utils.C66987b.AbstractC66989a
    /* renamed from: a */
    public void mo233022a(long j) {
        DownloadRequest downloadRequest = (DownloadRequest) mo235172a();
        downloadRequest.setDownloadedSize(j);
        mo235177b(downloadRequest.getDownloadedSize());
    }

    /* renamed from: a */
    private RandomAccessFile m263967a(File file) {
        try {
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            return new RandomAccessFile(file, "rw");
        } catch (Exception e) {
            AppBrandLogger.m52829e("app_start_load_pkg_mgr_stream_download_task", e);
            return null;
        }
    }

    /* renamed from: a */
    public int mo235484a(DownloadRequest downloadRequest) throws Exception {
        downloadRequest.clearErrorInfo();
        File file = new File(downloadRequest.getDownloadingPath());
        RandomAccessFile a = m263967a(new File(downloadRequest.getDownloadingPath()));
        int i = CommonCode.StatusCode.API_CLIENT_EXPIRED;
        char c = 1;
        int i2 = 2;
        String str = "app_start_load_pkg_mgr_stream_download_task";
        if (a == null) {
            AppBrandLogger.m52829e(str, "randomAccessFile create failed!", file);
            downloadRequest.setErrorInfo(AbstractC67767c.C67768a.f170675p);
            return CommonCode.StatusCode.API_CLIENT_EXPIRED;
        }
        C66984e eVar = new C66984e(downloadRequest.getDownloadUrl(), new C67824b(downloadRequest.getDownloadedSize(), this.f170905b));
        long length = a.length();
        a.seek(length);
        eVar.mo233018a(this);
        eVar.mo233015b();
        long j = -1;
        long e = eVar.mo233020e();
        if (e > 0) {
            j = e + length;
            downloadRequest.setFileSize(j);
        }
        AppBrandLogger.m52830i(str, "loadWithUrl start url:", downloadRequest.getDownloadUrl(), " contentLength:", Long.valueOf(j), " completeLength:", Long.valueOf(length));
        byte[] bArr = new byte[8192];
        long currentTimeMillis = System.currentTimeMillis();
        int i3 = 0;
        long j2 = length;
        while (mo235430i()) {
            long currentTimeMillis2 = System.currentTimeMillis();
            int a2 = eVar.mo233013a(bArr, i3, 8192 - i3);
            if (a2 == -1) {
                if (i3 > 0) {
                    a.write(bArr, 0, i3);
                }
                a.close();
                eVar.mo233017c();
                return 1000;
            }
            length += (long) a2;
            long j3 = currentTimeMillis2 - currentTimeMillis;
            if (j3 >= 1000) {
                downloadRequest.setSpeed(((length - j2) / j3) * 1000);
                downloadRequest.setDownloadedSize(length);
                j2 = length;
                currentTimeMillis = currentTimeMillis2;
            }
            i3 += a2;
            if (i3 < 8192) {
                str = str;
                i = CommonCode.StatusCode.API_CLIENT_EXPIRED;
                c = 1;
                i2 = 2;
            } else {
                a.write(bArr, 0, 8192);
                str = str;
                i = CommonCode.StatusCode.API_CLIENT_EXPIRED;
                c = 1;
                i2 = 2;
                i3 = 0;
            }
        }
        eVar.mo233017c();
        Object[] objArr = new Object[i2];
        objArr[0] = ((DownloadRequest) mo235172a()).getFileName();
        objArr[c] = " is abort while write stream to file";
        AppBrandLogger.m52830i(str, objArr);
        ((DownloadRequest) mo235172a()).setErrorInfo(AbstractC67767c.C67768a.f170673n);
        return i;
    }

    public C67848n(DownloadRequest downloadRequest, IAppContext iAppContext) {
        super(downloadRequest);
        this.f170905b = iAppContext;
    }
}
