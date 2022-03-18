package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.g */
public class C1374g {

    /* renamed from: a */
    private static final Comparator<C1381f> f4859a = new Comparator<C1381f>() {
        /* class androidx.recyclerview.widget.C1374g.C13751 */

        /* renamed from: a */
        public int compare(C1381f fVar, C1381f fVar2) {
            int i = fVar.f4874a - fVar2.f4874a;
            if (i == 0) {
                return fVar.f4875b - fVar2.f4875b;
            }
            return i;
        }
    };

    /* renamed from: androidx.recyclerview.widget.g$a */
    public static abstract class AbstractC1376a {
        /* renamed from: a */
        public abstract int mo7380a();

        /* renamed from: a */
        public abstract boolean mo7381a(int i, int i2);

        /* renamed from: b */
        public abstract int mo7382b();

        /* renamed from: b */
        public abstract boolean mo7383b(int i, int i2);

        /* renamed from: c */
        public Object mo7384c(int i, int i2) {
            return null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$c */
    public static abstract class AbstractC1378c<T> {
        public abstract boolean areContentsTheSame(T t, T t2);

        public abstract boolean areItemsTheSame(T t, T t2);

        public Object getChangePayload(T t, T t2) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.g$e */
    public static class C1380e {

        /* renamed from: a */
        int f4870a;

        /* renamed from: b */
        int f4871b;

        /* renamed from: c */
        int f4872c;

        /* renamed from: d */
        int f4873d;

        public C1380e() {
        }

        public C1380e(int i, int i2, int i3, int i4) {
            this.f4870a = i;
            this.f4871b = i2;
            this.f4872c = i3;
            this.f4873d = i4;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.g$f */
    public static class C1381f {

        /* renamed from: a */
        int f4874a;

        /* renamed from: b */
        int f4875b;

        /* renamed from: c */
        int f4876c;

        /* renamed from: d */
        boolean f4877d;

        /* renamed from: e */
        boolean f4878e;

        C1381f() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$b */
    public static class C1377b {

        /* renamed from: a */
        private final List<C1381f> f4860a;

        /* renamed from: b */
        private final int[] f4861b;

        /* renamed from: c */
        private final int[] f4862c;

        /* renamed from: d */
        private final AbstractC1376a f4863d;

        /* renamed from: e */
        private final int f4864e;

        /* renamed from: f */
        private final int f4865f;

        /* renamed from: g */
        private final boolean f4866g;

        /* renamed from: a */
        private void m6307a() {
            C1381f fVar;
            if (this.f4860a.isEmpty()) {
                fVar = null;
            } else {
                fVar = this.f4860a.get(0);
            }
            if (fVar == null || fVar.f4874a != 0 || fVar.f4875b != 0) {
                C1381f fVar2 = new C1381f();
                fVar2.f4874a = 0;
                fVar2.f4875b = 0;
                fVar2.f4877d = false;
                fVar2.f4876c = 0;
                fVar2.f4878e = false;
                this.f4860a.add(0, fVar2);
            }
        }

        /* renamed from: b */
        private void m6311b() {
            int i;
            int i2 = this.f4864e;
            int i3 = this.f4865f;
            for (int size = this.f4860a.size() - 1; size >= 0; size--) {
                C1381f fVar = this.f4860a.get(size);
                int i4 = fVar.f4874a + fVar.f4876c;
                int i5 = fVar.f4875b + fVar.f4876c;
                if (this.f4866g) {
                    while (i2 > i4) {
                        m6308a(i2, i3, size);
                        i2--;
                    }
                    while (i3 > i5) {
                        m6312b(i2, i3, size);
                        i3--;
                    }
                }
                for (int i6 = 0; i6 < fVar.f4876c; i6++) {
                    int i7 = fVar.f4874a + i6;
                    int i8 = fVar.f4875b + i6;
                    if (this.f4863d.mo7383b(i7, i8)) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    this.f4861b[i7] = (i8 << 5) | i;
                    this.f4862c[i8] = (i7 << 5) | i;
                }
                i2 = fVar.f4874a;
                i3 = fVar.f4875b;
            }
        }

        /* renamed from: a */
        public void mo7412a(RecyclerView.Adapter adapter) {
            mo7413a(new C1353b(adapter));
        }

        /* renamed from: a */
        public void mo7413a(AbstractC1398p pVar) {
            C1362e eVar;
            if (pVar instanceof C1362e) {
                eVar = (C1362e) pVar;
            } else {
                eVar = new C1362e(pVar);
            }
            List<C1379d> arrayList = new ArrayList<>();
            int i = this.f4864e;
            int i2 = this.f4865f;
            for (int size = this.f4860a.size() - 1; size >= 0; size--) {
                C1381f fVar = this.f4860a.get(size);
                int i3 = fVar.f4876c;
                int i4 = fVar.f4874a + i3;
                int i5 = fVar.f4875b + i3;
                if (i4 < i) {
                    m6313b(arrayList, eVar, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    m6309a(arrayList, eVar, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    if ((this.f4861b[fVar.f4874a + i6] & 31) == 2) {
                        eVar.mo7366a(fVar.f4874a + i6, 1, this.f4863d.mo7384c(fVar.f4874a + i6, fVar.f4875b + i6));
                    }
                }
                i = fVar.f4874a;
                i2 = fVar.f4875b;
            }
            eVar.mo7388a();
        }

        /* renamed from: a */
        private void m6308a(int i, int i2, int i3) {
            if (this.f4861b[i - 1] == 0) {
                m6310a(i, i2, i3, false);
            }
        }

        /* renamed from: b */
        private void m6312b(int i, int i2, int i3) {
            if (this.f4862c[i2 - 1] == 0) {
                m6310a(i, i2, i3, true);
            }
        }

        /* renamed from: a */
        private static C1379d m6306a(List<C1379d> list, int i, boolean z) {
            int i2;
            int size = list.size() - 1;
            while (size >= 0) {
                C1379d dVar = list.get(size);
                if (dVar.f4867a == i && dVar.f4869c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        C1379d dVar2 = list.get(size);
                        int i3 = dVar2.f4868b;
                        if (z) {
                            i2 = 1;
                        } else {
                            i2 = -1;
                        }
                        dVar2.f4868b = i3 + i2;
                        size++;
                    }
                    return dVar;
                }
                size--;
            }
            return null;
        }

        /* renamed from: a */
        private boolean m6310a(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                i2--;
                i4 = i;
                i5 = i2;
            } else {
                i5 = i - 1;
                i4 = i5;
            }
            while (i3 >= 0) {
                C1381f fVar = this.f4860a.get(i3);
                int i6 = fVar.f4874a + fVar.f4876c;
                int i7 = fVar.f4875b + fVar.f4876c;
                int i8 = 8;
                if (z) {
                    for (int i9 = i4 - 1; i9 >= i6; i9--) {
                        if (this.f4863d.mo7381a(i9, i5)) {
                            if (!this.f4863d.mo7383b(i9, i5)) {
                                i8 = 4;
                            }
                            this.f4862c[i5] = (i9 << 5) | 16;
                            this.f4861b[i9] = (i5 << 5) | i8;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i10 = i2 - 1; i10 >= i7; i10--) {
                        if (this.f4863d.mo7381a(i5, i10)) {
                            if (!this.f4863d.mo7383b(i5, i10)) {
                                i8 = 4;
                            }
                            int i11 = i - 1;
                            this.f4861b[i11] = (i10 << 5) | 16;
                            this.f4862c[i10] = (i11 << 5) | i8;
                            return true;
                        }
                    }
                    continue;
                }
                i4 = fVar.f4874a;
                i2 = fVar.f4875b;
                i3--;
            }
            return false;
        }

        C1377b(AbstractC1376a aVar, List<C1381f> list, int[] iArr, int[] iArr2, boolean z) {
            this.f4860a = list;
            this.f4861b = iArr;
            this.f4862c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f4863d = aVar;
            this.f4864e = aVar.mo7380a();
            this.f4865f = aVar.mo7382b();
            this.f4866g = z;
            m6307a();
            m6311b();
        }

        /* renamed from: a */
        private void m6309a(List<C1379d> list, AbstractC1398p pVar, int i, int i2, int i3) {
            if (!this.f4866g) {
                pVar.mo7365a(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int[] iArr = this.f4862c;
                int i5 = i3 + i4;
                int i6 = iArr[i5] & 31;
                if (i6 == 0) {
                    pVar.mo7365a(i, 1);
                    for (C1379d dVar : list) {
                        dVar.f4868b++;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = iArr[i5] >> 5;
                    pVar.mo7368c(m6306a(list, i7, true).f4868b, i);
                    if (i6 == 4) {
                        pVar.mo7366a(i, 1, this.f4863d.mo7384c(i7, i5));
                    }
                } else if (i6 == 16) {
                    list.add(new C1379d(i5, i, false));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString((long) i6));
                }
            }
        }

        /* renamed from: b */
        private void m6313b(List<C1379d> list, AbstractC1398p pVar, int i, int i2, int i3) {
            if (!this.f4866g) {
                pVar.mo7367b(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int[] iArr = this.f4861b;
                int i5 = i3 + i4;
                int i6 = iArr[i5] & 31;
                if (i6 == 0) {
                    pVar.mo7367b(i + i4, 1);
                    for (C1379d dVar : list) {
                        dVar.f4868b--;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = iArr[i5] >> 5;
                    C1379d a = m6306a(list, i7, false);
                    pVar.mo7368c(i + i4, a.f4868b - 1);
                    if (i6 == 4) {
                        pVar.mo7366a(a.f4868b - 1, 1, this.f4863d.mo7384c(i5, i7));
                    }
                } else if (i6 == 16) {
                    list.add(new C1379d(i5, i + i4, true));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString((long) i6));
                }
            }
        }
    }

    /* renamed from: a */
    public static C1377b m6297a(AbstractC1376a aVar) {
        return m6298a(aVar, true);
    }

    /* renamed from: a */
    public static C1377b m6298a(AbstractC1376a aVar, boolean z) {
        C1380e eVar;
        int a = aVar.mo7380a();
        int b = aVar.mo7382b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C1380e(0, a, 0, b));
        int abs = a + b + Math.abs(a - b);
        int i = abs * 2;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C1380e eVar2 = (C1380e) arrayList2.remove(arrayList2.size() - 1);
            C1381f a2 = m6299a(aVar, eVar2.f4870a, eVar2.f4871b, eVar2.f4872c, eVar2.f4873d, iArr, iArr2, abs);
            if (a2 != null) {
                if (a2.f4876c > 0) {
                    arrayList.add(a2);
                }
                a2.f4874a += eVar2.f4870a;
                a2.f4875b += eVar2.f4872c;
                if (arrayList3.isEmpty()) {
                    eVar = new C1380e();
                } else {
                    eVar = (C1380e) arrayList3.remove(arrayList3.size() - 1);
                }
                eVar.f4870a = eVar2.f4870a;
                eVar.f4872c = eVar2.f4872c;
                if (a2.f4878e) {
                    eVar.f4871b = a2.f4874a;
                    eVar.f4873d = a2.f4875b;
                } else if (a2.f4877d) {
                    eVar.f4871b = a2.f4874a - 1;
                    eVar.f4873d = a2.f4875b;
                } else {
                    eVar.f4871b = a2.f4874a;
                    eVar.f4873d = a2.f4875b - 1;
                }
                arrayList2.add(eVar);
                if (!a2.f4878e) {
                    eVar2.f4870a = a2.f4874a + a2.f4876c;
                    eVar2.f4872c = a2.f4875b + a2.f4876c;
                } else if (a2.f4877d) {
                    eVar2.f4870a = a2.f4874a + a2.f4876c + 1;
                    eVar2.f4872c = a2.f4875b + a2.f4876c;
                } else {
                    eVar2.f4870a = a2.f4874a + a2.f4876c;
                    eVar2.f4872c = a2.f4875b + a2.f4876c + 1;
                }
                arrayList2.add(eVar2);
            } else {
                arrayList3.add(eVar2);
            }
        }
        Collections.sort(arrayList, f4859a);
        return new C1377b(aVar, arrayList, iArr, iArr2, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.g$d */
    public static class C1379d {

        /* renamed from: a */
        int f4867a;

        /* renamed from: b */
        int f4868b;

        /* renamed from: c */
        boolean f4869c;

        public C1379d(int i, int i2, boolean z) {
            this.f4867a = i;
            this.f4868b = i2;
            this.f4869c = z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r24[r13 - 1] < r24[r13 + r5]) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ba, code lost:
        if (r25[r12 - 1] < r25[r12 + 1]) goto L_0x00c7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.recyclerview.widget.C1374g.C1381f m6299a(androidx.recyclerview.widget.C1374g.AbstractC1376a r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
        // Method dump skipped, instructions count: 309
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1374g.m6299a(androidx.recyclerview.widget.g$a, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.g$f");
    }
}
