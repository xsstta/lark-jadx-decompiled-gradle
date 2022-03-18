package com.bytedance.geckox.p762d.p766b.p767a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.statistic.C14343e;
import com.bytedance.geckox.statistic.model.EventMessageModel;
import com.bytedance.geckox.utils.C14357e;
import com.bytedance.pipeline.AbstractC20233b;
import com.bytedance.pipeline.AbstractC20235d;
import java.io.File;

/* renamed from: com.bytedance.geckox.d.b.a.d */
public class C14238d extends AbstractC20235d<Pair<File, UpdatePackage>, Pair<UpdatePackage, Long>> {
    /* renamed from: a */
    public Object a_(AbstractC20233b<Pair<UpdatePackage, Long>> bVar, Pair<File, UpdatePackage> pair) throws Throwable {
        C14276b.m57604a("gecko-debug-tag", "start active full zip file, channel:", ((UpdatePackage) pair.second).getChannel());
        File parentFile = ((File) pair.first).getParentFile();
        long version = ((UpdatePackage) pair.second).getVersion();
        File parentFile2 = parentFile.getParentFile();
        File file = new File(parentFile2, version + "");
        C14357e.m57823a(file);
        if (parentFile.renameTo(file)) {
            try {
                return bVar.proceed(new Pair<>(pair.second, Long.valueOf(version)));
            } finally {
                String d = C14357e.m57826d(new File(file, "res"));
                if (!TextUtils.isEmpty(d)) {
                    EventMessageModel eventMessageModel = new EventMessageModel();
                    eventMessageModel.setEventType(3);
                    eventMessageModel.setSubType(32);
                    eventMessageModel.setErrMsg("active full zip file,size 0 file path:" + d);
                    eventMessageModel.setExtra(((UpdatePackage) pair.second).getAccessKey());
                    C14343e.m57790a(eventMessageModel);
                }
            }
        } else {
            throw new RuntimeException("active full zip file failed:" + parentFile.getAbsolutePath());
        }
    }
}
