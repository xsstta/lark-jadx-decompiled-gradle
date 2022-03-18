package androidx.p036f.p037a;

import android.graphics.Color;
import androidx.core.graphics.C0768a;
import androidx.p036f.p037a.C0989b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* access modifiers changed from: package-private */
/* renamed from: androidx.f.a.a */
public final class C0986a {

    /* renamed from: f */
    private static final Comparator<C0988a> f3761f = new Comparator<C0988a>() {
        /* class androidx.p036f.p037a.C0986a.C09871 */

        /* renamed from: a */
        public int compare(C0988a aVar, C0988a aVar2) {
            return aVar2.mo5030a() - aVar.mo5030a();
        }
    };

    /* renamed from: a */
    final int[] f3762a;

    /* renamed from: b */
    final int[] f3763b;

    /* renamed from: c */
    final List<C0989b.C0993c> f3764c;

    /* renamed from: d */
    final C0989b.AbstractC0992b[] f3765d;

    /* renamed from: e */
    private final float[] f3766e = new float[3];

    /* renamed from: a */
    static int m4834a(int i) {
        return (i >> 10) & 31;
    }

    /* renamed from: b */
    static int m4841b(int i) {
        return (i >> 5) & 31;
    }

    /* renamed from: b */
    private static int m4842b(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    /* renamed from: c */
    static int m4843c(int i) {
        return i & 31;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C0989b.C0993c> mo5027a() {
        return this.f3764c;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.f.a.a$a */
    public class C0988a {

        /* renamed from: b */
        private int f3768b;

        /* renamed from: c */
        private int f3769c;

        /* renamed from: d */
        private int f3770d;

        /* renamed from: e */
        private int f3771e;

        /* renamed from: f */
        private int f3772f;

        /* renamed from: g */
        private int f3773g;

        /* renamed from: h */
        private int f3774h;

        /* renamed from: i */
        private int f3775i;

        /* renamed from: j */
        private int f3776j;

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final int mo5032c() {
            return (this.f3769c + 1) - this.f3768b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final boolean mo5031b() {
            if (mo5032c() > 1) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo5030a() {
            return ((this.f3772f - this.f3771e) + 1) * ((this.f3774h - this.f3773g) + 1) * ((this.f3776j - this.f3775i) + 1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final int mo5035f() {
            int i = this.f3772f - this.f3771e;
            int i2 = this.f3774h - this.f3773g;
            int i3 = this.f3776j - this.f3775i;
            if (i >= i2 && i >= i3) {
                return -3;
            }
            if (i2 < i || i2 < i3) {
                return -1;
            }
            return -2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final C0988a mo5034e() {
            if (mo5031b()) {
                int g = mo5036g();
                C0988a aVar = new C0988a(g + 1, this.f3769c);
                this.f3769c = g;
                mo5033d();
                return aVar;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo5033d() {
            int[] iArr = C0986a.this.f3762a;
            int[] iArr2 = C0986a.this.f3763b;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = 0;
            for (int i8 = this.f3768b; i8 <= this.f3769c; i8++) {
                int i9 = iArr[i8];
                i7 += iArr2[i9];
                int a = C0986a.m4834a(i9);
                int b = C0986a.m4841b(i9);
                int c = C0986a.m4843c(i9);
                if (a > i4) {
                    i4 = a;
                }
                if (a < i) {
                    i = a;
                }
                if (b > i5) {
                    i5 = b;
                }
                if (b < i2) {
                    i2 = b;
                }
                if (c > i6) {
                    i6 = c;
                }
                if (c < i3) {
                    i3 = c;
                }
            }
            this.f3771e = i;
            this.f3772f = i4;
            this.f3773g = i2;
            this.f3774h = i5;
            this.f3775i = i3;
            this.f3776j = i6;
            this.f3770d = i7;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public final int mo5036g() {
            int f = mo5035f();
            int[] iArr = C0986a.this.f3762a;
            int[] iArr2 = C0986a.this.f3763b;
            C0986a.m4838a(iArr, f, this.f3768b, this.f3769c);
            Arrays.sort(iArr, this.f3768b, this.f3769c + 1);
            C0986a.m4838a(iArr, f, this.f3768b, this.f3769c);
            int i = this.f3770d / 2;
            int i2 = this.f3768b;
            int i3 = 0;
            while (true) {
                int i4 = this.f3769c;
                if (i2 > i4) {
                    return this.f3768b;
                }
                i3 += iArr2[iArr[i2]];
                if (i3 >= i) {
                    return Math.min(i4 - 1, i2);
                }
                i2++;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public final C0989b.C0993c mo5037h() {
            int[] iArr = C0986a.this.f3762a;
            int[] iArr2 = C0986a.this.f3763b;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = this.f3768b; i5 <= this.f3769c; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i6];
                i2 += i7;
                i += C0986a.m4834a(i6) * i7;
                i3 += C0986a.m4841b(i6) * i7;
                i4 += i7 * C0986a.m4843c(i6);
            }
            float f = (float) i2;
            return new C0989b.C0993c(C0986a.m4835a(Math.round(((float) i) / f), Math.round(((float) i3) / f), Math.round(((float) i4) / f)), i2);
        }

        C0988a(int i, int i2) {
            this.f3768b = i;
            this.f3769c = i2;
            mo5033d();
        }
    }

    /* renamed from: a */
    private boolean m4840a(C0989b.C0993c cVar) {
        return m4839a(cVar.mo5043a(), cVar.mo5044b());
    }

    /* renamed from: e */
    private boolean m4845e(int i) {
        int g = m4847g(i);
        C0768a.m3712a(g, this.f3766e);
        return m4839a(g, this.f3766e);
    }

    /* renamed from: d */
    private List<C0989b.C0993c> m4844d(int i) {
        PriorityQueue<C0988a> priorityQueue = new PriorityQueue<>(i, f3761f);
        priorityQueue.offer(new C0988a(0, this.f3762a.length - 1));
        m4837a(priorityQueue, i);
        return m4836a(priorityQueue);
    }

    /* renamed from: g */
    private static int m4847g(int i) {
        return m4835a(m4834a(i), m4841b(i), m4843c(i));
    }

    /* renamed from: a */
    private List<C0989b.C0993c> m4836a(Collection<C0988a> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (C0988a aVar : collection) {
            C0989b.C0993c h = aVar.mo5037h();
            if (!m4840a(h)) {
                arrayList.add(h);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private static int m4846f(int i) {
        return m4842b(Color.blue(i), 8, 5) | (m4842b(Color.red(i), 8, 5) << 10) | (m4842b(Color.green(i), 8, 5) << 5);
    }

    /* renamed from: a */
    private void m4837a(PriorityQueue<C0988a> priorityQueue, int i) {
        C0988a poll;
        while (priorityQueue.size() < i && (poll = priorityQueue.poll()) != null && poll.mo5031b()) {
            priorityQueue.offer(poll.mo5034e());
            priorityQueue.offer(poll);
        }
    }

    /* renamed from: a */
    private boolean m4839a(int i, float[] fArr) {
        C0989b.AbstractC0992b[] bVarArr = this.f3765d;
        if (bVarArr != null && bVarArr.length > 0) {
            int length = bVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.f3765d[i2].mo5040a(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    static int m4835a(int i, int i2, int i3) {
        return Color.rgb(m4842b(i, 5, 8), m4842b(i2, 5, 8), m4842b(i3, 5, 8));
    }

    C0986a(int[] iArr, int i, C0989b.AbstractC0992b[] bVarArr) {
        this.f3765d = bVarArr;
        int[] iArr2 = new int[32768];
        this.f3763b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int f = m4846f(iArr[i2]);
            iArr[i2] = f;
            iArr2[f] = iArr2[f] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32768; i4++) {
            if (iArr2[i4] > 0 && m4845e(i4)) {
                iArr2[i4] = 0;
            }
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.f3762a = iArr3;
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                iArr3[i5] = i6;
                i5++;
            }
        }
        if (i3 <= i) {
            this.f3764c = new ArrayList();
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = iArr3[i7];
                this.f3764c.add(new C0989b.C0993c(m4847g(i8), iArr2[i8]));
            }
            return;
        }
        this.f3764c = m4844d(i);
    }

    /* renamed from: a */
    static void m4838a(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = m4843c(i4) | (m4841b(i4) << 10) | (m4834a(i4) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = m4834a(i5) | (m4843c(i5) << 10) | (m4841b(i5) << 5);
                i2++;
            }
        }
    }
}
