package com.bytedance.geckox.p762d;

import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p757a.C14201c;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.pipeline.AbstractC20233b;
import com.bytedance.pipeline.AbstractC20235d;
import java.io.File;
import java.util.Map;

/* renamed from: com.bytedance.geckox.d.p */
public class C14262p extends AbstractC20235d<Pair<UpdatePackage, Long>, Pair<UpdatePackage, Long>> {

    /* renamed from: a */
    private Map<String, String> f37505a;

    /* renamed from: b */
    private File f37506b;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.pipeline.AbstractC20235d
    /* renamed from: a */
    public void mo52179a(Object... objArr) {
        super.mo52179a(objArr);
        this.f37506b = (File) objArr[0];
        this.f37505a = (Map) objArr[1];
    }

    /* renamed from: a */
    public Object a_(AbstractC20233b<Pair<UpdatePackage, Long>> bVar, Pair<UpdatePackage, Long> pair) throws Throwable {
        C14276b.m57604a("gecko-debug-tag", "update success:", pair);
        try {
            return bVar.proceed(pair);
        } finally {
            File file = this.f37506b;
            UpdatePackage updatePackage = (UpdatePackage) pair.first;
            String accessKey = updatePackage.getAccessKey();
            String channel = updatePackage.getChannel();
            if (file == null && this.f37505a != null) {
                file = new File(this.f37505a.get(accessKey));
            }
            if (file != null) {
                C14201c.m57331a(new File(new File(file, accessKey), channel).getAbsolutePath(), (Long) pair.second, false);
            }
        }
    }
}
