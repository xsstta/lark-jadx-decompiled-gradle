package com.bytedance.ee.bear.drive.loader.download.platform.processor;

import android.webkit.URLUtil;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.drive.biz.plugin.C6535d;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.loader.download.platform.C7079f;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7043e;
import com.bytedance.ee.log.C13479a;

public class PdfStreamingProcessor extends AbsServerTransformProcessor {
    public PdfStreamingProcessor(C7079f fVar) {
        super(fVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.loader.download.platform.processor.AbsServerTransformProcessor
    /* renamed from: a */
    public boolean mo27693a(AbstractC7043e eVar) {
        String c = eVar.mo27605c();
        boolean z = false;
        boolean a = C4211a.m17514a().mo16536a("ccm.drive.pdf_linearized_enable", false);
        boolean b = eVar.mo27604b();
        boolean isNetworkUrl = URLUtil.isNetworkUrl(c);
        boolean b2 = mo27691f().mo27678a().mo27672a().mo27537b();
        boolean g = C6535d.m26242g(C6920b.m27342f().mo27168c());
        C13479a.m54764b("DrivePlatform_Processor", "PdfStreamingProcessor checkReadyResult fgEnable=" + a + " linearized=" + b + " isNetworkUrl=" + isNetworkUrl + " pluginEnable=" + g + " strategyEnable=" + b2);
        if (a && b2 && b && isNetworkUrl && g) {
            z = true;
        }
        if (z) {
            mo27691f().mo27679b().mo27390a(true);
            mo27691f().mo27679b().mo27387a(c);
            mo27691f().mo27679b().mo27385a(eVar.mo27607e());
        }
        return z;
    }
}
