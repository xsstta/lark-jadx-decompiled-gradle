package com.ss.android.lark.image.impl.p1962b;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.utils.C57881t;
import java.io.File;

/* renamed from: com.ss.android.lark.image.impl.b.b */
class C38848b {

    /* renamed from: a */
    private final Context f99820a;

    /* renamed from: b */
    private String f99821b;

    /* renamed from: a */
    private void m153350a() {
        if (TextUtils.isEmpty(this.f99821b)) {
            this.f99821b = C57881t.m224607F(this.f99820a);
        } else {
            C26311p.m95289i(this.f99821b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public File mo142347b(String str) {
        return new File(this.f99821b, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public File mo142346a(String str) {
        File file = new File(this.f99821b, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    C38848b(Context context, String str) {
        this.f99820a = context;
        this.f99821b = str;
        m153350a();
    }
}
