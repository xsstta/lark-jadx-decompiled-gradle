package com.ss.android.vesdk.runtime;

import android.text.TextUtils;
import java.io.File;

/* renamed from: com.ss.android.vesdk.runtime.b */
public final class C64060b extends AbstractC64063e {
    @Override // com.ss.android.vesdk.runtime.AbstractC64063e
    /* renamed from: a */
    public String mo221800a() {
        if (TextUtils.isEmpty(this.f161766b)) {
            this.f161766b = this.f161765a + File.separator + "segments";
        }
        return this.f161766b;
    }

    public C64060b(String str) {
        super(str);
    }
}
