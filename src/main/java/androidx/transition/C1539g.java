package androidx.transition;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: androidx.transition.g */
public class C1539g extends FrameLayout {

    /* renamed from: a */
    private ViewGroup f5400a;

    /* renamed from: b */
    private boolean f5401b = true;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8003a() {
        if (this.f5401b) {
            C1518ae.m6975a(this.f5400a).mo7958b(this);
            C1518ae.m6975a(this.f5400a).mo7957a(this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    /* renamed from: a */
    static C1539g m7081a(ViewGroup viewGroup) {
        return (C1539g) viewGroup.getTag(R.id.ghost_view_holder);
    }

    public void onViewAdded(View view) {
        if (this.f5401b) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    C1539g(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f5400a = viewGroup;
        viewGroup.setTag(R.id.ghost_view_holder, this);
        C1518ae.m6975a(this.f5400a).mo7957a(this);
    }

    /* renamed from: a */
    private int m7080a(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            m7082a(((C1541i) getChildAt(i2)).f5411c, arrayList2);
            if (m7084a(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f5400a.setTag(R.id.ghost_view_holder, null);
            C1518ae.m6975a(this.f5400a).mo7958b(this);
            this.f5401b = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8004a(C1541i iVar) {
        ArrayList<View> arrayList = new ArrayList<>();
        m7082a(iVar.f5411c, arrayList);
        int a = m7080a(arrayList);
        if (a < 0 || a >= getChildCount()) {
            addView(iVar);
        } else {
            addView(iVar, a);
        }
    }

    /* renamed from: a */
    private static void m7082a(View view, ArrayList<View> arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            m7082a((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    /* renamed from: a */
    private static boolean m7083a(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (Build.VERSION.SDK_INT < 21 || view.getZ() == view2.getZ()) {
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(C1518ae.m6974a(viewGroup, i));
                if (childAt == view) {
                    return false;
                }
                if (childAt == view2) {
                    break;
                }
            }
            return true;
        } else if (view.getZ() > view2.getZ()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m7084a(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < min; i++) {
            View view = arrayList.get(i);
            View view2 = arrayList2.get(i);
            if (view != view2) {
                return m7083a(view, view2);
            }
        }
        if (arrayList2.size() == min) {
            return true;
        }
        return false;
    }
}
