package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* renamed from: androidx.recyclerview.widget.l */
class C1393l implements AbstractC1392k {

    /* renamed from: a */
    static final AbstractC1392k f4934a = new C1393l();

    @Override // androidx.recyclerview.widget.AbstractC1392k
    /* renamed from: b */
    public void mo7445b(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
    }

    @Override // androidx.recyclerview.widget.AbstractC1392k
    /* renamed from: b */
    public void mo7446b(View view) {
    }

    C1393l() {
    }

    @Override // androidx.recyclerview.widget.AbstractC1392k
    /* renamed from: a */
    public void mo7444a(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                ViewCompat.m4092k(view, ((Float) tag).floatValue());
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
        }
        view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: a */
    private static float m6364a(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float s = ViewCompat.m4104s(childAt);
                if (s > f) {
                    f = s;
                }
            }
        }
        return f;
    }

    @Override // androidx.recyclerview.widget.AbstractC1392k
    /* renamed from: a */
    public void mo7443a(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 21 && z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            Float valueOf = Float.valueOf(ViewCompat.m4104s(view));
            ViewCompat.m4092k(view, m6364a(recyclerView, view) + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }
}
