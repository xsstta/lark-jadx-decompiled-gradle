package com.bytedance.ee.bear.drive.loader.model;

import android.util.SparseArray;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6947b;
import com.bytedance.ee.bear.drive.core.model.PreviewMeta;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;

/* renamed from: com.bytedance.ee.bear.drive.loader.model.a */
public final class C7086a extends AbstractC6946a {
    /* renamed from: x */
    public C7087a mo27322a() {
        return (C7087a) this.f18767a;
    }

    @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6946a
    /* renamed from: v */
    public C7553d mo27356v() {
        return super.mo27356v().mo29474a(mo27322a().f19098q);
    }

    /* renamed from: y */
    public boolean mo27706y() {
        if (mo27322a() == null || mo27322a().f19100s != 1) {
            return false;
        }
        return true;
    }

    public C7086a(AbstractC6947b bVar) {
        super(bVar);
    }

    /* renamed from: com.bytedance.ee.bear.drive.loader.model.a$a */
    public static class C7087a extends AbstractC6947b {

        /* renamed from: m */
        public final String f19094m;

        /* renamed from: n */
        public final String f19095n;

        /* renamed from: o */
        public final int f19096o;

        /* renamed from: p */
        public final String f19097p;

        /* renamed from: q */
        public final String f19098q;

        /* renamed from: r */
        public final String f19099r;

        /* renamed from: s */
        public final int f19100s;

        public C7087a(String str, long j, int[] iArr, int i, String str2, boolean z, String str3, String str4, String str5, int i2, String str6, String str7, String str8, int i3, int i4) {
            this(str, j, iArr, i, str2, z, str3, str4, str5, i2, str6, str7, str8, i3, i4, "", null);
        }

        public C7087a(String str, long j, int[] iArr, int i, String str2, boolean z, String str3, String str4, String str5, int i2, String str6, String str7, String str8, int i3, int i4, String str9, SparseArray<PreviewMeta> sparseArray) {
            super(str3, str, j, iArr, i, str2, z, str9, sparseArray);
            String str10;
            String str11;
            String str12;
            String str13 = "";
            if (str4 == null) {
                str10 = str13;
            } else {
                str10 = str4;
            }
            this.f19094m = str10;
            if (str5 == null) {
                str11 = str13;
            } else {
                str11 = str5;
            }
            this.f19095n = str11;
            this.f19096o = i2;
            if (str6 == null) {
                str12 = str13;
            } else {
                str12 = str6;
            }
            this.f19097p = str12;
            this.f19098q = str7 != null ? str7 : str13;
            this.f19099r = str8;
            this.f19100s = i3;
            this.f18796l = i4;
        }
    }
}
