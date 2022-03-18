package com.h6ah4i.android.widget.advrecyclerview.expandable;

import com.bytedance.ee.bear.attachment.filereader.FileReaderUtil;
import com.h6ah4i.android.widget.advrecyclerview.expandable.RecyclerViewExpandableItemManager;
import com.ss.ttm.player.MediaPlayer;
import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: com.h6ah4i.android.widget.advrecyclerview.expandable.e */
public class C23272e {

    /* renamed from: a */
    private long[] f57360a;

    /* renamed from: b */
    private int[] f57361b;

    /* renamed from: c */
    private int f57362c;

    /* renamed from: d */
    private int f57363d;

    /* renamed from: e */
    private int f57364e;

    /* renamed from: f */
    private int f57365f = -1;

    /* renamed from: g */
    private AbstractC23270c f57366g;

    /* renamed from: a */
    public long[] mo80745a() {
        long[] jArr = new long[this.f57362c];
        for (int i = 0; i < this.f57362c; i++) {
            jArr[i] = (this.f57360a[i] & FileReaderUtil.f12880b) | (((long) this.f57361b[i]) << 32);
        }
        Arrays.sort(jArr);
        return jArr;
    }

    /* renamed from: b */
    public int mo80746b() {
        return this.f57362c + this.f57364e;
    }

    /* renamed from: g */
    public int mo80755g(int i) {
        return mo80751c(i, 1);
    }

    /* renamed from: b */
    public int mo80747b(int i) {
        return (int) (this.f57360a[i] & 2147483647L);
    }

    /* renamed from: c */
    public int mo80750c(int i) {
        if (mo80744a(i)) {
            return mo80747b(i);
        }
        return 0;
    }

    /* renamed from: a */
    public boolean mo80744a(int i) {
        if ((this.f57360a[i] & FileReaderUtil.f12880b) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo80752d(int i) {
        long[] jArr = this.f57360a;
        if ((jArr[i] & FileReaderUtil.f12880b) == 0) {
            return false;
        }
        jArr[i] = jArr[i] & -2147483649L;
        this.f57363d--;
        this.f57364e -= (int) (jArr[i] & 2147483647L);
        this.f57365f = Math.min(this.f57365f, i);
        return true;
    }

    /* renamed from: e */
    public boolean mo80753e(int i) {
        long[] jArr = this.f57360a;
        if ((jArr[i] & FileReaderUtil.f12880b) != 0) {
            return false;
        }
        jArr[i] = FileReaderUtil.f12880b | jArr[i];
        this.f57363d++;
        this.f57364e += (int) (jArr[i] & 2147483647L);
        this.f57365f = Math.min(this.f57365f, i);
        return true;
    }

    /* renamed from: a */
    public int mo80739a(long j) {
        int i = -1;
        if (j == -1) {
            return -1;
        }
        int b = C23269b.m84400b(j);
        int a = C23269b.m84397a(j);
        int i2 = this.f57362c;
        if (b >= 0 && b < i2) {
            if (a != -1 && !mo80744a(b)) {
                return -1;
            }
            int max = Math.max(0, Math.min(b, this.f57365f));
            int i3 = this.f57365f;
            int i4 = (int) (this.f57360a[max] >>> 32);
            while (true) {
                if (max >= i2) {
                    max = i3;
                    break;
                }
                long[] jArr = this.f57360a;
                long j2 = jArr[max];
                jArr[max] = (((long) i4) << 32) | (4294967295L & j2);
                int i5 = (int) (2147483647L & j2);
                if (max != b) {
                    i4++;
                    if ((j2 & FileReaderUtil.f12880b) != 0) {
                        i4 += i5;
                    }
                    i3 = max;
                    max++;
                } else if (a == -1) {
                    i = i4;
                } else if (a < i5) {
                    i = i4 + 1 + a;
                }
            }
            this.f57365f = Math.max(this.f57365f, max);
        }
        return i;
    }

    /* renamed from: f */
    public long mo80754f(int i) {
        int i2;
        long j = -1;
        if (i == -1) {
            return -1;
        }
        int i3 = this.f57362c;
        int a = m84419a(this.f57360a, this.f57365f, i);
        int i4 = this.f57365f;
        if (a == 0) {
            i2 = 0;
        } else {
            i2 = (int) (this.f57360a[a] >>> 32);
        }
        while (true) {
            if (a >= i3) {
                a = i4;
                break;
            }
            long[] jArr = this.f57360a;
            long j2 = jArr[a];
            jArr[a] = (((long) i2) << 32) | (4294967295L & j2);
            if (i2 >= i) {
                j = C23269b.m84398a(a);
                break;
            }
            i2++;
            if ((FileReaderUtil.f12880b & j2) != 0) {
                int i5 = (int) (j2 & 2147483647L);
                if (i5 > 0 && (i2 + i5) - 1 >= i) {
                    j = C23269b.m84399a(a, i - i2);
                    break;
                }
                i2 += i5;
            }
            i4 = a;
            a++;
        }
        this.f57365f = Math.max(this.f57365f, a);
        return j;
    }

    /* renamed from: a */
    public int mo80738a(int i, boolean z) {
        return mo80737a(i, 1, z);
    }

    /* renamed from: a */
    public void mo80740a(int i, int i2) {
        mo80741a(i, i2, 1);
    }

    /* renamed from: b */
    public void mo80748b(int i, int i2) {
        mo80749b(i, i2, 1);
    }

    /* renamed from: b */
    private void m84420b(int i, boolean z) {
        long[] jArr;
        int[] iArr;
        int i2 = (i + MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME) & -256;
        long[] jArr2 = this.f57360a;
        int[] iArr2 = this.f57361b;
        if (jArr2 == null || jArr2.length < i) {
            jArr = new long[i2];
        } else {
            jArr = jArr2;
        }
        if (iArr2 == null || iArr2.length < i) {
            iArr = new int[i2];
        } else {
            iArr = iArr2;
        }
        if (z) {
            if (!(jArr2 == null || jArr2 == jArr)) {
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            }
            if (!(iArr2 == null || iArr2 == iArr)) {
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            }
        }
        this.f57360a = jArr;
        this.f57361b = iArr;
    }

    /* renamed from: c */
    public int mo80751c(int i, int i2) {
        int i3;
        if (i2 <= 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            long j = this.f57360a[i + i5];
            if ((FileReaderUtil.f12880b & j) != 0) {
                int i6 = (int) (j & 2147483647L);
                i4 += i6;
                this.f57364e -= i6;
                this.f57363d--;
            }
        }
        int i7 = i4 + i2;
        this.f57362c -= i2;
        int i8 = i;
        while (true) {
            i3 = this.f57362c;
            if (i8 >= i3) {
                break;
            }
            long[] jArr = this.f57360a;
            int i9 = i8 + i2;
            jArr[i8] = jArr[i9];
            int[] iArr = this.f57361b;
            iArr[i8] = iArr[i9];
            i8++;
        }
        this.f57365f = Math.min(this.f57365f, i3 == 0 ? -1 : i - 1);
        return i7;
    }

    /* renamed from: a */
    private static int m84419a(long[] jArr, int i, int i2) {
        int i3 = 0;
        if (i <= 0) {
            return 0;
        }
        int i4 = (int) (jArr[0] >>> 32);
        int i5 = (int) (jArr[i] >>> 32);
        if (i2 <= i4) {
            return 0;
        }
        if (i2 >= i5) {
            return i;
        }
        int i6 = 0;
        while (i3 < i) {
            int i7 = (i3 + i) >>> 1;
            if (((int) (jArr[i7] >>> 32)) < i2) {
                i6 = i3;
                i3 = i7 + 1;
            } else {
                i = i7;
            }
        }
        return i6;
    }

    /* renamed from: b */
    public void mo80749b(int i, int i2, int i3) {
        long[] jArr = this.f57360a;
        long j = jArr[i];
        int i4 = (int) (2147483647L & j);
        if (i2 < 0 || i2 > i4) {
            throw new IllegalStateException("Invalid child position insertChildItems(groupPosition = " + i + ", childPositionStart = " + i2 + ", count = " + i3 + ")");
        }
        if ((FileReaderUtil.f12880b & j) != 0) {
            this.f57364e += i3;
        }
        jArr[i] = ((long) (i4 + i3)) | (j & -2147483648L);
        this.f57365f = Math.min(this.f57365f, i);
    }

    /* renamed from: a */
    public int mo80737a(int i, int i2, boolean z) {
        long j;
        int i3;
        if (i2 <= 0) {
            return 0;
        }
        m84420b(this.f57362c + i2, true);
        AbstractC23270c cVar = this.f57366g;
        long[] jArr = this.f57360a;
        int[] iArr = this.f57361b;
        int i4 = i - 1;
        int i5 = i4 + i2;
        for (int i6 = (this.f57362c - 1) + i2; i6 > i5; i6--) {
            int i7 = i6 - i2;
            jArr[i6] = jArr[i7];
            iArr[i6] = iArr[i7];
        }
        if (z) {
            j = FileReaderUtil.f12880b;
        } else {
            j = 0;
        }
        int i8 = i + i2;
        int i9 = i;
        int i10 = 0;
        while (i9 < i8) {
            long b = cVar.mo80728b(i9);
            int a = cVar.mo80720a(i9);
            jArr[i9] = ((long) a) | (((long) i9) << 32) | j;
            iArr[i9] = (int) (4294967295L & b);
            i10 += a;
            i9++;
            cVar = cVar;
            i4 = i4;
        }
        int i11 = this.f57362c + i2;
        this.f57362c = i11;
        if (z) {
            this.f57363d += i2;
            this.f57364e += i10;
        }
        if (i11 == 0) {
            i3 = -1;
        } else {
            i3 = i4;
        }
        this.f57365f = Math.min(this.f57365f, i3);
        if (z) {
            return i2 + i10;
        }
        return i2;
    }

    /* renamed from: a */
    public void mo80741a(int i, int i2, int i3) {
        long[] jArr = this.f57360a;
        long j = jArr[i];
        int i4 = (int) (2147483647L & j);
        if (i2 < 0 || i2 + i3 > i4) {
            throw new IllegalStateException("Invalid child position removeChildItems(groupPosition = " + i + ", childPosition = " + i2 + ", count = " + i3 + ")");
        }
        if ((FileReaderUtil.f12880b & j) != 0) {
            this.f57364e -= i3;
        }
        jArr[i] = ((long) (i4 - i3)) | (j & -2147483648L);
        this.f57365f = Math.min(this.f57365f, i - 1);
    }

    /* renamed from: a */
    public void mo80742a(AbstractC23270c cVar, int i, boolean z) {
        long j;
        int a = cVar.mo80719a();
        m84420b(a, false);
        long[] jArr = this.f57360a;
        int[] iArr = this.f57361b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 < a) {
                long b = cVar.mo80728b(i2);
                int a2 = cVar.mo80720a(i2);
                if (i != 1 && (i == 2 || (!z && !cVar.mo80734d(i2)))) {
                    z2 = false;
                }
                long j2 = ((long) a2) | (((long) (i2 + i4)) << 32);
                if (z2) {
                    j = FileReaderUtil.f12880b;
                } else {
                    j = 0;
                }
                jArr[i2] = j2 | j;
                iArr[i2] = (int) (4294967295L & b);
                if (z2) {
                    i3++;
                    i4 += a2;
                }
                i2++;
                jArr = jArr;
            } else {
                this.f57366g = cVar;
                this.f57362c = a;
                this.f57363d = i3;
                this.f57364e = i4;
                this.f57365f = Math.max(0, a - 1);
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo80743a(long[] jArr, AbstractC23270c cVar, RecyclerViewExpandableItemManager.AbstractC23267b bVar, RecyclerViewExpandableItemManager.AbstractC23266a aVar) {
        boolean z;
        int i;
        if (!(jArr == null || jArr.length == 0 || this.f57360a == null)) {
            int i2 = this.f57362c;
            long[] jArr2 = new long[i2];
            for (int i3 = 0; i3 < this.f57362c; i3++) {
                jArr2[i3] = (((long) this.f57361b[i3]) << 32) | ((long) i3);
            }
            Arrays.sort(jArr2);
            int i4 = 0;
            int i5 = 0;
            while (i4 < jArr.length) {
                int i6 = (int) (jArr[i4] >>> 32);
                if ((jArr[i4] & FileReaderUtil.f12880b) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i7 = i5;
                while (true) {
                    if (i5 >= i2) {
                        i = i4;
                        break;
                    }
                    int i8 = (int) (jArr2[i5] >>> 32);
                    i = i4;
                    int i9 = (int) (jArr2[i5] & 2147483647L);
                    if (i8 >= i6) {
                        if (i8 != i6) {
                            break;
                        }
                        int i10 = i5 + 1;
                        if (z) {
                            if ((cVar == null || cVar.mo80725a(i9, false, null)) && mo80753e(i9) && bVar != null) {
                                bVar.mo80712a(i9, false, null);
                            }
                        } else if ((cVar == null || cVar.mo80730b(i9, false, null)) && mo80752d(i9) && aVar != null) {
                            aVar.mo80711a(i9, false, null);
                        }
                        i7 = i10;
                    } else {
                        i7 = i5;
                    }
                    i5++;
                    i4 = i;
                }
                i4 = i + 1;
                i5 = i7;
            }
        }
    }
}
