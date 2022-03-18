package com.bytedance.ee.bear.drive.loader.model;

import android.util.SparseArray;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6947b;
import com.bytedance.ee.bear.drive.core.model.PreviewMeta;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;

/* renamed from: com.bytedance.ee.bear.drive.loader.model.b */
public class C7088b extends AbstractC6946a {
    /* renamed from: x */
    public C7089a mo27322a() {
        return (C7089a) this.f18767a;
    }

    @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6946a
    /* renamed from: v */
    public C7553d mo27356v() {
        return super.mo27356v().mo29482d(mo27322a().f19101m).mo29484e(mo27322a().f19102n);
    }

    public C7088b(C7089a aVar) {
        super(aVar);
    }

    /* renamed from: com.bytedance.ee.bear.drive.loader.model.b$a */
    public static class C7089a extends AbstractC6947b {

        /* renamed from: m */
        public final String f19101m;

        /* renamed from: n */
        public final String f19102n;

        /* renamed from: o */
        public final int f19103o;

        /* renamed from: p */
        public final String f19104p;

        public C7089a(String str, long j, int[] iArr, int i, String str2, boolean z, String str3, String str4, String str5, int i2, String str6, SparseArray<PreviewMeta> sparseArray) {
            this(str, j, iArr, i, str2, z, str3, str4, str5, i2, str6, "", sparseArray);
        }

        public C7089a(String str, long j, int[] iArr, int i, String str2, boolean z, String str3, String str4, String str5, int i2, String str6, String str7, SparseArray<PreviewMeta> sparseArray) {
            super(str4, str, j, iArr, i, str2, z, str7, sparseArray);
            this.f19101m = str3;
            this.f19102n = str5;
            this.f19103o = i2;
            this.f19104p = str6;
        }
    }
}
