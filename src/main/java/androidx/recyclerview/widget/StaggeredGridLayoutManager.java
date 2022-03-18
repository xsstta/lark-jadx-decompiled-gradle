package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.p029a.C0864d;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.AbstractC1331b {

    /* renamed from: a */
    C1347b[] f4714a;

    /* renamed from: b */
    AbstractC1401r f4715b;

    /* renamed from: c */
    AbstractC1401r f4716c;

    /* renamed from: d */
    boolean f4717d;

    /* renamed from: e */
    boolean f4718e;

    /* renamed from: f */
    int f4719f = -1;

    /* renamed from: g */
    int f4720g = Integer.MIN_VALUE;

    /* renamed from: h */
    LazySpanLookup f4721h = new LazySpanLookup();

    /* renamed from: i */
    private int f4722i = -1;

    /* renamed from: j */
    private int f4723j;

    /* renamed from: k */
    private int f4724k;

    /* renamed from: l */
    private final C1394m f4725l;

    /* renamed from: m */
    private BitSet f4726m;

    /* renamed from: n */
    private int f4727n = 2;

    /* renamed from: o */
    private boolean f4728o;

    /* renamed from: p */
    private boolean f4729p;

    /* renamed from: q */
    private SavedState f4730q;

    /* renamed from: r */
    private int f4731r;

    /* renamed from: s */
    private final Rect f4732s = new Rect();

    /* renamed from: t */
    private final C1346a f4733t = new C1346a();

    /* renamed from: u */
    private boolean f4734u = false;

    /* renamed from: v */
    private boolean f4735v = true;

    /* renamed from: w */
    private int[] f4736w;

    /* renamed from: x */
    private final Runnable f4737x = new Runnable() {
        /* class androidx.recyclerview.widget.StaggeredGridLayoutManager.RunnableC13431 */

        public void run() {
            StaggeredGridLayoutManager.this.mo7252a();
        }
    };

    /* access modifiers changed from: package-private */
    public static class LazySpanLookup {

        /* renamed from: a */
        int[] f4741a;

        /* renamed from: b */
        List<FullSpanItem> f4742b;

        /* access modifiers changed from: package-private */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new Parcelable.Creator<FullSpanItem>() {
                /* class androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.C13441 */

                /* renamed from: a */
                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }

                /* renamed from: a */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }
            };

            /* renamed from: a */
            int f4743a;

            /* renamed from: b */
            int f4744b;

            /* renamed from: c */
            int[] f4745c;

            /* renamed from: d */
            boolean f4746d;

            public int describeContents() {
                return 0;
            }

            FullSpanItem() {
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f4743a + ", mGapDir=" + this.f4744b + ", mHasUnwantedGapAfter=" + this.f4746d + ", mGapPerSpan=" + Arrays.toString(this.f4745c) + '}';
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public int mo7289a(int i) {
                int[] iArr = this.f4745c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            FullSpanItem(Parcel parcel) {
                this.f4743a = parcel.readInt();
                this.f4744b = parcel.readInt();
                this.f4746d = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f4745c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f4743a);
                parcel.writeInt(this.f4744b);
                parcel.writeInt(this.f4746d ? 1 : 0);
                int[] iArr = this.f4745c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f4745c);
            }
        }

        LazySpanLookup() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7279a() {
            int[] iArr = this.f4741a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4742b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo7285c(int i) {
            int[] iArr = this.f4741a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo7286d(int i) {
            int length = this.f4741a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* renamed from: f */
        public FullSpanItem mo7288f(int i) {
            List<FullSpanItem> list = this.f4742b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f4742b.get(size);
                if (fullSpanItem.f4743a == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: g */
        private int m6173g(int i) {
            if (this.f4742b == null) {
                return -1;
            }
            FullSpanItem f = mo7288f(i);
            if (f != null) {
                this.f4742b.remove(f);
            }
            int size = this.f4742b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f4742b.get(i2).f4743a >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f4742b.remove(i2);
            return this.f4742b.get(i2).f4743a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo7277a(int i) {
            List<FullSpanItem> list = this.f4742b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f4742b.get(size).f4743a >= i) {
                        this.f4742b.remove(size);
                    }
                }
            }
            return mo7283b(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo7283b(int i) {
            int[] iArr = this.f4741a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int g = m6173g(i);
            if (g == -1) {
                int[] iArr2 = this.f4741a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f4741a.length;
            }
            int i2 = g + 1;
            Arrays.fill(this.f4741a, i, i2, -1);
            return i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo7287e(int i) {
            int[] iArr = this.f4741a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f4741a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[mo7286d(i)];
                this.f4741a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f4741a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: a */
        public void mo7282a(FullSpanItem fullSpanItem) {
            if (this.f4742b == null) {
                this.f4742b = new ArrayList();
            }
            int size = this.f4742b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.f4742b.get(i);
                if (fullSpanItem2.f4743a == fullSpanItem.f4743a) {
                    this.f4742b.remove(i);
                }
                if (fullSpanItem2.f4743a >= fullSpanItem.f4743a) {
                    this.f4742b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f4742b.add(fullSpanItem);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7281a(int i, C1347b bVar) {
            mo7287e(i);
            this.f4741a[i] = bVar.f4768e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo7284b(int i, int i2) {
            int[] iArr = this.f4741a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo7287e(i3);
                int[] iArr2 = this.f4741a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f4741a, i, i3, -1);
                m6172d(i, i2);
            }
        }

        /* renamed from: c */
        private void m6171c(int i, int i2) {
            List<FullSpanItem> list = this.f4742b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f4742b.get(size);
                    if (fullSpanItem.f4743a >= i) {
                        if (fullSpanItem.f4743a < i3) {
                            this.f4742b.remove(size);
                        } else {
                            fullSpanItem.f4743a -= i2;
                        }
                    }
                }
            }
        }

        /* renamed from: d */
        private void m6172d(int i, int i2) {
            List<FullSpanItem> list = this.f4742b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f4742b.get(size);
                    if (fullSpanItem.f4743a >= i) {
                        fullSpanItem.f4743a += i2;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7280a(int i, int i2) {
            int[] iArr = this.f4741a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo7287e(i3);
                int[] iArr2 = this.f4741a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f4741a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m6171c(i, i2);
            }
        }

        /* renamed from: a */
        public FullSpanItem mo7278a(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.f4742b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.f4742b.get(i4);
                if (fullSpanItem.f4743a >= i2) {
                    return null;
                }
                if (fullSpanItem.f4743a >= i && (i3 == 0 || fullSpanItem.f4744b == i3 || (z && fullSpanItem.f4746d))) {
                    return fullSpanItem;
                }
            }
            return null;
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState.C13451 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        int f4747a;

        /* renamed from: b */
        int f4748b;

        /* renamed from: c */
        int f4749c;

        /* renamed from: d */
        int[] f4750d;

        /* renamed from: e */
        int f4751e;

        /* renamed from: f */
        int[] f4752f;

        /* renamed from: g */
        List<LazySpanLookup.FullSpanItem> f4753g;

        /* renamed from: h */
        boolean f4754h;

        /* renamed from: i */
        boolean f4755i;

        /* renamed from: j */
        boolean f4756j;

        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7297a() {
            this.f4750d = null;
            this.f4749c = 0;
            this.f4751e = 0;
            this.f4752f = null;
            this.f4753g = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo7298b() {
            this.f4750d = null;
            this.f4749c = 0;
            this.f4747a = -1;
            this.f4748b = -1;
        }

        public SavedState(SavedState savedState) {
            this.f4749c = savedState.f4749c;
            this.f4747a = savedState.f4747a;
            this.f4748b = savedState.f4748b;
            this.f4750d = savedState.f4750d;
            this.f4751e = savedState.f4751e;
            this.f4752f = savedState.f4752f;
            this.f4754h = savedState.f4754h;
            this.f4755i = savedState.f4755i;
            this.f4756j = savedState.f4756j;
            this.f4753g = savedState.f4753g;
        }

        SavedState(Parcel parcel) {
            boolean z;
            boolean z2;
            this.f4747a = parcel.readInt();
            this.f4748b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f4749c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f4750d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f4751e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f4752f = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z3 = false;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f4754h = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f4755i = z2;
            this.f4756j = parcel.readInt() == 1 ? true : z3;
            this.f4753g = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4747a);
            parcel.writeInt(this.f4748b);
            parcel.writeInt(this.f4749c);
            if (this.f4749c > 0) {
                parcel.writeIntArray(this.f4750d);
            }
            parcel.writeInt(this.f4751e);
            if (this.f4751e > 0) {
                parcel.writeIntArray(this.f4752f);
            }
            parcel.writeInt(this.f4754h ? 1 : 0);
            parcel.writeInt(this.f4755i ? 1 : 0);
            parcel.writeInt(this.f4756j ? 1 : 0);
            parcel.writeList(this.f4753g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C1347b {

        /* renamed from: a */
        ArrayList<View> f4764a = new ArrayList<>();

        /* renamed from: b */
        int f4765b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f4766c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f4767d = 0;

        /* renamed from: e */
        final int f4768e;

        /* renamed from: i */
        public int mo7329i() {
            return this.f4767d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo7326f() {
            this.f4765b = Integer.MIN_VALUE;
            this.f4766c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo7316b() {
            int i = this.f4765b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo7313a();
            return this.f4765b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo7323d() {
            int i = this.f4766c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo7321c();
            return this.f4766c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo7325e() {
            this.f4764a.clear();
            mo7326f();
            this.f4767d = 0;
        }

        /* renamed from: j */
        public int mo7330j() {
            if (StaggeredGridLayoutManager.this.f4717d) {
                return mo7310a(this.f4764a.size() - 1, -1, false);
            }
            return mo7310a(0, this.f4764a.size(), false);
        }

        /* renamed from: k */
        public int mo7331k() {
            if (StaggeredGridLayoutManager.this.f4717d) {
                return mo7318b(this.f4764a.size() - 1, -1, true);
            }
            return mo7318b(0, this.f4764a.size(), true);
        }

        /* renamed from: l */
        public int mo7332l() {
            if (StaggeredGridLayoutManager.this.f4717d) {
                return mo7310a(this.f4764a.size() - 1, -1, true);
            }
            return mo7310a(0, this.f4764a.size(), true);
        }

        /* renamed from: m */
        public int mo7333m() {
            if (StaggeredGridLayoutManager.this.f4717d) {
                return mo7310a(0, this.f4764a.size(), false);
            }
            return mo7310a(this.f4764a.size() - 1, -1, false);
        }

        /* renamed from: n */
        public int mo7334n() {
            if (StaggeredGridLayoutManager.this.f4717d) {
                return mo7318b(0, this.f4764a.size(), true);
            }
            return mo7318b(this.f4764a.size() - 1, -1, true);
        }

        /* renamed from: o */
        public int mo7335o() {
            if (StaggeredGridLayoutManager.this.f4717d) {
                return mo7310a(0, this.f4764a.size(), true);
            }
            return mo7310a(this.f4764a.size() - 1, -1, true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7313a() {
            LazySpanLookup.FullSpanItem f;
            View view = this.f4764a.get(0);
            LayoutParams c = mo7320c(view);
            this.f4765b = StaggeredGridLayoutManager.this.f4715b.mo7461a(view);
            if (c.f4740b && (f = StaggeredGridLayoutManager.this.f4721h.mo7288f(c.getViewLayoutPosition())) != null && f.f4744b == -1) {
                this.f4765b -= f.mo7289a(this.f4768e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo7321c() {
            LazySpanLookup.FullSpanItem f;
            ArrayList<View> arrayList = this.f4764a;
            View view = arrayList.get(arrayList.size() - 1);
            LayoutParams c = mo7320c(view);
            this.f4766c = StaggeredGridLayoutManager.this.f4715b.mo7465b(view);
            if (c.f4740b && (f = StaggeredGridLayoutManager.this.f4721h.mo7288f(c.getViewLayoutPosition())) != null && f.f4744b == 1) {
                this.f4766c += f.mo7289a(this.f4768e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo7327g() {
            int size = this.f4764a.size();
            View remove = this.f4764a.remove(size - 1);
            LayoutParams c = mo7320c(remove);
            c.f4739a = null;
            if (c.isItemRemoved() || c.isItemChanged()) {
                this.f4767d -= StaggeredGridLayoutManager.this.f4715b.mo7471e(remove);
            }
            if (size == 1) {
                this.f4765b = Integer.MIN_VALUE;
            }
            this.f4766c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo7328h() {
            View remove = this.f4764a.remove(0);
            LayoutParams c = mo7320c(remove);
            c.f4739a = null;
            if (this.f4764a.size() == 0) {
                this.f4766c = Integer.MIN_VALUE;
            }
            if (c.isItemRemoved() || c.isItemChanged()) {
                this.f4767d -= StaggeredGridLayoutManager.this.f4715b.mo7471e(remove);
            }
            this.f4765b = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public LayoutParams mo7320c(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo7322c(int i) {
            this.f4765b = i;
            this.f4766c = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo7309a(int i) {
            int i2 = this.f4765b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f4764a.size() == 0) {
                return i;
            }
            mo7313a();
            return this.f4765b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo7317b(int i) {
            int i2 = this.f4766c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f4764a.size() == 0) {
                return i;
            }
            mo7321c();
            return this.f4766c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo7324d(int i) {
            int i2 = this.f4765b;
            if (i2 != Integer.MIN_VALUE) {
                this.f4765b = i2 + i;
            }
            int i3 = this.f4766c;
            if (i3 != Integer.MIN_VALUE) {
                this.f4766c = i3 + i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo7319b(View view) {
            LayoutParams c = mo7320c(view);
            c.f4739a = this;
            this.f4764a.add(view);
            this.f4766c = Integer.MIN_VALUE;
            if (this.f4764a.size() == 1) {
                this.f4765b = Integer.MIN_VALUE;
            }
            if (c.isItemRemoved() || c.isItemChanged()) {
                this.f4767d += StaggeredGridLayoutManager.this.f4715b.mo7471e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7314a(View view) {
            LayoutParams c = mo7320c(view);
            c.f4739a = this;
            this.f4764a.add(0, view);
            this.f4765b = Integer.MIN_VALUE;
            if (this.f4764a.size() == 1) {
                this.f4766c = Integer.MIN_VALUE;
            }
            if (c.isItemRemoved() || c.isItemChanged()) {
                this.f4767d += StaggeredGridLayoutManager.this.f4715b.mo7471e(view);
            }
        }

        C1347b(int i) {
            this.f4768e = i;
        }

        /* renamed from: a */
        public View mo7312a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f4764a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f4764a.get(size);
                    if ((StaggeredGridLayoutManager.this.f4717d && StaggeredGridLayoutManager.this.getPosition(view2) >= i) || ((!StaggeredGridLayoutManager.this.f4717d && StaggeredGridLayoutManager.this.getPosition(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f4764a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f4764a.get(i3);
                    if ((StaggeredGridLayoutManager.this.f4717d && StaggeredGridLayoutManager.this.getPosition(view3) <= i) || ((!StaggeredGridLayoutManager.this.f4717d && StaggeredGridLayoutManager.this.getPosition(view3) >= i) || !view3.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7315a(boolean z, int i) {
            int i2;
            if (z) {
                i2 = mo7317b(Integer.MIN_VALUE);
            } else {
                i2 = mo7309a(Integer.MIN_VALUE);
            }
            mo7325e();
            if (i2 != Integer.MIN_VALUE) {
                if (z && i2 < StaggeredGridLayoutManager.this.f4715b.mo7468d()) {
                    return;
                }
                if (z || i2 <= StaggeredGridLayoutManager.this.f4715b.mo7466c()) {
                    if (i != Integer.MIN_VALUE) {
                        i2 += i;
                    }
                    this.f4766c = i2;
                    this.f4765b = i2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo7310a(int i, int i2, boolean z) {
            return mo7311a(i, i2, z, true, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo7318b(int i, int i2, boolean z) {
            return mo7311a(i, i2, false, false, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo7311a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int i3;
            boolean z4;
            int c = StaggeredGridLayoutManager.this.f4715b.mo7466c();
            int d = StaggeredGridLayoutManager.this.f4715b.mo7468d();
            if (i2 > i) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            while (i != i2) {
                View view = this.f4764a.get(i);
                int a = StaggeredGridLayoutManager.this.f4715b.mo7461a(view);
                int b = StaggeredGridLayoutManager.this.f4715b.mo7465b(view);
                boolean z5 = false;
                if (!z3 ? a >= d : a > d) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (!z3 ? b > c : b >= c) {
                    z5 = true;
                }
                if (z4 && z5) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (a < c || b > d) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else if (a >= c && b <= d) {
                        return StaggeredGridLayoutManager.this.getPosition(view);
                    }
                }
                i += i3;
            }
            return -1;
        }
    }

    /* renamed from: c */
    public int mo7259c() {
        return this.f4722i;
    }

    /* renamed from: k */
    public int mo7272k() {
        return this.f4723j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo7252a() {
        int i;
        int i2;
        if (getChildCount() == 0 || this.f4727n == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f4718e) {
            i2 = mo7270i();
            i = mo7271j();
        } else {
            i2 = mo7271j();
            i = mo7270i();
        }
        if (i2 == 0 && mo7254b() != null) {
            this.f4721h.mo7279a();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        } else if (!this.f4734u) {
            return false;
        } else {
            int i3 = this.f4718e ? -1 : 1;
            int i4 = i + 1;
            LazySpanLookup.FullSpanItem a = this.f4721h.mo7278a(i2, i4, i3, true);
            if (a == null) {
                this.f4734u = false;
                this.f4721h.mo7277a(i4);
                return false;
            }
            LazySpanLookup.FullSpanItem a2 = this.f4721h.mo7278a(i2, a.f4743a, i3 * -1, true);
            if (a2 == null) {
                this.f4721h.mo7277a(a.f4743a);
            } else {
                this.f4721h.mo7277a(a2.f4743a + 1);
            }
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo7254b() {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo7254b():android.view.View");
    }

    /* renamed from: a */
    private boolean m6115a(C1347b bVar) {
        if (this.f4718e) {
            if (bVar.mo7323d() < this.f4715b.mo7468d()) {
                return !bVar.mo7320c(bVar.f4764a.get(bVar.f4764a.size() - 1)).f4740b;
            }
        } else if (bVar.mo7316b() > this.f4715b.mo7466c()) {
            return !bVar.mo7320c(bVar.f4764a.get(0)).f4740b;
        }
        return false;
    }

    /* renamed from: a */
    public void mo7247a(int i) {
        assertNotInLayoutOrScroll(null);
        if (i != this.f4722i) {
            mo7263d();
            this.f4722i = i;
            this.f4726m = new BitSet(this.f4722i);
            this.f4714a = new C1347b[this.f4722i];
            for (int i2 = 0; i2 < this.f4722i; i2++) {
                this.f4714a[i2] = new C1347b(i2);
            }
            requestLayout();
        }
    }

    /* renamed from: b */
    public void mo7256b(int i) {
        if (i == 0 || i == 1) {
            assertNotInLayoutOrScroll(null);
            if (i != this.f4723j) {
                this.f4723j = i;
                AbstractC1401r rVar = this.f4715b;
                this.f4715b = this.f4716c;
                this.f4716c = rVar;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: a */
    public void mo7251a(boolean z) {
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.f4730q;
        if (!(savedState == null || savedState.f4754h == z)) {
            this.f4730q.f4754h = z;
        }
        this.f4717d = z;
        requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0161, code lost:
        if (mo7252a() != false) goto L_0x0165;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6111a(androidx.recyclerview.widget.RecyclerView.Recycler r9, androidx.recyclerview.widget.RecyclerView.State r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 389
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m6111a(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, boolean):void");
    }

    /* renamed from: a */
    private void m6113a(C1346a aVar) {
        int i;
        if (this.f4730q.f4749c > 0) {
            if (this.f4730q.f4749c == this.f4722i) {
                for (int i2 = 0; i2 < this.f4722i; i2++) {
                    this.f4714a[i2].mo7325e();
                    int i3 = this.f4730q.f4750d[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        if (this.f4730q.f4755i) {
                            i = this.f4715b.mo7468d();
                        } else {
                            i = this.f4715b.mo7466c();
                        }
                        i3 += i;
                    }
                    this.f4714a[i2].mo7322c(i3);
                }
            } else {
                this.f4730q.mo7297a();
                SavedState savedState = this.f4730q;
                savedState.f4747a = savedState.f4748b;
            }
        }
        this.f4729p = this.f4730q.f4756j;
        mo7251a(this.f4730q.f4754h);
        m6136m();
        if (this.f4730q.f4747a != -1) {
            this.f4719f = this.f4730q.f4747a;
            aVar.f4759c = this.f4730q.f4755i;
        } else {
            aVar.f4759c = this.f4718e;
        }
        if (this.f4730q.f4751e > 1) {
            this.f4721h.f4741a = this.f4730q.f4752f;
            this.f4721h.f4742b = this.f4730q.f4753g;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7250a(RecyclerView.State state, C1346a aVar) {
        if (!mo7257b(state, aVar) && !m6125c(state, aVar)) {
            aVar.mo7308b();
            aVar.f4757a = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo7257b(RecyclerView.State state, C1346a aVar) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (!state.isPreLayout() && (i = this.f4719f) != -1) {
            if (i < 0 || i >= state.getItemCount()) {
                this.f4719f = -1;
                this.f4720g = Integer.MIN_VALUE;
            } else {
                SavedState savedState = this.f4730q;
                if (savedState == null || savedState.f4747a == -1 || this.f4730q.f4749c < 1) {
                    View findViewByPosition = findViewByPosition(this.f4719f);
                    if (findViewByPosition != null) {
                        if (this.f4718e) {
                            i2 = mo7270i();
                        } else {
                            i2 = mo7271j();
                        }
                        aVar.f4757a = i2;
                        if (this.f4720g != Integer.MIN_VALUE) {
                            if (aVar.f4759c) {
                                aVar.f4758b = (this.f4715b.mo7468d() - this.f4720g) - this.f4715b.mo7465b(findViewByPosition);
                            } else {
                                aVar.f4758b = (this.f4715b.mo7466c() + this.f4720g) - this.f4715b.mo7461a(findViewByPosition);
                            }
                            return true;
                        } else if (this.f4715b.mo7471e(findViewByPosition) > this.f4715b.mo7472f()) {
                            if (aVar.f4759c) {
                                i3 = this.f4715b.mo7468d();
                            } else {
                                i3 = this.f4715b.mo7466c();
                            }
                            aVar.f4758b = i3;
                            return true;
                        } else {
                            int a = this.f4715b.mo7461a(findViewByPosition) - this.f4715b.mo7466c();
                            if (a < 0) {
                                aVar.f4758b = -a;
                                return true;
                            }
                            int d = this.f4715b.mo7468d() - this.f4715b.mo7465b(findViewByPosition);
                            if (d < 0) {
                                aVar.f4758b = d;
                                return true;
                            }
                            aVar.f4758b = Integer.MIN_VALUE;
                        }
                    } else {
                        aVar.f4757a = this.f4719f;
                        int i4 = this.f4720g;
                        if (i4 == Integer.MIN_VALUE) {
                            if (m6135m(aVar.f4757a) == 1) {
                                z = true;
                            }
                            aVar.f4759c = z;
                            aVar.mo7308b();
                        } else {
                            aVar.mo7306a(i4);
                        }
                        aVar.f4760d = true;
                    }
                } else {
                    aVar.f4758b = Integer.MIN_VALUE;
                    aVar.f4757a = this.f4719f;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public int[] mo7253a(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f4722i];
        } else if (iArr.length < this.f4722i) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f4722i + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f4722i; i++) {
            iArr[i] = this.f4714a[i].mo7330j();
        }
        return iArr;
    }

    /* renamed from: b */
    public int[] mo7258b(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f4722i];
        } else if (iArr.length < this.f4722i) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f4722i + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f4722i; i++) {
            iArr[i] = this.f4714a[i].mo7332l();
        }
        return iArr;
    }

    /* renamed from: a */
    private void m6109a(View view, LayoutParams layoutParams, boolean z) {
        if (layoutParams.f4740b) {
            if (this.f4723j == 1) {
                m6107a(view, this.f4731r, getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), layoutParams.height, true), z);
            } else {
                m6107a(view, getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), layoutParams.width, true), this.f4731r, z);
            }
        } else if (this.f4723j == 1) {
            m6107a(view, getChildMeasureSpec(this.f4724k, getWidthMode(), 0, layoutParams.width, false), getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), layoutParams.height, true), z);
        } else {
            m6107a(view, getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), layoutParams.width, true), getChildMeasureSpec(this.f4724k, getHeightMode(), 0, layoutParams.height, false), z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo7255b(boolean z) {
        int c = this.f4715b.mo7466c();
        int d = this.f4715b.mo7468d();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int a = this.f4715b.mo7461a(childAt);
            if (this.f4715b.mo7465b(childAt) > c && a < d) {
                if (a >= c || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    private void m6112a(RecyclerView.Recycler recycler, C1394m mVar) {
        int i;
        int i2;
        if (mVar.f4935a && !mVar.f4943i) {
            if (mVar.f4936b == 0) {
                if (mVar.f4939e == -1) {
                    m6121b(recycler, mVar.f4941g);
                } else {
                    m6110a(recycler, mVar.f4940f);
                }
            } else if (mVar.f4939e == -1) {
                int h = mVar.f4940f - m6129h(mVar.f4940f);
                if (h < 0) {
                    i2 = mVar.f4941g;
                } else {
                    i2 = mVar.f4941g - Math.min(h, mVar.f4936b);
                }
                m6121b(recycler, i2);
            } else {
                int k = m6132k(mVar.f4941g) - mVar.f4941g;
                if (k < 0) {
                    i = mVar.f4940f;
                } else {
                    i = Math.min(k, mVar.f4936b) + mVar.f4940f;
                }
                m6110a(recycler, i);
            }
        }
    }

    /* renamed from: a */
    private void m6114a(C1347b bVar, int i, int i2) {
        int i3 = bVar.mo7329i();
        if (i == -1) {
            if (bVar.mo7316b() + i3 <= i2) {
                this.f4726m.set(bVar.f4768e, false);
            }
        } else if (bVar.mo7323d() - i3 >= i2) {
            this.f4726m.set(bVar.f4768e, false);
        }
    }

    /* renamed from: a */
    private void m6110a(RecyclerView.Recycler recycler, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f4715b.mo7465b(childAt) <= i && this.f4715b.mo7467c(childAt) <= i) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f4740b) {
                    for (int i2 = 0; i2 < this.f4722i; i2++) {
                        if (this.f4714a[i2].f4764a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f4722i; i3++) {
                        this.f4714a[i3].mo7328h();
                    }
                } else if (layoutParams.f4739a.f4764a.size() != 1) {
                    layoutParams.f4739a.mo7328h();
                } else {
                    return;
                }
                removeAndRecycleView(childAt, recycler);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7249a(int i, RecyclerView.State state) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo7270i();
            i2 = 1;
        } else {
            i3 = mo7271j();
            i2 = -1;
        }
        this.f4725l.f4935a = true;
        m6119b(i3, state);
        m6126e(i2);
        C1394m mVar = this.f4725l;
        mVar.f4937c = i3 + mVar.f4938d;
        this.f4725l.f4936b = Math.abs(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo7246a(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        mo7249a(i, state);
        int a = m6103a(recycler, this.f4725l, state);
        if (this.f4725l.f4936b >= a) {
            i = i < 0 ? -a : a;
        }
        this.f4715b.mo7463a(-i);
        this.f4728o = this.f4718e;
        this.f4725l.f4936b = 0;
        m6112a(recycler, this.f4725l);
        return i;
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: a */
        C1347b f4739a;

        /* renamed from: b */
        boolean f4740b;

        /* renamed from: a */
        public boolean mo7275a() {
            return this.f4740b;
        }

        /* renamed from: b */
        public final int mo7276b() {
            C1347b bVar = this.f4739a;
            if (bVar == null) {
                return -1;
            }
            return bVar.f4768e;
        }

        /* renamed from: a */
        public void mo7274a(boolean z) {
            this.f4740b = z;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        if (this.f4723j == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        if (this.f4723j == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        if (this.f4727n != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        if (this.f4730q == null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo7263d() {
        this.f4721h.mo7279a();
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo7266e() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class C1346a {

        /* renamed from: a */
        int f4757a;

        /* renamed from: b */
        int f4758b;

        /* renamed from: c */
        boolean f4759c;

        /* renamed from: d */
        boolean f4760d;

        /* renamed from: e */
        boolean f4761e;

        /* renamed from: f */
        int[] f4762f;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7305a() {
            this.f4757a = -1;
            this.f4758b = Integer.MIN_VALUE;
            this.f4759c = false;
            this.f4760d = false;
            this.f4761e = false;
            int[] iArr = this.f4762f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo7308b() {
            int i;
            if (this.f4759c) {
                i = StaggeredGridLayoutManager.this.f4715b.mo7468d();
            } else {
                i = StaggeredGridLayoutManager.this.f4715b.mo7466c();
            }
            this.f4758b = i;
        }

        C1346a() {
            mo7305a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7306a(int i) {
            if (this.f4759c) {
                this.f4758b = StaggeredGridLayoutManager.this.f4715b.mo7468d() - i;
            } else {
                this.f4758b = StaggeredGridLayoutManager.this.f4715b.mo7466c() + i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7307a(C1347b[] bVarArr) {
            int length = bVarArr.length;
            int[] iArr = this.f4762f;
            if (iArr == null || iArr.length < length) {
                this.f4762f = new int[StaggeredGridLayoutManager.this.f4714a.length];
            }
            for (int i = 0; i < length; i++) {
                this.f4762f[i] = bVarArr[i].mo7309a(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: l */
    private void m6133l() {
        this.f4715b = AbstractC1401r.m6391a(this, this.f4723j);
        this.f4716c = AbstractC1401r.m6391a(this, 1 - this.f4723j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo7267f() {
        View view;
        if (this.f4718e) {
            view = mo7260c(true);
        } else {
            view = mo7255b(true);
        }
        if (view == null) {
            return -1;
        }
        return getPosition(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo7268g() {
        int b = this.f4714a[0].mo7317b(Integer.MIN_VALUE);
        for (int i = 1; i < this.f4722i; i++) {
            if (this.f4714a[i].mo7317b(Integer.MIN_VALUE) != b) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        if (this.f4723j == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    /* renamed from: m */
    private void m6136m() {
        if (this.f4723j == 1 || !mo7266e()) {
            this.f4718e = this.f4717d;
        } else {
            this.f4718e = !this.f4717d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo7269h() {
        int a = this.f4714a[0].mo7309a(Integer.MIN_VALUE);
        for (int i = 1; i < this.f4722i; i++) {
            if (this.f4714a[i].mo7309a(Integer.MIN_VALUE) != a) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo7270i() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo7271j() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    /* renamed from: n */
    private void m6138n() {
        if (this.f4716c.mo7475h() != 1073741824) {
            float f = BitmapDescriptorFactory.HUE_RED;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                float e = (float) this.f4716c.mo7471e(childAt);
                if (e >= f) {
                    if (((LayoutParams) childAt.getLayoutParams()).mo7275a()) {
                        e = (e * 1.0f) / ((float) this.f4722i);
                    }
                    f = Math.max(f, e);
                }
            }
            int i2 = this.f4724k;
            int round = Math.round(f * ((float) this.f4722i));
            if (this.f4716c.mo7475h() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f4716c.mo7472f());
            }
            mo7264d(round);
            if (this.f4724k != i2) {
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt2 = getChildAt(i3);
                    LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
                    if (!layoutParams.f4740b) {
                        if (!mo7266e() || this.f4723j != 1) {
                            int i4 = layoutParams.f4739a.f4768e * this.f4724k;
                            int i5 = layoutParams.f4739a.f4768e * i2;
                            if (this.f4723j == 1) {
                                childAt2.offsetLeftAndRight(i4 - i5);
                            } else {
                                childAt2.offsetTopAndBottom(i4 - i5);
                            }
                        } else {
                            childAt2.offsetLeftAndRight(((-((this.f4722i - 1) - layoutParams.f4739a.f4768e)) * this.f4724k) - ((-((this.f4722i - 1) - layoutParams.f4739a.f4768e)) * i2));
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        int i;
        int i2;
        int i3;
        SavedState savedState = this.f4730q;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.f4754h = this.f4717d;
        savedState2.f4755i = this.f4728o;
        savedState2.f4756j = this.f4729p;
        LazySpanLookup lazySpanLookup = this.f4721h;
        if (lazySpanLookup == null || lazySpanLookup.f4741a == null) {
            savedState2.f4751e = 0;
        } else {
            savedState2.f4752f = this.f4721h.f4741a;
            savedState2.f4751e = savedState2.f4752f.length;
            savedState2.f4753g = this.f4721h.f4742b;
        }
        if (getChildCount() > 0) {
            if (this.f4728o) {
                i = mo7270i();
            } else {
                i = mo7271j();
            }
            savedState2.f4747a = i;
            savedState2.f4748b = mo7267f();
            savedState2.f4749c = this.f4722i;
            savedState2.f4750d = new int[this.f4722i];
            for (int i4 = 0; i4 < this.f4722i; i4++) {
                if (this.f4728o) {
                    i2 = this.f4714a[i4].mo7317b(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f4715b.mo7468d();
                    } else {
                        savedState2.f4750d[i4] = i2;
                    }
                } else {
                    i2 = this.f4714a[i4].mo7309a(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f4715b.mo7466c();
                    } else {
                        savedState2.f4750d[i4] = i2;
                    }
                }
                i2 -= i3;
                savedState2.f4750d[i4] = i2;
            }
        } else {
            savedState2.f4747a = -1;
            savedState2.f4748b = -1;
            savedState2.f4749c = 0;
        }
        return savedState2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f4730q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return m6116b(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return m6104a(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return m6123c(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return m6116b(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return m6104a(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return m6123c(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i) {
        if (i == 0) {
            mo7252a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f4721h.mo7279a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f4730q = (SavedState) parcelable;
            requestLayout();
        }
    }

    /* renamed from: a */
    private void m6106a(View view) {
        for (int i = this.f4722i - 1; i >= 0; i--) {
            this.f4714a[i].mo7319b(view);
        }
    }

    /* renamed from: e */
    private void m6126e(int i) {
        boolean z;
        this.f4725l.f4939e = i;
        C1394m mVar = this.f4725l;
        boolean z2 = this.f4718e;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        mVar.f4938d = i2;
    }

    /* renamed from: h */
    private int m6129h(int i) {
        int a = this.f4714a[0].mo7309a(i);
        for (int i2 = 1; i2 < this.f4722i; i2++) {
            int a2 = this.f4714a[i2].mo7309a(i);
            if (a2 > a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: i */
    private int m6130i(int i) {
        int a = this.f4714a[0].mo7309a(i);
        for (int i2 = 1; i2 < this.f4722i; i2++) {
            int a2 = this.f4714a[i2].mo7309a(i);
            if (a2 < a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: j */
    private int m6131j(int i) {
        int b = this.f4714a[0].mo7317b(i);
        for (int i2 = 1; i2 < this.f4722i; i2++) {
            int b2 = this.f4714a[i2].mo7317b(i);
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: k */
    private int m6132k(int i) {
        int b = this.f4714a[0].mo7317b(i);
        for (int i2 = 1; i2 < this.f4722i; i2++) {
            int b2 = this.f4714a[i2].mo7317b(i);
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: m */
    private int m6135m(int i) {
        boolean z;
        if (getChildCount() != 0) {
            if (i < mo7271j()) {
                z = true;
            } else {
                z = false;
            }
            if (z != this.f4718e) {
                return -1;
            }
            return 1;
        } else if (this.f4718e) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: n */
    private int m6137n(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            int position = getPosition(getChildAt(i2));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    /* renamed from: o */
    private int m6139o(int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.AbstractC1331b
    public PointF computeScrollVectorForPosition(int i) {
        int m = m6135m(i);
        PointF pointF = new PointF();
        if (m == 0) {
            return null;
        }
        if (this.f4723j == 0) {
            pointF.x = (float) m;
            pointF.y = BitmapDescriptorFactory.HUE_RED;
        } else {
            pointF.x = BitmapDescriptorFactory.HUE_RED;
            pointF.y = (float) m;
        }
        return pointF;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo7264d(int i) {
        this.f4724k = i / this.f4722i;
        this.f4731r = View.MeasureSpec.makeMeasureSpec(i, this.f4716c.mo7475h());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.f4722i; i2++) {
            this.f4714a[i2].mo7324d(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.f4722i; i2++) {
            this.f4714a[i2].mo7324d(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f4719f = -1;
        this.f4720g = Integer.MIN_VALUE;
        this.f4730q = null;
        this.f4733t.mo7305a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        SavedState savedState = this.f4730q;
        if (!(savedState == null || savedState.f4747a == i)) {
            this.f4730q.mo7298b();
        }
        this.f4719f = i;
        this.f4720g = Integer.MIN_VALUE;
        requestLayout();
    }

    /* renamed from: b */
    private int m6116b(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C1408u.m6453a(state, this.f4715b, mo7255b(!this.f4735v), mo7260c(!this.f4735v), this, this.f4735v);
    }

    /* renamed from: c */
    private int m6123c(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C1408u.m6455b(state, this.f4715b, mo7255b(!this.f4735v), mo7260c(!this.f4735v), this, this.f4735v);
    }

    /* renamed from: f */
    private LazySpanLookup.FullSpanItem m6127f(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f4745c = new int[this.f4722i];
        for (int i2 = 0; i2 < this.f4722i; i2++) {
            fullSpanItem.f4745c[i2] = i - this.f4714a[i2].mo7317b(i);
        }
        return fullSpanItem;
    }

    /* renamed from: g */
    private LazySpanLookup.FullSpanItem m6128g(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f4745c = new int[this.f4722i];
        for (int i2 = 0; i2 < this.f4722i; i2++) {
            fullSpanItem.f4745c[i2] = this.f4714a[i2].mo7309a(i) - i;
        }
        return fullSpanItem;
    }

    /* renamed from: l */
    private boolean m6134l(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f4723j == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 != this.f4718e) {
                return true;
            }
            return false;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.f4718e) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == mo7266e()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View b = mo7255b(false);
            View c = mo7260c(false);
            if (b != null && c != null) {
                int position = getPosition(b);
                int position2 = getPosition(c);
                if (position < position2) {
                    accessibilityEvent.setFromIndex(position);
                    accessibilityEvent.setToIndex(position2);
                    return;
                }
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    /* renamed from: a */
    private int m6104a(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C1408u.m6454a(state, this.f4715b, mo7255b(!this.f4735v), mo7260c(!this.f4735v), this, this.f4735v, this.f4718e);
    }

    /* renamed from: p */
    private int m6140p(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.f4723j == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f4723j == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f4723j == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f4723j == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f4723j != 1 && mo7266e()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f4723j != 1 && mo7266e()) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: d */
    public int[] mo7265d(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f4722i];
        } else if (iArr.length < this.f4722i) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f4722i + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f4722i; i++) {
            iArr[i] = this.f4714a[i].mo7335o();
        }
        return iArr;
    }

    /* renamed from: a */
    private C1347b m6105a(C1394m mVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m6134l(mVar.f4939e)) {
            i2 = this.f4722i - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f4722i;
            i = 1;
        }
        C1347b bVar = null;
        if (mVar.f4939e == 1) {
            int i4 = Integer.MAX_VALUE;
            int c = this.f4715b.mo7466c();
            while (i2 != i3) {
                C1347b bVar2 = this.f4714a[i2];
                int b = bVar2.mo7317b(c);
                if (b < i4) {
                    bVar = bVar2;
                    i4 = b;
                }
                i2 += i;
            }
            return bVar;
        }
        int i5 = Integer.MIN_VALUE;
        int d = this.f4715b.mo7468d();
        while (i2 != i3) {
            C1347b bVar3 = this.f4714a[i2];
            int a = bVar3.mo7309a(d);
            if (a > i5) {
                bVar = bVar3;
                i5 = a;
            }
            i2 += i;
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo7260c(boolean z) {
        int c = this.f4715b.mo7466c();
        int d = this.f4715b.mo7468d();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int a = this.f4715b.mo7461a(childAt);
            int b = this.f4715b.mo7465b(childAt);
            if (b > c && a < d) {
                if (b <= d || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* renamed from: b */
    private void m6120b(View view) {
        for (int i = this.f4722i - 1; i >= 0; i--) {
            this.f4714a[i].mo7314a(view);
        }
    }

    /* renamed from: c */
    public void mo7261c(int i) {
        assertNotInLayoutOrScroll(null);
        if (i != this.f4727n) {
            if (i == 0 || i == 2) {
                this.f4727n = i;
                requestLayout();
                return;
            }
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
    }

    /* renamed from: c */
    public int[] mo7262c(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f4722i];
        } else if (iArr.length < this.f4722i) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f4722i + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f4722i; i++) {
            iArr[i] = this.f4714a[i].mo7333m();
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        m6111a(recycler, state, true);
    }

    /* renamed from: a */
    public void mo7248a(int i, int i2) {
        SavedState savedState = this.f4730q;
        if (savedState != null) {
            savedState.mo7298b();
        }
        this.f4719f = i;
        this.f4720g = i2;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f4723j == 1) {
            return this.f4722i;
        }
        return super.getColumnCountForAccessibility(recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f4723j == 0) {
            return this.f4722i;
        }
        return super.getRowCountForAccessibility(recycler, state);
    }

    /* renamed from: b */
    private void m6117b(int i, int i2) {
        for (int i3 = 0; i3 < this.f4722i; i3++) {
            if (!this.f4714a[i3].f4764a.isEmpty()) {
                m6114a(this.f4714a[i3], i, i2);
            }
        }
    }

    /* renamed from: c */
    private boolean m6125c(RecyclerView.State state, C1346a aVar) {
        int i;
        if (this.f4728o) {
            i = m6139o(state.getItemCount());
        } else {
            i = m6137n(state.getItemCount());
        }
        aVar.f4757a = i;
        aVar.f4758b = Integer.MIN_VALUE;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        removeCallbacks(this.f4737x);
        for (int i = 0; i < this.f4722i; i++) {
            this.f4714a[i].mo7325e();
        }
        recyclerView.requestLayout();
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.f4723j = i2;
        mo7247a(i);
        this.f4725l = new C1394m();
        m6133l();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6119b(int r5, androidx.recyclerview.widget.RecyclerView.State r6) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m6119b(int, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    /* renamed from: b */
    private void m6121b(RecyclerView.Recycler recycler, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f4715b.mo7461a(childAt) >= i && this.f4715b.mo7469d(childAt) >= i) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f4740b) {
                    for (int i2 = 0; i2 < this.f4722i; i2++) {
                        if (this.f4714a[i2].f4764a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f4722i; i3++) {
                        this.f4714a[i3].mo7327g();
                    }
                } else if (layoutParams.f4739a.f4764a.size() != 1) {
                    layoutParams.f4739a.mo7327g();
                } else {
                    return;
                }
                removeAndRecycleView(childAt, recycler);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        m6118b(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        m6118b(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return mo7246a(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return mo7246a(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    /* renamed from: a */
    private int m6102a(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6118b(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f4718e
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo7270i()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo7271j()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f4721h
            r4.mo7283b(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f4721h
            r9.mo7280a(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f4721h
            r7.mo7284b(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f4721h
            r9.mo7280a(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f4721h
            r9.mo7284b(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f4718e
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo7271j()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo7270i()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.requestLayout()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m6118b(int, int, int):void");
    }

    /* renamed from: c */
    private void m6124c(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int c;
        int i = m6130i(Integer.MAX_VALUE);
        if (i != Integer.MAX_VALUE && (c = i - this.f4715b.mo7466c()) > 0) {
            int a = c - mo7246a(c, recycler, state);
            if (z && a > 0) {
                this.f4715b.mo7463a(-a);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f4723j == 1) {
            i4 = chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            i3 = chooseSize(i, (this.f4724k * this.f4722i) + paddingLeft, getMinimumWidth());
        } else {
            i3 = chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            i4 = chooseSize(i2, (this.f4724k * this.f4722i) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(i3, i4);
    }

    /* renamed from: a */
    private int m6103a(RecyclerView.Recycler recycler, C1394m mVar, RecyclerView.State state) {
        int i;
        int i2;
        int i3;
        boolean z;
        C1347b bVar;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        int i12;
        boolean z3 = false;
        this.f4726m.set(0, this.f4722i, true);
        if (!this.f4725l.f4943i) {
            if (mVar.f4939e == 1) {
                i12 = mVar.f4941g + mVar.f4936b;
            } else {
                i12 = mVar.f4940f - mVar.f4936b;
            }
            i = i12;
        } else if (mVar.f4939e == 1) {
            i = Integer.MAX_VALUE;
        } else {
            i = Integer.MIN_VALUE;
        }
        m6117b(mVar.f4939e, i);
        if (this.f4718e) {
            i2 = this.f4715b.mo7468d();
        } else {
            i2 = this.f4715b.mo7466c();
        }
        boolean z4 = false;
        while (mVar.mo7448a(state) && (this.f4725l.f4943i || !this.f4726m.isEmpty())) {
            View a = mVar.mo7447a(recycler);
            LayoutParams layoutParams = (LayoutParams) a.getLayoutParams();
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            int c = this.f4721h.mo7285c(viewLayoutPosition);
            if (c == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (layoutParams.f4740b) {
                    C1347b[] bVarArr = this.f4714a;
                    char c2 = z3 ? 1 : 0;
                    char c3 = z3 ? 1 : 0;
                    char c4 = z3 ? 1 : 0;
                    bVar = bVarArr[c2];
                } else {
                    bVar = m6105a(mVar);
                }
                this.f4721h.mo7281a(viewLayoutPosition, bVar);
            } else {
                bVar = this.f4714a[c];
            }
            layoutParams.f4739a = bVar;
            if (mVar.f4939e == 1) {
                addView(a);
            } else {
                int i13 = z3 ? 1 : 0;
                int i14 = z3 ? 1 : 0;
                int i15 = z3 ? 1 : 0;
                addView(a, i13);
            }
            m6109a(a, layoutParams, z3);
            if (mVar.f4939e == 1) {
                if (layoutParams.f4740b) {
                    i11 = m6131j(i2);
                } else {
                    i11 = bVar.mo7317b(i2);
                }
                int e = this.f4715b.mo7471e(a) + i11;
                if (z && layoutParams.f4740b) {
                    LazySpanLookup.FullSpanItem f = m6127f(i11);
                    f.f4744b = -1;
                    f.f4743a = viewLayoutPosition;
                    this.f4721h.mo7282a(f);
                }
                i4 = e;
                i5 = i11;
            } else {
                if (layoutParams.f4740b) {
                    i10 = m6130i(i2);
                } else {
                    i10 = bVar.mo7309a(i2);
                }
                i5 = i10 - this.f4715b.mo7471e(a);
                if (z && layoutParams.f4740b) {
                    LazySpanLookup.FullSpanItem g = m6128g(i10);
                    g.f4744b = 1;
                    g.f4743a = viewLayoutPosition;
                    this.f4721h.mo7282a(g);
                }
                i4 = i10;
            }
            if (layoutParams.f4740b && mVar.f4938d == -1) {
                if (z) {
                    this.f4734u = true;
                } else {
                    if (mVar.f4939e == 1) {
                        z2 = mo7268g();
                    } else {
                        z2 = mo7269h();
                    }
                    if (!z2) {
                        LazySpanLookup.FullSpanItem f2 = this.f4721h.mo7288f(viewLayoutPosition);
                        if (f2 != null) {
                            f2.f4746d = true;
                        }
                        this.f4734u = true;
                    }
                }
            }
            m6108a(a, layoutParams, mVar);
            if (!mo7266e() || this.f4723j != 1) {
                if (layoutParams.f4740b) {
                    i8 = this.f4716c.mo7466c();
                } else {
                    i8 = (bVar.f4768e * this.f4724k) + this.f4716c.mo7466c();
                }
                i7 = i8;
                i6 = this.f4716c.mo7471e(a) + i8;
            } else {
                if (layoutParams.f4740b) {
                    i9 = this.f4716c.mo7468d();
                } else {
                    i9 = this.f4716c.mo7468d() - (((this.f4722i - 1) - bVar.f4768e) * this.f4724k);
                }
                i6 = i9;
                i7 = i9 - this.f4716c.mo7471e(a);
            }
            if (this.f4723j == 1) {
                layoutDecoratedWithMargins(a, i7, i5, i6, i4);
            } else {
                layoutDecoratedWithMargins(a, i5, i7, i4, i6);
            }
            if (layoutParams.f4740b) {
                m6117b(this.f4725l.f4939e, i);
            } else {
                m6114a(bVar, this.f4725l.f4939e, i);
            }
            m6112a(recycler, this.f4725l);
            if (this.f4725l.f4942h && a.hasFocusable()) {
                if (layoutParams.f4740b) {
                    this.f4726m.clear();
                } else {
                    this.f4726m.set(bVar.f4768e, false);
                    z4 = true;
                    z3 = false;
                }
            }
            z4 = true;
            z3 = false;
        }
        if (!z4) {
            m6112a(recycler, this.f4725l);
        }
        if (this.f4725l.f4939e == -1) {
            i3 = this.f4715b.mo7466c() - m6130i(this.f4715b.mo7466c());
        } else {
            i3 = m6131j(this.f4715b.mo7468d()) - this.f4715b.mo7468d();
        }
        if (i3 > 0) {
            return Math.min(mVar.f4936b, i3);
        }
        return 0;
    }

    /* renamed from: a */
    private void m6108a(View view, LayoutParams layoutParams, C1394m mVar) {
        if (mVar.f4939e == 1) {
            if (layoutParams.f4740b) {
                m6106a(view);
            } else {
                layoutParams.f4739a.mo7319b(view);
            }
        } else if (layoutParams.f4740b) {
            m6120b(view);
        } else {
            layoutParams.f4739a.mo7314a(view);
        }
    }

    /* renamed from: b */
    private void m6122b(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int d;
        int j = m6131j(Integer.MIN_VALUE);
        if (j != Integer.MIN_VALUE && (d = this.f4715b.mo7468d() - j) > 0) {
            int i = d - (-mo7246a(-d, recycler, state));
            if (z && i > 0) {
                this.f4715b.mo7463a(i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        m6118b(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        m6118b(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, C0864d dVar) {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, dVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        if (this.f4723j == 0) {
            int b = layoutParams2.mo7276b();
            if (layoutParams2.f4740b) {
                i2 = this.f4722i;
            } else {
                i2 = 1;
            }
            dVar.mo4567b(C0864d.C0867c.m4258a(b, i2, -1, -1, false, false));
            return;
        }
        int b2 = layoutParams2.mo7276b();
        if (layoutParams2.f4740b) {
            i = this.f4722i;
        } else {
            i = 1;
        }
        dVar.mo4567b(C0864d.C0867c.m4258a(-1, -1, b2, i, false, false));
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.LayoutManager.C1327b properties = getProperties(context, attributeSet, i, i2);
        mo7256b(properties.f4689a);
        mo7247a(properties.f4690b);
        mo7251a(properties.f4691c);
        this.f4725l = new C1394m();
        m6133l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.State state, RecyclerView.LayoutManager.AbstractC1326a aVar) {
        int i3;
        int i4;
        if (this.f4723j != 0) {
            i = i2;
        }
        if (!(getChildCount() == 0 || i == 0)) {
            mo7249a(i, state);
            int[] iArr = this.f4736w;
            if (iArr == null || iArr.length < this.f4722i) {
                this.f4736w = new int[this.f4722i];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f4722i; i6++) {
                if (this.f4725l.f4938d == -1) {
                    i4 = this.f4725l.f4940f;
                    i3 = this.f4714a[i6].mo7309a(this.f4725l.f4940f);
                } else {
                    i4 = this.f4714a[i6].mo7317b(this.f4725l.f4941g);
                    i3 = this.f4725l.f4941g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f4736w[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f4736w, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f4725l.mo7448a(state); i8++) {
                aVar.mo7063b(this.f4725l.f4937c, this.f4736w[i8]);
                this.f4725l.f4937c += this.f4725l.f4938d;
            }
        }
    }

    /* renamed from: a */
    private void m6107a(View view, int i, int i2, boolean z) {
        boolean z2;
        calculateItemDecorationsForChild(view, this.f4732s);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int a = m6102a(i, layoutParams.leftMargin + this.f4732s.left, layoutParams.rightMargin + this.f4732s.right);
        int a2 = m6102a(i2, layoutParams.topMargin + this.f4732s.top, layoutParams.bottomMargin + this.f4732s.bottom);
        if (z) {
            z2 = shouldReMeasureChild(view, a, a2, layoutParams);
        } else {
            z2 = shouldMeasureChild(view, a, a2, layoutParams);
        }
        if (z2) {
            view.measure(a, a2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        View findContainingItemView;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        View a;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        m6136m();
        int p = m6140p(i);
        if (p == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) findContainingItemView.getLayoutParams();
        boolean z3 = layoutParams.f4740b;
        C1347b bVar = layoutParams.f4739a;
        if (p == 1) {
            i2 = mo7270i();
        } else {
            i2 = mo7271j();
        }
        m6119b(i2, state);
        m6126e(p);
        C1394m mVar = this.f4725l;
        mVar.f4937c = mVar.f4938d + i2;
        this.f4725l.f4936b = (int) (((float) this.f4715b.mo7472f()) * 0.33333334f);
        this.f4725l.f4942h = true;
        this.f4725l.f4935a = false;
        m6103a(recycler, this.f4725l, state);
        this.f4728o = this.f4718e;
        if (!(z3 || (a = bVar.mo7312a(i2, p)) == null || a == findContainingItemView)) {
            return a;
        }
        if (m6134l(p)) {
            for (int i6 = this.f4722i - 1; i6 >= 0; i6--) {
                View a2 = this.f4714a[i6].mo7312a(i2, p);
                if (!(a2 == null || a2 == findContainingItemView)) {
                    return a2;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f4722i; i7++) {
                View a3 = this.f4714a[i7].mo7312a(i2, p);
                if (!(a3 == null || a3 == findContainingItemView)) {
                    return a3;
                }
            }
        }
        boolean z4 = !this.f4717d;
        if (p == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z4 == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z3) {
            if (z2) {
                i5 = bVar.mo7331k();
            } else {
                i5 = bVar.mo7334n();
            }
            View findViewByPosition = findViewByPosition(i5);
            if (!(findViewByPosition == null || findViewByPosition == findContainingItemView)) {
                return findViewByPosition;
            }
        }
        if (m6134l(p)) {
            for (int i8 = this.f4722i - 1; i8 >= 0; i8--) {
                if (i8 != bVar.f4768e) {
                    if (z2) {
                        i4 = this.f4714a[i8].mo7331k();
                    } else {
                        i4 = this.f4714a[i8].mo7334n();
                    }
                    View findViewByPosition2 = findViewByPosition(i4);
                    if (!(findViewByPosition2 == null || findViewByPosition2 == findContainingItemView)) {
                        return findViewByPosition2;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.f4722i; i9++) {
                if (z2) {
                    i3 = this.f4714a[i9].mo7331k();
                } else {
                    i3 = this.f4714a[i9].mo7334n();
                }
                View findViewByPosition3 = findViewByPosition(i3);
                if (!(findViewByPosition3 == null || findViewByPosition3 == findContainingItemView)) {
                    return findViewByPosition3;
                }
            }
        }
        return null;
    }
}
