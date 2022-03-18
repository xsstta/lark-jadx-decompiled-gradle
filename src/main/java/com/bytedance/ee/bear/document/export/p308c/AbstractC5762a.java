package com.bytedance.ee.bear.document.export.p308c;

import androidx.lifecycle.AbstractC1142af;
import com.bytedance.ee.bear.contract.export.AbstractC5168a;
import com.bytedance.ee.bear.contract.export.ExportFormatEnum;
import com.bytedance.ee.bear.document.export.p308c.AbstractC5762a.AbstractC5763a;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.document.export.c.a */
public abstract class AbstractC5762a<Delegate extends AbstractC5763a> extends AbstractC1142af {
    protected Delegate delegate;

    /* renamed from: com.bytedance.ee.bear.document.export.c.a$a */
    public interface AbstractC5763a {
        /* renamed from: a */
        void mo23197a(ExportFormatEnum exportFormatEnum, AbstractC5168a aVar);

        /* renamed from: a */
        void mo23198a(String str);

        /* renamed from: b */
        void mo23199b(String str);

        /* renamed from: c */
        void mo23200c();

        /* renamed from: c */
        void mo23201c(String str);
    }

    public void cancelExport() {
        C13479a.m54764b("BaseExportViewModel", "cancelExport");
        Delegate delegate2 = this.delegate;
        if (delegate2 != null) {
            delegate2.mo23200c();
        }
    }

    public void onDestroy() {
        C13479a.m54764b("BaseExportViewModel", "onDestroy");
        cancelExport();
        this.delegate = null;
    }

    public void setDelegate(Delegate delegate2) {
        this.delegate = delegate2;
    }

    public void reportExportCanceled(String str) {
        Delegate delegate2 = this.delegate;
        if (delegate2 != null) {
            delegate2.mo23201c(str);
        }
    }

    public void reportExportFailed(String str) {
        Delegate delegate2 = this.delegate;
        if (delegate2 != null) {
            delegate2.mo23199b(str);
        }
    }

    public void reportExportSuccess(String str) {
        Delegate delegate2 = this.delegate;
        if (delegate2 != null) {
            delegate2.mo23198a(str);
        }
    }

    public void exportDocument(ExportFormatEnum exportFormatEnum, AbstractC5168a aVar) {
        C13479a.m54764b("BaseExportViewModel", "exportDocument, format = " + exportFormatEnum);
        Delegate delegate2 = this.delegate;
        if (delegate2 != null) {
            delegate2.mo23197a(exportFormatEnum, aVar);
        }
    }
}
