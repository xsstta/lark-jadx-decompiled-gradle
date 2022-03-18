package com.bytedance.ee.bear.document.export.net;

import android.content.Context;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.export.AbstractC5168a;
import com.bytedance.ee.bear.contract.export.ExportFormatEnum;
import com.bytedance.ee.bear.document.export.net.exportV2.DocumentExportExecutorImplV2;
import io.reactivex.disposables.Disposable;

/* renamed from: com.bytedance.ee.bear.document.export.net.b */
public interface AbstractC5772b {
    /* renamed from: a */
    Disposable mo23221a(ExportFormatEnum exportFormatEnum, String str, String str2, AbstractC5168a aVar);

    /* renamed from: a */
    void mo23222a();

    /* renamed from: com.bytedance.ee.bear.document.export.net.b$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: a */
        public static AbstractC5772b m23308a(Context context, String str) {
            if (C4211a.m17514a().mo16536a("ccm.suite.export_replace_api_enabled", false)) {
                return new DocumentExportExecutorImplV2(context, str);
            }
            return new C5773c(context, str);
        }
    }
}
