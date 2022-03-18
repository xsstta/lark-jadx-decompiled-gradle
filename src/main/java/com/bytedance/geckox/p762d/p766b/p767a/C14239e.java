package com.bytedance.geckox.p762d.p766b.p767a;

import android.util.Pair;
import com.bytedance.geckox.buffer.AbstractC14208a;
import com.bytedance.geckox.buffer.p760a.C14209a;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.utils.C14357e;
import com.bytedance.geckox.utils.C14376p;
import com.bytedance.pipeline.AbstractC20233b;
import com.bytedance.pipeline.AbstractC20235d;
import com.bytedance.pipeline.exception.DataException;
import java.io.File;

/* renamed from: com.bytedance.geckox.d.b.a.e */
public class C14239e extends AbstractC20235d<Pair<AbstractC14208a, UpdatePackage>, Pair<File, UpdatePackage>> {
    /* renamed from: a */
    public Object a_(AbstractC20233b<Pair<File, UpdatePackage>> bVar, Pair<AbstractC14208a, UpdatePackage> pair) throws Throwable {
        C14276b.m57604a("gecko-debug-tag", "start unzip full zip file, channel:", ((UpdatePackage) pair.second).getChannel());
        AbstractC14208a aVar = (AbstractC14208a) pair.first;
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        File parentFile = aVar.mo52105f().getParentFile();
        try {
            m57501a(0, parentFile, updatePackage, aVar, (DataException) null);
            File file = new File(parentFile, "res");
            C14357e.m57823a(file);
            if (new File(parentFile, updatePackage.getChannel()).renameTo(file)) {
                return bVar.proceed(new Pair<>(aVar.mo52105f(), updatePackage));
            }
            throw new RuntimeException("rename unziped full zip file failed:" + parentFile.getAbsolutePath() + ", dest:" + file.getAbsolutePath() + ", exist?" + file.exists());
        } catch (Exception e) {
            throw new RuntimeException("unzip full zip file failed, channel:" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getFullPackage().getId() + ", dir:" + parentFile.getAbsolutePath() + ", caused by:" + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    private void m57501a(int i, File file, UpdatePackage updatePackage, AbstractC14208a aVar, DataException dataException) throws Exception {
        File file2 = new File(file, updatePackage.getChannel());
        if (file2.exists()) {
            C14357e.m57823a(file2);
        }
        if (i < 2) {
            try {
                aVar.mo52101b(0);
                C14376p.m57861a(new C14209a(aVar), file.getAbsolutePath(), updatePackage.getChannel(), i);
                aVar.mo52095a();
            } catch (DataException e) {
                m57501a(i + 1, file, updatePackage, aVar, e);
            }
        } else {
            C14357e.m57823a(file);
            throw dataException;
        }
    }
}
