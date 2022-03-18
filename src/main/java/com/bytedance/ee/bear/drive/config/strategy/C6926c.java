package com.bytedance.ee.bear.drive.config.strategy;

import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.config.fg.C6923a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.drive.config.strategy.c */
public class C6926c extends C6931h {
    @Override // com.bytedance.ee.bear.drive.config.strategy.C6931h, com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: a */
    public String mo27241a(String str) {
        return str;
    }

    @Override // com.bytedance.ee.bear.drive.config.strategy.C6931h, com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: b */
    public String mo27245b() {
        return "5";
    }

    @Override // com.bytedance.ee.bear.drive.config.strategy.C6931h, com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d
    /* renamed from: a */
    public String mo27240a(AbstractC6946a aVar) {
        String str;
        if (aVar instanceof C7086a) {
            str = ((C7086a) aVar).mo27322a().f19098q;
        } else {
            C13479a.m54775e("PreviewFileDownloadStrategy", "getCacheKey() dataVersion is null");
            str = "";
        }
        return C6880a.m27074a(aVar) + "_" + str;
    }

    public C6926c(AbstractC7095c cVar, ConnectionService connectionService, C6923a aVar) {
        super(cVar, connectionService, aVar);
    }
}
