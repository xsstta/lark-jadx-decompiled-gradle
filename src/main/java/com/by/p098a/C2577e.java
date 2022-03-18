package com.by.p098a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.by.inflate_lib.AbstractC2604b;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.suite.R;

/* renamed from: com.by.a.e */
public class C2577e implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        if (viewGroup == null || !z) {
            throw new IllegalStateException("merge tag container should not be null attach should not be false");
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.iv_icon);
        ViewGroup.MarginLayoutParams a = C0178a.m579a(viewGroup, -2, -2);
        if (ConstraintLayout.LayoutParams.class.isInstance(a)) {
            ((ConstraintLayout.LayoutParams) a).f2812d = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(a)) {
            ((ConstraintLayout.LayoutParams) a).f2815g = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(a)) {
            ((ConstraintLayout.LayoutParams) a).f2816h = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(a)) {
            ((ConstraintLayout.LayoutParams) a).f2819k = 0;
        }
        C0178a.m580a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            viewGroup.addView(appCompatImageView, a);
        }
        LKUIBadgeView lKUIBadgeView = new LKUIBadgeView(context);
        lKUIBadgeView.setId(R.id.iv_badge);
        lKUIBadgeView.setVisibility(4);
        ViewGroup.MarginLayoutParams a2 = C0178a.m579a(viewGroup, -2, -2);
        if (ConstraintLayout.LayoutParams.class.isInstance(a2)) {
            ((ConstraintLayout.LayoutParams) a2).f2821m = R.id.iv_icon;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(a2)) {
            ((ConstraintLayout.LayoutParams) a2).f2823o = 45.0f;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(a2)) {
            ((ConstraintLayout.LayoutParams) a2).f2822n = (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics());
        }
        C0178a.m580a(lKUIBadgeView);
        if (lKUIBadgeView.getParent() == null) {
            viewGroup.addView(lKUIBadgeView, a2);
        }
        return viewGroup;
    }
}
