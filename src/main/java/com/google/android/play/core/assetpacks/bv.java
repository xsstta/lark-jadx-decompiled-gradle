package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

final /* synthetic */ class bv implements FilenameFilter {

    /* renamed from: a */
    private final String f55815a;

    bv(String str) {
        this.f55815a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(String.valueOf(this.f55815a).concat("-")) && str.endsWith(".apk");
    }
}
