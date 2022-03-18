package com.tt.refer.common.pkg;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapphost.C67554l;
import com.tt.refer.common.download.engine.model.DownloadRequest;
import com.tt.refer.common.download.engine.p3421c.AbstractC67762a;

/* renamed from: com.tt.refer.common.pkg.a */
public abstract class AbstractC67819a extends AbstractC67762a<DownloadRequest> {

    /* renamed from: a */
    protected volatile AbstractC67822b f170825a;

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract AbstractC67822b mo235429h();

    /* renamed from: i */
    public boolean mo235430i() {
        if (this.f170825a == null || !this.f170825a.mo235168c()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.download.engine.p3421c.AbstractC67762a
    /* renamed from: g */
    public boolean mo235183g() {
        AppBrandLogger.m52830i("BaseStreamFileTask", ((DownloadRequest) mo235172a()).getFileName(), ">>onEndSuccess");
        this.f170825a = null;
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.download.engine.p3421c.AbstractC67762a
    /* renamed from: f */
    public boolean mo235182f() {
        AppBrandLogger.m52830i("BaseStreamFileTask", ((DownloadRequest) mo235172a()).getFileName(), ">>onStart");
        if (this.f170825a != null) {
            return false;
        }
        this.f170825a = mo235429h();
        C67554l.m262725b().execute(this.f170825a);
        return true;
    }

    public AbstractC67819a(DownloadRequest downloadRequest) {
        super(downloadRequest);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.download.engine.p3421c.AbstractC67762a
    /* renamed from: b */
    public boolean mo235178b(String str, String str2, boolean z) {
        AppBrandLogger.m52830i("BaseStreamFileTask", ((DownloadRequest) mo235172a()).getFileName(), ">>onEndError");
        this.f170825a = null;
        ((DownloadRequest) mo235172a()).setErrorInfo(str, str2);
        AppBrandLogger.m52830i("BaseStreamFileTask", "errorCode = ", str, "errorMsg=", str2);
        return true;
    }
}
