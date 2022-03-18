package com.bytedance.geckox.p762d.p766b.p768b;

import android.net.Uri;
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
import com.bytedance.pipeline.AbstractC20233b;
import com.bytedance.pipeline.AbstractC20235d;
import java.io.File;

/* renamed from: com.bytedance.geckox.d.b.b.d */
public class C14243d extends AbstractC20235d<Pair<Uri, UpdatePackage>, Pair<AbstractC14208a, UpdatePackage>> {

    /* renamed from: a */
    private C14218d f37460a;

    /* renamed from: b */
    private File f37461b;

    /* renamed from: f */
    private AbstractC14267a f37462f;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.pipeline.AbstractC20235d
    /* renamed from: a */
    public void mo52179a(Object... objArr) {
        super.mo52179a(objArr);
        this.f37460a = (C14218d) objArr[0];
        this.f37461b = (File) objArr[1];
        this.f37462f = (AbstractC14267a) objArr[2];
    }

    /* renamed from: a */
    public Object a_(AbstractC20233b<Pair<AbstractC14208a, UpdatePackage>> bVar, Pair<Uri, UpdatePackage> pair) throws Throwable {
        C14276b.m57604a("gecko-debug-tag", "start download patch zip file, channel:", ((UpdatePackage) pair.second).getChannel(), "pid:" + C14350a.m57806a() + ",thread id:" + C14350a.m57808b());
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String uri = ((Uri) pair.first).toString();
        long length = updatePackage.getPatch().getLength();
        File file = this.f37461b;
        File file2 = new File(file, updatePackage.getAccessKey() + File.separator + updatePackage.getChannel() + File.separator + updatePackage.getVersion() + "--updating");
        file2.mkdirs();
        AbstractC14208a a = C14212a.m57400a(this.f37460a.mo52133a(), new File(file2, "patch.tmp"), length);
        try {
            this.f37460a.mo52143i().mo52250a(uri, length, new C14210b(a, this.f37462f, updatePackage, length));
            try {
                return bVar.proceed(new Pair<>(a, updatePackage));
            } finally {
                a.mo52104e();
            }
        } catch (Throwable th) {
            a.mo52104e();
            throw new DownloadException("download patch zip failed, url:" + uri + ", channel:" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getPatch().getId() + ", caused by:" + th.getMessage(), th);
        }
    }
}
