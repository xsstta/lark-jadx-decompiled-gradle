package com.google.android.flexbox;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0906h;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.flexbox.c */
class C21537c {

    /* renamed from: c */
    static final /* synthetic */ boolean f52313c = true;

    /* renamed from: a */
    int[] f52314a;

    /* renamed from: b */
    long[] f52315b;

    /* renamed from: d */
    private final AbstractC21535a f52316d;

    /* renamed from: e */
    private boolean[] f52317e;

    /* renamed from: f */
    private long[] f52318f;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo72896a(long j) {
        return (int) j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo72909b(long j) {
        return (int) (j >> 32);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo72910b(int i, int i2) {
        return (((long) i) & 4294967295L) | (((long) i2) << 32);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.flexbox.c$a */
    public static class C21539a {

        /* renamed from: a */
        List<C21536b> f52319a;

        /* renamed from: b */
        int f52320b;

        C21539a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo72920a() {
            this.f52319a = null;
            this.f52320b = 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.flexbox.c$b */
    public static class C21540b implements Comparable<C21540b> {

        /* renamed from: a */
        int f52321a;

        /* renamed from: b */
        int f52322b;

        private C21540b() {
        }

        public String toString() {
            return "Order{order=" + this.f52322b + ", index=" + this.f52321a + '}';
        }

        /* renamed from: a */
        public int compareTo(C21540b bVar) {
            int i = this.f52322b;
            int i2 = bVar.f52322b;
            if (i != i2) {
                return i - i2;
            }
            return this.f52321a - bVar.f52321a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] mo72908a(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f52316d.getFlexItemCount();
        List<C21540b> e = m78026e(flexItemCount);
        C21540b bVar = new C21540b();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            bVar.f52322b = 1;
        } else {
            bVar.f52322b = ((FlexItem) layoutParams).mo72792c();
        }
        if (i == -1 || i == flexItemCount) {
            bVar.f52321a = flexItemCount;
        } else if (i < this.f52316d.getFlexItemCount()) {
            bVar.f52321a = i;
            while (i < flexItemCount) {
                e.get(i).f52321a++;
                i++;
            }
        } else {
            bVar.f52321a = flexItemCount;
        }
        e.add(bVar);
        return m78014a(flexItemCount + 1, e, sparseIntArray);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] mo72907a(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f52316d.getFlexItemCount();
        return m78014a(flexItemCount, m78026e(flexItemCount), sparseIntArray);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo72915b(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f52316d.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return f52313c;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View a = this.f52316d.mo72809a(i);
            if (!(a == null || ((FlexItem) a.getLayoutParams()).mo72792c() == sparseIntArray.get(i))) {
                return f52313c;
            }
        }
        return false;
    }

    /* renamed from: a */
    private int[] m78014a(int i, List<C21540b> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (C21540b bVar : list) {
            iArr[i2] = bVar.f52321a;
            sparseIntArray.append(bVar.f52321a, bVar.f52322b);
            i2++;
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo72903a(C21539a aVar, int i, int i2) {
        mo72904a(aVar, i, i2, Integer.MAX_VALUE, 0, -1, (List<C21536b>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo72905a(C21539a aVar, int i, int i2, int i3, int i4, List<C21536b> list) {
        mo72904a(aVar, i, i2, i3, i4, -1, list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo72914b(C21539a aVar, int i, int i2, int i3, int i4, List<C21536b> list) {
        mo72904a(aVar, i, i2, i3, 0, i4, list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo72913b(C21539a aVar, int i, int i2) {
        mo72904a(aVar, i2, i, Integer.MAX_VALUE, 0, -1, (List<C21536b>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo72904a(C21539a aVar, int i, int i2, int i3, int i4, int i5, List<C21536b> list) {
        int i6;
        C21539a aVar2;
        int i7;
        int i8;
        List<C21536b> list2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        View view;
        int i15;
        int i16;
        int i17;
        C21536b bVar;
        int i18 = i;
        int i19 = i2;
        int i20 = i5;
        boolean a = this.f52316d.mo72814a();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        ArrayList arrayList = list == null ? new ArrayList() : list;
        aVar.f52319a = arrayList;
        boolean z = i20 == -1 ? f52313c : false;
        int a2 = m78005a(a);
        int b = m78018b(a);
        int c = m78022c(a);
        int d = m78024d(a);
        C21536b bVar2 = new C21536b();
        int i21 = i4;
        bVar2.f52311o = i21;
        int i22 = b + a2;
        bVar2.f52301e = i22;
        int flexItemCount = this.f52316d.getFlexItemCount();
        boolean z2 = z;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = Integer.MIN_VALUE;
        while (true) {
            if (i21 >= flexItemCount) {
                i6 = i24;
                aVar2 = aVar;
                break;
            }
            View b2 = this.f52316d.mo72817b(i21);
            if (b2 == null) {
                if (m78012a(i21, flexItemCount, bVar2)) {
                    m78011a(arrayList, bVar2, i21, i23);
                }
            } else if (b2.getVisibility() == 8) {
                bVar2.f52305i++;
                bVar2.f52304h++;
                if (m78012a(i21, flexItemCount, bVar2)) {
                    m78011a(arrayList, bVar2, i21, i23);
                }
            } else {
                FlexItem flexItem = (FlexItem) b2.getLayoutParams();
                if (flexItem.mo72795f() == 4) {
                    bVar2.f52310n.add(Integer.valueOf(i21));
                }
                int a3 = m78004a(flexItem, a);
                if (flexItem.mo72801l() != -1.0f && mode == 1073741824) {
                    a3 = Math.round(((float) size) * flexItem.mo72801l());
                }
                if (a) {
                    int a4 = this.f52316d.mo72806a(i18, i22 + m78021c(flexItem, f52313c) + m78023d(flexItem, f52313c), a3);
                    i8 = size;
                    i7 = mode;
                    int b3 = this.f52316d.mo72816b(i19, c + d + m78025e(flexItem, f52313c) + m78027f(flexItem, f52313c) + i23, m78017b(flexItem, f52313c));
                    b2.measure(a4, b3);
                    m78007a(i21, a4, b3, b2);
                    i13 = a4;
                } else {
                    i8 = size;
                    i7 = mode;
                    int a5 = this.f52316d.mo72806a(i19, c + d + m78025e(flexItem, false) + m78027f(flexItem, false) + i23, m78017b(flexItem, false));
                    int b4 = this.f52316d.mo72816b(i18, m78021c(flexItem, false) + i22 + m78023d(flexItem, false), a3);
                    b2.measure(a5, b4);
                    m78007a(i21, a5, b4, b2);
                    i13 = b4;
                }
                this.f52316d.mo72811a(i21, b2);
                m78009a(b2, i21);
                i24 = View.combineMeasuredStates(i24, b2.getMeasuredState());
                list2 = arrayList;
                if (m78013a(b2, i7, i8, bVar2.f52301e, m78023d(flexItem, a) + m78003a(b2, a) + m78021c(flexItem, a), flexItem, i21, i25, arrayList.size())) {
                    if (bVar2.mo72895c() > 0) {
                        if (i21 > 0) {
                            i17 = i21 - 1;
                            bVar = bVar2;
                        } else {
                            bVar = bVar2;
                            i17 = 0;
                        }
                        m78011a(list2, bVar, i17, i23);
                        i23 = bVar.f52303g + i23;
                    } else {
                        i23 = i23;
                    }
                    if (!a) {
                        i11 = i2;
                        view = b2;
                        i21 = i21;
                        if (flexItem.mo72790a() == -1) {
                            AbstractC21535a aVar3 = this.f52316d;
                            view.measure(aVar3.mo72806a(i11, aVar3.getPaddingLeft() + this.f52316d.getPaddingRight() + flexItem.mo72802m() + flexItem.mo72804o() + i23, flexItem.mo72790a()), i13);
                            m78009a(view, i21);
                        }
                    } else if (flexItem.mo72791b() == -1) {
                        AbstractC21535a aVar4 = this.f52316d;
                        i11 = i2;
                        i21 = i21;
                        view = b2;
                        view.measure(i13, aVar4.mo72816b(i11, aVar4.getPaddingTop() + this.f52316d.getPaddingBottom() + flexItem.mo72803n() + flexItem.mo72805p() + i23, flexItem.mo72791b()));
                        m78009a(view, i21);
                    } else {
                        i11 = i2;
                        view = b2;
                        i21 = i21;
                    }
                    bVar2 = new C21536b();
                    bVar2.f52304h = 1;
                    i10 = i22;
                    bVar2.f52301e = i10;
                    bVar2.f52311o = i21;
                    i15 = 0;
                    i14 = Integer.MIN_VALUE;
                } else {
                    i11 = i2;
                    view = b2;
                    i21 = i21;
                    bVar2 = bVar2;
                    i10 = i22;
                    bVar2.f52304h++;
                    i15 = i25 + 1;
                    i23 = i23;
                    i14 = i26;
                }
                int[] iArr = this.f52314a;
                if (iArr != null) {
                    iArr[i21] = list2.size();
                }
                bVar2.f52301e += m78003a(view, a) + m78021c(flexItem, a) + m78023d(flexItem, a);
                bVar2.f52306j += flexItem.mo72793d();
                bVar2.f52307k += flexItem.mo72794e();
                this.f52316d.mo72812a(view, i21, i15, bVar2);
                int max = Math.max(i14, m78016b(view, a) + m78025e(flexItem, a) + m78027f(flexItem, a) + this.f52316d.mo72807a(view));
                bVar2.f52303g = Math.max(bVar2.f52303g, max);
                if (a) {
                    if (this.f52316d.getFlexWrap() != 2) {
                        bVar2.f52308l = Math.max(bVar2.f52308l, view.getBaseline() + flexItem.mo72803n());
                    } else {
                        bVar2.f52308l = Math.max(bVar2.f52308l, (view.getMeasuredHeight() - view.getBaseline()) + flexItem.mo72805p());
                    }
                }
                i12 = flexItemCount;
                if (m78012a(i21, i12, bVar2)) {
                    m78011a(list2, bVar2, i21, i23);
                    i23 += bVar2.f52303g;
                }
                i9 = i5;
                if (i9 != -1 && list2.size() > 0) {
                    if (list2.get(list2.size() - 1).f52312p >= i9 && i21 >= i9 && !z2) {
                        i23 = -bVar2.mo72892a();
                        i16 = i3;
                        z2 = f52313c;
                        if (i23 <= i16 && z2) {
                            aVar2 = aVar;
                            i6 = i24;
                            break;
                        }
                        i25 = i15;
                        i26 = max;
                        i21++;
                        i18 = i;
                        flexItemCount = i12;
                        i19 = i11;
                        i22 = i10;
                        arrayList = list2;
                        mode = i7;
                        i20 = i9;
                        size = i8;
                    }
                }
                i16 = i3;
                if (i23 <= i16) {
                }
                i25 = i15;
                i26 = max;
                i21++;
                i18 = i;
                flexItemCount = i12;
                i19 = i11;
                i22 = i10;
                arrayList = list2;
                mode = i7;
                i20 = i9;
                size = i8;
            }
            i8 = size;
            i7 = mode;
            i11 = i19;
            i9 = i20;
            list2 = arrayList;
            i10 = i22;
            i12 = flexItemCount;
            i21++;
            i18 = i;
            flexItemCount = i12;
            i19 = i11;
            i22 = i10;
            arrayList = list2;
            mode = i7;
            i20 = i9;
            size = i8;
        }
        aVar2.f52320b = i6;
    }

    /* renamed from: a */
    private boolean m78013a(View view, int i, int i2, int i3, int i4, FlexItem flexItem, int i5, int i6, int i7) {
        if (this.f52316d.getFlexWrap() == 0) {
            return false;
        }
        if (flexItem.mo72800k()) {
            return f52313c;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.f52316d.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int a = this.f52316d.mo72808a(view, i5, i6);
        if (a > 0) {
            i4 += a;
        }
        if (i2 < i3 + i4) {
            return f52313c;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m78012a(int i, int i2, C21536b bVar) {
        if (i != i2 - 1 || bVar.mo72895c() == 0) {
            return false;
        }
        return f52313c;
    }

    /* renamed from: a */
    private void m78011a(List<C21536b> list, C21536b bVar, int i, int i2) {
        bVar.f52309m = i2;
        this.f52316d.mo72813a(bVar);
        bVar.f52312p = i;
        list.add(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo72899a(int i, int i2) {
        mo72900a(i, i2, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo72900a(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        m78028f(this.f52316d.getFlexItemCount());
        if (i3 < this.f52316d.getFlexItemCount()) {
            int flexDirection = this.f52316d.getFlexDirection();
            int flexDirection2 = this.f52316d.getFlexDirection();
            if (flexDirection2 == 0 || flexDirection2 == 1) {
                int mode = View.MeasureSpec.getMode(i);
                i5 = View.MeasureSpec.getSize(i);
                if (mode != 1073741824) {
                    i5 = this.f52316d.getLargestMainSize();
                }
                i6 = this.f52316d.getPaddingLeft();
                i4 = this.f52316d.getPaddingRight();
            } else if (flexDirection2 == 2 || flexDirection2 == 3) {
                int mode2 = View.MeasureSpec.getMode(i2);
                i5 = View.MeasureSpec.getSize(i2);
                if (mode2 != 1073741824) {
                    i5 = this.f52316d.getLargestMainSize();
                }
                i6 = this.f52316d.getPaddingTop();
                i4 = this.f52316d.getPaddingBottom();
            } else {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int i7 = i6 + i4;
            int i8 = 0;
            int[] iArr = this.f52314a;
            if (iArr != null) {
                i8 = iArr[i3];
            }
            List<C21536b> flexLinesInternal = this.f52316d.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i9 = i8; i9 < size; i9++) {
                C21536b bVar = flexLinesInternal.get(i9);
                if (bVar.f52301e < i5) {
                    m78008a(i, i2, bVar, i5, i7, false);
                } else {
                    m78019b(i, i2, bVar, i5, i7, false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo72898a(int i) {
        View b;
        if (i < this.f52316d.getFlexItemCount()) {
            int flexDirection = this.f52316d.getFlexDirection();
            if (this.f52316d.getAlignItems() == 4) {
                int[] iArr = this.f52314a;
                List<C21536b> flexLinesInternal = this.f52316d.getFlexLinesInternal();
                int size = flexLinesInternal.size();
                for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
                    C21536b bVar = flexLinesInternal.get(i2);
                    int i3 = bVar.f52304h;
                    for (int i4 = 0; i4 < i3; i4++) {
                        int i5 = bVar.f52311o + i4;
                        if (!(i4 >= this.f52316d.getFlexItemCount() || (b = this.f52316d.mo72817b(i5)) == null || b.getVisibility() == 8)) {
                            FlexItem flexItem = (FlexItem) b.getLayoutParams();
                            if (flexItem.mo72795f() == -1 || flexItem.mo72795f() == 4) {
                                if (flexDirection == 0 || flexDirection == 1) {
                                    m78010a(b, bVar.f52303g, i5);
                                } else if (flexDirection == 2 || flexDirection == 3) {
                                    m78020b(b, bVar.f52303g, i5);
                                } else {
                                    throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                                }
                            }
                        }
                    }
                }
                return;
            }
            for (C21536b bVar2 : this.f52316d.getFlexLinesInternal()) {
                Iterator<Integer> it = bVar2.f52310n.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer next = it.next();
                        View b2 = this.f52316d.mo72817b(next.intValue());
                        if (flexDirection == 0 || flexDirection == 1) {
                            m78010a(b2, bVar2.f52303g, next.intValue());
                        } else if (flexDirection == 2 || flexDirection == 3) {
                            m78020b(b2, bVar2.f52303g, next.intValue());
                        } else {
                            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo72901a(View view, C21536b bVar, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f52316d.getAlignItems();
        if (flexItem.mo72795f() != -1) {
            alignItems = flexItem.mo72795f();
        }
        int i5 = bVar.f52303g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.mo72803n()) - flexItem.mo72805p()) / 2;
                    if (this.f52316d.getFlexWrap() != 2) {
                        int i6 = i2 + measuredHeight;
                        view.layout(i, i6, i3, view.getMeasuredHeight() + i6);
                        return;
                    }
                    int i7 = i2 - measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else if (alignItems != 3) {
                    if (alignItems != 4) {
                        return;
                    }
                } else if (this.f52316d.getFlexWrap() != 2) {
                    int max = Math.max(bVar.f52308l - view.getBaseline(), flexItem.mo72803n());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max((bVar.f52308l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.mo72805p());
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            } else if (this.f52316d.getFlexWrap() != 2) {
                int i8 = i2 + i5;
                view.layout(i, (i8 - view.getMeasuredHeight()) - flexItem.mo72805p(), i3, i8 - flexItem.mo72805p());
                return;
            } else {
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + flexItem.mo72803n(), i3, (i4 - i5) + view.getMeasuredHeight() + flexItem.mo72803n());
                return;
            }
        }
        if (this.f52316d.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.mo72803n(), i3, i4 + flexItem.mo72803n());
        } else {
            view.layout(i, i2 - flexItem.mo72805p(), i3, i4 - flexItem.mo72805p());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo72902a(View view, C21536b bVar, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f52316d.getAlignItems();
        if (flexItem.mo72795f() != -1) {
            alignItems = flexItem.mo72795f();
        }
        int i5 = bVar.f52303g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int measuredWidth = (((i5 - view.getMeasuredWidth()) + C0906h.m4355a(marginLayoutParams)) - C0906h.m4357b(marginLayoutParams)) / 2;
                    if (!z) {
                        view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                        return;
                    } else {
                        view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                        return;
                    }
                } else if (!(alignItems == 3 || alignItems == 4)) {
                    return;
                }
            } else if (!z) {
                view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.mo72804o(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.mo72804o(), i4);
                return;
            } else {
                view.layout((i - i5) + view.getMeasuredWidth() + flexItem.mo72802m(), i2, (i3 - i5) + view.getMeasuredWidth() + flexItem.mo72802m(), i4);
                return;
            }
        }
        if (!z) {
            view.layout(i + flexItem.mo72802m(), i2, i3 + flexItem.mo72802m(), i4);
        } else {
            view.layout(i - flexItem.mo72804o(), i2, i3 - flexItem.mo72804o(), i4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo72906a(List<C21536b> list, int i) {
        boolean z = f52313c;
        if (!z && this.f52314a == null) {
            throw new AssertionError();
        } else if (z || this.f52315b != null) {
            int i2 = this.f52314a[i];
            if (i2 == -1) {
                i2 = 0;
            }
            for (int size = list.size() - 1; size >= i2; size--) {
                list.remove(size);
            }
            int[] iArr = this.f52314a;
            int length = iArr.length - 1;
            if (i > length) {
                Arrays.fill(iArr, -1);
            } else {
                Arrays.fill(iArr, i, length, -1);
            }
            long[] jArr = this.f52315b;
            int length2 = jArr.length - 1;
            if (i > length2) {
                Arrays.fill(jArr, 0L);
            } else {
                Arrays.fill(jArr, i, length2, 0L);
            }
        } else {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo72897a() {
        mo72898a(0);
    }

    C21537c(AbstractC21535a aVar) {
        this.f52316d = aVar;
    }

    /* renamed from: c */
    private int m78022c(boolean z) {
        if (z) {
            return this.f52316d.getPaddingTop();
        }
        return this.f52316d.getPaddingStart();
    }

    /* renamed from: d */
    private int m78024d(boolean z) {
        if (z) {
            return this.f52316d.getPaddingBottom();
        }
        return this.f52316d.getPaddingEnd();
    }

    /* renamed from: a */
    private int m78005a(boolean z) {
        if (z) {
            return this.f52316d.getPaddingStart();
        }
        return this.f52316d.getPaddingTop();
    }

    /* renamed from: b */
    private int m78018b(boolean z) {
        if (z) {
            return this.f52316d.getPaddingEnd();
        }
        return this.f52316d.getPaddingBottom();
    }

    /* renamed from: e */
    private List<C21540b> m78026e(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            C21540b bVar = new C21540b();
            bVar.f52322b = ((FlexItem) this.f52316d.mo72809a(i2).getLayoutParams()).mo72792c();
            bVar.f52321a = i2;
            arrayList.add(bVar);
        }
        return arrayList;
    }

    /* renamed from: f */
    private void m78028f(int i) {
        boolean[] zArr = this.f52317e;
        if (zArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f52317e = new boolean[i];
        } else if (zArr.length < i) {
            int length = zArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f52317e = new boolean[i];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo72916c(int i) {
        long[] jArr = this.f52315b;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f52315b = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f52315b = Arrays.copyOf(jArr, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo72918d(int i) {
        int[] iArr = this.f52314a;
        if (iArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f52314a = new int[i];
        } else if (iArr.length < i) {
            int length = iArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f52314a = Arrays.copyOf(iArr, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo72911b(int i) {
        long[] jArr = this.f52318f;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f52318f = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f52318f = Arrays.copyOf(jArr, i);
        }
    }

    /* renamed from: a */
    private int m78003a(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    /* renamed from: b */
    private int m78016b(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    /* renamed from: c */
    private int m78021c(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo72802m();
        }
        return flexItem.mo72803n();
    }

    /* renamed from: d */
    private int m78023d(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo72804o();
        }
        return flexItem.mo72805p();
    }

    /* renamed from: e */
    private int m78025e(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo72803n();
        }
        return flexItem.mo72802m();
    }

    /* renamed from: f */
    private int m78027f(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo72805p();
        }
        return flexItem.mo72804o();
    }

    /* renamed from: a */
    private int m78004a(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo72790a();
        }
        return flexItem.mo72791b();
    }

    /* renamed from: b */
    private int m78017b(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo72791b();
        }
        return flexItem.mo72790a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m78009a(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.mo72796g()
            r4 = 1
            if (r1 >= r3) goto L_0x001b
            int r1 = r0.mo72796g()
        L_0x0019:
            r3 = 1
            goto L_0x0027
        L_0x001b:
            int r3 = r0.mo72798i()
            if (r1 <= r3) goto L_0x0026
            int r1 = r0.mo72798i()
            goto L_0x0019
        L_0x0026:
            r3 = 0
        L_0x0027:
            int r5 = r0.mo72797h()
            if (r2 >= r5) goto L_0x0032
            int r2 = r0.mo72797h()
            goto L_0x003e
        L_0x0032:
            int r5 = r0.mo72799j()
            if (r2 <= r5) goto L_0x003d
            int r2 = r0.mo72799j()
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x0055
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.m78007a(r8, r1, r0, r7)
            com.google.android.flexbox.a r0 = r6.f52316d
            r0.mo72811a(r8, r7)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.C21537c.m78009a(android.view.View, int):void");
    }

    /* renamed from: a */
    private int m78002a(int i, FlexItem flexItem, int i2) {
        AbstractC21535a aVar = this.f52316d;
        int a = aVar.mo72806a(i, aVar.getPaddingLeft() + this.f52316d.getPaddingRight() + flexItem.mo72802m() + flexItem.mo72804o() + i2, flexItem.mo72790a());
        int size = View.MeasureSpec.getSize(a);
        if (size > flexItem.mo72798i()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo72798i(), View.MeasureSpec.getMode(a));
        }
        if (size < flexItem.mo72796g()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo72796g(), View.MeasureSpec.getMode(a));
        }
        return a;
    }

    /* renamed from: b */
    private int m78015b(int i, FlexItem flexItem, int i2) {
        AbstractC21535a aVar = this.f52316d;
        int b = aVar.mo72816b(i, aVar.getPaddingTop() + this.f52316d.getPaddingBottom() + flexItem.mo72803n() + flexItem.mo72805p() + i2, flexItem.mo72791b());
        int size = View.MeasureSpec.getSize(b);
        if (size > flexItem.mo72799j()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo72799j(), View.MeasureSpec.getMode(b));
        }
        if (size < flexItem.mo72797h()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo72797h(), View.MeasureSpec.getMode(b));
        }
        return b;
    }

    /* renamed from: a */
    private List<C21536b> m78006a(List<C21536b> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        C21536b bVar = new C21536b();
        bVar.f52303g = (i - i2) / 2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 == 0) {
                arrayList.add(bVar);
            }
            arrayList.add(list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private void m78020b(View view, int i, int i2) {
        int i3;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.mo72802m()) - flexItem.mo72804o()) - this.f52316d.mo72807a(view), flexItem.mo72796g()), flexItem.mo72798i());
        long[] jArr = this.f52318f;
        if (jArr != null) {
            i3 = mo72909b(jArr[i2]);
        } else {
            i3 = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        m78007a(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.f52316d.mo72811a(i2, view);
    }

    /* renamed from: a */
    private void m78010a(View view, int i, int i2) {
        int i3;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.mo72803n()) - flexItem.mo72805p()) - this.f52316d.mo72807a(view), flexItem.mo72797h()), flexItem.mo72799j());
        long[] jArr = this.f52318f;
        if (jArr != null) {
            i3 = mo72896a(jArr[i2]);
        } else {
            i3 = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        m78007a(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.f52316d.mo72811a(i2, view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo72912b(int i, int i2, int i3) {
        int i4;
        int i5;
        int flexDirection = this.f52316d.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        } else if (flexDirection == 2 || flexDirection == 3) {
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
        }
        List<C21536b> flexLinesInternal = this.f52316d.getFlexLinesInternal();
        if (i4 == 1073741824) {
            int sumOfCrossSize = this.f52316d.getSumOfCrossSize() + i3;
            int i6 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f52303g = i5 - i3;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f52316d.getAlignContent();
                if (alignContent == 1) {
                    int i7 = i5 - sumOfCrossSize;
                    C21536b bVar = new C21536b();
                    bVar.f52303g = i7;
                    flexLinesInternal.add(0, bVar);
                } else if (alignContent == 2) {
                    this.f52316d.setFlexLines(m78006a(flexLinesInternal, i5, sumOfCrossSize));
                } else if (alignContent != 3) {
                    if (alignContent != 4) {
                        if (alignContent == 5 && sumOfCrossSize < i5) {
                            float size2 = ((float) (i5 - sumOfCrossSize)) / ((float) flexLinesInternal.size());
                            int size3 = flexLinesInternal.size();
                            float f = BitmapDescriptorFactory.HUE_RED;
                            while (i6 < size3) {
                                C21536b bVar2 = flexLinesInternal.get(i6);
                                float f2 = ((float) bVar2.f52303g) + size2;
                                if (i6 == flexLinesInternal.size() - 1) {
                                    f2 += f;
                                    f = BitmapDescriptorFactory.HUE_RED;
                                }
                                int round = Math.round(f2);
                                f += f2 - ((float) round);
                                if (f > 1.0f) {
                                    round++;
                                    f -= 1.0f;
                                } else if (f < -1.0f) {
                                    round--;
                                    f += 1.0f;
                                }
                                bVar2.f52303g = round;
                                i6++;
                            }
                        }
                    } else if (sumOfCrossSize >= i5) {
                        this.f52316d.setFlexLines(m78006a(flexLinesInternal, i5, sumOfCrossSize));
                    } else {
                        int size4 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                        ArrayList arrayList = new ArrayList();
                        C21536b bVar3 = new C21536b();
                        bVar3.f52303g = size4;
                        for (C21536b bVar4 : flexLinesInternal) {
                            arrayList.add(bVar3);
                            arrayList.add(bVar4);
                            arrayList.add(bVar3);
                        }
                        this.f52316d.setFlexLines(arrayList);
                    }
                } else if (sumOfCrossSize < i5) {
                    float size5 = ((float) (i5 - sumOfCrossSize)) / ((float) (flexLinesInternal.size() - 1));
                    ArrayList arrayList2 = new ArrayList();
                    int size6 = flexLinesInternal.size();
                    float f3 = BitmapDescriptorFactory.HUE_RED;
                    while (i6 < size6) {
                        arrayList2.add(flexLinesInternal.get(i6));
                        if (i6 != flexLinesInternal.size() - 1) {
                            C21536b bVar5 = new C21536b();
                            if (i6 == flexLinesInternal.size() - 2) {
                                bVar5.f52303g = Math.round(f3 + size5);
                                f3 = BitmapDescriptorFactory.HUE_RED;
                            } else {
                                bVar5.f52303g = Math.round(size5);
                            }
                            f3 += size5 - ((float) bVar5.f52303g);
                            if (f3 > 1.0f) {
                                bVar5.f52303g++;
                                f3 -= 1.0f;
                            } else if (f3 < -1.0f) {
                                bVar5.f52303g--;
                                f3 += 1.0f;
                            }
                            arrayList2.add(bVar5);
                        }
                        i6++;
                    }
                    this.f52316d.setFlexLines(arrayList2);
                }
            }
        }
    }

    /* renamed from: a */
    private void m78007a(int i, int i2, int i3, View view) {
        long[] jArr = this.f52315b;
        if (jArr != null) {
            jArr[i] = mo72910b(i2, i3);
        }
        long[] jArr2 = this.f52318f;
        if (jArr2 != null) {
            jArr2[i] = mo72910b(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo72917c(C21539a aVar, int i, int i2, int i3, int i4, List<C21536b> list) {
        mo72904a(aVar, i2, i, i3, i4, -1, list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo72919d(C21539a aVar, int i, int i2, int i3, int i4, List<C21536b> list) {
        mo72904a(aVar, i2, i, i3, 0, i4, list);
    }

    /* renamed from: a */
    private void m78008a(int i, int i2, C21536b bVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        double d;
        int i7;
        double d2;
        float f = bVar.f52306j;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (f > BitmapDescriptorFactory.HUE_RED && i3 >= bVar.f52301e) {
            int i8 = bVar.f52301e;
            float f3 = ((float) (i3 - bVar.f52301e)) / bVar.f52306j;
            bVar.f52301e = i4 + bVar.f52302f;
            if (!z) {
                bVar.f52303g = Integer.MIN_VALUE;
            }
            int i9 = 0;
            boolean z2 = false;
            int i10 = 0;
            float f4 = BitmapDescriptorFactory.HUE_RED;
            while (i9 < bVar.f52304h) {
                int i11 = bVar.f52311o + i9;
                View b = this.f52316d.mo72817b(i11);
                if (b == null || b.getVisibility() == 8) {
                    i5 = i8;
                } else {
                    FlexItem flexItem = (FlexItem) b.getLayoutParams();
                    int flexDirection = this.f52316d.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        int measuredWidth = b.getMeasuredWidth();
                        long[] jArr = this.f52318f;
                        if (jArr != null) {
                            measuredWidth = mo72896a(jArr[i11]);
                        }
                        int measuredHeight = b.getMeasuredHeight();
                        long[] jArr2 = this.f52318f;
                        i5 = i8;
                        if (jArr2 != null) {
                            measuredHeight = mo72909b(jArr2[i11]);
                        }
                        if (!this.f52317e[i11] && flexItem.mo72793d() > BitmapDescriptorFactory.HUE_RED) {
                            float d3 = ((float) measuredWidth) + (flexItem.mo72793d() * f3);
                            if (i9 == bVar.f52304h - 1) {
                                d3 += f4;
                                f4 = BitmapDescriptorFactory.HUE_RED;
                            }
                            int round = Math.round(d3);
                            if (round > flexItem.mo72798i()) {
                                round = flexItem.mo72798i();
                                this.f52317e[i11] = f52313c;
                                bVar.f52306j -= flexItem.mo72793d();
                                z2 = f52313c;
                            } else {
                                f4 += d3 - ((float) round);
                                double d4 = (double) f4;
                                if (d4 > 1.0d) {
                                    round++;
                                    d = d4 - 1.0d;
                                } else if (d4 < -1.0d) {
                                    round--;
                                    d = d4 + 1.0d;
                                }
                                f4 = (float) d;
                            }
                            int b2 = m78015b(i2, flexItem, bVar.f52309m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            b.measure(makeMeasureSpec, b2);
                            int measuredWidth2 = b.getMeasuredWidth();
                            int measuredHeight2 = b.getMeasuredHeight();
                            m78007a(i11, makeMeasureSpec, b2, b);
                            this.f52316d.mo72811a(i11, b);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i10, measuredHeight + flexItem.mo72803n() + flexItem.mo72805p() + this.f52316d.mo72807a(b));
                        bVar.f52301e += measuredWidth + flexItem.mo72802m() + flexItem.mo72804o();
                        i6 = max;
                    } else {
                        int measuredHeight3 = b.getMeasuredHeight();
                        long[] jArr3 = this.f52318f;
                        if (jArr3 != null) {
                            measuredHeight3 = mo72909b(jArr3[i11]);
                        }
                        int measuredWidth3 = b.getMeasuredWidth();
                        long[] jArr4 = this.f52318f;
                        if (jArr4 != null) {
                            measuredWidth3 = mo72896a(jArr4[i11]);
                        }
                        if (this.f52317e[i11] || flexItem.mo72793d() <= f2) {
                            i7 = i8;
                        } else {
                            float d5 = ((float) measuredHeight3) + (flexItem.mo72793d() * f3);
                            if (i9 == bVar.f52304h - 1) {
                                d5 += f4;
                                f4 = BitmapDescriptorFactory.HUE_RED;
                            }
                            int round2 = Math.round(d5);
                            if (round2 > flexItem.mo72799j()) {
                                round2 = flexItem.mo72799j();
                                this.f52317e[i11] = f52313c;
                                bVar.f52306j -= flexItem.mo72793d();
                                i7 = i8;
                                z2 = f52313c;
                            } else {
                                f4 += d5 - ((float) round2);
                                i7 = i8;
                                double d6 = (double) f4;
                                if (d6 > 1.0d) {
                                    round2++;
                                    d2 = d6 - 1.0d;
                                } else if (d6 < -1.0d) {
                                    round2--;
                                    d2 = d6 + 1.0d;
                                }
                                f4 = (float) d2;
                            }
                            int a = m78002a(i, flexItem, bVar.f52309m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            b.measure(a, makeMeasureSpec2);
                            measuredWidth3 = b.getMeasuredWidth();
                            int measuredHeight4 = b.getMeasuredHeight();
                            m78007a(i11, a, makeMeasureSpec2, b);
                            this.f52316d.mo72811a(i11, b);
                            measuredHeight3 = measuredHeight4;
                        }
                        i6 = Math.max(i10, measuredWidth3 + flexItem.mo72802m() + flexItem.mo72804o() + this.f52316d.mo72807a(b));
                        bVar.f52301e += measuredHeight3 + flexItem.mo72803n() + flexItem.mo72805p();
                        i5 = i7;
                    }
                    bVar.f52303g = Math.max(bVar.f52303g, i6);
                    i10 = i6;
                }
                i9++;
                i8 = i5;
                f2 = BitmapDescriptorFactory.HUE_RED;
            }
            if (z2 && i8 != bVar.f52301e) {
                m78008a(i, i2, bVar, i3, i4, f52313c);
            }
        }
    }

    /* renamed from: b */
    private void m78019b(int i, int i2, C21536b bVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7 = bVar.f52301e;
        float f = bVar.f52307k;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (f > BitmapDescriptorFactory.HUE_RED && i3 <= bVar.f52301e) {
            float f3 = ((float) (bVar.f52301e - i3)) / bVar.f52307k;
            bVar.f52301e = i4 + bVar.f52302f;
            if (!z) {
                bVar.f52303g = Integer.MIN_VALUE;
            }
            int i8 = 0;
            boolean z2 = false;
            int i9 = 0;
            float f4 = BitmapDescriptorFactory.HUE_RED;
            while (i8 < bVar.f52304h) {
                int i10 = bVar.f52311o + i8;
                View b = this.f52316d.mo72817b(i10);
                if (b == null || b.getVisibility() == 8) {
                    i5 = i8;
                } else {
                    FlexItem flexItem = (FlexItem) b.getLayoutParams();
                    int flexDirection = this.f52316d.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        i5 = i8;
                        int measuredWidth = b.getMeasuredWidth();
                        long[] jArr = this.f52318f;
                        if (jArr != null) {
                            measuredWidth = mo72896a(jArr[i10]);
                        }
                        int measuredHeight = b.getMeasuredHeight();
                        long[] jArr2 = this.f52318f;
                        if (jArr2 != null) {
                            measuredHeight = mo72909b(jArr2[i10]);
                        }
                        if (!this.f52317e[i10] && flexItem.mo72794e() > BitmapDescriptorFactory.HUE_RED) {
                            float e = ((float) measuredWidth) - (flexItem.mo72794e() * f3);
                            if (i5 == bVar.f52304h - 1) {
                                e += f4;
                                f4 = BitmapDescriptorFactory.HUE_RED;
                            }
                            int round = Math.round(e);
                            if (round < flexItem.mo72796g()) {
                                round = flexItem.mo72796g();
                                this.f52317e[i10] = f52313c;
                                bVar.f52307k -= flexItem.mo72794e();
                                z2 = f52313c;
                            } else {
                                f4 += e - ((float) round);
                                double d = (double) f4;
                                if (d > 1.0d) {
                                    round++;
                                    f4 -= 1.0f;
                                } else if (d < -1.0d) {
                                    round--;
                                    f4 += 1.0f;
                                }
                            }
                            int b2 = m78015b(i2, flexItem, bVar.f52309m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            b.measure(makeMeasureSpec, b2);
                            int measuredWidth2 = b.getMeasuredWidth();
                            int measuredHeight2 = b.getMeasuredHeight();
                            m78007a(i10, makeMeasureSpec, b2, b);
                            this.f52316d.mo72811a(i10, b);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i9, measuredHeight + flexItem.mo72803n() + flexItem.mo72805p() + this.f52316d.mo72807a(b));
                        bVar.f52301e += measuredWidth + flexItem.mo72802m() + flexItem.mo72804o();
                        i6 = max;
                    } else {
                        int measuredHeight3 = b.getMeasuredHeight();
                        long[] jArr3 = this.f52318f;
                        if (jArr3 != null) {
                            measuredHeight3 = mo72909b(jArr3[i10]);
                        }
                        int measuredWidth3 = b.getMeasuredWidth();
                        long[] jArr4 = this.f52318f;
                        if (jArr4 != null) {
                            measuredWidth3 = mo72896a(jArr4[i10]);
                        }
                        if (this.f52317e[i10] || flexItem.mo72794e() <= f2) {
                            i5 = i8;
                        } else {
                            float e2 = ((float) measuredHeight3) - (flexItem.mo72794e() * f3);
                            if (i8 == bVar.f52304h - 1) {
                                e2 += f4;
                                f4 = BitmapDescriptorFactory.HUE_RED;
                            }
                            int round2 = Math.round(e2);
                            if (round2 < flexItem.mo72797h()) {
                                round2 = flexItem.mo72797h();
                                this.f52317e[i10] = f52313c;
                                bVar.f52307k -= flexItem.mo72794e();
                                i5 = i8;
                                z2 = f52313c;
                            } else {
                                f4 += e2 - ((float) round2);
                                i5 = i8;
                                double d2 = (double) f4;
                                if (d2 > 1.0d) {
                                    round2++;
                                    f4 -= 1.0f;
                                } else if (d2 < -1.0d) {
                                    round2--;
                                    f4 += 1.0f;
                                }
                            }
                            int a = m78002a(i, flexItem, bVar.f52309m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            b.measure(a, makeMeasureSpec2);
                            measuredWidth3 = b.getMeasuredWidth();
                            int measuredHeight4 = b.getMeasuredHeight();
                            m78007a(i10, a, makeMeasureSpec2, b);
                            this.f52316d.mo72811a(i10, b);
                            measuredHeight3 = measuredHeight4;
                        }
                        i6 = Math.max(i9, measuredWidth3 + flexItem.mo72802m() + flexItem.mo72804o() + this.f52316d.mo72807a(b));
                        bVar.f52301e += measuredHeight3 + flexItem.mo72803n() + flexItem.mo72805p();
                    }
                    bVar.f52303g = Math.max(bVar.f52303g, i6);
                    i9 = i6;
                }
                i8 = i5 + 1;
                f2 = BitmapDescriptorFactory.HUE_RED;
            }
            if (z2 && i7 != bVar.f52301e) {
                m78019b(i, i2, bVar, i3, i4, f52313c);
            }
        }
    }
}
