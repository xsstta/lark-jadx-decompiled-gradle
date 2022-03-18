package com.ss.android.lark.biz.core.api;

import android.text.TextUtils;
import java.io.File;

/* renamed from: com.ss.android.lark.biz.core.api.at */
public class C29548at {

    /* renamed from: a */
    public File f73941a;

    /* renamed from: b */
    private int[] f73942b;

    /* renamed from: a */
    public File mo105606a() {
        return this.f73941a;
    }

    /* renamed from: b */
    public int[] mo105607b() {
        return this.f73942b;
    }

    /* renamed from: c */
    public int mo105608c() {
        int[] iArr = this.f73942b;
        if (iArr[0] <= 0) {
            return 80;
        }
        return iArr[0];
    }

    /* renamed from: d */
    public int mo105609d() {
        int[] iArr = this.f73942b;
        if (iArr[1] <= 0) {
            return 80;
        }
        return iArr[1];
    }

    /* renamed from: e */
    public String mo105610e() {
        File file = this.f73941a;
        if (file != null && file.exists()) {
            String path = this.f73941a.getPath();
            if (!TextUtils.isEmpty(path)) {
                return path;
            }
        }
        return "";
    }

    public C29548at(File file, int[] iArr) {
        this.f73941a = file;
        this.f73942b = iArr;
    }
}
