package com.ss.android.ugc.effectmanager.p3042a;

import android.content.res.AssetManager;
import com.ss.android.ugc.effectmanager.common.C60512d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.effectmanager.a.a */
public final class C60467a {

    /* renamed from: a */
    private final AssetManager f151115a;

    /* renamed from: b */
    private final Pattern f151116b;

    /* renamed from: a */
    public AssetManager mo207013a() {
        return this.f151115a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000d, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo207015b(java.lang.String r1) {
        /*
            r0 = this;
            java.io.InputStream r1 = r0.mo207014a(r1)     // Catch:{ IOException -> 0x000d, all -> 0x000b }
            if (r1 == 0) goto L_0x0009
            r1.close()     // Catch:{ IOException -> 0x0009 }
        L_0x0009:
            r1 = 1
            return r1
        L_0x000b:
            r1 = move-exception
            throw r1
        L_0x000d:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.p3042a.C60467a.mo207015b(java.lang.String):boolean");
    }

    /* renamed from: a */
    public InputStream mo207014a(String str) throws IOException {
        String a = C60512d.m235165a(str);
        Pattern pattern = this.f151116b;
        if (pattern == null || !pattern.matcher(a).matches()) {
            return this.f151115a.open(str, 2);
        }
        throw new FileNotFoundException(str + " manually excluded by DownloadableModelSupport.exclusionPattern");
    }

    public C60467a(AssetManager assetManager, Pattern pattern) {
        this.f151115a = assetManager;
        this.f151116b = pattern;
    }
}
