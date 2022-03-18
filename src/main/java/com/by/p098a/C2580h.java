package com.by.p098a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.by.inflate_lib.AbstractC2604b;
import com.github.ybq.android.spinkit.SpinKitView;
import com.larksuite.suite.R;

/* renamed from: com.by.a.h */
public class C2580h implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams a = C0178a.m579a(viewGroup, -1, -2);
        SpinKitView spinKitView = new SpinKitView(context);
        spinKitView.setId(R.id.spin_kit);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 17;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((DrawerLayout.LayoutParams) layoutParams).f3665a = 17;
        }
        C0178a.m580a(spinKitView);
        if (spinKitView.getParent() == null) {
            frameLayout.addView(spinKitView, layoutParams);
        }
        C0178a.m580a(frameLayout);
        frameLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
