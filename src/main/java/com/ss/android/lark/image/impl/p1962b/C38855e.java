package com.ss.android.lark.image.impl.p1962b;

import android.graphics.Bitmap;
import com.huawei.hms.utils.FileUtil;

/* renamed from: com.ss.android.lark.image.impl.b.e */
class C38855e implements AbstractC38857g {

    /* renamed from: a */
    private final AbstractC38860j f99840a;

    /* renamed from: a */
    private int m153366a(int i) {
        int i2 = 1;
        while (true) {
            int i3 = i2 << 1;
            if (i3 > i) {
                return i2;
            }
            i2 = i3;
        }
    }

    /* renamed from: a */
    private static long m153367a(int i, int i2) {
        return (long) (i * i2 * 4);
    }

    public C38855e(AbstractC38860j jVar) {
        this.f99840a = jVar;
    }

    @Override // com.ss.android.lark.image.impl.p1962b.AbstractC38857g
    /* renamed from: c */
    public int mo142363c(C38865m mVar) {
        return m153369e(mVar);
    }

    /* renamed from: d */
    private int m153368d(C38865m mVar) {
        return this.f99840a.mo142367a(mVar)[0];
    }

    /* renamed from: e */
    private int m153369e(C38865m mVar) {
        int i = this.f99840a.mo142367a(mVar)[1];
        if (i <= 0) {
            return 100;
        }
        return i;
    }

    @Override // com.ss.android.lark.image.impl.p1962b.AbstractC38857g
    /* renamed from: a */
    public Bitmap.CompressFormat mo142360a(String str) {
        if ("image/png".equalsIgnoreCase(str)) {
            return Bitmap.CompressFormat.PNG;
        }
        if ("image/webp".equalsIgnoreCase(str)) {
            return Bitmap.CompressFormat.WEBP;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    @Override // com.ss.android.lark.image.impl.p1962b.AbstractC38857g
    /* renamed from: a */
    public int mo142359a(C38865m mVar) {
        int i;
        int min = Math.min(mVar.f99853a, mVar.f99854b);
        if (min % 2 == 1) {
            min++;
        }
        int d = m153368d(mVar);
        if (min > d) {
            i = m153366a(min / d);
        } else {
            i = 1;
        }
        return Math.max(i, 1);
    }

    @Override // com.ss.android.lark.image.impl.p1962b.AbstractC38857g
    /* renamed from: b */
    public int mo142362b(C38865m mVar) {
        int a = mo142359a(mVar);
        float f = (float) a;
        int i = (int) ((((float) mVar.f99853a) * 1.0f) / f);
        int i2 = (int) ((((float) mVar.f99854b) * 1.0f) / f);
        int min = Math.min(i, i2);
        int d = m153368d(mVar);
        if (min <= d || m153367a(i, i2) > Runtime.getRuntime().maxMemory() / 10) {
            return min;
        }
        return d;
    }

    @Override // com.ss.android.lark.image.impl.p1962b.AbstractC38857g
    /* renamed from: a */
    public boolean mo142361a(C38865m mVar, int i, int i2) {
        boolean z = mVar.f99859g;
        long j = mVar.f99855c;
        if (j < FileUtil.LOCAL_REPORT_FILE_MAX_SIZE || ((!z && j < 20480) || (mVar.mo142379c() <= i && mVar.f99856d <= i2))) {
            return true;
        }
        return false;
    }
}
