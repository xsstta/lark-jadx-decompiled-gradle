package com.ss.android.lark.image.impl.p1969i;

import com.ss.android.lark.image.impl.p1962b.AbstractC38860j;
import com.ss.android.lark.image.impl.p1962b.C38865m;

/* renamed from: com.ss.android.lark.image.impl.i.c */
public class C38919c implements AbstractC38860j {

    /* renamed from: a */
    int[] f100011a;

    /* renamed from: b */
    C38865m f100012b;

    @Override // com.ss.android.lark.image.impl.p1962b.AbstractC38860j
    /* renamed from: a */
    public int[] mo142367a(C38865m mVar) {
        if (this.f100011a == null || this.f100012b != mVar) {
            this.f100011a = C38911a.m153595a().mo142487a(mVar.f99855c, Math.min(mVar.f99853a, mVar.f99854b), Math.max(mVar.f99853a, mVar.f99854b), mVar.f99856d);
            this.f100012b = mVar;
        }
        int[] iArr = this.f100011a;
        if (iArr == null || iArr.length < 2) {
            this.f100011a = new int[]{1080, 50};
        }
        return this.f100011a;
    }
}
