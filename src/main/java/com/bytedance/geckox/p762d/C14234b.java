package com.bytedance.geckox.p762d;

import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.pipeline.AbstractC20230a;
import com.bytedance.pipeline.AbstractC20233b;

/* renamed from: com.bytedance.geckox.d.b */
public class C14234b extends AbstractC20230a<UpdatePackage, UpdatePackage> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo52189a(AbstractC20233b<UpdatePackage> bVar, UpdatePackage updatePackage) {
        int packageType = updatePackage.getPackageType();
        if (packageType == 0) {
            return "branch_zip";
        }
        if (packageType == 1) {
            return "branch_single_file";
        }
        throw new RuntimeException("unknow file type: " + packageType);
    }
}
