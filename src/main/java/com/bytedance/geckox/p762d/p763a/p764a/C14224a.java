package com.bytedance.geckox.p762d.p763a.p764a;

import android.util.Pair;
import com.bytedance.geckox.buffer.AbstractC14208a;
import com.bytedance.geckox.buffer.p760a.C14209a;
import com.bytedance.geckox.exception.MD5Exception;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.utils.C14363i;
import com.bytedance.pipeline.AbstractC20233b;
import com.bytedance.pipeline.AbstractC20235d;
import java.io.File;

/* renamed from: com.bytedance.geckox.d.a.a.a */
public class C14224a extends AbstractC20235d<Pair<AbstractC14208a, UpdatePackage>, Pair<File, UpdatePackage>> {
    /* renamed from: a */
    public Object a_(AbstractC20233b<Pair<File, UpdatePackage>> bVar, Pair<AbstractC14208a, UpdatePackage> pair) throws Throwable {
        C14276b.m57604a("gecko-debug-tag", "start check full single file channel:", ((UpdatePackage) pair.second).getChannel());
        AbstractC14208a aVar = (AbstractC14208a) pair.first;
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        aVar.mo52101b(0);
        try {
            C14363i.m57837a(new C14209a(aVar), updatePackage.getFullPackage().getMd5());
            aVar.mo52095a();
            return bVar.proceed(new Pair<>(aVar.mo52105f(), updatePackage));
        } catch (Throwable th) {
            throw new MD5Exception("check full single file failed, channel:" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getFullPackage().getId() + ", caused by:" + th.getMessage(), th);
        }
    }
}
