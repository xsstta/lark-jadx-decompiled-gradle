package com.ss.android.appcenter.engine.vlayout.p1301a;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.appcenter.engine.vlayout.AbstractC28282e;
import com.ss.android.appcenter.engine.vlayout.VirtualLayoutManager;

/* renamed from: com.ss.android.appcenter.engine.vlayout.a.g */
public class C28270g extends AbstractC28263b {

    /* renamed from: D */
    private static final int f70985D = View.MeasureSpec.makeMeasureSpec(0, 0);

    /* renamed from: e */
    private static boolean f70986e;

    /* renamed from: A */
    private View[] f70987A;

    /* renamed from: B */
    private int[] f70988B;

    /* renamed from: C */
    private int[] f70989C;

    /* renamed from: E */
    private boolean f70990E;

    /* renamed from: f */
    private int f70991f;

    /* renamed from: g */
    private int f70992g;

    /* renamed from: u */
    private int f70993u;

    /* renamed from: v */
    private boolean f70994v;

    /* renamed from: w */
    private AbstractC28272b f70995w;

    /* renamed from: x */
    private int f70996x;

    /* renamed from: y */
    private int f70997y;

    /* renamed from: z */
    private float[] f70998z;

    /* renamed from: com.ss.android.appcenter.engine.vlayout.a.g$a */
    static final class C28271a extends AbstractC28272b {
        @Override // com.ss.android.appcenter.engine.vlayout.p1301a.C28270g.AbstractC28272b
        /* renamed from: a */
        public int mo100747a(int i) {
            return 1;
        }

        C28271a() {
        }

        @Override // com.ss.android.appcenter.engine.vlayout.p1301a.C28270g.AbstractC28272b
        /* renamed from: a */
        public int mo100748a(int i, int i2) {
            return (i - this.f71000b) % i2;
        }
    }

    /* renamed from: com.ss.android.appcenter.engine.vlayout.a.g$b */
    public static abstract class AbstractC28272b {

        /* renamed from: a */
        final SparseIntArray f70999a = new SparseIntArray();

        /* renamed from: b */
        int f71000b = 0;

        /* renamed from: c */
        private boolean f71001c = false;

        /* renamed from: a */
        public abstract int mo100747a(int i);

        /* renamed from: a */
        public void mo100749a() {
            this.f70999a.clear();
        }

        /* renamed from: b */
        public void mo100752b(int i) {
            this.f71000b = i;
        }

        /* renamed from: a */
        public void mo100750a(boolean z) {
            this.f71001c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo100753c(int i) {
            int size = this.f70999a.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (this.f70999a.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= this.f70999a.size()) {
                return -1;
            }
            return this.f70999a.keyAt(i4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo100751b(int i, int i2) {
            if (!this.f71001c) {
                return mo100748a(i, i2);
            }
            int i3 = this.f70999a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int a = mo100748a(i, i2);
            this.f70999a.put(i, a);
            return a;
        }

        /* renamed from: a */
        public int mo100748a(int i, int i2) {
            int i3;
            int c;
            int a = mo100747a(i);
            if (a == i2) {
                return 0;
            }
            int i4 = this.f71000b;
            if (!this.f71001c || this.f70999a.size() <= 0 || (c = mo100753c(i)) < 0) {
                i3 = 0;
            } else {
                int i5 = c + 1;
                i3 = this.f70999a.get(c) + mo100747a(c);
                i4 = i5;
            }
            while (i4 < i) {
                int a2 = mo100747a(i4);
                i3 += a2;
                if (i3 == i2) {
                    i3 = 0;
                } else if (i3 > i2) {
                    i3 = a2;
                }
                i4++;
            }
            if (a + i3 <= i2) {
                return i3;
            }
            return 0;
        }
    }

    /* renamed from: d */
    private void m103636d() {
        View[] viewArr = this.f70987A;
        if (viewArr == null || viewArr.length != this.f70991f) {
            this.f70987A = new View[this.f70991f];
        }
        int[] iArr = this.f70988B;
        if (iArr == null || iArr.length != this.f70991f) {
            this.f70988B = new int[this.f70991f];
        }
        int[] iArr2 = this.f70989C;
        if (iArr2 == null || iArr2.length != this.f70991f) {
            this.f70989C = new int[this.f70991f];
        }
    }

    /* renamed from: a */
    public void mo100742a(boolean z) {
        this.f70994v = z;
    }

    public C28270g(int i) {
        this(i, -1, -1);
    }

    /* renamed from: e */
    public void mo100745e(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f70996x = i;
    }

    /* renamed from: f */
    public void mo100746f(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f70997y = i;
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28280c
    /* renamed from: a */
    public void mo100741a(AbstractC28282e eVar) {
        super.mo100741a(eVar);
        this.f70995w.mo100749a();
    }

    @Override // com.ss.android.appcenter.engine.vlayout.p1301a.AbstractC28263b
    /* renamed from: c */
    public void mo100734c(AbstractC28282e eVar) {
        super.mo100734c(eVar);
        this.f70995w.mo100749a();
    }

    /* renamed from: d */
    public void mo100744d(int i) {
        if (i != this.f70991f) {
            if (i >= 1) {
                this.f70991f = i;
                this.f70995w.mo100749a();
                m103636d();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28280c
    /* renamed from: b */
    public void mo100743b(int i, int i2) {
        this.f70995w.mo100752b(i);
        this.f70995w.mo100749a();
    }

    public C28270g(int i, int i2, int i3) {
        this(i, i2, i3, i3);
    }

    /* renamed from: b */
    private int m103635b(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.isPreLayout()) {
            return this.f70995w.mo100747a(i);
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout == -1) {
            return 0;
        }
        return this.f70995w.mo100747a(convertPreLayoutPositionToPostLayout);
    }

    /* renamed from: a */
    private int m103633a(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.isPreLayout()) {
            return this.f70995w.mo100751b(i, this.f70991f);
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout == -1) {
            return 0;
        }
        return this.f70995w.mo100751b(convertPreLayoutPositionToPostLayout, this.f70991f);
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28280c
    /* renamed from: a */
    public void mo100714a(RecyclerView.State state, VirtualLayoutManager.C28257a aVar, AbstractC28282e eVar) {
        if (state.getItemCount() > 0 && !state.isPreLayout()) {
            int b = this.f70995w.mo100751b(aVar.f70959a, this.f70991f);
            if (aVar.f70961c) {
                while (b < this.f70991f - 1 && aVar.f70959a < mo100772a().mo100812b().intValue()) {
                    aVar.f70959a++;
                    b = this.f70995w.mo100751b(aVar.f70959a, this.f70991f);
                }
            } else {
                while (b > 0 && aVar.f70959a > 0) {
                    aVar.f70959a--;
                    b = this.f70995w.mo100751b(aVar.f70959a, this.f70991f);
                }
            }
            this.f70990E = true;
        }
    }

    public C28270g(int i, int i2, int i3, int i4) {
        this.f70991f = 4;
        this.f70994v = true;
        this.f70995w = new C28271a();
        this.f70996x = 0;
        this.f70997y = 0;
        this.f70998z = new float[0];
        this.f70990E = false;
        mo100744d(i);
        this.f70995w.mo100750a(true);
        mo100732b(i2);
        mo100745e(i3);
        mo100746f(i4);
    }

    /* renamed from: a */
    private int m103632a(int i, int i2, int i3, float f) {
        if (!Float.isNaN(f) && f > BitmapDescriptorFactory.HUE_RED && i3 > 0) {
            return View.MeasureSpec.makeMeasureSpec((int) ((((float) i3) / f) + 0.5f), 1073741824);
        }
        if (!Float.isNaN(this.f70974l) && this.f70974l > BitmapDescriptorFactory.HUE_RED) {
            return View.MeasureSpec.makeMeasureSpec((int) ((((float) i2) / this.f70974l) + 0.5f), 1073741824);
        }
        if (i < 0) {
            return f70985D;
        }
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28280c, com.ss.android.appcenter.engine.vlayout.p1301a.AbstractC28275j
    /* renamed from: a */
    public int mo100710a(int i, boolean z, boolean z2, AbstractC28282e eVar) {
        boolean z3;
        int i2;
        int i3;
        int i4;
        int i5;
        if (eVar.getOrientation() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            if (i == mo100730b() - 1) {
                if (z3) {
                    i5 = this.f71015t;
                    i4 = this.f71011p;
                } else {
                    i5 = this.f71013r;
                    i4 = this.f71009n;
                }
                return i5 + i4;
            }
        } else if (i == 0) {
            if (z3) {
                i3 = -this.f71014s;
                i2 = this.f71010o;
            } else {
                i3 = -this.f71012q;
                i2 = this.f71008m;
            }
            return i3 - i2;
        }
        return super.mo100710a(i, z, z2, eVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x021b, code lost:
        if (r0 == mo100772a().mo100812b().intValue()) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x022e, code lost:
        if (r0 == mo100772a().mo100809a().intValue()) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0232, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x024e, code lost:
        if (r0 == mo100772a().mo100809a().intValue()) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x025f, code lost:
        if (r0 == mo100772a().mo100812b().intValue()) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0263, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x029a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01ed  */
    @Override // com.ss.android.appcenter.engine.vlayout.p1301a.AbstractC28263b
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo100718b(androidx.recyclerview.widget.RecyclerView.Recycler r30, androidx.recyclerview.widget.RecyclerView.State r31, com.ss.android.appcenter.engine.vlayout.VirtualLayoutManager.C28259c r32, com.ss.android.appcenter.engine.vlayout.p1301a.C28273h r33, com.ss.android.appcenter.engine.vlayout.AbstractC28282e r34) {
        /*
        // Method dump skipped, instructions count: 1638
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.appcenter.engine.vlayout.p1301a.C28270g.mo100718b(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, com.ss.android.appcenter.engine.vlayout.VirtualLayoutManager$c, com.ss.android.appcenter.engine.vlayout.a.h, com.ss.android.appcenter.engine.vlayout.e):void");
    }

    /* renamed from: a */
    private void m103634a(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, boolean z, AbstractC28282e eVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (z) {
            i3 = i;
            i4 = 0;
            i5 = 1;
        } else {
            i4 = i - 1;
            i3 = -1;
            i5 = -1;
        }
        if (eVar.getOrientation() != 1 || !eVar.mo100694e()) {
            i6 = 1;
        } else {
            i7 = i2 - 1;
            i6 = -1;
        }
        while (i4 != i3) {
            int b = m103635b(recycler, state, eVar.getPosition(this.f70987A[i4]));
            if (i6 != -1 || b <= 1) {
                this.f70988B[i4] = i7;
            } else {
                this.f70988B[i4] = i7 - (b - 1);
            }
            i7 += b * i6;
            i4 += i5;
        }
    }
}
