package com.tt.miniapp.p3357x.p3359b;

import android.content.Context;
import java.io.File;

/* renamed from: com.tt.miniapp.x.b.e */
public class C67409e extends AbstractC67405a {
    public C67409e(Context context) {
        this.f170004a = m262283a(context);
    }

    /* renamed from: a */
    private File m262283a(Context context) {
        File file = new File(context.getFilesDir(), "pkg");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }
}
