package com.bytedance.geckox.p762d;

import android.text.TextUtils;
import com.bytedance.geckox.meta.MetaDataManager;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p757a.C14201c;
import com.bytedance.geckox.p769e.AbstractC14267a;
import com.bytedance.geckox.p769e.C14269c;
import com.bytedance.geckox.p770f.C14271a;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.utils.C14351b;
import com.bytedance.geckox.utils.C14357e;
import com.bytedance.geckox.utils.C14367l;
import com.bytedance.pipeline.AbstractC20233b;
import com.bytedance.pipeline.AbstractC20235d;
import java.io.File;
import java.util.Map;

/* renamed from: com.bytedance.geckox.d.l */
public class C14258l extends AbstractC20235d<UpdatePackage, UpdatePackage> {

    /* renamed from: a */
    private Map<String, String> f37499a;

    /* renamed from: b */
    private AbstractC14267a f37500b;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.pipeline.AbstractC20235d
    /* renamed from: a */
    public void mo52179a(Object... objArr) {
        super.mo52179a(objArr);
        this.f37499a = (Map) objArr[0];
        this.f37500b = (AbstractC14267a) objArr[1];
    }

    /* renamed from: a */
    public Object a_(AbstractC20233b<UpdatePackage> bVar, UpdatePackage updatePackage) throws Throwable {
        long j;
        String accessKey = updatePackage.getAccessKey();
        String groupName = updatePackage.getGroupName();
        String channel = updatePackage.getChannel();
        String a = C14351b.m57814a(this.f37499a, accessKey, groupName, channel);
        if (!TextUtils.isEmpty(a)) {
            File file = new File(a, accessKey);
            File file2 = new File(file, updatePackage.getChannel());
            if (file2.isFile()) {
                C14357e.m57823a(file2);
            }
            boolean mkdirs = file2.mkdirs();
            if (mkdirs) {
                MetaDataManager.f37560a.mo52264a(accessKey, channel, System.currentTimeMillis());
            }
            if (mkdirs || file2.isDirectory()) {
                C14271a aVar = null;
                try {
                    aVar = C14271a.m57593a(file2.getAbsolutePath() + File.separator + "update.lock");
                    File file3 = new File(a);
                    Long c = C14367l.m57848c(file3, accessKey, channel);
                    if (c == null) {
                        j = 0;
                    } else {
                        j = c.longValue();
                    }
                    updatePackage.setLocalVersion(j);
                    if (aVar == null) {
                        AbstractC14267a aVar2 = this.f37500b;
                        if (aVar2 != null) {
                            aVar2.mo21860a(channel);
                            C14269c.m57588a().mo52242a(accessKey, channel, this.f37500b);
                        }
                        throw new RuntimeException("current channel is updating");
                    } else if (j == updatePackage.getVersion()) {
                        if (this.f37500b != null) {
                            LocalPackageModel localPackageModel = new LocalPackageModel(accessKey, channel);
                            localPackageModel.setLatestVersion(c.longValue());
                            localPackageModel.setChannelPath(C14367l.m57847b(file3, accessKey, channel, c.longValue()));
                            this.f37500b.mo52237a(localPackageModel);
                        }
                        throw new RuntimeException("current channel is the newest");
                    } else {
                        if (!(updatePackage.getContent() == null || updatePackage.getContent().getStrategy() == null || updatePackage.getContent().getStrategy().getDeleteOldPackageBeforeDownload() != 1)) {
                            C14276b.m57604a("gecko-debug-tag", "del_old_pkg_before_download");
                            C14201c.m57329a(new File(file, channel));
                        }
                        return bVar.proceed(updatePackage);
                    }
                } finally {
                    if (aVar != null) {
                        aVar.mo52245a();
                    }
                }
            } else {
                C14276b.m57604a("gecko-debug-tag", "can not create channel dir：", file2.getAbsolutePath());
                throw new RuntimeException("can not create channel dir:" + file2.getAbsolutePath());
            }
        } else {
            C14276b.m57604a("gecko-debug-tag", "pre download failed:can not find the file path for accessKey:" + accessKey);
            throw new RuntimeException("pre download failed:can not find the file path for accessKey:" + accessKey);
        }
    }
}
