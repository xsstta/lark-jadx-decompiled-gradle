package com.tt.refer.common.pkg;

import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.tt.refer.common.download.engine.model.DownloadRequest;
import com.tt.refer.common.download.engine.p3420b.AbstractC67761b;
import com.tt.refer.common.download.engine.p3421c.p3422a.AbstractC67767c;
import java.io.File;

/* renamed from: com.tt.refer.common.pkg.b */
public abstract class AbstractC67822b extends AbstractC67761b<DownloadRequest> {

    /* renamed from: a */
    protected volatile boolean f170826a;

    /* renamed from: b */
    protected File f170827b = new File(mo235161a().getDownloadingPath());

    /* renamed from: c */
    protected File f170828c = new File(mo235161a().getDownloadPath());

    /* renamed from: d */
    protected AbstractC67819a f170829d;

    @Override // com.tt.refer.common.download.engine.p3420b.AbstractRunnableC67760a
    /* renamed from: a */
    public long mo235160a(long j) {
        return 1000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo235445f();

    /* renamed from: e */
    public DownloadRequest mo235161a() {
        return (DownloadRequest) this.f170829d.mo235172a();
    }

    /* renamed from: d */
    public void mo235166e(DownloadRequest downloadRequest) {
        if (this.f170826a) {
            this.f170829d.mo235180d();
        }
    }

    /* renamed from: b */
    public void mo235163b(DownloadRequest downloadRequest) {
        this.f170829d.mo235175a(downloadRequest.getDownloadError().f170701a, downloadRequest.getDownloadError().f170702b, false);
    }

    protected AbstractC67822b(AbstractC67819a aVar) {
        super(((DownloadRequest) aVar.mo235172a()).getMaxRetryTimes());
        this.f170829d = aVar;
    }

    /* renamed from: c */
    public void mo235165d(DownloadRequest downloadRequest) {
        if (this.f170826a) {
            AppBrandLogger.m52830i("BaseStreamRunnable", downloadRequest.getFileName(), ">>download success,filesize:", Long.valueOf(downloadRequest.getFileSize()), " path:", mo235161a().getDownloadPath());
            this.f170829d.mo235180d();
            return;
        }
        AppBrandLogger.m52829e("BaseStreamRunnable", downloadRequest.getFileName(), ">>download failed ", " path:", mo235161a().getDownloadPath());
        this.f170829d.mo235175a(mo235161a().getDownloadError().f170701a, mo235161a().getDownloadError().f170702b, false);
    }

    /* renamed from: a */
    public boolean mo235162a(DownloadRequest downloadRequest) {
        AppBrandLogger.m52830i("BaseStreamRunnable", downloadRequest.getFileName(), ">>onPreExecute");
        if (TextUtils.isEmpty(downloadRequest.getDownloadUrl())) {
            AppBrandLogger.m52830i("BaseStreamRunnable", mo235161a().getFileName(), " download url is empty");
            mo235161a().setErrorInfo(AbstractC67767c.C67768a.f170661b);
            return false;
        } else if (TextUtils.isEmpty(downloadRequest.getDownloadPath())) {
            AppBrandLogger.m52830i("BaseStreamRunnable", downloadRequest.getFileName(), " download path is empty");
            mo235161a().setErrorInfo(AbstractC67767c.C67768a.f170662c);
            return false;
        } else if (IOUtils.getAvailSpace(Environment.getDataDirectory().getAbsolutePath()) >= 10485760) {
            return mo235483e(downloadRequest);
        } else {
            AppBrandLogger.m52829e("BaseStreamRunnable", "checkEnvironment,download file delete fail! file is:" + this.f170827b.getAbsolutePath());
            return false;
        }
    }

    /* renamed from: e */
    private boolean mo235483e(DownloadRequest downloadRequest) {
        if (!this.f170828c.exists()) {
            if (!this.f170827b.exists()) {
                File parentFile = this.f170827b.getParentFile();
                if (!parentFile.exists() && !IOUtils.mkdir(parentFile.getAbsolutePath())) {
                    AppBrandLogger.m52829e("BaseStreamRunnable", downloadRequest.getFileName(), ",create parent dir failed");
                    downloadRequest.setErrorInfo(AbstractC67767c.C67768a.f170664e);
                    return false;
                } else if (!IOUtils.createFile(this.f170827b.getAbsolutePath())) {
                    AppBrandLogger.m52829e("BaseStreamRunnable", downloadRequest.getFileName(), ",create file dir failed");
                    downloadRequest.setErrorInfo(AbstractC67767c.C67768a.f170663d);
                    return false;
                }
            } else if (mo235445f()) {
                downloadRequest.setDownloadedSize(this.f170827b.length());
                AppBrandLogger.m52830i("BaseStreamRunnable", "downloading file exist and completeSize:", Long.valueOf(this.f170827b.length()));
                return true;
            } else if (!this.f170827b.delete()) {
                AppBrandLogger.m52829e("BaseStreamRunnable", "checkEnvironment,download file delete fail! file is:" + this.f170827b.getAbsolutePath());
                downloadRequest.setErrorInfo(AbstractC67767c.C67768a.f170666g);
                return false;
            }
        } else if (downloadRequest.verifyHandler != null && mo235161a().verifyHandler.mo235151a(this.f170828c) == 0) {
            AppBrandLogger.m52830i("BaseStreamRunnable", "completeFile exist,and verify success!");
            this.f170826a = true;
            mo235169d();
            return true;
        } else if (!this.f170828c.delete()) {
            AppBrandLogger.m52829e("BaseStreamRunnable", "completeFile delete failed! file is " + this.f170828c.getAbsolutePath());
            downloadRequest.setErrorInfo(AbstractC67767c.C67768a.f170672m);
            return false;
        } else {
            AppBrandLogger.m52830i("BaseStreamRunnable", "completeFile delete success!");
        }
        return true;
    }
}
