package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.android.volley.toolbox.d */
public class C1949d {

    /* renamed from: a */
    protected static final Comparator<byte[]> f6640a = new Comparator<byte[]>() {
        /* class com.android.volley.toolbox.C1949d.C19501 */

        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    };

    /* renamed from: b */
    private final List<byte[]> f6641b = new ArrayList();

    /* renamed from: c */
    private final List<byte[]> f6642c = new ArrayList(64);

    /* renamed from: d */
    private int f6643d = 0;

    /* renamed from: e */
    private final int f6644e;

    /* renamed from: a */
    private synchronized void m8623a() {
        while (this.f6643d > this.f6644e) {
            byte[] remove = this.f6641b.remove(0);
            this.f6642c.remove(remove);
            this.f6643d -= remove.length;
        }
    }

    public C1949d(int i) {
        this.f6644e = i;
    }

    /* renamed from: a */
    public synchronized void mo9830a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f6644e) {
                this.f6641b.add(bArr);
                int binarySearch = Collections.binarySearch(this.f6642c, bArr, f6640a);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f6642c.add(binarySearch, bArr);
                this.f6643d += bArr.length;
                m8623a();
            }
        }
    }

    /* renamed from: a */
    public synchronized byte[] mo9831a(int i) {
        for (int i2 = 0; i2 < this.f6642c.size(); i2++) {
            byte[] bArr = this.f6642c.get(i2);
            if (bArr.length >= i) {
                this.f6643d -= bArr.length;
                this.f6642c.remove(i2);
                this.f6641b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }
}
