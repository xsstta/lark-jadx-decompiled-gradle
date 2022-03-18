package com.bytedance.ee.bear.doc.resupdate;

import android.util.Pair;
import com.bytedance.ee.log.C13479a;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p769e.AbstractC14267a;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.doc.resupdate.f */
public abstract class AbstractC5466f extends AbstractC14267a {
    @Override // com.bytedance.geckox.p769e.AbstractC14267a
    /* renamed from: a */
    public void mo21857a() {
        C13479a.m54764b("GeckoUpdateAdapter", "onUpdateFinish: ");
    }

    @Override // com.bytedance.geckox.p769e.AbstractC14267a
    /* renamed from: b */
    public void mo21865b(UpdatePackage updatePackage) {
        C13479a.m54764b("GeckoUpdateAdapter", "onActivateSuccess: ");
    }

    @Override // com.bytedance.geckox.p769e.AbstractC14267a
    /* renamed from: c */
    public void mo21868c(UpdatePackage updatePackage) {
        C13479a.m54764b("GeckoUpdateAdapter", "onDownloadSuccess: ");
    }

    @Override // com.bytedance.geckox.p769e.AbstractC14267a
    /* renamed from: a */
    public void mo21858a(UpdatePackage updatePackage) {
        C13479a.m54764b("GeckoUpdateAdapter", "onUpdateStart: ");
    }

    @Override // com.bytedance.geckox.p769e.AbstractC14267a
    /* renamed from: b */
    public void mo21867b(String str) {
        C13479a.m54764b("GeckoUpdateAdapter", "onClean: ");
    }

    @Override // com.bytedance.geckox.p769e.AbstractC14267a
    /* renamed from: a */
    public void mo21860a(String str) {
        C13479a.m54764b("GeckoUpdateAdapter", "onUpdating: ");
    }

    @Override // com.bytedance.geckox.p769e.AbstractC14267a
    /* renamed from: b */
    public void mo21866b(UpdatePackage updatePackage, Throwable th) {
        C13479a.m54759a("GeckoUpdateAdapter", "onDownloadFail: ", th);
    }

    @Override // com.bytedance.geckox.p769e.AbstractC14267a
    /* renamed from: a */
    public void mo21859a(UpdatePackage updatePackage, Throwable th) {
        C13479a.m54759a("GeckoUpdateAdapter", "onActivateFail: ", th);
    }

    @Override // com.bytedance.geckox.p769e.AbstractC14267a
    /* renamed from: a */
    public void mo21861a(String str, long j) {
        C13479a.m54764b("GeckoUpdateAdapter", "onUpdateSuccess: ");
    }

    @Override // com.bytedance.geckox.p769e.AbstractC14267a
    /* renamed from: a */
    public void mo21862a(String str, Throwable th) {
        C13479a.m54759a("GeckoUpdateAdapter", "onUpdateFailed: ", th);
    }

    @Override // com.bytedance.geckox.p769e.AbstractC14267a
    /* renamed from: a */
    public void mo21863a(Map<String, List<Pair<String, Long>>> map, Throwable th) {
        C13479a.m54759a("GeckoUpdateAdapter", "onCheckServerVersionFail: ", th);
    }

    @Override // com.bytedance.geckox.p769e.AbstractC14267a
    /* renamed from: a */
    public void mo21864a(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
        C13479a.m54764b("GeckoUpdateAdapter", "onCheckServerVersionSuccess: ");
    }
}
