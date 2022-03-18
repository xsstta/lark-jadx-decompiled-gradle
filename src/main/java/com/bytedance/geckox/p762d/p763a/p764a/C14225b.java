package com.bytedance.geckox.p762d.p763a.p764a;

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

/* renamed from: com.bytedance.geckox.d.a.a.b */
public class C14225b extends AbstractC20235d<Pair<Uri, UpdatePackage>, Pair<AbstractC14208a, UpdatePackage>> {

    /* renamed from: a */
    private C14218d f37438a;

    /* renamed from: b */
    private Map<String, String> f37439b;

    /* renamed from: f */
    private AbstractC14267a f37440f;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.pipeline.AbstractC20235d
    /* renamed from: a */
    public void mo52179a(Object... objArr) {
        super.mo52179a(objArr);
        this.f37438a = (C14218d) objArr[0];
        this.f37439b = (Map) objArr[1];
        this.f37440f = (AbstractC14267a) objArr[2];
    }

    /* renamed from: a */
    public static String m57477a(UpdatePackage updatePackage, String str) {
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf != -1) {
                String substring = str.substring(lastIndexOf + 1);
                if (!TextUtils.isEmpty(substring)) {
                    return substring;
                }
                throw new RuntimeException("url path illegal, url:" + str);
            }
            throw new RuntimeException("url path illegal, url:" + str);
        }
        throw new RuntimeException("url empty, channel:" + updatePackage.getChannel());
    }

    /* renamed from: a */
    public Object a_(AbstractC20233b<Pair<AbstractC14208a, UpdatePackage>> bVar, Pair<Uri, UpdatePackage> pair) throws Throwable {
        C14276b.m57604a("gecko-debug-tag", "start download full single file channel:", ((UpdatePackage) pair.second).getChannel(), "pid:" + C14350a.m57806a() + ",thread id:" + C14350a.m57808b());
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String uri = ((Uri) pair.first).toString();
        long length = updatePackage.getFullPackage().getLength();
        String accessKey = updatePackage.getAccessKey();
        String a = C14351b.m57814a(this.f37439b, accessKey, updatePackage.getGroupName(), updatePackage.getChannel());
        if (!TextUtils.isEmpty(a)) {
            File file = new File(a, accessKey + File.separator + updatePackage.getChannel() + File.separator + updatePackage.getVersion() + "--updating");
            file.mkdirs();
            StringBuilder sb = new StringBuilder();
            sb.append("res");
            sb.append(File.separator);
            sb.append(m57477a(updatePackage, uri));
            AbstractC14208a a2 = C14212a.m57400a(this.f37438a.mo52133a(), new File(file, sb.toString()), length);
            try {
                this.f37438a.mo52143i().mo52250a(uri, length, new C14210b(a2, this.f37440f, updatePackage, length));
                try {
                    Object proceed = bVar.proceed(new Pair<>(a2, updatePackage));
                    try {
                        a2.mo52104e();
                    } catch (Exception e) {
                        C14276b.m57603a("gecko-debug-tag", "DownloadFullSingleFile-release:", e);
                    }
                    return proceed;
                } catch (Exception e2) {
                    throw e2;
                } catch (Throwable th) {
                    try {
                        a2.mo52104e();
                    } catch (Exception e3) {
                        C14276b.m57603a("gecko-debug-tag", "DownloadFullSingleFile-release:", e3);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                a2.mo52104e();
                throw new DownloadException("download full single file failed! url:" + uri + ", channel:" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getFullPackage().getId() + ", caused by:" + th2.getMessage(), th2);
            }
        } else {
            throw new DownloadException("download full single file failed:can not find the file path for accessKey:" + accessKey, null);
        }
    }
}
