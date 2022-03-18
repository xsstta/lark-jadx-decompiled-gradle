package com.tt.miniapp.p3357x.p3359b;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* renamed from: com.tt.miniapp.x.b.b */
public class C67406b extends AbstractC67405a {
    @Override // com.tt.miniapp.p3357x.p3359b.AbstractC67405a
    /* renamed from: b */
    public long mo234086b() {
        long j = 0;
        if (this.f170004a != null && this.f170004a.exists() && this.f170004a.isDirectory()) {
            File[] listFiles = this.f170004a.listFiles();
            if (listFiles == null) {
                return 0;
            }
            for (File file : listFiles) {
                if (file != null) {
                    String name = file.getName();
                    if (!TextUtils.isEmpty(name) && name.startsWith("tma_storage_")) {
                        j += file.length();
                    }
                }
            }
        }
        return j;
    }

    public C67406b(Context context) {
        if (context != null) {
            this.f170004a = new File(context.getFilesDir().getParentFile().getAbsolutePath(), "/shared_prefs");
        }
    }
}
