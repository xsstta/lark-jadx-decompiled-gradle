package com.tt.refer.common.pkg;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.ttapkgdecoder.TTAPkgFile;
import com.tt.miniapp.ttapkgdecoder.TTAPkgInfo;
import com.tt.miniapp.ttapkgdecoder.p3334b.AbstractC66982c;
import com.tt.miniapp.ttapkgdecoder.utils.DecodeException;
import com.tt.refer.common.pkg.AbstractC67828f;
import java.io.IOException;
import java.util.List;

/* renamed from: com.tt.refer.common.pkg.i */
public class C67832i {

    /* renamed from: a */
    private static final CharSequence f170847a = "TPKG";

    /* renamed from: b */
    private final AbstractC66982c f170848b;

    /* renamed from: c */
    private boolean f170849c;

    /* renamed from: d */
    private TTAPkgInfo f170850d;

    /* renamed from: e */
    private int f170851e;

    /* renamed from: f */
    private long f170852f;

    /* renamed from: c */
    public boolean mo235458c() {
        return this.f170849c;
    }

    /* renamed from: d */
    public long mo235459d() {
        return this.f170852f;
    }

    /* renamed from: f */
    public int mo235461f() throws IOException {
        int a = this.f170848b.mo233011a();
        this.f170852f += 4;
        return a;
    }

    /* renamed from: b */
    public void mo235457b() {
        if (!this.f170849c) {
            this.f170848b.mo233017c();
            this.f170849c = true;
            AppBrandLogger.m52828d("PkgReader", "TTAPkgReader is release");
        }
    }

    /* renamed from: a */
    public boolean mo235456a() throws IOException {
        String a = this.f170848b.mo233012a(4);
        this.f170852f += 4;
        AppBrandLogger.m52828d("PkgReader", "checkMagicString");
        return TextUtils.equals(a, f170847a);
    }

    /* renamed from: e */
    public TTAPkgInfo mo235460e() throws IOException {
        TTAPkgInfo tTAPkgInfo = this.f170850d;
        if (tTAPkgInfo != null) {
            return tTAPkgInfo;
        }
        int a = this.f170848b.mo233011a();
        this.f170852f += 4;
        byte[] bArr = new byte[a];
        this.f170848b.mo233014a(bArr);
        this.f170852f += (long) a;
        int a2 = this.f170848b.mo233011a();
        this.f170852f += 4;
        TTAPkgInfo tTAPkgInfo2 = new TTAPkgInfo(bArr);
        for (int i = 0; i < a2; i++) {
            int a3 = this.f170848b.mo233011a();
            this.f170852f += 4;
            long j = (long) a3;
            String a4 = this.f170848b.mo233012a(j);
            this.f170852f += j;
            int a5 = this.f170848b.mo233011a();
            this.f170852f += 4;
            int a6 = this.f170848b.mo233011a();
            this.f170852f += 4;
            tTAPkgInfo2.addFile(new TTAPkgFile(a4, a5, a6));
        }
        AppBrandLogger.m52828d("PkgReader", "readTTPkgInfo success");
        this.f170850d = tTAPkgInfo2;
        return tTAPkgInfo2;
    }

    public C67832i(AbstractC66982c cVar) throws DecodeException {
        this.f170848b = cVar;
        cVar.mo233015b();
    }

    /* renamed from: a */
    public Pair<TTAPkgFile, byte[]> mo235455a(AbstractC67828f.AbstractC67829a aVar) throws IOException {
        byte[] bArr;
        TTAPkgInfo tTAPkgInfo = this.f170850d;
        TTAPkgFile tTAPkgFile = null;
        if (tTAPkgInfo != null) {
            List<TTAPkgFile> files = tTAPkgInfo.getFiles();
            int size = files.size();
            int i = this.f170851e;
            if (i >= size) {
                return null;
            }
            tTAPkgFile = files.get(i);
            int i2 = 0;
            if (this.f170852f != ((long) tTAPkgFile.getOffset())) {
                AppBrandLogger.m52829e("PkgReader", "invalid offset, file name = " + tTAPkgFile.getFileName());
                throw new DecodeException(-6);
            } else if (aVar != null) {
                int size2 = tTAPkgFile.getSize();
                byte[] bArr2 = new byte[size2];
                aVar.mo235452b(tTAPkgFile, bArr2);
                while (i2 < size2) {
                    int a = this.f170848b.mo233013a(bArr2, i2, size2 - i2);
                    aVar.mo235450a(tTAPkgFile, bArr2, i2, a);
                    i2 += a;
                }
                this.f170852f += (long) size2;
                this.f170851e++;
                bArr = bArr2;
            } else {
                bArr = new byte[tTAPkgFile.getSize()];
                this.f170848b.mo233014a(bArr);
                this.f170852f += (long) tTAPkgFile.getSize();
                this.f170851e++;
            }
        } else {
            bArr = null;
        }
        return new Pair<>(tTAPkgFile, bArr);
    }
}
