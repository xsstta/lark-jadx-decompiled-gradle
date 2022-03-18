package com.bytedance.geckox.p762d.p766b.p768b;

import android.util.Pair;
import com.bytedance.geckox.C14218d;
import com.bytedance.geckox.buffer.AbstractC14208a;
import com.bytedance.geckox.buffer.impl.C14212a;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.utils.BsPatch;
import com.bytedance.geckox.utils.C14357e;
import com.bytedance.pipeline.AbstractC20233b;
import com.bytedance.pipeline.AbstractC20235d;
import java.io.File;

/* renamed from: com.bytedance.geckox.d.b.b.e */
public class C14244e extends AbstractC20235d<Pair<AbstractC14208a, UpdatePackage>, Pair<AbstractC14208a, UpdatePackage>> {

    /* renamed from: a */
    private C14218d f37463a;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.pipeline.AbstractC20235d
    /* renamed from: a */
    public void mo52179a(Object... objArr) {
        super.mo52179a(objArr);
        this.f37463a = (C14218d) objArr[0];
    }

    /* renamed from: a */
    public Object a_(AbstractC20233b<Pair<AbstractC14208a, UpdatePackage>> bVar, Pair<AbstractC14208a, UpdatePackage> pair) throws Throwable {
        C14276b.m57604a("gecko-debug-tag", "start merge patch zip file, channel:", ((UpdatePackage) pair.second).getChannel());
        AbstractC14208a aVar = (AbstractC14208a) pair.first;
        File f = aVar.mo52105f();
        aVar.mo52095a();
        aVar.mo52104e();
        File parentFile = f.getParentFile().getParentFile();
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        File file = new File(parentFile, updatePackage.getLocalVersion() + File.separator + "res.zip");
        File file2 = new File(f.getParentFile(), "res.zip");
        C14357e.m57823a(file2);
        try {
            BsPatch.m57798a(file, f, file2.getParentFile(), file2.getName());
            C14357e.m57823a(f);
            AbstractC14208a a = C14212a.m57400a(this.f37463a.mo52133a(), file2, file2.length());
            try {
                return bVar.proceed(new Pair<>(a, updatePackage));
            } finally {
                a.mo52104e();
            }
        } catch (Exception e) {
            throw new RuntimeException("merged patch zip file failed, channel：" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getPatch().getId() + ", caused by:" + e.getMessage(), e);
        } catch (Throwable th) {
            C14357e.m57823a(f);
            throw th;
        }
    }
}
