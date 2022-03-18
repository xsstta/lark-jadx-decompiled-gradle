package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: androidx.viewpager2.widget.a */
final class C1612a {

    /* renamed from: a */
    private static final ViewGroup.MarginLayoutParams f5586a;

    /* renamed from: b */
    private LinearLayoutManager f5587b;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f5586a = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    /* renamed from: c */
    private boolean m7304c() {
        int childCount = this.f5587b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m7302a(this.f5587b.getChildAt(i))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo8356a() {
        if ((!m7303b() || this.f5587b.getChildCount() <= 1) && m7304c()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m7303b() {
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        int i3;
        int i4;
        int childCount = this.f5587b.getChildCount();
        if (childCount == 0) {
            return true;
        }
        if (this.f5587b.getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = childCount;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = this.f5587b.getChildAt(i5);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = f5586a;
                }
                int[] iArr3 = iArr2[i5];
                if (z) {
                    i2 = childAt.getLeft();
                    i = marginLayoutParams.leftMargin;
                } else {
                    i2 = childAt.getTop();
                    i = marginLayoutParams.topMargin;
                }
                iArr3[0] = i2 - i;
                int[] iArr4 = iArr2[i5];
                if (z) {
                    i4 = childAt.getRight();
                    i3 = marginLayoutParams.rightMargin;
                } else {
                    i4 = childAt.getBottom();
                    i3 = marginLayoutParams.bottomMargin;
                }
                iArr4[1] = i4 + i3;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr2, new Comparator<int[]>() {
            /* class androidx.viewpager2.widget.C1612a.C16131 */

            /* renamed from: a */
            public int compare(int[] iArr, int[] iArr2) {
                return iArr[0] - iArr2[0];
            }
        });
        for (int i6 = 1; i6 < childCount; i6++) {
            if (iArr2[i6 - 1][1] != iArr2[i6][0]) {
                return false;
            }
        }
        int i7 = iArr2[0][1] - iArr2[0][0];
        if (iArr2[0][0] > 0 || iArr2[childCount - 1][1] < i7) {
            return false;
        }
        return true;
    }

    C1612a(LinearLayoutManager linearLayoutManager) {
        this.f5587b = linearLayoutManager;
    }

    /* renamed from: a */
    private static boolean m7302a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m7302a(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
