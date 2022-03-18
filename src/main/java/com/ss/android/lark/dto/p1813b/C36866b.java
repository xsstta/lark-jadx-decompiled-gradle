package com.ss.android.lark.dto.p1813b;

import android.text.TextUtils;
import java.io.File;

/* renamed from: com.ss.android.lark.dto.b.b */
public class C36866b {

    /* renamed from: a */
    public File f94737a;

    /* renamed from: b */
    private int[] f94738b;

    /* renamed from: a */
    public int mo136023a() {
        int[] iArr = this.f94738b;
        if (iArr[0] <= 0) {
            return 80;
        }
        return iArr[0];
    }

    /* renamed from: b */
    public int mo136024b() {
        int[] iArr = this.f94738b;
        if (iArr[1] <= 0) {
            return 80;
        }
        return iArr[1];
    }

    /* renamed from: c */
    public String mo136025c() {
        File file = this.f94737a;
        if (file != null && file.exists()) {
            String path = this.f94737a.getPath();
            if (!TextUtils.isEmpty(path)) {
                return path;
            }
        }
        return "";
    }

    public C36866b(File file, int[] iArr) {
        this.f94737a = file;
        this.f94738b = iArr;
    }
}
