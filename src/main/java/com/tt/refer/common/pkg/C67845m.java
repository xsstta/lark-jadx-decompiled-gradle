package com.tt.refer.common.pkg;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.ttapkgdecoder.TTAPkgFile;
import com.tt.miniapp.ttapkgdecoder.TTAPkgInfo;
import com.tt.miniapp.ttapkgdecoder.p3334b.C66984e;
import com.tt.miniapp.ttapkgdecoder.utils.C66987b;
import com.tt.miniapp.ttapkgdecoder.utils.DecodeException;
import com.tt.refer.common.download.engine.model.DownloadRequest;
import com.tt.refer.common.download.engine.p3421c.p3422a.AbstractC67767c;
import com.tt.refer.common.pkg.C67834k;
import com.tt.refer.common.pkg.p3425b.C67823a;
import java.io.File;
import java.util.List;

/* renamed from: com.tt.refer.common.pkg.m */
public class C67845m extends AbstractC67819a implements C66987b.AbstractC66989a {

    /* renamed from: b */
    private AbstractC67828f f170899b = new C67833j();

    /* renamed from: c */
    private IAppContext f170900c;

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.pkg.AbstractC67819a
    /* renamed from: h */
    public AbstractC67822b mo235429h() {
        return new C67847a(this);
    }

    @Override // com.tt.miniapp.ttapkgdecoder.utils.C66987b.AbstractC66989a
    /* renamed from: a */
    public void mo233022a(long j) {
        DownloadRequest downloadRequest = (DownloadRequest) mo235172a();
        downloadRequest.setDownloadedSize(j);
        mo235177b(downloadRequest.getDownloadedSize());
    }

    /* renamed from: a */
    public int mo235482a(final DownloadRequest downloadRequest) {
        final C67823a aVar = new C67823a(new File(downloadRequest.getDownloadingPath()), this.f170900c);
        C66984e eVar = new C66984e(downloadRequest.getDownloadUrl(), aVar);
        eVar.mo233018a(this);
        int a = this.f170899b.mo235446a(eVar, new C67834k.C67841a(this.f170900c, null, new File(downloadRequest.getDownloadingPath())) {
            /* class com.tt.refer.common.pkg.C67845m.C678461 */

            @Override // com.tt.refer.common.pkg.AbstractC67828f.AbstractC67829a, com.tt.refer.common.pkg.C67834k.C67841a
            /* renamed from: a */
            public void mo235451a(TTAPkgInfo tTAPkgInfo) {
                super.mo235451a(tTAPkgInfo);
                AppBrandLogger.m52830i("app_start_load_pkg_mgr_stream_decode_task", "startStreamDecoder>>>onDecodeFinish>>>.... fileName:", downloadRequest.getFileName());
                aVar.mo233010d();
            }

            @Override // com.tt.refer.common.pkg.AbstractC67828f.AbstractC67829a, com.tt.refer.common.pkg.C67834k.C67841a
            /* renamed from: a */
            public void mo235447a(int i, TTAPkgInfo tTAPkgInfo) throws DecodeException {
                TTAPkgFile tTAPkgFile;
                super.mo235447a(i, tTAPkgInfo);
                AppBrandLogger.m52830i("app_start_load_pkg_mgr_stream_decode_task", ">>>onLoadHeader>>>notifyReady....");
                C67845m.this.mo235181e();
                long j = 0;
                if (downloadRequest.getFileSize() < 0) {
                    List<TTAPkgFile> files = tTAPkgInfo.getFiles();
                    int size = files.size();
                    if (size > 0 && (tTAPkgFile = files.get(size - 1)) != null) {
                        j = (long) (tTAPkgFile.getSize() + tTAPkgFile.getOffset());
                    }
                    downloadRequest.setFileSize(j);
                }
            }
        });
        AppBrandLogger.m52830i("app_start_load_pkg_mgr_stream_decode_task", "startStreamDecoder>>>decodeResult:", Integer.valueOf(a));
        return a;
    }

    /* renamed from: com.tt.refer.common.pkg.m$a */
    class C67847a extends AbstractC67822b {
        /* access modifiers changed from: protected */
        @Override // com.tt.refer.common.pkg.AbstractC67822b
        /* renamed from: f */
        public boolean mo235445f() {
            return false;
        }

        /* renamed from: e */
        public boolean mo235164c(DownloadRequest downloadRequest) {
            boolean z;
            AppBrandLogger.m52830i("app_start_load_pkg_mgr_stream_decode_task", mo235161a().getFileName(), ">>onRepeatExecute:", downloadRequest);
            try {
                downloadRequest.clearErrorInfo();
                int a = C67845m.this.mo235482a(downloadRequest);
                if (a == 0) {
                    if (!this.f170827b.renameTo(this.f170828c)) {
                        mo235161a().setErrorInfo(AbstractC67767c.C67768a.f170671l);
                        AppBrandLogger.m52829e("app_start_load_pkg_mgr_stream_decode_task", "downloading file rename complete file failed!", downloadRequest.getFileName(), "errorCode:", AbstractC67767c.C67768a.f170671l.mo235193b());
                        this.f170826a = false;
                    } else if (downloadRequest.verifyHandler != null) {
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
                DownloadRequest e2 = mo235161a();
                e2.setErrorInfo(a + "", "startStreamDecoder decode failed! ");
                AppBrandLogger.m52829e("app_start_load_pkg_mgr_stream_decode_task", "startStreamDecoder decode failed! ", downloadRequest.getFileName(), "errorCode:", Integer.valueOf(a));
                this.f170826a = false;
                return false;
            } catch (Exception e3) {
                AppBrandLogger.m52829e("app_start_load_pkg_mgr_stream_decode_task", "onRepeatExecute>>", e3.getMessage());
                DownloadRequest e4 = mo235161a();
                String b2 = AbstractC67767c.C67768a.f170669j.mo235193b();
                e4.setErrorInfo(b2, AbstractC67767c.C67768a.f170669j.mo235192a() + e3.getMessage());
                if (this.f170827b.exists()) {
                    this.f170827b.delete();
                }
                return false;
            }
        }

        protected C67847a(AbstractC67819a aVar) {
            super(aVar);
        }
    }

    public C67845m(DownloadRequest downloadRequest, IAppContext iAppContext) {
        super(downloadRequest);
        this.f170900c = iAppContext;
    }
}
