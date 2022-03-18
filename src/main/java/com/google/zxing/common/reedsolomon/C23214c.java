package com.google.zxing.common.reedsolomon;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.zxing.common.reedsolomon.c */
public final class C23214c {

    /* renamed from: a */
    private final C23212a f57257a;

    /* renamed from: b */
    private final List<C23213b> f57258b;

    public C23214c(C23212a aVar) {
        this.f57257a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f57258b = arrayList;
        arrayList.add(new C23213b(aVar, new int[]{1}));
    }

    /* renamed from: a */
    private C23213b m84077a(int i) {
        if (i >= this.f57258b.size()) {
            List<C23213b> list = this.f57258b;
            C23213b bVar = list.get(list.size() - 1);
            for (int size = this.f57258b.size(); size <= i; size++) {
                C23212a aVar = this.f57257a;
                bVar = bVar.mo80519b(new C23213b(aVar, new int[]{1, aVar.mo80506a((size - 1) + aVar.mo80509b())}));
                this.f57258b.add(bVar);
            }
        }
        return this.f57258b.get(i);
    }

    /* renamed from: a */
    public void mo80523a(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                C23213b a = m84077a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] a2 = new C23213b(this.f57257a, iArr2).mo80515a(i, 1).mo80521c(a)[1].mo80517a();
                int length2 = i - a2.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(a2, 0, iArr, length + length2, a2.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
