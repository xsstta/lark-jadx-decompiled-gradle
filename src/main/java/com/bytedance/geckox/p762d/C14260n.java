package com.bytedance.geckox.p762d;

import android.net.Uri;
import android.util.Pair;
import com.bytedance.geckox.exception.DownloadException;
import com.bytedance.geckox.exception.MD5Exception;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.pipeline.AbstractC20246k;
import java.util.List;

/* renamed from: com.bytedance.geckox.d.n */
public class C14260n extends AbstractC20246k<UpdatePackage, Pair<Uri, UpdatePackage>> {

    /* renamed from: a */
    private int f37503a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Pair<Uri, UpdatePackage> mo52218b() {
        UpdatePackage updatePackage = (UpdatePackage) mo68511h();
        List<String> urlList = updatePackage.getFullPackage().getUrlList();
        int i = this.f37503a;
        this.f37503a = i + 1;
        return new Pair<>(Uri.parse(urlList.get(i)), updatePackage);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.pipeline.AbstractC20246k
    /* renamed from: a */
    public boolean mo52217a(Throwable th) {
        C14276b.m57603a("gecko-debug-tag", "full update failed and retry", th);
        if (this.f37503a >= ((UpdatePackage) mo68511h()).getFullPackage().getUrlList().size()) {
            return false;
        }
        if ((th instanceof DownloadException) || (th instanceof MD5Exception)) {
            return true;
        }
        return false;
    }
}
