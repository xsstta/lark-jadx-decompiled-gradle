package com.tt.refer.common.download.engine.p3421c.p3422a;

import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.tt.miniapp.net.C66517e;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.refer.common.download.engine.model.DownloadRequest;
import com.tt.refer.common.download.engine.p3420b.AbstractC67761b;
import com.tt.refer.common.download.engine.p3421c.AbstractC67762a;
import com.tt.refer.common.download.engine.p3421c.p3422a.AbstractC67767c;
import java.io.File;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* renamed from: com.tt.refer.common.download.engine.c.a.a */
public class C67763a extends AbstractC67762a<DownloadRequest> {

    /* renamed from: a */
    public volatile C67764a f170653a;

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.refer.common.download.engine.c.a.a$a */
    public class C67764a extends AbstractC67761b<DownloadRequest> {

        /* renamed from: a */
        public AbstractC67762a<DownloadRequest> f170654a;

        /* renamed from: c */
        private boolean f170656c;

        /* renamed from: d */
        private File f170657d = null;

        /* renamed from: e */
        private File f170658e = null;

        @Override // com.tt.refer.common.download.engine.p3420b.AbstractRunnableC67760a
        /* renamed from: a */
        public long mo235160a(long j) {
            return 1000;
        }

        /* renamed from: e */
        public DownloadRequest mo235161a() {
            return this.f170654a.mo235172a();
        }

        /* renamed from: b */
        public void mo235166e(DownloadRequest downloadRequest) {
            if (this.f170656c) {
                this.f170654a.mo235180d();
            }
        }

        /* renamed from: c */
        public void mo235163b(DownloadRequest downloadRequest) {
            DownloadRequest.C67779b downloadError = downloadRequest.getDownloadError();
            this.f170654a.mo235175a(downloadError.f170701a, downloadError.f170702b, false);
        }

        /* renamed from: a */
        public boolean mo235162a(DownloadRequest downloadRequest) {
            AppBrandLogger.m52830i("file_download_default", downloadRequest.getFileName(), ">>onPreExecute");
            if (TextUtils.isEmpty(downloadRequest.getDownloadUrl())) {
                AppBrandLogger.m52830i("file_download_default", mo235161a().getFileName(), " download url is empty");
                mo235161a().setErrorInfo(AbstractC67767c.C67768a.f170661b);
                return false;
            } else if (TextUtils.isEmpty(downloadRequest.getDownloadPath())) {
                AppBrandLogger.m52830i("file_download_default", downloadRequest.getFileName(), " download path is empty");
                mo235161a().setErrorInfo(AbstractC67767c.C67768a.f170662c);
                return false;
            } else if (!m263672a(downloadRequest, this.f170658e, this.f170657d)) {
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: e */
        public void mo235165d(DownloadRequest downloadRequest) {
            if (this.f170656c) {
                AppBrandLogger.m52830i("file_download_default", downloadRequest.getFileName(), ">>download success,filesize:", Long.valueOf(downloadRequest.getFileSize()), " path:", mo235161a().getDownloadPath());
                this.f170654a.mo235180d();
                return;
            }
            AppBrandLogger.m52830i("file_download_default", downloadRequest.getFileName(), ">>download failed ", " path:", mo235161a().getDownloadPath());
            DownloadRequest.C67779b downloadError = mo235161a().getDownloadError();
            this.f170654a.mo235175a(downloadError.f170701a, downloadError.f170702b, false);
        }

        /* renamed from: d */
        public boolean mo235164c(DownloadRequest downloadRequest) {
            boolean z;
            AppBrandLogger.m52830i("file_download_default", mo235161a().getFileName(), ">>onRepeatExecute");
            if (!mo235168c()) {
                return true;
            }
            try {
                Request.Builder url = new Request.Builder().url(downloadRequest.getDownloadUrl());
                if (downloadRequest.downloadMethod.equals("POST")) {
                    if (TextUtils.isEmpty(downloadRequest.requestBody)) {
                        AppBrandLogger.m52830i("file_download_default", "request body is empty!", downloadRequest);
                    }
                    url.post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), downloadRequest.requestBody));
                }
                if (downloadRequest.requestHeader != null && !downloadRequest.requestHeader.isEmpty()) {
                    for (Map.Entry<String, String> entry : downloadRequest.requestHeader.entrySet()) {
                        if (entry != null) {
                            url.addHeader(entry.getKey(), entry.getValue());
                        }
                    }
                    AppBrandLogger.m52830i("file_download_default", "header key:", Arrays.toString(downloadRequest.requestHeader.keySet().toArray()));
                }
                Request build = url.build();
                OkHttpClient b = C66517e.m259918b();
                if (downloadRequest.timeoutConfig != null) {
                    OkHttpClient.Builder newBuilder = b.newBuilder();
                    newBuilder.connectTimeout(downloadRequest.timeoutConfig.mo235250a(), TimeUnit.MILLISECONDS).readTimeout(downloadRequest.timeoutConfig.mo235252b(), TimeUnit.MILLISECONDS).writeTimeout(downloadRequest.timeoutConfig.mo235254c(), TimeUnit.MILLISECONDS).build();
                    b = newBuilder.build();
                }
                Response execute = b.newCall(build).execute();
                if (execute == null || !execute.isSuccessful()) {
                    AppBrandLogger.m52830i("file_download_default", " status code error:" + execute.code());
                    throw new IllegalStateException(" status code error:" + execute.code());
                }
                downloadRequest.setFileSize(execute.body().contentLength());
                if (!mo235168c()) {
                    return false;
                }
                int a = m263671a(execute.body().byteStream(), downloadRequest, new AbstractC67766b<DownloadRequest>() {
                    /* class com.tt.refer.common.download.engine.p3421c.p3422a.C67763a.C67764a.C677651 */

                    /* renamed from: a */
                    public void mo235190a(DownloadRequest downloadRequest) {
                        if (DebugUtil.debug()) {
                            AppBrandLogger.m52830i("file_download_default", downloadRequest.getFileName(), ">>progress:", Float.valueOf(downloadRequest.getDownloadPercent()));
                        }
                        C67764a.this.f170654a.mo235177b(downloadRequest.getDownloadedSize());
                    }
                });
                if (a == 1000) {
                    if (this.f170657d.renameTo(this.f170658e)) {
                        if (downloadRequest.verifyHandler != null) {
                            int a2 = downloadRequest.verifyHandler.mo235151a(this.f170658e);
                            if (a2 == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.f170656c = z;
                            if (!z) {
                                DownloadRequest e = mo235161a();
                                String b2 = AbstractC67767c.C67768a.f170668i.mo235193b();
                                e.setErrorInfo(b2, AbstractC67767c.C67768a.f170668i.mo235192a() + " :" + a2);
                                this.f170658e.delete();
                            }
                        } else {
                            this.f170656c = true;
                        }
                        return this.f170656c;
                    }
                    mo235161a().setErrorInfo(AbstractC67767c.C67768a.f170671l);
                    AppBrandLogger.m52829e("file_download_default", "downloading file rename complete file failed!", downloadRequest.getFileName(), "errorCode:", Integer.valueOf(a));
                }
                this.f170656c = false;
                return false;
            } catch (Exception e2) {
                e2.printStackTrace();
                AppBrandLogger.m52829e("file_download_default", "onRepeatExecute>>", e2.getMessage());
                DownloadRequest e3 = mo235161a();
                String b3 = AbstractC67767c.C67768a.f170669j.mo235193b();
                e3.setErrorInfo(b3, AbstractC67767c.C67768a.f170669j.mo235192a() + e2.getMessage());
                if (this.f170657d.exists()) {
                    this.f170657d.delete();
                }
                return false;
            }
        }

        protected C67764a(AbstractC67762a<DownloadRequest> aVar) {
            super(aVar.mo235172a().getMaxRetryTimes());
            this.f170654a = aVar;
            this.f170657d = new File(mo235161a().getDownloadPath() + ".cfg");
            this.f170658e = new File(mo235161a().getDownloadPath());
        }

        /* renamed from: a */
        private boolean m263672a(DownloadRequest downloadRequest, File file, File file2) {
            if (IOUtils.getAvailSpace(Environment.getDataDirectory().getAbsolutePath()) < 1048576) {
                AppBrandLogger.m52829e("file_download_default", "checkEnvironment,download file delete fail! file is:" + file2.getAbsolutePath());
                return false;
            }
            if (!file.exists()) {
                if (!file2.exists()) {
                    File parentFile = file2.getParentFile();
                    if (!parentFile.exists() && !IOUtils.mkdir(parentFile.getAbsolutePath())) {
                        AppBrandLogger.m52829e("file_download_default", downloadRequest.getFileName(), ",create parent dir failed");
                        downloadRequest.setErrorInfo(AbstractC67767c.C67768a.f170664e);
                        return false;
                    } else if (!IOUtils.createFile(file2.getAbsolutePath())) {
                        AppBrandLogger.m52829e("file_download_default", downloadRequest.getFileName(), ",create file dir failed");
                        downloadRequest.setErrorInfo(AbstractC67767c.C67768a.f170663d);
                        return false;
                    }
                } else if (!file2.delete()) {
                    AppBrandLogger.m52829e("file_download_default", "checkEnvironment,download file delete fail! file is:" + file2.getAbsolutePath());
                    downloadRequest.setErrorInfo(AbstractC67767c.C67768a.f170666g);
                    return false;
                }
            } else if (mo235161a().verifyHandler != null) {
                if (mo235161a().verifyHandler.mo235151a(file) == 0) {
                    AppBrandLogger.m52830i("file_download_default", "completeFile exist,and verify success! filename:", mo235161a().getFileName());
                    this.f170656c = true;
                    mo235169d();
                    return true;
                }
            } else if (!file.delete()) {
                AppBrandLogger.m52829e("file_download_default", "completeFile delete failed! file is " + file.getAbsolutePath());
                downloadRequest.setErrorInfo(AbstractC67767c.C67768a.f170672m);
                return false;
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x01a7 A[SYNTHETIC, Splitter:B:100:0x01a7] */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x01b2 A[SYNTHETIC, Splitter:B:105:0x01b2] */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x01de A[SYNTHETIC, Splitter:B:114:0x01de] */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x01e9 A[SYNTHETIC, Splitter:B:119:0x01e9] */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x01f4 A[SYNTHETIC, Splitter:B:124:0x01f4] */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x0220 A[SYNTHETIC, Splitter:B:133:0x0220] */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x022b A[SYNTHETIC, Splitter:B:138:0x022b] */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x0236 A[SYNTHETIC, Splitter:B:143:0x0236] */
        /* JADX WARNING: Removed duplicated region for block: B:150:0x0246 A[SYNTHETIC, Splitter:B:150:0x0246] */
        /* JADX WARNING: Removed duplicated region for block: B:155:0x0251 A[SYNTHETIC, Splitter:B:155:0x0251] */
        /* JADX WARNING: Removed duplicated region for block: B:160:0x025c A[SYNTHETIC, Splitter:B:160:0x025c] */
        /* JADX WARNING: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x019c A[SYNTHETIC, Splitter:B:95:0x019c] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private int m263671a(java.io.InputStream r28, com.tt.refer.common.download.engine.model.DownloadRequest r29, com.tt.refer.common.download.engine.p3421c.p3422a.AbstractC67766b<com.tt.refer.common.download.engine.model.DownloadRequest> r30) {
            /*
            // Method dump skipped, instructions count: 614
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tt.refer.common.download.engine.p3421c.p3422a.C67763a.C67764a.m263671a(java.io.InputStream, com.tt.refer.common.download.engine.model.DownloadRequest, com.tt.refer.common.download.engine.c.a.b):int");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.download.engine.p3421c.AbstractC67762a
    /* renamed from: g */
    public boolean mo235183g() {
        AppBrandLogger.m52830i("file_download_default", ((DownloadRequest) mo235172a()).getFileName(), ">>onEndSuccess");
        this.f170653a = null;
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.download.engine.p3421c.AbstractC67762a
    /* renamed from: f */
    public boolean mo235182f() {
        AppBrandLogger.m52830i("file_download_default", ((DownloadRequest) mo235172a()).getFileName(), ">>onStart");
        if (this.f170653a != null) {
            return false;
        }
        this.f170653a = new C67764a(this);
        C67554l.m262725b().execute(this.f170653a);
        return true;
    }

    public C67763a(DownloadRequest downloadRequest) {
        super(downloadRequest);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.download.engine.p3421c.AbstractC67762a
    /* renamed from: b */
    public boolean mo235178b(String str, String str2, boolean z) {
        AppBrandLogger.m52830i("file_download_default", ((DownloadRequest) mo235172a()).getFileName(), ">>onEndError,retry:", Boolean.valueOf(z));
        this.f170653a = null;
        ((DownloadRequest) mo235172a()).setErrorInfo(str, str2);
        AppBrandLogger.m52829e("file_download_default", "errorCode = ", str, "errorMsg:", str2);
        return true;
    }
}
