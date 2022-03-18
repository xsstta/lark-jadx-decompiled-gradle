package okio;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: okio.l */
public final class C69710l extends AbstractList<ByteString> implements RandomAccess {

    /* renamed from: a */
    final ByteString[] f174142a;

    /* renamed from: b */
    final int[] f174143b;

    public final int size() {
        return this.f174142a.length;
    }

    /* renamed from: a */
    public ByteString get(int i) {
        return this.f174142a[i];
    }

    /* renamed from: a */
    private static int m267603a(C69694c cVar) {
        return (int) (cVar.mo244510a() / 4);
    }

    /* renamed from: a */
    public static C69710l m267604a(ByteString... byteStringArr) {
        if (byteStringArr.length == 0) {
            return new C69710l(new ByteString[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(byteStringArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(-1);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.set(Collections.binarySearch(arrayList, byteStringArr[i2]), Integer.valueOf(i2));
        }
        if (((ByteString) arrayList.get(0)).size() != 0) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                ByteString byteString = (ByteString) arrayList.get(i3);
                int i4 = i3 + 1;
                int i5 = i4;
                while (i5 < arrayList.size()) {
                    ByteString byteString2 = (ByteString) arrayList.get(i5);
                    if (!byteString2.startsWith(byteString)) {
                        continue;
                        break;
                    } else if (byteString2.size() == byteString.size()) {
                        throw new IllegalArgumentException("duplicate option: " + byteString2);
                    } else if (((Integer) arrayList2.get(i5)).intValue() > ((Integer) arrayList2.get(i3)).intValue()) {
                        arrayList.remove(i5);
                        arrayList2.remove(i5);
                    } else {
                        i5++;
                    }
                }
                i3 = i4;
            }
            C69694c cVar = new C69694c();
            m267605a(0, cVar, 0, arrayList, 0, arrayList.size(), arrayList2);
            int a = m267603a(cVar);
            int[] iArr = new int[a];
            for (int i6 = 0; i6 < a; i6++) {
                iArr[i6] = cVar.readInt();
            }
            if (cVar.exhausted()) {
                return new C69710l((ByteString[]) byteStringArr.clone(), iArr);
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    private C69710l(ByteString[] byteStringArr, int[] iArr) {
        this.f174142a = byteStringArr;
        this.f174143b = iArr;
    }

    /* renamed from: a */
    private static void m267605a(long j, C69694c cVar, int i, List<ByteString> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        C69694c cVar2;
        int i6;
        int i7 = i2;
        if (i7 < i3) {
            for (int i8 = i7; i8 < i3; i8++) {
                if (list.get(i8).size() < i) {
                    throw new AssertionError();
                }
            }
            ByteString byteString = list.get(i2);
            ByteString byteString2 = list.get(i3 - 1);
            int i9 = -1;
            if (i == byteString.size()) {
                i9 = list2.get(i7).intValue();
                i7++;
                byteString = list.get(i7);
            }
            if (byteString.getByte(i) != byteString2.getByte(i)) {
                int i10 = 1;
                for (int i11 = i7 + 1; i11 < i3; i11++) {
                    if (list.get(i11 - 1).getByte(i) != list.get(i11).getByte(i)) {
                        i10++;
                    }
                }
                long a = j + ((long) m267603a(cVar)) + 2 + ((long) (i10 * 2));
                cVar.mo244557i(i10);
                cVar.mo244557i(i9);
                for (int i12 = i7; i12 < i3; i12++) {
                    byte b = list.get(i12).getByte(i);
                    if (i12 == i7 || b != list.get(i12 - 1).getByte(i)) {
                        cVar.mo244557i(b & 255);
                    }
                }
                C69694c cVar3 = new C69694c();
                int i13 = i7;
                while (i13 < i3) {
                    byte b2 = list.get(i13).getByte(i);
                    int i14 = i13 + 1;
                    int i15 = i14;
                    while (true) {
                        if (i15 >= i3) {
                            i5 = i3;
                            break;
                        } else if (b2 != list.get(i15).getByte(i)) {
                            i5 = i15;
                            break;
                        } else {
                            i15++;
                        }
                    }
                    if (i14 == i5 && i + 1 == list.get(i13).size()) {
                        cVar.mo244557i(list2.get(i13).intValue());
                        i6 = i5;
                        cVar2 = cVar3;
                    } else {
                        cVar.mo244557i((int) ((((long) m267603a(cVar3)) + a) * -1));
                        i6 = i5;
                        cVar2 = cVar3;
                        m267605a(a, cVar3, i + 1, list, i13, i5, list2);
                    }
                    cVar3 = cVar2;
                    i13 = i6;
                }
                cVar.write(cVar3, cVar3.mo244510a());
                return;
            }
            int i16 = 0;
            int min = Math.min(byteString.size(), byteString2.size());
            int i17 = i;
            while (i17 < min && byteString.getByte(i17) == byteString2.getByte(i17)) {
                i16++;
                i17++;
            }
            long a2 = 1 + j + ((long) m267603a(cVar)) + 2 + ((long) i16);
            cVar.mo244557i(-i16);
            cVar.mo244557i(i9);
            int i18 = i;
            while (true) {
                i4 = i + i16;
                if (i18 >= i4) {
                    break;
                }
                cVar.mo244557i(byteString.getByte(i18) & 255);
                i18++;
            }
            if (i7 + 1 != i3) {
                C69694c cVar4 = new C69694c();
                cVar.mo244557i((int) ((((long) m267603a(cVar4)) + a2) * -1));
                m267605a(a2, cVar4, i4, list, i7, i3, list2);
                cVar.write(cVar4, cVar4.mo244510a());
            } else if (i4 == list.get(i7).size()) {
                cVar.mo244557i(list2.get(i7).intValue());
            } else {
                throw new AssertionError();
            }
        } else {
            throw new AssertionError();
        }
    }
}
