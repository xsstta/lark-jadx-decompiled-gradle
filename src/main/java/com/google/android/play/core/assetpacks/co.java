package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

/* access modifiers changed from: package-private */
public final /* synthetic */ class co implements FilenameFilter {

    /* renamed from: a */
    static final FilenameFilter f55878a = new co();

    private co() {
    }

    public final boolean accept(File file, String str) {
        return cp.f55879a.matcher(str).matches();
    }
}
