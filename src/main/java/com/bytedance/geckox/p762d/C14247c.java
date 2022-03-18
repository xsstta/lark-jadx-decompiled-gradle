package com.bytedance.geckox.p762d;

import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.pipeline.AbstractC20233b;
import com.bytedance.pipeline.AbstractC20245j;
import java.util.List;

/* renamed from: com.bytedance.geckox.d.c */
public class C14247c extends AbstractC20245j<UpdatePackage, UpdatePackage> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo52204a(AbstractC20233b<UpdatePackage> bVar, UpdatePackage updatePackage) {
        UpdatePackage.Package patch = updatePackage.getPatch();
        if (patch == null) {
            C14276b.m57604a("gecko-debug-tag", "start full update, channel:", updatePackage.getChannel());
            return "full";
        }
        List<String> urlList = patch.getUrlList();
        if (urlList == null || urlList.isEmpty()) {
            C14276b.m57604a("gecko-debug-tag", "start full update, channel:", updatePackage.getChannel());
            return "full";
        }
        C14276b.m57604a("gecko-debug-tag", "start full update, channel:", updatePackage.getChannel());
        return "patch";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo52205a(AbstractC20233b<UpdatePackage> bVar, UpdatePackage updatePackage, Throwable th, String str) {
        if ("patch".equals(str)) {
            C14276b.m57604a("gecko-debug-tag", "start full update, channel:", updatePackage.getChannel());
            return "full";
        }
        throw new RuntimeException("full update failed, caused by:" + th.getMessage(), th);
    }
}
