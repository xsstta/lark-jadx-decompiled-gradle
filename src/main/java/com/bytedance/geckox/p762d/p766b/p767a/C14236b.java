package com.bytedance.geckox.p762d.p766b.p767a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.C14218d;
import com.bytedance.geckox.buffer.AbstractC14208a;
import com.bytedance.geckox.buffer.impl.C14212a;
import com.bytedance.geckox.buffer.p760a.C14210b;
import com.bytedance.geckox.exception.DownloadException;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p769e.AbstractC14267a;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.utils.C14350a;
import com.bytedance.geckox.utils.C14351b;
import com.bytedance.pipeline.AbstractC20233b;
import com.bytedance.pipeline.AbstractC20235d;
import java.io.File;
import java.util.Map;

/* renamed from: com.bytedance.geckox.d.b.a.b */
public class C14236b extends AbstractC20235d<Pair<Uri, UpdatePackage>, Pair<AbstractC14208a, UpdatePackage>> {

    /* renamed from: a */
    private C14218d f37451a;

    /* renamed from: b */
    private Map<String, String> f37452b;

    /* renamed from: f */
    private AbstractC14267a f37453f;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.pipeline.AbstractC20235d
    /* renamed from: a */
    public void mo52179a(Object... objArr) {
        super.mo52179a(objArr);
        this.f37451a = (C14218d) objArr[0];
        this.f37452b = (Map) objArr[1];
        this.f37453f = (AbstractC14267a) objArr[2];
    }

    /* renamed from: a */
    public Object a_(AbstractC20233b<Pair<AbstractC14208a, UpdatePackage>> bVar, Pair<Uri, UpdatePackage> pair) throws Throwable {
        C14276b.m57604a("gecko-debug-tag", "start download full zip file, channel:", ((UpdatePackage) pair.second).getChannel(), "pid:" + C14350a.m57806a() + ",thread id:" + C14350a.m57808b());
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String uri = ((Uri) pair.first).toString();
        long length = updatePackage.getFullPackage().getLength();
        String accessKey = updatePackage.getAccessKey();
        String a = C14351b.m57814a(this.f37452b, accessKey, updatePackage.getGroupName(), updatePackage.getChannel());
        if (!TextUtils.isEmpty(a)) {
            File file = new File(a, accessKey + File.separator + updatePackage.getChannel() + File.separator + updatePackage.getVersion() + "--updating");
            file.mkdirs();
            AbstractC14208a a2 = C14212a.m57400a(this.f37451a.mo52133a(), new File(file, "res.zip"), length);
            try {
                this.f37451a.mo52143i().mo52250a(uri, length, new C14210b(a2, this.f37453f, updatePackage, length));
                try {
                    return bVar.proceed(new Pair<>(a2, updatePackage));
                } finally {
                    a2.mo52104e();
                }
            } catch (Throwable th) {
                a2.mo52104e();
                throw new DownloadException("download full zip file failed, url:" + uri + ", channel:" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getFullPackage().getId() + ", caused by:" + th.getMessage(), th);
            }
        } else {
            throw new DownloadException("download full zip file failed:can not find the file path for accessKey:" + accessKey, null);
        }
    }
}
