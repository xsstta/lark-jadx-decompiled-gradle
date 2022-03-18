package com.bytedance.geckox.p762d.p763a.p765b;

import android.util.Pair;
import com.bytedance.geckox.buffer.AbstractC14208a;
import com.bytedance.geckox.buffer.p760a.C14209a;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.utils.C14363i;
import com.bytedance.pipeline.AbstractC20233b;
import com.bytedance.pipeline.AbstractC20235d;
import java.io.File;

/* renamed from: com.bytedance.geckox.d.a.b.a */
public class C14228a extends AbstractC20235d<Pair<AbstractC14208a, UpdatePackage>, Pair<File, UpdatePackage>> {
    /* renamed from: a */
    public Object a_(AbstractC20233b<Pair<File, UpdatePackage>> bVar, Pair<AbstractC14208a, UpdatePackage> pair) throws Throwable {
        C14276b.m57604a("gecko-debug-tag", "start check merged single file, channel:", ((UpdatePackage) pair.second).getChannel());
        AbstractC14208a aVar = (AbstractC14208a) pair.first;
        aVar.mo52101b(0);
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        try {
            C14363i.m57837a(new C14209a(aVar), updatePackage.getFullPackage().getMd5());
            return bVar.proceed(new Pair<>(aVar.mo52105f(), updatePackage));
        } catch (Throwable th) {
            throw new RuntimeException("check merged single file failed, channel：" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getPatch().getId() + ", caused by:" + th.getMessage(), th);
        }
    }
}
