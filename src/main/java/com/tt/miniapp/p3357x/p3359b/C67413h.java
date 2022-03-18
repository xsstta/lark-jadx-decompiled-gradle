package com.tt.miniapp.p3357x.p3359b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.dependency.DependencyMgr;
import java.io.File;

/* renamed from: com.tt.miniapp.x.b.h */
public class C67413h extends AbstractC67405a {

    /* renamed from: b */
    private String[] f170013b = {"tt1a1e6ca38534a23c", "tt7a180ca5e532c238", "ttec4d9af07367551a"};

    public C67413h(Context context) {
        this.f170004a = m262292a(context);
    }

    /* renamed from: a */
    private File m262292a(Context context) {
        String b = DependencyMgr.m52809a().mo48300b();
        String str = "appbrand";
        if (!TextUtils.isEmpty(b)) {
            str = str + File.separator + b;
        }
        File file = new File(context.getFilesDir(), str);
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }
}
